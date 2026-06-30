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

public class PacienteRequest_getId_19079353301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019;

    public PacienteRequest_getId_19079353301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1020 = new Long(-316468845751588286L);
        term1019 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1019, term1019.getClass(), "id", term1020);
        setField(term1019, term1019.getClass(), "nome", "wSQxaModmm");
        setField(term1019, term1019.getClass(), "sobrenome", "UlajhuVLaP");
        setField(term1019, term1019.getClass(), "email", "gGSMzuGICf");
        setField(term1019, term1019.getClass(), "cpf", "hxCBltsObl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1019, args);
    }

};


