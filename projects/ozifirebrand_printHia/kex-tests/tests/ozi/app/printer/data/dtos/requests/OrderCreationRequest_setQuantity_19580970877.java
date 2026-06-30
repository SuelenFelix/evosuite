package ozi.app.printer.data.dtos.requests;

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
import static ozi.app.printer.data.dtos.requests.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class OrderCreationRequest_setQuantity_19580970877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term392;

    public OrderCreationRequest_setQuantity_19580970877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest"));
        setField(term365, term365.getClass(), "imageUrl", "LQFpaHEwXR");
        setDoubleField(term365, term365.getClass(), "size", 0.9828442029246764);
        setIntField(term365, term365.getClass(), "quantity", 597278769);
        setField(term365, term365.getClass(), "userId", "oVcInYnLWB");
        term392 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term392;
        callMethod(klass, "setQuantity", argTypes, term365, args);
    }

};


