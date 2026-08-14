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
import java.lang.Long;

public class CustomerService_getCustomerBy_13214491261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33156;

    public CustomerService_getCustomerBy_13214491261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33156 = new Long(-2000525962887472969L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term33156;
        callMethod(klass, "getCustomerBy", argTypes, null, args);
    }

};


