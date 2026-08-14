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

public class ListProductoPageDTO_getProject_5806005713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;

    public ListProductoPageDTO_getProject_5806005713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term614 = new ArrayList();
        term577 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term577, term577.getClass(), "consulta", "YRHGsAkhxb");
        setField(term577, term577.getClass(), "project", "ffYhPOzlUs");
        setField(term577, term577.getClass(), "version", "MLqYREekMl");
        setField(term577, term577.getClass(), "data", term614);
        setIntField(term577, term577.getClass(), "currentPage", -1922583790);
        setLongField(term577, term577.getClass(), "totalElements", -8257434502486459194L);
        setIntField(term577, term577.getClass(), "totalPages", -616727354);
        setField(term577, term577.getClass(), "sort", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProject", argTypes, term577, args);
    }

};


