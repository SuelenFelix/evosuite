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

public class Endereco_getComplemento_18235212765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2656;

    public Endereco_getComplemento_18235212765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2656 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term2656, term2656.getClass(), "cep", "mXGCWJDOqA");
        setField(term2656, term2656.getClass(), "logradouro", "dpNsDgfPso");
        setField(term2656, term2656.getClass(), "complemento", "hCWPJQKpdc");
        setField(term2656, term2656.getClass(), "bairro", "WzMEhMXkKx");
        setField(term2656, term2656.getClass(), "localidade", "XOiDvlDhdc");
        setField(term2656, term2656.getClass(), "uf", "AdxvLJhNLe");
        setField(term2656, term2656.getClass(), "ibge", "lHfTrWKMPk");
        setField(term2656, term2656.getClass(), "gia", "JDaAnsVTGV");
        setField(term2656, term2656.getClass(), "ddd", "mLUZFTfjle");
        setField(term2656, term2656.getClass(), "siafi", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getComplemento", argTypes, term2656, args);
    }

};


