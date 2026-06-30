package br.org.serratec.mm.model;

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
import static br.org.serratec.mm.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Musica_getMinutos_102394085722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7279;

    public Musica_getMinutos_102394085722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7279 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        setField(term7279, term7279.getClass(), "id", null);
        setField(term7279, term7279.getClass(), "titulo", null);
        setField(term7279, term7279.getClass(), "minutos", null);
        setField(term7279, term7279.getClass(), "usuario", null);
        setField(term7279, term7279.getClass(), "dataCadastro", null);
        setField(term7279, term7279.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinutos", argTypes, term7279, args);
    }

};


