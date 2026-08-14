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

public class ListProductoPageDTO_getVersion_10928714204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673;

    public ListProductoPageDTO_getVersion_10928714204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term713 = new Long(-5476826692763582090L);
        Double term716 = new Double(0.43692187681405226);
        Integer term718 = new Integer(-2068769794);
        Object term712 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term712, term712.getClass(), "id", term713);
        setField(term712, term712.getClass(), "nombre", "");
        setField(term712, term712.getClass(), "precio", term716);
        setField(term712, term712.getClass(), "stock", term718);
        setField(term712, term712.getClass(), "imagen", "");
        setField(term712, term712.getClass(), "createdAt", "");
        Long term723 = new Long(-872011222785455006L);
        Double term726 = new Double(0.7633268466829064);
        Integer term728 = new Integer(-117576464);
        Object term722 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term722, term722.getClass(), "id", term723);
        setField(term722, term722.getClass(), "nombre", "");
        setField(term722, term722.getClass(), "precio", term726);
        setField(term722, term722.getClass(), "stock", term728);
        setField(term722, term722.getClass(), "imagen", "");
        setField(term722, term722.getClass(), "createdAt", "");
        Long term733 = new Long(-316468845751588286L);
        Double term736 = new Double(0.13481025392611334);
        Integer term738 = new Integer(-1007160944);
        Object term732 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term732, term732.getClass(), "id", term733);
        setField(term732, term732.getClass(), "nombre", "");
        setField(term732, term732.getClass(), "precio", term736);
        setField(term732, term732.getClass(), "stock", term738);
        setField(term732, term732.getClass(), "imagen", "");
        setField(term732, term732.getClass(), "createdAt", "");
        Long term743 = new Long(5127676408959197577L);
        Double term746 = new Double(0.3800088629986428);
        Integer term748 = new Integer(1135664017);
        Object term742 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term742, term742.getClass(), "id", term743);
        setField(term742, term742.getClass(), "nombre", "");
        setField(term742, term742.getClass(), "precio", term746);
        setField(term742, term742.getClass(), "stock", term748);
        setField(term742, term742.getClass(), "imagen", "");
        setField(term742, term742.getClass(), "createdAt", "");
        ArrayList term710 = new ArrayList();
        ((ArrayList) term710).add(term712);
        ((ArrayList) term710).add(term722);
        ((ArrayList) term710).add(term732);
        ((ArrayList) term710).add(term742);
        term673 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO"));
        setField(term673, term673.getClass(), "consulta", "nHXjMycHlU");
        setField(term673, term673.getClass(), "project", "ieCtQFdkii");
        setField(term673, term673.getClass(), "version", "dEnhdmILtU");
        setField(term673, term673.getClass(), "data", term710);
        setIntField(term673, term673.getClass(), "currentPage", -1955890973);
        setLongField(term673, term673.getClass(), "totalElements", -8400487765614892086L);
        setIntField(term673, term673.getClass(), "totalPages", -2038273078);
        setField(term673, term673.getClass(), "sort", "HqBOwkVqjD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductoPageDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term673, args);
    }

};


