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
import java.util.LinkedList;

public class ListProductoPageDTO_ListProductoPageDTOBuilder_data_15948894591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3558;
     Object term3608;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_data_15948894591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3562 = new Long(846579494941632714L);
        Double term3565 = new Double(0.5617009352394552);
        Integer term3567 = new Integer(-1263114719);
        Object term3561 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3561, term3561.getClass(), "id", term3562);
        setField(term3561, term3561.getClass(), "nombre", "");
        setField(term3561, term3561.getClass(), "precio", term3565);
        setField(term3561, term3561.getClass(), "stock", term3567);
        setField(term3561, term3561.getClass(), "imagen", "");
        setField(term3561, term3561.getClass(), "createdAt", "");
        Long term3572 = new Long(6689117472719450333L);
        Double term3575 = new Double(0.09067063848644474);
        Integer term3577 = new Integer(-894662986);
        Object term3571 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3571, term3571.getClass(), "id", term3572);
        setField(term3571, term3571.getClass(), "nombre", "");
        setField(term3571, term3571.getClass(), "precio", term3575);
        setField(term3571, term3571.getClass(), "stock", term3577);
        setField(term3571, term3571.getClass(), "imagen", "");
        setField(term3571, term3571.getClass(), "createdAt", "");
        Long term3582 = new Long(5836128569274066678L);
        Double term3585 = new Double(0.268304014379393);
        Integer term3587 = new Integer(304775596);
        Object term3581 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3581, term3581.getClass(), "id", term3582);
        setField(term3581, term3581.getClass(), "nombre", "");
        setField(term3581, term3581.getClass(), "precio", term3585);
        setField(term3581, term3581.getClass(), "stock", term3587);
        setField(term3581, term3581.getClass(), "imagen", "");
        setField(term3581, term3581.getClass(), "createdAt", "");
        ArrayList term3559 = new ArrayList();
        ((ArrayList) term3559).add(term3561);
        ((ArrayList) term3559).add(term3571);
        ((ArrayList) term3559).add(term3581);
        term3558 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term3558, term3558.getClass(), "data", term3559);
        setIntField(term3558, term3558.getClass(), "currentPage", -203030934);
        setLongField(term3558, term3558.getClass(), "totalElements", -872011222785455006L);
        setIntField(term3558, term3558.getClass(), "totalPages", -1179120542);
        setField(term3558, term3558.getClass(), "sort", "JeZFtaqkzW");
        term3608 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3608;
        callMethod(klass, "data", argTypes, term3558, args);
    }

};


