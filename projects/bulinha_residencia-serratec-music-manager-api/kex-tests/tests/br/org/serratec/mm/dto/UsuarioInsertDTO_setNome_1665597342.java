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

public class UsuarioInsertDTO_setNome_1665597342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7612;

    public UsuarioInsertDTO_setNome_1665597342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7612 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term7612, term7612.getClass(), "nome", "NFlvfJCVPO");
        setField(term7612, term7612.getClass(), "email", "KarbTXFmUU");
        setField(term7612, term7612.getClass(), "perfilUsuario", "jiUSjqwSIQ");
        setField(term7612, term7612.getClass(), "senha", "MgLCedQfoj");
        setField(term7612, term7612.getClass(), "confirmaSenha", "zgKiINdgNu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zLMTXDQHYH";
        callMethod(klass, "setNome", argTypes, term7612, args);
    }

};


