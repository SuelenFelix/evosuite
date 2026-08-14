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

public class GitlabNameSpaceResponse_getParentId_205778938311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1461;

    public GitlabNameSpaceResponse_getParentId_205778938311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1462 = new Integer(-6029667);
        Integer term1512 = new Integer(-2068769794);
        term1461 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1461, term1461.getClass(), "id", term1462);
        setField(term1461, term1461.getClass(), "name", "fhkbdRViHi");
        setField(term1461, term1461.getClass(), "path", "uWHnvSvaPl");
        setField(term1461, term1461.getClass(), "kind", "kBdSllIBVz");
        setField(term1461, term1461.getClass(), "fullPath", "TJmVBGfTML");
        setField(term1461, term1461.getClass(), "parentId", term1512);
        setField(term1461, term1461.getClass(), "avatarUrl", "tPlsykYBqO");
        setField(term1461, term1461.getClass(), "webUrl", "bLPjGVBhlX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentId", argTypes, term1461, args);
    }

};


