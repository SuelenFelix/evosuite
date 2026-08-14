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

public class ListProductoPageDTO_setCurrentPage_160089224926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2503;
     Object term2507;

    public ListProductoPageDTO_setCurrentPage_160089224926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2503 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2503, term2503.getClass(), "consulta", null);
        setField(term2503, term2503.getClass(), "project", null);
        setField(term2503, term2503.getClass(), "version", null);
        setField(term2503, term2503.getClass(), "data", null);
        setIntField(term2503, term2503.getClass(), "currentPage", 0);
        setLongField(term2503, term2503.getClass(), "totalElements", 0L);
        setIntField(term2503, term2503.getClass(), "totalPages", 0);
        setField(term2503, term2503.getClass(), "sort", null);
        term2507 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2507;
        callMethod(klass, "setCurrentPage", argTypes, term2503, args);
    }

};


