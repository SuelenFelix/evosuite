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

public class Producto_setPrecio_188757143311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;
     Object term614;

    public Producto_setPrecio_188757143311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term574 = new Long(-2813493605142626659L);
        Double term588 = new Double(0.37773193782763337);
        Integer term590 = new Integer(-1339778481);
        term573 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term604 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term605 = newInstance(Class.forName("java.time.LocalDate"));
        Object term609 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term573, term573.getClass(), "id", term574);
        setField(term573, term573.getClass(), "nombre", "pCTimMblYc");
        setField(term573, term573.getClass(), "precio", term588);
        setField(term573, term573.getClass(), "stock", term590);
        setField(term573, term573.getClass(), "imagen", "hNxWaHcfhY");
        setIntField(term605, term605.getClass(), "year", 2026);
        setShortField(term605, term605.getClass(), "month", (short) 8);
        setShortField(term605, term605.getClass(), "day", (short) 10);
        setField(term604, term604.getClass(), "date", term605);
        setByteField(term609, term609.getClass(), "hour", (byte) 23);
        setByteField(term609, term609.getClass(), "minute", (byte) 27);
        setByteField(term609, term609.getClass(), "second", (byte) 37);
        setIntField(term609, term609.getClass(), "nano", 437830000);
        setField(term604, term604.getClass(), "time", term609);
        setField(term573, term573.getClass(), "createdAt", term604);
        term614 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term614;
        callMethod(klass, "setPrecio", argTypes, term573, args);
    }

};


