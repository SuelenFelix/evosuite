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

public class Agenda_setPaciente_188194078121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2770;

    public Agenda_setPaciente_188194078121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2770 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        setField(term2770, term2770.getClass(), "id", null);
        setField(term2770, term2770.getClass(), "descricao", null);
        setField(term2770, term2770.getClass(), "horario", null);
        setField(term2770, term2770.getClass(), "dataCriacao", null);
        setField(term2770, term2770.getClass(), "paciente", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("pdev.com.agenda.domain.entity.Paciente");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPaciente", argTypes, term2770, args);
    }

};


