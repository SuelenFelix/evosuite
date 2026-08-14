package es.joseluisgs.springdam.models;

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
import static es.joseluisgs.springdam.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;

public class Producto_ProductoBuilder_createdAt_15131192436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1471;
     Object term1512;

    public Producto_ProductoBuilder_createdAt_15131192436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1472 = new Long(2486810210675247493L);
        Double term1486 = new Double(0.13481025392611334);
        Integer term1488 = new Integer(-1007160944);
        term1471 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1502 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1503 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1507 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1471, term1471.getClass(), "id", term1472);
        setField(term1471, term1471.getClass(), "nombre", "xLbjWUgOIL");
        setField(term1471, term1471.getClass(), "precio", term1486);
        setField(term1471, term1471.getClass(), "stock", term1488);
        setField(term1471, term1471.getClass(), "imagen", "jDtqGUpnZN");
        setIntField(term1503, term1503.getClass(), "year", 2024);
        setShortField(term1503, term1503.getClass(), "month", (short) 1);
        setShortField(term1503, term1503.getClass(), "day", (short) 24);
        setField(term1502, term1502.getClass(), "date", term1503);
        setByteField(term1507, term1507.getClass(), "hour", (byte) 20);
        setByteField(term1507, term1507.getClass(), "minute", (byte) 28);
        setByteField(term1507, term1507.getClass(), "second", (byte) 39);
        setIntField(term1507, term1507.getClass(), "nano", 952728177);
        setField(term1502, term1502.getClass(), "time", term1507);
        setField(term1471, term1471.getClass(), "createdAt", term1502);
        term1512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1517 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1513, term1513.getClass(), "year", 2029);
        setShortField(term1513, term1513.getClass(), "month", (short) 8);
        setShortField(term1513, term1513.getClass(), "day", (short) 29);
        setField(term1512, term1512.getClass(), "date", term1513);
        setByteField(term1517, term1517.getClass(), "hour", (byte) 15);
        setByteField(term1517, term1517.getClass(), "minute", (byte) 50);
        setByteField(term1517, term1517.getClass(), "second", (byte) 1);
        setIntField(term1517, term1517.getClass(), "nano", 277971904);
        setField(term1512, term1512.getClass(), "time", term1517);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term1512;
        callMethod(klass, "createdAt", argTypes, term1471, args);
    }

};


