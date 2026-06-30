package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class ArtistaService_insert_15575264242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term364;

    public ArtistaService_insert_15575264242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term365 = new Long(8428634514691209827L);
        Class<? extends Object> term437 = Class.forName((String) "br.org.serratec.mm.enums.TipoArtista");
        Field term436 = ((Class) term437).getDeclaredField((String) "BANDA");
        ((Field) term436).setAccessible(true);
        Object enum0 = ((Field) term436).get((Object) null);
        term364 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term364, term364.getClass(), "id", term365);
        setField(term364, term364.getClass(), "nome", "RkybSrpybU");
        setField(term364, term364.getClass(), "tipo", enum0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.ArtistaService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Object[] args = new Object[1];
        args[0] = term364;
        callMethod(klass, "insert", argTypes, null, args);
    }

};


