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

public class GitlabNameSpaceResponse_getParentId_205778938312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1556;

    public GitlabNameSpaceResponse_getParentId_205778938312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1557 = new Integer(-117576464);
        Integer term1607 = new Integer(-1007160944);
        term1556 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1556, term1556.getClass(), "id", term1557);
        setField(term1556, term1556.getClass(), "name", "wGmYcqUkgE");
        setField(term1556, term1556.getClass(), "path", "idgaQsnJpQ");
        setField(term1556, term1556.getClass(), "kind", "VgZnGoIFwQ");
        setField(term1556, term1556.getClass(), "fullPath", "jUbSRrkrYZ");
        setField(term1556, term1556.getClass(), "parentId", term1607);
        setField(term1556, term1556.getClass(), "avatarUrl", "bWWfajKbEX");
        setField(term1556, term1556.getClass(), "webUrl", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term1556, args);
    }

};


