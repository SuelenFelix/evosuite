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

public class ListProductosDTO_getConsulta_11508235511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4259;

    public ListProductosDTO_getConsulta_11508235511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4289 = new Long(-4924950707540628022L);
        Double term4292 = new Double(0.6512870939318848);
        Integer term4294 = new Integer(-341152642);
        Object term4288 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4288, term4288.getClass(), "id", term4289);
        setField(term4288, term4288.getClass(), "nombre", "");
        setField(term4288, term4288.getClass(), "precio", term4292);
        setField(term4288, term4288.getClass(), "stock", term4294);
        setField(term4288, term4288.getClass(), "imagen", "");
        setField(term4288, term4288.getClass(), "createdAt", "");
        Long term4299 = new Long(-4393710401270724527L);
        Double term4302 = new Double(0.8777038609128434);
        Integer term4304 = new Integer(-2015854073);
        Object term4298 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4298, term4298.getClass(), "id", term4299);
        setField(term4298, term4298.getClass(), "nombre", "");
        setField(term4298, term4298.getClass(), "precio", term4302);
        setField(term4298, term4298.getClass(), "stock", term4304);
        setField(term4298, term4298.getClass(), "imagen", "");
        setField(term4298, term4298.getClass(), "createdAt", "");
        ArrayList term4286 = new ArrayList();
        ((ArrayList) term4286).add(term4288);
        ((ArrayList) term4286).add(term4298);
        term4259 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4265 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4261, term4261.getClass(), "year", 2026);
        setShortField(term4261, term4261.getClass(), "month", (short) 8);
        setShortField(term4261, term4261.getClass(), "day", (short) 10);
        setField(term4260, term4260.getClass(), "date", term4261);
        setByteField(term4265, term4265.getClass(), "hour", (byte) 23);
        setByteField(term4265, term4265.getClass(), "minute", (byte) 15);
        setByteField(term4265, term4265.getClass(), "second", (byte) 27);
        setIntField(term4265, term4265.getClass(), "nano", 503417000);
        setField(term4260, term4260.getClass(), "time", term4265);
        setField(term4259, term4259.getClass(), "consulta", term4260);
        setField(term4259, term4259.getClass(), "project", "SpringDam");
        setField(term4259, term4259.getClass(), "version", "1.0");
        setField(term4259, term4259.getClass(), "data", term4286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConsulta", argTypes, term4259, args);
    }

};


