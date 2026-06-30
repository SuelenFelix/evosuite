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

public class TragedyCalculator_volumeCreditFor_4176590802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2321;

    public TragedyCalculator_volumeCreditFor_4176590802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2380 = Class.forName((String) "refactoring.app.chapter01.PlayType");
        Field term2379 = ((Class) term2380).getDeclaredField((String) "COMEDY");
        ((Field) term2379).setAccessible(true);
        Object enum9 = ((Field) term2379).get((Object) null);
        term2321 = newInstance(Class.forName("refactoring.app.chapter01.performanceCalculator.TragedyCalculator"));
        Object term2322 = newInstance(Class.forName("refactoring.app.chapter01.Performance"));
        Object term2336 = newInstance(Class.forName("refactoring.app.chapter01.Play"));
        setField(term2322, term2322.getClass(), "playId", "HyxfbSQYBe");
        setIntField(term2322, term2322.getClass(), "audience", -1339778481);
        setField(term2321, term2321.getClass(), "performance", term2322);
        setField(term2336, term2336.getClass(), "name", "pCTimMblYc");
        setField(term2336, term2336.getClass(), "type", enum9);
        setField(term2321, term2321.getClass(), "play", term2336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter01.performanceCalculator.TragedyCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "volumeCreditFor", argTypes, term2321, args);
    }

};


