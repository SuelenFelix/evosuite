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

public class PrintOrder_hashCode_3453408523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31099;

    public PrintOrder_hashCode_3453408523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31204 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term31203 = ((Class) term31204).getDeclaredField((String) "DELIVERED");
        ((Field) term31203).setAccessible(true);
        Object enum106 = ((Field) term31203).get((Object) null);
        term31099 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term31127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31142 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31099, term31099.getClass(), "id", "TcuXODkzBV");
        setField(term31099, term31099.getClass(), "imageUrl", "coJPjrBZNe");
        setDoubleField(term31099, term31099.getClass(), "size", 0.8732511635701926);
        setIntField(term31099, term31099.getClass(), "quantity", -1347665717);
        setDoubleField(term31099, term31099.getClass(), "price", 0.8977760608415547);
        setIntField(term31128, term31128.getClass(), "year", 2017);
        setShortField(term31128, term31128.getClass(), "month", (short) 8);
        setShortField(term31128, term31128.getClass(), "day", (short) 6);
        setField(term31127, term31127.getClass(), "date", term31128);
        setByteField(term31132, term31132.getClass(), "hour", (byte) 22);
        setByteField(term31132, term31132.getClass(), "minute", (byte) 46);
        setByteField(term31132, term31132.getClass(), "second", (byte) 47);
        setIntField(term31132, term31132.getClass(), "nano", 782967389);
        setField(term31127, term31127.getClass(), "time", term31132);
        setField(term31099, term31099.getClass(), "orderDate", term31127);
        setIntField(term31138, term31138.getClass(), "year", 2029);
        setShortField(term31138, term31138.getClass(), "month", (short) 3);
        setShortField(term31138, term31138.getClass(), "day", (short) 3);
        setField(term31137, term31137.getClass(), "date", term31138);
        setByteField(term31142, term31142.getClass(), "hour", (byte) 2);
        setByteField(term31142, term31142.getClass(), "minute", (byte) 29);
        setByteField(term31142, term31142.getClass(), "second", (byte) 54);
        setIntField(term31142, term31142.getClass(), "nano", 846675209);
        setField(term31137, term31137.getClass(), "time", term31142);
        setField(term31099, term31099.getClass(), "deliveryDate", term31137);
        setBooleanField(term31099, term31099.getClass(), "ordered", true);
        setField(term31099, term31099.getClass(), "userId", "vMsWjuPTnO");
        setField(term31099, term31099.getClass(), "orderStatus", enum106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31099, args);
    }

};


