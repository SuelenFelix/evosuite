package pdev.com.agenda.api.response;

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
import static pdev.com.agenda.api.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class EnderecoResponse_setNumero_7005208757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3505;
     Object term3546;

    public EnderecoResponse_setNumero_7005208757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3506 = new Long(-7884871963229073324L);
        Long term3520 = new Long(-8649738738252714180L);
        term3505 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3505, term3505.getClass(), "id", term3506);
        setField(term3505, term3505.getClass(), "rua", "wBGfLpNNiZ");
        setField(term3505, term3505.getClass(), "numero", term3520);
        setField(term3505, term3505.getClass(), "complemento", "yUGCjlqgJE");
        setField(term3505, term3505.getClass(), "bairro", "PXdVZyoJyC");
        term3546 = new Long(-7278883608542636188L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term3546;
        callMethod(klass, "setNumero", argTypes, term3505, args);
    }

};


