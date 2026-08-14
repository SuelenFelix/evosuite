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

public class Order_getId_195690676016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13005;

    public Order_getId_195690676016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13005 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term13005, term13005.getClass(), "id", null);
        setField(term13005, term13005.getClass(), "orderState", null);
        setField(term13005, term13005.getClass(), "orderType", null);
        setField(term13005, term13005.getClass(), "customerOrderGroup", null);
        setField(term13005, term13005.getClass(), "items", null);
        setField(term13005, term13005.getClass(), "taxRules", null);
        setField(term13005, term13005.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13005, args);
    }

};


