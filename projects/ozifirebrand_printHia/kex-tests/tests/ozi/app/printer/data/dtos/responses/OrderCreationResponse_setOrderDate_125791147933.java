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

public class OrderCreationResponse_setOrderDate_125791147933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5599;

    public OrderCreationResponse_setOrderDate_125791147933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5599 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5599, term5599.getClass(), "id", null);
        setField(term5599, term5599.getClass(), "imageUrl", null);
        setDoubleField(term5599, term5599.getClass(), "size", 0.0);
        setIntField(term5599, term5599.getClass(), "quantity", 0);
        setDoubleField(term5599, term5599.getClass(), "price", 0.0);
        setField(term5599, term5599.getClass(), "orderDate", null);
        setField(term5599, term5599.getClass(), "deliveryDate", null);
        setBooleanField(term5599, term5599.getClass(), "ordered", false);
        setField(term5599, term5599.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrderDate", argTypes, term5599, args);
    }

};


