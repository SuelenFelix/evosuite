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

public class Capa_getDataAlteracao_25565383630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35171;

    public Capa_getDataAlteracao_25565383630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35171 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term35171, term35171.getClass(), "id", null);
        setField(term35171, term35171.getClass(), "album", null);
        setField(term35171, term35171.getClass(), "mimetype", null);
        setField(term35171, term35171.getClass(), "data", null);
        setField(term35171, term35171.getClass(), "usuario", null);
        setField(term35171, term35171.getClass(), "dataCadastro", null);
        setField(term35171, term35171.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term35171, args);
    }

};


