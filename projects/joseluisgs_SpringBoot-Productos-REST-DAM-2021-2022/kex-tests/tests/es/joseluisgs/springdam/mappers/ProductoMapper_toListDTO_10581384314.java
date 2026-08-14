package es.joseluisgs.springdam.mappers;

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
import static es.joseluisgs.springdam.mappers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ProductoMapper_toListDTO_10581384314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;

    public ProductoMapper_toListDTO_10581384314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term293 = new Long(6811161968424632369L);
        Double term307 = new Double(0.6076495596892013);
        Integer term309 = new Integer(1227103734);
        Object term292 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term328 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term292, term292.getClass(), "id", term293);
        setField(term292, term292.getClass(), "nombre", "ZiaGIbnzTs");
        setField(term292, term292.getClass(), "precio", term307);
        setField(term292, term292.getClass(), "stock", term309);
        setField(term292, term292.getClass(), "imagen", "tbcdzjIfER");
        setIntField(term324, term324.getClass(), "year", 2026);
        setShortField(term324, term324.getClass(), "month", (short) 8);
        setShortField(term324, term324.getClass(), "day", (short) 10);
        setField(term323, term323.getClass(), "date", term324);
        setByteField(term328, term328.getClass(), "hour", (byte) 23);
        setByteField(term328, term328.getClass(), "minute", (byte) 25);
        setByteField(term328, term328.getClass(), "second", (byte) 53);
        setIntField(term328, term328.getClass(), "nano", 535102000);
        setField(term323, term323.getClass(), "time", term328);
        setField(term292, term292.getClass(), "createdAt", term323);
        Long term335 = new Long(-7237588299778557629L);
        Double term338 = new Double(0.37773193782763337);
        Integer term340 = new Integer(-1339778481);
        Object term334 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term343 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term334, term334.getClass(), "id", term335);
        setField(term334, term334.getClass(), "nombre", "");
        setField(term334, term334.getClass(), "precio", term338);
        setField(term334, term334.getClass(), "stock", term340);
        setField(term334, term334.getClass(), "imagen", "");
        setField(term343, term343.getClass(), "date", null);
        setField(term343, term343.getClass(), "time", null);
        setField(term334, term334.getClass(), "createdAt", term343);
        Long term346 = new Long(6967924379644551255L);
        Double term348 = new Double(0.8474802076607362);
        Integer term350 = new Integer(1725571209);
        Object term345 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term345, term345.getClass(), "id", term346);
        setField(term345, term345.getClass(), "nombre", null);
        setField(term345, term345.getClass(), "precio", term348);
        setField(term345, term345.getClass(), "stock", term350);
        setField(term345, term345.getClass(), "imagen", null);
        setField(term345, term345.getClass(), "createdAt", null);
        term289 = new LinkedList();
        ((LinkedList) term289).add(term292);
        ((LinkedList) term289).add(term334);
        ((LinkedList) term289).add(term345);
        ((LinkedList) term289).add((Object)null);
        ((LinkedList) term289).add((Object)null);
        ((LinkedList) term289).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.mappers.ProductoMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term289;
        callMethod(klass, "toListDTO", argTypes, null, args);
    }

};


