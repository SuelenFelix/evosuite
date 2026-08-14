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

public class Producto_hashCode_166612269517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term977;

    public Producto_hashCode_166612269517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term978 = new Long(-316468845751588286L);
        Double term992 = new Double(0.9828442029246764);
        Integer term994 = new Integer(-1685132342);
        term977 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term1008 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1013 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term977, term977.getClass(), "id", term978);
        setField(term977, term977.getClass(), "nombre", "AijpHYOFuy");
        setField(term977, term977.getClass(), "precio", term992);
        setField(term977, term977.getClass(), "stock", term994);
        setField(term977, term977.getClass(), "imagen", "SbAoxhfrkn");
        setIntField(term1009, term1009.getClass(), "year", 2026);
        setShortField(term1009, term1009.getClass(), "month", (short) 8);
        setShortField(term1009, term1009.getClass(), "day", (short) 10);
        setField(term1008, term1008.getClass(), "date", term1009);
        setByteField(term1013, term1013.getClass(), "hour", (byte) 23);
        setByteField(term1013, term1013.getClass(), "minute", (byte) 27);
        setByteField(term1013, term1013.getClass(), "second", (byte) 37);
        setIntField(term1013, term1013.getClass(), "nano", 763846000);
        setField(term1008, term1008.getClass(), "time", term1013);
        setField(term977, term977.getClass(), "createdAt", term1008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term977, args);
    }

};


