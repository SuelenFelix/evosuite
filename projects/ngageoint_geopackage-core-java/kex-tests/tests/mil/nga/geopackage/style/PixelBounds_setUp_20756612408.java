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

public class PixelBounds_setUp_20756612408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term44;

    public PixelBounds_setUp_20756612408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term39, term39.getClass(), "left", 0.3800088629986428);
        setDoubleField(term39, term39.getClass(), "up", 0.5840714198152577);
        setDoubleField(term39, term39.getClass(), "right", 0.7559240768573477);
        setDoubleField(term39, term39.getClass(), "down", 0.10667076642995188);
        term44 = new Double(0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term44;
        callMethod(klass, "setUp", argTypes, term39, args);
    }

};


