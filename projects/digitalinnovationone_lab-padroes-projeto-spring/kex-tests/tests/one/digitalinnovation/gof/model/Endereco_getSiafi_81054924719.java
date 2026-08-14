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

public class Endereco_getSiafi_81054924719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5904;

    public Endereco_getSiafi_81054924719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5904 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term5904, term5904.getClass(), "cep", "SOrEHbcbmn");
        setField(term5904, term5904.getClass(), "logradouro", "bnsyeQXFdu");
        setField(term5904, term5904.getClass(), "complemento", "BwtdjiefJn");
        setField(term5904, term5904.getClass(), "bairro", "jDmhBrIoDa");
        setField(term5904, term5904.getClass(), "localidade", "SPtPatHeOm");
        setField(term5904, term5904.getClass(), "uf", "ywmcuThdfL");
        setField(term5904, term5904.getClass(), "ibge", "GBOEuByOfr");
        setField(term5904, term5904.getClass(), "gia", "NHbOFFjyVK");
        setField(term5904, term5904.getClass(), "ddd", "zaloBqlrSo");
        setField(term5904, term5904.getClass(), "siafi", "vvoLrMGCoN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSiafi", argTypes, term5904, args);
    }

};


