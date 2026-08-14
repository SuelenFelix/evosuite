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

public class ProductoDTO_ProductoDTOBuilder_precio_13377880303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5118;
     Object term5161;

    public ProductoDTO_ProductoDTOBuilder_precio_13377880303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5119 = new Long(8166095254618543564L);
        Double term5133 = new Double(0.22227423914231126);
        Integer term5135 = new Integer(1953277050);
        term5118 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5118, term5118.getClass(), "id", term5119);
        setField(term5118, term5118.getClass(), "nombre", "rsumfoDNHa");
        setField(term5118, term5118.getClass(), "precio", term5133);
        setField(term5118, term5118.getClass(), "stock", term5135);
        setField(term5118, term5118.getClass(), "imagen", "ceCWHUTQUM");
        setField(term5118, term5118.getClass(), "createdAt", "LrqwfrKKtS");
        term5161 = new Double(0.06480976831423468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term5161;
        callMethod(klass, "precio", argTypes, term5118, args);
    }

};


