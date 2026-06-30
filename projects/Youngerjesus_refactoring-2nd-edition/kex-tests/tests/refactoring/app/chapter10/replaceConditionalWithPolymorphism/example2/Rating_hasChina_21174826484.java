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
import java.lang.Object;
import java.util.ArrayList;

public class Rating_hasChina_21174826484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398;

    public Rating_hasChina_21174826484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term415 = new ArrayList();
        term398 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating"));
        Object term399 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Voyage"));
        Object term414 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.History"));
        setField(term399, term399.getClass(), "zone", "MxlszYVzRf");
        setIntField(term399, term399.getClass(), "length", -1007160944);
        setIntField(term399, term399.getClass(), "profit", 1135664017);
        setField(term398, term398.getClass(), "voyage", term399);
        setField(term414, term414.getClass(), "voyages", term415);
        setField(term398, term398.getClass(), "history", term414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasChina", argTypes, term398, args);
    }

};


