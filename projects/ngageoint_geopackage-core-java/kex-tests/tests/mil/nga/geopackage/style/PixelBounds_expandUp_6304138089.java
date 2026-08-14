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

public class PixelBounds_expandUp_6304138089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term51;

    public PixelBounds_expandUp_6304138089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term46, term46.getClass(), "left", 0.37161417339133307);
        setDoubleField(term46, term46.getClass(), "up", 0.6805867182029153);
        setDoubleField(term46, term46.getClass(), "right", 0.2852810965221698);
        setDoubleField(term46, term46.getClass(), "down", 0.6300849762307866);
        term51 = new Double(0.9737083944266686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term51;
        callMethod(klass, "expandUp", argTypes, term46, args);
    }

};


