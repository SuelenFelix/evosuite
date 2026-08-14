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

public class Producto_canEqual_41327339116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term915;
     Object term956;

    public Producto_canEqual_41327339116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term916 = new Long(-872011222785455006L);
        Double term930 = new Double(0.9527281779865117);
        Integer term932 = new Integer(597278769);
        term915 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term946 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term947 = newInstance(Class.forName("java.time.LocalDate"));
        Object term951 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term915, term915.getClass(), "id", term916);
        setField(term915, term915.getClass(), "nombre", "OWDIEULEFu");
        setField(term915, term915.getClass(), "precio", term930);
        setField(term915, term915.getClass(), "stock", term932);
        setField(term915, term915.getClass(), "imagen", "dWRymuLBtr");
        setIntField(term947, term947.getClass(), "year", 2026);
        setShortField(term947, term947.getClass(), "month", (short) 8);
        setShortField(term947, term947.getClass(), "day", (short) 10);
        setField(term946, term946.getClass(), "date", term947);
        setByteField(term951, term951.getClass(), "hour", (byte) 23);
        setByteField(term951, term951.getClass(), "minute", (byte) 27);
        setByteField(term951, term951.getClass(), "second", (byte) 37);
        setIntField(term951, term951.getClass(), "nano", 714553000);
        setField(term946, term946.getClass(), "time", term951);
        setField(term915, term915.getClass(), "createdAt", term946);
        term956 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term956;
        callMethod(klass, "canEqual", argTypes, term915, args);
    }

};


