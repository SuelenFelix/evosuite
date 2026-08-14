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

public class ListProductoPageDTO_setCurrentPage_160089224911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1865;
     Object term1981;

    public ListProductoPageDTO_setCurrentPage_160089224911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1905 = new Long(3825396310311739952L);
        Double term1908 = new Double(0.5306473989087822);
        Integer term1910 = new Integer(1324040357);
        Object term1904 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1904, term1904.getClass(), "id", term1905);
        setField(term1904, term1904.getClass(), "nombre", "");
        setField(term1904, term1904.getClass(), "precio", term1908);
        setField(term1904, term1904.getClass(), "stock", term1910);
        setField(term1904, term1904.getClass(), "imagen", "");
        setField(term1904, term1904.getClass(), "createdAt", "");
        Long term1915 = new Long(-3838084482494604218L);
        Double term1918 = new Double(0.022483645678509023);
        Integer term1920 = new Integer(-1588772968);
        Object term1914 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1914, term1914.getClass(), "id", term1915);
        setField(term1914, term1914.getClass(), "nombre", "");
        setField(term1914, term1914.getClass(), "precio", term1918);
        setField(term1914, term1914.getClass(), "stock", term1920);
        setField(term1914, term1914.getClass(), "imagen", "");
        setField(term1914, term1914.getClass(), "createdAt", "");
        Long term1925 = new Long(3892018155439224435L);
        Double term1928 = new Double(0.025133051616627267);
        Integer term1930 = new Integer(-93135961);
        Object term1924 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1924, term1924.getClass(), "id", term1925);
        setField(term1924, term1924.getClass(), "nombre", "");
        setField(term1924, term1924.getClass(), "precio", term1928);
        setField(term1924, term1924.getClass(), "stock", term1930);
        setField(term1924, term1924.getClass(), "imagen", "");
        setField(term1924, term1924.getClass(), "createdAt", "");
        Long term1935 = new Long(5953383087795962419L);
        Double term1938 = new Double(0.016575281023182953);
        Integer term1940 = new Integer(-112921587);
        Object term1934 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1934, term1934.getClass(), "id", term1935);
        setField(term1934, term1934.getClass(), "nombre", "");
        setField(term1934, term1934.getClass(), "precio", term1938);
        setField(term1934, term1934.getClass(), "stock", term1940);
        setField(term1934, term1934.getClass(), "imagen", "");
        setField(term1934, term1934.getClass(), "createdAt", "");
        Long term1945 = new Long(7994303628307559416L);
        Double term1948 = new Double(0.5308350402051779);
        Integer term1950 = new Integer(933028652);
        Object term1944 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1944, term1944.getClass(), "id", term1945);
        setField(term1944, term1944.getClass(), "nombre", "");
        setField(term1944, term1944.getClass(), "precio", term1948);
        setField(term1944, term1944.getClass(), "stock", term1950);
        setField(term1944, term1944.getClass(), "imagen", "");
        setField(term1944, term1944.getClass(), "createdAt", "");
        Long term1955 = new Long(2443640364875054177L);
        Double term1958 = new Double(0.7154795600170818);
        Integer term1960 = new Integer(287287233);
        Object term1954 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term1954, term1954.getClass(), "id", term1955);
        setField(term1954, term1954.getClass(), "nombre", "");
        setField(term1954, term1954.getClass(), "precio", term1958);
        setField(term1954, term1954.getClass(), "stock", term1960);
        setField(term1954, term1954.getClass(), "imagen", "");
        setField(term1954, term1954.getClass(), "createdAt", "");
        ArrayList term1902 = new ArrayList();
        ((ArrayList) term1902).add(term1904);
        ((ArrayList) term1902).add(term1914);
        ((ArrayList) term1902).add(term1924);
        ((ArrayList) term1902).add(term1934);
        ((ArrayList) term1902).add(term1944);
        ((ArrayList) term1902).add(term1954);
        term1865 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term1865, term1865.getClass(), "consulta", "zcorEihhLK");
        setField(term1865, term1865.getClass(), "project", "GrqozDKFOk");
        setField(term1865, term1865.getClass(), "version", "CFyoseFGLF");
        setField(term1865, term1865.getClass(), "data", term1902);
        setIntField(term1865, term1865.getClass(), "currentPage", -655067527);
        setLongField(term1865, term1865.getClass(), "totalElements", -2813493605142626659L);
        setIntField(term1865, term1865.getClass(), "totalPages", -6029667);
        setField(term1865, term1865.getClass(), "sort", "ShIELyuULw");
        term1981 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1981;
        callMethod(klass, "setCurrentPage", argTypes, term1865, args);
    }

};


