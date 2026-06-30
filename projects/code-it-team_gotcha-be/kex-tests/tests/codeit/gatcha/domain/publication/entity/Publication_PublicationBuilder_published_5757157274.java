package codeit.gatcha.domain.publication.entity;

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
import static codeit.gatcha.domain.publication.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class Publication_PublicationBuilder_published_5757157274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410;
     Object term477;

    public Publication_PublicationBuilder_published_5757157274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term411 = new Integer(-14890619);
        Integer term414 = new Integer(1632125673);
        Integer term417 = new Integer(454281060);
        HashMap term432 = new HashMap();
        Set<Object> term489 =  ((Map) term432).keySet();
        HashSet term431 = new HashSet((Collection<? extends Object>) term489);
        term410 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term413 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term416 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term462 = newInstance(Class.forName("java.util.Date"));
        setField(term410, term410.getClass(), "id", term411);
        setField(term413, term413.getClass(), "id", term414);
        setField(term416, term416.getClass(), "id", term417);
        setField(term416, term416.getClass(), "role", "oVgzLbrsFr");
        setField(term416, term416.getClass(), "users", term431);
        setField(term413, term413.getClass(), "authority", term416);
        setField(term413, term413.getClass(), "email", "SPpkrGcPRr");
        setField(term413, term413.getClass(), "password", "sEccwbJKYE");
        setBooleanField(term413, term413.getClass(), "enabled", true);
        setField(term410, term410.getClass(), "gatchaUser", term413);
        setLongField(term462, term462.getClass(), "fastTime", 1442639565302L);
        setField(term462, term462.getClass(), "cdate", null);
        setField(term410, term410.getClass(), "publicationDate", term462);
        setBooleanField(term410, term410.getClass(), "published", false);
        setField(term410, term410.getClass(), "linkUniqueString", "AWRooQKkdW");
        term477 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term477;
        callMethod(klass, "published", argTypes, term410, args);
    }

};


