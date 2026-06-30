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

public class NorwegianBlueParrot_airSpeedVelocity_18542854852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;

    public NorwegianBlueParrot_airSpeedVelocity_18542854852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.NorwegianBlueParrot"));
        setField(term167, term167.getClass(), "type", "SzjVpOQTyS");
        setIntField(term167, term167.getClass(), "numberOfCoconuts", 1725571209);
        setIntField(term167, term167.getClass(), "voltage", -522618178);
        setBooleanField(term167, term167.getClass(), "isNailed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.NorwegianBlueParrot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "airSpeedVelocity", argTypes, term167, args);
    }

};


