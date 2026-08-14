package es.joseluisgs.springdam.config.security.jwt.model;

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
import static es.joseluisgs.springdam.config.security.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JwtUserResponse_JwtUserResponseBuilder_fullName_21154248223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709;

    public JwtUserResponse_JwtUserResponseBuilder_fullName_21154248223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term759 = new HashMap();
        Set<Object> term828 =  ((Map) term759).keySet();
        HashSet term758 = new HashSet((Collection<? extends Object>) term828);
        term709 = newInstance(Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder"));
        setField(term709, term709.getClass(), "username", "UiUYnPrcCi");
        setField(term709, term709.getClass(), "avatar", "UoYtihxVaS");
        setField(term709, term709.getClass(), "fullName", "JDswTTCZHV");
        setField(term709, term709.getClass(), "email", "onpbIeEKoi");
        setField(term709, term709.getClass(), "roles", term758);
        setField(term709, term709.getClass(), "token", "YRHGsAkhxb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("es.joseluisgs.springdam.config.security.jwt.model.JwtUserResponse$JwtUserResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ffYhPOzlUs";
        callMethod(klass, "fullName", argTypes, term709, args);
    }

};


