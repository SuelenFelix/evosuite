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

public class TragedyCalculator_amountFor_17574971651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2064;

    public TragedyCalculator_amountFor_17574971651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2124 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term2123 = ((Class) term2124).getDeclaredField((String) "TRAGEDY");
        ((Field) term2123).setAccessible(true);
        Object enum8 = ((Field) term2123).get((Object) null);
        term2064 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.TragedyCalculator"));
        Object term2065 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term2079 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term2065, term2065.getClass(), "playId", "ZiaGIbnzTs");
        setIntField(term2065, term2065.getClass(), "audience", 1227103734);
        setField(term2064, term2064.getClass(), "performance", term2065);
        setField(term2079, term2079.getClass(), "name", "tbcdzjIfER");
        setField(term2079, term2079.getClass(), "type", enum8);
        setField(term2064, term2064.getClass(), "play", term2079);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.TragedyCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "amountFor", argTypes, term2064, args);
    }

};


