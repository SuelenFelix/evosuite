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

public class Endereco_getUf_28996907211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4048;

    public Endereco_getUf_28996907211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4048 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term4048, term4048.getClass(), "cep", "kVEZMHmRtR");
        setField(term4048, term4048.getClass(), "logradouro", "ekxGuOYIwi");
        setField(term4048, term4048.getClass(), "complemento", "RbVQXSpxXy");
        setField(term4048, term4048.getClass(), "bairro", "YpJbIgJWWv");
        setField(term4048, term4048.getClass(), "localidade", "JppkknKVOw");
        setField(term4048, term4048.getClass(), "uf", "iljANwuEjk");
        setField(term4048, term4048.getClass(), "ibge", "kNqaJKIATy");
        setField(term4048, term4048.getClass(), "gia", "vKQukfbJUd");
        setField(term4048, term4048.getClass(), "ddd", "lFRJFUMVbx");
        setField(term4048, term4048.getClass(), "siafi", "sZdUNdggUW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUf", argTypes, term4048, args);
    }

};


