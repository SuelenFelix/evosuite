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

public class Endereco_setDdd_60526583318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5661;

    public Endereco_setDdd_60526583318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5661 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term5661, term5661.getClass(), "cep", "doQLHkjpNm");
        setField(term5661, term5661.getClass(), "logradouro", "lCyLIcSuom");
        setField(term5661, term5661.getClass(), "complemento", "CGOpQSZZwI");
        setField(term5661, term5661.getClass(), "bairro", "ypEdrstygY");
        setField(term5661, term5661.getClass(), "localidade", "sNQFlATEeQ");
        setField(term5661, term5661.getClass(), "uf", "ZKMLioamsY");
        setField(term5661, term5661.getClass(), "ibge", "WVbxuoDBcn");
        setField(term5661, term5661.getClass(), "gia", "pvDEABOxLt");
        setField(term5661, term5661.getClass(), "ddd", "beAMpkroCQ");
        setField(term5661, term5661.getClass(), "siafi", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onQLVONGuf";
        callMethod(klass, "setDdd", argTypes, term5661, args);
    }

};


