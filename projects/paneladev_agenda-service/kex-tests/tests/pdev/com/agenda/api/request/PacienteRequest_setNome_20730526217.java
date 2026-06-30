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

public class PacienteRequest_setNome_20730526217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public PacienteRequest_setNome_20730526217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1568 = new Long(-4365849114644724155L);
        term1567 = newInstance(Class.forName("pdev.com.agenda.api.request.PacienteRequest"));
        setField(term1567, term1567.getClass(), "id", term1568);
        setField(term1567, term1567.getClass(), "nome", "fhkbdRViHi");
        setField(term1567, term1567.getClass(), "sobrenome", "uWHnvSvaPl");
        setField(term1567, term1567.getClass(), "email", "kBdSllIBVz");
        setField(term1567, term1567.getClass(), "cpf", "TJmVBGfTML");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.request.PacienteRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tPlsykYBqO";
        callMethod(klass, "setNome", argTypes, term1567, args);
    }

};


