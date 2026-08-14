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

public class Producto_ProductoBuilder_build_5238811427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1542;

    public Producto_ProductoBuilder_build_5238811427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1543 = new Long(7009926388951271268L);
        Double term1557 = new Double(0.3800088629986428);
        Integer term1559 = new Integer(1135664017);
        term1542 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1578 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1542, term1542.getClass(), "id", term1543);
        setField(term1542, term1542.getClass(), "nombre", "nGKItKLYNC");
        setField(term1542, term1542.getClass(), "precio", term1557);
        setField(term1542, term1542.getClass(), "stock", term1559);
        setField(term1542, term1542.getClass(), "imagen", "UiUYnPrcCi");
        setIntField(term1574, term1574.getClass(), "year", 2022);
        setShortField(term1574, term1574.getClass(), "month", (short) 11);
        setShortField(term1574, term1574.getClass(), "day", (short) 16);
        setField(term1573, term1573.getClass(), "date", term1574);
        setByteField(term1578, term1578.getClass(), "hour", (byte) 15);
        setByteField(term1578, term1578.getClass(), "minute", (byte) 54);
        setByteField(term1578, term1578.getClass(), "second", (byte) 2);
        setIntField(term1578, term1578.getClass(), "nano", 733274103);
        setField(term1573, term1573.getClass(), "time", term1578);
        setField(term1542, term1542.getClass(), "createdAt", term1573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1542, args);
    }

};


