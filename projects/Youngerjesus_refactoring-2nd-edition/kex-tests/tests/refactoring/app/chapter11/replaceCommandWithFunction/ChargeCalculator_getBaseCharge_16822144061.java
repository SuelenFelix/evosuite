package refactoring.app.chapter11.replaceCommandWithFunction;

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
import static refactoring.app.chapter11.replaceCommandWithFunction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChargeCalculator_getBaseCharge_16822144061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public ChargeCalculator_getBaseCharge_16822144061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.ChargeCalculator"));
        Object term28 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer"));
        Object term31 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider"));
        setDoubleField(term28, term28.getClass(), "baseRate", 0.2641345529914265);
        setField(term27, term27.getClass(), "customer", term28);
        setIntField(term27, term27.getClass(), "usage", 391863371);
        setDoubleField(term31, term31.getClass(), "connectionCharge", 0.36923381893433327);
        setField(term27, term27.getClass(), "provider", term31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.ChargeCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseCharge", argTypes, term27, args);
    }

};


