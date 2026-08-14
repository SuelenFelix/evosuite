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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ListProductosDTO_getProject_11448323392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4322;

    public ListProductosDTO_getProject_11448323392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4352 = new Long(-4822736661741380518L);
        Double term4355 = new Double(0.008025683154629148);
        Integer term4357 = new Integer(538259104);
        Object term4351 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4351, term4351.getClass(), "id", term4352);
        setField(term4351, term4351.getClass(), "nombre", "");
        setField(term4351, term4351.getClass(), "precio", term4355);
        setField(term4351, term4351.getClass(), "stock", term4357);
        setField(term4351, term4351.getClass(), "imagen", "");
        setField(term4351, term4351.getClass(), "createdAt", "");
        Long term4362 = new Long(-5386201758403679145L);
        Double term4365 = new Double(0.40598298281353484);
        Integer term4367 = new Integer(96566506);
        Object term4361 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4361, term4361.getClass(), "id", term4362);
        setField(term4361, term4361.getClass(), "nombre", "");
        setField(term4361, term4361.getClass(), "precio", term4365);
        setField(term4361, term4361.getClass(), "stock", term4367);
        setField(term4361, term4361.getClass(), "imagen", "");
        setField(term4361, term4361.getClass(), "createdAt", "");
        Long term4372 = new Long(-7268507582722666254L);
        Double term4375 = new Double(0.3710067290060264);
        Integer term4377 = new Integer(-343325701);
        Object term4371 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4371, term4371.getClass(), "id", term4372);
        setField(term4371, term4371.getClass(), "nombre", "");
        setField(term4371, term4371.getClass(), "precio", term4375);
        setField(term4371, term4371.getClass(), "stock", term4377);
        setField(term4371, term4371.getClass(), "imagen", "");
        setField(term4371, term4371.getClass(), "createdAt", "");
        Long term4382 = new Long(5671808784468963649L);
        Double term4385 = new Double(0.7818620200430967);
        Integer term4387 = new Integer(107945604);
        Object term4381 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4381, term4381.getClass(), "id", term4382);
        setField(term4381, term4381.getClass(), "nombre", "");
        setField(term4381, term4381.getClass(), "precio", term4385);
        setField(term4381, term4381.getClass(), "stock", term4387);
        setField(term4381, term4381.getClass(), "imagen", "");
        setField(term4381, term4381.getClass(), "createdAt", "");
        Long term4392 = new Long(2297097306706899827L);
        Double term4395 = new Double(0.04640022995603543);
        Integer term4397 = new Integer(-1963464809);
        Object term4391 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4391, term4391.getClass(), "id", term4392);
        setField(term4391, term4391.getClass(), "nombre", "");
        setField(term4391, term4391.getClass(), "precio", term4395);
        setField(term4391, term4391.getClass(), "stock", term4397);
        setField(term4391, term4391.getClass(), "imagen", "");
        setField(term4391, term4391.getClass(), "createdAt", "");
        Long term4402 = new Long(-900457279156388404L);
        Double term4405 = new Double(0.9123572866833729);
        Integer term4407 = new Integer(71190297);
        Object term4401 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4401, term4401.getClass(), "id", term4402);
        setField(term4401, term4401.getClass(), "nombre", "");
        setField(term4401, term4401.getClass(), "precio", term4405);
        setField(term4401, term4401.getClass(), "stock", term4407);
        setField(term4401, term4401.getClass(), "imagen", "");
        setField(term4401, term4401.getClass(), "createdAt", "");
        ArrayList term4349 = new ArrayList();
        ((ArrayList) term4349).add(term4351);
        ((ArrayList) term4349).add(term4361);
        ((ArrayList) term4349).add(term4371);
        ((ArrayList) term4349).add(term4381);
        ((ArrayList) term4349).add(term4391);
        ((ArrayList) term4349).add(term4401);
        term4322 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4328 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4324, term4324.getClass(), "year", 2026);
        setShortField(term4324, term4324.getClass(), "month", (short) 8);
        setShortField(term4324, term4324.getClass(), "day", (short) 10);
        setField(term4323, term4323.getClass(), "date", term4324);
        setByteField(term4328, term4328.getClass(), "hour", (byte) 23);
        setByteField(term4328, term4328.getClass(), "minute", (byte) 15);
        setByteField(term4328, term4328.getClass(), "second", (byte) 27);
        setIntField(term4328, term4328.getClass(), "nano", 543269000);
        setField(term4323, term4323.getClass(), "time", term4328);
        setField(term4322, term4322.getClass(), "consulta", term4323);
        setField(term4322, term4322.getClass(), "project", "SpringDam");
        setField(term4322, term4322.getClass(), "version", "1.0");
        setField(term4322, term4322.getClass(), "data", term4349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProject", argTypes, term4322, args);
    }

};


