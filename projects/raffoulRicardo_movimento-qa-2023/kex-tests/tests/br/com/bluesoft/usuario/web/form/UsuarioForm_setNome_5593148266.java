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

public class UsuarioForm_setNome_5593148266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356;

    public UsuarioForm_setNome_5593148266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term393 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term356, term356.getClass(), "nome", "aJlieCFVtF");
        setField(term356, term356.getClass(), "cpf", "ZiaGIbnzTs");
        setField(term356, term356.getClass(), "celular", "tbcdzjIfER");
        setIntField(term393, term393.getClass(), "year", 2018);
        setShortField(term393, term393.getClass(), "month", (short) 1);
        setShortField(term393, term393.getClass(), "day", (short) 13);
        setField(term356, term356.getClass(), "dataNascimento", term393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HyxfbSQYBe";
        callMethod(klass, "setNome", argTypes, term356, args);
    }

};


