package one.digitalinnovation.gof.model;

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
import static one.digitalinnovation.gof.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Endereco_getLogradouro_15964269633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;

    public Endereco_getLogradouro_15964269633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2192 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term2192, term2192.getClass(), "cep", "XPKmummaqg");
        setField(term2192, term2192.getClass(), "logradouro", "BKLfkLiZTH");
        setField(term2192, term2192.getClass(), "complemento", "SPpkrGcPRr");
        setField(term2192, term2192.getClass(), "bairro", "sEccwbJKYE");
        setField(term2192, term2192.getClass(), "localidade", "AWRooQKkdW");
        setField(term2192, term2192.getClass(), "uf", "vjxIhXHxGR");
        setField(term2192, term2192.getClass(), "ibge", "QXzGXbEXMu");
        setField(term2192, term2192.getClass(), "gia", "qxSDVejjiY");
        setField(term2192, term2192.getClass(), "ddd", "xBsXSDjXYK");
        setField(term2192, term2192.getClass(), "siafi", "sEnIVFtZuQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLogradouro", argTypes, term2192, args);
    }

};


