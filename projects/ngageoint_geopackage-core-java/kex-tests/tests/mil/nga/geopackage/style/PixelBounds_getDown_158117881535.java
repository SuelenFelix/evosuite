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

public class PixelBounds_getDown_158117881535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public PixelBounds_getDown_158117881535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term198, term198.getClass(), "left", 0.0);
        setDoubleField(term198, term198.getClass(), "up", 0.0);
        setDoubleField(term198, term198.getClass(), "right", 0.0);
        setDoubleField(term198, term198.getClass(), "down", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDown", argTypes, term198, args);
    }

};


