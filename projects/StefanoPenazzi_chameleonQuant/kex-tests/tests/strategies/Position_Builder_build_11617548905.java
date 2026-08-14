package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Position_Builder_build_11617548905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11035;

    public Position_Builder_build_11617548905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11063 = Class.forName((String) "strategies.Position$PositionType");
        Field term11062 = ((Class) term11063).getDeclaredField((String) "SHORT");
        ((Field) term11062).setAccessible(true);
        Object enum36 = ((Field) term11062).get((Object) null);
        term11035 = newInstance(Class.forName("strategies.Position$Builder"));
        Object term11059 = newInstance(Class.forName("java.time.Instant"));
        setField(term11035, term11035.getClass(), "ts", null);
        setField(term11035, term11035.getClass(), "pt", enum36);
        setField(term11035, term11035.getClass(), "sId", "xIeFjkHkOe");
        setIntField(term11035, term11035.getClass(), "initVolume", -1945706126);
        setDoubleField(term11035, term11035.getClass(), "pr", 0.6047138318674447);
        setLongField(term11059, term11059.getClass(), "seconds", 1570714321L);
        setIntField(term11059, term11059.getClass(), "nanos", 79000000);
        setField(term11035, term11035.getClass(), "openInst", term11059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term11035, args);
    }

};


