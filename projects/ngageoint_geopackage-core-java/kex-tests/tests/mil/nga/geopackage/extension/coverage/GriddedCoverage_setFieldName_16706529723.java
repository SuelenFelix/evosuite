package mil.nga.geopackage.extension.coverage;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class GriddedCoverage_setFieldName_16706529723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5545;

    public GriddedCoverage_setFieldName_16706529723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5591 = new Double(1.0);
        Double term5593 = new Double(0.07417792024383196);
        term5545 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5547 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5545, term5545.getClass(), "id", -8652538484981166496L);
        setField(term5547, term5547.getClass(), "contents", null);
        setField(term5547, term5547.getClass(), "tableName", "lihXWlGDxk");
        setField(term5547, term5547.getClass(), "srs", null);
        setLongField(term5547, term5547.getClass(), "srsId", 2701184207686293431L);
        setDoubleField(term5547, term5547.getClass(), "minX", 0.2446504549754045);
        setDoubleField(term5547, term5547.getClass(), "minY", 0.6142723998707854);
        setDoubleField(term5547, term5547.getClass(), "maxX", 0.4355627280318103);
        setDoubleField(term5547, term5547.getClass(), "maxY", 0.841460835734741);
        setField(term5545, term5545.getClass(), "tileMatrixSet", term5547);
        setField(term5545, term5545.getClass(), "tileMatrixSetName", "JmcmxoGhIK");
        setField(term5545, term5545.getClass(), "datatype", "jXzmYyrnnT");
        setDoubleField(term5545, term5545.getClass(), "scale", 1.0);
        setDoubleField(term5545, term5545.getClass(), "offset", 0.7859316615744082);
        setField(term5545, term5545.getClass(), "precision", term5591);
        setField(term5545, term5545.getClass(), "dataNull", term5593);
        setField(term5545, term5545.getClass(), "gridCellEncoding", "igCAtimmYB");
        setField(term5545, term5545.getClass(), "uom", "DyiXbeYIaN");
        setField(term5545, term5545.getClass(), "fieldName", "VGizxZnyHX");
        setField(term5545, term5545.getClass(), "quantityDefinition", "kVEZMHmRtR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        callMethod(klass, "setFieldName", argTypes, term5545, args);
    }

};


