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

public class Producto_getId_174095155322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1100;

    public Producto_getId_174095155322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1100 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term1100, term1100.getClass(), "id", null);
        setField(term1100, term1100.getClass(), "nombre", null);
        setField(term1100, term1100.getClass(), "precio", null);
        setField(term1100, term1100.getClass(), "stock", null);
        setField(term1100, term1100.getClass(), "imagen", null);
        setField(term1100, term1100.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1100, args);
    }

};


