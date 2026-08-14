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

public class ProductoDTO_ProductoDTOBuilder_imagen_33781320114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5608;

    public ProductoDTO_ProductoDTOBuilder_imagen_33781320114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5608 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5608, term5608.getClass(), "id", null);
        setField(term5608, term5608.getClass(), "nombre", null);
        setField(term5608, term5608.getClass(), "precio", null);
        setField(term5608, term5608.getClass(), "stock", null);
        setField(term5608, term5608.getClass(), "imagen", null);
        setField(term5608, term5608.getClass(), "createdAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "imagen", argTypes, term5608, args);
    }

};


