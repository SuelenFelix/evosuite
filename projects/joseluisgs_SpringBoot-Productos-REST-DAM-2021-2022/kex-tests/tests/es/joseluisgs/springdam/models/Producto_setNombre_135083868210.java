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

public class Producto_setNombre_135083868210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;

    public Producto_setNombre_135083868210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term491 = new Long(6967924379644551255L);
        Double term505 = new Double(0.6076495596892013);
        Integer term507 = new Integer(1227103734);
        term490 = newInstance(Class.forName("es.joseluisgs.springdam.models.Producto"));
        Object term521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term526 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term490, term490.getClass(), "id", term491);
        setField(term490, term490.getClass(), "nombre", "ZiaGIbnzTs");
        setField(term490, term490.getClass(), "precio", term505);
        setField(term490, term490.getClass(), "stock", term507);
        setField(term490, term490.getClass(), "imagen", "tbcdzjIfER");
        setIntField(term522, term522.getClass(), "year", 2026);
        setShortField(term522, term522.getClass(), "month", (short) 8);
        setShortField(term522, term522.getClass(), "day", (short) 10);
        setField(term521, term521.getClass(), "date", term522);
        setByteField(term526, term526.getClass(), "hour", (byte) 23);
        setByteField(term526, term526.getClass(), "minute", (byte) 27);
        setByteField(term526, term526.getClass(), "second", (byte) 37);
        setIntField(term526, term526.getClass(), "nano", 376316000);
        setField(term521, term521.getClass(), "time", term526);
        setField(term490, term490.getClass(), "createdAt", term521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.models.Producto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setNombre", argTypes, term490, args);
    }

};


