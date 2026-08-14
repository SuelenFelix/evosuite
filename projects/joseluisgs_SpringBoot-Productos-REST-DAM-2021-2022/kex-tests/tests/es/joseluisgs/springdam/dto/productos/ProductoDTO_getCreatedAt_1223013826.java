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

public class ProductoDTO_getCreatedAt_1223013826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2890;

    public ProductoDTO_getCreatedAt_1223013826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2891 = new Long(5510783420697225605L);
        Double term2905 = new Double(0.5187846213101265);
        Integer term2907 = new Integer(1114000454);
        term2890 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2890, term2890.getClass(), "id", term2891);
        setField(term2890, term2890.getClass(), "nombre", "EdPAvpluZg");
        setField(term2890, term2890.getClass(), "precio", term2905);
        setField(term2890, term2890.getClass(), "stock", term2907);
        setField(term2890, term2890.getClass(), "imagen", "DzHVBMqWtE");
        setField(term2890, term2890.getClass(), "createdAt", "THZSpzBRYP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term2890, args);
    }

};


