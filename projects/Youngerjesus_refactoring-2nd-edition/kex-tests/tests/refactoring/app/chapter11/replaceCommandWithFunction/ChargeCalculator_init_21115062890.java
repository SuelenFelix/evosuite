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
import java.lang.Integer;

public class ChargeCalculator_init_21115062890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term23;
     Object term25;

    public ChargeCalculator_init_21115062890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer"));
        setDoubleField(term21, term21.getClass(), "baseRate", 0.28570734989730284);
        term23 = new Integer(1484323161);
        term25 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider"));
        setDoubleField(term25, term25.getClass(), "connectionCharge", 0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.ChargeCalculator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider");
        Object[] args = new Object[3];
        args[0] = term21;
        args[1] = term23;
        args[2] = term25;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


