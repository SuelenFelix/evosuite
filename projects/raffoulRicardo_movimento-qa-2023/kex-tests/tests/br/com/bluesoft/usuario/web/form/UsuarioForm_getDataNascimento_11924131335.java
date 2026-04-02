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

public class UsuarioForm_getDataNascimento_11924131335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public UsuarioForm_getDataNascimento_11924131335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term322 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term285, term285.getClass(), "nome", "MxlszYVzRf");
        setField(term285, term285.getClass(), "cpf", "LQFpaHEwXR");
        setField(term285, term285.getClass(), "celular", "oVcInYnLWB");
        setIntField(term322, term322.getClass(), "year", 2015);
        setShortField(term322, term322.getClass(), "month", (short) 9);
        setShortField(term322, term322.getClass(), "day", (short) 19);
        setField(term285, term285.getClass(), "dataNascimento", term322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataNascimento", argTypes, term285, args);
    }

};


