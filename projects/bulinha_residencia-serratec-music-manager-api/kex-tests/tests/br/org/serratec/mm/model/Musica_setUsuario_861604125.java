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

public class Musica_setUsuario_861604125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7282;

    public Musica_setUsuario_861604125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7282 = newInstance(Class.forName("br.org.serratec.mm.model.Musica"));
        setField(term7282, term7282.getClass(), "id", null);
        setField(term7282, term7282.getClass(), "titulo", null);
        setField(term7282, term7282.getClass(), "minutos", null);
        setField(term7282, term7282.getClass(), "usuario", null);
        setField(term7282, term7282.getClass(), "dataCadastro", null);
        setField(term7282, term7282.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Musica");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Usuario");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsuario", argTypes, term7282, args);
    }

};


