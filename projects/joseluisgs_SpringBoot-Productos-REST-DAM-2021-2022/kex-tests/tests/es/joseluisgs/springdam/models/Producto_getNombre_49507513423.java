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

public class Producto_getNombre_49507513423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1101;

    public Producto_getNombre_49507513423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1101 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term1101, term1101.getClass(), "id", null);
        setField(term1101, term1101.getClass(), "nombre", null);
        setField(term1101, term1101.getClass(), "precio", null);
        setField(term1101, term1101.getClass(), "stock", null);
        setField(term1101, term1101.getClass(), "imagen", null);
        setField(term1101, term1101.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNombre", argTypes, term1101, args);
    }

};


