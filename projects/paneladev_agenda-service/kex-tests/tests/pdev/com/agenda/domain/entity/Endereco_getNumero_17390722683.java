package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Endereco_getNumero_17390722683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2913;

    public Endereco_getNumero_17390722683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2914 = new Long(-2255965562447970862L);
        Long term2928 = new Long(148047808219672941L);
        term2913 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term2913, term2913.getClass(), "id", term2914);
        setField(term2913, term2913.getClass(), "rua", "IpQuOGMgmj");
        setField(term2913, term2913.getClass(), "numero", term2928);
        setField(term2913, term2913.getClass(), "complemento", "pJbnHTYrxn");
        setField(term2913, term2913.getClass(), "bairro", "iIRsCSYqXH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumero", argTypes, term2913, args);
    }

};


