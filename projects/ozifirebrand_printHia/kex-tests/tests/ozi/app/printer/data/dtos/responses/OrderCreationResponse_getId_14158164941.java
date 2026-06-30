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

public class OrderCreationResponse_getId_14158164941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public OrderCreationResponse_getId_14158164941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term116 = ((Class) term117).getDeclaredField((String) "PENDING");
        ((Field) term116).setAccessible(true);
        Object enum0 = ((Field) term116).get((Object) null);
        term1 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term29 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34 = newInstance(Class.forName("java.time.LocalTime"));
        Object term39 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40 = newInstance(Class.forName("java.time.LocalDate"));
        Object term44 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "imageUrl", "sjlJAEtRrb");
        setDoubleField(term1, term1.getClass(), "size", 0.13238746331190498);
        setIntField(term1, term1.getClass(), "quantity", 568599855);
        setDoubleField(term1, term1.getClass(), "price", 0.3455959125047594);
        setIntField(term30, term30.getClass(), "year", 2012);
        setShortField(term30, term30.getClass(), "month", (short) 8);
        setShortField(term30, term30.getClass(), "day", (short) 25);
        setField(term29, term29.getClass(), "date", term30);
        setByteField(term34, term34.getClass(), "hour", (byte) 5);
        setByteField(term34, term34.getClass(), "minute", (byte) 20);
        setByteField(term34, term34.getClass(), "second", (byte) 50);
        setIntField(term34, term34.getClass(), "nano", 345595912);
        setField(term29, term29.getClass(), "time", term34);
        setField(term1, term1.getClass(), "orderDate", term29);
        setIntField(term40, term40.getClass(), "year", 2021);
        setShortField(term40, term40.getClass(), "month", (short) 1);
        setShortField(term40, term40.getClass(), "day", (short) 18);
        setField(term39, term39.getClass(), "date", term40);
        setByteField(term44, term44.getClass(), "hour", (byte) 13);
        setByteField(term44, term44.getClass(), "minute", (byte) 38);
        setByteField(term44, term44.getClass(), "second", (byte) 26);
        setIntField(term44, term44.getClass(), "nano", 544608644);
        setField(term39, term39.getClass(), "time", term44);
        setField(term1, term1.getClass(), "deliveryDate", term39);
        setBooleanField(term1, term1.getClass(), "ordered", true);
        setField(term1, term1.getClass(), "orderStatus", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


