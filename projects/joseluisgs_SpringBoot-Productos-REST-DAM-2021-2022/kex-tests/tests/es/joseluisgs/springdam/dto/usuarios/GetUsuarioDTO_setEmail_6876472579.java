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

public class GetUsuarioDTO_setEmail_6876472579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2101;

    public GetUsuarioDTO_setEmail_6876472579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2151 = new HashMap();
        Set<Object> term2221 =  ((Map) term2151).keySet();
        HashSet term2150 = new HashSet((Collection<? extends Object>) term2221);
        term2101 = newInstance(Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO"));
        setField(term2101, term2101.getClass(), "username", "dpNsDgfPso");
        setField(term2101, term2101.getClass(), "avatar", "hCWPJQKpdc");
        setField(term2101, term2101.getClass(), "fullName", "WzMEhMXkKx");
        setField(term2101, term2101.getClass(), "email", "XOiDvlDhdc");
        setField(term2101, term2101.getClass(), "roles", term2150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.dto.usuarios.GetUsuarioDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setEmail", argTypes, term2101, args);
    }

};


