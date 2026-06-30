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

public class OrderCreationRequest_setQuantity_195809708720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;
     Object term696;

    public OrderCreationRequest_setQuantity_195809708720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest"));
        setField(term693, term693.getClass(), "imageUrl", null);
        setDoubleField(term693, term693.getClass(), "size", 0.0);
        setIntField(term693, term693.getClass(), "quantity", 0);
        setField(term693, term693.getClass(), "userId", null);
        term696 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term696;
        callMethod(klass, "setQuantity", argTypes, term693, args);
    }

};


