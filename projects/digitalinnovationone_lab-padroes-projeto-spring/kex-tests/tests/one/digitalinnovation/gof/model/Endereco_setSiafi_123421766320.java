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

public class Endereco_setSiafi_123421766320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6125;

    public Endereco_setSiafi_123421766320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6125 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term6125, term6125.getClass(), "cep", "pXdglvyrQe");
        setField(term6125, term6125.getClass(), "logradouro", "OcfNzHYdki");
        setField(term6125, term6125.getClass(), "complemento", "uPuCVuZYOI");
        setField(term6125, term6125.getClass(), "bairro", "TweMFhxNdj");
        setField(term6125, term6125.getClass(), "localidade", "NBrvVzvQHe");
        setField(term6125, term6125.getClass(), "uf", "FjOiNAfBOc");
        setField(term6125, term6125.getClass(), "ibge", "iCCsaLHohG");
        setField(term6125, term6125.getClass(), "gia", "NJhGgctbdj");
        setField(term6125, term6125.getClass(), "ddd", "MYWYUeLGOp");
        setField(term6125, term6125.getClass(), "siafi", "tsTGdgQYUL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TtGbVmKcnX";
        callMethod(klass, "setSiafi", argTypes, term6125, args);
    }

};


