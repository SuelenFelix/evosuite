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

public class PacienteResponse_getId_16906587840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1884;

    public PacienteResponse_getId_16906587840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1885 = new Long(-1804015692891701666L);
        term1884 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term1884, term1884.getClass(), "id", term1885);
        setField(term1884, term1884.getClass(), "nome", "TwfWVQGiIj");
        setField(term1884, term1884.getClass(), "sobrenome", "gUvcueTURF");
        setField(term1884, term1884.getClass(), "email", "EwQBhZjCIT");
        setField(term1884, term1884.getClass(), "cpf", "aSkmSwTnEw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1884, args);
    }

};


