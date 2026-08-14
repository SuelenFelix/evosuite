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

public class Producto_getPrecio_69574879924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1102;

    public Producto_getPrecio_69574879924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1102 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term1102, term1102.getClass(), "id", null);
        setField(term1102, term1102.getClass(), "nombre", null);
        setField(term1102, term1102.getClass(), "precio", null);
        setField(term1102, term1102.getClass(), "stock", null);
        setField(term1102, term1102.getClass(), "imagen", null);
        setField(term1102, term1102.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrecio", argTypes, term1102, args);
    }

};


