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

public class Endereco_setCep_6061480312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;

    public Endereco_setCep_6061480312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1949 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term1949, term1949.getClass(), "cep", "TimdotUuNC");
        setField(term1949, term1949.getClass(), "logradouro", "PkWMRdJcBb");
        setField(term1949, term1949.getClass(), "complemento", "jSpAteRute");
        setField(term1949, term1949.getClass(), "bairro", "swZVeJAxjt");
        setField(term1949, term1949.getClass(), "localidade", "xOcJIiQQDu");
        setField(term1949, term1949.getClass(), "uf", "GVizqqzXpy");
        setField(term1949, term1949.getClass(), "ibge", "JqXGgAhZPl");
        setField(term1949, term1949.getClass(), "gia", "jiKYgYHqIS");
        setField(term1949, term1949.getClass(), "ddd", "DfISiziTgG");
        setField(term1949, term1949.getClass(), "siafi", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setCep", argTypes, term1949, args);
    }

};


