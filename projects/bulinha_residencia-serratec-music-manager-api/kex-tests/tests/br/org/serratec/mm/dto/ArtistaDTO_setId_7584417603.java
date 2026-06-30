package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class ArtistaDTO_setId_7584417603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2541;
     Object term2568;

    public ArtistaDTO_setId_7584417603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2542 = new Long(-316468845751588286L);
        Class<? extends Object> term2581 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term2580 = ((Class) term2581).getDeclaredField((String) "BANDA");
        ((Field) term2580).setAccessible(true);
        Object enum2 = ((Field) term2580).get((Object) null);
        term2541 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term2541, term2541.getClass(), "id", term2542);
        setField(term2541, term2541.getClass(), "nome", "LvJFtLBaxj");
        setField(term2541, term2541.getClass(), "tipo", enum2);
        term2568 = new Long(5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2568;
        callMethod(klass, "setId", argTypes, term2541, args);
    }

};


