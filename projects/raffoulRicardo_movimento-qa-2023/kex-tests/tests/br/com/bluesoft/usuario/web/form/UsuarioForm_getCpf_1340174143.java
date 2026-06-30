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

public class UsuarioForm_getCpf_1340174143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public UsuarioForm_getCpf_1340174143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term180 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term143, term143.getClass(), "nome", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "cpf", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "celular", "hRNSzYYIrc");
        setIntField(term180, term180.getClass(), "year", 2021);
        setShortField(term180, term180.getClass(), "month", (short) 1);
        setShortField(term180, term180.getClass(), "day", (short) 18);
        setField(term143, term143.getClass(), "dataNascimento", term180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpf", argTypes, term143, args);
    }

};


