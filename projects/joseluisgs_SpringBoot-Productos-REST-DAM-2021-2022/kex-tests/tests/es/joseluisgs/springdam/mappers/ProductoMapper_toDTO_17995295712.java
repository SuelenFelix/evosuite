package es.joseluisgs.springdam.mappers;

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
import static es.joseluisgs.springdam.mappers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ProductoMapper_toDTO_17995295712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;

    public ProductoMapper_toDTO_17995295712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139 = new Long(-8257434502486459194L);
        Double term153 = new Double(0.5523635872663106);
        Integer term155 = new Integer(1484323161);
        Object term138 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term169 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term170 = newInstance(Class.forName("java.time.LocalDate"));
        Object term174 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term138, term138.getClass(), "id", term139);
        setField(term138, term138.getClass(), "nombre", "EGtDIRbSSb");
        setField(term138, term138.getClass(), "precio", term153);
        setField(term138, term138.getClass(), "stock", term155);
        setField(term138, term138.getClass(), "imagen", "SzjVpOQTyS");
        setIntField(term170, term170.getClass(), "year", 2026);
        setShortField(term170, term170.getClass(), "month", (short) 8);
        setShortField(term170, term170.getClass(), "day", (short) 10);
        setField(term169, term169.getClass(), "date", term170);
        setByteField(term174, term174.getClass(), "hour", (byte) 23);
        setByteField(term174, term174.getClass(), "minute", (byte) 25);
        setByteField(term174, term174.getClass(), "second", (byte) 53);
        setIntField(term174, term174.getClass(), "nano", 371839000);
        setField(term169, term169.getClass(), "time", term174);
        setField(term138, term138.getClass(), "createdAt", term169);
        Long term181 = new Long(-8400487765614892086L);
        Double term184 = new Double(0.544608645520025);
        Integer term186 = new Integer(391863371);
        Object term180 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term189 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term180, term180.getClass(), "id", term181);
        setField(term180, term180.getClass(), "nombre", "");
        setField(term180, term180.getClass(), "precio", term184);
        setField(term180, term180.getClass(), "stock", term186);
        setField(term180, term180.getClass(), "imagen", "");
        setField(term189, term189.getClass(), "date", null);
        setField(term189, term189.getClass(), "time", null);
        setField(term180, term180.getClass(), "createdAt", term189);
        Long term192 = new Long(5270370404989704783L);
        Double term194 = new Double(0.28570734989730284);
        Integer term196 = new Integer(-1922583790);
        Object term191 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        setField(term191, term191.getClass(), "id", term192);
        setField(term191, term191.getClass(), "nombre", null);
        setField(term191, term191.getClass(), "precio", term194);
        setField(term191, term191.getClass(), "stock", term196);
        setField(term191, term191.getClass(), "imagen", null);
        setField(term191, term191.getClass(), "createdAt", null);
        term135 = new LinkedList();
        ((LinkedList) term135).add(term138);
        ((LinkedList) term135).add(term180);
        ((LinkedList) term135).add(term191);
        ((LinkedList) term135).add((Object)null);
        ((LinkedList) term135).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.mappers.ProductoMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term135;
        callMethod(klass, "toDTO", argTypes, null, args);
    }

};


