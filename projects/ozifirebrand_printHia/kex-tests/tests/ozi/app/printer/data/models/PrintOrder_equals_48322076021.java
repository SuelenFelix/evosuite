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

public class PrintOrder_equals_48322076021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30439;
     Object term30511;

    public PrintOrder_equals_48322076021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30543 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term30542 = ((Class) term30543).getDeclaredField((String) "ORDERED");
        ((Field) term30542).setAccessible(true);
        Object enum104 = ((Field) term30542).get((Object) null);
        term30439 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term30467 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30468 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30472 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30482 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30439, term30439.getClass(), "id", "NWldOLAbqk");
        setField(term30439, term30439.getClass(), "imageUrl", "qnYaYSpDwO");
        setDoubleField(term30439, term30439.getClass(), "size", 0.48050706663913145);
        setIntField(term30439, term30439.getClass(), "quantity", -894662986);
        setDoubleField(term30439, term30439.getClass(), "price", 0.4990217874180345);
        setIntField(term30468, term30468.getClass(), "year", 2016);
        setShortField(term30468, term30468.getClass(), "month", (short) 11);
        setShortField(term30468, term30468.getClass(), "day", (short) 20);
        setField(term30467, term30467.getClass(), "date", term30468);
        setByteField(term30472, term30472.getClass(), "hour", (byte) 17);
        setByteField(term30472, term30472.getClass(), "minute", (byte) 20);
        setByteField(term30472, term30472.getClass(), "second", (byte) 21);
        setIntField(term30472, term30472.getClass(), "nano", 340096364);
        setField(term30467, term30467.getClass(), "time", term30472);
        setField(term30439, term30439.getClass(), "orderDate", term30467);
        setIntField(term30478, term30478.getClass(), "year", 2024);
        setShortField(term30478, term30478.getClass(), "month", (short) 10);
        setShortField(term30478, term30478.getClass(), "day", (short) 28);
        setField(term30477, term30477.getClass(), "date", term30478);
        setByteField(term30482, term30482.getClass(), "hour", (byte) 5);
        setByteField(term30482, term30482.getClass(), "minute", (byte) 13);
        setByteField(term30482, term30482.getClass(), "second", (byte) 51);
        setIntField(term30482, term30482.getClass(), "nano", 605693001);
        setField(term30477, term30477.getClass(), "time", term30482);
        setField(term30439, term30439.getClass(), "deliveryDate", term30477);
        setBooleanField(term30439, term30439.getClass(), "ordered", true);
        setField(term30439, term30439.getClass(), "userId", "dgbFDCdHtj");
        setField(term30439, term30439.getClass(), "orderStatus", enum104);
        term30511 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30511;
        callMethod(klass, "equals", argTypes, term30439, args);
    }

};


