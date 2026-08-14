package es.joseluisgs.springdam.models;

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
import static es.joseluisgs.springdam.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;

public class Producto_getImagen_15614568767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305;

    public Producto_getImagen_15614568767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term306 = new Long(7411271909051562686L);
        Double term320 = new Double(0.40176586625454525);
        Integer term322 = new Integer(-616727354);
        term305 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term305, term305.getClass(), "id", term306);
        setField(term305, term305.getClass(), "nombre", "NRdvgJlhkX");
        setField(term305, term305.getClass(), "precio", term320);
        setField(term305, term305.getClass(), "stock", term322);
        setField(term305, term305.getClass(), "imagen", "uuaPigETmJ");
        setIntField(term337, term337.getClass(), "year", 2026);
        setShortField(term337, term337.getClass(), "month", (short) 8);
        setShortField(term337, term337.getClass(), "day", (short) 10);
        setField(term336, term336.getClass(), "date", term337);
        setByteField(term341, term341.getClass(), "hour", (byte) 23);
        setByteField(term341, term341.getClass(), "minute", (byte) 27);
        setByteField(term341, term341.getClass(), "second", (byte) 37);
        setIntField(term341, term341.getClass(), "nano", 174457000);
        setField(term336, term336.getClass(), "time", term341);
        setField(term305, term305.getClass(), "createdAt", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImagen", argTypes, term305, args);
    }

};


