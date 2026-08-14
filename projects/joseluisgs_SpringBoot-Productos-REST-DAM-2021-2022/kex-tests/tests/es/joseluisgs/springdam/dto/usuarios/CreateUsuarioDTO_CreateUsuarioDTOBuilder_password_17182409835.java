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

public class CreateUsuarioDTO_CreateUsuarioDTOBuilder_password_17182409835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public CreateUsuarioDTO_CreateUsuarioDTOBuilder_password_17182409835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder"));
        setField(term621, term621.getClass(), "username", "IoAlmYsBwc");
        setField(term621, term621.getClass(), "avatar", "TEParAifyi");
        setField(term621, term621.getClass(), "fullname", "OWDIEULEFu");
        setField(term621, term621.getClass(), "email", "dWRymuLBtr");
        setField(term621, term621.getClass(), "password", "AijpHYOFuy");
        setField(term621, term621.getClass(), "password2", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO$CreateUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kuTXqwMtDB";
        callMethod(klass, "password", argTypes, term621, args);
    }

};


