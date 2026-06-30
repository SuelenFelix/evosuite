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

public class PrintOrder_toString_47622560524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31432;

    public PrintOrder_toString_47622560524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31535 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term31534 = ((Class) term31535).getDeclaredField((String) "PENDING");
        ((Field) term31534).setAccessible(true);
        Object enum107 = ((Field) term31534).get((Object) null);
        term31432 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term31460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31475 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31432, term31432.getClass(), "id", "zHvfKaOstO");
        setField(term31432, term31432.getClass(), "imageUrl", "tOszriqETr");
        setDoubleField(term31432, term31432.getClass(), "size", 0.3107086749915061);
        setIntField(term31432, term31432.getClass(), "quantity", -1888585309);
        setDoubleField(term31432, term31432.getClass(), "price", 0.18330246984174836);
        setIntField(term31461, term31461.getClass(), "year", 2013);
        setShortField(term31461, term31461.getClass(), "month", (short) 1);
        setShortField(term31461, term31461.getClass(), "day", (short) 17);
        setField(term31460, term31460.getClass(), "date", term31461);
        setByteField(term31465, term31465.getClass(), "hour", (byte) 19);
        setByteField(term31465, term31465.getClass(), "minute", (byte) 49);
        setByteField(term31465, term31465.getClass(), "second", (byte) 53);
        setIntField(term31465, term31465.getClass(), "nano", 217542739);
        setField(term31460, term31460.getClass(), "time", term31465);
        setField(term31432, term31432.getClass(), "orderDate", term31460);
        setIntField(term31471, term31471.getClass(), "year", 2025);
        setShortField(term31471, term31471.getClass(), "month", (short) 8);
        setShortField(term31471, term31471.getClass(), "day", (short) 8);
        setField(term31470, term31470.getClass(), "date", term31471);
        setByteField(term31475, term31475.getClass(), "hour", (byte) 12);
        setByteField(term31475, term31475.getClass(), "minute", (byte) 29);
        setByteField(term31475, term31475.getClass(), "second", (byte) 36);
        setIntField(term31475, term31475.getClass(), "nano", 329488602);
        setField(term31470, term31470.getClass(), "time", term31475);
        setField(term31432, term31432.getClass(), "deliveryDate", term31470);
        setBooleanField(term31432, term31432.getClass(), "ordered", true);
        setField(term31432, term31432.getClass(), "userId", "ncSPTkhKjO");
        setField(term31432, term31432.getClass(), "orderStatus", enum107);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31432, args);
    }

};


