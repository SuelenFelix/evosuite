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

public class Paciente_getNome_45932692215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5147;

    public Paciente_getNome_45932692215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5147 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term5147, term5147.getClass(), "id", null);
        setField(term5147, term5147.getClass(), "nome", null);
        setField(term5147, term5147.getClass(), "sobrenome", null);
        setField(term5147, term5147.getClass(), "email", null);
        setField(term5147, term5147.getClass(), "cpf", null);
        setField(term5147, term5147.getClass(), "enderecos", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term5147, args);
    }

};


