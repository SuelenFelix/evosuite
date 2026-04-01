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

public class Publication_PublicationBuilder_id_4567536781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term68;

    public Publication_PublicationBuilder_id_4567536781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2 = new Integer(568599855);
        Integer term5 = new Integer(1162663216);
        Integer term8 = new Integer(1484323161);
        HashMap term23 = new HashMap();
        Set<Object> term80 =  ((Map) term23).keySet();
        HashSet term22 = new HashSet((Collection<? extends Object>) term80);
        term1 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        Object term4 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.GatchaUser"));
        Object term7 = newInstance(Class.forName("codeit.gatcha.domain.user.entity.Authority"));
        Object term53 = newInstance(Class.forName("java.util.Date"));
        setField(term1, term1.getClass(), "id", term2);
        setField(term4, term4.getClass(), "id", term5);
        setField(term7, term7.getClass(), "id", term8);
        setField(term7, term7.getClass(), "role", "PAEBtnZtTD");
        setField(term7, term7.getClass(), "users", term22);
        setField(term4, term4.getClass(), "authority", term7);
        setField(term4, term4.getClass(), "email", "eZFUvlxvGV");
        setField(term4, term4.getClass(), "password", "BYqFIqCKAV");
        setBooleanField(term4, term4.getClass(), "enabled", true);
        setField(term1, term1.getClass(), "gatchaUser", term4);
        setLongField(term53, term53.getClass(), "fastTime", 1345871412244L);
        setField(term53, term53.getClass(), "cdate", null);
        setField(term1, term1.getClass(), "publicationDate", term53);
        setBooleanField(term1, term1.getClass(), "published", false);
        setField(term1, term1.getClass(), "linkUniqueString", "vrQLuWIDJX");
        term68 = new Integer(-1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term68;
        callMethod(klass, "id", argTypes, term1, args);
    }

};


