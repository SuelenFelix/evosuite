package refactoring.app.chapter01.performanceCalculator;

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
import static refactoring.app.chapter01.performanceCalculator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ComedyCalculator_init_10181279210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280;
     Object term294;

    public ComedyCalculator_init_10181279210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        setField(term280, term280.getClass(), "playId", "MuLcgQHgqz");
        setIntField(term280, term280.getClass(), "audience", 1162663216);
        Class<? extends Object> term339 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term338 = ((Class) term339).getDeclaredField((String) "TRAGEDY");
        ((Field) term338).setAccessible(true);
        Object enum1 = ((Field) term338).get((Object) null);
        term294 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term294, term294.getClass(), "name", "xxtlPwDYFs");
        setField(term294, term294.getClass(), "type", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.ComedyCalculator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter01.Performance");
        argTypes[1] = Class.forName("refactoring.app.chapter01.Play");
        Object[] args = new Object[2];
        args[0] = term280;
        args[1] = term294;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


