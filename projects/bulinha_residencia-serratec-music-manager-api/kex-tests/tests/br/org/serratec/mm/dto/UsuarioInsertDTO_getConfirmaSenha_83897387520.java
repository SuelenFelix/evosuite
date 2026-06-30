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

public class UsuarioInsertDTO_getConfirmaSenha_83897387520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8729;

    public UsuarioInsertDTO_getConfirmaSenha_83897387520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8729 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term8729, term8729.getClass(), "nome", null);
        setField(term8729, term8729.getClass(), "email", null);
        setField(term8729, term8729.getClass(), "perfilUsuario", null);
        setField(term8729, term8729.getClass(), "senha", null);
        setField(term8729, term8729.getClass(), "confirmaSenha", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmaSenha", argTypes, term8729, args);
    }

};


