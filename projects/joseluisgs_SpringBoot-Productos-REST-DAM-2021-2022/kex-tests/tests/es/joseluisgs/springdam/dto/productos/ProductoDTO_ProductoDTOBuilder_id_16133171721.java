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

public class ProductoDTO_ProductoDTOBuilder_id_16133171721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4948;
     Object term4991;

    public ProductoDTO_ProductoDTOBuilder_id_16133171721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4949 = new Long(-3948863953565024517L);
        Double term4963 = new Double(0.6054109236809134);
        Integer term4965 = new Integer(-227365013);
        term4948 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term4948, term4948.getClass(), "id", term4949);
        setField(term4948, term4948.getClass(), "nombre", "CNqMxLvtcJ");
        setField(term4948, term4948.getClass(), "precio", term4963);
        setField(term4948, term4948.getClass(), "stock", term4965);
        setField(term4948, term4948.getClass(), "imagen", "ktbqerIaKW");
        setField(term4948, term4948.getClass(), "createdAt", "VoghngXfsK");
        term4991 = new Long(-6587807377747738663L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4991;
        callMethod(klass, "id", argTypes, term4948, args);
    }

};


