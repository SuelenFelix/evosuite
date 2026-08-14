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

public class ListProductoPageDTO_setTotalPages_40439227713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;
     Object term2277;

    public ListProductoPageDTO_setTotalPages_40439227713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2211 = new Long(305759998609888272L);
        Double term2214 = new Double(0.6767213143579776);
        Integer term2216 = new Integer(-2027534003);
        Object term2210 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2210, term2210.getClass(), "id", term2211);
        setField(term2210, term2210.getClass(), "nombre", "");
        setField(term2210, term2210.getClass(), "precio", term2214);
        setField(term2210, term2210.getClass(), "stock", term2216);
        setField(term2210, term2210.getClass(), "imagen", "");
        setField(term2210, term2210.getClass(), "createdAt", "");
        Long term2221 = new Long(-8654565919063661957L);
        Double term2224 = new Double(0.48862955528902696);
        Integer term2226 = new Integer(1063420942);
        Object term2220 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2220, term2220.getClass(), "id", term2221);
        setField(term2220, term2220.getClass(), "nombre", "");
        setField(term2220, term2220.getClass(), "precio", term2224);
        setField(term2220, term2220.getClass(), "stock", term2226);
        setField(term2220, term2220.getClass(), "imagen", "");
        setField(term2220, term2220.getClass(), "createdAt", "");
        Long term2231 = new Long(-5248475803419977214L);
        Double term2234 = new Double(0.426231085465289);
        Integer term2236 = new Integer(1375330971);
        Object term2230 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2230, term2230.getClass(), "id", term2231);
        setField(term2230, term2230.getClass(), "nombre", "");
        setField(term2230, term2230.getClass(), "precio", term2234);
        setField(term2230, term2230.getClass(), "stock", term2236);
        setField(term2230, term2230.getClass(), "imagen", "");
        setField(term2230, term2230.getClass(), "createdAt", "");
        Long term2241 = new Long(-6723783499250797216L);
        Double term2244 = new Double(0.0027299293098262956);
        Integer term2246 = new Integer(-478195677);
        Object term2240 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2240, term2240.getClass(), "id", term2241);
        setField(term2240, term2240.getClass(), "nombre", "");
        setField(term2240, term2240.getClass(), "precio", term2244);
        setField(term2240, term2240.getClass(), "stock", term2246);
        setField(term2240, term2240.getClass(), "imagen", "");
        setField(term2240, term2240.getClass(), "createdAt", "");
        Long term2251 = new Long(41775768178052008L);
        Double term2254 = new Double(0.29874017652881824);
        Integer term2256 = new Integer(972867650);
        Object term2250 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term2250, term2250.getClass(), "id", term2251);
        setField(term2250, term2250.getClass(), "nombre", "");
        setField(term2250, term2250.getClass(), "precio", term2254);
        setField(term2250, term2250.getClass(), "stock", term2256);
        setField(term2250, term2250.getClass(), "imagen", "");
        setField(term2250, term2250.getClass(), "createdAt", "");
        ArrayList term2208 = new ArrayList();
        ((ArrayList) term2208).add(term2210);
        ((ArrayList) term2208).add(term2220);
        ((ArrayList) term2208).add(term2230);
        ((ArrayList) term2208).add(term2240);
        ((ArrayList) term2208).add(term2250);
        term2171 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term2171, term2171.getClass(), "consulta", "CGOpQSZZwI");
        setField(term2171, term2171.getClass(), "project", "ypEdrstygY");
        setField(term2171, term2171.getClass(), "version", "sNQFlATEeQ");
        setField(term2171, term2171.getClass(), "data", term2208);
        setIntField(term2171, term2171.getClass(), "currentPage", 1135664017);
        setLongField(term2171, term2171.getClass(), "totalElements", 2535595959091595249L);
        setIntField(term2171, term2171.getClass(), "totalPages", 590364439);
        setField(term2171, term2171.getClass(), "sort", "vvoLrMGCoN");
        term2277 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2277;
        callMethod(klass, "setTotalPages", argTypes, term2171, args);
    }

};


