package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PrintOrder_setImageUrl_129235681512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27184;

    public PrintOrder_setImageUrl_129235681512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27299 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term27298 = ((Class) term27299).getDeclaredField((String) "PENDING");
        ((Field) term27298).setAccessible(true);
        Object enum94 = ((Field) term27298).get((Object) null);
        term27184 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term27212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27217 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27222 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27223 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27227 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27184, term27184.getClass(), "id", "CNqMxLvtcJ");
        setField(term27184, term27184.getClass(), "imageUrl", "ktbqerIaKW");
        setDoubleField(term27184, term27184.getClass(), "size", 0.6693176553622628);
        setIntField(term27184, term27184.getClass(), "quantity", 1114000454);
        setDoubleField(term27184, term27184.getClass(), "price", 0.2962868255626906);
        setIntField(term27213, term27213.getClass(), "year", 2029);
        setShortField(term27213, term27213.getClass(), "month", (short) 7);
        setShortField(term27213, term27213.getClass(), "day", (short) 14);
        setField(term27212, term27212.getClass(), "date", term27213);
        setByteField(term27217, term27217.getClass(), "hour", (byte) 17);
        setByteField(term27217, term27217.getClass(), "minute", (byte) 37);
        setByteField(term27217, term27217.getClass(), "second", (byte) 39);
        setIntField(term27217, term27217.getClass(), "nano", 333402299);
        setField(term27212, term27212.getClass(), "time", term27217);
        setField(term27184, term27184.getClass(), "orderDate", term27212);
        setIntField(term27223, term27223.getClass(), "year", 2025);
        setShortField(term27223, term27223.getClass(), "month", (short) 10);
        setShortField(term27223, term27223.getClass(), "day", (short) 30);
        setField(term27222, term27222.getClass(), "date", term27223);
        setByteField(term27227, term27227.getClass(), "hour", (byte) 1);
        setByteField(term27227, term27227.getClass(), "minute", (byte) 4);
        setByteField(term27227, term27227.getClass(), "second", (byte) 18);
        setIntField(term27227, term27227.getClass(), "nano", 717716253);
        setField(term27222, term27222.getClass(), "time", term27227);
        setField(term27184, term27184.getClass(), "deliveryDate", term27222);
        setBooleanField(term27184, term27184.getClass(), "ordered", false);
        setField(term27184, term27184.getClass(), "userId", "VoghngXfsK");
        setField(term27184, term27184.getClass(), "orderStatus", enum94);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GbahCBMvct";
        callMethod(klass, "setImageUrl", argTypes, term27184, args);
    }

};


