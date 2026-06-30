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

public class OrderCreationResponse_getSize_125242832021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5533;

    public OrderCreationResponse_getSize_125242832021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5533 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5533, term5533.getClass(), "id", null);
        setField(term5533, term5533.getClass(), "imageUrl", null);
        setDoubleField(term5533, term5533.getClass(), "size", 0.0);
        setIntField(term5533, term5533.getClass(), "quantity", 0);
        setDoubleField(term5533, term5533.getClass(), "price", 0.0);
        setField(term5533, term5533.getClass(), "orderDate", null);
        setField(term5533, term5533.getClass(), "deliveryDate", null);
        setBooleanField(term5533, term5533.getClass(), "ordered", false);
        setField(term5533, term5533.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term5533, args);
    }

};


