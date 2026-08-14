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

public class GriddedCoverage_setGridCellEncodingType_205778892343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6157;

    public GriddedCoverage_setGridCellEncodingType_205778892343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6157 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        setLongField(term6157, term6157.getClass(), "id", 0L);
        setField(term6157, term6157.getClass(), "tileMatrixSet", null);
        setField(term6157, term6157.getClass(), "tileMatrixSetName", null);
        setField(term6157, term6157.getClass(), "datatype", null);
        setDoubleField(term6157, term6157.getClass(), "scale", 0.0);
        setDoubleField(term6157, term6157.getClass(), "offset", 0.0);
        setField(term6157, term6157.getClass(), "precision", null);
        setField(term6157, term6157.getClass(), "dataNull", null);
        setField(term6157, term6157.getClass(), "gridCellEncoding", null);
        setField(term6157, term6157.getClass(), "uom", null);
        setField(term6157, term6157.getClass(), "fieldName", null);
        setField(term6157, term6157.getClass(), "quantityDefinition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverageEncodingType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setGridCellEncodingType", argTypes, term6157, args);
    }

};


