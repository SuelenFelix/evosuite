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

public class OrderCreationRequest_canEqual_87191857510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term531;
     Object term558;

    public OrderCreationRequest_canEqual_87191857510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term531 = newInstance(Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest"));
        setField(term531, term531.getClass(), "imageUrl", "hNxWaHcfhY");
        setDoubleField(term531, term531.getClass(), "size", 0.7332741045694002);
        setIntField(term531, term531.getClass(), "quantity", 1048535127);
        setField(term531, term531.getClass(), "userId", "RkybSrpybU");
        term558 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.requests.OrderCreationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term558;
        callMethod(klass, "canEqual", argTypes, term531, args);
    }

};


