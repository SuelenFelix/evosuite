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

public class PacienteResponse_setId_12606170265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;
     Object term2390;

    public PacienteResponse_setId_12606170265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2340 = new Long(6843866297465638866L);
        term2339 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term2339, term2339.getClass(), "id", term2340);
        setField(term2339, term2339.getClass(), "nome", "NTlKJDDWlk");
        setField(term2339, term2339.getClass(), "sobrenome", "vOuMEpOQAg");
        setField(term2339, term2339.getClass(), "email", "SIODFGaQhr");
        setField(term2339, term2339.getClass(), "cpf", "qYzsiuXOgS");
        term2390 = new Long(-4023935540989049732L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2390;
        callMethod(klass, "setId", argTypes, term2339, args);
    }

};


