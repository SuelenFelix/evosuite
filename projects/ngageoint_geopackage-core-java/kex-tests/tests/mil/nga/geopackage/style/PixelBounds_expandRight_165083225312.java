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

public class PixelBounds_expandRight_165083225312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term70;

    public PixelBounds_expandRight_165083225312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term65, term65.getClass(), "left", 0.25937345430928016);
        setDoubleField(term65, term65.getClass(), "up", 0.5873228247510078);
        setDoubleField(term65, term65.getClass(), "right", 0.8823181080774973);
        setDoubleField(term65, term65.getClass(), "down", 0.2192450926212024);
        term70 = new Double(0.7591353014991907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term70;
        callMethod(klass, "expandRight", argTypes, term65, args);
    }

};


