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

public class PacienteCompletoResponse_getSobrenome_8742846112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263;

    public PacienteCompletoResponse_getSobrenome_8742846112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term264 = new Long(8428634514691209827L);
        Long term317 = new Long(-2585684163342970173L);
        Long term320 = new Long(8059786003080744426L);
        Object term316 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term316, term316.getClass(), "id", term317);
        setField(term316, term316.getClass(), "rua", "");
        setField(term316, term316.getClass(), "numero", term320);
        setField(term316, term316.getClass(), "complemento", "");
        setField(term316, term316.getClass(), "bairro", "");
        Long term325 = new Long(-4365849114644724155L);
        Long term328 = new Long(2486810210675247493L);
        Object term324 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term324, term324.getClass(), "id", term325);
        setField(term324, term324.getClass(), "rua", "");
        setField(term324, term324.getClass(), "numero", term328);
        setField(term324, term324.getClass(), "complemento", "");
        setField(term324, term324.getClass(), "bairro", "");
        Long term333 = new Long(7009926388951271268L);
        Long term336 = new Long(-7672528020740371001L);
        Object term332 = newInstance(Class.forName("pdev.com.agenda.api.response.EnderecoResponse"));
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "rua", "");
        setField(term332, term332.getClass(), "numero", term336);
        setField(term332, term332.getClass(), "complemento", "");
        setField(term332, term332.getClass(), "bairro", "");
        ArrayList term314 = new ArrayList();
        ((ArrayList) term314).add(term316);
        ((ArrayList) term314).add(term324);
        ((ArrayList) term314).add(term332);
        term263 = newInstance(Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse"));
        setField(term263, term263.getClass(), "id", term264);
        setField(term263, term263.getClass(), "nome", "Ghbwtircqb");
        setField(term263, term263.getClass(), "sobrenome", "xrwlQZdwCp");
        setField(term263, term263.getClass(), "email", "IDCWpPLRkE");
        setField(term263, term263.getClass(), "cpf", "nyiiPDVjAc");
        setField(term263, term263.getClass(), "enderecos", term314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.api.response.PacienteCompletoResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSobrenome", argTypes, term263, args);
    }

};


