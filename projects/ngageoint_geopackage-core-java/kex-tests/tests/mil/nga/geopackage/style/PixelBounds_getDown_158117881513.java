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

public class PixelBounds_getDown_158117881513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public PixelBounds_getDown_158117881513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term72, term72.getClass(), "left", 0.791695029600875);
        setDoubleField(term72, term72.getClass(), "up", 0.6862221294683138);
        setDoubleField(term72, term72.getClass(), "right", 0.15917839663695388);
        setDoubleField(term72, term72.getClass(), "down", 0.9374115574082594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDown", argTypes, term72, args);
    }

};


