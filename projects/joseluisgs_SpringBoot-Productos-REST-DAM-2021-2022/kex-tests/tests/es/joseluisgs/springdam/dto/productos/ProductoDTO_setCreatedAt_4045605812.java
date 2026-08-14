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

public class ProductoDTO_setCreatedAt_4045605812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3378;

    public ProductoDTO_setCreatedAt_4045605812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3379 = new Long(2848819812340321742L);
        Double term3393 = new Double(0.39286935532362843);
        Integer term3395 = new Integer(444029505);
        term3378 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3378, term3378.getClass(), "id", term3379);
        setField(term3378, term3378.getClass(), "nombre", "riMtzCoxNj");
        setField(term3378, term3378.getClass(), "precio", term3393);
        setField(term3378, term3378.getClass(), "stock", term3395);
        setField(term3378, term3378.getClass(), "imagen", "YAXkVjQZcV");
        setField(term3378, term3378.getClass(), "createdAt", "pumvwBWvpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HwLHeGLyhe";
        callMethod(klass, "setCreatedAt", argTypes, term3378, args);
    }

};


