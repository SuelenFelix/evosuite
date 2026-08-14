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

public class Producto_toString_211808491118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1038;

    public Producto_toString_211808491118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1039 = new Long(5127676408959197577L);
        Double term1053 = new Double(0.2779719046761513);
        Integer term1055 = new Integer(-1456670397);
        term1038 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term1069 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1070 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1074 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1038, term1038.getClass(), "id", term1039);
        setField(term1038, term1038.getClass(), "nombre", "kuTXqwMtDB");
        setField(term1038, term1038.getClass(), "precio", term1053);
        setField(term1038, term1038.getClass(), "stock", term1055);
        setField(term1038, term1038.getClass(), "imagen", "Ghbwtircqb");
        setIntField(term1070, term1070.getClass(), "year", 2026);
        setShortField(term1070, term1070.getClass(), "month", (short) 8);
        setShortField(term1070, term1070.getClass(), "day", (short) 10);
        setField(term1069, term1069.getClass(), "date", term1070);
        setByteField(term1074, term1074.getClass(), "hour", (byte) 23);
        setByteField(term1074, term1074.getClass(), "minute", (byte) 27);
        setByteField(term1074, term1074.getClass(), "second", (byte) 37);
        setIntField(term1074, term1074.getClass(), "nano", 826561000);
        setField(term1069, term1069.getClass(), "time", term1074);
        setField(term1038, term1038.getClass(), "createdAt", term1069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1038, args);
    }

};


