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
import java.lang.Integer;

public class OrderCreationResponse_setQuantity_182103250731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5585;
     Object term5590;

    public OrderCreationResponse_setQuantity_182103250731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5585 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5585, term5585.getClass(), "id", null);
        setField(term5585, term5585.getClass(), "imageUrl", null);
        setDoubleField(term5585, term5585.getClass(), "size", 0.0);
        setIntField(term5585, term5585.getClass(), "quantity", 0);
        setDoubleField(term5585, term5585.getClass(), "price", 0.0);
        setField(term5585, term5585.getClass(), "orderDate", null);
        setField(term5585, term5585.getClass(), "deliveryDate", null);
        setBooleanField(term5585, term5585.getClass(), "ordered", false);
        setField(term5585, term5585.getClass(), "orderStatus", null);
        term5590 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5590;
        callMethod(klass, "setQuantity", argTypes, term5585, args);
    }

};


