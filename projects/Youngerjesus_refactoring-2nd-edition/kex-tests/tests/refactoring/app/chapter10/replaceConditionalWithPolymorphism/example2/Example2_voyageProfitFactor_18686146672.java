package refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2;

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
import static refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Example2_voyageProfitFactor_18686146672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;
     Object term145;
     Object term160;

    public Example2_voyageProfitFactor_18686146672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2"));
        term145 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        setField(term145, term145.getClass(), "zone", "jJCZpVmanW");
        setIntField(term145, term145.getClass(), "length", 1227103734);
        setIntField(term145, term145.getClass(), "profit", -1339778481);
        ArrayList term161 = new ArrayList();
        term160 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term160, term160.getClass(), "voyages", term161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage");
        argTypes[1] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History");
        Object[] args = new Object[2];
        args[0] = term145;
        args[1] = term160;
        callMethod(klass, "voyageProfitFactor", argTypes, term144, args);
    }

};


