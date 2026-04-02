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

public class ArtistaDTO_setTipo_186444069115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3971;

    public ArtistaDTO_setTipo_186444069115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3971 = newInstance(Class.forName("br.org.serratec.mm.dto.ArtistaDTO"));
        setField(term3971, term3971.getClass(), "id", null);
        setField(term3971, term3971.getClass(), "nome", null);
        setField(term3971, term3971.getClass(), "tipo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.ArtistaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.enums.TipoArtista");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTipo", argTypes, term3971, args);
    }

};


