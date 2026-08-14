package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Customer_setType_213706986918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44740;

    public Customer_setType_213706986918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44740 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        setField(term44740, term44740.getClass(), "id", null);
        setField(term44740, term44740.getClass(), "name", null);
        setField(term44740, term44740.getClass(), "type", null);
        setField(term44740, term44740.getClass(), "customerOrderGroup", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Customer$Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term44740, args);
    }

};


