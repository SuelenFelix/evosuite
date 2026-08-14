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

public class ProductoDTO_ProductoDTOBuilder_toString_7474364478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5531;

    public ProductoDTO_ProductoDTOBuilder_toString_7474364478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5532 = new Long(-4360569253593381888L);
        Double term5546 = new Double(0.28292420012823627);
        Integer term5548 = new Integer(-243422082);
        term5531 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5531, term5531.getClass(), "id", term5532);
        setField(term5531, term5531.getClass(), "nombre", "lQFkjJUPAR");
        setField(term5531, term5531.getClass(), "precio", term5546);
        setField(term5531, term5531.getClass(), "stock", term5548);
        setField(term5531, term5531.getClass(), "imagen", "BsuVlGUUjV");
        setField(term5531, term5531.getClass(), "createdAt", "bHHjfDCntT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5531, args);
    }

};


