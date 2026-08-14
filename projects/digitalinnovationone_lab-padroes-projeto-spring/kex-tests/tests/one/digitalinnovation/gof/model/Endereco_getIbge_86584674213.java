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

public class Endereco_getIbge_86584674213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4512;

    public Endereco_getIbge_86584674213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4512 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term4512, term4512.getClass(), "cep", "tXfQjSqDzN");
        setField(term4512, term4512.getClass(), "logradouro", "BjugTaMcxJ");
        setField(term4512, term4512.getClass(), "complemento", "vGiuZVPJNH");
        setField(term4512, term4512.getClass(), "bairro", "tlzpzIjMib");
        setField(term4512, term4512.getClass(), "localidade", "AZdLeSugwv");
        setField(term4512, term4512.getClass(), "uf", "RMsXuyzKJV");
        setField(term4512, term4512.getClass(), "ibge", "FwPbDZcHmB");
        setField(term4512, term4512.getClass(), "gia", "hOncybyCAH");
        setField(term4512, term4512.getClass(), "ddd", "QduALnDSVo");
        setField(term4512, term4512.getClass(), "siafi", "izPpKDErnQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIbge", argTypes, term4512, args);
    }

};


