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

public class GriddedCoverage_getOffset_176952384936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6127;

    public GriddedCoverage_getOffset_176952384936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6127 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        setLongField(term6127, term6127.getClass(), "id", 0L);
        setField(term6127, term6127.getClass(), "tileMatrixSet", null);
        setField(term6127, term6127.getClass(), "tileMatrixSetName", null);
        setField(term6127, term6127.getClass(), "datatype", null);
        setDoubleField(term6127, term6127.getClass(), "scale", 0.0);
        setDoubleField(term6127, term6127.getClass(), "offset", 0.0);
        setField(term6127, term6127.getClass(), "precision", null);
        setField(term6127, term6127.getClass(), "dataNull", null);
        setField(term6127, term6127.getClass(), "gridCellEncoding", null);
        setField(term6127, term6127.getClass(), "uom", null);
        setField(term6127, term6127.getClass(), "fieldName", null);
        setField(term6127, term6127.getClass(), "quantityDefinition", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffset", argTypes, term6127, args);
    }

};


