package refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1;

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
import static refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Example1_airSpeedVelocity_7361855896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public Example1_airSpeedVelocity_7361855896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Example1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Example1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Bird");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "airSpeedVelocity", argTypes, term139, args);
    }

};


