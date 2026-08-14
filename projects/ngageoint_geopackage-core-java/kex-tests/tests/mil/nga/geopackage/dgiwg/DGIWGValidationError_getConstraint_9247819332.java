package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DGIWGValidationError_getConstraint_9247819332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15147;

    public DGIWGValidationError_getConstraint_9247819332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15147 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term15147, term15147.getClass(), "table", null);
        setField(term15147, term15147.getClass(), "column", null);
        setField(term15147, term15147.getClass(), "value", null);
        setField(term15147, term15147.getClass(), "constraint", null);
        setField(term15147, term15147.getClass(), "requirement", null);
        setField(term15147, term15147.getClass(), "primaryKeys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstraint", argTypes, term15147, args);
    }

};


