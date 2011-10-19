/***********************************************************************
 * Copyright (c) 2011 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.ChartWithoutAxes;
import org.eclipse.birt.chart.model.DialChart;
import org.eclipse.birt.chart.model.attribute.Angle3D;
import org.eclipse.birt.chart.model.attribute.AxisOrigin;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.Cursor;
import org.eclipse.birt.chart.model.attribute.DataPoint;
import org.eclipse.birt.chart.model.attribute.DataPointComponent;
import org.eclipse.birt.chart.model.attribute.DataPointComponentType;
import org.eclipse.birt.chart.model.attribute.EmbeddedImage;
import org.eclipse.birt.chart.model.attribute.ExtendedProperty;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.FontDefinition;
import org.eclipse.birt.chart.model.attribute.FormatSpecifier;
import org.eclipse.birt.chart.model.attribute.Gradient;
import org.eclipse.birt.chart.model.attribute.Image;
import org.eclipse.birt.chart.model.attribute.Insets;
import org.eclipse.birt.chart.model.attribute.Interactivity;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.Location;
import org.eclipse.birt.chart.model.attribute.Location3D;
import org.eclipse.birt.chart.model.attribute.Marker;
import org.eclipse.birt.chart.model.attribute.MultipleFill;
import org.eclipse.birt.chart.model.attribute.Palette;
import org.eclipse.birt.chart.model.attribute.PatternImage;
import org.eclipse.birt.chart.model.attribute.Rotation3D;
import org.eclipse.birt.chart.model.attribute.Size;
import org.eclipse.birt.chart.model.attribute.Style;
import org.eclipse.birt.chart.model.attribute.Text;
import org.eclipse.birt.chart.model.attribute.TextAlignment;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.ComponentPackage;
import org.eclipse.birt.chart.model.component.CurveFitting;
import org.eclipse.birt.chart.model.component.Dial;
import org.eclipse.birt.chart.model.component.DialRegion;
import org.eclipse.birt.chart.model.component.Grid;
import org.eclipse.birt.chart.model.component.Label;
import org.eclipse.birt.chart.model.component.MarkerLine;
import org.eclipse.birt.chart.model.component.MarkerRange;
import org.eclipse.birt.chart.model.component.Needle;
import org.eclipse.birt.chart.model.component.Scale;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.layout.Block;
import org.eclipse.birt.chart.model.layout.ClientArea;
import org.eclipse.birt.chart.model.layout.LabelBlock;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.layout.TitleBlock;
import org.eclipse.birt.chart.model.type.AreaSeries;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.BubbleSeries;
import org.eclipse.birt.chart.model.type.DialSeries;
import org.eclipse.birt.chart.model.type.DifferenceSeries;
import org.eclipse.birt.chart.model.type.GanttSeries;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.PieSeries;
import org.eclipse.birt.chart.model.type.ScatterSeries;
import org.eclipse.birt.chart.model.type.StockSeries;
import org.eclipse.emf.ecore.EObject;

/**
 * This class is auto generated code, don't edit it manually. This class
 * provides function to update chart element values with reference chart
 * object or default chart values, if current chart element isn't set or is
 * null, then use reference chart object to replace if the reference chart
 * object is set or not null, otherwise use default chart value to replace 
 * if it is set.
 * 
 * @generated
 */

public class ChartValueUpdater
{

	private final ChartExtensionValueUpdater extUpdater = new ChartExtensionValueUpdater( );

	/**
	 * Updates chart object.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 *
	 * @generated
	 */
	public void update( Chart eObj, Chart eRefObj )
	{
		if ( eObj != null )
		{
			updateChart( eObj.eClass( ).getName( ), null, eObj, eRefObj );
		}
	}

	/**
	 * Updates chart element Chart.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 *
	 * @generated
	 */
	public void updateChart( String name, EObject eParentObj, Chart eObj,
			Chart eRefObj )
	{
		if ( eObj == null )
		{
			return;
		}
		if ( eObj instanceof DialChart )
		{
			updateDialChart( name,
					eParentObj,
					(DialChart) eObj,
					(DialChart) eRefObj,
					DefaultValueProvider.defDialChart( ) );
		}
		else if ( eObj instanceof ChartWithAxes )
		{
			updateChartWithAxes( name,
					eParentObj,
					(ChartWithAxes) eObj,
					(ChartWithAxes) eRefObj,
					DefaultValueProvider.defChartWithAxes( ) );
		}
		else if ( eObj instanceof ChartWithoutAxes )
		{
			updateChartWithoutAxes( name,
					eParentObj,
					(ChartWithoutAxes) eObj,
					(ChartWithoutAxes) eRefObj,
					DefaultValueProvider.defChartWithoutAxes( ) );
		}
		else
		{
			updateChartImpl( name, eParentObj, eObj, eRefObj, null );
		}
	}

