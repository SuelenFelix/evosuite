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
import java.lang.Double;

public class OrderCreationResponse_setPrice_50834146832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5592;
     Object term5597;

    public OrderCreationResponse_setPrice_50834146832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5592 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5592, term5592.getClass(), "id", null);
        setField(term5592, term5592.getClass(), "imageUrl", null);
        setDoubleField(term5592, term5592.getClass(), "size", 0.0);
        setIntField(term5592, term5592.getClass(), "quantity", 0);
        setDoubleField(term5592, term5592.getClass(), "price", 0.0);
        setField(term5592, term5592.getClass(), "orderDate", null);
        setField(term5592, term5592.getClass(), "deliveryDate", null);
        setBooleanField(term5592, term5592.getClass(), "ordered", false);
        setField(term5592, term5592.getClass(), "orderStatus", null);
        term5597 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term5597;
        callMethod(klass, "setPrice", argTypes, term5592, args);
    }

};


