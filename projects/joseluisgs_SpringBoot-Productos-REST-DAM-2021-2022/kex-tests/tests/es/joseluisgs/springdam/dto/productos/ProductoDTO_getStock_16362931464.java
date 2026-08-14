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

public class ProductoDTO_getStock_16362931464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2744;

    public ProductoDTO_getStock_16362931464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2745 = new Long(7862575738391801707L);
        Double term2759 = new Double(0.24259014218848696);
        Integer term2761 = new Integer(-1547384488);
        term2744 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2744, term2744.getClass(), "id", term2745);
        setField(term2744, term2744.getClass(), "nombre", "DPskuFUobI");
        setField(term2744, term2744.getClass(), "precio", term2759);
        setField(term2744, term2744.getClass(), "stock", term2761);
        setField(term2744, term2744.getClass(), "imagen", "wBGfLpNNiZ");
        setField(term2744, term2744.getClass(), "createdAt", "yUGCjlqgJE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStock", argTypes, term2744, args);
    }

};


