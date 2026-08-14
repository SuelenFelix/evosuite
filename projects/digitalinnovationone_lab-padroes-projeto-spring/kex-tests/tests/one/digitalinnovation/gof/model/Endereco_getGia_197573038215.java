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

public class Endereco_getGia_197573038215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4976;

    public Endereco_getGia_197573038215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4976 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term4976, term4976.getClass(), "cep", "NzBMMhkhpT");
        setField(term4976, term4976.getClass(), "logradouro", "qCpEbQDHdF");
        setField(term4976, term4976.getClass(), "complemento", "AHbZyFOmlo");
        setField(term4976, term4976.getClass(), "bairro", "TwfWVQGiIj");
        setField(term4976, term4976.getClass(), "localidade", "gUvcueTURF");
        setField(term4976, term4976.getClass(), "uf", "EwQBhZjCIT");
        setField(term4976, term4976.getClass(), "ibge", "aSkmSwTnEw");
        setField(term4976, term4976.getClass(), "gia", "xvkbvaEGYd");
        setField(term4976, term4976.getClass(), "ddd", "HBGNxdNURv");
        setField(term4976, term4976.getClass(), "siafi", "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGia", argTypes, term4976, args);
    }

};


