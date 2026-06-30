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

public class ArtistaDTO_setTipo_18644406917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3517;
     Object enum7;

    public ArtistaDTO_setTipo_18644406917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3518 = new Long(-2585684163342970173L);
        Class<? extends Object> term3566 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term3565 = ((Class) term3566).getDeclaredField((String) "DUPLA");
        ((Field) term3565).setAccessible(true);
        Object enum6 = ((Field) term3565).get((Object) null);
        term3517 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term3517, term3517.getClass(), "id", term3518);
        setField(term3517, term3517.getClass(), "nome", "swZVeJAxjt");
        setField(term3517, term3517.getClass(), "tipo", enum6);
        Class<? extends Object> term3768 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term3767 = ((Class) term3768).getDeclaredField((String) "SOLO");
        ((Field) term3767).setAccessible(true);
        enum7 = ((Field) term3767).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.enums.TipoArtista");
        Object[] args = new Object[1];
        args[0] = enum7;
        callMethod(klass, "setTipo", argTypes, term3517, args);
    }

};


