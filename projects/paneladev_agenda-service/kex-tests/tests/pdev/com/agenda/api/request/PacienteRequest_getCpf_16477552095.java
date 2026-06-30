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
import java.lang.Long;

public class PacienteRequest_getCpf_16477552095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1383;

    public PacienteRequest_getCpf_16477552095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1384 = new Long(8428634514691209827L);
        term1383 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1383, term1383.getClass(), "id", term1384);
        setField(term1383, term1383.getClass(), "nome", "ffYhPOzlUs");
        setField(term1383, term1383.getClass(), "sobrenome", "MLqYREekMl");
        setField(term1383, term1383.getClass(), "email", "ytSBIKXogI");
        setField(term1383, term1383.getClass(), "cpf", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term1383, args);
    }

};


