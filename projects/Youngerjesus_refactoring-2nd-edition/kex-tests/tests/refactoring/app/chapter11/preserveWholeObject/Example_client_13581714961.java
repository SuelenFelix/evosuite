package refactoring.app.chapter11.preserveWholeObject;

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
import static refactoring.app.chapter11.preserveWholeObject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_client_13581714961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Example_client_13581714961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Example"));
        Object term2 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Room"));
        Object term3 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Range"));
        Object term6 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.HeatingPlan"));
        Object term7 = newInstance(Class.forName("refactoring.app.chapter11.preserveWholeObject.Range"));
        setIntField(term3, term3.getClass(), "low", 568599855);
        setIntField(term3, term3.getClass(), "high", 1162663216);
        setField(term2, term2.getClass(), "daysTempRange", term3);
        setField(term1, term1.getClass(), "room", term2);
        setIntField(term7, term7.getClass(), "low", 1484323161);
        setIntField(term7, term7.getClass(), "high", 391863371);
        setField(term6, term6.getClass(), "temperatureRange", term7);
        setField(term1, term1.getClass(), "heatingPlan", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.preserveWholeObject.Example");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "client", argTypes, term1, args);
    }

};


