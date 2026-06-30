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

public class UsuarioDTO_getId_3468818062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5835;

    public UsuarioDTO_getId_3468818062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5836 = new Long(4699157009689333952L);
        term5835 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term5835, term5835.getClass(), "id", term5836);
        setField(term5835, term5835.getClass(), "nome", "pvDEABOxLt");
        setField(term5835, term5835.getClass(), "email", "beAMpkroCQ");
        setField(term5835, term5835.getClass(), "perfilUsuario", "uSUvKAyuvd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term5835, args);
    }

};


