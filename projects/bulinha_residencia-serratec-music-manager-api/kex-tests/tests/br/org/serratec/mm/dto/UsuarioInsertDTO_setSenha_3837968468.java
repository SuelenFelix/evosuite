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

public class UsuarioInsertDTO_setSenha_3837968468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8344;

    public UsuarioInsertDTO_setSenha_3837968468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8344 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term8344, term8344.getClass(), "nome", "KAORSSPSeV");
        setField(term8344, term8344.getClass(), "email", "UimMMORkzd");
        setField(term8344, term8344.getClass(), "perfilUsuario", "huVIXUWLtI");
        setField(term8344, term8344.getClass(), "senha", "vhKzFyKPOT");
        setField(term8344, term8344.getClass(), "confirmaSenha", "nQhIgWXdRc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EusenEbIoF";
        callMethod(klass, "setSenha", argTypes, term8344, args);
    }

};


