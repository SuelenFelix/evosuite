package es.joseluisgs.springdam.mappers;

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
import static es.joseluisgs.springdam.mappers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Integer;

public class ProductoMapper_fromDTO_7412978543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262;

    public ProductoMapper_fromDTO_7412978543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term275 = new Double(0.36923381893433327);
        Integer term277 = new Integer(-2038273078);
        term262 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO"));
        setField(term262, term262.getClass(), "nombre", "aJlieCFVtF");
        setField(term262, term262.getClass(), "precio", term275);
        setField(term262, term262.getClass(), "stock", term277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.mappers.ProductoMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("es.joseluisgs.springdam.dto.productos.CreateProductoDTO");
        Object[] args = new Object[1];
        args[0] = term262;
        callMethod(klass, "fromDTO", argTypes, null, args);
    }

};


