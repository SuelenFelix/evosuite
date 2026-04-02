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
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class Artista_init_1121399701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7289;

    public Artista_init_1121399701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7290 = new Long(3090901538358721367L);
        Class<? extends Object> term7362 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term7361 = ((Class) term7362).getDeclaredField((String) "BANDA");
        ((Field) term7361).setAccessible(true);
        Object enum0 = ((Field) term7361).get((Object) null);
        term7289 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term7289, term7289.getClass(), "id", term7290);
        setField(term7289, term7289.getClass(), "nome", "fVdTcjgHdw");
        setField(term7289, term7289.getClass(), "tipo", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.model.Artista");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Object[] args = new Object[1];
        args[0] = term7289;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


