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

public class Producto_getStock_9710041366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244;

    public Producto_getStock_9710041366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term245 = new Long(5270370404989704783L);
        Double term259 = new Double(0.28570734989730284);
        Integer term261 = new Integer(-1922583790);
        term244 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term275 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276 = newInstance(Class.forName("java.time.LocalDate"));
        Object term280 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term244, term244.getClass(), "id", term245);
        setField(term244, term244.getClass(), "nombre", "hRNSzYYIrc");
        setField(term244, term244.getClass(), "precio", term259);
        setField(term244, term244.getClass(), "stock", term261);
        setField(term244, term244.getClass(), "imagen", "RMFIsYGgne");
        setIntField(term276, term276.getClass(), "year", 2026);
        setShortField(term276, term276.getClass(), "month", (short) 8);
        setShortField(term276, term276.getClass(), "day", (short) 10);
        setField(term275, term275.getClass(), "date", term276);
        setByteField(term280, term280.getClass(), "hour", (byte) 23);
        setByteField(term280, term280.getClass(), "minute", (byte) 27);
        setByteField(term280, term280.getClass(), "second", (byte) 37);
        setIntField(term280, term280.getClass(), "nano", 103815000);
        setField(term275, term275.getClass(), "time", term280);
        setField(term244, term244.getClass(), "createdAt", term275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term244, args);
    }

};


