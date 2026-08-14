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

public class Endereco_getCep_19795292151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1728;

    public Endereco_getCep_19795292151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1728 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term1728, term1728.getClass(), "cep", "vQVyKLdtaz");
        setField(term1728, term1728.getClass(), "logradouro", "OWKQODBLzb");
        setField(term1728, term1728.getClass(), "complemento", "wGmYcqUkgE");
        setField(term1728, term1728.getClass(), "bairro", "idgaQsnJpQ");
        setField(term1728, term1728.getClass(), "localidade", "VgZnGoIFwQ");
        setField(term1728, term1728.getClass(), "uf", "jUbSRrkrYZ");
        setField(term1728, term1728.getClass(), "ibge", "bWWfajKbEX");
        setField(term1728, term1728.getClass(), "gia", "cAPeiZHKGJ");
        setField(term1728, term1728.getClass(), "ddd", "LvJFtLBaxj");
        setField(term1728, term1728.getClass(), "siafi", "PHvxnGHptP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCep", argTypes, term1728, args);
    }

};