	/**
	 * Updates chart element Chart.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateChartImpl( String name, EObject eParentObj,
			Chart eObj, Chart eRefObj, Chart eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getType( ) != null )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.getType( ) != null )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getSubType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSubType( ) != null )
			{
				eObj.setSubType( eRefObj.getSubType( ) );
			}
			else if ( eDefObj != null && eDefObj.getSubType( ) != null )
			{
				eObj.setSubType( eDefObj.getSubType( ) );
			}
		}

		if ( !eObj.isSetDimension( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDimension( ) )
			{
				eObj.setDimension( eRefObj.getDimension( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDimension( ) )
			{
				eObj.setDimension( eDefObj.getDimension( ) );
			}
		}

		if ( eObj.getUnits( ) == null )
		{
			if ( eRefObj != null && eRefObj.getUnits( ) != null )
			{
				eObj.setUnits( eRefObj.getUnits( ) );
			}
			else if ( eDefObj != null && eDefObj.getUnits( ) != null )
			{
				eObj.setUnits( eDefObj.getUnits( ) );
			}
		}

		if ( !eObj.isSetSeriesThickness( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eRefObj.getSeriesThickness( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eDefObj.getSeriesThickness( ) );
			}
		}

		if ( !eObj.isSetGridColumnCount( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eRefObj.getGridColumnCount( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eDefObj.getGridColumnCount( ) );
			}
		}

		// list attributes

		// references
		updateBlock( "block",
				eObj,
				eObj.getBlock( ),
				eRefObj == null ? null : eRefObj.getBlock( ),
				eDefObj == null ? null : eDefObj.getBlock( ) );
		if ( eObj.getExtendedProperties( ).size( ) == 0 )
		{
			if ( eRefObj != null
					&& eRefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eRefObj.getExtendedProperties( ) ) );
			}
			else if ( eDefObj != null
					&& eDefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eDefObj.getExtendedProperties( ) ) );
			}
		}
		updateInteractivity( "interactivity",
				eObj,
				eObj.getInteractivity( ),
				eRefObj == null ? null : eRefObj.getInteractivity( ),
				eDefObj == null ? null : eDefObj.getInteractivity( ) );
		updateLabel( "emptyMessage",
				eObj,
				eObj.getEmptyMessage( ),
				eRefObj == null ? null : eRefObj.getEmptyMessage( ),
				eDefObj == null ? null : eDefObj.getEmptyMessage( ) );

	}

	/**
	 * Updates chart element ChartWithAxes.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateChartWithAxes( String name, EObject eParentObj,
			ChartWithAxes eObj, ChartWithAxes eRefObj, ChartWithAxes eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetVersion( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVersion( ) )
			{
				eObj.setVersion( eRefObj.getVersion( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVersion( ) )
			{
				eObj.setVersion( eDefObj.getVersion( ) );
			}
		}

		if ( eObj.getType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getType( ) != null )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.getType( ) != null )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getSubType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSubType( ) != null )
			{
				eObj.setSubType( eRefObj.getSubType( ) );
			}
			else if ( eDefObj != null && eDefObj.getSubType( ) != null )
			{
				eObj.setSubType( eDefObj.getSubType( ) );
			}
		}

		if ( !eObj.isSetDimension( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDimension( ) )
			{
				eObj.setDimension( eRefObj.getDimension( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDimension( ) )
			{
				eObj.setDimension( eDefObj.getDimension( ) );
			}
		}

		if ( eObj.getScript( ) == null )
		{
			if ( eRefObj != null && eRefObj.getScript( ) != null )
			{
				eObj.setScript( eRefObj.getScript( ) );
			}
			else if ( eDefObj != null && eDefObj.getScript( ) != null )
			{
				eObj.setScript( eDefObj.getScript( ) );
			}
		}

		if ( eObj.getUnits( ) == null )
		{
			if ( eRefObj != null && eRefObj.getUnits( ) != null )
			{
				eObj.setUnits( eRefObj.getUnits( ) );
			}
			else if ( eDefObj != null && eDefObj.getUnits( ) != null )
			{
				eObj.setUnits( eDefObj.getUnits( ) );
			}
		}

		if ( !eObj.isSetSeriesThickness( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eRefObj.getSeriesThickness( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eDefObj.getSeriesThickness( ) );
			}
		}

		if ( !eObj.isSetGridColumnCount( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eRefObj.getGridColumnCount( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eDefObj.getGridColumnCount( ) );
			}
		}

		if ( !eObj.isSetOrientation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eRefObj.getOrientation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eDefObj.getOrientation( ) );
			}
		}

		if ( !eObj.isSetUnitSpacing( ) )
		{
			if ( eRefObj != null && eRefObj.isSetUnitSpacing( ) )
			{
				eObj.setUnitSpacing( eRefObj.getUnitSpacing( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetUnitSpacing( ) )
			{
				eObj.setUnitSpacing( eDefObj.getUnitSpacing( ) );
			}
		}

		if ( !eObj.isSetReverseCategory( ) )
		{
			if ( eRefObj != null && eRefObj.isSetReverseCategory( ) )
			{
				eObj.setReverseCategory( eRefObj.isReverseCategory( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetReverseCategory( ) )
			{
				eObj.setReverseCategory( eDefObj.isReverseCategory( ) );
			}
		}

		if ( !eObj.isSetStudyLayout( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStudyLayout( ) )
			{
				eObj.setStudyLayout( eRefObj.isStudyLayout( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStudyLayout( ) )
			{
				eObj.setStudyLayout( eDefObj.isStudyLayout( ) );
			}
		}

		// list attributes

		// references
		updateText( "description",
				eObj,
				eObj.getDescription( ),
				eRefObj == null ? null : eRefObj.getDescription( ),
				eDefObj == null ? null : eDefObj.getDescription( ) );
		updateBlock( "block",
				eObj,
				eObj.getBlock( ),
				eRefObj == null ? null : eRefObj.getBlock( ),
				eDefObj == null ? null : eDefObj.getBlock( ) );
		if ( eObj.getExtendedProperties( ).size( ) == 0 )
		{
			if ( eRefObj != null
					&& eRefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eRefObj.getExtendedProperties( ) ) );
			}
			else if ( eDefObj != null
					&& eDefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eDefObj.getExtendedProperties( ) ) );
			}
		}
		updateInteractivity( "interactivity",
				eObj,
				eObj.getInteractivity( ),
				eRefObj == null ? null : eRefObj.getInteractivity( ),
				eDefObj == null ? null : eDefObj.getInteractivity( ) );
		updateLabel( "emptyMessage",
				eObj,
				eObj.getEmptyMessage( ),
				eRefObj == null ? null : eRefObj.getEmptyMessage( ),
				eDefObj == null ? null : eDefObj.getEmptyMessage( ) );
		for ( Axis element : eObj.getAxes( ) )
		{
			updateAxis( "axes", eObj, element, ( eRefObj != null && eRefObj.getAxes( ).size( ) > 0 ) ? eRefObj.getAxes( ).get( 0 ) : null, DefaultValueProvider.defBaseAxis( ), 0 ); //$NON-NLS-1$ 
		}

		updateFill( "wallFill",
				eObj,
				eObj.getWallFill( ),
				eRefObj == null ? null : eRefObj.getWallFill( ),
				eDefObj == null ? null : eDefObj.getWallFill( ) );
		updateFill( "floorFill",
				eObj,
				eObj.getFloorFill( ),
				eRefObj == null ? null : eRefObj.getFloorFill( ),
				eDefObj == null ? null : eDefObj.getFloorFill( ) );
		updateRotation3D( "rotation",
				eObj,
				eObj.getRotation( ),
				eRefObj == null ? null : eRefObj.getRotation( ),
				eDefObj == null ? null : eDefObj.getRotation( ) );

	}

	/**
	 * Updates chart element ChartWithoutAxes.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateChartWithoutAxes( String name, EObject eParentObj,
			ChartWithoutAxes eObj, ChartWithoutAxes eRefObj,
			ChartWithoutAxes eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eObj instanceof DialChart )
		{
			updateDialChart( name,
					eParentObj,
					(DialChart) eObj,
					(DialChart) eRefObj,
					DefaultValueProvider.defDialChart( ) );
		}
		else
		{
			updateChartWithoutAxesImpl( name,
					eParentObj,
					eObj,
					eRefObj,
					eDefObj );
		}
	}

	/**
	 * Updates chart element ChartWithoutAxes.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateChartWithoutAxesImpl( String name, EObject eParentObj,
			ChartWithoutAxes eObj, ChartWithoutAxes eRefObj,
			ChartWithoutAxes eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetVersion( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVersion( ) )
			{
				eObj.setVersion( eRefObj.getVersion( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVersion( ) )
			{
				eObj.setVersion( eDefObj.getVersion( ) );
			}
		}

		if ( eObj.getType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getType( ) != null )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.getType( ) != null )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getSubType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSubType( ) != null )
			{
				eObj.setSubType( eRefObj.getSubType( ) );
			}
			else if ( eDefObj != null && eDefObj.getSubType( ) != null )
			{
				eObj.setSubType( eDefObj.getSubType( ) );
			}
		}

		if ( !eObj.isSetDimension( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDimension( ) )
			{
				eObj.setDimension( eRefObj.getDimension( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDimension( ) )
			{
				eObj.setDimension( eDefObj.getDimension( ) );
			}
		}

		if ( eObj.getScript( ) == null )
		{
			if ( eRefObj != null && eRefObj.getScript( ) != null )
			{
				eObj.setScript( eRefObj.getScript( ) );
			}
			else if ( eDefObj != null && eDefObj.getScript( ) != null )
			{
				eObj.setScript( eDefObj.getScript( ) );
			}
		}

		if ( eObj.getUnits( ) == null )
		{
			if ( eRefObj != null && eRefObj.getUnits( ) != null )
			{
				eObj.setUnits( eRefObj.getUnits( ) );
			}
			else if ( eDefObj != null && eDefObj.getUnits( ) != null )
			{
				eObj.setUnits( eDefObj.getUnits( ) );
			}
		}

		if ( !eObj.isSetSeriesThickness( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eRefObj.getSeriesThickness( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eDefObj.getSeriesThickness( ) );
			}
		}

		if ( !eObj.isSetGridColumnCount( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eRefObj.getGridColumnCount( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eDefObj.getGridColumnCount( ) );
			}
		}

		if ( !eObj.isSetMinSlice( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMinSlice( ) )
			{
				eObj.setMinSlice( eRefObj.getMinSlice( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMinSlice( ) )
			{
				eObj.setMinSlice( eDefObj.getMinSlice( ) );
			}
		}

		if ( !eObj.isSetMinSlicePercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMinSlicePercent( ) )
			{
				eObj.setMinSlicePercent( eRefObj.isMinSlicePercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMinSlicePercent( ) )
			{
				eObj.setMinSlicePercent( eDefObj.isMinSlicePercent( ) );
			}
		}

		if ( eObj.getMinSliceLabel( ) == null )
		{
			if ( eRefObj != null && eRefObj.getMinSliceLabel( ) != null )
			{
				eObj.setMinSliceLabel( eRefObj.getMinSliceLabel( ) );
			}
			else if ( eDefObj != null && eDefObj.getMinSliceLabel( ) != null )
			{
				eObj.setMinSliceLabel( eDefObj.getMinSliceLabel( ) );
			}
		}

		if ( !eObj.isSetCoverage( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCoverage( ) )
			{
				eObj.setCoverage( eRefObj.getCoverage( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCoverage( ) )
			{
				eObj.setCoverage( eDefObj.getCoverage( ) );
			}
		}

		// list attributes

		// references
		updateText( "description",
				eObj,
				eObj.getDescription( ),
				eRefObj == null ? null : eRefObj.getDescription( ),
				eDefObj == null ? null : eDefObj.getDescription( ) );
		updateBlock( "block",
				eObj,
				eObj.getBlock( ),
				eRefObj == null ? null : eRefObj.getBlock( ),
				eDefObj == null ? null : eDefObj.getBlock( ) );
		if ( eObj.getExtendedProperties( ).size( ) == 0 )
		{
			if ( eRefObj != null
					&& eRefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eRefObj.getExtendedProperties( ) ) );
			}
			else if ( eDefObj != null
					&& eDefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eDefObj.getExtendedProperties( ) ) );
			}
		}
		updateInteractivity( "interactivity",
				eObj,
				eObj.getInteractivity( ),
				eRefObj == null ? null : eRefObj.getInteractivity( ),
				eDefObj == null ? null : eDefObj.getInteractivity( ) );
		updateLabel( "emptyMessage",
				eObj,
				eObj.getEmptyMessage( ),
				eRefObj == null ? null : eRefObj.getEmptyMessage( ),
				eDefObj == null ? null : eDefObj.getEmptyMessage( ) );
		int seriesDefIndex = 0;
		for ( SeriesDefinition element : eObj.getSeriesDefinitions( ) )
		{
			updateSeriesDefinition( "seriesDefinitions", eObj, element, ( eRefObj != null && eRefObj.getSeriesDefinitions( ).size( ) > 0 ) ? eRefObj.getSeriesDefinitions( ).get( 0 ) : null, DefaultValueProvider.defSeriesDefinition( seriesDefIndex++ ), 0, 0 ); //$NON-NLS-1$ 
		}

	}

	/**
	 * Updates chart element DialChart.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateDialChart( String name, EObject eParentObj,
			DialChart eObj, DialChart eRefObj, DialChart eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetVersion( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVersion( ) )
			{
				eObj.setVersion( eRefObj.getVersion( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVersion( ) )
			{
				eObj.setVersion( eDefObj.getVersion( ) );
			}
		}

		if ( eObj.getType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getType( ) != null )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.getType( ) != null )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getSubType( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSubType( ) != null )
			{
				eObj.setSubType( eRefObj.getSubType( ) );
			}
			else if ( eDefObj != null && eDefObj.getSubType( ) != null )
			{
				eObj.setSubType( eDefObj.getSubType( ) );
			}
		}

		if ( !eObj.isSetDimension( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDimension( ) )
			{
				eObj.setDimension( eRefObj.getDimension( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDimension( ) )
			{
				eObj.setDimension( eDefObj.getDimension( ) );
			}
		}

		if ( eObj.getScript( ) == null )
		{
			if ( eRefObj != null && eRefObj.getScript( ) != null )
			{
				eObj.setScript( eRefObj.getScript( ) );
			}
			else if ( eDefObj != null && eDefObj.getScript( ) != null )
			{
				eObj.setScript( eDefObj.getScript( ) );
			}
		}

		if ( eObj.getUnits( ) == null )
		{
			if ( eRefObj != null && eRefObj.getUnits( ) != null )
			{
				eObj.setUnits( eRefObj.getUnits( ) );
			}
			else if ( eDefObj != null && eDefObj.getUnits( ) != null )
			{
				eObj.setUnits( eDefObj.getUnits( ) );
			}
		}

		if ( !eObj.isSetSeriesThickness( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eRefObj.getSeriesThickness( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSeriesThickness( ) )
			{
				eObj.setSeriesThickness( eDefObj.getSeriesThickness( ) );
			}
		}

		if ( !eObj.isSetGridColumnCount( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eRefObj.getGridColumnCount( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGridColumnCount( ) )
			{
				eObj.setGridColumnCount( eDefObj.getGridColumnCount( ) );
			}
		}

		if ( !eObj.isSetMinSlice( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMinSlice( ) )
			{
				eObj.setMinSlice( eRefObj.getMinSlice( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMinSlice( ) )
			{
				eObj.setMinSlice( eDefObj.getMinSlice( ) );
			}
		}

		if ( !eObj.isSetMinSlicePercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMinSlicePercent( ) )
			{
				eObj.setMinSlicePercent( eRefObj.isMinSlicePercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMinSlicePercent( ) )
			{
				eObj.setMinSlicePercent( eDefObj.isMinSlicePercent( ) );
			}
		}

		if ( eObj.getMinSliceLabel( ) == null )
		{
			if ( eRefObj != null && eRefObj.getMinSliceLabel( ) != null )
			{
				eObj.setMinSliceLabel( eRefObj.getMinSliceLabel( ) );
			}
			else if ( eDefObj != null && eDefObj.getMinSliceLabel( ) != null )
			{
				eObj.setMinSliceLabel( eDefObj.getMinSliceLabel( ) );
			}
		}

		if ( !eObj.isSetCoverage( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCoverage( ) )
			{
				eObj.setCoverage( eRefObj.getCoverage( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCoverage( ) )
			{
				eObj.setCoverage( eDefObj.getCoverage( ) );
			}
		}

		if ( !eObj.isSetDialSuperimposition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDialSuperimposition( ) )
			{
				eObj.setDialSuperimposition( eRefObj.isDialSuperimposition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDialSuperimposition( ) )
			{
				eObj.setDialSuperimposition( eDefObj.isDialSuperimposition( ) );
			}
		}

		// list attributes

		// references
		updateText( "description",
				eObj,
				eObj.getDescription( ),
				eRefObj == null ? null : eRefObj.getDescription( ),
				eDefObj == null ? null : eDefObj.getDescription( ) );
		updateBlock( "block",
				eObj,
				eObj.getBlock( ),
				eRefObj == null ? null : eRefObj.getBlock( ),
				eDefObj == null ? null : eDefObj.getBlock( ) );
		if ( eObj.getExtendedProperties( ).size( ) == 0 )
		{
			if ( eRefObj != null
					&& eRefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eRefObj.getExtendedProperties( ) ) );
			}
			else if ( eDefObj != null
					&& eDefObj.getExtendedProperties( ).size( ) > 0 )
			{
				eObj.getExtendedProperties( )
						.addAll( ChartElementUtil.copyInstance( eDefObj.getExtendedProperties( ) ) );
			}
		}
		updateInteractivity( "interactivity",
				eObj,
				eObj.getInteractivity( ),
				eRefObj == null ? null : eRefObj.getInteractivity( ),
				eDefObj == null ? null : eDefObj.getInteractivity( ) );
		updateLabel( "emptyMessage",
				eObj,
				eObj.getEmptyMessage( ),
				eRefObj == null ? null : eRefObj.getEmptyMessage( ),
				eDefObj == null ? null : eDefObj.getEmptyMessage( ) );
		int seriesDefIndex = 0;
		for ( SeriesDefinition element : eObj.getSeriesDefinitions( ) )
		{
			updateSeriesDefinition( "seriesDefinitions", eObj, element, ( eRefObj != null && eRefObj.getSeriesDefinitions( ).size( ) > 0 ) ? eRefObj.getSeriesDefinitions( ).get( 0 ) : null, DefaultValueProvider.defSeriesDefinition( seriesDefIndex++ ), 0, 0 ); //$NON-NLS-1$ 
		}

	}

	/**
	 * Updates chart element AreaSeries.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateAreaSeries( String name, EObject eParentObj,
			AreaSeries eObj, AreaSeries eRefObj, AreaSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		if ( eObj instanceof DifferenceSeries )
		{
			updateDifferenceSeries( name,
					eParentObj,
					(DifferenceSeries) eObj,
					(DifferenceSeries) eRefObj,
					DefaultValueProvider.defDifferenceSeries( ) );
		}
		else
		{
			updateAreaSeriesImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element AreaSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateAreaSeriesImpl( String name, EObject eParentObj,
			AreaSeries eObj, AreaSeries eRefObj, AreaSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		if ( !eObj.isSetCurve( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCurve( ) )
			{
				eObj.setCurve( eRefObj.isCurve( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCurve( ) )
			{
				eObj.setCurve( eDefObj.isCurve( ) );
			}
		}

		if ( !eObj.isSetConnectMissingValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eRefObj.isConnectMissingValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eDefObj.isConnectMissingValue( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		int index_AreaSeries_markers = 0;
		for ( Marker element : eObj.getMarkers( ) )
		{
			updateMarker( "markers", eObj, element, getValidMarkerRef( eRefObj, "markers", index_AreaSeries_markers ), getValidMarkerRef( eDefObj, "markers", index_AreaSeries_markers ) ); //$NON-NLS-1$ 
			index_AreaSeries_markers++;
		}

		updateMarker( "marker",
				eObj,
				eObj.getMarker( ),
				eRefObj == null ? null : eRefObj.getMarker( ),
				eDefObj == null ? null : eDefObj.getMarker( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );

	}

	/**
	 * Updates chart element BarSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateBarSeries( String name, EObject eParentObj,
			BarSeries eObj, BarSeries eRefObj, BarSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetRiser( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRiser( ) )
			{
				eObj.setRiser( eRefObj.getRiser( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRiser( ) )
			{
				eObj.setRiser( eDefObj.getRiser( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateColorDefinition( "riserOutline",
				eObj,
				eObj.getRiserOutline( ),
				eRefObj == null ? null : eRefObj.getRiserOutline( ),
				eDefObj == null ? null : eDefObj.getRiserOutline( ) );

	}

	/**
	 * Updates chart element BubbleSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateBubbleSeries( String name, EObject eParentObj,
			BubbleSeries eObj, BubbleSeries eRefObj, BubbleSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		if ( !eObj.isSetCurve( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCurve( ) )
			{
				eObj.setCurve( eRefObj.isCurve( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCurve( ) )
			{
				eObj.setCurve( eDefObj.isCurve( ) );
			}
		}

		if ( !eObj.isSetConnectMissingValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eRefObj.isConnectMissingValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eDefObj.isConnectMissingValue( ) );
			}
		}

		if ( !eObj.isSetAccOrientation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAccOrientation( ) )
			{
				eObj.setAccOrientation( eRefObj.getAccOrientation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAccOrientation( ) )
			{
				eObj.setAccOrientation( eDefObj.getAccOrientation( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		int index_BubbleSeries_markers = 0;
		for ( Marker element : eObj.getMarkers( ) )
		{
			updateMarker( "markers", eObj, element, getValidMarkerRef( eRefObj, "markers", index_BubbleSeries_markers ), getValidMarkerRef( eDefObj, "markers", index_BubbleSeries_markers ) ); //$NON-NLS-1$ 
			index_BubbleSeries_markers++;
		}

		updateMarker( "marker",
				eObj,
				eObj.getMarker( ),
				eRefObj == null ? null : eRefObj.getMarker( ),
				eDefObj == null ? null : eDefObj.getMarker( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );
		updateLineAttributes( "accLineAttributes",
				eObj,
				eObj.getAccLineAttributes( ),
				eRefObj == null ? null : eRefObj.getAccLineAttributes( ),
				eDefObj == null ? null : eDefObj.getAccLineAttributes( ) );

	}

	/**
	 * Updates chart element DialSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateDialSeries( String name, EObject eParentObj,
			DialSeries eObj, DialSeries eRefObj, DialSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateDial( "dial",
				eObj,
				eObj.getDial( ),
				eRefObj == null ? null : eRefObj.getDial( ),
				eDefObj == null ? null : eDefObj.getDial( ) );
		updateNeedle( "needle",
				eObj,
				eObj.getNeedle( ),
				eRefObj == null ? null : eRefObj.getNeedle( ),
				eDefObj == null ? null : eDefObj.getNeedle( ) );

	}

	/**
	 * Updates chart element DifferenceSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateDifferenceSeries( String name, EObject eParentObj,
			DifferenceSeries eObj, DifferenceSeries eRefObj,
			DifferenceSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		if ( !eObj.isSetCurve( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCurve( ) )
			{
				eObj.setCurve( eRefObj.isCurve( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCurve( ) )
			{
				eObj.setCurve( eDefObj.isCurve( ) );
			}
		}

		if ( !eObj.isSetConnectMissingValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eRefObj.isConnectMissingValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eDefObj.isConnectMissingValue( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		int index_DifferenceSeries_markers = 0;
		for ( Marker element : eObj.getMarkers( ) )
		{
			updateMarker( "markers", eObj, element, getValidMarkerRef( eRefObj, "markers", index_DifferenceSeries_markers ), getValidMarkerRef( eDefObj, "markers", index_DifferenceSeries_markers ) ); //$NON-NLS-1$ 
			index_DifferenceSeries_markers++;
		}

		updateMarker( "marker",
				eObj,
				eObj.getMarker( ),
				eRefObj == null ? null : eRefObj.getMarker( ),
				eDefObj == null ? null : eDefObj.getMarker( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );
		int index_DifferenceSeries_negativeMarkers = 0;
		for ( Marker element : eObj.getNegativeMarkers( ) )
		{
			updateMarker( "negativeMarkers", eObj, element, getValidMarkerRef( eRefObj, "negativeMarkers", index_DifferenceSeries_negativeMarkers ), getValidMarkerRef( eDefObj, "negativeMarkers", index_DifferenceSeries_negativeMarkers ) ); //$NON-NLS-1$ 
			index_DifferenceSeries_negativeMarkers++;
		}

		updateLineAttributes( "negativeLineAttributes",
				eObj,
				eObj.getNegativeLineAttributes( ),
				eRefObj == null ? null : eRefObj.getNegativeLineAttributes( ),
				eDefObj == null ? null : eDefObj.getNegativeLineAttributes( ) );

	}

	/**
	 * Updates chart element GanttSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateGanttSeries( String name, EObject eParentObj,
			GanttSeries eObj, GanttSeries eRefObj, GanttSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetStartMarkerPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStartMarkerPosition( ) )
			{
				eObj.setStartMarkerPosition( eRefObj.getStartMarkerPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStartMarkerPosition( ) )
			{
				eObj.setStartMarkerPosition( eDefObj.getStartMarkerPosition( ) );
			}
		}

		if ( !eObj.isSetEndMarkerPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetEndMarkerPosition( ) )
			{
				eObj.setEndMarkerPosition( eRefObj.getEndMarkerPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetEndMarkerPosition( ) )
			{
				eObj.setEndMarkerPosition( eDefObj.getEndMarkerPosition( ) );
			}
		}

		if ( !eObj.isSetUseDecorationLabelValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetUseDecorationLabelValue( ) )
			{
				eObj.setUseDecorationLabelValue( eRefObj.isUseDecorationLabelValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetUseDecorationLabelValue( ) )
			{
				eObj.setUseDecorationLabelValue( eDefObj.isUseDecorationLabelValue( ) );
			}
		}

		if ( !eObj.isSetDecorationLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDecorationLabelPosition( ) )
			{
				eObj.setDecorationLabelPosition( eRefObj.getDecorationLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDecorationLabelPosition( ) )
			{
				eObj.setDecorationLabelPosition( eDefObj.getDecorationLabelPosition( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateMarker( "startMarker",
				eObj,
				eObj.getStartMarker( ),
				eRefObj == null ? null : eRefObj.getStartMarker( ),
				eDefObj == null ? null : eDefObj.getStartMarker( ) );
		updateMarker( "endMarker",
				eObj,
				eObj.getEndMarker( ),
				eRefObj == null ? null : eRefObj.getEndMarker( ),
				eDefObj == null ? null : eDefObj.getEndMarker( ) );
		updateLineAttributes( "connectionLine",
				eObj,
				eObj.getConnectionLine( ),
				eRefObj == null ? null : eRefObj.getConnectionLine( ),
				eDefObj == null ? null : eDefObj.getConnectionLine( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "outlineFill",
				eObj,
				eObj.getOutlineFill( ),
				eRefObj == null ? null : eRefObj.getOutlineFill( ),
				eDefObj == null ? null : eDefObj.getOutlineFill( ) );
		updateLabel( "decorationLabel",
				eObj,
				eObj.getDecorationLabel( ),
				eRefObj == null ? null : eRefObj.getDecorationLabel( ),
				eDefObj == null ? null : eDefObj.getDecorationLabel( ) );

	}

	/**
	 * Updates chart element LineSeries.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateLineSeries( String name, EObject eParentObj,
			LineSeries eObj, LineSeries eRefObj, LineSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		if ( eObj instanceof BubbleSeries )
		{
			updateBubbleSeries( name,
					eParentObj,
					(BubbleSeries) eObj,
					(BubbleSeries) eRefObj,
					DefaultValueProvider.defBubbleSeries( ) );
		}
		else if ( eObj instanceof DifferenceSeries )
		{
			updateDifferenceSeries( name,
					eParentObj,
					(DifferenceSeries) eObj,
					(DifferenceSeries) eRefObj,
					DefaultValueProvider.defDifferenceSeries( ) );
		}
		else if ( eObj instanceof AreaSeries )
		{
			updateAreaSeries( name,
					eParentObj,
					(AreaSeries) eObj,
					(AreaSeries) eRefObj,
					DefaultValueProvider.defAreaSeries( ) );
		}
		else if ( eObj instanceof ScatterSeries )
		{
			updateScatterSeries( name,
					eParentObj,
					(ScatterSeries) eObj,
					(ScatterSeries) eRefObj,
					DefaultValueProvider.defScatterSeries( ) );
		}
		else
		{
			updateLineSeriesImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element LineSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateLineSeriesImpl( String name, EObject eParentObj,
			LineSeries eObj, LineSeries eRefObj, LineSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		if ( !eObj.isSetCurve( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCurve( ) )
			{
				eObj.setCurve( eRefObj.isCurve( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCurve( ) )
			{
				eObj.setCurve( eDefObj.isCurve( ) );
			}
		}

		if ( !eObj.isSetConnectMissingValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eRefObj.isConnectMissingValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eDefObj.isConnectMissingValue( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		int index_LineSeries_markers = 0;
		for ( Marker element : eObj.getMarkers( ) )
		{
			updateMarker( "markers", eObj, element, getValidMarkerRef( eRefObj, "markers", index_LineSeries_markers ), getValidMarkerRef( eDefObj, "markers", index_LineSeries_markers ) ); //$NON-NLS-1$ 
			index_LineSeries_markers++;
		}

		updateMarker( "marker",
				eObj,
				eObj.getMarker( ),
				eRefObj == null ? null : eRefObj.getMarker( ),
				eDefObj == null ? null : eDefObj.getMarker( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );

	}

	/**
	 * Updates chart element PieSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updatePieSeries( String name, EObject eParentObj,
			PieSeries eObj, PieSeries eRefObj, PieSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetExplosion( ) )
		{
			if ( eRefObj != null && eRefObj.isSetExplosion( ) )
			{
				eObj.setExplosion( eRefObj.getExplosion( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetExplosion( ) )
			{
				eObj.setExplosion( eDefObj.getExplosion( ) );
			}
		}

		if ( eObj.getExplosionExpression( ) == null )
		{
			if ( eRefObj != null && eRefObj.getExplosionExpression( ) != null )
			{
				eObj.setExplosionExpression( eRefObj.getExplosionExpression( ) );
			}
			else if ( eDefObj != null
					&& eDefObj.getExplosionExpression( ) != null )
			{
				eObj.setExplosionExpression( eDefObj.getExplosionExpression( ) );
			}
		}

		if ( !eObj.isSetTitlePosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eRefObj.getTitlePosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eDefObj.getTitlePosition( ) );
			}
		}

		if ( !eObj.isSetLeaderLineStyle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLeaderLineStyle( ) )
			{
				eObj.setLeaderLineStyle( eRefObj.getLeaderLineStyle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLeaderLineStyle( ) )
			{
				eObj.setLeaderLineStyle( eDefObj.getLeaderLineStyle( ) );
			}
		}

		if ( !eObj.isSetLeaderLineLength( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLeaderLineLength( ) )
			{
				eObj.setLeaderLineLength( eRefObj.getLeaderLineLength( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLeaderLineLength( ) )
			{
				eObj.setLeaderLineLength( eDefObj.getLeaderLineLength( ) );
			}
		}

		if ( !eObj.isSetRatio( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRatio( ) )
			{
				eObj.setRatio( eRefObj.getRatio( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRatio( ) )
			{
				eObj.setRatio( eDefObj.getRatio( ) );
			}
		}

		if ( !eObj.isSetRotation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRotation( ) )
			{
				eObj.setRotation( eRefObj.getRotation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRotation( ) )
			{
				eObj.setRotation( eDefObj.getRotation( ) );
			}
		}

		if ( !eObj.isSetClockwise( ) )
		{
			if ( eRefObj != null && eRefObj.isSetClockwise( ) )
			{
				eObj.setClockwise( eRefObj.isClockwise( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetClockwise( ) )
			{
				eObj.setClockwise( eDefObj.isClockwise( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateLabel( "title",
				eObj,
				eObj.getTitle( ),
				eRefObj == null ? null : eRefObj.getTitle( ),
				eDefObj == null ? null : eDefObj.getTitle( ) );
		updateLineAttributes( "leaderLineAttributes",
				eObj,
				eObj.getLeaderLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLeaderLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLeaderLineAttributes( ) );
		updateColorDefinition( "sliceOutline",
				eObj,
				eObj.getSliceOutline( ),
				eRefObj == null ? null : eRefObj.getSliceOutline( ),
				eDefObj == null ? null : eDefObj.getSliceOutline( ) );

	}

	/**
	 * Updates chart element ScatterSeries.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateScatterSeries( String name, EObject eParentObj,
			ScatterSeries eObj, ScatterSeries eRefObj, ScatterSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		if ( eObj instanceof BubbleSeries )
		{
			updateBubbleSeries( name,
					eParentObj,
					(BubbleSeries) eObj,
					(BubbleSeries) eRefObj,
					DefaultValueProvider.defBubbleSeries( ) );
		}
		else
		{
			updateScatterSeriesImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element ScatterSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateScatterSeriesImpl( String name, EObject eParentObj,
			ScatterSeries eObj, ScatterSeries eRefObj, ScatterSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetPaletteLineColor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eRefObj.isPaletteLineColor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPaletteLineColor( ) )
			{
				eObj.setPaletteLineColor( eDefObj.isPaletteLineColor( ) );
			}
		}

		if ( !eObj.isSetCurve( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCurve( ) )
			{
				eObj.setCurve( eRefObj.isCurve( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCurve( ) )
			{
				eObj.setCurve( eDefObj.isCurve( ) );
			}
		}

		if ( !eObj.isSetConnectMissingValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eRefObj.isConnectMissingValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetConnectMissingValue( ) )
			{
				eObj.setConnectMissingValue( eDefObj.isConnectMissingValue( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		int index_ScatterSeries_markers = 0;
		for ( Marker element : eObj.getMarkers( ) )
		{
			updateMarker( "markers", eObj, element, getValidMarkerRef( eRefObj, "markers", index_ScatterSeries_markers ), getValidMarkerRef( eDefObj, "markers", index_ScatterSeries_markers ) ); //$NON-NLS-1$ 
			index_ScatterSeries_markers++;
		}

		updateMarker( "marker",
				eObj,
				eObj.getMarker( ),
				eRefObj == null ? null : eRefObj.getMarker( ),
				eDefObj == null ? null : eDefObj.getMarker( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );

	}

	/**
	 * Updates chart element StockSeries.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateStockSeries( String name, EObject eParentObj,
			StockSeries eObj, StockSeries eRefObj, StockSeries eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		if ( !eObj.isSetShowAsBarStick( ) )
		{
			if ( eRefObj != null && eRefObj.isSetShowAsBarStick( ) )
			{
				eObj.setShowAsBarStick( eRefObj.isShowAsBarStick( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetShowAsBarStick( ) )
			{
				eObj.setShowAsBarStick( eDefObj.isShowAsBarStick( ) );
			}
		}

		if ( !eObj.isSetStickLength( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStickLength( ) )
			{
				eObj.setStickLength( eRefObj.getStickLength( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStickLength( ) )
			{
				eObj.setStickLength( eDefObj.getStickLength( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateFill( "fill",
				eObj,
				eObj.getFill( ),
				eRefObj == null ? null : eRefObj.getFill( ),
				eDefObj == null ? null : eDefObj.getFill( ) );
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );

	}

	/**
	 * Updates chart element Axis.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 * @param axisIndex
	 *        index of axis.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateAxis( String name, EObject eParentObj, Axis eObj,
			Axis eRefObj, Axis eDefObj, int axisIndex )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( !eObj.isSetTitlePosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eRefObj.getTitlePosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eDefObj.getTitlePosition( ) );
			}
		}

		if ( !eObj.isSetGapWidth( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGapWidth( ) )
			{
				eObj.setGapWidth( eRefObj.getGapWidth( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGapWidth( ) )
			{
				eObj.setGapWidth( eDefObj.getGapWidth( ) );
			}
		}

		if ( !eObj.isSetOrientation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eRefObj.getOrientation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eDefObj.getOrientation( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStaggered( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStaggered( ) )
			{
				eObj.setStaggered( eRefObj.isStaggered( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStaggered( ) )
			{
				eObj.setStaggered( eDefObj.isStaggered( ) );
			}
		}

		if ( !eObj.isSetInterval( ) )
		{
			if ( eRefObj != null && eRefObj.isSetInterval( ) )
			{
				eObj.setInterval( eRefObj.getInterval( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetInterval( ) )
			{
				eObj.setInterval( eDefObj.getInterval( ) );
			}
		}

		if ( !eObj.isSetPrimaryAxis( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPrimaryAxis( ) )
			{
				eObj.setPrimaryAxis( eRefObj.isPrimaryAxis( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPrimaryAxis( ) )
			{
				eObj.setPrimaryAxis( eDefObj.isPrimaryAxis( ) );
			}
		}

		if ( !eObj.isSetCategoryAxis( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCategoryAxis( ) )
			{
				eObj.setCategoryAxis( eRefObj.isCategoryAxis( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCategoryAxis( ) )
			{
				eObj.setCategoryAxis( eDefObj.isCategoryAxis( ) );
			}
		}

		if ( !eObj.isSetPercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPercent( ) )
			{
				eObj.setPercent( eRefObj.isPercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPercent( ) )
			{
				eObj.setPercent( eDefObj.isPercent( ) );
			}
		}

		if ( !eObj.isSetLabelWithinAxes( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelWithinAxes( ) )
			{
				eObj.setLabelWithinAxes( eRefObj.isLabelWithinAxes( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelWithinAxes( ) )
			{
				eObj.setLabelWithinAxes( eDefObj.isLabelWithinAxes( ) );
			}
		}

		if ( !eObj.isSetAligned( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAligned( ) )
			{
				eObj.setAligned( eRefObj.isAligned( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAligned( ) )
			{
				eObj.setAligned( eDefObj.isAligned( ) );
			}
		}

		if ( !eObj.isSetSideBySide( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSideBySide( ) )
			{
				eObj.setSideBySide( eRefObj.isSideBySide( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSideBySide( ) )
			{
				eObj.setSideBySide( eDefObj.isSideBySide( ) );
			}
		}

		if ( !eObj.isSetLabelSpan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelSpan( ) )
			{
				eObj.setLabelSpan( eRefObj.getLabelSpan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelSpan( ) )
			{
				eObj.setLabelSpan( eDefObj.getLabelSpan( ) );
			}
		}

		if ( !eObj.isSetAxisPercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAxisPercent( ) )
			{
				eObj.setAxisPercent( eRefObj.getAxisPercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAxisPercent( ) )
			{
				eObj.setAxisPercent( eDefObj.getAxisPercent( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "title",
				eObj,
				eObj.getTitle( ),
				eRefObj == null ? null : eRefObj.getTitle( ),
				eDefObj == null ? null : eDefObj.getTitle( ) );
		updateLabel( "subTitle",
				eObj,
				eObj.getSubTitle( ),
				eRefObj == null ? null : eRefObj.getSubTitle( ),
				eDefObj == null ? null : eDefObj.getSubTitle( ) );
		int orghAxisIndex = 0;
		for ( Axis element : eObj.getAssociatedAxes( ) )
		{
			updateAxis( "associatedAxes", eObj, element, ( eRefObj != null && eRefObj.getAssociatedAxes( ).size( ) > 0 ) ? eRefObj.getAssociatedAxes( ).get( 0 ) : null, DefaultValueProvider.defOrthogonalAxis( ), orghAxisIndex ); //$NON-NLS-1$ 
			orghAxisIndex++;
		}

		for ( Axis element : eObj.getAncillaryAxes( ) )
		{
			updateAxis( "ancillaryAxes", eObj, element, ( eRefObj != null && eRefObj.getAncillaryAxes( ).size( ) > 0 ) ? eRefObj.getAncillaryAxes( ).get( 0 ) : null, DefaultValueProvider.defOrthogonalAxis( ), 0 ); //$NON-NLS-1$ 
		}

		int seriesDefIndex = 0;
		for ( SeriesDefinition element : eObj.getSeriesDefinitions( ) )
		{
			updateSeriesDefinition( "seriesDefinitions", eObj, element, ( eRefObj != null && eRefObj.getSeriesDefinitions( ).size( ) > 0 ) ? eRefObj.getSeriesDefinitions( ).get( 0 ) : null, DefaultValueProvider.defSeriesDefinition( seriesDefIndex ), axisIndex, seriesDefIndex ); //$NON-NLS-1$ 
			seriesDefIndex++;
		}

		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );
		int index_Axis_markerLines = 0;
		for ( MarkerLine element : eObj.getMarkerLines( ) )
		{
			updateMarkerLine( "markerLines", eObj, element, ( eRefObj != null && eRefObj.getMarkerLines( ).size( ) > 0 ) ? eRefObj.getMarkerLines( ).get( 0 ) : null, ( eDefObj != null && eDefObj.getMarkerLines( ).size( ) > 0 ) ? eDefObj.getMarkerLines( ).get( 0 ) : null ); //$NON-NLS-1$ 
			index_Axis_markerLines++;
		}

		int index_Axis_markerRanges = 0;
		for ( MarkerRange element : eObj.getMarkerRanges( ) )
		{
			updateMarkerRange( "markerRanges", eObj, element, ( eRefObj != null && eRefObj.getMarkerRanges( ).size( ) > 0 ) ? eRefObj.getMarkerRanges( ).get( 0 ) : null, ( eDefObj != null && eDefObj.getMarkerRanges( ).size( ) > 0 ) ? eDefObj.getMarkerRanges( ).get( 0 ) : null ); //$NON-NLS-1$ 
			index_Axis_markerRanges++;
		}

		updateGrid( "majorGrid",
				eObj,
				eObj.getMajorGrid( ),
				eRefObj == null ? null : eRefObj.getMajorGrid( ),
				eDefObj == null ? null : eDefObj.getMajorGrid( ) );
		updateGrid( "minorGrid",
				eObj,
				eObj.getMinorGrid( ),
				eRefObj == null ? null : eRefObj.getMinorGrid( ),
				eDefObj == null ? null : eDefObj.getMinorGrid( ) );
		updateScale( "scale",
				eObj,
				eObj.getScale( ),
				eRefObj == null ? null : eRefObj.getScale( ),
				eDefObj == null ? null : eDefObj.getScale( ) );
		updateAxisOrigin( "origin",
				eObj,
				eObj.getOrigin( ),
				eRefObj == null ? null : eRefObj.getOrigin( ),
				eDefObj == null ? null : eDefObj.getOrigin( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element CurveFitting.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateCurveFitting( String name, EObject eParentObj,
			CurveFitting eObj, CurveFitting eRefObj, CurveFitting eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetLabelAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eRefObj.getLabelAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eDefObj.getLabelAnchor( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );

	}

	/**
	 * Updates chart element Dial.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateDial( String name, EObject eParentObj, Dial eObj,
			Dial eRefObj, Dial eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetStartAngle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStartAngle( ) )
			{
				eObj.setStartAngle( eRefObj.getStartAngle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStartAngle( ) )
			{
				eObj.setStartAngle( eDefObj.getStartAngle( ) );
			}
		}

		if ( !eObj.isSetStopAngle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStopAngle( ) )
			{
				eObj.setStopAngle( eRefObj.getStopAngle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStopAngle( ) )
			{
				eObj.setStopAngle( eDefObj.getStopAngle( ) );
			}
		}

		if ( !eObj.isSetRadius( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRadius( ) )
			{
				eObj.setRadius( eRefObj.getRadius( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRadius( ) )
			{
				eObj.setRadius( eDefObj.getRadius( ) );
			}
		}

		if ( !eObj.isSetInverseScale( ) )
		{
			if ( eRefObj != null && eRefObj.isSetInverseScale( ) )
			{
				eObj.setInverseScale( eRefObj.isInverseScale( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetInverseScale( ) )
			{
				eObj.setInverseScale( eDefObj.isInverseScale( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateFill( "fill",
				eObj,
				eObj.getFill( ),
				eRefObj == null ? null : eRefObj.getFill( ),
				eDefObj == null ? null : eDefObj.getFill( ) );
		int index_Dial_dialRegions = 0;
		for ( DialRegion element : eObj.getDialRegions( ) )
		{
			updateDialRegion( "dialRegions", eObj, element, ( eRefObj != null && eRefObj.getDialRegions( ).size( ) > 0 ) ? eRefObj.getDialRegions( ).get( 0 ) : null, ( eDefObj != null && eDefObj.getDialRegions( ).size( ) > 0 ) ? eDefObj.getDialRegions( ).get( 0 ) : null ); //$NON-NLS-1$ 
			index_Dial_dialRegions++;
		}

		updateGrid( "majorGrid",
				eObj,
				eObj.getMajorGrid( ),
				eRefObj == null ? null : eRefObj.getMajorGrid( ),
				eDefObj == null ? null : eDefObj.getMajorGrid( ) );
		updateGrid( "minorGrid",
				eObj,
				eObj.getMinorGrid( ),
				eRefObj == null ? null : eRefObj.getMinorGrid( ),
				eDefObj == null ? null : eDefObj.getMinorGrid( ) );
		updateScale( "scale",
				eObj,
				eObj.getScale( ),
				eRefObj == null ? null : eRefObj.getScale( ),
				eDefObj == null ? null : eDefObj.getScale( ) );
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );

	}

	/**
	 * Updates chart element DialRegion.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateDialRegion( String name, EObject eParentObj,
			DialRegion eObj, DialRegion eRefObj, DialRegion eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetLabelAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eRefObj.getLabelAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eDefObj.getLabelAnchor( ) );
			}
		}

		if ( !eObj.isSetInnerRadius( ) )
		{
			if ( eRefObj != null && eRefObj.isSetInnerRadius( ) )
			{
				eObj.setInnerRadius( eRefObj.getInnerRadius( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetInnerRadius( ) )
			{
				eObj.setInnerRadius( eDefObj.getInnerRadius( ) );
			}
		}

		if ( !eObj.isSetOuterRadius( ) )
		{
			if ( eRefObj != null && eRefObj.isSetOuterRadius( ) )
			{
				eObj.setOuterRadius( eRefObj.getOuterRadius( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetOuterRadius( ) )
			{
				eObj.setOuterRadius( eDefObj.getOuterRadius( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "fill",
				eObj,
				eObj.getFill( ),
				eRefObj == null ? null : eRefObj.getFill( ),
				eDefObj == null ? null : eDefObj.getFill( ) );
		if ( eRefObj != null && eRefObj.getStartValue( ) != null )
		{
			eObj.setStartValue( eRefObj.getStartValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getStartValue( ) != null )
		{
			eObj.setStartValue( eDefObj.getStartValue( ) );
		}
		if ( eRefObj != null && eRefObj.getEndValue( ) != null )
		{
			eObj.setEndValue( eRefObj.getEndValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getEndValue( ) != null )
		{
			eObj.setEndValue( eDefObj.getEndValue( ) );
		}
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element Grid.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateGrid( String name, EObject eParentObj, Grid eObj,
			Grid eRefObj, Grid eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetTickStyle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTickStyle( ) )
			{
				eObj.setTickStyle( eRefObj.getTickStyle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTickStyle( ) )
			{
				eObj.setTickStyle( eDefObj.getTickStyle( ) );
			}
		}

		if ( !eObj.isSetTickSize( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTickSize( ) )
			{
				eObj.setTickSize( eRefObj.getTickSize( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTickSize( ) )
			{
				eObj.setTickSize( eDefObj.getTickSize( ) );
			}
		}

		if ( !eObj.isSetTickCount( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTickCount( ) )
			{
				eObj.setTickCount( eRefObj.getTickCount( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTickCount( ) )
			{
				eObj.setTickCount( eDefObj.getTickCount( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		updateLineAttributes( "tickAttributes",
				eObj,
				eObj.getTickAttributes( ),
				eRefObj == null ? null : eRefObj.getTickAttributes( ),
				eDefObj == null ? null : eDefObj.getTickAttributes( ) );

	}

	/**
	 * Updates chart element Label.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateLabel( String name, EObject eParentObj, Label eObj,
			Label eRefObj, Label eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetEllipsis( ) )
		{
			if ( eRefObj != null && eRefObj.isSetEllipsis( ) )
			{
				eObj.setEllipsis( eRefObj.getEllipsis( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetEllipsis( ) )
			{
				eObj.setEllipsis( eDefObj.getEllipsis( ) );
			}
		}

		// list attributes

		// references
		updateText( "caption",
				eObj,
				eObj.getCaption( ),
				eRefObj == null ? null : eRefObj.getCaption( ),
				eDefObj == null ? null : eDefObj.getCaption( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );

	}

	/**
	 * Updates chart element MarkerLine.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateMarkerLine( String name, EObject eParentObj,
			MarkerLine eObj, MarkerLine eRefObj, MarkerLine eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetLabelAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eRefObj.getLabelAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eDefObj.getLabelAnchor( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );
		if ( eRefObj != null && eRefObj.getValue( ) != null )
		{
			eObj.setValue( eRefObj.getValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getValue( ) != null )
		{
			eObj.setValue( eDefObj.getValue( ) );
		}
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element MarkerRange.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateMarkerRange( String name, EObject eParentObj,
			MarkerRange eObj, MarkerRange eRefObj, MarkerRange eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eObj instanceof DialRegion )
		{
			updateDialRegion( name,
					eParentObj,
					(DialRegion) eObj,
					(DialRegion) eRefObj,
					eDefObj instanceof DialRegion ? (DialRegion) eDefObj : null );
		}
		else
		{
			updateMarkerRangeImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element MarkerRange.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateMarkerRangeImpl( String name, EObject eParentObj,
			MarkerRange eObj, MarkerRange eRefObj, MarkerRange eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetLabelAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eRefObj.getLabelAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelAnchor( ) )
			{
				eObj.setLabelAnchor( eDefObj.getLabelAnchor( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "fill",
				eObj,
				eObj.getFill( ),
				eRefObj == null ? null : eRefObj.getFill( ),
				eDefObj == null ? null : eDefObj.getFill( ) );
		if ( eRefObj != null && eRefObj.getStartValue( ) != null )
		{
			eObj.setStartValue( eRefObj.getStartValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getStartValue( ) != null )
		{
			eObj.setStartValue( eDefObj.getStartValue( ) );
		}
		if ( eRefObj != null && eRefObj.getEndValue( ) != null )
		{
			eObj.setEndValue( eRefObj.getEndValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getEndValue( ) != null )
		{
			eObj.setEndValue( eDefObj.getEndValue( ) );
		}
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element Needle.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateNeedle( String name, EObject eParentObj, Needle eObj,
			Needle eRefObj, Needle eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetDecorator( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDecorator( ) )
			{
				eObj.setDecorator( eRefObj.getDecorator( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDecorator( ) )
			{
				eObj.setDecorator( eDefObj.getDecorator( ) );
			}
		}

		// list attributes

		// references
		updateLineAttributes( "lineAttributes",
				eObj,
				eObj.getLineAttributes( ),
				eRefObj == null ? null : eRefObj.getLineAttributes( ),
				eDefObj == null ? null : eDefObj.getLineAttributes( ) );

	}

	/**
	 * Updates chart element Scale.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateScale( String name, EObject eParentObj, Scale eObj,
			Scale eRefObj, Scale eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetStep( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStep( ) )
			{
				eObj.setStep( eRefObj.getStep( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStep( ) )
			{
				eObj.setStep( eDefObj.getStep( ) );
			}
		}

		if ( !eObj.isSetUnit( ) )
		{
			if ( eRefObj != null && eRefObj.isSetUnit( ) )
			{
				eObj.setUnit( eRefObj.getUnit( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetUnit( ) )
			{
				eObj.setUnit( eDefObj.getUnit( ) );
			}
		}

		if ( !eObj.isSetMinorGridsPerUnit( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMinorGridsPerUnit( ) )
			{
				eObj.setMinorGridsPerUnit( eRefObj.getMinorGridsPerUnit( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMinorGridsPerUnit( ) )
			{
				eObj.setMinorGridsPerUnit( eDefObj.getMinorGridsPerUnit( ) );
			}
		}

		if ( !eObj.isSetStepNumber( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStepNumber( ) )
			{
				eObj.setStepNumber( eRefObj.getStepNumber( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStepNumber( ) )
			{
				eObj.setStepNumber( eDefObj.getStepNumber( ) );
			}
		}

		if ( !eObj.isSetShowOutside( ) )
		{
			if ( eRefObj != null && eRefObj.isSetShowOutside( ) )
			{
				eObj.setShowOutside( eRefObj.isShowOutside( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetShowOutside( ) )
			{
				eObj.setShowOutside( eDefObj.isShowOutside( ) );
			}
		}

		if ( !eObj.isSetTickBetweenCategories( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTickBetweenCategories( ) )
			{
				eObj.setTickBetweenCategories( eRefObj.isTickBetweenCategories( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTickBetweenCategories( ) )
			{
				eObj.setTickBetweenCategories( eDefObj.isTickBetweenCategories( ) );
			}
		}

		if ( !eObj.isSetAutoExpand( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAutoExpand( ) )
			{
				eObj.setAutoExpand( eRefObj.isAutoExpand( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAutoExpand( ) )
			{
				eObj.setAutoExpand( eDefObj.isAutoExpand( ) );
			}
		}

		if ( !eObj.isSetMajorGridsStepNumber( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMajorGridsStepNumber( ) )
			{
				eObj.setMajorGridsStepNumber( eRefObj.getMajorGridsStepNumber( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMajorGridsStepNumber( ) )
			{
				eObj.setMajorGridsStepNumber( eDefObj.getMajorGridsStepNumber( ) );
			}
		}

		if ( !eObj.isSetFactor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetFactor( ) )
			{
				eObj.setFactor( eRefObj.getFactor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetFactor( ) )
			{
				eObj.setFactor( eDefObj.getFactor( ) );
			}
		}

		// list attributes

		// references
		if ( eRefObj != null && eRefObj.getMin( ) != null )
		{
			eObj.setMin( eRefObj.getMin( ) );
		}
		else if ( eDefObj != null && eDefObj.getMin( ) != null )
		{
			eObj.setMin( eDefObj.getMin( ) );
		}
		if ( eRefObj != null && eRefObj.getMax( ) != null )
		{
			eObj.setMax( eRefObj.getMax( ) );
		}
		else if ( eDefObj != null && eDefObj.getMax( ) != null )
		{
			eObj.setMax( eDefObj.getMax( ) );
		}

	}

	/**
	 * Updates chart element Series.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        map of series objects.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateSeries( String name, EObject eParentObj, Series eObj,
			Map<String, Series> eRefObj, Series eDefObj )
	{
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}
		if ( ChartDynamicExtension.isExtended( eObj ) )
		{
			EObject seriesDefault = extUpdater.getDefault( ComponentPackage.eINSTANCE.getSeries( ),
					name,
					eObj );
			String key = getSeriesID( eObj );
			extUpdater.update( ComponentPackage.eINSTANCE.getSeries( ),
					name,
					eParentObj,
					eObj,
					eRefObj.get( key ),
					seriesDefault );
			return;
		}

		if ( eObj instanceof BubbleSeries )
		{
			updateBubbleSeries( name,
					eParentObj,
					(BubbleSeries) eObj,
					(BubbleSeries) eRefObj.get( "BubbleSeries" ),
					DefaultValueProvider.defBubbleSeries( ) );
		}
		else if ( eObj instanceof DifferenceSeries )
		{
			updateDifferenceSeries( name,
					eParentObj,
					(DifferenceSeries) eObj,
					(DifferenceSeries) eRefObj.get( "DifferenceSeries" ),
					DefaultValueProvider.defDifferenceSeries( ) );
		}
		else if ( eObj instanceof AreaSeries )
		{
			updateAreaSeries( name,
					eParentObj,
					(AreaSeries) eObj,
					(AreaSeries) eRefObj.get( "AreaSeries" ),
					DefaultValueProvider.defAreaSeries( ) );
		}
		else if ( eObj instanceof ScatterSeries )
		{
			updateScatterSeries( name,
					eParentObj,
					(ScatterSeries) eObj,
					(ScatterSeries) eRefObj.get( "ScatterSeries" ),
					DefaultValueProvider.defScatterSeries( ) );
		}
		else if ( eObj instanceof BarSeries )
		{
			updateBarSeries( name,
					eParentObj,
					(BarSeries) eObj,
					(BarSeries) eRefObj.get( "BarSeries" ),
					DefaultValueProvider.defBarSeries( ) );
		}
		else if ( eObj instanceof DialSeries )
		{
			updateDialSeries( name,
					eParentObj,
					(DialSeries) eObj,
					(DialSeries) eRefObj.get( "DialSeries" ),
					DefaultValueProvider.defDialSeries( ) );
		}
		else if ( eObj instanceof GanttSeries )
		{
			updateGanttSeries( name,
					eParentObj,
					(GanttSeries) eObj,
					(GanttSeries) eRefObj.get( "GanttSeries" ),
					DefaultValueProvider.defGanttSeries( ) );
		}
		else if ( eObj instanceof LineSeries )
		{
			updateLineSeries( name,
					eParentObj,
					(LineSeries) eObj,
					(LineSeries) eRefObj.get( "LineSeries" ),
					DefaultValueProvider.defLineSeries( ) );
		}
		else if ( eObj instanceof PieSeries )
		{
			updatePieSeries( name,
					eParentObj,
					(PieSeries) eObj,
					(PieSeries) eRefObj.get( "PieSeries" ),
					DefaultValueProvider.defPieSeries( ) );
		}
		else if ( eObj instanceof StockSeries )
		{
			updateStockSeries( name,
					eParentObj,
					(StockSeries) eObj,
					(StockSeries) eRefObj.get( "StockSeries" ),
					DefaultValueProvider.defStockSeries( ) );
		}
		else
		{
			updateSeriesImpl( name,
					eParentObj,
					eObj,
					eRefObj.size( ) > 0 ? eRefObj.get( 0 ) : null,
					eDefObj );
		}
	}

	/**
	 * Updates chart element Series.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateSeriesImpl( String name, EObject eParentObj,
			Series eObj, Series eRefObj, Series eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( eObj.getSeriesIdentifier( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eRefObj.getSeriesIdentifier( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeriesIdentifier( ) != null )
			{
				eObj.setSeriesIdentifier( eDefObj.getSeriesIdentifier( ) );
			}
		}

		if ( !eObj.isSetLabelPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eRefObj.getLabelPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLabelPosition( ) )
			{
				eObj.setLabelPosition( eDefObj.getLabelPosition( ) );
			}
		}

		if ( !eObj.isSetStacked( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStacked( ) )
			{
				eObj.setStacked( eRefObj.isStacked( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStacked( ) )
			{
				eObj.setStacked( eDefObj.isStacked( ) );
			}
		}

		if ( !eObj.isSetTranslucent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eRefObj.isTranslucent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTranslucent( ) )
			{
				eObj.setTranslucent( eDefObj.isTranslucent( ) );
			}
		}

		// list attributes

		// references
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );
		updateDataPoint( "dataPoint",
				eObj,
				eObj.getDataPoint( ),
				eRefObj == null ? null : eRefObj.getDataPoint( ),
				eDefObj == null ? null : eDefObj.getDataPoint( ) );
		updateCurveFitting( "curveFitting",
				eObj,
				eObj.getCurveFitting( ),
				eRefObj == null ? null : eRefObj.getCurveFitting( ),
				eDefObj == null ? null : eDefObj.getCurveFitting( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element SeriesDefinition.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 * @param axisIndex
	 *        index of axis.
	 * @param seriesDefIndex
	 *        index of series definition.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateSeriesDefinition( String name, EObject eParentObj,
			SeriesDefinition eObj, SeriesDefinition eRefObj,
			SeriesDefinition eDefObj, int axisIndex, int seriesDefIndex )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetZOrder( ) )
		{
			if ( eRefObj != null && eRefObj.isSetZOrder( ) )
			{
				eObj.setZOrder( eRefObj.getZOrder( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetZOrder( ) )
			{
				eObj.setZOrder( eDefObj.getZOrder( ) );
			}
		}

		// list attributes

		// references
		updatePalette( "seriesPalette",
				eObj,
				eObj.getSeriesPalette( ),
				eRefObj == null ? null : eRefObj.getSeriesPalette( ),
				eDefObj == null ? null : eDefObj.getSeriesPalette( ),
				axisIndex,
				seriesDefIndex );
		int orthSeriesDefIndex = 0;
		for ( SeriesDefinition element : eObj.getSeriesDefinitions( ) )
		{
			updateSeriesDefinition( "seriesDefinitions", eObj, element, ( eRefObj != null && eRefObj.getSeriesDefinitions( ).size( ) > 0 ) ? eRefObj.getSeriesDefinitions( ).get( 0 ) : null, DefaultValueProvider.defSeriesDefinition( orthSeriesDefIndex ), 0, orthSeriesDefIndex ); //$NON-NLS-1$ 
			orthSeriesDefIndex++;
		}

		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );
		Map<String, Series> seriesRefMap = new HashMap<String, Series>( );;
		if ( eRefObj != null )
		{
			for ( Series series : eRefObj.getSeries( ) )
			{
				seriesRefMap.put( getSeriesID( series ), series );
			}
		}
		for ( Series element : eObj.getSeries( ) )
		{
			updateSeries( "series", eObj, element, seriesRefMap, DefaultValueProvider.defSeries( ) ); //$NON-NLS-1$ 
		}

	}

	/**
	 * Updates chart element Block.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateBlock( String name, EObject eParentObj, Block eObj,
			Block eRefObj, Block eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		if ( eObj instanceof TitleBlock )
		{
			updateTitleBlock( name,
					eParentObj,
					(TitleBlock) eObj,
					(TitleBlock) eRefObj,
					DefaultValueProvider.defTitleBlock( ) );
		}
		else if ( eObj instanceof LabelBlock )
		{
			updateLabelBlock( name,
					eParentObj,
					(LabelBlock) eObj,
					(LabelBlock) eRefObj,
					eDefObj instanceof LabelBlock ? (LabelBlock) eDefObj : null );
		}
		else if ( eObj instanceof Legend )
		{
			updateLegend( name,
					eParentObj,
					(Legend) eObj,
					(Legend) eRefObj,
					DefaultValueProvider.defLegend( ) );
		}
		else if ( eObj instanceof Plot )
		{
			updatePlot( name,
					eParentObj,
					(Plot) eObj,
					(Plot) eRefObj,
					DefaultValueProvider.defPlot( ) );
		}
		else
		{
			updateBlockImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element Block.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateBlockImpl( String name, EObject eParentObj,
			Block eObj, Block eRefObj, Block eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eRefObj.getAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eDefObj.getAnchor( ) );
			}
		}

		if ( !eObj.isSetStretch( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStretch( ) )
			{
				eObj.setStretch( eRefObj.getStretch( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStretch( ) )
			{
				eObj.setStretch( eDefObj.getStretch( ) );
			}
		}

		if ( !eObj.isSetRow( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRow( ) )
			{
				eObj.setRow( eRefObj.getRow( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRow( ) )
			{
				eObj.setRow( eDefObj.getRow( ) );
			}
		}

		if ( !eObj.isSetColumn( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumn( ) )
			{
				eObj.setColumn( eRefObj.getColumn( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumn( ) )
			{
				eObj.setColumn( eDefObj.getColumn( ) );
			}
		}

		if ( !eObj.isSetRowspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eRefObj.getRowspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eDefObj.getRowspan( ) );
			}
		}

		if ( !eObj.isSetColumnspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eRefObj.getColumnspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eDefObj.getColumnspan( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetWidthHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eRefObj.getWidthHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eDefObj.getWidthHint( ) );
			}
		}

		if ( !eObj.isSetHeightHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eRefObj.getHeightHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eDefObj.getHeightHint( ) );
			}
		}

		// list attributes

		// references
		int index_Block_children = 0;
		for ( Block element : eObj.getChildren( ) )
		{
			updateBlock( "children", eObj, element, ( eRefObj == null || eRefObj.getChildren( ).size( ) <= index_Block_children ) ? null : eRefObj.getChildren( ).get( index_Block_children ), ( eDefObj == null || eDefObj.getChildren( ).size( ) <= index_Block_children ) ? null : eDefObj.getChildren( ).get( index_Block_children ) ); //$NON-NLS-1$ 
			index_Block_children++;
		}

		updateBounds( "bounds",
				eObj,
				eObj.getBounds( ),
				eRefObj == null ? null : eRefObj.getBounds( ),
				eDefObj == null ? null : eDefObj.getBounds( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );
		updateSize( "minSize",
				eObj,
				eObj.getMinSize( ),
				eRefObj == null ? null : eRefObj.getMinSize( ),
				eDefObj == null ? null : eDefObj.getMinSize( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );

	}

	/**
	 * Updates chart element ClientArea.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateClientArea( String name, EObject eParentObj,
			ClientArea eObj, ClientArea eRefObj, ClientArea eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		// list attributes

		// references
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateColorDefinition( "shadowColor",
				eObj,
				eObj.getShadowColor( ),
				eRefObj == null ? null : eRefObj.getShadowColor( ),
				eDefObj == null ? null : eDefObj.getShadowColor( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );

	}

	/**
	 * Updates chart element LabelBlock.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateLabelBlock( String name, EObject eParentObj,
			LabelBlock eObj, LabelBlock eRefObj, LabelBlock eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		if ( eObj instanceof TitleBlock )
		{
			updateTitleBlock( name,
					eParentObj,
					(TitleBlock) eObj,
					(TitleBlock) eRefObj,
					DefaultValueProvider.defTitleBlock( ) );
		}
		else
		{
			updateLabelBlockImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element LabelBlock.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateLabelBlockImpl( String name, EObject eParentObj,
			LabelBlock eObj, LabelBlock eRefObj, LabelBlock eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eRefObj.getAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eDefObj.getAnchor( ) );
			}
		}

		if ( !eObj.isSetStretch( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStretch( ) )
			{
				eObj.setStretch( eRefObj.getStretch( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStretch( ) )
			{
				eObj.setStretch( eDefObj.getStretch( ) );
			}
		}

		if ( !eObj.isSetRow( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRow( ) )
			{
				eObj.setRow( eRefObj.getRow( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRow( ) )
			{
				eObj.setRow( eDefObj.getRow( ) );
			}
		}

		if ( !eObj.isSetColumn( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumn( ) )
			{
				eObj.setColumn( eRefObj.getColumn( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumn( ) )
			{
				eObj.setColumn( eDefObj.getColumn( ) );
			}
		}

		if ( !eObj.isSetRowspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eRefObj.getRowspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eDefObj.getRowspan( ) );
			}
		}

		if ( !eObj.isSetColumnspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eRefObj.getColumnspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eDefObj.getColumnspan( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetWidthHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eRefObj.getWidthHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eDefObj.getWidthHint( ) );
			}
		}

		if ( !eObj.isSetHeightHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eRefObj.getHeightHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eDefObj.getHeightHint( ) );
			}
		}

		// list attributes

		// references
		int index_LabelBlock_children = 0;
		for ( Block element : eObj.getChildren( ) )
		{
			updateBlock( "children", eObj, element, ( eRefObj == null || eRefObj.getChildren( ).size( ) <= index_LabelBlock_children ) ? null : eRefObj.getChildren( ).get( index_LabelBlock_children ), ( eDefObj == null || eDefObj.getChildren( ).size( ) <= index_LabelBlock_children ) ? null : eDefObj.getChildren( ).get( index_LabelBlock_children ) ); //$NON-NLS-1$ 
			index_LabelBlock_children++;
		}

		updateBounds( "bounds",
				eObj,
				eObj.getBounds( ),
				eRefObj == null ? null : eRefObj.getBounds( ),
				eDefObj == null ? null : eDefObj.getBounds( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );
		updateSize( "minSize",
				eObj,
				eObj.getMinSize( ),
				eRefObj == null ? null : eRefObj.getMinSize( ),
				eDefObj == null ? null : eDefObj.getMinSize( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );

	}

	/**
	 * Updates chart element Legend.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateLegend( String name, EObject eParentObj, Legend eObj,
			Legend eRefObj, Legend eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eRefObj.getAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eDefObj.getAnchor( ) );
			}
		}

		if ( !eObj.isSetStretch( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStretch( ) )
			{
				eObj.setStretch( eRefObj.getStretch( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStretch( ) )
			{
				eObj.setStretch( eDefObj.getStretch( ) );
			}
		}

		if ( !eObj.isSetRow( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRow( ) )
			{
				eObj.setRow( eRefObj.getRow( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRow( ) )
			{
				eObj.setRow( eDefObj.getRow( ) );
			}
		}

		if ( !eObj.isSetColumn( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumn( ) )
			{
				eObj.setColumn( eRefObj.getColumn( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumn( ) )
			{
				eObj.setColumn( eDefObj.getColumn( ) );
			}
		}

		if ( !eObj.isSetRowspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eRefObj.getRowspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eDefObj.getRowspan( ) );
			}
		}

		if ( !eObj.isSetColumnspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eRefObj.getColumnspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eDefObj.getColumnspan( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetWidthHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eRefObj.getWidthHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eDefObj.getWidthHint( ) );
			}
		}

		if ( !eObj.isSetHeightHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eRefObj.getHeightHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eDefObj.getHeightHint( ) );
			}
		}

		if ( !eObj.isSetHorizontalSpacing( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHorizontalSpacing( ) )
			{
				eObj.setHorizontalSpacing( eRefObj.getHorizontalSpacing( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHorizontalSpacing( ) )
			{
				eObj.setHorizontalSpacing( eDefObj.getHorizontalSpacing( ) );
			}
		}

		if ( !eObj.isSetVerticalSpacing( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVerticalSpacing( ) )
			{
				eObj.setVerticalSpacing( eRefObj.getVerticalSpacing( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVerticalSpacing( ) )
			{
				eObj.setVerticalSpacing( eDefObj.getVerticalSpacing( ) );
			}
		}

		if ( !eObj.isSetOrientation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eRefObj.getOrientation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetOrientation( ) )
			{
				eObj.setOrientation( eDefObj.getOrientation( ) );
			}
		}

		if ( !eObj.isSetDirection( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDirection( ) )
			{
				eObj.setDirection( eRefObj.getDirection( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDirection( ) )
			{
				eObj.setDirection( eDefObj.getDirection( ) );
			}
		}

		if ( !eObj.isSetPosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetPosition( ) )
			{
				eObj.setPosition( eRefObj.getPosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetPosition( ) )
			{
				eObj.setPosition( eDefObj.getPosition( ) );
			}
		}

		if ( !eObj.isSetItemType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetItemType( ) )
			{
				eObj.setItemType( eRefObj.getItemType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetItemType( ) )
			{
				eObj.setItemType( eDefObj.getItemType( ) );
			}
		}

		if ( !eObj.isSetTitlePosition( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eRefObj.getTitlePosition( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTitlePosition( ) )
			{
				eObj.setTitlePosition( eDefObj.getTitlePosition( ) );
			}
		}

		if ( !eObj.isSetShowValue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetShowValue( ) )
			{
				eObj.setShowValue( eRefObj.isShowValue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetShowValue( ) )
			{
				eObj.setShowValue( eDefObj.isShowValue( ) );
			}
		}

		if ( !eObj.isSetShowPercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetShowPercent( ) )
			{
				eObj.setShowPercent( eRefObj.isShowPercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetShowPercent( ) )
			{
				eObj.setShowPercent( eDefObj.isShowPercent( ) );
			}
		}

		if ( !eObj.isSetShowTotal( ) )
		{
			if ( eRefObj != null && eRefObj.isSetShowTotal( ) )
			{
				eObj.setShowTotal( eRefObj.isShowTotal( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetShowTotal( ) )
			{
				eObj.setShowTotal( eDefObj.isShowTotal( ) );
			}
		}

		if ( !eObj.isSetWrappingSize( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWrappingSize( ) )
			{
				eObj.setWrappingSize( eRefObj.getWrappingSize( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWrappingSize( ) )
			{
				eObj.setWrappingSize( eDefObj.getWrappingSize( ) );
			}
		}

		if ( !eObj.isSetMaxPercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetMaxPercent( ) )
			{
				eObj.setMaxPercent( eRefObj.getMaxPercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetMaxPercent( ) )
			{
				eObj.setMaxPercent( eDefObj.getMaxPercent( ) );
			}
		}

		if ( !eObj.isSetTitlePercent( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTitlePercent( ) )
			{
				eObj.setTitlePercent( eRefObj.getTitlePercent( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTitlePercent( ) )
			{
				eObj.setTitlePercent( eDefObj.getTitlePercent( ) );
			}
		}

		if ( !eObj.isSetEllipsis( ) )
		{
			if ( eRefObj != null && eRefObj.isSetEllipsis( ) )
			{
				eObj.setEllipsis( eRefObj.getEllipsis( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetEllipsis( ) )
			{
				eObj.setEllipsis( eDefObj.getEllipsis( ) );
			}
		}

		// list attributes

		// references
		int index_Legend_children = 0;
		for ( Block element : eObj.getChildren( ) )
		{
			updateBlock( "children", eObj, element, ( eRefObj == null || eRefObj.getChildren( ).size( ) <= index_Legend_children ) ? null : eRefObj.getChildren( ).get( index_Legend_children ), ( eDefObj == null || eDefObj.getChildren( ).size( ) <= index_Legend_children ) ? null : eDefObj.getChildren( ).get( index_Legend_children ) ); //$NON-NLS-1$ 
			index_Legend_children++;
		}

		updateBounds( "bounds",
				eObj,
				eObj.getBounds( ),
				eRefObj == null ? null : eRefObj.getBounds( ),
				eDefObj == null ? null : eDefObj.getBounds( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );
		updateSize( "minSize",
				eObj,
				eObj.getMinSize( ),
				eRefObj == null ? null : eRefObj.getMinSize( ),
				eDefObj == null ? null : eDefObj.getMinSize( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateClientArea( "clientArea",
				eObj,
				eObj.getClientArea( ),
				eRefObj == null ? null : eRefObj.getClientArea( ),
				eDefObj == null ? null : eDefObj.getClientArea( ) );
		updateText( "text",
				eObj,
				eObj.getText( ),
				eRefObj == null ? null : eRefObj.getText( ),
				eDefObj == null ? null : eDefObj.getText( ) );
		updateLineAttributes( "separator",
				eObj,
				eObj.getSeparator( ),
				eRefObj == null ? null : eRefObj.getSeparator( ),
				eDefObj == null ? null : eDefObj.getSeparator( ) );
		updateLabel( "title",
				eObj,
				eObj.getTitle( ),
				eRefObj == null ? null : eRefObj.getTitle( ),
				eDefObj == null ? null : eDefObj.getTitle( ) );
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );

	}

	/**
	 * Updates chart element Plot.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updatePlot( String name, EObject eParentObj, Plot eObj,
			Plot eRefObj, Plot eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eRefObj.getAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eDefObj.getAnchor( ) );
			}
		}

		if ( !eObj.isSetStretch( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStretch( ) )
			{
				eObj.setStretch( eRefObj.getStretch( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStretch( ) )
			{
				eObj.setStretch( eDefObj.getStretch( ) );
			}
		}

		if ( !eObj.isSetRow( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRow( ) )
			{
				eObj.setRow( eRefObj.getRow( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRow( ) )
			{
				eObj.setRow( eDefObj.getRow( ) );
			}
		}

		if ( !eObj.isSetColumn( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumn( ) )
			{
				eObj.setColumn( eRefObj.getColumn( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumn( ) )
			{
				eObj.setColumn( eDefObj.getColumn( ) );
			}
		}

		if ( !eObj.isSetRowspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eRefObj.getRowspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eDefObj.getRowspan( ) );
			}
		}

		if ( !eObj.isSetColumnspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eRefObj.getColumnspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eDefObj.getColumnspan( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetWidthHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eRefObj.getWidthHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eDefObj.getWidthHint( ) );
			}
		}

		if ( !eObj.isSetHeightHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eRefObj.getHeightHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eDefObj.getHeightHint( ) );
			}
		}

		if ( !eObj.isSetHorizontalSpacing( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHorizontalSpacing( ) )
			{
				eObj.setHorizontalSpacing( eRefObj.getHorizontalSpacing( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHorizontalSpacing( ) )
			{
				eObj.setHorizontalSpacing( eDefObj.getHorizontalSpacing( ) );
			}
		}

		if ( !eObj.isSetVerticalSpacing( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVerticalSpacing( ) )
			{
				eObj.setVerticalSpacing( eRefObj.getVerticalSpacing( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVerticalSpacing( ) )
			{
				eObj.setVerticalSpacing( eDefObj.getVerticalSpacing( ) );
			}
		}

		// list attributes

		// references
		int index_Plot_children = 0;
		for ( Block element : eObj.getChildren( ) )
		{
			updateBlock( "children", eObj, element, ( eRefObj == null || eRefObj.getChildren( ).size( ) <= index_Plot_children ) ? null : eRefObj.getChildren( ).get( index_Plot_children ), ( eDefObj == null || eDefObj.getChildren( ).size( ) <= index_Plot_children ) ? null : eDefObj.getChildren( ).get( index_Plot_children ) ); //$NON-NLS-1$ 
			index_Plot_children++;
		}

		updateBounds( "bounds",
				eObj,
				eObj.getBounds( ),
				eRefObj == null ? null : eRefObj.getBounds( ),
				eDefObj == null ? null : eDefObj.getBounds( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );
		updateSize( "minSize",
				eObj,
				eObj.getMinSize( ),
				eRefObj == null ? null : eRefObj.getMinSize( ),
				eDefObj == null ? null : eDefObj.getMinSize( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateClientArea( "clientArea",
				eObj,
				eObj.getClientArea( ),
				eRefObj == null ? null : eRefObj.getClientArea( ),
				eDefObj == null ? null : eDefObj.getClientArea( ) );

	}

	/**
	 * Updates chart element TitleBlock.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateTitleBlock( String name, EObject eParentObj,
			TitleBlock eObj, TitleBlock eRefObj, TitleBlock eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetAnchor( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eRefObj.getAnchor( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAnchor( ) )
			{
				eObj.setAnchor( eDefObj.getAnchor( ) );
			}
		}

		if ( !eObj.isSetStretch( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStretch( ) )
			{
				eObj.setStretch( eRefObj.getStretch( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStretch( ) )
			{
				eObj.setStretch( eDefObj.getStretch( ) );
			}
		}

		if ( !eObj.isSetRow( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRow( ) )
			{
				eObj.setRow( eRefObj.getRow( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRow( ) )
			{
				eObj.setRow( eDefObj.getRow( ) );
			}
		}

		if ( !eObj.isSetColumn( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumn( ) )
			{
				eObj.setColumn( eRefObj.getColumn( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumn( ) )
			{
				eObj.setColumn( eDefObj.getColumn( ) );
			}
		}

		if ( !eObj.isSetRowspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eRefObj.getRowspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRowspan( ) )
			{
				eObj.setRowspan( eDefObj.getRowspan( ) );
			}
		}

		if ( !eObj.isSetColumnspan( ) )
		{
			if ( eRefObj != null && eRefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eRefObj.getColumnspan( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetColumnspan( ) )
			{
				eObj.setColumnspan( eDefObj.getColumnspan( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		if ( !eObj.isSetWidthHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eRefObj.getWidthHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidthHint( ) )
			{
				eObj.setWidthHint( eDefObj.getWidthHint( ) );
			}
		}

		if ( !eObj.isSetHeightHint( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eRefObj.getHeightHint( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeightHint( ) )
			{
				eObj.setHeightHint( eDefObj.getHeightHint( ) );
			}
		}

		if ( !eObj.isSetAuto( ) )
		{
			if ( eRefObj != null && eRefObj.isSetAuto( ) )
			{
				eObj.setAuto( eRefObj.isAuto( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetAuto( ) )
			{
				eObj.setAuto( eDefObj.isAuto( ) );
			}
		}

		// list attributes

		// references
		int index_TitleBlock_children = 0;
		for ( Block element : eObj.getChildren( ) )
		{
			updateBlock( "children", eObj, element, ( eRefObj == null || eRefObj.getChildren( ).size( ) <= index_TitleBlock_children ) ? null : eRefObj.getChildren( ).get( index_TitleBlock_children ), ( eDefObj == null || eDefObj.getChildren( ).size( ) <= index_TitleBlock_children ) ? null : eDefObj.getChildren( ).get( index_TitleBlock_children ) ); //$NON-NLS-1$ 
			index_TitleBlock_children++;
		}

		updateBounds( "bounds",
				eObj,
				eObj.getBounds( ),
				eRefObj == null ? null : eRefObj.getBounds( ),
				eDefObj == null ? null : eDefObj.getBounds( ) );
		updateInsets( "insets",
				eObj,
				eObj.getInsets( ),
				eRefObj == null ? null : eRefObj.getInsets( ),
				eDefObj == null ? null : eDefObj.getInsets( ) );
		updateSize( "minSize",
				eObj,
				eObj.getMinSize( ),
				eRefObj == null ? null : eRefObj.getMinSize( ),
				eDefObj == null ? null : eDefObj.getMinSize( ) );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );
		updateFill( "background",
				eObj,
				eObj.getBackground( ),
				eRefObj == null ? null : eRefObj.getBackground( ),
				eDefObj == null ? null : eDefObj.getBackground( ) );
		updateCursor( "cursor",
				eObj,
				eObj.getCursor( ),
				eRefObj == null ? null : eRefObj.getCursor( ),
				eDefObj == null ? null : eDefObj.getCursor( ) );
		updateLabel( "label",
				eObj,
				eObj.getLabel( ),
				eRefObj == null ? null : eRefObj.getLabel( ),
				eDefObj == null ? null : eDefObj.getLabel( ) );

	}

	/**
	 * Updates chart element Angle3D.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateAngle3D( String name, EObject eParentObj, Angle3D eObj,
			Angle3D eRefObj, Angle3D eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetXAngle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetXAngle( ) )
			{
				eObj.setXAngle( eRefObj.getXAngle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetXAngle( ) )
			{
				eObj.setXAngle( eDefObj.getXAngle( ) );
			}
		}

		if ( !eObj.isSetYAngle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetYAngle( ) )
			{
				eObj.setYAngle( eRefObj.getYAngle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetYAngle( ) )
			{
				eObj.setYAngle( eDefObj.getYAngle( ) );
			}
		}

		if ( !eObj.isSetZAngle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetZAngle( ) )
			{
				eObj.setZAngle( eRefObj.getZAngle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetZAngle( ) )
			{
				eObj.setZAngle( eDefObj.getZAngle( ) );
			}
		}

		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element AxisOrigin.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateAxisOrigin( String name, EObject eParentObj,
			AxisOrigin eObj, AxisOrigin eRefObj, AxisOrigin eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		// list attributes

		// references
		if ( eRefObj != null && eRefObj.getValue( ) != null )
		{
			eObj.setValue( eRefObj.getValue( ) );
		}
		else if ( eDefObj != null && eDefObj.getValue( ) != null )
		{
			eObj.setValue( eDefObj.getValue( ) );
		}

	}

	/**
	 * Updates chart element Bounds.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateBounds( String name, EObject eParentObj, Bounds eObj,
			Bounds eRefObj, Bounds eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetLeft( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLeft( ) )
			{
				eObj.setLeft( eRefObj.getLeft( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLeft( ) )
			{
				eObj.setLeft( eDefObj.getLeft( ) );
			}
		}

		if ( !eObj.isSetTop( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTop( ) )
			{
				eObj.setTop( eRefObj.getTop( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTop( ) )
			{
				eObj.setTop( eDefObj.getTop( ) );
			}
		}

		if ( !eObj.isSetWidth( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidth( ) )
			{
				eObj.setWidth( eRefObj.getWidth( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidth( ) )
			{
				eObj.setWidth( eDefObj.getWidth( ) );
			}
		}

		if ( !eObj.isSetHeight( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeight( ) )
			{
				eObj.setHeight( eRefObj.getHeight( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeight( ) )
			{
				eObj.setHeight( eDefObj.getHeight( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element ColorDefinition.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateColorDefinition( String name, EObject eParentObj,
			ColorDefinition eObj, ColorDefinition eRefObj,
			ColorDefinition eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( !eObj.isSetTransparency( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTransparency( ) )
			{
				eObj.setTransparency( eRefObj.getTransparency( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTransparency( ) )
			{
				eObj.setTransparency( eDefObj.getTransparency( ) );
			}
		}

		if ( !eObj.isSetRed( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRed( ) )
			{
				eObj.setRed( eRefObj.getRed( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRed( ) )
			{
				eObj.setRed( eDefObj.getRed( ) );
			}
		}

		if ( !eObj.isSetGreen( ) )
		{
			if ( eRefObj != null && eRefObj.isSetGreen( ) )
			{
				eObj.setGreen( eRefObj.getGreen( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetGreen( ) )
			{
				eObj.setGreen( eDefObj.getGreen( ) );
			}
		}

		if ( !eObj.isSetBlue( ) )
		{
			if ( eRefObj != null && eRefObj.isSetBlue( ) )
			{
				eObj.setBlue( eRefObj.getBlue( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetBlue( ) )
			{
				eObj.setBlue( eDefObj.getBlue( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Cursor.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateCursor( String name, EObject eParentObj, Cursor eObj,
			Cursor eRefObj, Cursor eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		// list attributes

		// references
		int index_Cursor_image = 0;
		for ( Image element : eObj.getImage( ) )
		{
			updateImage( "image", eObj, element, ( eRefObj == null || eRefObj.getImage( ).size( ) <= index_Cursor_image ) ? null : eRefObj.getImage( ).get( index_Cursor_image ), ( eDefObj == null || eDefObj.getImage( ).size( ) <= index_Cursor_image ) ? null : eDefObj.getImage( ).get( index_Cursor_image ) ); //$NON-NLS-1$ 
			index_Cursor_image++;
		}

	}

	/**
	 * Updates chart element DataPoint.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateDataPoint( String name, EObject eParentObj,
			DataPoint eObj, DataPoint eRefObj, DataPoint eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getPrefix( ) == null )
		{
			if ( eRefObj != null && eRefObj.getPrefix( ) != null )
			{
				eObj.setPrefix( eRefObj.getPrefix( ) );
			}
			else if ( eDefObj != null && eDefObj.getPrefix( ) != null )
			{
				eObj.setPrefix( eDefObj.getPrefix( ) );
			}
		}

		if ( eObj.getSuffix( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSuffix( ) != null )
			{
				eObj.setSuffix( eRefObj.getSuffix( ) );
			}
			else if ( eDefObj != null && eDefObj.getSuffix( ) != null )
			{
				eObj.setSuffix( eDefObj.getSuffix( ) );
			}
		}

		if ( eObj.getSeparator( ) == null )
		{
			if ( eRefObj != null && eRefObj.getSeparator( ) != null )
			{
				eObj.setSeparator( eRefObj.getSeparator( ) );
			}
			else if ( eDefObj != null && eDefObj.getSeparator( ) != null )
			{
				eObj.setSeparator( eDefObj.getSeparator( ) );
			}
		}

		// list attributes

		// references
		if ( eObj.getComponents( ).size( ) == 0 )
		{
			if ( eRefObj != null && eRefObj.getComponents( ).size( ) > 0 )
			{
				eObj.getComponents( )
						.addAll( ChartElementUtil.copyInstance( eRefObj.getComponents( ) ) );
			}
			else if ( eDefObj != null && eDefObj.getComponents( ).size( ) > 0 )
			{
				eObj.getComponents( )
						.addAll( ChartElementUtil.copyInstance( eDefObj.getComponents( ) ) );
			}
		}
		else
		{
			for ( DataPointComponent dpc : eObj.getComponents( ) )
			{
				DataPointComponentType type = dpc.getType( );
				DataPointComponent subRef = null;
				DataPointComponent subDef = null;
				if ( eRefObj != null )
				{
					for ( DataPointComponent dpcRef : eRefObj.getComponents( ) )
					{
						if ( type == dpcRef.getType( ) )
						{
							subRef = dpcRef;
							break;
						}
					}
				}
				if ( eDefObj != null )
				{
					for ( DataPointComponent dpcDef : eDefObj.getComponents( ) )
					{
						if ( type == dpcDef.getType( ) )
						{
							subDef = dpcDef;
							break;
						}
					}
				}
				updateDataPointComponent( "components", eObj, dpc, subRef, subDef ); //$NON-NLS-1$ 
			}
		}

	}

	/**
	 * Updates chart element DataPointComponent.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateDataPointComponent( String name, EObject eParentObj,
			DataPointComponent eObj, DataPointComponent eRefObj,
			DataPointComponent eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( !eObj.isSetOrthogonalType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetOrthogonalType( ) )
			{
				eObj.setOrthogonalType( eRefObj.getOrthogonalType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetOrthogonalType( ) )
			{
				eObj.setOrthogonalType( eDefObj.getOrthogonalType( ) );
			}
		}

		// list attributes

		// references
		updateFormatSpecifier( "formatSpecifier",
				eObj,
				eObj.getFormatSpecifier( ),
				eRefObj == null ? null : eRefObj.getFormatSpecifier( ),
				eDefObj == null ? null : eDefObj.getFormatSpecifier( ) );

	}

	/**
	 * Updates chart element EmbeddedImage.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateEmbeddedImage( String name, EObject eParentObj,
			EmbeddedImage eObj, EmbeddedImage eRefObj, EmbeddedImage eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getURL( ) == null )
		{
			if ( eRefObj != null && eRefObj.getURL( ) != null )
			{
				eObj.setURL( eRefObj.getURL( ) );
			}
			else if ( eDefObj != null && eDefObj.getURL( ) != null )
			{
				eObj.setURL( eDefObj.getURL( ) );
			}
		}

		if ( eObj.getData( ) == null )
		{
			if ( eRefObj != null && eRefObj.getData( ) != null )
			{
				eObj.setData( eRefObj.getData( ) );
			}
			else if ( eDefObj != null && eDefObj.getData( ) != null )
			{
				eObj.setData( eDefObj.getData( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element ExtendedProperty.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateExtendedProperty( String name, EObject eParentObj,
			ExtendedProperty eObj, ExtendedProperty eRefObj,
			ExtendedProperty eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getName( ) == null )
		{
			if ( eRefObj != null && eRefObj.getName( ) != null )
			{
				eObj.setName( eRefObj.getName( ) );
			}
			else if ( eDefObj != null && eDefObj.getName( ) != null )
			{
				eObj.setName( eDefObj.getName( ) );
			}
		}

		if ( eObj.getValue( ) == null )
		{
			if ( eRefObj != null && eRefObj.getValue( ) != null )
			{
				eObj.setValue( eRefObj.getValue( ) );
			}
			else if ( eDefObj != null && eDefObj.getValue( ) != null )
			{
				eObj.setValue( eDefObj.getValue( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Fill.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateFill( String name, EObject eParentObj, Fill eObj,
			Fill eRefObj, Fill eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eObj instanceof EmbeddedImage )
		{
			updateEmbeddedImage( name,
					eParentObj,
					(EmbeddedImage) eObj,
					(EmbeddedImage) eRefObj,
					eDefObj instanceof EmbeddedImage ? (EmbeddedImage) eDefObj
							: null );
		}
		else if ( eObj instanceof PatternImage )
		{
			updatePatternImage( name,
					eParentObj,
					(PatternImage) eObj,
					(PatternImage) eRefObj,
					eDefObj instanceof PatternImage ? (PatternImage) eDefObj
							: null );
		}
		else if ( eObj instanceof ColorDefinition )
		{
			updateColorDefinition( name,
					eParentObj,
					(ColorDefinition) eObj,
					(ColorDefinition) eRefObj,
					eDefObj instanceof ColorDefinition ? (ColorDefinition) eDefObj
							: null );
		}
		else if ( eObj instanceof Gradient )
		{
			updateGradient( name,
					eParentObj,
					(Gradient) eObj,
					(Gradient) eRefObj,
					eDefObj instanceof Gradient ? (Gradient) eDefObj : null );
		}
		else if ( eObj instanceof Image )
		{
			updateImage( name,
					eParentObj,
					(Image) eObj,
					(Image) eRefObj,
					eDefObj instanceof Image ? (Image) eDefObj : null );
		}
		else if ( eObj instanceof MultipleFill )
		{
			updateMultipleFill( name,
					eParentObj,
					(MultipleFill) eObj,
					(MultipleFill) eRefObj,
					eDefObj instanceof MultipleFill ? (MultipleFill) eDefObj
							: null );
		}
		else
		{
			updateFillImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element Fill.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateFillImpl( String name, EObject eParentObj, Fill eObj,
			Fill eRefObj, Fill eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element FontDefinition.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateFontDefinition( String name, EObject eParentObj,
			FontDefinition eObj, FontDefinition eRefObj, FontDefinition eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getName( ) == null )
		{
			if ( eRefObj != null && eRefObj.getName( ) != null )
			{
				eObj.setName( eRefObj.getName( ) );
			}
			else if ( eDefObj != null && eDefObj.getName( ) != null )
			{
				eObj.setName( eDefObj.getName( ) );
			}
		}

		if ( !eObj.isSetSize( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSize( ) )
			{
				eObj.setSize( eRefObj.getSize( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSize( ) )
			{
				eObj.setSize( eDefObj.getSize( ) );
			}
		}

		if ( !eObj.isSetBold( ) )
		{
			if ( eRefObj != null && eRefObj.isSetBold( ) )
			{
				eObj.setBold( eRefObj.isBold( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetBold( ) )
			{
				eObj.setBold( eDefObj.isBold( ) );
			}
		}

		if ( !eObj.isSetItalic( ) )
		{
			if ( eRefObj != null && eRefObj.isSetItalic( ) )
			{
				eObj.setItalic( eRefObj.isItalic( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetItalic( ) )
			{
				eObj.setItalic( eDefObj.isItalic( ) );
			}
		}

		if ( !eObj.isSetStrikethrough( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStrikethrough( ) )
			{
				eObj.setStrikethrough( eRefObj.isStrikethrough( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStrikethrough( ) )
			{
				eObj.setStrikethrough( eDefObj.isStrikethrough( ) );
			}
		}

		if ( !eObj.isSetUnderline( ) )
		{
			if ( eRefObj != null && eRefObj.isSetUnderline( ) )
			{
				eObj.setUnderline( eRefObj.isUnderline( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetUnderline( ) )
			{
				eObj.setUnderline( eDefObj.isUnderline( ) );
			}
		}

		if ( !eObj.isSetWordWrap( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWordWrap( ) )
			{
				eObj.setWordWrap( eRefObj.isWordWrap( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWordWrap( ) )
			{
				eObj.setWordWrap( eDefObj.isWordWrap( ) );
			}
		}

		if ( !eObj.isSetRotation( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRotation( ) )
			{
				eObj.setRotation( eRefObj.getRotation( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRotation( ) )
			{
				eObj.setRotation( eDefObj.getRotation( ) );
			}
		}

		// list attributes

		// references
		updateTextAlignment( "alignment",
				eObj,
				eObj.getAlignment( ),
				eRefObj == null ? null : eRefObj.getAlignment( ),
				eDefObj == null ? null : eDefObj.getAlignment( ) );

	}

	/**
	 * Updates chart element FormatSpecifier.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateFormatSpecifier( String name, EObject eParentObj,
			FormatSpecifier eObj, FormatSpecifier eRefObj,
			FormatSpecifier eDefObj )
	{
		if ( eObj != null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}
		else
		{
			updateFormatSpecifierImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element FormatSpecifier.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateFormatSpecifierImpl( String name, EObject eParentObj,
			FormatSpecifier eObj, FormatSpecifier eRefObj,
			FormatSpecifier eDefObj )
	{
		if ( eObj != null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eRefObj != null )
		{
			ChartElementUtil.setEObjectAttribute( eParentObj,
					name,
					eRefObj,
					false );
		}
		if ( eDefObj != null )
		{
			ChartElementUtil.setEObjectAttribute( eParentObj,
					name,
					eDefObj,
					false );
		}
	}

	/**
	 * Updates chart element Gradient.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateGradient( String name, EObject eParentObj,
			Gradient eObj, Gradient eRefObj, Gradient eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( !eObj.isSetDirection( ) )
		{
			if ( eRefObj != null && eRefObj.isSetDirection( ) )
			{
				eObj.setDirection( eRefObj.getDirection( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetDirection( ) )
			{
				eObj.setDirection( eDefObj.getDirection( ) );
			}
		}

		if ( !eObj.isSetCyclic( ) )
		{
			if ( eRefObj != null && eRefObj.isSetCyclic( ) )
			{
				eObj.setCyclic( eRefObj.isCyclic( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetCyclic( ) )
			{
				eObj.setCyclic( eDefObj.isCyclic( ) );
			}
		}

		if ( !eObj.isSetTransparency( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTransparency( ) )
			{
				eObj.setTransparency( eRefObj.getTransparency( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTransparency( ) )
			{
				eObj.setTransparency( eDefObj.getTransparency( ) );
			}
		}

		// list attributes

		// references
		updateColorDefinition( "startColor",
				eObj,
				eObj.getStartColor( ),
				eRefObj == null ? null : eRefObj.getStartColor( ),
				eDefObj == null ? null : eDefObj.getStartColor( ) );
		updateColorDefinition( "endColor",
				eObj,
				eObj.getEndColor( ),
				eRefObj == null ? null : eRefObj.getEndColor( ),
				eDefObj == null ? null : eDefObj.getEndColor( ) );

	}

	/**
	 * Updates chart element Image.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateImage( String name, EObject eParentObj, Image eObj,
			Image eRefObj, Image eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eObj instanceof EmbeddedImage )
		{
			updateEmbeddedImage( name,
					eParentObj,
					(EmbeddedImage) eObj,
					(EmbeddedImage) eRefObj,
					eDefObj instanceof EmbeddedImage ? (EmbeddedImage) eDefObj
							: null );
		}
		else if ( eObj instanceof PatternImage )
		{
			updatePatternImage( name,
					eParentObj,
					(PatternImage) eObj,
					(PatternImage) eRefObj,
					eDefObj instanceof PatternImage ? (PatternImage) eDefObj
							: null );
		}
		else
		{
			updateImageImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element Image.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateImageImpl( String name, EObject eParentObj,
			Image eObj, Image eRefObj, Image eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getURL( ) == null )
		{
			if ( eRefObj != null && eRefObj.getURL( ) != null )
			{
				eObj.setURL( eRefObj.getURL( ) );
			}
			else if ( eDefObj != null && eDefObj.getURL( ) != null )
			{
				eObj.setURL( eDefObj.getURL( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Insets.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateInsets( String name, EObject eParentObj, Insets eObj,
			Insets eRefObj, Insets eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetTop( ) )
		{
			if ( eRefObj != null && eRefObj.isSetTop( ) )
			{
				eObj.setTop( eRefObj.getTop( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetTop( ) )
			{
				eObj.setTop( eDefObj.getTop( ) );
			}
		}

		if ( !eObj.isSetLeft( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLeft( ) )
			{
				eObj.setLeft( eRefObj.getLeft( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLeft( ) )
			{
				eObj.setLeft( eDefObj.getLeft( ) );
			}
		}

		if ( !eObj.isSetBottom( ) )
		{
			if ( eRefObj != null && eRefObj.isSetBottom( ) )
			{
				eObj.setBottom( eRefObj.getBottom( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetBottom( ) )
			{
				eObj.setBottom( eDefObj.getBottom( ) );
			}
		}

		if ( !eObj.isSetRight( ) )
		{
			if ( eRefObj != null && eRefObj.isSetRight( ) )
			{
				eObj.setRight( eRefObj.getRight( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetRight( ) )
			{
				eObj.setRight( eDefObj.getRight( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Interactivity.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateInteractivity( String name, EObject eParentObj,
			Interactivity eObj, Interactivity eRefObj, Interactivity eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetEnable( ) )
		{
			if ( eRefObj != null && eRefObj.isSetEnable( ) )
			{
				eObj.setEnable( eRefObj.isEnable( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetEnable( ) )
			{
				eObj.setEnable( eDefObj.isEnable( ) );
			}
		}

		if ( !eObj.isSetLegendBehavior( ) )
		{
			if ( eRefObj != null && eRefObj.isSetLegendBehavior( ) )
			{
				eObj.setLegendBehavior( eRefObj.getLegendBehavior( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetLegendBehavior( ) )
			{
				eObj.setLegendBehavior( eDefObj.getLegendBehavior( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element LineAttributes.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateLineAttributes( String name, EObject eParentObj,
			LineAttributes eObj, LineAttributes eRefObj, LineAttributes eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetStyle( ) )
		{
			if ( eRefObj != null && eRefObj.isSetStyle( ) )
			{
				eObj.setStyle( eRefObj.getStyle( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetStyle( ) )
			{
				eObj.setStyle( eDefObj.getStyle( ) );
			}
		}

		if ( !eObj.isSetThickness( ) )
		{
			if ( eRefObj != null && eRefObj.isSetThickness( ) )
			{
				eObj.setThickness( eRefObj.getThickness( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetThickness( ) )
			{
				eObj.setThickness( eDefObj.getThickness( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		// list attributes

		// references
		updateColorDefinition( "color",
				eObj,
				eObj.getColor( ),
				eRefObj == null ? null : eRefObj.getColor( ),
				eDefObj == null ? null : eDefObj.getColor( ) );

	}

	/**
	 * Updates chart element Location.
	 *
	 * @param name
	 *        name chart element type.
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated
	 */
	public void updateLocation( String name, EObject eParentObj, Location eObj,
			Location eRefObj, Location eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		if ( eObj instanceof Location3D )
		{
			updateLocation3D( name,
					eParentObj,
					(Location3D) eObj,
					(Location3D) eRefObj,
					eDefObj instanceof Location3D ? (Location3D) eDefObj : null );
		}
		else
		{
			updateLocationImpl( name, eParentObj, eObj, eRefObj, eDefObj );
		}
	}

