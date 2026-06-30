package br.com.bluesoft.usuario.web.form;

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
import static br.com.bluesoft.usuario.web.form.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsuarioForm_getCpf_13401741417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term998;

    public UsuarioForm_getCpf_13401741417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term998 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        setField(term998, term998.getClass(), "nome", null);
        setField(term998, term998.getClass(), "cpf", null);
        setField(term998, term998.getClass(), "celular", null);
        setField(term998, term998.getClass(), "dataNascimento", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term998, args);
    }

};


