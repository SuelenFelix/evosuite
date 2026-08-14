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

public class ProductoDTO_getPrecio_13610378093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2671;

    public ProductoDTO_getPrecio_13610378093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2672 = new Long(9013624480170062917L);
        Double term2686 = new Double(0.146431486357265);
        Integer term2688 = new Integer(1090617576);
        term2671 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2671, term2671.getClass(), "id", term2672);
        setField(term2671, term2671.getClass(), "nombre", "TXZAIPQJHt");
        setField(term2671, term2671.getClass(), "precio", term2686);
        setField(term2671, term2671.getClass(), "stock", term2688);
        setField(term2671, term2671.getClass(), "imagen", "DIbeDHICho");
        setField(term2671, term2671.getClass(), "createdAt", "dJGPlmSRnz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrecio", argTypes, term2671, args);
    }

};


