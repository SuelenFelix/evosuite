package mil.nga.geopackage.style;

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
import static mil.nga.geopackage.style.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class PixelBounds_setDown_24614796736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203;
     Object term208;

    public PixelBounds_setDown_24614796736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term203, term203.getClass(), "left", 0.0);
        setDoubleField(term203, term203.getClass(), "up", 0.0);
        setDoubleField(term203, term203.getClass(), "right", 0.0);
        setDoubleField(term203, term203.getClass(), "down", 0.0);
        term208 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term208;
        callMethod(klass, "setDown", argTypes, term203, args);
    }

};


