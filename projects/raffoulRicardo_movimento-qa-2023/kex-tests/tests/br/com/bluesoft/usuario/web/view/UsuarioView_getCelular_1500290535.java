package br.com.bluesoft.usuario.web.view;

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
import static br.com.bluesoft.usuario.web.view.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UsuarioView_getCelular_1500290535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476;

    public UsuarioView_getCelular_1500290535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476 = newInstance(Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView"));
        setIntField(term476, term476.getClass(), "id", -1339778481);
        setField(term476, term476.getClass(), "nome", "OWDIEULEFu");
        setField(term476, term476.getClass(), "cpf", "dWRymuLBtr");
        setField(term476, term476.getClass(), "celular", "AijpHYOFuy");
        setField(term476, term476.getClass(), "dataNascimento", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCelular", argTypes, term476, args);
    }

};


