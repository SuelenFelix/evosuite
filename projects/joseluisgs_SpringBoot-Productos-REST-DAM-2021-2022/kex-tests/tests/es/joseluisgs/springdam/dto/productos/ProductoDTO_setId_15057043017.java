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

public class ProductoDTO_setId_15057043017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2963;
     Object term3006;

    public ProductoDTO_setId_15057043017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2964 = new Long(6005241913654469005L);
        Double term2978 = new Double(0.045893173090043815);
        Integer term2980 = new Integer(-556405712);
        term2963 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2963, term2963.getClass(), "id", term2964);
        setField(term2963, term2963.getClass(), "nombre", "ZfBIVGBQOE");
        setField(term2963, term2963.getClass(), "precio", term2978);
        setField(term2963, term2963.getClass(), "stock", term2980);
        setField(term2963, term2963.getClass(), "imagen", "QSrDQfEsTR");
        setField(term2963, term2963.getClass(), "createdAt", "PsqusYmejD");
        term3006 = new Long(-1983291584002806658L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3006;
        callMethod(klass, "setId", argTypes, term2963, args);
    }

};


