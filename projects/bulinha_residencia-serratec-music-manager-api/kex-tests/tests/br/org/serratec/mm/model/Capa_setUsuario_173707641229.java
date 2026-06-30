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

public class Capa_setUsuario_173707641229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35170;

    public Capa_setUsuario_173707641229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35170 = newInstance(Class.forName("br.org.serratec.mm.model.Capa"));
        setField(term35170, term35170.getClass(), "id", null);
        setField(term35170, term35170.getClass(), "album", null);
        setField(term35170, term35170.getClass(), "mimetype", null);
        setField(term35170, term35170.getClass(), "data", null);
        setField(term35170, term35170.getClass(), "usuario", null);
        setField(term35170, term35170.getClass(), "dataCadastro", null);
        setField(term35170, term35170.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Capa");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.model.Usuario");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsuario", argTypes, term35170, args);
    }

};


