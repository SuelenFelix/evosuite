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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_build_9053611566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3949;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_build_9053611566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3953 = new Long(1597484336218508869L);
        Double term3956 = new Double(0.7080134263823477);
        Integer term3958 = new Integer(906181092);
        Object term3952 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3952, term3952.getClass(), "id", term3953);
        setField(term3952, term3952.getClass(), "nombre", "");
        setField(term3952, term3952.getClass(), "precio", term3956);
        setField(term3952, term3952.getClass(), "stock", term3958);
        setField(term3952, term3952.getClass(), "imagen", "");
        setField(term3952, term3952.getClass(), "createdAt", "");
        Long term3963 = new Long(-685023850445639859L);
        Double term3966 = new Double(0.6059734092898602);
        Integer term3968 = new Integer(1045657203);
        Object term3962 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3962, term3962.getClass(), "id", term3963);
        setField(term3962, term3962.getClass(), "nombre", "");
        setField(term3962, term3962.getClass(), "precio", term3966);
        setField(term3962, term3962.getClass(), "stock", term3968);
        setField(term3962, term3962.getClass(), "imagen", "");
        setField(term3962, term3962.getClass(), "createdAt", "");
        Long term3973 = new Long(-6950146046121430355L);
        Double term3976 = new Double(0.3074693824288357);
        Integer term3978 = new Integer(1386130016);
        Object term3972 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3972, term3972.getClass(), "id", term3973);
        setField(term3972, term3972.getClass(), "nombre", "");
        setField(term3972, term3972.getClass(), "precio", term3976);
        setField(term3972, term3972.getClass(), "stock", term3978);
        setField(term3972, term3972.getClass(), "imagen", "");
        setField(term3972, term3972.getClass(), "createdAt", "");
        Long term3983 = new Long(1667122142089513324L);
        Double term3986 = new Double(0.1245258965512791);
        Integer term3988 = new Integer(1072005683);
        Object term3982 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3982, term3982.getClass(), "id", term3983);
        setField(term3982, term3982.getClass(), "nombre", "");
        setField(term3982, term3982.getClass(), "precio", term3986);
        setField(term3982, term3982.getClass(), "stock", term3988);
        setField(term3982, term3982.getClass(), "imagen", "");
        setField(term3982, term3982.getClass(), "createdAt", "");
        ArrayList term3950 = new ArrayList();
        ((ArrayList) term3950).add(term3952);
        ((ArrayList) term3950).add(term3962);
        ((ArrayList) term3950).add(term3972);
        ((ArrayList) term3950).add(term3982);
        term3949 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term3949, term3949.getClass(), "data", term3950);
        setIntField(term3949, term3949.getClass(), "currentPage", -602026508);
        setLongField(term3949, term3949.getClass(), "totalElements", -2585684163342970173L);
        setIntField(term3949, term3949.getClass(), "totalPages", -157887805);
        setField(term3949, term3949.getClass(), "sort", "bKBSncrMEZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3949, args);
    }

};


