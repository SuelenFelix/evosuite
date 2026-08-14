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

public class GitlabProjectResponse_getId_183886025736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31028;

    public GitlabProjectResponse_getId_183886025736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31028 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        setField(term31028, term31028.getClass(), "id", null);
        setField(term31028, term31028.getClass(), "description", null);
        setField(term31028, term31028.getClass(), "name", null);
        setField(term31028, term31028.getClass(), "nameWithNamespace", null);
        setField(term31028, term31028.getClass(), "path", null);
        setField(term31028, term31028.getClass(), "pathWithNamespace", null);
        setField(term31028, term31028.getClass(), "createdAt", null);
        setField(term31028, term31028.getClass(), "defaultBranch", null);
        setField(term31028, term31028.getClass(), "sshUrlToRepo", null);
        setField(term31028, term31028.getClass(), "httpUrlToRepo", null);
        setField(term31028, term31028.getClass(), "webUrl", null);
        setField(term31028, term31028.getClass(), "readmeUrl", null);
        setField(term31028, term31028.getClass(), "avatarUrl", null);
        setField(term31028, term31028.getClass(), "forksCount", null);
        setField(term31028, term31028.getClass(), "starCount", null);
        setField(term31028, term31028.getClass(), "lastActivityAt", null);
        setField(term31028, term31028.getClass(), "namespace", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term31028, args);
    }

};


