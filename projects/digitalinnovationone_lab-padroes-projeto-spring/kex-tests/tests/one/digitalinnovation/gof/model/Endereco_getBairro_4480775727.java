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

public class Endereco_getBairro_4480775727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3120;

    public Endereco_getBairro_4480775727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3120 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term3120, term3120.getClass(), "cep", "LWyEaeIyAo");
        setField(term3120, term3120.getClass(), "logradouro", "yVMkkQhvmN");
        setField(term3120, term3120.getClass(), "complemento", "mvrkADEgpp");
        setField(term3120, term3120.getClass(), "bairro", "pXOkjyeIRb");
        setField(term3120, term3120.getClass(), "localidade", "GgZWSjxjyE");
        setField(term3120, term3120.getClass(), "uf", "EeBVbzjcCI");
        setField(term3120, term3120.getClass(), "ibge", "UfQtPRyWRC");
        setField(term3120, term3120.getClass(), "gia", "FPvxVzzSvD");
        setField(term3120, term3120.getClass(), "ddd", "WHcwFgsGFC");
        setField(term3120, term3120.getClass(), "siafi", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBairro", argTypes, term3120, args);
    }

};


