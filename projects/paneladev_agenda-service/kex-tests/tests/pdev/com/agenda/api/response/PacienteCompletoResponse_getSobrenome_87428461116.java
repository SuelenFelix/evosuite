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

public class PacienteCompletoResponse_getSobrenome_87428461116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1874;

    public PacienteCompletoResponse_getSobrenome_87428461116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1874 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term1874, term1874.getClass(), "id", null);
        setField(term1874, term1874.getClass(), "nome", null);
        setField(term1874, term1874.getClass(), "sobrenome", null);
        setField(term1874, term1874.getClass(), "email", null);
        setField(term1874, term1874.getClass(), "cpf", null);
        setField(term1874, term1874.getClass(), "enderecos", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSobrenome", argTypes, term1874, args);
    }

};


