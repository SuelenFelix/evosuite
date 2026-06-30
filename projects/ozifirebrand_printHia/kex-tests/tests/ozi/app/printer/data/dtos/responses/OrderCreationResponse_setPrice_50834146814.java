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

public class OrderCreationResponse_setPrice_50834146814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4047;
     Object term4107;

    public OrderCreationResponse_setPrice_50834146814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4130 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4129 = ((Class) term4130).getDeclaredField((String) "ORDERED");
        ((Field) term4129).setAccessible(true);
        Object enum13 = ((Field) term4129).get((Object) null);
        term4047 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term4075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4080 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4090 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4047, term4047.getClass(), "id", "IoAlmYsBwc");
        setField(term4047, term4047.getClass(), "imageUrl", "TEParAifyi");
        setDoubleField(term4047, term4047.getClass(), "size", 0.7559240768573477);
        setIntField(term4047, term4047.getClass(), "quantity", 1585847225);
        setDoubleField(term4047, term4047.getClass(), "price", 0.10667076642995188);
        setIntField(term4076, term4076.getClass(), "year", 2028);
        setShortField(term4076, term4076.getClass(), "month", (short) 10);
        setShortField(term4076, term4076.getClass(), "day", (short) 1);
        setField(term4075, term4075.getClass(), "date", term4076);
        setByteField(term4080, term4080.getClass(), "hour", (byte) 17);
        setByteField(term4080, term4080.getClass(), "minute", (byte) 29);
        setByteField(term4080, term4080.getClass(), "second", (byte) 30);
        setIntField(term4080, term4080.getClass(), "nano", 845472306);
        setField(term4075, term4075.getClass(), "time", term4080);
        setField(term4047, term4047.getClass(), "orderDate", term4075);
        setIntField(term4086, term4086.getClass(), "year", 2027);
        setShortField(term4086, term4086.getClass(), "month", (short) 2);
        setShortField(term4086, term4086.getClass(), "day", (short) 19);
        setField(term4085, term4085.getClass(), "date", term4086);
        setByteField(term4090, term4090.getClass(), "hour", (byte) 17);
        setByteField(term4090, term4090.getClass(), "minute", (byte) 37);
        setByteField(term4090, term4090.getClass(), "second", (byte) 27);
        setIntField(term4090, term4090.getClass(), "nano", 920380537);
        setField(term4085, term4085.getClass(), "time", term4090);
        setField(term4047, term4047.getClass(), "deliveryDate", term4085);
        setBooleanField(term4047, term4047.getClass(), "ordered", true);
        setField(term4047, term4047.getClass(), "orderStatus", enum13);
        term4107 = new Double(0.11493000848982304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4107;
        callMethod(klass, "setPrice", argTypes, term4047, args);
    }

};


