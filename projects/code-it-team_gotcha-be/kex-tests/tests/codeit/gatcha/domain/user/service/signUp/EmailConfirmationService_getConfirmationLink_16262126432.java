package codeit.gatcha.domain.user.service.signUp;

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
import static codeit.gatcha.domain.user.service.signUp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class EmailConfirmationService_getConfirmationLink_16262126432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270;

    public EmailConfirmationService_getConfirmationLink_16262126432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term271 = new Integer(679763016);
        Integer term288 = new Integer(1962444399);
        Integer term291 = new Integer(767834723);
        HashMap term306 = new HashMap();
        Set<Object> term356 =  ((Map) term306).keySet();
        HashSet term305 = new HashSet((Collection<? extends Object>) term356);
        term270 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term285 = newInstance(Class.forName("java.util.Date"));
        Object term287 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term290 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term270, term270.getClass(), "id", term271);
        setField(term270, term270.getClass(), "confirmationToken", "ieCtQFdkii");
        setLongField(term285, term285.getClass(), "fastTime", 1480438351369L);
        setField(term285, term285.getClass(), "cdate", null);
        setField(term270, term270.getClass(), "createdDate", term285);
        setField(term287, term287.getClass(), "id", term288);
        setField(term290, term290.getClass(), "id", term291);
        setField(term290, term290.getClass(), "role", "dEnhdmILtU");
        setField(term290, term290.getClass(), "users", term305);
        setField(term287, term287.getClass(), "authority", term290);
        setField(term287, term287.getClass(), "email", "LvJFtLBaxj");
        setField(term287, term287.getClass(), "password", "PHvxnGHptP");
        setBooleanField(term287, term287.getClass(), "enabled", true);
        setField(term270, term270.getClass(), "user", term287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.user.service.signUp.EmailConfirmationService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Object[] args = new Object[1];
        args[0] = term270;
        callMethod(klass, "getConfirmationLink", argTypes, null, args);
    }

};


