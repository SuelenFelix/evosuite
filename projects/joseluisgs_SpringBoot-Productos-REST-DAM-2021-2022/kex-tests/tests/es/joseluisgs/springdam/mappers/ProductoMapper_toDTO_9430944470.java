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
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;

public class ProductoMapper_toDTO_9430944470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ProductoMapper_toDTO_9430944470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2 = new Long(2442117782898005296L);
        Double term16 = new Double(0.13238746331190498);
        Integer term18 = new Integer(568599855);
        term1 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term32 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term33 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term1, term1.getClass(), "nombre", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "precio", term16);
        setField(term1, term1.getClass(), "stock", term18);
        setField(term1, term1.getClass(), "imagen", "sjlJAEtRrb");
        setIntField(term33, term33.getClass(), "year", 2026);
        setShortField(term33, term33.getClass(), "month", (short) 8);
        setShortField(term33, term33.getClass(), "day", (short) 10);
        setField(term32, term32.getClass(), "date", term33);
        setByteField(term37, term37.getClass(), "hour", (byte) 23);
        setByteField(term37, term37.getClass(), "minute", (byte) 25);
        setByteField(term37, term37.getClass(), "second", (byte) 53);
        setIntField(term37, term37.getClass(), "nano", 166377000);
        setField(term32, term32.getClass(), "time", term37);
        setField(term1, term1.getClass(), "createdAt", term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.mappers.ProductoMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("es.joseluisgs.springdam.models.Producto");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "toDTO", argTypes, null, args);
    }

};


