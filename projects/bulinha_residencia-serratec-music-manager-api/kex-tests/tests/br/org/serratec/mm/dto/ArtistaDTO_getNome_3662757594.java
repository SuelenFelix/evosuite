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

public class ArtistaDTO_getNome_3662757594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2782;

    public ArtistaDTO_getNome_3662757594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2783 = new Long(-6573104506744284592L);
        Class<? extends Object> term2820 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term2819 = ((Class) term2820).getDeclaredField((String) "DUPLA");
        ((Field) term2819).setAccessible(true);
        Object enum3 = ((Field) term2819).get((Object) null);
        term2782 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term2782, term2782.getClass(), "id", term2783);
        setField(term2782, term2782.getClass(), "nome", "PHvxnGHptP");
        setField(term2782, term2782.getClass(), "tipo", enum3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term2782, args);
    }

};


