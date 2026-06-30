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
import java.lang.Double;

public class OrderCreationResponse_setSize_170750812812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3437;
     Object term3497;

    public OrderCreationResponse_setSize_170750812812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3520 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term3519 = ((Class) term3520).getDeclaredField((String) "ORDERED");
        ((Field) term3519).setAccessible(true);
        Object enum11 = ((Field) term3519).get((Object) null);
        term3437 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term3465 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3466 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3470 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3475 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3476 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3480 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3437, term3437.getClass(), "id", "BYqFIqCKAV");
        setField(term3437, term3437.getClass(), "imageUrl", "vrQLuWIDJX");
        setDoubleField(term3437, term3437.getClass(), "size", 0.43692187681405226);
        setIntField(term3437, term3437.getClass(), "quantity", -522618178);
        setDoubleField(term3437, term3437.getClass(), "price", 0.7633268466829064);
        setIntField(term3466, term3466.getClass(), "year", 2015);
        setShortField(term3466, term3466.getClass(), "month", (short) 3);
        setShortField(term3466, term3466.getClass(), "day", (short) 10);
        setField(term3465, term3465.getClass(), "date", term3466);
        setByteField(term3470, term3470.getClass(), "hour", (byte) 23);
        setByteField(term3470, term3470.getClass(), "minute", (byte) 34);
        setByteField(term3470, term3470.getClass(), "second", (byte) 44);
        setIntField(term3470, term3470.getClass(), "nano", 587322824);
        setField(term3465, term3465.getClass(), "time", term3470);
        setField(term3437, term3437.getClass(), "orderDate", term3465);
        setIntField(term3476, term3476.getClass(), "year", 2027);
        setShortField(term3476, term3476.getClass(), "month", (short) 8);
        setShortField(term3476, term3476.getClass(), "day", (short) 26);
        setField(term3475, term3475.getClass(), "date", term3476);
        setByteField(term3480, term3480.getClass(), "hour", (byte) 5);
        setByteField(term3480, term3480.getClass(), "minute", (byte) 11);
        setByteField(term3480, term3480.getClass(), "second", (byte) 9);
        setIntField(term3480, term3480.getClass(), "nano", 219245092);
        setField(term3475, term3475.getClass(), "time", term3480);
        setField(term3437, term3437.getClass(), "deliveryDate", term3475);
        setBooleanField(term3437, term3437.getClass(), "ordered", true);
        setField(term3437, term3437.getClass(), "orderStatus", enum11);
        term3497 = new Double(0.13481025392611334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3497;
        callMethod(klass, "setSize", argTypes, term3437, args);
    }

};


