package mil.nga.geopackage.extension.nga.style;

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
import static mil.nga.geopackage.extension.nga.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StyleTable_getDescriptionColumnIndex_22996542322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7807;

    public StyleTable_getDescriptionColumnIndex_22996542322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7807 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable"));
        setField(term7807, term7807.getClass(), "columns", null);
        setField(term7807, term7807.getClass(), "constraints", null);
        setField(term7807, term7807.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.style.StyleTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescriptionColumnIndex", argTypes, term7807, args);
    }

};


