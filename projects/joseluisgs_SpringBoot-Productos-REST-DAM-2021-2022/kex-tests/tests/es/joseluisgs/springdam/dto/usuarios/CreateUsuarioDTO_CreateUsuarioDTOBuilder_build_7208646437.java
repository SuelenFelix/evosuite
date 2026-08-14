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

public class CreateUsuarioDTO_CreateUsuarioDTOBuilder_build_7208646437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term931;

    public CreateUsuarioDTO_CreateUsuarioDTOBuilder_build_7208646437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term931 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder"));
        setField(term931, term931.getClass(), "username", "gGSMzuGICf");
        setField(term931, term931.getClass(), "avatar", "hxCBltsObl");
        setField(term931, term931.getClass(), "fullname", "BndsHwAFMv");
        setField(term931, term931.getClass(), "email", "GzFkzHGYFt");
        setField(term931, term931.getClass(), "password", "tShwQLRGNe");
        setField(term931, term931.getClass(), "password2", "LvtrsXUliU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term931, args);
    }

};


