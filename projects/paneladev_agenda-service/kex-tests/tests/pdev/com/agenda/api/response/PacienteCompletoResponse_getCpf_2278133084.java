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
import java.util.ArrayList;
import java.lang.Object;

public class PacienteCompletoResponse_getCpf_2278133084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509;

    public PacienteCompletoResponse_getCpf_2278133084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term510 = new Long(6617340557564669657L);
        Long term563 = new Long(1439298019805881866L);
        Long term566 = new Long(-8708192233349544946L);
        Object term562 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term562, term562.getClass(), "id", term563);
        setField(term562, term562.getClass(), "rua", "");
        setField(term562, term562.getClass(), "numero", term566);
        setField(term562, term562.getClass(), "complemento", "");
        setField(term562, term562.getClass(), "bairro", "");
        ArrayList term560 = new ArrayList();
        ((ArrayList) term560).add(term562);
        term509 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term509, term509.getClass(), "id", term510);
        setField(term509, term509.getClass(), "nome", "fhkbdRViHi");
        setField(term509, term509.getClass(), "sobrenome", "uWHnvSvaPl");
        setField(term509, term509.getClass(), "email", "kBdSllIBVz");
        setField(term509, term509.getClass(), "cpf", "TJmVBGfTML");
        setField(term509, term509.getClass(), "enderecos", term560);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term509, args);
    }

};


