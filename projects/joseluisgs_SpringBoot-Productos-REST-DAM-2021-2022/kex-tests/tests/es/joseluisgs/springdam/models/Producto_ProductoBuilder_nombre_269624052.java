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

public class Producto_ProductoBuilder_nombre_269624052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1179;

    public Producto_ProductoBuilder_nombre_269624052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1180 = new Long(8428634514691209827L);
        Double term1194 = new Double(0.7332741045694002);
        Integer term1196 = new Integer(1048535127);
        term1179 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1215 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1179, term1179.getClass(), "id", term1180);
        setField(term1179, term1179.getClass(), "nombre", "nyiiPDVjAc");
        setField(term1179, term1179.getClass(), "precio", term1194);
        setField(term1179, term1179.getClass(), "stock", term1196);
        setField(term1179, term1179.getClass(), "imagen", "aKnKipADSo");
        setIntField(term1211, term1211.getClass(), "year", 2015);
        setShortField(term1211, term1211.getClass(), "month", (short) 4);
        setShortField(term1211, term1211.getClass(), "day", (short) 14);
        setField(term1210, term1210.getClass(), "date", term1211);
        setByteField(term1215, term1215.getClass(), "hour", (byte) 18);
        setByteField(term1215, term1215.getClass(), "minute", (byte) 24);
        setByteField(term1215, term1215.getClass(), "second", (byte) 32);
        setIntField(term1215, term1215.getClass(), "nano", 369233818);
        setField(term1210, term1210.getClass(), "time", term1215);
        setField(term1179, term1179.getClass(), "createdAt", term1210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "nombre", argTypes, term1179, args);
    }

};


