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

public class CreateProductoDTO_CreateProductoDTOBuilder_stock_21184877893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4171;
     Object term4188;

    public CreateProductoDTO_CreateProductoDTOBuilder_stock_21184877893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4184 = new Double(0.45069204793711093);
        Integer term4186 = new Integer(53410913);
        term4171 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder"));
        setField(term4171, term4171.getClass(), "nombre", "vhKzFyKPOT");
        setField(term4171, term4171.getClass(), "precio", term4184);
        setField(term4171, term4171.getClass(), "stock", term4186);
        term4188 = new Integer(-375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term4188;
        callMethod(klass, "stock", argTypes, term4171, args);
    }

};


