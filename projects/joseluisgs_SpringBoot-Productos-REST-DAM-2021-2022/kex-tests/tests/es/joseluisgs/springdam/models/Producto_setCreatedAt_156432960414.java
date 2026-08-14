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

public class Producto_setCreatedAt_156432960414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782;
     Object term823;

    public Producto_setCreatedAt_156432960414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term783 = new Long(2535595959091595249L);
        Double term797 = new Double(0.1374549299694151);
        Integer term799 = new Integer(-883034806);
        term782 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term818 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term782, term782.getClass(), "id", term783);
        setField(term782, term782.getClass(), "nombre", "flxyYxBRtu");
        setField(term782, term782.getClass(), "precio", term797);
        setField(term782, term782.getClass(), "stock", term799);
        setField(term782, term782.getClass(), "imagen", "OclPbYPkcH");
        setIntField(term814, term814.getClass(), "year", 2026);
        setShortField(term814, term814.getClass(), "month", (short) 8);
        setShortField(term814, term814.getClass(), "day", (short) 10);
        setField(term813, term813.getClass(), "date", term814);
        setByteField(term818, term818.getClass(), "hour", (byte) 23);
        setByteField(term818, term818.getClass(), "minute", (byte) 27);
        setByteField(term818, term818.getClass(), "second", (byte) 37);
        setIntField(term818, term818.getClass(), "nano", 612317000);
        setField(term813, term813.getClass(), "time", term818);
        setField(term782, term782.getClass(), "createdAt", term813);
        term823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term828 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term824, term824.getClass(), "year", 2021);
        setShortField(term824, term824.getClass(), "month", (short) 1);
        setShortField(term824, term824.getClass(), "day", (short) 18);
        setField(term823, term823.getClass(), "date", term824);
        setByteField(term828, term828.getClass(), "hour", (byte) 13);
        setByteField(term828, term828.getClass(), "minute", (byte) 38);
        setByteField(term828, term828.getClass(), "second", (byte) 26);
        setIntField(term828, term828.getClass(), "nano", 544608644);
        setField(term823, term823.getClass(), "time", term828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term823;
        callMethod(klass, "setCreatedAt", argTypes, term782, args);
    }

};


