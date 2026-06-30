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

public class UsuarioForm_getCelular_730431994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214;

    public UsuarioForm_getCelular_730431994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term251 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term214, term214.getClass(), "nome", "RMFIsYGgne");
        setField(term214, term214.getClass(), "cpf", "NRdvgJlhkX");
        setField(term214, term214.getClass(), "celular", "uuaPigETmJ");
        setIntField(term251, term251.getClass(), "year", 2020);
        setShortField(term251, term251.getClass(), "month", (short) 11);
        setShortField(term251, term251.getClass(), "day", (short) 22);
        setField(term214, term214.getClass(), "dataNascimento", term251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCelular", argTypes, term214, args);
    }

};


