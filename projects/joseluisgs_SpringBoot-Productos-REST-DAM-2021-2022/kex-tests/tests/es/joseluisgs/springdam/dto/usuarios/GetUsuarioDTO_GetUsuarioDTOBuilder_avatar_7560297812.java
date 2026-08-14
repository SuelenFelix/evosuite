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

public class GetUsuarioDTO_GetUsuarioDTOBuilder_avatar_7560297812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4444;

    public GetUsuarioDTO_GetUsuarioDTOBuilder_avatar_7560297812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4494 = new HashMap();
        Set<Object> term4562 =  ((Map) term4494).keySet();
        HashSet term4493 = new HashSet((Collection<? extends Object>) term4562);
        term4444 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder"));
        setField(term4444, term4444.getClass(), "username", "XfRABIFVEp");
        setField(term4444, term4444.getClass(), "avatar", "MHGKyEnwKc");
        setField(term4444, term4444.getClass(), "fullName", "ShIELyuULw");
        setField(term4444, term4444.getClass(), "email", "IpQuOGMgmj");
        setField(term4444, term4444.getClass(), "roles", term4493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        callMethod(klass, "avatar", argTypes, term4444, args);
    }

};


