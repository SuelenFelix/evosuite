package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsuarioService_insert_5057883892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public UsuarioService_insert_5057883892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term3, term3.getClass(), "nome", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "email", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "perfilUsuario", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "senha", "xxtlPwDYFs");
        setField(term3, term3.getClass(), "confirmaSenha", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.UsuarioService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "insert", argTypes, null, args);
    }

};


