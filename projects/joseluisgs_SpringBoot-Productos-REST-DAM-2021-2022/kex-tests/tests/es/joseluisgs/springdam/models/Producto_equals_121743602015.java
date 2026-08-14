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

public class Producto_equals_121743602015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853;
     Object term894;

    public Producto_equals_121743602015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term854 = new Long(-5476826692763582090L);
        Double term868 = new Double(0.7031006357544823);
        Integer term870 = new Integer(1585847225);
        term853 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term884 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term885 = newInstance(Class.forName("java.time.LocalDate"));
        Object term889 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term853, term853.getClass(), "id", term854);
        setField(term853, term853.getClass(), "nombre", "IoAlmYsBwc");
        setField(term853, term853.getClass(), "precio", term868);
        setField(term853, term853.getClass(), "stock", term870);
        setField(term853, term853.getClass(), "imagen", "TEParAifyi");
        setIntField(term885, term885.getClass(), "year", 2026);
        setShortField(term885, term885.getClass(), "month", (short) 8);
        setShortField(term885, term885.getClass(), "day", (short) 10);
        setField(term884, term884.getClass(), "date", term885);
        setByteField(term889, term889.getClass(), "hour", (byte) 23);
        setByteField(term889, term889.getClass(), "minute", (byte) 27);
        setByteField(term889, term889.getClass(), "second", (byte) 37);
        setIntField(term889, term889.getClass(), "nano", 664308000);
        setField(term884, term884.getClass(), "time", term889);
        setField(term853, term853.getClass(), "createdAt", term884);
        term894 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term894;
        callMethod(klass, "equals", argTypes, term853, args);
    }

};


