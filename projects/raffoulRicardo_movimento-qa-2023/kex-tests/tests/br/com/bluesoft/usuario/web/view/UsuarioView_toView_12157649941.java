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
import java.util.LinkedList;
import java.lang.Object;

public class UsuarioView_toView_12157649941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;

    public UsuarioView_toView_12157649941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term114 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term76, term76.getClass(), "id", 1162663216);
        setField(term76, term76.getClass(), "nome", "xxtlPwDYFs");
        setField(term76, term76.getClass(), "cpf", "jJCZpVmanW");
        setField(term76, term76.getClass(), "celular", "EGtDIRbSSb");
        setIntField(term114, term114.getClass(), "year", 2016);
        setShortField(term114, term114.getClass(), "month", (short) 11);
        setShortField(term114, term114.getClass(), "day", (short) 29);
        setField(term76, term76.getClass(), "dataNascimento", term114);
        Object term119 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term124 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term119, term119.getClass(), "id", 1484323161);
        setField(term119, term119.getClass(), "nome", "");
        setField(term119, term119.getClass(), "cpf", "");
        setField(term119, term119.getClass(), "celular", "");
        setIntField(term124, term124.getClass(), "year", 2021);
        setShortField(term124, term124.getClass(), "month", (short) 1);
        setShortField(term124, term124.getClass(), "day", (short) 18);
        setField(term119, term119.getClass(), "dataNascimento", term124);
        Object term129 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        setIntField(term129, term129.getClass(), "id", 391863371);
        setField(term129, term129.getClass(), "nome", null);
        setField(term129, term129.getClass(), "cpf", null);
        setField(term129, term129.getClass(), "celular", null);
        setField(term129, term129.getClass(), "dataNascimento", null);
        term73 = new LinkedList();
        ((LinkedList) term73).add(term76);
        ((LinkedList) term73).add(term119);
        ((LinkedList) term73).add(term129);
        ((LinkedList) term73).add((Object)null);
        ((LinkedList) term73).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.web.view.UsuarioView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term73;
        callMethod(klass, "toView", argTypes, null, args);
    }

};


