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

public class PixelBounds_expandDown_136219757715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term89;

    public PixelBounds_expandDown_136219757715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term84, term84.getClass(), "left", 0.7919370314903882);
        setDoubleField(term84, term84.getClass(), "up", 0.2109867221632754);
        setDoubleField(term84, term84.getClass(), "right", 0.3227335400819148);
        setDoubleField(term84, term84.getClass(), "down", 0.43337207054070237);
        term89 = new Double(0.13246999699526574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term89;
        callMethod(klass, "expandDown", argTypes, term84, args);
    }

};


