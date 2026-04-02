package br.com.bluesoft.usuario.web.view;

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
import static br.com.bluesoft.usuario.web.view.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsuarioView_getId_2679781899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term658;

    public UsuarioView_getId_2679781899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term658 = newInstance(Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView"));
        setIntField(term658, term658.getClass(), "id", 0);
        setField(term658, term658.getClass(), "nome", null);
        setField(term658, term658.getClass(), "cpf", null);
        setField(term658, term658.getClass(), "celular", null);
        setField(term658, term658.getClass(), "dataNascimento", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term658, args);
    }

};


