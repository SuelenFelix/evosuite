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
import java.lang.Integer;

public class MusicaDTO_setTitulo_7036845395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7390;

    public MusicaDTO_setTitulo_7036845395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7391 = new Long(5806367330808555223L);
        Integer term7405 = new Integer(-341962980);
        term7390 = newInstance(Class.forName("br.org.serratec.mm.dto.MusicaDTO"));
        setField(term7390, term7390.getClass(), "id", term7391);
        setField(term7390, term7390.getClass(), "titulo", "HpZXWDPhlg");
        setField(term7390, term7390.getClass(), "minutos", term7405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.MusicaDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lBOokzEPfe";
        callMethod(klass, "setTitulo", argTypes, term7390, args);
    }

};


