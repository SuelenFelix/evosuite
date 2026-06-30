package refactoring.app.chapter06.splitPhase;

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
import static refactoring.app.chapter06.splitPhase.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class After_calculatePricingData_9726033022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term27;
     Object term31;

    public After_calculatePricingData_9726033022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.After"));
        term27 = newInstance(Class.forName("refactoring.app.chapter06.splitPhase.Product"));
        setIntField(term27, term27.getClass(), "basePrice", 1585847225);
        setIntField(term27, term27.getClass(), "discountRate", 597278769);
        setIntField(term27, term27.getClass(), "discountThreshold", -1685132342);
        term31 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.splitPhase.After");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter06.splitPhase.Product");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term27;
        args[1] = term31;
        callMethod(klass, "calculatePricingData", argTypes, term26, args);
    }

};


