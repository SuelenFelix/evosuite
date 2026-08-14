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

public class ProductoDTO_setImagen_22230759411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3283;

    public ProductoDTO_setImagen_22230759411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3284 = new Long(4474998035090263139L);
        Double term3298 = new Double(0.16988691727397487);
        Integer term3300 = new Integer(941650513);
        term3283 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3283, term3283.getClass(), "id", term3284);
        setField(term3283, term3283.getClass(), "nombre", "rIPMBcrNqB");
        setField(term3283, term3283.getClass(), "precio", term3298);
        setField(term3283, term3283.getClass(), "stock", term3300);
        setField(term3283, term3283.getClass(), "imagen", "UDaboHZHhz");
        setField(term3283, term3283.getClass(), "createdAt", "nRvKihUSPj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BbNeQJpYPr";
        callMethod(klass, "setImagen", argTypes, term3283, args);
    }

};


