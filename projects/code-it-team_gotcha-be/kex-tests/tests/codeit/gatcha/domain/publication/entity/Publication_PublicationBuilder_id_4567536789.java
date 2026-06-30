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

public class Publication_PublicationBuilder_id_4567536789 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term866;

    public Publication_PublicationBuilder_id_4567536789() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term866 = newInstance(Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder"));
        setField(term866, term866.getClass(), "id", null);
        setField(term866, term866.getClass(), "gatchaUser", null);
        setField(term866, term866.getClass(), "publicationDate", null);
        setBooleanField(term866, term866.getClass(), "published", false);
        setField(term866, term866.getClass(), "linkUniqueString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.domain.publication.entity.Publication$PublicationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term866, args);
    }

};


