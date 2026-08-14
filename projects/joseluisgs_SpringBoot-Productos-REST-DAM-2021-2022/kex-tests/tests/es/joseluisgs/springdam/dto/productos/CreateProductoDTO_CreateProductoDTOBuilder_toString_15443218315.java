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

public class CreateProductoDTO_CreateProductoDTOBuilder_toString_15443218315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4227;

    public CreateProductoDTO_CreateProductoDTOBuilder_toString_15443218315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4240 = new Double(0.9022041121474429);
        Integer term4242 = new Integer(480137250);
        term4227 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder"));
        setField(term4227, term4227.getClass(), "nombre", "EusenEbIoF");
        setField(term4227, term4227.getClass(), "precio", term4240);
        setField(term4227, term4227.getClass(), "stock", term4242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4227, args);
    }

};


