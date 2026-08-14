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

public class GitlabNameSpaceResponse_getAvatarUrl_87257664714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1832;

    public GitlabNameSpaceResponse_getAvatarUrl_87257664714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1833 = new Integer(-1275173084);
        Integer term1883 = new Integer(-244121226);
        term1832 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1832, term1832.getClass(), "id", term1833);
        setField(term1832, term1832.getClass(), "name", "xOcJIiQQDu");
        setField(term1832, term1832.getClass(), "path", "GVizqqzXpy");
        setField(term1832, term1832.getClass(), "kind", "JqXGgAhZPl");
        setField(term1832, term1832.getClass(), "fullPath", "jiKYgYHqIS");
        setField(term1832, term1832.getClass(), "parentId", term1883);
        setField(term1832, term1832.getClass(), "avatarUrl", "DfISiziTgG");
        setField(term1832, term1832.getClass(), "webUrl", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term1832, args);
    }

};


