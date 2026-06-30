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

public class Capa_getId_11285214742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13563;

    public Capa_getId_11285214742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13563 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term13563, term13563.getClass(), "id", null);
        setField(term13563, term13563.getClass(), "album", null);
        setField(term13563, term13563.getClass(), "mimetype", null);
        setField(term13563, term13563.getClass(), "data", null);
        setField(term13563, term13563.getClass(), "usuario", null);
        setField(term13563, term13563.getClass(), "dataCadastro", null);
        setField(term13563, term13563.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13563, args);
    }

};


