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

public class UsuarioUpdateDTO_setSenha_87830003419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228;

    public UsuarioUpdateDTO_setSenha_87830003419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1228 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO"));
        setField(term1228, term1228.getClass(), "nome", null);
        setField(term1228, term1228.getClass(), "email", null);
        setField(term1228, term1228.getClass(), "perfilUsuario", null);
        setField(term1228, term1228.getClass(), "senha", null);
        setField(term1228, term1228.getClass(), "confirmaSenha", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSenha", argTypes, term1228, args);
    }

};


