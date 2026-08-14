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

public class ProductoDTO_ProductoDTOBuilder_imagen_3378132015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5268;

    public ProductoDTO_ProductoDTOBuilder_imagen_3378132015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5269 = new Long(138235087558060686L);
        Double term5283 = new Double(0.23129126164078717);
        Integer term5285 = new Integer(1398204340);
        term5268 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5268, term5268.getClass(), "id", term5269);
        setField(term5268, term5268.getClass(), "nombre", "vqnBkkxoIa");
        setField(term5268, term5268.getClass(), "precio", term5283);
        setField(term5268, term5268.getClass(), "stock", term5285);
        setField(term5268, term5268.getClass(), "imagen", "bycpZjxXFn");
        setField(term5268, term5268.getClass(), "createdAt", "jQWttOAiwL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzKFxEuEEC";
        callMethod(klass, "imagen", argTypes, term5268, args);
    }

};


