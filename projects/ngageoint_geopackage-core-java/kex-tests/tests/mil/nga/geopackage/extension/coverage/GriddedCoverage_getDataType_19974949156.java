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

public class GriddedCoverage_getDataType_19974949156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1784;

    public GriddedCoverage_getDataType_19974949156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1830 = new Double(1.0);
        Double term1832 = new Double(0.146431486357265);
        term1784 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1786 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1784, term1784.getClass(), "id", -5788180182343976541L);
        setField(term1786, term1786.getClass(), "contents", null);
        setField(term1786, term1786.getClass(), "tableName", "YRHGsAkhxb");
        setField(term1786, term1786.getClass(), "srs", null);
        setLongField(term1786, term1786.getClass(), "srsId", 2936323121573284007L);
        setDoubleField(term1786, term1786.getClass(), "minX", 0.9374115574082594);
        setDoubleField(term1786, term1786.getClass(), "minY", 0.8454723071922143);
        setDoubleField(term1786, term1786.getClass(), "maxX", 0.8566567697571895);
        setDoubleField(term1786, term1786.getClass(), "maxY", 0.9203805380592256);
        setField(term1784, term1784.getClass(), "tileMatrixSet", term1786);
        setField(term1784, term1784.getClass(), "tileMatrixSetName", "ffYhPOzlUs");
        setField(term1784, term1784.getClass(), "datatype", "MLqYREekMl");
        setDoubleField(term1784, term1784.getClass(), "scale", 1.0);
        setDoubleField(term1784, term1784.getClass(), "offset", 0.5804948995371725);
        setField(term1784, term1784.getClass(), "precision", term1830);
        setField(term1784, term1784.getClass(), "dataNull", term1832);
        setField(term1784, term1784.getClass(), "gridCellEncoding", "ytSBIKXogI");
        setField(term1784, term1784.getClass(), "uom", "nHXjMycHlU");
        setField(term1784, term1784.getClass(), "fieldName", "ieCtQFdkii");
        setField(term1784, term1784.getClass(), "quantityDefinition", "dEnhdmILtU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term1784, args);
    }

};


