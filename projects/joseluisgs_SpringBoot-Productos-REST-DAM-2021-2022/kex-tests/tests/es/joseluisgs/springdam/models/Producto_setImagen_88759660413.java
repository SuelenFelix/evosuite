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

public class Producto_setImagen_88759660413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term699;

    public Producto_setImagen_88759660413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term700 = new Long(-4325723315152823407L);
        Double term714 = new Double(0.7655020693602768);
        Integer term716 = new Integer(1134449235);
        term699 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term730 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term731 = newInstance(Class.forName("java.time.LocalDate"));
        Object term735 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term699, term699.getClass(), "id", term700);
        setField(term699, term699.getClass(), "nombre", "eZFUvlxvGV");
        setField(term699, term699.getClass(), "precio", term714);
        setField(term699, term699.getClass(), "stock", term716);
        setField(term699, term699.getClass(), "imagen", "BYqFIqCKAV");
        setIntField(term731, term731.getClass(), "year", 2026);
        setShortField(term731, term731.getClass(), "month", (short) 8);
        setShortField(term731, term731.getClass(), "day", (short) 10);
        setField(term730, term730.getClass(), "date", term731);
        setByteField(term735, term735.getClass(), "hour", (byte) 23);
        setByteField(term735, term735.getClass(), "minute", (byte) 27);
        setByteField(term735, term735.getClass(), "second", (byte) 37);
        setIntField(term735, term735.getClass(), "nano", 562587000);
        setField(term730, term730.getClass(), "time", term735);
        setField(term699, term699.getClass(), "createdAt", term730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vrQLuWIDJX";
        callMethod(klass, "setImagen", argTypes, term699, args);
    }

};


