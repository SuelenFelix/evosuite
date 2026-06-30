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

public class Agenda_getDescricao_187092761713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2762;

    public Agenda_getDescricao_187092761713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2762 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Agenda"));
        setField(term2762, term2762.getClass(), "id", null);
        setField(term2762, term2762.getClass(), "descricao", null);
        setField(term2762, term2762.getClass(), "horario", null);
        setField(term2762, term2762.getClass(), "dataCriacao", null);
        setField(term2762, term2762.getClass(), "paciente", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Agenda");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescricao", argTypes, term2762, args);
    }

};


