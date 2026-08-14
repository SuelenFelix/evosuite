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

public class ListProductoPageDTO_getTotalPages_5099875018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1237;

    public ListProductoPageDTO_getTotalPages_5099875018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1274 = new ArrayList();
        term1237 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term1237, term1237.getClass(), "consulta", "SdCKLMIYnX");
        setField(term1237, term1237.getClass(), "project", "OJJtVNPyKZ");
        setField(term1237, term1237.getClass(), "version", "AKNapTAfmD");
        setField(term1237, term1237.getClass(), "data", term1274);
        setIntField(term1237, term1237.getClass(), "currentPage", 1585847225);
        setLongField(term1237, term1237.getClass(), "totalElements", 6811161968424632369L);
        setIntField(term1237, term1237.getClass(), "totalPages", 597278769);
        setField(term1237, term1237.getClass(), "sort", "xJgPlLxpgC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPages", argTypes, term1237, args);
    }

};


