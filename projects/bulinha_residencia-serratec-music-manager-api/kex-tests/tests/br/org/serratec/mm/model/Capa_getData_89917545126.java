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

public class Capa_getData_89917545126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35167;

    public Capa_getData_89917545126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35167 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term35167, term35167.getClass(), "id", null);
        setField(term35167, term35167.getClass(), "album", null);
        setField(term35167, term35167.getClass(), "mimetype", null);
        setField(term35167, term35167.getClass(), "data", null);
        setField(term35167, term35167.getClass(), "usuario", null);
        setField(term35167, term35167.getClass(), "dataCadastro", null);
        setField(term35167, term35167.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term35167, args);
    }

};


