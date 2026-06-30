package pdev.com.agenda.domain.entity;

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
import static pdev.com.agenda.domain.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class Paciente_setCpf_208633387811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4851;

    public Paciente_setCpf_208633387811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4852 = new Long(394960377236392159L);
        Long term4905 = new Long(-2955854401507097864L);
        Long term4908 = new Long(329213208496958131L);
        Object term4904 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4904, term4904.getClass(), "id", term4905);
        setField(term4904, term4904.getClass(), "rua", "");
        setField(term4904, term4904.getClass(), "numero", term4908);
        setField(term4904, term4904.getClass(), "complemento", "");
        setField(term4904, term4904.getClass(), "bairro", "");
        ArrayList term4902 = new ArrayList();
        ((ArrayList) term4902).add(term4904);
        term4851 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4851, term4851.getClass(), "id", term4852);
        setField(term4851, term4851.getClass(), "nome", "bKBSncrMEZ");
        setField(term4851, term4851.getClass(), "sobrenome", "yeSXGqQExb");
        setField(term4851, term4851.getClass(), "email", "uXYcXVYJZM");
        setField(term4851, term4851.getClass(), "cpf", "BJhjdJUhkz");
        setField(term4851, term4851.getClass(), "enderecos", term4902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "huVIXUWLtI";
        callMethod(klass, "setCpf", argTypes, term4851, args);
    }

};


