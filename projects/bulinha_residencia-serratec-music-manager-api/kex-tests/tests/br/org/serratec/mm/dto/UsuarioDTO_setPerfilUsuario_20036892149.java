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

public class UsuarioDTO_setPerfilUsuario_20036892149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6364;

    public UsuarioDTO_setPerfilUsuario_20036892149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6365 = new Long(3412644969878030772L);
        term6364 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term6364, term6364.getClass(), "id", term6365);
        setField(term6364, term6364.getClass(), "nome", "tsTGdgQYUL");
        setField(term6364, term6364.getClass(), "email", "TtGbVmKcnX");
        setField(term6364, term6364.getClass(), "perfilUsuario", "GJVkUrCVdD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zNdorvdUgu";
        callMethod(klass, "setPerfilUsuario", argTypes, term6364, args);
    }

};


