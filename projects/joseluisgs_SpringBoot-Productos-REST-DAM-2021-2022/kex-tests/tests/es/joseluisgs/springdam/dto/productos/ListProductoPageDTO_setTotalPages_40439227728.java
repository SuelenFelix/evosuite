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
import java.lang.Integer;

public class ListProductoPageDTO_setTotalPages_40439227728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2515;
     Object term2519;

    public ListProductoPageDTO_setTotalPages_40439227728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2515 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2515, term2515.getClass(), "consulta", null);
        setField(term2515, term2515.getClass(), "project", null);
        setField(term2515, term2515.getClass(), "version", null);
        setField(term2515, term2515.getClass(), "data", null);
        setIntField(term2515, term2515.getClass(), "currentPage", 0);
        setLongField(term2515, term2515.getClass(), "totalElements", 0L);
        setIntField(term2515, term2515.getClass(), "totalPages", 0);
        setField(term2515, term2515.getClass(), "sort", null);
        term2519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2519;
        callMethod(klass, "setTotalPages", argTypes, term2515, args);
    }

};


