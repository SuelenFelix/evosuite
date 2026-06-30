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

public class ArtistaDTO_setNome_13536008095 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3021;

    public ArtistaDTO_setNome_13536008095() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3022 = new Long(-4920224193275732920L);
        Class<? extends Object> term3070 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term3069 = ((Class) term3070).getDeclaredField((String) "SOLO");
        ((Field) term3069).setAccessible(true);
        Object enum4 = ((Field) term3069).get((Object) null);
        term3021 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term3021, term3021.getClass(), "id", term3022);
        setField(term3021, term3021.getClass(), "nome", "TimdotUuNC");
        setField(term3021, term3021.getClass(), "tipo", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "setNome", argTypes, term3021, args);
    }

};


