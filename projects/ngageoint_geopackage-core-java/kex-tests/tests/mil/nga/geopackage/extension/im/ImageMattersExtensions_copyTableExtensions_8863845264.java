package mil.nga.geopackage.extension.im;

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
import static mil.nga.geopackage.extension.im.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ImageMattersExtensions_copyTableExtensions_8863845264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4124;

    public ImageMattersExtensions_copyTableExtensions_8863845264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4124 = newInstance(Class.forName("mil.nga.geopackage.extension.im.ImageMattersExtensions"));
        setField(term4124, term4124.getClass(), "geoPackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.ImageMattersExtensions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "EeBVbzjcCI";
        args[1] = "UfQtPRyWRC";
        callMethod(klass, "copyTableExtensions", argTypes, term4124, args);
    }

};


