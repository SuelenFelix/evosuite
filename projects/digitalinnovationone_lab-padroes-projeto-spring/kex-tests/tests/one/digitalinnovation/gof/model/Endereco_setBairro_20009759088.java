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

public class Endereco_setBairro_20009759088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3341;

    public Endereco_setBairro_20009759088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3341 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term3341, term3341.getClass(), "cep", "jwsfVjMoJT");
        setField(term3341, term3341.getClass(), "logradouro", "ZfdXfCCFDf");
        setField(term3341, term3341.getClass(), "complemento", "MwwjNtdOFT");
        setField(term3341, term3341.getClass(), "bairro", "VYkqXKVlAJ");
        setField(term3341, term3341.getClass(), "localidade", "XkIoWJRNwN");
        setField(term3341, term3341.getClass(), "uf", "aNWLJdrZMq");
        setField(term3341, term3341.getClass(), "ibge", "HHmNoYxIGj");
        setField(term3341, term3341.getClass(), "gia", "PtirvZmsGt");
        setField(term3341, term3341.getClass(), "ddd", "HWkpTmtlrc");
        setField(term3341, term3341.getClass(), "siafi", "hMmaoREuCK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VeDtgDzGAN";
        callMethod(klass, "setBairro", argTypes, term3341, args);
    }

};