	/**
	 * Updates chart element Location.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateLocationImpl( String name, EObject eParentObj,
			Location eObj, Location eRefObj, Location eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetX( ) )
		{
			if ( eRefObj != null && eRefObj.isSetX( ) )
			{
				eObj.setX( eRefObj.getX( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetX( ) )
			{
				eObj.setX( eDefObj.getX( ) );
			}
		}

		if ( !eObj.isSetY( ) )
		{
			if ( eRefObj != null && eRefObj.isSetY( ) )
			{
				eObj.setY( eRefObj.getY( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetY( ) )
			{
				eObj.setY( eDefObj.getY( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Location3D.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateLocation3D( String name, EObject eParentObj,
			Location3D eObj, Location3D eRefObj, Location3D eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetX( ) )
		{
			if ( eRefObj != null && eRefObj.isSetX( ) )
			{
				eObj.setX( eRefObj.getX( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetX( ) )
			{
				eObj.setX( eDefObj.getX( ) );
			}
		}

		if ( !eObj.isSetY( ) )
		{
			if ( eRefObj != null && eRefObj.isSetY( ) )
			{
				eObj.setY( eRefObj.getY( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetY( ) )
			{
				eObj.setY( eDefObj.getY( ) );
			}
		}

		if ( !eObj.isSetZ( ) )
		{
			if ( eRefObj != null && eRefObj.isSetZ( ) )
			{
				eObj.setZ( eRefObj.getZ( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetZ( ) )
			{
				eObj.setZ( eDefObj.getZ( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Marker.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateMarker( String name, EObject eParentObj, Marker eObj,
			Marker eRefObj, Marker eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// Pro-process 'visible' case, if current element is invisible, no need to update other attributes.;
		if ( eObj.isSetVisible( ) )
		{
			if ( !eObj.isVisible( ) )
			{
				// If the visible attribute of reference obj is false, directly return, no need to udpate other attributes.;
				return;
			}
		}
		else if ( eRefObj != null && eRefObj.isSetVisible( ) )
		{
			if ( !eRefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}
		else if ( eDefObj != null && eDefObj.isSetVisible( ) )
		{
			if ( !eDefObj.isVisible( ) )
			{
				eObj.setVisible( false );
				return;
			}
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( !eObj.isSetSize( ) )
		{
			if ( eRefObj != null && eRefObj.isSetSize( ) )
			{
				eObj.setSize( eRefObj.getSize( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetSize( ) )
			{
				eObj.setSize( eDefObj.getSize( ) );
			}
		}

		if ( !eObj.isSetVisible( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVisible( ) )
			{
				eObj.setVisible( eRefObj.isVisible( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVisible( ) )
			{
				eObj.setVisible( eDefObj.isVisible( ) );
			}
		}

		// list attributes

		// references
		updateFill( "fill",
				eObj,
				eObj.getFill( ),
				eRefObj == null ? null : eRefObj.getFill( ),
				eDefObj == null ? null : eDefObj.getFill( ) );
		updatePalette( "iconPalette",
				eObj,
				eObj.getIconPalette( ),
				eRefObj == null ? null : eRefObj.getIconPalette( ),
				eDefObj == null ? null : eDefObj.getIconPalette( ),
				0,
				0 );
		updateLineAttributes( "outline",
				eObj,
				eObj.getOutline( ),
				eRefObj == null ? null : eRefObj.getOutline( ),
				eDefObj == null ? null : eDefObj.getOutline( ) );

	}

	/**
	 * Updates chart element MultipleFill.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updateMultipleFill( String name, EObject eParentObj,
			MultipleFill eObj, MultipleFill eRefObj, MultipleFill eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		// list attributes

		// references
		int index_MultipleFill_fills = 0;
		for ( Fill element : eObj.getFills( ) )
		{
			updateFill( "fills", eObj, element, ( eRefObj == null || eRefObj.getFills( ).size( ) <= index_MultipleFill_fills ) ? null : eRefObj.getFills( ).get( index_MultipleFill_fills ), ( eDefObj == null || eDefObj.getFills( ).size( ) <= index_MultipleFill_fills ) ? null : eDefObj.getFills( ).get( index_MultipleFill_fills ) ); //$NON-NLS-1$ 
			index_MultipleFill_fills++;
		}

	}

	/**
	 * Updates chart element Palette.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 * @param axisIndex
	 *        index of axis.
	 * @param seriesDefIndex
	 *        index of series definition.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updatePalette( String name, EObject eParentObj, Palette eObj,
			Palette eRefObj, Palette eDefObj, int axisIndex, int seriesDefIndex )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getName( ) == null )
		{
			if ( eRefObj != null && eRefObj.getName( ) != null )
			{
				eObj.setName( eRefObj.getName( ) );
			}
			else if ( eDefObj != null && eDefObj.getName( ) != null )
			{
				eObj.setName( eDefObj.getName( ) );
			}
		}

		// list attributes

		// references
		if ( eObj.getEntries( ).size( ) > 0 )
		{
			return;
		}
		if ( eRefObj != null && eRefObj.getEntries( ).size( ) > 0 )
		{
			Palette p = eRefObj.copyInstance( );
			p.shift( ( axisIndex + seriesDefIndex ) * -1 );
			eObj.getEntries( ).addAll( p.getEntries( ) );
		}
		else if ( eDefObj != null )
		{
			eObj.getEntries( )
					.addAll( ChartElementUtil.copyInstance( eDefObj.getEntries( ) ) );
		}

	}

	/**
	 * Updates chart element PatternImage.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	protected void updatePatternImage( String name, EObject eParentObj,
			PatternImage eObj, PatternImage eRefObj, PatternImage eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetType( ) )
		{
			if ( eRefObj != null && eRefObj.isSetType( ) )
			{
				eObj.setType( eRefObj.getType( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetType( ) )
			{
				eObj.setType( eDefObj.getType( ) );
			}
		}

		if ( eObj.getURL( ) == null )
		{
			if ( eRefObj != null && eRefObj.getURL( ) != null )
			{
				eObj.setURL( eRefObj.getURL( ) );
			}
			else if ( eDefObj != null && eDefObj.getURL( ) != null )
			{
				eObj.setURL( eDefObj.getURL( ) );
			}
		}

		if ( !eObj.isSetBitmap( ) )
		{
			if ( eRefObj != null && eRefObj.isSetBitmap( ) )
			{
				eObj.setBitmap( eRefObj.getBitmap( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetBitmap( ) )
			{
				eObj.setBitmap( eDefObj.getBitmap( ) );
			}
		}

		// list attributes

		// references
		updateColorDefinition( "foreColor",
				eObj,
				eObj.getForeColor( ),
				eRefObj == null ? null : eRefObj.getForeColor( ),
				eDefObj == null ? null : eDefObj.getForeColor( ) );
		updateColorDefinition( "backColor",
				eObj,
				eObj.getBackColor( ),
				eRefObj == null ? null : eRefObj.getBackColor( ),
				eDefObj == null ? null : eDefObj.getBackColor( ) );

	}

	/**
	 * Updates chart element Rotation3D.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateRotation3D( String name, EObject eParentObj,
			Rotation3D eObj, Rotation3D eRefObj, Rotation3D eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		// list attributes

		// references
		int index_Rotation3D_angles = 0;
		for ( Angle3D element : eObj.getAngles( ) )
		{
			updateAngle3D( "angles", eObj, element, ( eRefObj == null || eRefObj.getAngles( ).size( ) <= index_Rotation3D_angles ) ? null : eRefObj.getAngles( ).get( index_Rotation3D_angles ), ( eDefObj == null || eDefObj.getAngles( ).size( ) <= index_Rotation3D_angles ) ? null : eDefObj.getAngles( ).get( index_Rotation3D_angles ) ); //$NON-NLS-1$ 
			index_Rotation3D_angles++;
		}

	}

	/**
	 * Updates chart element Size.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateSize( String name, EObject eParentObj, Size eObj,
			Size eRefObj, Size eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetHeight( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHeight( ) )
			{
				eObj.setHeight( eRefObj.getHeight( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHeight( ) )
			{
				eObj.setHeight( eDefObj.getHeight( ) );
			}
		}

		if ( !eObj.isSetWidth( ) )
		{
			if ( eRefObj != null && eRefObj.isSetWidth( ) )
			{
				eObj.setWidth( eRefObj.getWidth( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetWidth( ) )
			{
				eObj.setWidth( eDefObj.getWidth( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Updates chart element Style.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateStyle( String name, EObject eParentObj, Style eObj,
			Style eRefObj, Style eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		// list attributes

		// references
		updateFontDefinition( "font",
				eObj,
				eObj.getFont( ),
				eRefObj == null ? null : eRefObj.getFont( ),
				eDefObj == null ? null : eDefObj.getFont( ) );
		updateColorDefinition( "color",
				eObj,
				eObj.getColor( ),
				eRefObj == null ? null : eRefObj.getColor( ),
				eDefObj == null ? null : eDefObj.getColor( ) );
		updateColorDefinition( "backgroundColor",
				eObj,
				eObj.getBackgroundColor( ),
				eRefObj == null ? null : eRefObj.getBackgroundColor( ),
				eDefObj == null ? null : eDefObj.getBackgroundColor( ) );
		updateImage( "backgroundImage",
				eObj,
				eObj.getBackgroundImage( ),
				eRefObj == null ? null : eRefObj.getBackgroundImage( ),
				eDefObj == null ? null : eDefObj.getBackgroundImage( ) );
		updateInsets( "padding",
				eObj,
				eObj.getPadding( ),
				eRefObj == null ? null : eRefObj.getPadding( ),
				eDefObj == null ? null : eDefObj.getPadding( ) );

	}

	/**
	 * Updates chart element Text.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateText( String name, EObject eParentObj, Text eObj,
			Text eRefObj, Text eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( eObj.getValue( ) == null )
		{
			if ( eRefObj != null && eRefObj.getValue( ) != null )
			{
				eObj.setValue( eRefObj.getValue( ) );
			}
			else if ( eDefObj != null && eDefObj.getValue( ) != null )
			{
				eObj.setValue( eDefObj.getValue( ) );
			}
		}

		// list attributes

		// references
		updateFontDefinition( "font",
				eObj,
				eObj.getFont( ),
				eRefObj == null ? null : eRefObj.getFont( ),
				eDefObj == null ? null : eDefObj.getFont( ) );
		updateColorDefinition( "color",
				eObj,
				eObj.getColor( ),
				eRefObj == null ? null : eRefObj.getColor( ),
				eDefObj == null ? null : eDefObj.getColor( ) );

	}

	/**
	 * Updates chart element TextAlignment.
	 *
	 * @param eObj
	 *        chart element object.
	 * @param eRefObj
	 *        reference chart element object.
	 * @param eDefObj
	 *        default chart element object.
	 *
	 * @generated Don't change this method manually.
	 */
	public void updateTextAlignment( String name, EObject eParentObj,
			TextAlignment eObj, TextAlignment eRefObj, TextAlignment eDefObj )
	{
		if ( eObj == null )
		{
			if ( eRefObj != null )
			{
				eObj = eRefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
			}
			else if ( eDefObj != null )
			{
				eObj = eDefObj.copyInstance( );
				ChartElementUtil.setEObjectAttribute( eParentObj,
						name,
						eObj,
						false );
				return;
			}
		}
		if ( eObj == null || ( eRefObj == null && eDefObj == null ) )
		{
			return;
		}

		// attributes
		if ( !eObj.isSetHorizontalAlignment( ) )
		{
			if ( eRefObj != null && eRefObj.isSetHorizontalAlignment( ) )
			{
				eObj.setHorizontalAlignment( eRefObj.getHorizontalAlignment( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetHorizontalAlignment( ) )
			{
				eObj.setHorizontalAlignment( eDefObj.getHorizontalAlignment( ) );
			}
		}

		if ( !eObj.isSetVerticalAlignment( ) )
		{
			if ( eRefObj != null && eRefObj.isSetVerticalAlignment( ) )
			{
				eObj.setVerticalAlignment( eRefObj.getVerticalAlignment( ) );
			}
			else if ( eDefObj != null && eDefObj.isSetVerticalAlignment( ) )
			{
				eObj.setVerticalAlignment( eDefObj.getVerticalAlignment( ) );
			}
		}

		// list attributes

		// references

	}

	/**
	 * Generates series ID according to specified series.
	 *
	 * @param series 
	 *        chart series object.
	 *
	 * @generated
	 */
	protected String getSeriesID( Series series )
	{
		String simpleName = series.getClass( ).getSimpleName( );
		if ( simpleName.endsWith( "Impl" ) )
		{
			simpleName = simpleName.substring( 0, simpleName.indexOf( "Impl" ) );
		}
		return simpleName;
	}

	/**
	 * Get valid marker refenerce.
	 *
	 * @param marker parent
	 *        the parent object which contains markers.
	 * @param attribute
	 *        attribute name of marker.
	 * @param index
	 *        the index of marker object.
	 *
	 * @generated
	 */
	private Marker getValidMarkerRef( EObject obj, String attribute, int index )
	{
		try
		{
			String methodName = "get"
					+ attribute.substring( 0, 1 ).toUpperCase( )
					+ attribute.substring( 1 );
			Method m = obj.getClass( ).getMethod( methodName );
			List<Marker> mList = (List<Marker>) m.invoke( obj );
			if ( ( mList.size( ) - 1 ) >= index )
			{
				return mList.get( index );
			}
			else if ( mList.size( ) == 1 )
			{
				return mList.get( 0 );
			}
		}
		catch ( Exception e )
		{
			//Do nothing.;
		}
		return null;
	}

}
