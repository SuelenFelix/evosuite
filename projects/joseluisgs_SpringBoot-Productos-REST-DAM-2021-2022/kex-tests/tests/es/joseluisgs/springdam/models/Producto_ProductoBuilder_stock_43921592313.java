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

public class Producto_ProductoBuilder_stock_43921592313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1667;

    public Producto_ProductoBuilder_stock_43921592313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1667 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder"));
        setField(term1667, term1667.getClass(), "id", null);
        setField(term1667, term1667.getClass(), "nombre", null);
        setField(term1667, term1667.getClass(), "precio", null);
        setField(term1667, term1667.getClass(), "stock", null);
        setField(term1667, term1667.getClass(), "imagen", null);
        setField(term1667, term1667.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto$ProductoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "stock", argTypes, term1667, args);
    }

};


