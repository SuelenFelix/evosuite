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

public class UsuarioInsertDTO_setPerfilUsuario_16553649656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8100;

    public UsuarioInsertDTO_setPerfilUsuario_16553649656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8100 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term8100, term8100.getClass(), "nome", "CVRGEomOth");
        setField(term8100, term8100.getClass(), "email", "vSeruUyNWX");
        setField(term8100, term8100.getClass(), "perfilUsuario", "UkKvaeJfEC");
        setField(term8100, term8100.getClass(), "senha", "WPxXsahPRq");
        setField(term8100, term8100.getClass(), "confirmaSenha", "IENRuqmwUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GsWxOwXvSu";
        callMethod(klass, "setPerfilUsuario", argTypes, term8100, args);
    }

};


