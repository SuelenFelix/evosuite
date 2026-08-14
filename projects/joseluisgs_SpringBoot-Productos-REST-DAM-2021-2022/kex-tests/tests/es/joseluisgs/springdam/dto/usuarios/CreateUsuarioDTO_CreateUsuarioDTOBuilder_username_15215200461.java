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

public class CreateUsuarioDTO_CreateUsuarioDTOBuilder_username_15215200461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CreateUsuarioDTO_CreateUsuarioDTOBuilder_username_15215200461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder"));
        setField(term1, term1.getClass(), "username", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "avatar", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "fullname", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "email", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "password", "jJCZpVmanW");
        setField(term1, term1.getClass(), "password2", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        callMethod(klass, "username", argTypes, term1, args);
    }

};


