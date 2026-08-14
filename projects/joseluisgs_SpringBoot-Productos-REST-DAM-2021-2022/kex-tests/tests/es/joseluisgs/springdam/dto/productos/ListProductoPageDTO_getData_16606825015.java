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

public class ListProductoPageDTO_getData_16606825015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term809;

    public ListProductoPageDTO_getData_16606825015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term849 = new Long(-6573104506744284592L);
        Double term852 = new Double(0.5840714198152577);
        Integer term854 = new Integer(590364439);
        Object term848 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term848, term848.getClass(), "id", term849);
        setField(term848, term848.getClass(), "nombre", "");
        setField(term848, term848.getClass(), "precio", term852);
        setField(term848, term848.getClass(), "stock", term854);
        setField(term848, term848.getClass(), "imagen", "");
        setField(term848, term848.getClass(), "createdAt", "");
        Long term859 = new Long(-4920224193275732920L);
        Double term862 = new Double(0.7559240768573477);
        Integer term864 = new Integer(865208305);
        Object term858 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term858, term858.getClass(), "id", term859);
        setField(term858, term858.getClass(), "nombre", "");
        setField(term858, term858.getClass(), "precio", term862);
        setField(term858, term858.getClass(), "stock", term864);
        setField(term858, term858.getClass(), "imagen", "");
        setField(term858, term858.getClass(), "createdAt", "");
        Long term869 = new Long(8428634514691209827L);
        Double term872 = new Double(0.10667076642995188);
        Integer term874 = new Integer(-1275173084);
        Object term868 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term868, term868.getClass(), "id", term869);
        setField(term868, term868.getClass(), "nombre", "");
        setField(term868, term868.getClass(), "precio", term872);
        setField(term868, term868.getClass(), "stock", term874);
        setField(term868, term868.getClass(), "imagen", "");
        setField(term868, term868.getClass(), "createdAt", "");
        Long term879 = new Long(-2585684163342970173L);
        Double term882 = new Double(0.11493000848982304);
        Integer term884 = new Integer(-244121226);
        Object term878 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term878, term878.getClass(), "id", term879);
        setField(term878, term878.getClass(), "nombre", "");
        setField(term878, term878.getClass(), "precio", term882);
        setField(term878, term878.getClass(), "stock", term884);
        setField(term878, term878.getClass(), "imagen", "");
        setField(term878, term878.getClass(), "createdAt", "");
        Long term889 = new Long(8059786003080744426L);
        Double term892 = new Double(0.37161417339133307);
        Integer term894 = new Integer(-203030934);
        Object term888 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term888, term888.getClass(), "id", term889);
        setField(term888, term888.getClass(), "nombre", "");
        setField(term888, term888.getClass(), "precio", term892);
        setField(term888, term888.getClass(), "stock", term894);
        setField(term888, term888.getClass(), "imagen", "");
        setField(term888, term888.getClass(), "createdAt", "");
        ArrayList term846 = new ArrayList();
        ((ArrayList) term846).add(term848);
        ((ArrayList) term846).add(term858);
        ((ArrayList) term846).add(term868);
        ((ArrayList) term846).add(term878);
        ((ArrayList) term846).add(term888);
        term809 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term809, term809.getClass(), "consulta", "MAcUBcBckh");
        setField(term809, term809.getClass(), "project", "oVgzLbrsFr");
        setField(term809, term809.getClass(), "version", "vQVyKLdtaz");
        setField(term809, term809.getClass(), "data", term846);
        setIntField(term809, term809.getClass(), "currentPage", 1227103734);
        setLongField(term809, term809.getClass(), "totalElements", 5270370404989704783L);
        setIntField(term809, term809.getClass(), "totalPages", -1339778481);
        setField(term809, term809.getClass(), "sort", "JqXGgAhZPl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term809, args);
    }

};


