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

public class GitlabProjectResponse_getPath_175650339645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35610;

    public GitlabProjectResponse_getPath_175650339645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35610 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term35610, term35610.getClass(), "id", null);
        setField(term35610, term35610.getClass(), "description", null);
        setField(term35610, term35610.getClass(), "name", null);
        setField(term35610, term35610.getClass(), "nameWithNamespace", null);
        setField(term35610, term35610.getClass(), "path", null);
        setField(term35610, term35610.getClass(), "pathWithNamespace", null);
        setField(term35610, term35610.getClass(), "createdAt", null);
        setField(term35610, term35610.getClass(), "defaultBranch", null);
        setField(term35610, term35610.getClass(), "sshUrlToRepo", null);
        setField(term35610, term35610.getClass(), "httpUrlToRepo", null);
        setField(term35610, term35610.getClass(), "webUrl", null);
        setField(term35610, term35610.getClass(), "readmeUrl", null);
        setField(term35610, term35610.getClass(), "avatarUrl", null);
        setField(term35610, term35610.getClass(), "forksCount", null);
        setField(term35610, term35610.getClass(), "starCount", null);
        setField(term35610, term35610.getClass(), "lastActivityAt", null);
        setField(term35610, term35610.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPath", argTypes, term35610, args);
    }

};


