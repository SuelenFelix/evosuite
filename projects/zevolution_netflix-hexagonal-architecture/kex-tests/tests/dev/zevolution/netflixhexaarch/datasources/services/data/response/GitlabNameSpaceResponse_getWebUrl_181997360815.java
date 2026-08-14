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

public class GitlabNameSpaceResponse_getWebUrl_181997360815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2033;

    public GitlabNameSpaceResponse_getWebUrl_181997360815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2034 = new Integer(-203030934);
        Integer term2084 = new Integer(-1179120542);
        term2033 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term2033, term2033.getClass(), "id", term2034);
        setField(term2033, term2033.getClass(), "name", "jSpAteRute");
        setField(term2033, term2033.getClass(), "path", "swZVeJAxjt");
        setField(term2033, term2033.getClass(), "kind", "xOcJIiQQDu");
        setField(term2033, term2033.getClass(), "fullPath", "GVizqqzXpy");
        setField(term2033, term2033.getClass(), "parentId", term2084);
        setField(term2033, term2033.getClass(), "avatarUrl", "JqXGgAhZPl");
        setField(term2033, term2033.getClass(), "webUrl", "jiKYgYHqIS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebUrl", argTypes, term2033, args);
    }

};


