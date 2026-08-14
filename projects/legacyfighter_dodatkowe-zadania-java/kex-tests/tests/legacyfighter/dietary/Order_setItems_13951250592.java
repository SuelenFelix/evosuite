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

public class Order_setItems_13951250592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;

    public Order_setItems_13951250592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3767 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term3767, term3767.getClass(), "id", null);
        setField(term3767, term3767.getClass(), "orderState", null);
        setField(term3767, term3767.getClass(), "orderType", null);
        setField(term3767, term3767.getClass(), "customerOrderGroup", null);
        setField(term3767, term3767.getClass(), "items", null);
        setField(term3767, term3767.getClass(), "taxRules", null);
        setField(term3767, term3767.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setItems", argTypes, term3767, args);
    }

};


