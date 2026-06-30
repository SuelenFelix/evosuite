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

public class UsuarioInsertDTO_getPerfilUsuario_2149249655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7989;

    public UsuarioInsertDTO_getPerfilUsuario_2149249655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7989 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO"));
        setField(term7989, term7989.getClass(), "nome", "oKwCDqywym");
        setField(term7989, term7989.getClass(), "email", "zjZYTddemL");
        setField(term7989, term7989.getClass(), "perfilUsuario", "QtrylgCLiF");
        setField(term7989, term7989.getClass(), "senha", "orEuhCStGM");
        setField(term7989, term7989.getClass(), "confirmaSenha", "HhEaSXWvrY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioInsertDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerfilUsuario", argTypes, term7989, args);
    }

};


