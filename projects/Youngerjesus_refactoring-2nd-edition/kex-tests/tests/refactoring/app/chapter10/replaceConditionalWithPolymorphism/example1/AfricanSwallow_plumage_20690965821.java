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

public class AfricanSwallow_plumage_20690965821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AfricanSwallow_plumage_20690965821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.AfricanSwallow"));
        setField(term1, term1.getClass(), "type", "PAEBtnZtTD");
        setIntField(term1, term1.getClass(), "numberOfCoconuts", 568599855);
        setIntField(term1, term1.getClass(), "voltage", 1162663216);
        setBooleanField(term1, term1.getClass(), "isNailed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.replaceConditionalWithPolymorphism.example1.AfricanSwallow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "plumage", argTypes, term1, args);
    }

};


