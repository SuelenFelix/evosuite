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

public class GriddedCoverage_getDataType_199749491532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6109;

    public GriddedCoverage_getDataType_199749491532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6109 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        setLongField(term6109, term6109.getClass(), "id", 0L);
        setField(term6109, term6109.getClass(), "tileMatrixSet", null);
        setField(term6109, term6109.getClass(), "tileMatrixSetName", null);
        setField(term6109, term6109.getClass(), "datatype", null);
        setDoubleField(term6109, term6109.getClass(), "scale", 0.0);
        setDoubleField(term6109, term6109.getClass(), "offset", 0.0);
        setField(term6109, term6109.getClass(), "precision", null);
        setField(term6109, term6109.getClass(), "dataNull", null);
        setField(term6109, term6109.getClass(), "gridCellEncoding", null);
        setField(term6109, term6109.getClass(), "uom", null);
        setField(term6109, term6109.getClass(), "fieldName", null);
        setField(term6109, term6109.getClass(), "quantityDefinition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term6109, args);
    }

};


