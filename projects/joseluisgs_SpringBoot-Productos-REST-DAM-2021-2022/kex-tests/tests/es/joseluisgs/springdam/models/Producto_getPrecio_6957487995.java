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

public class Producto_getPrecio_6957487995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public Producto_getPrecio_6957487995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term184 = new Long(-8400487765614892086L);
        Double term198 = new Double(0.544608645520025);
        Integer term200 = new Integer(391863371);
        term183 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term214 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215 = newInstance(Class.forName("java.time.LocalDate"));
        Object term219 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term183, term183.getClass(), "id", term184);
        setField(term183, term183.getClass(), "nombre", "SzjVpOQTyS");
        setField(term183, term183.getClass(), "precio", term198);
        setField(term183, term183.getClass(), "stock", term200);
        setField(term183, term183.getClass(), "imagen", "MjGYSRKTNF");
        setIntField(term215, term215.getClass(), "year", 2026);
        setShortField(term215, term215.getClass(), "month", (short) 8);
        setShortField(term215, term215.getClass(), "day", (short) 10);
        setField(term214, term214.getClass(), "date", term215);
        setByteField(term219, term219.getClass(), "hour", (byte) 23);
        setByteField(term219, term219.getClass(), "minute", (byte) 27);
        setByteField(term219, term219.getClass(), "second", (byte) 37);
        setIntField(term219, term219.getClass(), "nano", 32804000);
        setField(term214, term214.getClass(), "time", term219);
        setField(term183, term183.getClass(), "createdAt", term214);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrecio", argTypes, term183, args);
    }

};


