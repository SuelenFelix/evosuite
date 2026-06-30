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
import java.lang.Double;

public class PrintOrder_setPrice_4418792615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28185;
     Object term28257;

    public PrintOrder_setPrice_4418792615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28290 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term28289 = ((Class) term28290).getDeclaredField((String) "ORDERED");
        ((Field) term28289).setAccessible(true);
        Object enum97 = ((Field) term28289).get((Object) null);
        term28185 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term28213 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28214 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28218 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28224 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28228 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28185, term28185.getClass(), "id", "ZUdnQXfzCI");
        setField(term28185, term28185.getClass(), "imageUrl", "EULDrUNQvw");
        setDoubleField(term28185, term28185.getClass(), "size", 0.7814864708383836);
        setIntField(term28185, term28185.getClass(), "quantity", -505439934);
        setDoubleField(term28185, term28185.getClass(), "price", 0.5657654165545906);
        setIntField(term28214, term28214.getClass(), "year", 2022);
        setShortField(term28214, term28214.getClass(), "month", (short) 5);
        setShortField(term28214, term28214.getClass(), "day", (short) 29);
        setField(term28213, term28213.getClass(), "date", term28214);
        setByteField(term28218, term28218.getClass(), "hour", (byte) 11);
        setByteField(term28218, term28218.getClass(), "minute", (byte) 41);
        setByteField(term28218, term28218.getClass(), "second", (byte) 43);
        setIntField(term28218, term28218.getClass(), "nano", 984890757);
        setField(term28213, term28213.getClass(), "time", term28218);
        setField(term28185, term28185.getClass(), "orderDate", term28213);
        setIntField(term28224, term28224.getClass(), "year", 2029);
        setShortField(term28224, term28224.getClass(), "month", (short) 4);
        setShortField(term28224, term28224.getClass(), "day", (short) 27);
        setField(term28223, term28223.getClass(), "date", term28224);
        setByteField(term28228, term28228.getClass(), "hour", (byte) 16);
        setByteField(term28228, term28228.getClass(), "minute", (byte) 25);
        setByteField(term28228, term28228.getClass(), "second", (byte) 10);
        setIntField(term28228, term28228.getClass(), "nano", 699018782);
        setField(term28223, term28223.getClass(), "time", term28228);
        setField(term28185, term28185.getClass(), "deliveryDate", term28223);
        setBooleanField(term28185, term28185.getClass(), "ordered", true);
        setField(term28185, term28185.getClass(), "userId", "BtvAvsJSei");
        setField(term28185, term28185.getClass(), "orderStatus", enum97);
        term28257 = new Double(0.6382060245198228);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term28257;
        callMethod(klass, "setPrice", argTypes, term28185, args);
    }

};


