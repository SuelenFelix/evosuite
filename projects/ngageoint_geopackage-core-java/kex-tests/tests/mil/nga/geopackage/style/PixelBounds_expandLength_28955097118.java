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

public class PixelBounds_expandLength_28955097118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term110;

    public PixelBounds_expandLength_28955097118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105 = newInstance(Class.forName("mil.nga.geopackage.style.PixelBounds"));
        setDoubleField(term105, term105.getClass(), "left", 0.36226058076369927);
        setDoubleField(term105, term105.getClass(), "up", 0.03699061125289671);
        setDoubleField(term105, term105.getClass(), "right", 0.6047137830113202);
        setDoubleField(term105, term105.getClass(), "down", 0.6767213143579776);
        term110 = new Double(0.48862955528902696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.style.PixelBounds");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term110;
        callMethod(klass, "expandLength", argTypes, term105, args);
    }

};


