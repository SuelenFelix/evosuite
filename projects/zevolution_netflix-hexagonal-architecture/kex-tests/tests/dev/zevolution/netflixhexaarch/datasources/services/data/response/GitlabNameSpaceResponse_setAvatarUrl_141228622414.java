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

public class GitlabNameSpaceResponse_setAvatarUrl_141228622414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1874;

    public GitlabNameSpaceResponse_setAvatarUrl_141228622414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1875 = new Integer(-1275173084);
        Integer term1925 = new Integer(-244121226);
        term1874 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1874, term1874.getClass(), "id", term1875);
        setField(term1874, term1874.getClass(), "name", "jUbSRrkrYZ");
        setField(term1874, term1874.getClass(), "path", "bWWfajKbEX");
        setField(term1874, term1874.getClass(), "kind", "cAPeiZHKGJ");
        setField(term1874, term1874.getClass(), "fullPath", "LvJFtLBaxj");
        setField(term1874, term1874.getClass(), "parentId", term1925);
        setField(term1874, term1874.getClass(), "avatarUrl", "PHvxnGHptP");
        setField(term1874, term1874.getClass(), "webUrl", "TimdotUuNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "setAvatarUrl", argTypes, term1874, args);
    }

};


