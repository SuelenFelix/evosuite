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

public class UsuarioUpdateDTO_getEmail_22228653314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1223;

    public UsuarioUpdateDTO_getEmail_22228653314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1223 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO"));
        setField(term1223, term1223.getClass(), "nome", null);
        setField(term1223, term1223.getClass(), "email", null);
        setField(term1223, term1223.getClass(), "perfilUsuario", null);
        setField(term1223, term1223.getClass(), "senha", null);
        setField(term1223, term1223.getClass(), "confirmaSenha", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term1223, args);
    }

};


