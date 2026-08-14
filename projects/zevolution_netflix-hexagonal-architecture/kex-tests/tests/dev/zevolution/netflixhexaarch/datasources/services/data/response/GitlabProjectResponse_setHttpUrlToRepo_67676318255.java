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

public class GitlabProjectResponse_setHttpUrlToRepo_67676318255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31047;

    public GitlabProjectResponse_setHttpUrlToRepo_67676318255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31047 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term31047, term31047.getClass(), "id", null);
        setField(term31047, term31047.getClass(), "description", null);
        setField(term31047, term31047.getClass(), "name", null);
        setField(term31047, term31047.getClass(), "nameWithNamespace", null);
        setField(term31047, term31047.getClass(), "path", null);
        setField(term31047, term31047.getClass(), "pathWithNamespace", null);
        setField(term31047, term31047.getClass(), "createdAt", null);
        setField(term31047, term31047.getClass(), "defaultBranch", null);
        setField(term31047, term31047.getClass(), "sshUrlToRepo", null);
        setField(term31047, term31047.getClass(), "httpUrlToRepo", null);
        setField(term31047, term31047.getClass(), "webUrl", null);
        setField(term31047, term31047.getClass(), "readmeUrl", null);
        setField(term31047, term31047.getClass(), "avatarUrl", null);
        setField(term31047, term31047.getClass(), "forksCount", null);
        setField(term31047, term31047.getClass(), "starCount", null);
        setField(term31047, term31047.getClass(), "lastActivityAt", null);
        setField(term31047, term31047.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHttpUrlToRepo", argTypes, term31047, args);
    }

};


