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

public class GetUsuarioDTO_GetUsuarioDTOBuilder_fullName_19824666983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4573;

    public GetUsuarioDTO_GetUsuarioDTOBuilder_fullName_19824666983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4623 = new HashMap();
        Set<Object> term4685 =  ((Map) term4623).keySet();
        HashSet term4622 = new HashSet((Collection<? extends Object>) term4685);
        term4573 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder"));
        setField(term4573, term4573.getClass(), "username", "UKAReurpHG");
        setField(term4573, term4573.getClass(), "avatar", "WVRMUmrljA");
        setField(term4573, term4573.getClass(), "fullName", "NTlKJDDWlk");
        setField(term4573, term4573.getClass(), "email", "vOuMEpOQAg");
        setField(term4573, term4573.getClass(), "roles", term4622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bxrCBbrrct";
        callMethod(klass, "fullName", argTypes, term4573, args);
    }

};


