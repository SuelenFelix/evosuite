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

public class ChargeCalculator_charge_16394594372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33;

    public ChargeCalculator_charge_16394594372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.ChargeCalculator"));
        Object term34 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer"));
        Object term37 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider"));
        setDoubleField(term34, term34.getClass(), "baseRate", 0.6076495596892013);
        setField(term33, term33.getClass(), "customer", term34);
        setIntField(term33, term33.getClass(), "usage", -1922583790);
        setDoubleField(term37, term37.getClass(), "connectionCharge", 0.37773193782763337);
        setField(term33, term33.getClass(), "provider", term37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.ChargeCalculator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "charge", argTypes, term33, args);
    }

};


