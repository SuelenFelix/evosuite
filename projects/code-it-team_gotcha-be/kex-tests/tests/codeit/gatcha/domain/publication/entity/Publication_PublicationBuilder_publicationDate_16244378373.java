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

public class Publication_PublicationBuilder_publicationDate_16244378373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term300;
     Object term367;

    public Publication_PublicationBuilder_publicationDate_16244378373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term301 = new Integer(1876565163);
        Integer term304 = new Integer(-817164822);
        Integer term307 = new Integer(-1016503459);
        HashMap term322 = new HashMap();
        Set<Object> term379 =  ((Map) term322).keySet();
        HashSet term321 = new HashSet((Collection<? extends Object>) term379);
        term300 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term303 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term306 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term352 = newInstance(Class.forName("java.util.Date"));
        setField(term300, term300.getClass(), "id", term301);
        setField(term303, term303.getClass(), "id", term304);
        setField(term306, term306.getClass(), "id", term307);
        setField(term306, term306.getClass(), "role", "bLPjGVBhlX");
        setField(term306, term306.getClass(), "users", term321);
        setField(term303, term303.getClass(), "authority", term306);
        setField(term303, term303.getClass(), "email", "KoyGrUJeJW");
        setField(term303, term303.getClass(), "password", "HqBOwkVqjD");
        setBooleanField(term303, term303.getClass(), "enabled", true);
        setField(term300, term300.getClass(), "gatchaUser", term303);
        setLongField(term352, term352.getClass(), "fastTime", 1610940182830L);
        setField(term352, term352.getClass(), "cdate", null);
        setField(term300, term300.getClass(), "publicationDate", term352);
        setBooleanField(term300, term300.getClass(), "published", false);
        setField(term300, term300.getClass(), "linkUniqueString", "MAcUBcBckh");
        term367 = newInstance(Class.forName("java.util.Date"));
        setLongField(term367, term367.getClass(), "fastTime", 1606045635837L);
        setField(term367, term367.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term367;
        callMethod(klass, "publicationDate", argTypes, term300, args);
    }

};


