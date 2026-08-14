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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_sort_157695568613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4081;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_sort_157695568613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4081 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term4081, term4081.getClass(), "data", null);
        setIntField(term4081, term4081.getClass(), "currentPage", 0);
        setLongField(term4081, term4081.getClass(), "totalElements", 0L);
        setIntField(term4081, term4081.getClass(), "totalPages", 0);
        setField(term4081, term4081.getClass(), "sort", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "sort", argTypes, term4081, args);
    }

};


