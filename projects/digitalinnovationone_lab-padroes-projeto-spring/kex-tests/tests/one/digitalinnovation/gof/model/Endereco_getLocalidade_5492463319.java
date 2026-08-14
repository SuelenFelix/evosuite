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

public class Endereco_getLocalidade_5492463319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3584;

    public Endereco_getLocalidade_5492463319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3584 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term3584, term3584.getClass(), "cep", "aWYOWZFyaX");
        setField(term3584, term3584.getClass(), "logradouro", "BRIVNtfUWU");
        setField(term3584, term3584.getClass(), "complemento", "DbiCVtPPCT");
        setField(term3584, term3584.getClass(), "bairro", "WzFopsaDuG");
        setField(term3584, term3584.getClass(), "localidade", "PapWxkhEWe");
        setField(term3584, term3584.getClass(), "uf", "smnHEqRFRx");
        setField(term3584, term3584.getClass(), "ibge", "XYtryyobou");
        setField(term3584, term3584.getClass(), "gia", "OYbzXylRWW");
        setField(term3584, term3584.getClass(), "ddd", "DSNsTGYXDF");
        setField(term3584, term3584.getClass(), "siafi", "sQvGcVjdEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocalidade", argTypes, term3584, args);
    }

};


