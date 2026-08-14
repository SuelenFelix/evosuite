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

public class ProductoDTO_ProductoDTOBuilder_nombre_19006220852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5023;

    public ProductoDTO_ProductoDTOBuilder_nombre_19006220852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5024 = new Long(-6301101997917060727L);
        Double term5038 = new Double(0.9165240441138934);
        Integer term5040 = new Integer(11724947);
        term5023 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5023, term5023.getClass(), "id", term5024);
        setField(term5023, term5023.getClass(), "nombre", "GbahCBMvct");
        setField(term5023, term5023.getClass(), "precio", term5038);
        setField(term5023, term5023.getClass(), "stock", term5040);
        setField(term5023, term5023.getClass(), "imagen", "iiHBhsNFgk");
        setField(term5023, term5023.getClass(), "createdAt", "HknsTajwxJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XtiurrVYKw";
        callMethod(klass, "nombre", argTypes, term5023, args);
    }

};


