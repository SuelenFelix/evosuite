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

public class OrderCreationResponse_setOrderStatus_138050377617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4986;
     Object enum17;

    public OrderCreationResponse_setOrderStatus_138050377617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5078 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term5077 = ((Class) term5078).getDeclaredField((String) "PENDING");
        ((Field) term5077).setAccessible(true);
        Object enum16 = ((Field) term5077).get((Object) null);
        term4986 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term5014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5024 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5025 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5029 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4986, term4986.getClass(), "id", "kuTXqwMtDB");
        setField(term4986, term4986.getClass(), "imageUrl", "Ghbwtircqb");
        setDoubleField(term4986, term4986.getClass(), "size", 0.9737083944266686);
        setIntField(term4986, term4986.getClass(), "quantity", -1456670397);
        setDoubleField(term4986, term4986.getClass(), "price", 0.0668892744806211);
        setIntField(term5015, term5015.getClass(), "year", 2010);
        setShortField(term5015, term5015.getClass(), "month", (short) 5);
        setShortField(term5015, term5015.getClass(), "day", (short) 2);
        setField(term5014, term5014.getClass(), "date", term5015);
        setByteField(term5019, term5019.getClass(), "hour", (byte) 2);
        setByteField(term5019, term5019.getClass(), "minute", (byte) 22);
        setByteField(term5019, term5019.getClass(), "second", (byte) 33);
        setIntField(term5019, term5019.getClass(), "nano", 530835039);
        setField(term5014, term5014.getClass(), "time", term5019);
        setField(term4986, term4986.getClass(), "orderDate", term5014);
        setIntField(term5025, term5025.getClass(), "year", 2024);
        setShortField(term5025, term5025.getClass(), "month", (short) 4);
        setShortField(term5025, term5025.getClass(), "day", (short) 24);
        setField(term5024, term5024.getClass(), "date", term5025);
        setByteField(term5029, term5029.getClass(), "hour", (byte) 7);
        setByteField(term5029, term5029.getClass(), "minute", (byte) 2);
        setByteField(term5029, term5029.getClass(), "second", (byte) 51);
        setIntField(term5029, term5029.getClass(), "nano", 635502964);
        setField(term5024, term5024.getClass(), "time", term5029);
        setField(term4986, term4986.getClass(), "deliveryDate", term5024);
        setBooleanField(term4986, term4986.getClass(), "ordered", true);
        setField(term4986, term4986.getClass(), "orderStatus", enum16);
        Class<? extends Object> term5301 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term5300 = ((Class) term5301).getDeclaredField((String) "ORDERED");
        ((Field) term5300).setAccessible(true);
        enum17 = ((Field) term5300).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.OrderStatus");
        Object[] args = new Object[1];
        args[0] = enum17;
        callMethod(klass, "setOrderStatus", argTypes, term4986, args);
    }

};


