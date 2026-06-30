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

public class PacienteResponse_getNome_13589950713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2975;

    public PacienteResponse_getNome_13589950713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2975 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2975, term2975.getClass(), "id", null);
        setField(term2975, term2975.getClass(), "nome", null);
        setField(term2975, term2975.getClass(), "sobrenome", null);
        setField(term2975, term2975.getClass(), "email", null);
        setField(term2975, term2975.getClass(), "cpf", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term2975, args);
    }

};


