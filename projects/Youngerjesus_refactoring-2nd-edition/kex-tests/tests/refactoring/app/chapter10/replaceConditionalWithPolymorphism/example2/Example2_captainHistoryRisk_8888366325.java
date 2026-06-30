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

public class Example2_captainHistoryRisk_8888366325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term208;
     Object term223;

    public Example2_captainHistoryRisk_8888366325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2"));
        term208 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        setField(term208, term208.getClass(), "zone", "SzjVpOQTyS");
        setIntField(term208, term208.getClass(), "length", 1134449235);
        setIntField(term208, term208.getClass(), "profit", -883034806);
        ArrayList term224 = new ArrayList();
        term223 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term223, term223.getClass(), "voyages", term224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Example2");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage");
        argTypes[1] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History");
        Object[] args = new Object[2];
        args[0] = term208;
        args[1] = term223;
        callMethod(klass, "captainHistoryRisk", argTypes, term207, args);
    }

};


