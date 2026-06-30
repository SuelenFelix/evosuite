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
import java.lang.Object;
import java.lang.String;

public class OrderCreationResponse_getImageUrl_2585437692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public OrderCreationResponse_getImageUrl_2585437692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term422 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term421 = ((Class) term422).getDeclaredField((String) "DELIVERED");
        ((Field) term421).setAccessible(true);
        Object enum1 = ((Field) term421).get((Object) null);
        term339 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term382 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term339, term339.getClass(), "id", "MuLcgQHgqz");
        setField(term339, term339.getClass(), "imageUrl", "xxtlPwDYFs");
        setDoubleField(term339, term339.getClass(), "size", 0.5523635872663106);
        setIntField(term339, term339.getClass(), "quantity", 1162663216);
        setDoubleField(term339, term339.getClass(), "price", 0.544608645520025);
        setIntField(term368, term368.getClass(), "year", 2015);
        setShortField(term368, term368.getClass(), "month", (short) 9);
        setShortField(term368, term368.getClass(), "day", (short) 19);
        setField(term367, term367.getClass(), "date", term368);
        setByteField(term372, term372.getClass(), "hour", (byte) 9);
        setByteField(term372, term372.getClass(), "minute", (byte) 4);
        setByteField(term372, term372.getClass(), "second", (byte) 10);
        setIntField(term372, term372.getClass(), "nano", 401765865);
        setField(term367, term367.getClass(), "time", term372);
        setField(term339, term339.getClass(), "orderDate", term367);
        setIntField(term378, term378.getClass(), "year", 2015);
        setShortField(term378, term378.getClass(), "month", (short) 4);
        setShortField(term378, term378.getClass(), "day", (short) 14);
        setField(term377, term377.getClass(), "date", term378);
        setByteField(term382, term382.getClass(), "hour", (byte) 18);
        setByteField(term382, term382.getClass(), "minute", (byte) 24);
        setByteField(term382, term382.getClass(), "second", (byte) 32);
        setIntField(term382, term382.getClass(), "nano", 369233818);
        setField(term377, term377.getClass(), "time", term382);
        setField(term339, term339.getClass(), "deliveryDate", term377);
        setBooleanField(term339, term339.getClass(), "ordered", true);
        setField(term339, term339.getClass(), "orderStatus", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term339, args);
    }

};


