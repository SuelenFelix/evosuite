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
import java.lang.Object;

public class Reading_baseRate_17929150182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public Reading_baseRate_17929150182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading"));
        Object term14 = newInstance(Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Customer"));
        setField(term13, term13.getClass(), "customer", term14);
        setIntField(term13, term13.getClass(), "quantity", -1955890973);
        setIntField(term13, term13.getClass(), "month", -2038273078);
        setIntField(term13, term13.getClass(), "year", 1227103734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.combineFunctionIntoClass.Reading");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "baseRate", argTypes, term13, args);
    }

};


