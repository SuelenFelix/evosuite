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

public class Producto_getId_17409515533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;

    public Producto_getId_17409515533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62 = new Long(6375119433582206027L);
        Double term76 = new Double(0.3455959125047594);
        Integer term78 = new Integer(1162663216);
        term61 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term92 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term61, term61.getClass(), "id", term62);
        setField(term61, term61.getClass(), "nombre", "MuLcgQHgqz");
        setField(term61, term61.getClass(), "precio", term76);
        setField(term61, term61.getClass(), "stock", term78);
        setField(term61, term61.getClass(), "imagen", "xxtlPwDYFs");
        setIntField(term93, term93.getClass(), "year", 2026);
        setShortField(term93, term93.getClass(), "month", (short) 8);
        setShortField(term93, term93.getClass(), "day", (short) 10);
        setField(term92, term92.getClass(), "date", term93);
        setByteField(term97, term97.getClass(), "hour", (byte) 23);
        setByteField(term97, term97.getClass(), "minute", (byte) 27);
        setByteField(term97, term97.getClass(), "second", (byte) 36);
        setIntField(term97, term97.getClass(), "nano", 868873000);
        setField(term92, term92.getClass(), "time", term97);
        setField(term61, term61.getClass(), "createdAt", term92);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term61, args);
    }

};


