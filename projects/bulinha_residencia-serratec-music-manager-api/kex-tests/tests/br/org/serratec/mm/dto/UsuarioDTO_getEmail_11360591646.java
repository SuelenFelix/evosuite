package br.org.serratec.mm.dto;

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
import static br.org.serratec.mm.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UsuarioDTO_getEmail_11360591646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6135;

    public UsuarioDTO_getEmail_11360591646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6136 = new Long(-4030863184426321096L);
        term6135 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term6135, term6135.getClass(), "id", term6136);
        setField(term6135, term6135.getClass(), "nome", "vvoLrMGCoN");
        setField(term6135, term6135.getClass(), "email", "pXdglvyrQe");
        setField(term6135, term6135.getClass(), "perfilUsuario", "OcfNzHYdki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term6135, args);
    }

};


