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

public class OrderCreationResponse_setId_111545242228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5568;

    public OrderCreationResponse_setId_111545242228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5568 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5568, term5568.getClass(), "id", null);
        setField(term5568, term5568.getClass(), "imageUrl", null);
        setDoubleField(term5568, term5568.getClass(), "size", 0.0);
        setIntField(term5568, term5568.getClass(), "quantity", 0);
        setDoubleField(term5568, term5568.getClass(), "price", 0.0);
        setField(term5568, term5568.getClass(), "orderDate", null);
        setField(term5568, term5568.getClass(), "deliveryDate", null);
        setBooleanField(term5568, term5568.getClass(), "ordered", false);
        setField(term5568, term5568.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term5568, args);
    }

};


