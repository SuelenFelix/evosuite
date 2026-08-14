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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ListProductoPageDTO_init_16681789740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term333;
     Object term335;
     Object term337;

    public ListProductoPageDTO_init_16681789740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226 = new Long(2442117782898005296L);
        Double term240 = new Double(0.6076495596892013);
        Integer term242 = new Integer(1227103734);
        Object term225 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term225, term225.getClass(), "id", term226);
        setField(term225, term225.getClass(), "nombre", "hRNSzYYIrc");
        setField(term225, term225.getClass(), "precio", term240);
        setField(term225, term225.getClass(), "stock", term242);
        setField(term225, term225.getClass(), "imagen", "RMFIsYGgne");
        setField(term225, term225.getClass(), "createdAt", "NRdvgJlhkX");
        Long term270 = new Long(6375119433582206027L);
        Double term273 = new Double(0.37773193782763337);
        Integer term275 = new Integer(-1339778481);
        Object term269 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term269, term269.getClass(), "id", term270);
        setField(term269, term269.getClass(), "nombre", "");
        setField(term269, term269.getClass(), "precio", term273);
        setField(term269, term269.getClass(), "stock", term275);
        setField(term269, term269.getClass(), "imagen", "");
        setField(term269, term269.getClass(), "createdAt", "");
        Long term281 = new Long(-8257434502486459194L);
        Double term283 = new Double(0.8474802076607362);
        Integer term285 = new Integer(1725571209);
        Object term280 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term280, term280.getClass(), "id", term281);
        setField(term280, term280.getClass(), "nombre", null);
        setField(term280, term280.getClass(), "precio", term283);
        setField(term280, term280.getClass(), "stock", term285);
        setField(term280, term280.getClass(), "imagen", null);
        setField(term280, term280.getClass(), "createdAt", null);
        term222 = new LinkedList();
        ((LinkedList) term222).add(term225);
        ((LinkedList) term222).add(term269);
        ((LinkedList) term222).add(term280);
        ((LinkedList) term222).add((Object)null);
        ((LinkedList) term222).add((Object)null);
        term333 = new Integer(568599855);
        term335 = new Long(2442117782898005296L);
        term337 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = long.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term222;
        args[1] = term333;
        args[2] = term335;
        args[3] = term337;
        args[4] = "eZFUvlxvGV";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


