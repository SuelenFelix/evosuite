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

public class OrderUpdateRequest_getQuantity_13231695311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public OrderUpdateRequest_getQuantity_13231695311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderUpdateRequest"));
        setDoubleField(term34, term34.getClass(), "size", 0.0);
        setIntField(term34, term34.getClass(), "quantity", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.OrderUpdateRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term34, args);
    }

};


