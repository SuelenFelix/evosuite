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

public class ListProductosDTO_setConsulta_10642529935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4531;
     Object term4582;

    public ListProductosDTO_setConsulta_10642529935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4561 = new Long(3620247240684476031L);
        Double term4564 = new Double(0.2446504549754045);
        Integer term4566 = new Integer(-2063457669);
        Object term4560 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4560, term4560.getClass(), "id", term4561);
        setField(term4560, term4560.getClass(), "nombre", "");
        setField(term4560, term4560.getClass(), "precio", term4564);
        setField(term4560, term4560.getClass(), "stock", term4566);
        setField(term4560, term4560.getClass(), "imagen", "");
        setField(term4560, term4560.getClass(), "createdAt", "");
        Long term4571 = new Long(8313800941204938919L);
        Double term4574 = new Double(0.6142723998707854);
        Integer term4576 = new Integer(-1222006000);
        Object term4570 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4570, term4570.getClass(), "id", term4571);
        setField(term4570, term4570.getClass(), "nombre", "");
        setField(term4570, term4570.getClass(), "precio", term4574);
        setField(term4570, term4570.getClass(), "stock", term4576);
        setField(term4570, term4570.getClass(), "imagen", "");
        setField(term4570, term4570.getClass(), "createdAt", "");
        ArrayList term4558 = new ArrayList();
        ((ArrayList) term4558).add(term4560);
        ((ArrayList) term4558).add(term4570);
        term4531 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4537 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4533, term4533.getClass(), "year", 2026);
        setShortField(term4533, term4533.getClass(), "month", (short) 8);
        setShortField(term4533, term4533.getClass(), "day", (short) 10);
        setField(term4532, term4532.getClass(), "date", term4533);
        setByteField(term4537, term4537.getClass(), "hour", (byte) 23);
        setByteField(term4537, term4537.getClass(), "minute", (byte) 15);
        setByteField(term4537, term4537.getClass(), "second", (byte) 27);
        setIntField(term4537, term4537.getClass(), "nano", 643911000);
        setField(term4532, term4532.getClass(), "time", term4537);
        setField(term4531, term4531.getClass(), "consulta", term4532);
        setField(term4531, term4531.getClass(), "project", "SpringDam");
        setField(term4531, term4531.getClass(), "version", "1.0");
        setField(term4531, term4531.getClass(), "data", term4558);
        term4582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4587 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4583, term4583.getClass(), "year", 2012);
        setShortField(term4583, term4583.getClass(), "month", (short) 8);
        setShortField(term4583, term4583.getClass(), "day", (short) 25);
        setField(term4582, term4582.getClass(), "date", term4583);
        setByteField(term4587, term4587.getClass(), "hour", (byte) 5);
        setByteField(term4587, term4587.getClass(), "minute", (byte) 20);
        setByteField(term4587, term4587.getClass(), "second", (byte) 50);
        setIntField(term4587, term4587.getClass(), "nano", 345595912);
        setField(term4582, term4582.getClass(), "time", term4587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4582;
        callMethod(klass, "setConsulta", argTypes, term4531, args);
    }

};


