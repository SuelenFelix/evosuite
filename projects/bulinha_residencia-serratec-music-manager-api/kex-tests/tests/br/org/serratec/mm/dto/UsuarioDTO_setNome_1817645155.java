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

public class UsuarioDTO_setNome_1817645155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6044;

    public UsuarioDTO_setNome_1817645155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6045 = new Long(4795660804170399986L);
        term6044 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term6044, term6044.getClass(), "id", term6045);
        setField(term6044, term6044.getClass(), "nome", "ywmcuThdfL");
        setField(term6044, term6044.getClass(), "email", "GBOEuByOfr");
        setField(term6044, term6044.getClass(), "perfilUsuario", "NHbOFFjyVK");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zaloBqlrSo";
        callMethod(klass, "setNome", argTypes, term6044, args);
    }

};


