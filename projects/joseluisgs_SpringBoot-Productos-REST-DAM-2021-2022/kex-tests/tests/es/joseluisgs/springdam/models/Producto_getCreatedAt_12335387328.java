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

public class Producto_getCreatedAt_12335387328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public Producto_getCreatedAt_12335387328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term367 = new Long(4872422362414183754L);
        Double term381 = new Double(0.2641345529914265);
        Integer term383 = new Integer(-1955890973);
        term366 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term366, term366.getClass(), "id", term367);
        setField(term366, term366.getClass(), "nombre", "MxlszYVzRf");
        setField(term366, term366.getClass(), "precio", term381);
        setField(term366, term366.getClass(), "stock", term383);
        setField(term366, term366.getClass(), "imagen", "LQFpaHEwXR");
        setIntField(term398, term398.getClass(), "year", 2026);
        setShortField(term398, term398.getClass(), "month", (short) 8);
        setShortField(term398, term398.getClass(), "day", (short) 10);
        setField(term397, term397.getClass(), "date", term398);
        setByteField(term402, term402.getClass(), "hour", (byte) 23);
        setByteField(term402, term402.getClass(), "minute", (byte) 27);
        setByteField(term402, term402.getClass(), "second", (byte) 37);
        setIntField(term402, term402.getClass(), "nano", 238323000);
        setField(term397, term397.getClass(), "time", term402);
        setField(term366, term366.getClass(), "createdAt", term397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term366, args);
    }

};


