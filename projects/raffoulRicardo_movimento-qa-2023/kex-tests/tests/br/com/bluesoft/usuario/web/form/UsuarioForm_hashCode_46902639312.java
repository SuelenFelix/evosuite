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

public class UsuarioForm_hashCode_46902639312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term854;

    public UsuarioForm_hashCode_46902639312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term854 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term891 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term854, term854.getClass(), "nome", "xrwlQZdwCp");
        setField(term854, term854.getClass(), "cpf", "IDCWpPLRkE");
        setField(term854, term854.getClass(), "celular", "nyiiPDVjAc");
        setIntField(term891, term891.getClass(), "year", 2025);
        setShortField(term891, term891.getClass(), "month", (short) 4);
        setShortField(term891, term891.getClass(), "day", (short) 23);
        setField(term854, term854.getClass(), "dataNascimento", term891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term854, args);
    }

};


