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

public class OrderLine_setOrder_3515389117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29549;

    public OrderLine_setOrder_3515389117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29549 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term29549, term29549.getClass(), "id", null);
        setField(term29549, term29549.getClass(), "price", null);
        setField(term29549, term29549.getClass(), "order", null);
        setField(term29549, term29549.getClass(), "product", null);
        setIntField(term29549, term29549.getClass(), "quantity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Order");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrder", argTypes, term29549, args);
    }

};


