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

public class PrintOrder_getId_19683458881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23563;

    public PrintOrder_getId_19683458881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23668 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term23667 = ((Class) term23668).getDeclaredField((String) "DELIVERED");
        ((Field) term23667).setAccessible(true);
        Object enum83 = ((Field) term23667).get((Object) null);
        term23563 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term23591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23606 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23563, term23563.getClass(), "id", "lRORwXipuk");
        setField(term23563, term23563.getClass(), "imageUrl", "fVdTcjgHdw");
        setDoubleField(term23563, term23563.getClass(), "size", 0.5335953039331021);
        setIntField(term23563, term23563.getClass(), "quantity", 1063420942);
        setDoubleField(term23563, term23563.getClass(), "price", 0.5725602309856443);
        setIntField(term23592, term23592.getClass(), "year", 2023);
        setShortField(term23592, term23592.getClass(), "month", (short) 7);
        setShortField(term23592, term23592.getClass(), "day", (short) 27);
        setField(term23591, term23591.getClass(), "date", term23592);
        setByteField(term23596, term23596.getClass(), "hour", (byte) 4);
        setByteField(term23596, term23596.getClass(), "minute", (byte) 25);
        setByteField(term23596, term23596.getClass(), "second", (byte) 46);
        setIntField(term23596, term23596.getClass(), "nano", 646465452);
        setField(term23591, term23591.getClass(), "time", term23596);
        setField(term23563, term23563.getClass(), "orderDate", term23591);
        setIntField(term23602, term23602.getClass(), "year", 2022);
        setShortField(term23602, term23602.getClass(), "month", (short) 11);
        setShortField(term23602, term23602.getClass(), "day", (short) 2);
        setField(term23601, term23601.getClass(), "date", term23602);
        setByteField(term23606, term23606.getClass(), "hour", (byte) 4);
        setByteField(term23606, term23606.getClass(), "minute", (byte) 14);
        setByteField(term23606, term23606.getClass(), "second", (byte) 5);
        setIntField(term23606, term23606.getClass(), "nano", 604465127);
        setField(term23601, term23601.getClass(), "time", term23606);
        setField(term23563, term23563.getClass(), "deliveryDate", term23601);
        setBooleanField(term23563, term23563.getClass(), "ordered", false);
        setField(term23563, term23563.getClass(), "userId", "wwAwLLcLPp");
        setField(term23563, term23563.getClass(), "orderStatus", enum83);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term23563, args);
    }

};


