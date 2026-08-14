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
import java.lang.Integer;

public class OrderLine_setQuantity_109288829815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29543;
     Object term29545;

    public OrderLine_setQuantity_109288829815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29543 = newInstance(Class.forName("legacyfighter.dietary.OrderLine"));
        setField(term29543, term29543.getClass(), "id", null);
        setField(term29543, term29543.getClass(), "price", null);
        setField(term29543, term29543.getClass(), "order", null);
        setField(term29543, term29543.getClass(), "product", null);
        setIntField(term29543, term29543.getClass(), "quantity", 0);
        term29545 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderLine");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29545;
        callMethod(klass, "setQuantity", argTypes, term29543, args);
    }

};


