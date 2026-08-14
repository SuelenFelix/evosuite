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
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ProductoDTO_ProductoDTOBuilder_stock_14344437574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5193;
     Object term5236;

    public ProductoDTO_ProductoDTOBuilder_stock_14344437574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5194 = new Long(-4598158870068953328L);
        Double term5208 = new Double(0.8490790645379176);
        Integer term5210 = new Integer(1283079251);
        term5193 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder"));
        setField(term5193, term5193.getClass(), "id", term5194);
        setField(term5193, term5193.getClass(), "nombre", "ZUdnQXfzCI");
        setField(term5193, term5193.getClass(), "precio", term5208);
        setField(term5193, term5193.getClass(), "stock", term5210);
        setField(term5193, term5193.getClass(), "imagen", "EULDrUNQvw");
        setField(term5193, term5193.getClass(), "createdAt", "BtvAvsJSei");
        term5236 = new Integer(-523949691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO$ProductoDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term5236;
        callMethod(klass, "stock", argTypes, term5193, args);
    }

};


