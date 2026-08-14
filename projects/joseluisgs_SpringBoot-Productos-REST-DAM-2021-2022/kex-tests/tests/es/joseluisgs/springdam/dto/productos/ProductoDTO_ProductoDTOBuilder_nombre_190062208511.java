package es.joseluisgs.springdam.dto.productos;

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
import static es.joseluisgs.springdam.dto.productos.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductoDTO_ProductoDTOBuilder_nombre_190062208511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5605;

    public ProductoDTO_ProductoDTOBuilder_nombre_190062208511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5605 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5605, term5605.getClass(), "id", null);
        setField(term5605, term5605.getClass(), "nombre", null);
        setField(term5605, term5605.getClass(), "precio", null);
        setField(term5605, term5605.getClass(), "stock", null);
        setField(term5605, term5605.getClass(), "imagen", null);
        setField(term5605, term5605.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "nombre", argTypes, term5605, args);
    }

};


