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
import java.lang.Object;
import java.lang.String;

public class ComedyCalculator_amountFor_20766605501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;

    public ComedyCalculator_amountFor_20766605501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term596 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term595 = ((Class) term596).getDeclaredField((String) "TRAGEDY");
        ((Field) term595).setAccessible(true);
        Object enum2 = ((Field) term595).get((Object) null);
        term536 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.ComedyCalculator"));
        Object term537 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term551 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term537, term537.getClass(), "playId", "jJCZpVmanW");
        setIntField(term537, term537.getClass(), "audience", 1484323161);
        setField(term536, term536.getClass(), "performance", term537);
        setField(term551, term551.getClass(), "name", "EGtDIRbSSb");
        setField(term551, term551.getClass(), "type", enum2);
        setField(term536, term536.getClass(), "play", term551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.ComedyCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "amountFor", argTypes, term536, args);
    }

};


