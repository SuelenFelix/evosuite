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

public class CoverageDataRequest_getProjectedBoundingBox_101182438111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public CoverageDataRequest_getProjectedBoundingBox_101182438111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataRequest"));
        setField(term135, term135.getClass(), "boundingBox", null);
        setBooleanField(term135, term135.getClass(), "point", false);
        setField(term135, term135.getClass(), "projectedBoundingBox", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProjectedBoundingBox", argTypes, term135, args);
    }

};


