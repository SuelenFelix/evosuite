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

public class GitlabNameSpaceResponse_setAvatarUrl_141228622415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1969;

    public GitlabNameSpaceResponse_setAvatarUrl_141228622415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1970 = new Integer(-203030934);
        Integer term2020 = new Integer(-1179120542);
        term1969 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1969, term1969.getClass(), "id", term1970);
        setField(term1969, term1969.getClass(), "name", "JiVRgTZvKc");
        setField(term1969, term1969.getClass(), "path", "XPKmummaqg");
        setField(term1969, term1969.getClass(), "kind", "BKLfkLiZTH");
        setField(term1969, term1969.getClass(), "fullPath", "SPpkrGcPRr");
        setField(term1969, term1969.getClass(), "parentId", term2020);
        setField(term1969, term1969.getClass(), "avatarUrl", "sEccwbJKYE");
        setField(term1969, term1969.getClass(), "webUrl", "AWRooQKkdW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setAvatarUrl", argTypes, term1969, args);
    }

};


