package codeit.gatcha.domain.user.entity;

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
import static codeit.gatcha.domain.user.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Authority_AuthorityBuilder_id_7690458421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term1291;

    public Authority_AuthorityBuilder_id_7690458421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1260 = new Integer(-916584829);
        HashMap term1275 = new HashMap();
        Set<Object> term1303 =  ((Map) term1275).keySet();
        HashSet term1274 = new HashSet((Collection<? extends Object>) term1303);
        term1259 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder"));
        setField(term1259, term1259.getClass(), "id", term1260);
        setField(term1259, term1259.getClass(), "role", "TSyCeEZPaT");
        setField(term1259, term1259.getClass(), "users", term1274);
        term1291 = new Integer(-1022990421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term1291;
        callMethod(klass, "id", argTypes, term1259, args);
    }

};


