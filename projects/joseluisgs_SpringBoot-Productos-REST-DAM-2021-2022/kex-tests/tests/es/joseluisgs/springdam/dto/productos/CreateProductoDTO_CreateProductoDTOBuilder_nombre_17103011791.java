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
import java.lang.Double;
import java.lang.Integer;

public class CreateProductoDTO_CreateProductoDTOBuilder_nombre_17103011791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4093;

    public CreateProductoDTO_CreateProductoDTOBuilder_nombre_17103011791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4106 = new Double(0.05880719443135807);
        Integer term4108 = new Integer(1474524152);
        term4093 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder"));
        setField(term4093, term4093.getClass(), "nombre", "KAORSSPSeV");
        setField(term4093, term4093.getClass(), "precio", term4106);
        setField(term4093, term4093.getClass(), "stock", term4108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UimMMORkzd";
        callMethod(klass, "nombre", argTypes, term4093, args);
    }

};


