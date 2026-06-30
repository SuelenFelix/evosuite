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

public class ArtistaDTO_getId_11884835182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2302;

    public ArtistaDTO_getId_11884835182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2303 = new Long(-872011222785455006L);
        Class<? extends Object> term2340 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term2339 = ((Class) term2340).getDeclaredField((String) "DUPLA");
        ((Field) term2339).setAccessible(true);
        Object enum1 = ((Field) term2339).get((Object) null);
        term2302 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term2302, term2302.getClass(), "id", term2303);
        setField(term2302, term2302.getClass(), "nome", "cAPeiZHKGJ");
        setField(term2302, term2302.getClass(), "tipo", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2302, args);
    }

};


