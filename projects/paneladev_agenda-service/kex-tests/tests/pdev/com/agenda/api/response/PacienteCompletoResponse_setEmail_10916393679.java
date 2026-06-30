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

public class PacienteCompletoResponse_setEmail_10916393679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1206;

    public PacienteCompletoResponse_setEmail_10916393679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1207 = new Long(4474998035090263139L);
        Long term1260 = new Long(2848819812340321742L);
        Long term1263 = new Long(-8876856890348836498L);
        Object term1259 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term1259, term1259.getClass(), "id", term1260);
        setField(term1259, term1259.getClass(), "rua", "");
        setField(term1259, term1259.getClass(), "numero", term1263);
        setField(term1259, term1259.getClass(), "complemento", "");
        setField(term1259, term1259.getClass(), "bairro", "");
        ArrayList term1257 = new ArrayList();
        ((ArrayList) term1257).add(term1259);
        term1206 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term1206, term1206.getClass(), "id", term1207);
        setField(term1206, term1206.getClass(), "nome", "MwwjNtdOFT");
        setField(term1206, term1206.getClass(), "sobrenome", "VYkqXKVlAJ");
        setField(term1206, term1206.getClass(), "email", "XkIoWJRNwN");
        setField(term1206, term1206.getClass(), "cpf", "aNWLJdrZMq");
        setField(term1206, term1206.getClass(), "enderecos", term1257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        callMethod(klass, "setEmail", argTypes, term1206, args);
    }

};


