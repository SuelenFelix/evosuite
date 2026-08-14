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

public class ListProductoPageDTO_setTotalElements_119446587612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2023;
     Object term2129;

    public ListProductoPageDTO_setTotalElements_119446587612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2063 = new Long(-1610676979013636850L);
        Double term2066 = new Double(0.6355029654528058);
        Integer term2068 = new Integer(962840079);
        Object term2062 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2062, term2062.getClass(), "id", term2063);
        setField(term2062, term2062.getClass(), "nombre", "");
        setField(term2062, term2062.getClass(), "precio", term2066);
        setField(term2062, term2062.getClass(), "stock", term2068);
        setField(term2062, term2062.getClass(), "imagen", "");
        setField(term2062, term2062.getClass(), "createdAt", "");
        Long term2073 = new Long(2062173786000223358L);
        Double term2076 = new Double(0.0022646783892913414);
        Integer term2078 = new Integer(1540719661);
        Object term2072 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2072, term2072.getClass(), "id", term2073);
        setField(term2072, term2072.getClass(), "nombre", "");
        setField(term2072, term2072.getClass(), "precio", term2076);
        setField(term2072, term2072.getClass(), "stock", term2078);
        setField(term2072, term2072.getClass(), "imagen", "");
        setField(term2072, term2072.getClass(), "createdAt", "");
        Long term2083 = new Long(-8658027316505137504L);
        Double term2086 = new Double(0.36226058076369927);
        Integer term2088 = new Integer(1265463001);
        Object term2082 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2082, term2082.getClass(), "id", term2083);
        setField(term2082, term2082.getClass(), "nombre", "");
        setField(term2082, term2082.getClass(), "precio", term2086);
        setField(term2082, term2082.getClass(), "stock", term2088);
        setField(term2082, term2082.getClass(), "imagen", "");
        setField(term2082, term2082.getClass(), "createdAt", "");
        Long term2093 = new Long(414749984815662075L);
        Double term2096 = new Double(0.03699061125289671);
        Integer term2098 = new Integer(335112684);
        Object term2092 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2092, term2092.getClass(), "id", term2093);
        setField(term2092, term2092.getClass(), "nombre", "");
        setField(term2092, term2092.getClass(), "precio", term2096);
        setField(term2092, term2092.getClass(), "stock", term2098);
        setField(term2092, term2092.getClass(), "imagen", "");
        setField(term2092, term2092.getClass(), "createdAt", "");
        Long term2103 = new Long(463622836963501975L);
        Double term2106 = new Double(0.6047137830113202);
        Integer term2108 = new Integer(1551099402);
        Object term2102 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2102, term2102.getClass(), "id", term2103);
        setField(term2102, term2102.getClass(), "nombre", "");
        setField(term2102, term2102.getClass(), "precio", term2106);
        setField(term2102, term2102.getClass(), "stock", term2108);
        setField(term2102, term2102.getClass(), "imagen", "");
        setField(term2102, term2102.getClass(), "createdAt", "");
        ArrayList term2060 = new ArrayList();
        ((ArrayList) term2060).add(term2062);
        ((ArrayList) term2060).add(term2072);
        ((ArrayList) term2060).add(term2082);
        ((ArrayList) term2060).add(term2092);
        ((ArrayList) term2060).add(term2102);
        term2023 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2023, term2023.getClass(), "consulta", "IpQuOGMgmj");
        setField(term2023, term2023.getClass(), "project", "pJbnHTYrxn");
        setField(term2023, term2023.getClass(), "version", "iIRsCSYqXH");
        setField(term2023, term2023.getClass(), "data", term2060);
        setIntField(term2023, term2023.getClass(), "currentPage", -117576464);
        setLongField(term2023, term2023.getClass(), "totalElements", -8885298608300233488L);
        setIntField(term2023, term2023.getClass(), "totalPages", -1007160944);
        setField(term2023, term2023.getClass(), "sort", "lCyLIcSuom");
        term2129 = new Long(-4325723315152823407L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2129;
        callMethod(klass, "setTotalElements", argTypes, term2023, args);
    }

};


