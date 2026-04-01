package codeit.gatcha.api.security.entity;

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
import static codeit.gatcha.api.security.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ConfirmationToken_getCreatedDate_1975996313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public ConfirmationToken_getCreatedDate_1975996313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term297 = new Integer(-817164822);
        Integer term314 = new Integer(-1016503459);
        Integer term317 = new Integer(-1968847291);
        HashMap term332 = new HashMap();
        Set<Object> term382 =  ((Map) term332).keySet();
        HashSet term331 = new HashSet((Collection<? extends Object>) term382);
        term296 = newInstance(Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken"));
        Object term311 = newInstance(Class.forName("java.util.Date"));
        Object term313 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term316 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term296, term296.getClass(), "id", term297);
        setField(term296, term296.getClass(), "confirmationToken", "IgRJUzaCwW");
        setLongField(term311, term311.getClass(), "fastTime", 1610940182830L);
        setField(term311, term311.getClass(), "cdate", null);
        setField(term296, term296.getClass(), "createdDate", term311);
        setField(term313, term313.getClass(), "id", term314);
        setField(term316, term316.getClass(), "id", term317);
        setField(term316, term316.getClass(), "role", "JUmudUmaaV");
        setField(term316, term316.getClass(), "users", term331);
        setField(term313, term313.getClass(), "authority", term316);
        setField(term313, term313.getClass(), "email", "XqgfKFvPSD");
        setField(term313, term313.getClass(), "password", "JiVRgTZvKc");
        setBooleanField(term313, term313.getClass(), "enabled", true);
        setField(term296, term296.getClass(), "user", term313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.security.entity.ConfirmationToken");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term296, args);
    }

};


