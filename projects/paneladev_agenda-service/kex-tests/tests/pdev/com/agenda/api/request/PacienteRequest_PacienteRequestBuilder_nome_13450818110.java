package pdev.com.agenda.api.request;

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
import static pdev.com.agenda.api.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PacienteRequest_PacienteRequestBuilder_nome_13450818110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;

    public PacienteRequest_PacienteRequestBuilder_nome_13450818110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder"));
        setField(term729, term729.getClass(), "id", null);
        setField(term729, term729.getClass(), "nome", null);
        setField(term729, term729.getClass(), "sobrenome", null);
        setField(term729, term729.getClass(), "email", null);
        setField(term729, term729.getClass(), "cpf", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest$PacienteRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "nome", argTypes, term729, args);
    }

};


