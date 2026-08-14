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
import java.lang.Double;

public class GriddedCoverage_setScale_67270551435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6121;
     Object term6125;

    public GriddedCoverage_setScale_67270551435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6121 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        setLongField(term6121, term6121.getClass(), "id", 0L);
        setField(term6121, term6121.getClass(), "tileMatrixSet", null);
        setField(term6121, term6121.getClass(), "tileMatrixSetName", null);
        setField(term6121, term6121.getClass(), "datatype", null);
        setDoubleField(term6121, term6121.getClass(), "scale", 0.0);
        setDoubleField(term6121, term6121.getClass(), "offset", 0.0);
        setField(term6121, term6121.getClass(), "precision", null);
        setField(term6121, term6121.getClass(), "dataNull", null);
        setField(term6121, term6121.getClass(), "gridCellEncoding", null);
        setField(term6121, term6121.getClass(), "uom", null);
        setField(term6121, term6121.getClass(), "fieldName", null);
        setField(term6121, term6121.getClass(), "quantityDefinition", null);
        term6125 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6125;
        callMethod(klass, "setScale", argTypes, term6121, args);
    }

};


