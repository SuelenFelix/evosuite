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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_data_15948894599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4059;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_data_15948894599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4059 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term4059, term4059.getClass(), "data", null);
        setIntField(term4059, term4059.getClass(), "currentPage", 0);
        setLongField(term4059, term4059.getClass(), "totalElements", 0L);
        setIntField(term4059, term4059.getClass(), "totalPages", 0);
        setField(term4059, term4059.getClass(), "sort", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "data", argTypes, term4059, args);
    }

};


