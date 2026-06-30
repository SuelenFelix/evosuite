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

public class UsuarioInsertDTO_getConfirmaSenha_8389738759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8477;

    public UsuarioInsertDTO_getConfirmaSenha_8389738759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8477 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term8477, term8477.getClass(), "nome", "SScVQYSvWH");
        setField(term8477, term8477.getClass(), "email", "MnovcqFhCl");
        setField(term8477, term8477.getClass(), "perfilUsuario", "qYtAeLzOhW");
        setField(term8477, term8477.getClass(), "senha", "tJzmOfcUnY");
        setField(term8477, term8477.getClass(), "confirmaSenha", "TKlccZUpjz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmaSenha", argTypes, term8477, args);
    }

};


