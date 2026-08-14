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

public class Endereco_getDdd_197864701717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5440;

    public Endereco_getDdd_197864701717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5440 = newInstance(Class.forName("one.digitalinnovation.gof.model.Endereco"));
        setField(term5440, term5440.getClass(), "cep", "UKAReurpHG");
        setField(term5440, term5440.getClass(), "logradouro", "WVRMUmrljA");
        setField(term5440, term5440.getClass(), "complemento", "NTlKJDDWlk");
        setField(term5440, term5440.getClass(), "bairro", "vOuMEpOQAg");
        setField(term5440, term5440.getClass(), "localidade", "SIODFGaQhr");
        setField(term5440, term5440.getClass(), "uf", "qYzsiuXOgS");
        setField(term5440, term5440.getClass(), "ibge", "bxrCBbrrct");
        setField(term5440, term5440.getClass(), "gia", "CKWpJaaaxX");
        setField(term5440, term5440.getClass(), "ddd", "UBRmXJmfrt");
        setField(term5440, term5440.getClass(), "siafi", "WZzvmIHhzZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("one.digitalinnovation.gof.model.Endereco");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDdd", argTypes, term5440, args);
    }

};


