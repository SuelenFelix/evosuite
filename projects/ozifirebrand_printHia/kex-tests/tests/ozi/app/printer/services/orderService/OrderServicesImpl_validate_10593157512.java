package ozi.app.printer.services.orderService;

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
import static ozi.app.printer.services.orderService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OrderServicesImpl_validate_10593157512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48;

    public OrderServicesImpl_validate_10593157512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest"));
        setField(term48, term48.getClass(), "imageUrl", "MuLcgQHgqz");
        setDoubleField(term48, term48.getClass(), "size", 0.3455959125047594);
        setIntField(term48, term48.getClass(), "quantity", 1162663216);
        setField(term48, term48.getClass(), "userId", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Object[] args = new Object[1];
        args[0] = term48;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


