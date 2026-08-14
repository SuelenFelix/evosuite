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

public class GetUsuarioDTO_GetUsuarioDTOBuilder_email_16256939124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4696;

    public GetUsuarioDTO_GetUsuarioDTOBuilder_email_16256939124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4746 = new HashMap();
        Set<Object> term4810 =  ((Map) term4746).keySet();
        HashSet term4745 = new HashSet((Collection<? extends Object>) term4810);
        term4696 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder"));
        setField(term4696, term4696.getClass(), "username", "CKWpJaaaxX");
        setField(term4696, term4696.getClass(), "avatar", "UBRmXJmfrt");
        setField(term4696, term4696.getClass(), "fullName", "WZzvmIHhzZ");
        setField(term4696, term4696.getClass(), "email", "doQLHkjpNm");
        setField(term4696, term4696.getClass(), "roles", term4745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sNQFlATEeQ";
        callMethod(klass, "email", argTypes, term4696, args);
    }

};


