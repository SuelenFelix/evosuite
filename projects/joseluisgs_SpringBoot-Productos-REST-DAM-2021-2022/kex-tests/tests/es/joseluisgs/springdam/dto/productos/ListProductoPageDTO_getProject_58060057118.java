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

public class ListProductoPageDTO_getProject_58060057118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2471;

    public ListProductoPageDTO_getProject_58060057118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2471 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2471, term2471.getClass(), "consulta", null);
        setField(term2471, term2471.getClass(), "project", null);
        setField(term2471, term2471.getClass(), "version", null);
        setField(term2471, term2471.getClass(), "data", null);
        setIntField(term2471, term2471.getClass(), "currentPage", 0);
        setLongField(term2471, term2471.getClass(), "totalElements", 0L);
        setIntField(term2471, term2471.getClass(), "totalPages", 0);
        setField(term2471, term2471.getClass(), "sort", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProject", argTypes, term2471, args);
    }

};


