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

public class Producto_ProductoBuilder_precio_10835195863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;
     Object term1303;

    public Producto_ProductoBuilder_precio_10835195863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1263 = new Long(-2585684163342970173L);
        Double term1277 = new Double(0.4569171842750229);
        Integer term1279 = new Integer(-655067527);
        term1262 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1293 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1294 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1298 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1262, term1262.getClass(), "id", term1263);
        setField(term1262, term1262.getClass(), "nombre", "UlajhuVLaP");
        setField(term1262, term1262.getClass(), "precio", term1277);
        setField(term1262, term1262.getClass(), "stock", term1279);
        setField(term1262, term1262.getClass(), "imagen", "gGSMzuGICf");
        setIntField(term1294, term1294.getClass(), "year", 2022);
        setShortField(term1294, term1294.getClass(), "month", (short) 2);
        setShortField(term1294, term1294.getClass(), "day", (short) 26);
        setField(term1293, term1293.getClass(), "date", term1294);
        setByteField(term1298, term1298.getClass(), "hour", (byte) 11);
        setByteField(term1298, term1298.getClass(), "minute", (byte) 42);
        setByteField(term1298, term1298.getClass(), "second", (byte) 15);
        setIntField(term1298, term1298.getClass(), "nano", 377731937);
        setField(term1293, term1293.getClass(), "time", term1298);
        setField(term1262, term1262.getClass(), "createdAt", term1293);
        term1303 = new Double(0.8598297828918529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term1303;
        callMethod(klass, "precio", argTypes, term1262, args);
    }

};


