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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_totalElements_2948724523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3723;
     Object term3753;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_totalElements_2948724523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3727 = new Long(4949335493504695457L);
        Double term3730 = new Double(0.39446728256884744);
        Integer term3732 = new Integer(339854490);
        Object term3726 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3726, term3726.getClass(), "id", term3727);
        setField(term3726, term3726.getClass(), "nombre", "");
        setField(term3726, term3726.getClass(), "precio", term3730);
        setField(term3726, term3726.getClass(), "stock", term3732);
        setField(term3726, term3726.getClass(), "imagen", "");
        setField(term3726, term3726.getClass(), "createdAt", "");
        ArrayList term3724 = new ArrayList();
        ((ArrayList) term3724).add(term3726);
        term3723 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term3723, term3723.getClass(), "data", term3724);
        setIntField(term3723, term3723.getClass(), "currentPage", -1087774327);
        setLongField(term3723, term3723.getClass(), "totalElements", 5127676408959197577L);
        setIntField(term3723, term3723.getClass(), "totalPages", -1530420153);
        setField(term3723, term3723.getClass(), "sort", "BDIRCxAWLA");
        term3753 = new Long(-6573104506744284592L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3753;
        callMethod(klass, "totalElements", argTypes, term3723, args);
    }

};


