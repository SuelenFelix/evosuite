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

public class ProductoDTO_getNombre_1702138762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2598;

    public ProductoDTO_getNombre_1702138762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2599 = new Long(-5963439350418910964L);
        Double term2613 = new Double(0.53094494792755);
        Integer term2615 = new Integer(-1465035361);
        term2598 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2598, term2598.getClass(), "id", term2599);
        setField(term2598, term2598.getClass(), "nombre", "vKitydDVnM");
        setField(term2598, term2598.getClass(), "precio", term2613);
        setField(term2598, term2598.getClass(), "stock", term2615);
        setField(term2598, term2598.getClass(), "imagen", "urCiQnUFBM");
        setField(term2598, term2598.getClass(), "createdAt", "EKjQdtKxAM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNombre", argTypes, term2598, args);
    }

};


