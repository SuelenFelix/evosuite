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

public class GitlabProjectResponse_getCreatedAt_52083223049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35614;

    public GitlabProjectResponse_getCreatedAt_52083223049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35614 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term35614, term35614.getClass(), "id", null);
        setField(term35614, term35614.getClass(), "description", null);
        setField(term35614, term35614.getClass(), "name", null);
        setField(term35614, term35614.getClass(), "nameWithNamespace", null);
        setField(term35614, term35614.getClass(), "path", null);
        setField(term35614, term35614.getClass(), "pathWithNamespace", null);
        setField(term35614, term35614.getClass(), "createdAt", null);
        setField(term35614, term35614.getClass(), "defaultBranch", null);
        setField(term35614, term35614.getClass(), "sshUrlToRepo", null);
        setField(term35614, term35614.getClass(), "httpUrlToRepo", null);
        setField(term35614, term35614.getClass(), "webUrl", null);
        setField(term35614, term35614.getClass(), "readmeUrl", null);
        setField(term35614, term35614.getClass(), "avatarUrl", null);
        setField(term35614, term35614.getClass(), "forksCount", null);
        setField(term35614, term35614.getClass(), "starCount", null);
        setField(term35614, term35614.getClass(), "lastActivityAt", null);
        setField(term35614, term35614.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term35614, args);
    }

};


