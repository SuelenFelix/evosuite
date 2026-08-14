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

public class Endereco_setLocalidade_90047479710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3805;

    public Endereco_setLocalidade_90047479710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3805 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term3805, term3805.getClass(), "cep", "rLHAoqXgPh");
        setField(term3805, term3805.getClass(), "logradouro", "zUlRdimJtU");
        setField(term3805, term3805.getClass(), "complemento", "vwbEQQNQrx");
        setField(term3805, term3805.getClass(), "bairro", "xtftXXMbem");
        setField(term3805, term3805.getClass(), "localidade", "cudZvLMQon");
        setField(term3805, term3805.getClass(), "uf", "lihXWlGDxk");
        setField(term3805, term3805.getClass(), "ibge", "JmcmxoGhIK");
        setField(term3805, term3805.getClass(), "gia", "jXzmYyrnnT");
        setField(term3805, term3805.getClass(), "ddd", "igCAtimmYB");
        setField(term3805, term3805.getClass(), "siafi", "DyiXbeYIaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        callMethod(klass, "setLocalidade", argTypes, term3805, args);
    }

};


