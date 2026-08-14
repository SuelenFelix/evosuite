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
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ProductoDTO_ProductoDTOBuilder_build_5550049717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5458;

    public ProductoDTO_ProductoDTOBuilder_build_5550049717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5459 = new Long(-1333707622307134180L);
        Double term5473 = new Double(0.5597136413549945);
        Integer term5475 = new Integer(-461771056);
        term5458 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5458, term5458.getClass(), "id", term5459);
        setField(term5458, term5458.getClass(), "nombre", "uzmqjnOUXu");
        setField(term5458, term5458.getClass(), "precio", term5473);
        setField(term5458, term5458.getClass(), "stock", term5475);
        setField(term5458, term5458.getClass(), "imagen", "xeyjTOCOJb");
        setField(term5458, term5458.getClass(), "createdAt", "DGRqjjdhzy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term5458, args);
    }

};


