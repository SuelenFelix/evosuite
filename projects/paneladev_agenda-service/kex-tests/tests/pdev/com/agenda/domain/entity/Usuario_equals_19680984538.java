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

public class Usuario_equals_19680984538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;
     Object term660;

    public Usuario_equals_19680984538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term622 = new Long(6967924379644551255L);
        term621 = newInstance(Class.forName("pdev.com.agenda.domain.entity.Usuario"));
        setField(term621, term621.getClass(), "id", term622);
        setField(term621, term621.getClass(), "nome", "OclPbYPkcH");
        setField(term621, term621.getClass(), "usuario", "IoAlmYsBwc");
        setField(term621, term621.getClass(), "senha", "TEParAifyi");
        term660 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pdev.com.agenda.domain.entity.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term660;
        callMethod(klass, "equals", argTypes, term621, args);
    }

};


