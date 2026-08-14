package es.joseluisgs.springdam.dto.usuarios;

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
import static es.joseluisgs.springdam.dto.usuarios.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateUsuarioDTO_setFullname_6637198819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3552;

    public CreateUsuarioDTO_setFullname_6637198819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3552 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term3552, term3552.getClass(), "username", "sZdUNdggUW");
        setField(term3552, term3552.getClass(), "avatar", "OqbwYQfvAe");
        setField(term3552, term3552.getClass(), "fullname", "tRxZafjqIx");
        setField(term3552, term3552.getClass(), "email", "DhjNLmRMCu");
        setField(term3552, term3552.getClass(), "password", "PgPzMSEjjX");
        setField(term3552, term3552.getClass(), "password2", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kGMQdqJYyB";
        callMethod(klass, "setFullname", argTypes, term3552, args);
    }

};


