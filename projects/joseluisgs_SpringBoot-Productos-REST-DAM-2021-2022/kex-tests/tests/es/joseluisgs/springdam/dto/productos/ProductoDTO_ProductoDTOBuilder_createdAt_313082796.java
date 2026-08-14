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

public class ProductoDTO_ProductoDTOBuilder_createdAt_313082796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5363;

    public ProductoDTO_ProductoDTOBuilder_createdAt_313082796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5364 = new Long(5381386339318883012L);
        Double term5378 = new Double(0.6047138318674447);
        Integer term5380 = new Integer(229204365);
        term5363 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5363, term5363.getClass(), "id", term5364);
        setField(term5363, term5363.getClass(), "nombre", "CAMnvfDLJL");
        setField(term5363, term5363.getClass(), "precio", term5378);
        setField(term5363, term5363.getClass(), "stock", term5380);
        setField(term5363, term5363.getClass(), "imagen", "mfHtgSbdjD");
        setField(term5363, term5363.getClass(), "createdAt", "cmuaUiHMVL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xjoSGPWUgu";
        callMethod(klass, "createdAt", argTypes, term5363, args);
    }

};


