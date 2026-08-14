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

public class Endereco_setIbge_170924398614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4733;

    public Endereco_setIbge_170924398614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4733 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term4733, term4733.getClass(), "cep", "NnpwZBUTvx");
        setField(term4733, term4733.getClass(), "logradouro", "tlQSNgTkQX");
        setField(term4733, term4733.getClass(), "complemento", "PCipZnmBOF");
        setField(term4733, term4733.getClass(), "bairro", "zcorEihhLK");
        setField(term4733, term4733.getClass(), "localidade", "GrqozDKFOk");
        setField(term4733, term4733.getClass(), "uf", "CFyoseFGLF");
        setField(term4733, term4733.getClass(), "ibge", "SFqCrhEWLm");
        setField(term4733, term4733.getClass(), "gia", "GZdcJyZntS");
        setField(term4733, term4733.getClass(), "ddd", "OIHoJeysUi");
        setField(term4733, term4733.getClass(), "siafi", "WXMWFDGcLB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wKWbJssZuG";
        callMethod(klass, "setIbge", argTypes, term4733, args);
    }

};


