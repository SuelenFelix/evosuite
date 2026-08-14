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

public class PixelBounds_expandWidth_179095875916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;
     Object term96;

    public PixelBounds_expandWidth_179095875916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term91, term91.getClass(), "left", 0.9126850255993704);
        setDoubleField(term91, term91.getClass(), "up", 0.11179067076100713);
        setDoubleField(term91, term91.getClass(), "right", 0.5306473989087822);
        setDoubleField(term91, term91.getClass(), "down", 0.022483645678509023);
        term96 = new Double(0.025133051616627267);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term96;
        callMethod(klass, "expandWidth", argTypes, term91, args);
    }

};


