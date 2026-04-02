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

public class PlayList_getDataCadastro_213699226018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4866;

    public PlayList_getDataCadastro_213699226018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4866 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        setField(term4866, term4866.getClass(), "id", null);
        setField(term4866, term4866.getClass(), "nome", null);
        setField(term4866, term4866.getClass(), "musicas", null);
        setField(term4866, term4866.getClass(), "usuario", null);
        setField(term4866, term4866.getClass(), "dataCadastro", null);
        setField(term4866, term4866.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataCadastro", argTypes, term4866, args);
    }

};


