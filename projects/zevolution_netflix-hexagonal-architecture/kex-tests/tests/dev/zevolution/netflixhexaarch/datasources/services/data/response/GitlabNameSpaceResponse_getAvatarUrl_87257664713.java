package dev.zevolution.netflixhexaarch.datasources.services.data.response;

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
import static dev.zevolution.netflixhexaarch.datasources.services.data.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class GitlabNameSpaceResponse_getAvatarUrl_87257664713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1737;

    public GitlabNameSpaceResponse_getAvatarUrl_87257664713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1738 = new Integer(590364439);
        Integer term1788 = new Integer(865208305);
        term1737 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1737, term1737.getClass(), "id", term1738);
        setField(term1737, term1737.getClass(), "name", "oVgzLbrsFr");
        setField(term1737, term1737.getClass(), "path", "vQVyKLdtaz");
        setField(term1737, term1737.getClass(), "kind", "OWKQODBLzb");
        setField(term1737, term1737.getClass(), "fullPath", "wGmYcqUkgE");
        setField(term1737, term1737.getClass(), "parentId", term1788);
        setField(term1737, term1737.getClass(), "avatarUrl", "idgaQsnJpQ");
        setField(term1737, term1737.getClass(), "webUrl", "VgZnGoIFwQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term1737, args);
    }

};


