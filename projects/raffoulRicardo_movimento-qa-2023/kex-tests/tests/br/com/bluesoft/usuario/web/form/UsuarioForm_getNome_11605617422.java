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

public class UsuarioForm_getNome_11605617422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;

    public UsuarioForm_getNome_11605617422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term109 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term72, term72.getClass(), "nome", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "cpf", "jJCZpVmanW");
        setField(term72, term72.getClass(), "celular", "EGtDIRbSSb");
        setIntField(term109, term109.getClass(), "year", 2016);
        setShortField(term109, term109.getClass(), "month", (short) 11);
        setShortField(term109, term109.getClass(), "day", (short) 29);
        setField(term72, term72.getClass(), "dataNascimento", term109);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNome", argTypes, term72, args);
    }

};


