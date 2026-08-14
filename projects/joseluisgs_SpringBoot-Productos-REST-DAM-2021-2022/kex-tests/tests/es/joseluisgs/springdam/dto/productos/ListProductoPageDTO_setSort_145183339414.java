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

public class ListProductoPageDTO_setSort_145183339414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319;

    public ListProductoPageDTO_setSort_145183339414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2359 = new Long(6682528376118987775L);
        Double term2362 = new Double(0.32554480512985284);
        Integer term2364 = new Integer(1655935355);
        Object term2358 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2358, term2358.getClass(), "id", term2359);
        setField(term2358, term2358.getClass(), "nombre", "");
        setField(term2358, term2358.getClass(), "precio", term2362);
        setField(term2358, term2358.getClass(), "stock", term2364);
        setField(term2358, term2358.getClass(), "imagen", "");
        setField(term2358, term2358.getClass(), "createdAt", "");
        Long term2369 = new Long(682356318767179819L);
        Double term2372 = new Double(0.8924855581421237);
        Integer term2374 = new Integer(-481533957);
        Object term2368 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2368, term2368.getClass(), "id", term2369);
        setField(term2368, term2368.getClass(), "nombre", "");
        setField(term2368, term2368.getClass(), "precio", term2372);
        setField(term2368, term2368.getClass(), "stock", term2374);
        setField(term2368, term2368.getClass(), "imagen", "");
        setField(term2368, term2368.getClass(), "createdAt", "");
        ArrayList term2356 = new ArrayList();
        ((ArrayList) term2356).add(term2358);
        ((ArrayList) term2356).add(term2368);
        term2319 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2319, term2319.getClass(), "consulta", "pXdglvyrQe");
        setField(term2319, term2319.getClass(), "project", "OcfNzHYdki");
        setField(term2319, term2319.getClass(), "version", "uPuCVuZYOI");
        setField(term2319, term2319.getClass(), "data", term2356);
        setIntField(term2319, term2319.getClass(), "currentPage", -1275173084);
        setLongField(term2319, term2319.getClass(), "totalElements", -5476826692763582090L);
        setIntField(term2319, term2319.getClass(), "totalPages", -244121226);
        setField(term2319, term2319.getClass(), "sort", "tsTGdgQYUL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TtGbVmKcnX";
        callMethod(klass, "setSort", argTypes, term2319, args);
    }

};


