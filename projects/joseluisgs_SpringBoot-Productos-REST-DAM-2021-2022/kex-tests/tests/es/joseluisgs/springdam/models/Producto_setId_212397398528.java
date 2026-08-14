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

public class Producto_setId_212397398528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1106;

    public Producto_setId_212397398528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1106 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term1106, term1106.getClass(), "id", null);
        setField(term1106, term1106.getClass(), "nombre", null);
        setField(term1106, term1106.getClass(), "precio", null);
        setField(term1106, term1106.getClass(), "stock", null);
        setField(term1106, term1106.getClass(), "imagen", null);
        setField(term1106, term1106.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term1106, args);
    }

};


