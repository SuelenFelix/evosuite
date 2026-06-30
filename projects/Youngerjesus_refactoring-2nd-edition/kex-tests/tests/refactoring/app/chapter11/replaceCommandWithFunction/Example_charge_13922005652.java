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

public class Example_charge_13922005652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term9;
     Object term11;
     Object term13;

    public Example_charge_13922005652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example"));
        term9 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer"));
        setDoubleField(term9, term9.getClass(), "baseRate", 0.5523635872663106);
        term11 = new Integer(1162663216);
        term13 = newInstance(Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider"));
        setDoubleField(term13, term13.getClass(), "connectionCharge", 0.544608645520025);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Example");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Customer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("refactoring.app.chapter11.replaceCommandWithFunction.Provider");
        Object[] args = new Object[3];
        args[0] = term9;
        args[1] = term11;
        args[2] = term13;
        callMethod(klass, "charge", argTypes, term8, args);
    }

};


