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

public class Endereco_setUf_1039500012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4269;

    public Endereco_setUf_1039500012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4269 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term4269, term4269.getClass(), "cep", "OqbwYQfvAe");
        setField(term4269, term4269.getClass(), "logradouro", "tRxZafjqIx");
        setField(term4269, term4269.getClass(), "complemento", "DhjNLmRMCu");
        setField(term4269, term4269.getClass(), "bairro", "PgPzMSEjjX");
        setField(term4269, term4269.getClass(), "localidade", "wzsPSPcRdj");
        setField(term4269, term4269.getClass(), "uf", "kGMQdqJYyB");
        setField(term4269, term4269.getClass(), "ibge", "XJJNClzHRf");
        setField(term4269, term4269.getClass(), "gia", "HDaezxQfQR");
        setField(term4269, term4269.getClass(), "ddd", "iikZEapDlu");
        setField(term4269, term4269.getClass(), "siafi", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZkMALXpEAZ";
        callMethod(klass, "setUf", argTypes, term4269, args);
    }

};


