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

public class OrderCreationResponse_setDeliveryDate_98384700716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4673;
     Object term4733;

    public OrderCreationResponse_setDeliveryDate_98384700716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4764 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4763 = ((Class) term4764).getDeclaredField((String) "PENDING");
        ((Field) term4763).setAccessible(true);
        Object enum15 = ((Field) term4763).get((Object) null);
        term4673 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term4701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4706 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4716 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4673, term4673.getClass(), "id", "AijpHYOFuy");
        setField(term4673, term4673.getClass(), "imageUrl", "SbAoxhfrkn");
        setDoubleField(term4673, term4673.getClass(), "size", 0.2852810965221698);
        setIntField(term4673, term4673.getClass(), "quantity", -1685132342);
        setDoubleField(term4673, term4673.getClass(), "price", 0.6300849762307866);
        setIntField(term4702, term4702.getClass(), "year", 2012);
        setShortField(term4702, term4702.getClass(), "month", (short) 8);
        setShortField(term4702, term4702.getClass(), "day", (short) 25);
        setField(term4701, term4701.getClass(), "date", term4702);
        setByteField(term4706, term4706.getClass(), "hour", (byte) 19);
        setByteField(term4706, term4706.getClass(), "minute", (byte) 49);
        setByteField(term4706, term4706.getClass(), "second", (byte) 8);
        setIntField(term4706, term4706.getClass(), "nano", 912685024);
        setField(term4701, term4701.getClass(), "time", term4706);
        setField(term4673, term4673.getClass(), "orderDate", term4701);
        setIntField(term4712, term4712.getClass(), "year", 2012);
        setShortField(term4712, term4712.getClass(), "month", (short) 3);
        setShortField(term4712, term4712.getClass(), "day", (short) 27);
        setField(term4711, term4711.getClass(), "date", term4712);
        setByteField(term4716, term4716.getClass(), "hour", (byte) 17);
        setByteField(term4716, term4716.getClass(), "minute", (byte) 49);
        setByteField(term4716, term4716.getClass(), "second", (byte) 24);
        setIntField(term4716, term4716.getClass(), "nano", 530647398);
        setField(term4711, term4711.getClass(), "time", term4716);
        setField(term4673, term4673.getClass(), "deliveryDate", term4711);
        setBooleanField(term4673, term4673.getClass(), "ordered", true);
        setField(term4673, term4673.getClass(), "orderStatus", enum15);
        term4733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4738 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4734, term4734.getClass(), "year", 2010);
        setShortField(term4734, term4734.getClass(), "month", (short) 6);
        setShortField(term4734, term4734.getClass(), "day", (short) 14);
        setField(term4733, term4733.getClass(), "date", term4734);
        setByteField(term4738, term4738.getClass(), "hour", (byte) 6);
        setByteField(term4738, term4738.getClass(), "minute", (byte) 22);
        setByteField(term4738, term4738.getClass(), "second", (byte) 20);
        setIntField(term4738, term4738.getClass(), "nano", 25133051);
        setField(term4733, term4733.getClass(), "time", term4738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4733;
        callMethod(klass, "setDeliveryDate", argTypes, term4673, args);
    }

};


