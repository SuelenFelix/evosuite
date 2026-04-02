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

public class UsuarioInsertDTO_setConfirmaSenha_201555342110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8588;

    public UsuarioInsertDTO_setConfirmaSenha_201555342110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8588 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term8588, term8588.getClass(), "nome", "GGzwMoHZXC");
        setField(term8588, term8588.getClass(), "email", "IpmgwHTgnG");
        setField(term8588, term8588.getClass(), "perfilUsuario", "tIpkeYIezR");
        setField(term8588, term8588.getClass(), "senha", "YkZtEtthvz");
        setField(term8588, term8588.getClass(), "confirmaSenha", "dwlZSxlXOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lKrEAkypza";
        callMethod(klass, "setConfirmaSenha", argTypes, term8588, args);
    }

};


