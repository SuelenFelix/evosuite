package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class OrderCreationResponse_getQuantity_10432740414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term953;

    public OrderCreationResponse_getQuantity_10432740414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1036 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1035 = ((Class) term1036).getDeclaredField((String) "DELIVERED");
        ((Field) term1035).setAccessible(true);
        Object enum3 = ((Field) term1035).get((Object) null);
        term953 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term996 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term953, term953.getClass(), "id", "SzjVpOQTyS");
        setField(term953, term953.getClass(), "imageUrl", "MjGYSRKTNF");
        setDoubleField(term953, term953.getClass(), "size", 0.2641345529914265);
        setIntField(term953, term953.getClass(), "quantity", 391863371);
        setDoubleField(term953, term953.getClass(), "price", 0.36923381893433327);
        setIntField(term982, term982.getClass(), "year", 2025);
        setShortField(term982, term982.getClass(), "month", (short) 4);
        setShortField(term982, term982.getClass(), "day", (short) 24);
        setField(term981, term981.getClass(), "date", term982);
        setByteField(term986, term986.getClass(), "hour", (byte) 18);
        setByteField(term986, term986.getClass(), "minute", (byte) 11);
        setByteField(term986, term986.getClass(), "second", (byte) 40);
        setIntField(term986, term986.getClass(), "nano", 137454929);
        setField(term981, term981.getClass(), "time", term986);
        setField(term953, term953.getClass(), "orderDate", term981);
        setIntField(term992, term992.getClass(), "year", 2024);
        setShortField(term992, term992.getClass(), "month", (short) 1);
        setShortField(term992, term992.getClass(), "day", (short) 24);
        setField(term991, term991.getClass(), "date", term992);
        setByteField(term996, term996.getClass(), "hour", (byte) 20);
        setByteField(term996, term996.getClass(), "minute", (byte) 28);
        setByteField(term996, term996.getClass(), "second", (byte) 39);
        setIntField(term996, term996.getClass(), "nano", 952728177);
        setField(term991, term991.getClass(), "time", term996);
        setField(term953, term953.getClass(), "deliveryDate", term991);
        setBooleanField(term953, term953.getClass(), "ordered", true);
        setField(term953, term953.getClass(), "orderStatus", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term953, args);
    }

};


