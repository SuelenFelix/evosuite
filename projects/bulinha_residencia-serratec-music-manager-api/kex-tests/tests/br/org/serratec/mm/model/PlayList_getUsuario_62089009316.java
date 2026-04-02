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

public class PlayList_getUsuario_62089009316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4864;

    public PlayList_getUsuario_62089009316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4864 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        setField(term4864, term4864.getClass(), "id", null);
        setField(term4864, term4864.getClass(), "nome", null);
        setField(term4864, term4864.getClass(), "musicas", null);
        setField(term4864, term4864.getClass(), "usuario", null);
        setField(term4864, term4864.getClass(), "dataCadastro", null);
        setField(term4864, term4864.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsuario", argTypes, term4864, args);
    }

};


