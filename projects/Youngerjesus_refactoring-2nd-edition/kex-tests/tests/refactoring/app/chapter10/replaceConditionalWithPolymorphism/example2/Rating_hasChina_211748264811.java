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

public class Rating_hasChina_211748264811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;

    public Rating_hasChina_211748264811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating"));
        setField(term494, term494.getClass(), "voyage", null);
        setField(term494, term494.getClass(), "history", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example2.Rating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasChina", argTypes, term494, args);
    }

};


