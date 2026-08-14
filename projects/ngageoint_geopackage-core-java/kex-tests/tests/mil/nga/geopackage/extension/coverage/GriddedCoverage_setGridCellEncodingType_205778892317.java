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
import java.lang.String;

public class GriddedCoverage_setGridCellEncodingType_205778892317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4029;
     Object enum1;

    public GriddedCoverage_setGridCellEncodingType_205778892317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4075 = new Double(1.0);
        Double term4077 = new Double(0.09067063848644474);
        term4029 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term4031 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term4029, term4029.getClass(), "id", 41775768178052008L);
        setField(term4031, term4031.getClass(), "contents", null);
        setField(term4031, term4031.getClass(), "tableName", "xJgPlLxpgC");
        setField(term4031, term4031.getClass(), "srs", null);
        setLongField(term4031, term4031.getClass(), "srsId", 6682528376118987775L);
        setDoubleField(term4031, term4031.getClass(), "minX", 0.06587158449170749);
        setDoubleField(term4031, term4031.getClass(), "minY", 0.0865998004187658);
        setDoubleField(term4031, term4031.getClass(), "maxX", 0.9628647861255637);
        setDoubleField(term4031, term4031.getClass(), "maxY", 0.623231822150205);
        setField(term4029, term4029.getClass(), "tileMatrixSet", term4031);
        setField(term4029, term4029.getClass(), "tileMatrixSetName", "EYtfuJaxiM");
        setField(term4029, term4029.getClass(), "datatype", "gCWtLVKVVe");
        setDoubleField(term4029, term4029.getClass(), "scale", 1.0);
        setDoubleField(term4029, term4029.getClass(), "offset", 0.09037487793444521);
        setField(term4029, term4029.getClass(), "precision", term4075);
        setField(term4029, term4029.getClass(), "dataNull", term4077);
        setField(term4029, term4029.getClass(), "gridCellEncoding", "fWKJoSoCwE");
        setField(term4029, term4029.getClass(), "uom", "wfaXBpWAUH");
        setField(term4029, term4029.getClass(), "fieldName", "VMeAzAHwZj");
        setField(term4029, term4029.getClass(), "quantityDefinition", "PznxWXsZME");
        Class<? extends Object> term4318 = Class.forName((String) "mil.nga.geopackage.extension.coverage.GriddedCoverageEncodingType");
        Field term4317 = ((Class) term4318).getDeclaredField((String) "AREA");
        ((Field) term4317).setAccessible(true);
        enum1 = ((Field) term4317).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverageEncodingType");
        Object[] args = new Object[1];
        args[0] = enum1;
        callMethod(klass, "setGridCellEncodingType", argTypes, term4029, args);
    }

};


