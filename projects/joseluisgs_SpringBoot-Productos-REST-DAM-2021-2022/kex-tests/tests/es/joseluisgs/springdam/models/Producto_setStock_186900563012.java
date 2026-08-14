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

public class Producto_setStock_186900563012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636;
     Object term677;

    public Producto_setStock_186900563012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term637 = new Long(-8885298608300233488L);
        Double term651 = new Double(0.5183269973490326);
        Integer term653 = new Integer(1725571209);
        term636 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term672 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "nombre", "RkybSrpybU");
        setField(term636, term636.getClass(), "precio", term651);
        setField(term636, term636.getClass(), "stock", term653);
        setField(term636, term636.getClass(), "imagen", "xOEqzGAmDU");
        setIntField(term668, term668.getClass(), "year", 2026);
        setShortField(term668, term668.getClass(), "month", (short) 8);
        setShortField(term668, term668.getClass(), "day", (short) 10);
        setField(term667, term667.getClass(), "date", term668);
        setByteField(term672, term672.getClass(), "hour", (byte) 23);
        setByteField(term672, term672.getClass(), "minute", (byte) 27);
        setByteField(term672, term672.getClass(), "second", (byte) 37);
        setIntField(term672, term672.getClass(), "nano", 491582000);
        setField(term667, term667.getClass(), "time", term672);
        setField(term636, term636.getClass(), "createdAt", term667);
        term677 = new Integer(-522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term677;
        callMethod(klass, "setStock", argTypes, term636, args);
    }

};


