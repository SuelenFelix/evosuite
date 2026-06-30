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

public class EnderecoResponse_getBairro_8813225994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3268;

    public EnderecoResponse_getBairro_8813225994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3269 = new Long(138235087558060686L);
        Long term3283 = new Long(5381386339318883012L);
        term3268 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term3268, term3268.getClass(), "id", term3269);
        setField(term3268, term3268.getClass(), "rua", "GJVkUrCVdD");
        setField(term3268, term3268.getClass(), "numero", term3283);
        setField(term3268, term3268.getClass(), "complemento", "zNdorvdUgu");
        setField(term3268, term3268.getClass(), "bairro", "oPxuZbkYio");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.EnderecoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBairro", argTypes, term3268, args);
    }

};


