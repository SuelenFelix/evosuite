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

public class Position_Builder_securityId_3217200231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10134;

    public Position_Builder_securityId_3217200231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10174 = Class.forName((String) "strategies.Position$PositionType");
        Field term10173 = ((Class) term10174).getDeclaredField((String) "SHORT");
        ((Field) term10173).setAccessible(true);
        Object enum32 = ((Field) term10173).get((Object) null);
        term10134 = newInstance(Class.forName("strategies.Position$Builder"));
        Object term10158 = newInstance(Class.forName("java.time.Instant"));
        setField(term10134, term10134.getClass(), "ts", null);
        setField(term10134, term10134.getClass(), "pt", enum32);
        setField(term10134, term10134.getClass(), "sId", "XOiDvlDhdc");
        setIntField(term10134, term10134.getClass(), "initVolume", 497269071);
        setDoubleField(term10134, term10134.getClass(), "pr", 0.9165240441138934);
        setLongField(term10158, term10158.getClass(), "seconds", 1263744156L);
        setIntField(term10158, term10158.getClass(), "nanos", 294000000);
        setField(term10134, term10134.getClass(), "openInst", term10158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AdxvLJhNLe";
        callMethod(klass, "securityId", argTypes, term10134, args);
    }

};


