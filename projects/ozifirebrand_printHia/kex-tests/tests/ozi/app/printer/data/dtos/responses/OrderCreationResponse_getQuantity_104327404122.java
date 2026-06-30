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

public class OrderCreationResponse_getQuantity_104327404122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5538;

    public OrderCreationResponse_getQuantity_104327404122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5538 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5538, term5538.getClass(), "id", null);
        setField(term5538, term5538.getClass(), "imageUrl", null);
        setDoubleField(term5538, term5538.getClass(), "size", 0.0);
        setIntField(term5538, term5538.getClass(), "quantity", 0);
        setDoubleField(term5538, term5538.getClass(), "price", 0.0);
        setField(term5538, term5538.getClass(), "orderDate", null);
        setField(term5538, term5538.getClass(), "deliveryDate", null);
        setBooleanField(term5538, term5538.getClass(), "ordered", false);
        setField(term5538, term5538.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term5538, args);
    }

};


