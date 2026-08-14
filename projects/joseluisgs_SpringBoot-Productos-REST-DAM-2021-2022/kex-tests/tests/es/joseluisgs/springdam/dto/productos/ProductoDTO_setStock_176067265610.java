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

public class ProductoDTO_setStock_176067265610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3208;
     Object term3251;

    public ProductoDTO_setStock_176067265610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3209 = new Long(2701184207686293431L);
        Double term3223 = new Double(0.5412182593116958);
        Integer term3225 = new Integer(-505439934);
        term3208 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3208, term3208.getClass(), "id", term3209);
        setField(term3208, term3208.getClass(), "nombre", "zNFLXMifnS");
        setField(term3208, term3208.getClass(), "precio", term3223);
        setField(term3208, term3208.getClass(), "stock", term3225);
        setField(term3208, term3208.getClass(), "imagen", "HHQcYMSBVc");
        setField(term3208, term3208.getClass(), "createdAt", "wdoqITnaAP");
        term3251 = new Integer(-344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3251;
        callMethod(klass, "setStock", argTypes, term3208, args);
    }

};


