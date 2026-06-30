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

public class UsuarioDTO_setEmail_7123907487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6204;

    public UsuarioDTO_setEmail_7123907487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6205 = new Long(-8010214112439224349L);
        term6204 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term6204, term6204.getClass(), "id", term6205);
        setField(term6204, term6204.getClass(), "nome", "uPuCVuZYOI");
        setField(term6204, term6204.getClass(), "email", "TweMFhxNdj");
        setField(term6204, term6204.getClass(), "perfilUsuario", "NBrvVzvQHe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FjOiNAfBOc";
        callMethod(klass, "setEmail", argTypes, term6204, args);
    }

};


