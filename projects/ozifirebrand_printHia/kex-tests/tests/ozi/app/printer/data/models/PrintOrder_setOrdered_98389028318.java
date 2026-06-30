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
import java.lang.Boolean;

public class PrintOrder_setOrdered_98389028318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29198;
     Object term29270;

    public PrintOrder_setOrdered_98389028318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29303 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term29302 = ((Class) term29303).getDeclaredField((String) "ORDERED");
        ((Field) term29302).setAccessible(true);
        Object enum100 = ((Field) term29302).get((Object) null);
        term29198 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term29226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29241 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29198, term29198.getClass(), "id", "cmuaUiHMVL");
        setField(term29198, term29198.getClass(), "imageUrl", "xjoSGPWUgu");
        setDoubleField(term29198, term29198.getClass(), "size", 0.9184034277897645);
        setIntField(term29198, term29198.getClass(), "quantity", 444029505);
        setDoubleField(term29198, term29198.getClass(), "price", 0.9457448635091538);
        setIntField(term29227, term29227.getClass(), "year", 2025);
        setShortField(term29227, term29227.getClass(), "month", (short) 11);
        setShortField(term29227, term29227.getClass(), "day", (short) 16);
        setField(term29226, term29226.getClass(), "date", term29227);
        setByteField(term29231, term29231.getClass(), "hour", (byte) 12);
        setByteField(term29231, term29231.getClass(), "minute", (byte) 27);
        setByteField(term29231, term29231.getClass(), "second", (byte) 36);
        setIntField(term29231, term29231.getClass(), "nano", 699989217);
        setField(term29226, term29226.getClass(), "time", term29231);
        setField(term29198, term29198.getClass(), "orderDate", term29226);
        setIntField(term29237, term29237.getClass(), "year", 2018);
        setShortField(term29237, term29237.getClass(), "month", (short) 10);
        setShortField(term29237, term29237.getClass(), "day", (short) 3);
        setField(term29236, term29236.getClass(), "date", term29237);
        setByteField(term29241, term29241.getClass(), "hour", (byte) 12);
        setByteField(term29241, term29241.getClass(), "minute", (byte) 49);
        setByteField(term29241, term29241.getClass(), "second", (byte) 38);
        setIntField(term29241, term29241.getClass(), "nano", 549840711);
        setField(term29236, term29236.getClass(), "time", term29241);
        setField(term29198, term29198.getClass(), "deliveryDate", term29236);
        setBooleanField(term29198, term29198.getClass(), "ordered", false);
        setField(term29198, term29198.getClass(), "userId", "uzmqjnOUXu");
        setField(term29198, term29198.getClass(), "orderStatus", enum100);
        term29270 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term29270;
        callMethod(klass, "setOrdered", argTypes, term29198, args);
    }

};


