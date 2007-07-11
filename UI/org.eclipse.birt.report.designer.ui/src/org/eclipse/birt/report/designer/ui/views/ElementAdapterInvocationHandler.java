/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.ui.views;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

public class ElementAdapterInvocationHandler implements InvocationHandler
{

	private List adapters;

	public ElementAdapterInvocationHandler( List adapters )
	{
		this.adapters = adapters;
	}

	public Object invoke( Object proxy, Method method, Object[] args )
			throws Throwable
	{
		try
		{
			if ( adapters != null && adapters.size( ) > 0 )
			{
				Class returnType = method.getReturnType( );
				if ( returnType.isArray( ) )
				{
					List allResult = new ArrayList( );
					for ( Iterator iter = adapters.iterator( ); iter.hasNext( ); )
					{
						Object result = method.invoke( iter.next( ), args );
						if ( result != null )
							allResult.addAll( Arrays.asList( (Object[]) result ) );
					}
					Object a = java.lang.reflect.Array.newInstance( returnType.getComponentType( ), allResult.size( ) );
					return allResult.toArray( (Object[])a );
				}
				else if ( returnType == Collection.class )
				{
					Collection allResult = new ArrayList( );
					for ( Iterator iter = adapters.iterator( ); iter.hasNext( ); )
					{
						Object result = method.invoke( iter.next( ), args );
						allResult.addAll( (Collection) result );
					}
					return allResult;
				}
				else if ( returnType == Boolean.class )
				{
					boolean returnValue = false;
					for ( Iterator iter = adapters.iterator( ); iter.hasNext( ); )
					{
						Boolean result = (Boolean) method.invoke( iter.next( ),
								args );
						if ( returnValue != result.booleanValue( ) )
							returnValue = returnValue ^ result.booleanValue( );
					}
					return new Boolean( returnValue );
				}
				else if ( returnType == Void.TYPE )
				{
					for ( Iterator iter = adapters.iterator( ); iter.hasNext( ); )
					{
						method.invoke( iter.next( ), args );
					}
				}
				else
				{
					for ( Iterator iter = adapters.iterator( ); iter.hasNext( ); )
					{
						return method.invoke( iter.next( ), args );
//						if ( result != null )
//							return result;
					}
				}
			}
		}
		catch ( Exception e )
		{
			//should not use ExceptionHandler to handle exception
			//because this will raise annoying dialog
//			ExceptionHandler.handle( e );
//			e.printStackTrace( );
			throw e.getCause( );
		}
		return null;
	}
}
