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
import java.lang.Integer;

public class OrderCreationResponse_setQuantity_182103250713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742;
     Object term3802;

    public OrderCreationResponse_setQuantity_182103250713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3825 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term3824 = ((Class) term3825).getDeclaredField((String) "PENDING");
        ((Field) term3824).setAccessible(true);
        Object enum12 = ((Field) term3824).get((Object) null);
        term3742 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term3770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3775 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3785 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3742, term3742.getClass(), "id", "flxyYxBRtu");
        setField(term3742, term3742.getClass(), "imageUrl", "OclPbYPkcH");
        setDoubleField(term3742, term3742.getClass(), "size", 0.3800088629986428);
        setIntField(term3742, term3742.getClass(), "quantity", 1134449235);
        setDoubleField(term3742, term3742.getClass(), "price", 0.5840714198152577);
        setIntField(term3771, term3771.getClass(), "year", 2025);
        setShortField(term3771, term3771.getClass(), "month", (short) 3);
        setShortField(term3771, term3771.getClass(), "day", (short) 9);
        setField(term3770, term3770.getClass(), "date", term3771);
        setByteField(term3775, term3775.getClass(), "hour", (byte) 5);
        setByteField(term3775, term3775.getClass(), "minute", (byte) 49);
        setByteField(term3775, term3775.getClass(), "second", (byte) 12);
        setIntField(term3775, term3775.getClass(), "nano", 791695028);
        setField(term3770, term3770.getClass(), "time", term3775);
        setField(term3742, term3742.getClass(), "orderDate", term3770);
        setIntField(term3781, term3781.getClass(), "year", 2023);
        setShortField(term3781, term3781.getClass(), "month", (short) 9);
        setShortField(term3781, term3781.getClass(), "day", (short) 23);
        setField(term3780, term3780.getClass(), "date", term3781);
        setByteField(term3785, term3785.getClass(), "hour", (byte) 12);
        setByteField(term3785, term3785.getClass(), "minute", (byte) 55);
        setByteField(term3785, term3785.getClass(), "second", (byte) 58);
        setIntField(term3785, term3785.getClass(), "nano", 159178396);
        setField(term3780, term3780.getClass(), "time", term3785);
        setField(term3742, term3742.getClass(), "deliveryDate", term3780);
        setBooleanField(term3742, term3742.getClass(), "ordered", true);
        setField(term3742, term3742.getClass(), "orderStatus", enum12);
        term3802 = new Integer(-883034806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3802;
        callMethod(klass, "setQuantity", argTypes, term3742, args);
    }

};


