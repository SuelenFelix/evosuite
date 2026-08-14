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

public class Endereco_setComplemento_19265720926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2877;

    public Endereco_setComplemento_19265720926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2877 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term2877, term2877.getClass(), "cep", "SdCKLMIYnX");
        setField(term2877, term2877.getClass(), "logradouro", "OJJtVNPyKZ");
        setField(term2877, term2877.getClass(), "complemento", "AKNapTAfmD");
        setField(term2877, term2877.getClass(), "bairro", "xJgPlLxpgC");
        setField(term2877, term2877.getClass(), "localidade", "EYtfuJaxiM");
        setField(term2877, term2877.getClass(), "uf", "gCWtLVKVVe");
        setField(term2877, term2877.getClass(), "ibge", "fWKJoSoCwE");
        setField(term2877, term2877.getClass(), "gia", "wfaXBpWAUH");
        setField(term2877, term2877.getClass(), "ddd", "VMeAzAHwZj");
        setField(term2877, term2877.getClass(), "siafi", "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZzIujlwVsw";
        callMethod(klass, "setComplemento", argTypes, term2877, args);
    }

};


