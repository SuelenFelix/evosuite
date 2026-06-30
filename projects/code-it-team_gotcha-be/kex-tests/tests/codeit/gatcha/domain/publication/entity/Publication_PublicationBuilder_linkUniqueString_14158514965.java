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

public class Publication_PublicationBuilder_linkUniqueString_14158514965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520;

    public Publication_PublicationBuilder_linkUniqueString_14158514965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term521 = new Integer(-1588772968);
        Integer term524 = new Integer(-93135961);
        Integer term527 = new Integer(-112921587);
        HashMap term542 = new HashMap();
        Set<Object> term609 =  ((Map) term542).keySet();
        HashSet term541 = new HashSet((Collection<? extends Object>) term609);
        term520 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term523 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term526 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term572 = newInstance(Class.forName("java.util.Date"));
        setField(term520, term520.getClass(), "id", term521);
        setField(term523, term523.getClass(), "id", term524);
        setField(term526, term526.getClass(), "id", term527);
        setField(term526, term526.getClass(), "role", "vjxIhXHxGR");
        setField(term526, term526.getClass(), "users", term541);
        setField(term523, term523.getClass(), "authority", term526);
        setField(term523, term523.getClass(), "email", "JDaAnsVTGV");
        setField(term523, term523.getClass(), "password", "mLUZFTfjle");
        setBooleanField(term523, term523.getClass(), "enabled", true);
        setField(term520, term520.getClass(), "gatchaUser", term523);
        setLongField(term572, term572.getClass(), "fastTime", 1515890130018L);
        setField(term572, term572.getClass(), "cdate", null);
        setField(term520, term520.getClass(), "publicationDate", term572);
        setBooleanField(term520, term520.getClass(), "published", true);
        setField(term520, term520.getClass(), "linkUniqueString", "xIeFjkHkOe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "linkUniqueString", argTypes, term520, args);
    }

};


