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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_totalPages_7765944634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3765;
     Object term3835;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_totalPages_7765944634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3769 = new Long(-5216789073301458893L);
        Double term3772 = new Double(0.7865909711092062);
        Integer term3774 = new Integer(-615654495);
        Object term3768 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3768, term3768.getClass(), "id", term3769);
        setField(term3768, term3768.getClass(), "nombre", "");
        setField(term3768, term3768.getClass(), "precio", term3772);
        setField(term3768, term3768.getClass(), "stock", term3774);
        setField(term3768, term3768.getClass(), "imagen", "");
        setField(term3768, term3768.getClass(), "createdAt", "");
        Long term3779 = new Long(-1832940336320585644L);
        Double term3782 = new Double(0.06587158449170749);
        Integer term3784 = new Integer(-1476117762);
        Object term3778 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3778, term3778.getClass(), "id", term3779);
        setField(term3778, term3778.getClass(), "nombre", "");
        setField(term3778, term3778.getClass(), "precio", term3782);
        setField(term3778, term3778.getClass(), "stock", term3784);
        setField(term3778, term3778.getClass(), "imagen", "");
        setField(term3778, term3778.getClass(), "createdAt", "");
        Long term3789 = new Long(-8033714905181142681L);
        Double term3792 = new Double(0.0865998004187658);
        Integer term3794 = new Integer(-341962980);
        Object term3788 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3788, term3788.getClass(), "id", term3789);
        setField(term3788, term3788.getClass(), "nombre", "");
        setField(term3788, term3788.getClass(), "precio", term3792);
        setField(term3788, term3788.getClass(), "stock", term3794);
        setField(term3788, term3788.getClass(), "imagen", "");
        setField(term3788, term3788.getClass(), "createdAt", "");
        Long term3799 = new Long(-9040825890007374809L);
        Double term3802 = new Double(0.9628647861255637);
        Integer term3804 = new Integer(1532716628);
        Object term3798 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3798, term3798.getClass(), "id", term3799);
        setField(term3798, term3798.getClass(), "nombre", "");
        setField(term3798, term3798.getClass(), "precio", term3802);
        setField(term3798, term3798.getClass(), "stock", term3804);
        setField(term3798, term3798.getClass(), "imagen", "");
        setField(term3798, term3798.getClass(), "createdAt", "");
        Long term3809 = new Long(1368340889161782793L);
        Double term3812 = new Double(0.623231822150205);
        Integer term3814 = new Integer(-1801760683);
        Object term3808 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3808, term3808.getClass(), "id", term3809);
        setField(term3808, term3808.getClass(), "nombre", "");
        setField(term3808, term3808.getClass(), "precio", term3812);
        setField(term3808, term3808.getClass(), "stock", term3814);
        setField(term3808, term3808.getClass(), "imagen", "");
        setField(term3808, term3808.getClass(), "createdAt", "");
        ArrayList term3766 = new ArrayList();
        ((ArrayList) term3766).add(term3768);
        ((ArrayList) term3766).add(term3778);
        ((ArrayList) term3766).add(term3788);
        ((ArrayList) term3766).add(term3798);
        ((ArrayList) term3766).add(term3808);
        term3765 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term3765, term3765.getClass(), "data", term3766);
        setIntField(term3765, term3765.getClass(), "currentPage", -469968304);
        setLongField(term3765, term3765.getClass(), "totalElements", -4920224193275732920L);
        setIntField(term3765, term3765.getClass(), "totalPages", -1145578966);
        setField(term3765, term3765.getClass(), "sort", "qUtkFGMNUV");
        term3835 = new Integer(679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3835;
        callMethod(klass, "totalPages", argTypes, term3765, args);
    }

};


