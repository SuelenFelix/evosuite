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

public class UsuarioDTO_getPerfilUsuario_5632492148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6295;

    public UsuarioDTO_getPerfilUsuario_5632492148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6296 = new Long(-6673920710396545553L);
        term6295 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term6295, term6295.getClass(), "id", term6296);
        setField(term6295, term6295.getClass(), "nome", "iCCsaLHohG");
        setField(term6295, term6295.getClass(), "email", "NJhGgctbdj");
        setField(term6295, term6295.getClass(), "perfilUsuario", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerfilUsuario", argTypes, term6295, args);
    }

};


