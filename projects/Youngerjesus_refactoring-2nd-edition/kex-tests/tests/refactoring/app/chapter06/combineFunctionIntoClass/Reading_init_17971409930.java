package refactoring.app.chapter06.combineFunctionIntoClass;

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
import static refactoring.app.chapter06.combineFunctionIntoClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Reading_init_17971409930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;
     Object term6;

    public Reading_init_17971409930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Customer"));
        term2 = new Integer(568599855);
        term4 = new Integer(1162663216);
        term6 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Customer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term1;
        args[1] = term2;
        args[2] = term4;
        args[3] = term6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


