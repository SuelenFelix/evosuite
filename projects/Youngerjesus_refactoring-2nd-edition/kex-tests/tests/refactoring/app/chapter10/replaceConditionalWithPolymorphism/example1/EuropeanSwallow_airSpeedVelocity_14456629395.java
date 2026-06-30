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

public class EuropeanSwallow_airSpeedVelocity_14456629395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257;

    public EuropeanSwallow_airSpeedVelocity_14456629395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.EuropeanSwallow"));
        setField(term257, term257.getClass(), "type", null);
        setIntField(term257, term257.getClass(), "numberOfCoconuts", 0);
        setIntField(term257, term257.getClass(), "voltage", 0);
        setBooleanField(term257, term257.getClass(), "isNailed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.EuropeanSwallow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "airSpeedVelocity", argTypes, term257, args);
    }

};


