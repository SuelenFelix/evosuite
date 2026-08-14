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

public class Endereco_setLogradouro_1467058354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2413;

    public Endereco_setLogradouro_1467058354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2413 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term2413, term2413.getClass(), "cep", "ZVecLZMLHF");
        setField(term2413, term2413.getClass(), "logradouro", "fztQhjqwdP");
        setField(term2413, term2413.getClass(), "complemento", "eVpkWxjuki");
        setField(term2413, term2413.getClass(), "bairro", "SJiQaLvSKv");
        setField(term2413, term2413.getClass(), "localidade", "OEXDRUKcFl");
        setField(term2413, term2413.getClass(), "uf", "RYdKCNNMBR");
        setField(term2413, term2413.getClass(), "ibge", "yGtHPyvYiQ");
        setField(term2413, term2413.getClass(), "gia", "MvRIxilFMJ");
        setField(term2413, term2413.getClass(), "ddd", "iNwOJRBEjp");
        setField(term2413, term2413.getClass(), "siafi", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "setLogradouro", argTypes, term2413, args);
    }

};


