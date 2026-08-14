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

public class Endereco_getGia_197573038236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6382;

    public Endereco_getGia_197573038236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6382 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term6382, term6382.getClass(), "cep", null);
        setField(term6382, term6382.getClass(), "logradouro", null);
        setField(term6382, term6382.getClass(), "complemento", null);
        setField(term6382, term6382.getClass(), "bairro", null);
        setField(term6382, term6382.getClass(), "localidade", null);
        setField(term6382, term6382.getClass(), "uf", null);
        setField(term6382, term6382.getClass(), "ibge", null);
        setField(term6382, term6382.getClass(), "gia", null);
        setField(term6382, term6382.getClass(), "ddd", null);
        setField(term6382, term6382.getClass(), "siafi", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGia", argTypes, term6382, args);
    }

};


