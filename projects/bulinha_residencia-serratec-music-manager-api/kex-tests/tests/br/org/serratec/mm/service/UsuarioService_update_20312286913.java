package br.org.serratec.mm.service;

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
import static br.org.serratec.mm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UsuarioService_update_20312286913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term116;

    public UsuarioService_update_20312286913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = new Long(6375119433582206027L);
        term116 = newInstance(Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO"));
        setField(term116, term116.getClass(), "nome", "EGtDIRbSSb");
        setField(term116, term116.getClass(), "email", "SzjVpOQTyS");
        setField(term116, term116.getClass(), "perfilUsuario", "MjGYSRKTNF");
        setField(term116, term116.getClass(), "senha", "hRNSzYYIrc");
        setField(term116, term116.getClass(), "confirmaSenha", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.org.serratec.mm.service.UsuarioService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("br.org.serratec.mm.dto.UsuarioUpdateDTO");
        Object[] args = new Object[2];
        args[0] = term114;
        args[1] = term116;
        callMethod(klass, "update", argTypes, null, args);
    }

};


