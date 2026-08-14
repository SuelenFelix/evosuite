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

public class ProductoDTO_setPrecio_12222824239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;
     Object term3176;

    public ProductoDTO_setPrecio_12222824239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3134 = new Long(-8652538484981166496L);
        Double term3148 = new Double(0.3163771663728089);
        Integer term3150 = new Integer(-1845499264);
        term3133 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3133, term3133.getClass(), "id", term3134);
        setField(term3133, term3133.getClass(), "nombre", "IlvgFINwIa");
        setField(term3133, term3133.getClass(), "precio", term3148);
        setField(term3133, term3133.getClass(), "stock", term3150);
        setField(term3133, term3133.getClass(), "imagen", "GEJABPlHSI");
        setField(term3133, term3133.getClass(), "createdAt", "aQFUvuaYxd");
        term3176 = new Double(0.8819646072665548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term3176;
        callMethod(klass, "setPrecio", argTypes, term3133, args);
    }

};


