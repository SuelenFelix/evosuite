package es.joseluisgs.springdam.dto.productos;

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
import static es.joseluisgs.springdam.dto.productos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ListProductosDTO_getData_20700530274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4478;

    public ListProductosDTO_getData_20700530274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4508 = new Long(6273754186658578034L);
        Double term4511 = new Double(0.4772043271031934);
        Integer term4513 = new Integer(-2015048153);
        Object term4507 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4507, term4507.getClass(), "id", term4508);
        setField(term4507, term4507.getClass(), "nombre", "");
        setField(term4507, term4507.getClass(), "precio", term4511);
        setField(term4507, term4507.getClass(), "stock", term4513);
        setField(term4507, term4507.getClass(), "imagen", "");
        setField(term4507, term4507.getClass(), "createdAt", "");
        ArrayList term4505 = new ArrayList();
        ((ArrayList) term4505).add(term4507);
        term4478 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4484 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4480, term4480.getClass(), "year", 2026);
        setShortField(term4480, term4480.getClass(), "month", (short) 8);
        setShortField(term4480, term4480.getClass(), "day", (short) 10);
        setField(term4479, term4479.getClass(), "date", term4480);
        setByteField(term4484, term4484.getClass(), "hour", (byte) 23);
        setByteField(term4484, term4484.getClass(), "minute", (byte) 15);
        setByteField(term4484, term4484.getClass(), "second", (byte) 27);
        setIntField(term4484, term4484.getClass(), "nano", 612350000);
        setField(term4479, term4479.getClass(), "time", term4484);
        setField(term4478, term4478.getClass(), "consulta", term4479);
        setField(term4478, term4478.getClass(), "project", "SpringDam");
        setField(term4478, term4478.getClass(), "version", "1.0");
        setField(term4478, term4478.getClass(), "data", term4505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term4478, args);
    }

};


