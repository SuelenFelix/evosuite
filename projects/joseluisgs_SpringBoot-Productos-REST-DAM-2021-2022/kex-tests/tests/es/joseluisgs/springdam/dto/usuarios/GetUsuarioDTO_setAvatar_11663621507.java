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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GetUsuarioDTO_setAvatar_11663621507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1849;

    public GetUsuarioDTO_setAvatar_11663621507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1899 = new HashMap();
        Set<Object> term1961 =  ((Map) term1899).keySet();
        HashSet term1898 = new HashSet((Collection<? extends Object>) term1961);
        term1849 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term1849, term1849.getClass(), "username", "AWRooQKkdW");
        setField(term1849, term1849.getClass(), "avatar", "vjxIhXHxGR");
        setField(term1849, term1849.getClass(), "fullName", "QXzGXbEXMu");
        setField(term1849, term1849.getClass(), "email", "qxSDVejjiY");
        setField(term1849, term1849.getClass(), "roles", term1898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "setAvatar", argTypes, term1849, args);
    }

};


