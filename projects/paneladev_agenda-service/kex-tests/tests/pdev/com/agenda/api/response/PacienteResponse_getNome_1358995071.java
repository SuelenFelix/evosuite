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

public class PacienteResponse_getNome_1358995071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1975;

    public PacienteResponse_getNome_1358995071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1976 = new Long(-6432617521836576658L);
        term1975 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteResponse"));
        setField(term1975, term1975.getClass(), "id", term1976);
        setField(term1975, term1975.getClass(), "nome", "xvkbvaEGYd");
        setField(term1975, term1975.getClass(), "sobrenome", "HBGNxdNURv");
        setField(term1975, term1975.getClass(), "email", "mfCpTPPQQm");
        setField(term1975, term1975.getClass(), "cpf", "OcJCIDNIXA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term1975, args);
    }

};


