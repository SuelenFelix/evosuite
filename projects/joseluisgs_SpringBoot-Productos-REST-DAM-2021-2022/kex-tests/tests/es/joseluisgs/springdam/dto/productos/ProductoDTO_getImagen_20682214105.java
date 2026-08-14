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

public class ProductoDTO_getImagen_20682214105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2817;

    public ProductoDTO_getImagen_20682214105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2818 = new Long(50358265865610362L);
        Double term2832 = new Double(0.1544348383112728);
        Integer term2834 = new Integer(1442160736);
        term2817 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2817, term2817.getClass(), "id", term2818);
        setField(term2817, term2817.getClass(), "nombre", "PXdVZyoJyC");
        setField(term2817, term2817.getClass(), "precio", term2832);
        setField(term2817, term2817.getClass(), "stock", term2834);
        setField(term2817, term2817.getClass(), "imagen", "vLerpqavFM");
        setField(term2817, term2817.getClass(), "createdAt", "qnvxzwuGKX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImagen", argTypes, term2817, args);
    }

};


