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

public class UsuarioDTO_setId_7769235643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5904;
     Object term5943;

    public UsuarioDTO_setId_7769235643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5905 = new Long(-78240609295693193L);
        term5904 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioDTO"));
        setField(term5904, term5904.getClass(), "id", term5905);
        setField(term5904, term5904.getClass(), "nome", "onQLVONGuf");
        setField(term5904, term5904.getClass(), "email", "SOrEHbcbmn");
        setField(term5904, term5904.getClass(), "perfilUsuario", "bnsyeQXFdu");
        term5943 = new Long(3090901538358721367L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.dto.UsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term5943;
        callMethod(klass, "setId", argTypes, term5904, args);
    }

};


