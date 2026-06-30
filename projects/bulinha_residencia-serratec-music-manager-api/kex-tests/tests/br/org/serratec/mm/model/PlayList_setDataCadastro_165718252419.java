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

public class PlayList_setDataCadastro_165718252419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4867;

    public PlayList_setDataCadastro_165718252419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4867 = newInstance(Class.forName("br.org.serratec.mm.model.PlayList"));
        setField(term4867, term4867.getClass(), "id", null);
        setField(term4867, term4867.getClass(), "nome", null);
        setField(term4867, term4867.getClass(), "musicas", null);
        setField(term4867, term4867.getClass(), "usuario", null);
        setField(term4867, term4867.getClass(), "dataCadastro", null);
        setField(term4867, term4867.getClass(), "dataAlteracao", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.PlayList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDataCadastro", argTypes, term4867, args);
    }

};


