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

public class Publication_PublicationBuilder_toString_63190036315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term880;

    public Publication_PublicationBuilder_toString_63190036315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term880 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        setField(term880, term880.getClass(), "id", null);
        setField(term880, term880.getClass(), "gatchaUser", null);
        setField(term880, term880.getClass(), "publicationDate", null);
        setBooleanField(term880, term880.getClass(), "published", false);
        setField(term880, term880.getClass(), "linkUniqueString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term880, args);
    }

};


