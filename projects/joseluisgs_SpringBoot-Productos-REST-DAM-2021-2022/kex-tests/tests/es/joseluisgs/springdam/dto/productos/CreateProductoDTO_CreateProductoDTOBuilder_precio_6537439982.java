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

public class CreateProductoDTO_CreateProductoDTOBuilder_precio_6537439982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4142;
     Object term4159;

    public CreateProductoDTO_CreateProductoDTOBuilder_precio_6537439982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4155 = new Double(0.34010089048558567);
        Integer term4157 = new Integer(568954359);
        term4142 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder"));
        setField(term4142, term4142.getClass(), "nombre", "huVIXUWLtI");
        setField(term4142, term4142.getClass(), "precio", term4155);
        setField(term4142, term4142.getClass(), "stock", term4157);
        term4159 = new Double(0.19625398866403143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term4159;
        callMethod(klass, "precio", argTypes, term4142, args);
    }

};


