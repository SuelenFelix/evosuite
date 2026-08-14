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

public class Producto_ProductoBuilder_imagen_20834944155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1388;

    public Producto_ProductoBuilder_imagen_20834944155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1389 = new Long(-4365849114644724155L);
        Double term1403 = new Double(0.7633268466829064);
        Integer term1405 = new Integer(-117576464);
        term1388 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1419 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1420 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1424 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1388, term1388.getClass(), "id", term1389);
        setField(term1388, term1388.getClass(), "nombre", "GzFkzHGYFt");
        setField(term1388, term1388.getClass(), "precio", term1403);
        setField(term1388, term1388.getClass(), "stock", term1405);
        setField(term1388, term1388.getClass(), "imagen", "tShwQLRGNe");
        setIntField(term1420, term1420.getClass(), "year", 2025);
        setShortField(term1420, term1420.getClass(), "month", (short) 4);
        setShortField(term1420, term1420.getClass(), "day", (short) 24);
        setField(term1419, term1419.getClass(), "date", term1420);
        setByteField(term1424, term1424.getClass(), "hour", (byte) 18);
        setByteField(term1424, term1424.getClass(), "minute", (byte) 11);
        setByteField(term1424, term1424.getClass(), "second", (byte) 40);
        setIntField(term1424, term1424.getClass(), "nano", 137454929);
        setField(term1419, term1419.getClass(), "time", term1424);
        setField(term1388, term1388.getClass(), "createdAt", term1419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvtrsXUliU";
        callMethod(klass, "imagen", argTypes, term1388, args);
    }

};


