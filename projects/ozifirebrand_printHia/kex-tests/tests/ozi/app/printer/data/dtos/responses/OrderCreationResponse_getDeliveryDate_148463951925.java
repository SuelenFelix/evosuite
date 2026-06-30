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

public class OrderCreationResponse_getDeliveryDate_148463951925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5553;

    public OrderCreationResponse_getDeliveryDate_148463951925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5553 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        setField(term5553, term5553.getClass(), "id", null);
        setField(term5553, term5553.getClass(), "imageUrl", null);
        setDoubleField(term5553, term5553.getClass(), "size", 0.0);
        setIntField(term5553, term5553.getClass(), "quantity", 0);
        setDoubleField(term5553, term5553.getClass(), "price", 0.0);
        setField(term5553, term5553.getClass(), "orderDate", null);
        setField(term5553, term5553.getClass(), "deliveryDate", null);
        setBooleanField(term5553, term5553.getClass(), "ordered", false);
        setField(term5553, term5553.getClass(), "orderStatus", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliveryDate", argTypes, term5553, args);
    }

};


