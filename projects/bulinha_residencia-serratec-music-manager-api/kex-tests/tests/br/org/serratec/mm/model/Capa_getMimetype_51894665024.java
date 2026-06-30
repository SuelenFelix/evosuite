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

public class Capa_getMimetype_51894665024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35165;

    public Capa_getMimetype_51894665024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35165 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term35165, term35165.getClass(), "id", null);
        setField(term35165, term35165.getClass(), "album", null);
        setField(term35165, term35165.getClass(), "mimetype", null);
        setField(term35165, term35165.getClass(), "data", null);
        setField(term35165, term35165.getClass(), "usuario", null);
        setField(term35165, term35165.getClass(), "dataCadastro", null);
        setField(term35165, term35165.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMimetype", argTypes, term35165, args);
    }

};


