package codeit.gatcha.api.DTO.Publication;

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
import static codeit.gatcha.api.DTO.Publication.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PublicationLinkDTO_getPublicationDate_6678718573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;

    public PublicationLinkDTO_getPublicationDate_6678718573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("codeit.gatcha.api.DTO.Publication.PublicationLinkDTO"));
        setField(term198, term198.getClass(), "link", "OWDIEULEFu");
        setField(term198, term198.getClass(), "publicationDate", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("codeit.gatcha.api.DTO.Publication.PublicationLinkDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublicationDate", argTypes, term198, args);
    }

};


