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

public class Example1_airSpeedVelocity_7361855892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;
     Object term89;

    public Example1_airSpeedVelocity_7361855892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Example1"));
        term89 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Bird"));
        setField(term89, term89.getClass(), "type", "xxtlPwDYFs");
        setIntField(term89, term89.getClass(), "numberOfCoconuts", -1955890973);
        setIntField(term89, term89.getClass(), "voltage", -2038273078);
        setBooleanField(term89, term89.getClass(), "isNailed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Example1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.Bird");
        Object[] args = new Object[1];
        args[0] = term89;
        callMethod(klass, "airSpeedVelocity", argTypes, term88, args);
    }

};


