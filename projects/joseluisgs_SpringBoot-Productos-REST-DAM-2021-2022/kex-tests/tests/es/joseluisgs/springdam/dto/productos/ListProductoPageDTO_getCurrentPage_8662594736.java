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

public class ListProductoPageDTO_getCurrentPage_8662594736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term955;

    public ListProductoPageDTO_getCurrentPage_8662594736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term992 = new ArrayList();
        term955 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term955, term955.getClass(), "consulta", "jiKYgYHqIS");
        setField(term955, term955.getClass(), "project", "DfISiziTgG");
        setField(term955, term955.getClass(), "version", "XqgfKFvPSD");
        setField(term955, term955.getClass(), "data", term992);
        setIntField(term955, term955.getClass(), "currentPage", 1725571209);
        setLongField(term955, term955.getClass(), "totalElements", 7411271909051562686L);
        setIntField(term955, term955.getClass(), "totalPages", -522618178);
        setField(term955, term955.getClass(), "sort", "JiVRgTZvKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentPage", argTypes, term955, args);
    }

};


