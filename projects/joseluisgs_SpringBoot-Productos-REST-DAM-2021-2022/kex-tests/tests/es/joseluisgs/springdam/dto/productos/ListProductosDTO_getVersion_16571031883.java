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

public class ListProductosDTO_getVersion_16571031883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4425;

    public ListProductosDTO_getVersion_16571031883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4455 = new Long(1084801489398441516L);
        Double term4458 = new Double(0.40635376375558196);
        Integer term4460 = new Integer(1202361360);
        Object term4454 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4454, term4454.getClass(), "id", term4455);
        setField(term4454, term4454.getClass(), "nombre", "");
        setField(term4454, term4454.getClass(), "precio", term4458);
        setField(term4454, term4454.getClass(), "stock", term4460);
        setField(term4454, term4454.getClass(), "imagen", "");
        setField(term4454, term4454.getClass(), "createdAt", "");
        ArrayList term4452 = new ArrayList();
        ((ArrayList) term4452).add(term4454);
        term4425 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4426 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4427 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4431 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4427, term4427.getClass(), "year", 2026);
        setShortField(term4427, term4427.getClass(), "month", (short) 8);
        setShortField(term4427, term4427.getClass(), "day", (short) 10);
        setField(term4426, term4426.getClass(), "date", term4427);
        setByteField(term4431, term4431.getClass(), "hour", (byte) 23);
        setByteField(term4431, term4431.getClass(), "minute", (byte) 15);
        setByteField(term4431, term4431.getClass(), "second", (byte) 27);
        setIntField(term4431, term4431.getClass(), "nano", 580133000);
        setField(term4426, term4426.getClass(), "time", term4431);
        setField(term4425, term4425.getClass(), "consulta", term4426);
        setField(term4425, term4425.getClass(), "project", "SpringDam");
        setField(term4425, term4425.getClass(), "version", "1.0");
        setField(term4425, term4425.getClass(), "data", term4452);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term4425, args);
    }

};


