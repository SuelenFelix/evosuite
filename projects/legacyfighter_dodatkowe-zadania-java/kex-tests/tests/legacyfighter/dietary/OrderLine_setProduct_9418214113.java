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

public class OrderLine_setProduct_9418214113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29539;

    public OrderLine_setProduct_9418214113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29539 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term29539, term29539.getClass(), "id", null);
        setField(term29539, term29539.getClass(), "price", null);
        setField(term29539, term29539.getClass(), "order", null);
        setField(term29539, term29539.getClass(), "product", null);
        setIntField(term29539, term29539.getClass(), "quantity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Product");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setProduct", argTypes, term29539, args);
    }

};


