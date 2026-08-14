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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ListProductoPageDTO_ListProductoPageDTOBuilder_toString_8197862357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4019;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_toString_8197862357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4023 = new Long(-6342139649364011743L);
        Double term4026 = new Double(0.9511861072660375);
        Integer term4028 = new Integer(1861318859);
        Object term4022 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4022, term4022.getClass(), "id", term4023);
        setField(term4022, term4022.getClass(), "nombre", "");
        setField(term4022, term4022.getClass(), "precio", term4026);
        setField(term4022, term4022.getClass(), "stock", term4028);
        setField(term4022, term4022.getClass(), "imagen", "");
        setField(term4022, term4022.getClass(), "createdAt", "");
        ArrayList term4020 = new ArrayList();
        ((ArrayList) term4020).add(term4022);
        term4019 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term4019, term4019.getClass(), "data", term4020);
        setIntField(term4019, term4019.getClass(), "currentPage", 1876565163);
        setLongField(term4019, term4019.getClass(), "totalElements", 8059786003080744426L);
        setIntField(term4019, term4019.getClass(), "totalPages", -817164822);
        setField(term4019, term4019.getClass(), "sort", "cdHYQDgUZR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4019, args);
    }

};


