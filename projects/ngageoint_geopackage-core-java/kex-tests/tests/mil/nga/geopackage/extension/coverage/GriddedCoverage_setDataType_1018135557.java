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

public class GriddedCoverage_setDataType_1018135557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1952;
     Object enum0;

    public GriddedCoverage_setDataType_1018135557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1998 = new Double(1.0);
        Double term2000 = new Double(0.24259014218848696);
        term1952 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1954 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1952, term1952.getClass(), "id", -1154553077993834885L);
        setField(term1954, term1954.getClass(), "contents", null);
        setField(term1954, term1954.getClass(), "tableName", "hoicvmsovO");
        setField(term1954, term1954.getClass(), "srs", null);
        setLongField(term1954, term1954.getClass(), "srsId", -2850532706972744550L);
        setDoubleField(term1954, term1954.getClass(), "minX", 0.20737514139742264);
        setDoubleField(term1954, term1954.getClass(), "minY", 0.7919370314903882);
        setDoubleField(term1954, term1954.getClass(), "maxX", 0.2109867221632754);
        setDoubleField(term1954, term1954.getClass(), "maxY", 0.3227335400819148);
        setField(term1952, term1952.getClass(), "tileMatrixSet", term1954);
        setField(term1952, term1952.getClass(), "tileMatrixSetName", "eqJfYWRaEL");
        setField(term1952, term1952.getClass(), "datatype", "fhkbdRViHi");
        setDoubleField(term1952, term1952.getClass(), "scale", 1.0);
        setDoubleField(term1952, term1952.getClass(), "offset", 0.43337207054070237);
        setField(term1952, term1952.getClass(), "precision", term1998);
        setField(term1952, term1952.getClass(), "dataNull", term2000);
        setField(term1952, term1952.getClass(), "gridCellEncoding", "uWHnvSvaPl");
        setField(term1952, term1952.getClass(), "uom", "kBdSllIBVz");
        setField(term1952, term1952.getClass(), "fieldName", "TJmVBGfTML");
        setField(term1952, term1952.getClass(), "quantityDefinition", "tPlsykYBqO");
        Class<? extends Object> term2177 = Class.forName((String) "mil.nga.geopackage.extension.coverage.GriddedCoverageDataType");
        Field term2176 = ((Class) term2177).getDeclaredField((String) "INTEGER");
        ((Field) term2176).setAccessible(true);
        enum0 = ((Field) term2176).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverageDataType");
        Object[] args = new Object[1];
        args[0] = enum0;
        callMethod(klass, "setDataType", argTypes, term1952, args);
    }

};


