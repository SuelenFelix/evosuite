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

public class OrderCreationResponse_setId_111545242210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2787;

    public OrderCreationResponse_setId_111545242210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2880 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term2879 = ((Class) term2880).getDeclaredField((String) "ORDERED");
        ((Field) term2879).setAccessible(true);
        Object enum9 = ((Field) term2879).get((Object) null);
        term2787 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term2815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2820 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2830 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2787, term2787.getClass(), "id", "HyxfbSQYBe");
        setField(term2787, term2787.getClass(), "imageUrl", "pCTimMblYc");
        setDoubleField(term2787, term2787.getClass(), "size", 0.6436713023569729);
        setIntField(term2787, term2787.getClass(), "quantity", -1339778481);
        setDoubleField(term2787, term2787.getClass(), "price", 0.7332741045694002);
        setIntField(term2816, term2816.getClass(), "year", 2017);
        setShortField(term2816, term2816.getClass(), "month", (short) 3);
        setShortField(term2816, term2816.getClass(), "day", (short) 5);
        setField(term2815, term2815.getClass(), "date", term2816);
        setByteField(term2820, term2820.getClass(), "hour", (byte) 20);
        setByteField(term2820, term2820.getClass(), "minute", (byte) 34);
        setByteField(term2820, term2820.getClass(), "second", (byte) 55);
        setIntField(term2820, term2820.getClass(), "nano", 78024496);
        setField(term2815, term2815.getClass(), "time", term2820);
        setField(term2787, term2787.getClass(), "orderDate", term2815);
        setIntField(term2826, term2826.getClass(), "year", 2020);
        setShortField(term2826, term2826.getClass(), "month", (short) 7);
        setShortField(term2826, term2826.getClass(), "day", (short) 24);
        setField(term2825, term2825.getClass(), "date", term2826);
        setByteField(term2830, term2830.getClass(), "hour", (byte) 0);
        setByteField(term2830, term2830.getClass(), "minute", (byte) 59);
        setByteField(term2830, term2830.getClass(), "second", (byte) 56);
        setIntField(term2830, term2830.getClass(), "nano", 320219201);
        setField(term2825, term2825.getClass(), "time", term2830);
        setField(term2787, term2787.getClass(), "deliveryDate", term2825);
        setBooleanField(term2787, term2787.getClass(), "ordered", true);
        setField(term2787, term2787.getClass(), "orderStatus", enum9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "setId", argTypes, term2787, args);
    }

};


