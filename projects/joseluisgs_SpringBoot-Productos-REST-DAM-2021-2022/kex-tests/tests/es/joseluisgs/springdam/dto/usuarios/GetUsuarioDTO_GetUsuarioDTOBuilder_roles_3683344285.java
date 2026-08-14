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

public class GetUsuarioDTO_GetUsuarioDTOBuilder_roles_3683344285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4821;
     Object term4879;

    public GetUsuarioDTO_GetUsuarioDTOBuilder_roles_3683344285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4871 = new HashMap();
        Set<Object> term4925 =  ((Map) term4871).keySet();
        HashSet term4870 = new HashSet((Collection<? extends Object>) term4925);
        term4821 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder"));
        setField(term4821, term4821.getClass(), "username", "ZKMLioamsY");
        setField(term4821, term4821.getClass(), "avatar", "WVbxuoDBcn");
        setField(term4821, term4821.getClass(), "fullName", "pvDEABOxLt");
        setField(term4821, term4821.getClass(), "email", "beAMpkroCQ");
        setField(term4821, term4821.getClass(), "roles", term4870);
        HashMap term4880 = new HashMap();
        Set<Object> term4926 =  ((Map) term4880).keySet();
        term4879 = new HashSet((Collection<? extends Object>) term4926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO$GetUsuarioDTOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term4879;
        callMethod(klass, "roles", argTypes, term4821, args);
    }

};


