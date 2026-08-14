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

public class Producto_getNombre_4950751344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122;

    public Producto_getNombre_4950751344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123 = new Long(-8257434502486459194L);
        Double term137 = new Double(0.5523635872663106);
        Integer term139 = new Integer(1484323161);
        term122 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term122, term122.getClass(), "id", term123);
        setField(term122, term122.getClass(), "nombre", "jJCZpVmanW");
        setField(term122, term122.getClass(), "precio", term137);
        setField(term122, term122.getClass(), "stock", term139);
        setField(term122, term122.getClass(), "imagen", "EGtDIRbSSb");
        setIntField(term154, term154.getClass(), "year", 2026);
        setShortField(term154, term154.getClass(), "month", (short) 8);
        setShortField(term154, term154.getClass(), "day", (short) 10);
        setField(term153, term153.getClass(), "date", term154);
        setByteField(term158, term158.getClass(), "hour", (byte) 23);
        setByteField(term158, term158.getClass(), "minute", (byte) 27);
        setByteField(term158, term158.getClass(), "second", (byte) 36);
        setIntField(term158, term158.getClass(), "nano", 959225000);
        setField(term153, term153.getClass(), "time", term158);
        setField(term122, term122.getClass(), "createdAt", term153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNombre", argTypes, term122, args);
    }

};


