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

public class PacienteResponse_getEmail_11213675423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2157;

    public PacienteResponse_getEmail_11213675423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2158 = new Long(148047808219672941L);
        term2157 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2157, term2157.getClass(), "id", term2158);
        setField(term2157, term2157.getClass(), "nome", "pJbnHTYrxn");
        setField(term2157, term2157.getClass(), "sobrenome", "iIRsCSYqXH");
        setField(term2157, term2157.getClass(), "email", "nghfqDXyCG");
        setField(term2157, term2157.getClass(), "cpf", "WBAOTqErtm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term2157, args);
    }

};


