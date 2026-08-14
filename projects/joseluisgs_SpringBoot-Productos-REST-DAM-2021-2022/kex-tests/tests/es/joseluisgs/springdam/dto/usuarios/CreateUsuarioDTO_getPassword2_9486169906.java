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

public class CreateUsuarioDTO_getPassword2_9486169906 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3109;

    public CreateUsuarioDTO_getPassword2_9486169906() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3109 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO"));
        setField(term3109, term3109.getClass(), "username", "rLHAoqXgPh");
        setField(term3109, term3109.getClass(), "avatar", "zUlRdimJtU");
        setField(term3109, term3109.getClass(), "fullname", "vwbEQQNQrx");
        setField(term3109, term3109.getClass(), "email", "xtftXXMbem");
        setField(term3109, term3109.getClass(), "password", "cudZvLMQon");
        setField(term3109, term3109.getClass(), "password2", "lihXWlGDxk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.CreateUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword2", argTypes, term3109, args);
    }

};


