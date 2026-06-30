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

public class UsuarioForm_toEntity_20847274260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public UsuarioForm_toEntity_20847274260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term1, term1.getClass(), "nome", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "cpf", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "celular", "MuLcgQHgqz");
        setIntField(term38, term38.getClass(), "year", 2012);
        setShortField(term38, term38.getClass(), "month", (short) 8);
        setShortField(term38, term38.getClass(), "day", (short) 25);
        setField(term1, term1.getClass(), "dataNascimento", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toEntity", argTypes, term1, args);
    }

};


