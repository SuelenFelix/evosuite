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
import java.lang.Object;

public class UsuarioForm_setCelular_7384378258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542;

    public UsuarioForm_setCelular_7384378258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term579 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term542, term542.getClass(), "nome", "eZFUvlxvGV");
        setField(term542, term542.getClass(), "cpf", "BYqFIqCKAV");
        setField(term542, term542.getClass(), "celular", "vrQLuWIDJX");
        setIntField(term579, term579.getClass(), "year", 2017);
        setShortField(term579, term579.getClass(), "month", (short) 5);
        setShortField(term579, term579.getClass(), "day", (short) 21);
        setField(term542, term542.getClass(), "dataNascimento", term579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setCelular", argTypes, term542, args);
    }

};


