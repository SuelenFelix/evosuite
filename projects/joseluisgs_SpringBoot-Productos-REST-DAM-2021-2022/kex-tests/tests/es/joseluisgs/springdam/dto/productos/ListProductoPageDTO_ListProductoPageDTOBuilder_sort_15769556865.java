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

public class ListProductoPageDTO_ListProductoPageDTOBuilder_sort_15769556865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3847;

    public ListProductoPageDTO_ListProductoPageDTOBuilder_sort_15769556865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3851 = new Long(-5786861555969446503L);
        Double term3854 = new Double(0.09037487793444521);
        Integer term3856 = new Integer(1141317871);
        Object term3850 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3850, term3850.getClass(), "id", term3851);
        setField(term3850, term3850.getClass(), "nombre", "");
        setField(term3850, term3850.getClass(), "precio", term3854);
        setField(term3850, term3850.getClass(), "stock", term3856);
        setField(term3850, term3850.getClass(), "imagen", "");
        setField(term3850, term3850.getClass(), "createdAt", "");
        Long term3861 = new Long(2354625302846375590L);
        Double term3864 = new Double(0.6561919196821765);
        Integer term3866 = new Integer(890669485);
        Object term3860 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3860, term3860.getClass(), "id", term3861);
        setField(term3860, term3860.getClass(), "nombre", "");
        setField(term3860, term3860.getClass(), "precio", term3864);
        setField(term3860, term3860.getClass(), "stock", term3866);
        setField(term3860, term3860.getClass(), "imagen", "");
        setField(term3860, term3860.getClass(), "createdAt", "");
        Long term3871 = new Long(7276637106827860087L);
        Double term3874 = new Double(0.7330178886612495);
        Integer term3876 = new Integer(691577392);
        Object term3870 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3870, term3870.getClass(), "id", term3871);
        setField(term3870, term3870.getClass(), "nombre", "");
        setField(term3870, term3870.getClass(), "precio", term3874);
        setField(term3870, term3870.getClass(), "stock", term3876);
        setField(term3870, term3870.getClass(), "imagen", "");
        setField(term3870, term3870.getClass(), "createdAt", "");
        Long term3881 = new Long(-3936701866695933852L);
        Double term3884 = new Double(0.7618164754425794);
        Integer term3886 = new Integer(-893623680);
        Object term3880 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3880, term3880.getClass(), "id", term3881);
        setField(term3880, term3880.getClass(), "nombre", "");
        setField(term3880, term3880.getClass(), "precio", term3884);
        setField(term3880, term3880.getClass(), "stock", term3886);
        setField(term3880, term3880.getClass(), "imagen", "");
        setField(term3880, term3880.getClass(), "createdAt", "");
        Long term3891 = new Long(1215116475929634177L);
        Double term3894 = new Double(0.7385589312559342);
        Integer term3896 = new Integer(-1963434938);
        Object term3890 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term3890, term3890.getClass(), "id", term3891);
        setField(term3890, term3890.getClass(), "nombre", "");
        setField(term3890, term3890.getClass(), "precio", term3894);
        setField(term3890, term3890.getClass(), "stock", term3896);
        setField(term3890, term3890.getClass(), "imagen", "");
        setField(term3890, term3890.getClass(), "createdAt", "");
        ArrayList term3848 = new ArrayList();
        ((ArrayList) term3848).add(term3850);
        ((ArrayList) term3848).add(term3860);
        ((ArrayList) term3848).add(term3870);
        ((ArrayList) term3848).add(term3880);
        ((ArrayList) term3848).add(term3890);
        term3847 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder"));
        setField(term3847, term3847.getClass(), "data", term3848);
        setIntField(term3847, term3847.getClass(), "currentPage", 1962444399);
        setLongField(term3847, term3847.getClass(), "totalElements", 8428634514691209827L);
        setIntField(term3847, term3847.getClass(), "totalPages", 767834723);
        setField(term3847, term3847.getClass(), "sort", "gltJarNuUk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO$ListProductoPageDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZwZIDwYcSW";
        callMethod(klass, "sort", argTypes, term3847, args);
    }

};


