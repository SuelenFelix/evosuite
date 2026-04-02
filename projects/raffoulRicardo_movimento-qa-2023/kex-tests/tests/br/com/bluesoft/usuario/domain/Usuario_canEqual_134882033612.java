package br.com.bluesoft.usuario.domain;

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
import static br.com.bluesoft.usuario.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Usuario_canEqual_134882033612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866;
     Object term908;

    public Usuario_canEqual_134882033612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term866 = newInstance(Class.forName("br.com.bluesoft.usuario.domain.Usuario"));
        Object term904 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term866, term866.getClass(), "id", 1134449235);
        setField(term866, term866.getClass(), "nome", "xrwlQZdwCp");
        setField(term866, term866.getClass(), "cpf", "IDCWpPLRkE");
        setField(term866, term866.getClass(), "celular", "nyiiPDVjAc");
        setIntField(term904, term904.getClass(), "year", 2025);
        setShortField(term904, term904.getClass(), "month", (short) 4);
        setShortField(term904, term904.getClass(), "day", (short) 23);
        setField(term866, term866.getClass(), "dataNascimento", term904);
        term908 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.com.bluesoft.usuario.domain.Usuario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term908;
        callMethod(klass, "canEqual", argTypes, term866, args);
    }

};


