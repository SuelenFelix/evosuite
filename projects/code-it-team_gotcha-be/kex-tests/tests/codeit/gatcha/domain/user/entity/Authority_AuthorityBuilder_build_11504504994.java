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

public class Authority_AuthorityBuilder_build_11504504994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1402;

    public Authority_AuthorityBuilder_build_11504504994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1403 = new Integer(1743224434);
        HashMap term1418 = new HashMap();
        Set<Object> term1438 =  ((Map) term1418).keySet();
        HashSet term1417 = new HashSet((Collection<? extends Object>) term1438);
        term1402 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder"));
        setField(term1402, term1402.getClass(), "id", term1403);
        setField(term1402, term1402.getClass(), "role", "TjWpyghUWN");
        setField(term1402, term1402.getClass(), "users", term1417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.entity.Authority$AuthorityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term1402, args);
    }

};


