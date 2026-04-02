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

public class Musica_getDataAlteracao_147280653528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7285;

    public Musica_getDataAlteracao_147280653528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7285 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        setField(term7285, term7285.getClass(), "id", null);
        setField(term7285, term7285.getClass(), "titulo", null);
        setField(term7285, term7285.getClass(), "minutos", null);
        setField(term7285, term7285.getClass(), "usuario", null);
        setField(term7285, term7285.getClass(), "dataCadastro", null);
        setField(term7285, term7285.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataAlteracao", argTypes, term7285, args);
    }

};


