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

public class PixelBounds_expandHeight_176475250817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;
     Object term103;

    public PixelBounds_expandHeight_176475250817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term98, term98.getClass(), "left", 0.016575281023182953);
        setDoubleField(term98, term98.getClass(), "up", 0.5308350402051779);
        setDoubleField(term98, term98.getClass(), "right", 0.7154795600170818);
        setDoubleField(term98, term98.getClass(), "down", 0.6355029654528058);
        term103 = new Double(0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "expandHeight", argTypes, term98, args);
    }

};


