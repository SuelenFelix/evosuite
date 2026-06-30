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

public class OrderCreationResponse_getPrice_13247329325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1264;

    public OrderCreationResponse_getPrice_13247329325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1345 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1344 = ((Class) term1345).getDeclaredField((String) "ORDERED");
        ((Field) term1344).setAccessible(true);
        Object enum4 = ((Field) term1344).get((Object) null);
        term1264 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term1292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1307 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1264, term1264.getClass(), "id", "hRNSzYYIrc");
        setField(term1264, term1264.getClass(), "imageUrl", "RMFIsYGgne");
        setDoubleField(term1264, term1264.getClass(), "size", 0.6076495596892013);
        setIntField(term1264, term1264.getClass(), "quantity", -1922583790);
        setDoubleField(term1264, term1264.getClass(), "price", 0.37773193782763337);
        setIntField(term1293, term1293.getClass(), "year", 2029);
        setShortField(term1293, term1293.getClass(), "month", (short) 8);
        setShortField(term1293, term1293.getClass(), "day", (short) 29);
        setField(term1292, term1292.getClass(), "date", term1293);
        setByteField(term1297, term1297.getClass(), "hour", (byte) 15);
        setByteField(term1297, term1297.getClass(), "minute", (byte) 50);
        setByteField(term1297, term1297.getClass(), "second", (byte) 1);
        setIntField(term1297, term1297.getClass(), "nano", 277971904);
        setField(term1292, term1292.getClass(), "time", term1297);
        setField(term1264, term1264.getClass(), "orderDate", term1292);
        setIntField(term1303, term1303.getClass(), "year", 2022);
        setShortField(term1303, term1303.getClass(), "month", (short) 11);
        setShortField(term1303, term1303.getClass(), "day", (short) 16);
        setField(term1302, term1302.getClass(), "date", term1303);
        setByteField(term1307, term1307.getClass(), "hour", (byte) 15);
        setByteField(term1307, term1307.getClass(), "minute", (byte) 54);
        setByteField(term1307, term1307.getClass(), "second", (byte) 2);
        setIntField(term1307, term1307.getClass(), "nano", 733274103);
        setField(term1302, term1302.getClass(), "time", term1307);
        setField(term1264, term1264.getClass(), "deliveryDate", term1302);
        setBooleanField(term1264, term1264.getClass(), "ordered", true);
        setField(term1264, term1264.getClass(), "orderStatus", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term1264, args);
    }

};


