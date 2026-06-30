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

public class UsuarioForm_setCpf_15073985987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449;

    public UsuarioForm_setCpf_15073985987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449 = newInstance(Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm"));
        Object term486 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term449, term449.getClass(), "nome", "pCTimMblYc");
        setField(term449, term449.getClass(), "cpf", "hNxWaHcfhY");
        setField(term449, term449.getClass(), "celular", "RkybSrpybU");
        setIntField(term486, term486.getClass(), "year", 2015);
        setShortField(term486, term486.getClass(), "month", (short) 4);
        setShortField(term486, term486.getClass(), "day", (short) 14);
        setField(term449, term449.getClass(), "dataNascimento", term486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.form.UsuarioForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setCpf", argTypes, term449, args);
    }

};


