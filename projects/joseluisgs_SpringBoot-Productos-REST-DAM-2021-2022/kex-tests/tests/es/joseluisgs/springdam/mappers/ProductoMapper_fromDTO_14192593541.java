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
import java.lang.Long;
import java.lang.Double;
import java.lang.Integer;

public class ProductoMapper_fromDTO_14192593541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;

    public ProductoMapper_fromDTO_14192593541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term63 = new Long(6375119433582206027L);
        Double term77 = new Double(0.3455959125047594);
        Integer term79 = new Integer(1162663216);
        term62 = newInstance(Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO"));
        setField(term62, term62.getClass(), "id", term63);
        setField(term62, term62.getClass(), "nombre", "MuLcgQHgqz");
        setField(term62, term62.getClass(), "precio", term77);
        setField(term62, term62.getClass(), "stock", term79);
        setField(term62, term62.getClass(), "imagen", "xxtlPwDYFs");
        setField(term62, term62.getClass(), "createdAt", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.mappers.ProductoMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("es.joseluisgs.springdam.dto.productos.ProductoDTO");
        Object[] args = new Object[1];
        args[0] = term62;
        callMethod(klass, "fromDTO", argTypes, null, args);
    }

};


