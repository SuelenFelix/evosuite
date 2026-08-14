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

public class Producto_ProductoBuilder_id_8079904441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1116;
     Object term1157;

    public Producto_ProductoBuilder_id_8079904441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1117 = new Long(-6573104506744284592L);
        Double term1131 = new Double(0.6436713023569729);
        Integer term1133 = new Integer(1622346318);
        term1116 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1152 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1116, term1116.getClass(), "id", term1117);
        setField(term1116, term1116.getClass(), "nombre", "xrwlQZdwCp");
        setField(term1116, term1116.getClass(), "precio", term1131);
        setField(term1116, term1116.getClass(), "stock", term1133);
        setField(term1116, term1116.getClass(), "imagen", "IDCWpPLRkE");
        setIntField(term1148, term1148.getClass(), "year", 2015);
        setShortField(term1148, term1148.getClass(), "month", (short) 9);
        setShortField(term1148, term1148.getClass(), "day", (short) 19);
        setField(term1147, term1147.getClass(), "date", term1148);
        setByteField(term1152, term1152.getClass(), "hour", (byte) 9);
        setByteField(term1152, term1152.getClass(), "minute", (byte) 4);
        setByteField(term1152, term1152.getClass(), "second", (byte) 10);
        setIntField(term1152, term1152.getClass(), "nano", 401765865);
        setField(term1147, term1147.getClass(), "time", term1152);
        setField(term1116, term1116.getClass(), "createdAt", term1147);
        term1157 = new Long(-4920224193275732920L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1157;
        callMethod(klass, "id", argTypes, term1116, args);
    }

};


