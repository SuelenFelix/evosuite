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

public class UsuarioForm_canEqual_172187569711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782;
     Object term823;

    public UsuarioForm_canEqual_172187569711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term819 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term782, term782.getClass(), "nome", "SbAoxhfrkn");
        setField(term782, term782.getClass(), "cpf", "kuTXqwMtDB");
        setField(term782, term782.getClass(), "celular", "Ghbwtircqb");
        setIntField(term819, term819.getClass(), "year", 2020);
        setShortField(term819, term819.getClass(), "month", (short) 5);
        setShortField(term819, term819.getClass(), "day", (short) 14);
        setField(term782, term782.getClass(), "dataNascimento", term819);
        term823 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term823;
        callMethod(klass, "canEqual", argTypes, term782, args);
    }

};


