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

public class CreateProductoDTO_CreateProductoDTOBuilder_build_5659025694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4200;

    public CreateProductoDTO_CreateProductoDTOBuilder_build_5659025694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4213 = new Double(0.9341364461850963);
        Integer term4215 = new Integer(1107176718);
        term4200 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder"));
        setField(term4200, term4200.getClass(), "nombre", "nQhIgWXdRc");
        setField(term4200, term4200.getClass(), "precio", term4213);
        setField(term4200, term4200.getClass(), "stock", term4215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO$CreateProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term4200, args);
    }

};


