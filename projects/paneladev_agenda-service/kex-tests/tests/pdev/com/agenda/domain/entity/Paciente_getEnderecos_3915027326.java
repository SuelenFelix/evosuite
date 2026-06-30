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

public class Paciente_getEnderecos_3915027326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4164;

    public Paciente_getEnderecos_3915027326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4165 = new Long(-6673920710396545553L);
        ArrayList term4215 = new ArrayList();
        term4164 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Paciente"));
        setField(term4164, term4164.getClass(), "id", term4165);
        setField(term4164, term4164.getClass(), "nome", "lZIgPZPgTu");
        setField(term4164, term4164.getClass(), "sobrenome", "iuCxnHGMoW");
        setField(term4164, term4164.getClass(), "email", "GPSEWEDSTo");
        setField(term4164, term4164.getClass(), "cpf", "RCOqfVsRHt");
        setField(term4164, term4164.getClass(), "enderecos", term4215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnderecos", argTypes, term4164, args);
    }

};


