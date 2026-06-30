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

public class UsuarioUpdateDTO_setSenha_8783000348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844;

    public UsuarioUpdateDTO_setSenha_8783000348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO"));
        setField(term844, term844.getClass(), "nome", "nyiiPDVjAc");
        setField(term844, term844.getClass(), "email", "aKnKipADSo");
        setField(term844, term844.getClass(), "perfilUsuario", "wSQxaModmm");
        setField(term844, term844.getClass(), "senha", "UlajhuVLaP");
        setField(term844, term844.getClass(), "confirmaSenha", "gGSMzuGICf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hxCBltsObl";
        callMethod(klass, "setSenha", argTypes, term844, args);
    }

};


