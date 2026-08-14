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

public class ListProductosDTO_setProject_19563133636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4604;

    public ListProductosDTO_setProject_19563133636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4634 = new Long(-1214968196781083707L);
        Double term4637 = new Double(0.4355627280318103);
        Integer term4639 = new Integer(2095798786);
        Object term4633 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4633, term4633.getClass(), "id", term4634);
        setField(term4633, term4633.getClass(), "nombre", "");
        setField(term4633, term4633.getClass(), "precio", term4637);
        setField(term4633, term4633.getClass(), "stock", term4639);
        setField(term4633, term4633.getClass(), "imagen", "");
        setField(term4633, term4633.getClass(), "createdAt", "");
        Long term4644 = new Long(-1804015692891701666L);
        Double term4647 = new Double(0.841460835734741);
        Integer term4649 = new Integer(-1565502840);
        Object term4643 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4643, term4643.getClass(), "id", term4644);
        setField(term4643, term4643.getClass(), "nombre", "");
        setField(term4643, term4643.getClass(), "precio", term4647);
        setField(term4643, term4643.getClass(), "stock", term4649);
        setField(term4643, term4643.getClass(), "imagen", "");
        setField(term4643, term4643.getClass(), "createdAt", "");
        Long term4654 = new Long(-6432617521836576658L);
        Double term4657 = new Double(0.7859316615744082);
        Integer term4659 = new Integer(344323424);
        Object term4653 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term4653, term4653.getClass(), "id", term4654);
        setField(term4653, term4653.getClass(), "nombre", "");
        setField(term4653, term4653.getClass(), "precio", term4657);
        setField(term4653, term4653.getClass(), "stock", term4659);
        setField(term4653, term4653.getClass(), "imagen", "");
        setField(term4653, term4653.getClass(), "createdAt", "");
        ArrayList term4631 = new ArrayList();
        ((ArrayList) term4631).add(term4633);
        ((ArrayList) term4631).add(term4643);
        ((ArrayList) term4631).add(term4653);
        term4604 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO"));
        Object term4605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4610 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4606, term4606.getClass(), "year", 2026);
        setShortField(term4606, term4606.getClass(), "month", (short) 8);
        setShortField(term4606, term4606.getClass(), "day", (short) 10);
        setField(term4605, term4605.getClass(), "date", term4606);
        setByteField(term4610, term4610.getClass(), "hour", (byte) 23);
        setByteField(term4610, term4610.getClass(), "minute", (byte) 15);
        setByteField(term4610, term4610.getClass(), "second", (byte) 27);
        setIntField(term4610, term4610.getClass(), "nano", 677516000);
        setField(term4605, term4605.getClass(), "time", term4610);
        setField(term4604, term4604.getClass(), "consulta", term4605);
        setField(term4604, term4604.getClass(), "project", "SpringDam");
        setField(term4604, term4604.getClass(), "version", "1.0");
        setField(term4604, term4604.getClass(), "data", term4631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.productos.ListProductosDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fIZsWucfXz";
        callMethod(klass, "setProject", argTypes, term4604, args);
    }

};


