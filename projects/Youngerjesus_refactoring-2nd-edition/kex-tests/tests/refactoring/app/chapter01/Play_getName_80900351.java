package refactoring.app.chapter01;

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
import static refactoring.app.chapter01.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Play_getName_80900351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3005;

    public Play_getName_80900351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3040 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term3039 = ((Class) term3040).getDeclaredField((String) "TRAGEDY");
        ((Field) term3039).setAccessible(true);
        Object enum8 = ((Field) term3039).get((Object) null);
        term3005 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term3005, term3005.getClass(), "name", "xIeFjkHkOe");
        setField(term3005, term3005.getClass(), "type", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.Play");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term3005, args);
    }

};


