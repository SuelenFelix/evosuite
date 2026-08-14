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

public class ProductoDTO_setNombre_20161276928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3038;

    public ProductoDTO_setNombre_20161276928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3039 = new Long(5946780097489996391L);
        Double term3053 = new Double(0.3626177854778667);
        Integer term3055 = new Integer(-1772434990);
        term3038 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3038, term3038.getClass(), "id", term3039);
        setField(term3038, term3038.getClass(), "nombre", "NTWMiBEaDF");
        setField(term3038, term3038.getClass(), "precio", term3053);
        setField(term3038, term3038.getClass(), "stock", term3055);
        setField(term3038, term3038.getClass(), "imagen", "SPBstwKFVr");
        setField(term3038, term3038.getClass(), "createdAt", "WxYUTuqmIq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OeQLvhVERT";
        callMethod(klass, "setNombre", argTypes, term3038, args);
    }

};


