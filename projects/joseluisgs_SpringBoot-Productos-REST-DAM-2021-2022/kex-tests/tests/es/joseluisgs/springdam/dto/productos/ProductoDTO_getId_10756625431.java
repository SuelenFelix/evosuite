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

public class ProductoDTO_getId_10756625431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2525;

    public ProductoDTO_getId_10756625431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2526 = new Long(-7291743527973326814L);
        Double term2540 = new Double(0.32237559209193944);
        Integer term2542 = new Integer(1240914516);
        term2525 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2525, term2525.getClass(), "id", term2526);
        setField(term2525, term2525.getClass(), "nombre", "GJVkUrCVdD");
        setField(term2525, term2525.getClass(), "precio", term2540);
        setField(term2525, term2525.getClass(), "stock", term2542);
        setField(term2525, term2525.getClass(), "imagen", "zNdorvdUgu");
        setField(term2525, term2525.getClass(), "createdAt", "oPxuZbkYio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2525, args);
    }

};


