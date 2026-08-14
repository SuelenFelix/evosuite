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

public class GriddedCoverage_setOffset_131644984737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6131;
     Object term6135;

    public GriddedCoverage_setOffset_131644984737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6131 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        setLongField(term6131, term6131.getClass(), "id", 0L);
        setField(term6131, term6131.getClass(), "tileMatrixSet", null);
        setField(term6131, term6131.getClass(), "tileMatrixSetName", null);
        setField(term6131, term6131.getClass(), "datatype", null);
        setDoubleField(term6131, term6131.getClass(), "scale", 0.0);
        setDoubleField(term6131, term6131.getClass(), "offset", 0.0);
        setField(term6131, term6131.getClass(), "precision", null);
        setField(term6131, term6131.getClass(), "dataNull", null);
        setField(term6131, term6131.getClass(), "gridCellEncoding", null);
        setField(term6131, term6131.getClass(), "uom", null);
        setField(term6131, term6131.getClass(), "fieldName", null);
        setField(term6131, term6131.getClass(), "quantityDefinition", null);
        term6135 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term6135;
        callMethod(klass, "setOffset", argTypes, term6131, args);
    }

};


