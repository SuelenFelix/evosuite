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

public class Publication_PublicationBuilder_gatchaUser_5955131162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term178;

    public Publication_PublicationBuilder_gatchaUser_5955131162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term112 = new Integer(-1456670397);
        Integer term115 = new Integer(1622346318);
        Integer term118 = new Integer(1048535127);
        HashMap term133 = new HashMap();
        Set<Object> term238 =  ((Map) term133).keySet();
        HashSet term132 = new HashSet((Collection<? extends Object>) term238);
        term111 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term114 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term117 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term163 = newInstance(Class.forName("java.util.Date"));
        setField(term111, term111.getClass(), "id", term112);
        setField(term114, term114.getClass(), "id", term115);
        setField(term117, term117.getClass(), "id", term118);
        setField(term117, term117.getClass(), "role", "flxyYxBRtu");
        setField(term117, term117.getClass(), "users", term132);
        setField(term114, term114.getClass(), "authority", term117);
        setField(term114, term114.getClass(), "email", "xLbjWUgOIL");
        setField(term114, term114.getClass(), "password", "jDtqGUpnZN");
        setBooleanField(term114, term114.getClass(), "enabled", true);
        setField(term111, term111.getClass(), "gatchaUser", term114);
        setLongField(term163, term163.getClass(), "fastTime", 1480438351369L);
        setField(term163, term163.getClass(), "cdate", null);
        setField(term111, term111.getClass(), "publicationDate", term163);
        setBooleanField(term111, term111.getClass(), "published", false);
        setField(term111, term111.getClass(), "linkUniqueString", "nGKItKLYNC");
        Integer term179 = new Integer(-73683645);
        Integer term182 = new Integer(-226514366);
        HashMap term197 = new HashMap();
        Set<Object> term279 =  ((Map) term197).keySet();
        HashSet term196 = new HashSet((Collection<? extends Object>) term279);
        term178 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term181 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        setField(term178, term178.getClass(), "id", term179);
        setField(term181, term181.getClass(), "id", term182);
        setField(term181, term181.getClass(), "role", "UiUYnPrcCi");
        setField(term181, term181.getClass(), "users", term196);
        setField(term178, term178.getClass(), "authority", term181);
        setField(term178, term178.getClass(), "email", "TJmVBGfTML");
        setField(term178, term178.getClass(), "password", "tPlsykYBqO");
        setBooleanField(term178, term178.getClass(), "enabled", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("codeit.gatcha.domain.user.entity.GatchaUser");
        Object[] args = new Object[1];
        args[0] = term178;
        callMethod(klass, "gatchaUser", argTypes, term111, args);
    }

};


