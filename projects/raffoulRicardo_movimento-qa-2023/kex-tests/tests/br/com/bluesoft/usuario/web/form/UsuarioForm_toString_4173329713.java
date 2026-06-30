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

public class UsuarioForm_toString_4173329713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term925;

    public UsuarioForm_toString_4173329713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term925 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term962 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term925, term925.getClass(), "nome", "aKnKipADSo");
        setField(term925, term925.getClass(), "cpf", "wSQxaModmm");
        setField(term925, term925.getClass(), "celular", "UlajhuVLaP");
        setIntField(term962, term962.getClass(), "year", 2012);
        setShortField(term962, term962.getClass(), "month", (short) 10);
        setShortField(term962, term962.getClass(), "day", (short) 1);
        setField(term925, term925.getClass(), "dataNascimento", term962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term925, args);
    }

};


