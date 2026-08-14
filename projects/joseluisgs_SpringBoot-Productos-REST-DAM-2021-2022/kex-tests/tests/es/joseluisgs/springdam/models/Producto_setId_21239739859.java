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

public class Producto_setId_21239739859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427;
     Object term468;

    public Producto_setId_21239739859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term428 = new Long(6811161968424632369L);
        Double term442 = new Double(0.36923381893433327);
        Integer term444 = new Integer(-2038273078);
        term427 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term458 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term459 = newInstance(Class.forName("java.time.LocalDate"));
        Object term463 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term427, term427.getClass(), "id", term428);
        setField(term427, term427.getClass(), "nombre", "oVcInYnLWB");
        setField(term427, term427.getClass(), "precio", term442);
        setField(term427, term427.getClass(), "stock", term444);
        setField(term427, term427.getClass(), "imagen", "aJlieCFVtF");
        setIntField(term459, term459.getClass(), "year", 2026);
        setShortField(term459, term459.getClass(), "month", (short) 8);
        setShortField(term459, term459.getClass(), "day", (short) 10);
        setField(term458, term458.getClass(), "date", term459);
        setByteField(term463, term463.getClass(), "hour", (byte) 23);
        setByteField(term463, term463.getClass(), "minute", (byte) 27);
        setByteField(term463, term463.getClass(), "second", (byte) 37);
        setIntField(term463, term463.getClass(), "nano", 319760000);
        setField(term458, term458.getClass(), "time", term463);
        setField(term427, term427.getClass(), "createdAt", term458);
        term468 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term468;
        callMethod(klass, "setId", argTypes, term427, args);
    }

};


