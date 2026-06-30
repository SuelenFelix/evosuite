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

public class PacienteRequest_setSobrenome_11640413468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;

    public PacienteRequest_setSobrenome_11640413468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1681 = new Long(2486810210675247493L);
        term1680 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1680, term1680.getClass(), "id", term1681);
        setField(term1680, term1680.getClass(), "nome", "bLPjGVBhlX");
        setField(term1680, term1680.getClass(), "sobrenome", "whBvTVIIlC");
        setField(term1680, term1680.getClass(), "email", "IgRJUzaCwW");
        setField(term1680, term1680.getClass(), "cpf", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KoyGrUJeJW";
        callMethod(klass, "setSobrenome", argTypes, term1680, args);
    }

};


