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

public class Paciente_getCpf_8352522345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4061;

    public Paciente_getCpf_8352522345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4062 = new Long(4795660804170399986L);
        Long term4115 = new Long(-4030863184426321096L);
        Long term4118 = new Long(-8010214112439224349L);
        Object term4114 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Endereco"));
        setField(term4114, term4114.getClass(), "id", term4115);
        setField(term4114, term4114.getClass(), "rua", "");
        setField(term4114, term4114.getClass(), "numero", term4118);
        setField(term4114, term4114.getClass(), "complemento", "");
        setField(term4114, term4114.getClass(), "bairro", "");
        ArrayList term4112 = new ArrayList();
        ((ArrayList) term4112).add(term4114);
        term4061 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4061, term4061.getClass(), "id", term4062);
        setField(term4061, term4061.getClass(), "nome", "RDnkgWkcbz");
        setField(term4061, term4061.getClass(), "sobrenome", "IBpaxltauX");
        setField(term4061, term4061.getClass(), "email", "hePqROaplw");
        setField(term4061, term4061.getClass(), "cpf", "PJcSNDruWd");
        setField(term4061, term4061.getClass(), "enderecos", term4112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term4061, args);
    }

};


