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

public class Producto_ProductoBuilder_stock_4392159234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term1366;

    public Producto_ProductoBuilder_stock_4392159234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1326 = new Long(8059786003080744426L);
        Double term1340 = new Double(0.43692187681405226);
        Integer term1342 = new Integer(-6029667);
        term1325 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1325, term1325.getClass(), "id", term1326);
        setField(term1325, term1325.getClass(), "nombre", "hxCBltsObl");
        setField(term1325, term1325.getClass(), "precio", term1340);
        setField(term1325, term1325.getClass(), "stock", term1342);
        setField(term1325, term1325.getClass(), "imagen", "BndsHwAFMv");
        setIntField(term1357, term1357.getClass(), "year", 2026);
        setShortField(term1357, term1357.getClass(), "month", (short) 12);
        setShortField(term1357, term1357.getClass(), "day", (short) 14);
        setField(term1356, term1356.getClass(), "date", term1357);
        setByteField(term1361, term1361.getClass(), "hour", (byte) 16);
        setByteField(term1361, term1361.getClass(), "minute", (byte) 34);
        setByteField(term1361, term1361.getClass(), "second", (byte) 9);
        setIntField(term1361, term1361.getClass(), "nano", 518326996);
        setField(term1356, term1356.getClass(), "time", term1361);
        setField(term1325, term1325.getClass(), "createdAt", term1356);
        term1366 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1366;
        callMethod(klass, "stock", argTypes, term1325, args);
    }

};


