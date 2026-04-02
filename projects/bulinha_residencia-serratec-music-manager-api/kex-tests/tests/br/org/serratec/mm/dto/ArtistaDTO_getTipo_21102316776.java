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

public class ArtistaDTO_getTipo_21102316776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3278;

    public ArtistaDTO_getTipo_21102316776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3279 = new Long(8428634514691209827L);
        Class<? extends Object> term3316 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term3315 = ((Class) term3316).getDeclaredField((String) "BANDA");
        ((Field) term3315).setAccessible(true);
        Object enum5 = ((Field) term3315).get((Object) null);
        term3278 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term3278, term3278.getClass(), "id", term3279);
        setField(term3278, term3278.getClass(), "nome", "jSpAteRute");
        setField(term3278, term3278.getClass(), "tipo", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTipo", argTypes, term3278, args);
    }

};


