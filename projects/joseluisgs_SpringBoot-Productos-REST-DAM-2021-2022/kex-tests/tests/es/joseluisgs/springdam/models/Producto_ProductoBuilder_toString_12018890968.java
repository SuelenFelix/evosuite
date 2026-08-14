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

public class Producto_ProductoBuilder_toString_12018890968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1603;

    public Producto_ProductoBuilder_toString_12018890968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1604 = new Long(-7672528020740371001L);
        Double term1618 = new Double(0.5840714198152577);
        Integer term1620 = new Integer(590364439);
        term1603 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        Object term1634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1639 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1603, term1603.getClass(), "id", term1604);
        setField(term1603, term1603.getClass(), "nombre", "UoYtihxVaS");
        setField(term1603, term1603.getClass(), "precio", term1618);
        setField(term1603, term1603.getClass(), "stock", term1620);
        setField(term1603, term1603.getClass(), "imagen", "JDswTTCZHV");
        setIntField(term1635, term1635.getClass(), "year", 2019);
        setShortField(term1635, term1635.getClass(), "month", (short) 2);
        setShortField(term1635, term1635.getClass(), "day", (short) 21);
        setField(term1634, term1634.getClass(), "date", term1635);
        setByteField(term1639, term1639.getClass(), "hour", (byte) 5);
        setByteField(term1639, term1639.getClass(), "minute", (byte) 41);
        setByteField(term1639, term1639.getClass(), "second", (byte) 11);
        setIntField(term1639, term1639.getClass(), "nano", 859829782);
        setField(term1634, term1634.getClass(), "time", term1639);
        setField(term1603, term1603.getClass(), "createdAt", term1634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1603, args);
    }

};


