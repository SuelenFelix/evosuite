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
import java.lang.Long;
import java.lang.Object;

public class Cliente_setEndereco_1897610916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1255;
     Object term1391;

    public Cliente_setEndereco_1897610916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1256 = new Long(4872422362414183754L);
        term1255 = newInstance(Class.forName("one.digitalinnovation.gof.model.Cliente"));
        Object term1270 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term1255, term1255.getClass(), "id", term1256);
        setField(term1255, term1255.getClass(), "nome", "ffYhPOzlUs");
        setField(term1270, term1270.getClass(), "cep", "MLqYREekMl");
        setField(term1270, term1270.getClass(), "logradouro", "ytSBIKXogI");
        setField(term1270, term1270.getClass(), "complemento", "nHXjMycHlU");
        setField(term1270, term1270.getClass(), "bairro", "ieCtQFdkii");
        setField(term1270, term1270.getClass(), "localidade", "dEnhdmILtU");
        setField(term1270, term1270.getClass(), "uf", "hoicvmsovO");
        setField(term1270, term1270.getClass(), "ibge", "eqJfYWRaEL");
        setField(term1270, term1270.getClass(), "gia", "fhkbdRViHi");
        setField(term1270, term1270.getClass(), "ddd", "uWHnvSvaPl");
        setField(term1270, term1270.getClass(), "siafi", "kBdSllIBVz");
        setField(term1255, term1255.getClass(), "endereco", term1270);
        term1391 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term1391, term1391.getClass(), "cep", "TJmVBGfTML");
        setField(term1391, term1391.getClass(), "logradouro", "tPlsykYBqO");
        setField(term1391, term1391.getClass(), "complemento", "bLPjGVBhlX");
        setField(term1391, term1391.getClass(), "bairro", "whBvTVIIlC");
        setField(term1391, term1391.getClass(), "localidade", "IgRJUzaCwW");
        setField(term1391, term1391.getClass(), "uf", "JUmudUmaaV");
        setField(term1391, term1391.getClass(), "ibge", "KoyGrUJeJW");
        setField(term1391, term1391.getClass(), "gia", "HqBOwkVqjD");
        setField(term1391, term1391.getClass(), "ddd", "MAcUBcBckh");
        setField(term1391, term1391.getClass(), "siafi", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Cliente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Object[] args = new Object[1];
        args[0] = term1391;
        callMethod(klass, "setEndereco", argTypes, term1255, args);
    }

};


