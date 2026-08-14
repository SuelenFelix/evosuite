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

public class GitlabNameSpaceResponse_getFullPath_6664340710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1260;

    public GitlabNameSpaceResponse_getFullPath_6664340710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1261 = new Integer(1048535127);
        Integer term1311 = new Integer(-655067527);
        term1260 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1260, term1260.getClass(), "id", term1261);
        setField(term1260, term1260.getClass(), "name", "kBdSllIBVz");
        setField(term1260, term1260.getClass(), "path", "TJmVBGfTML");
        setField(term1260, term1260.getClass(), "kind", "tPlsykYBqO");
        setField(term1260, term1260.getClass(), "fullPath", "bLPjGVBhlX");
        setField(term1260, term1260.getClass(), "parentId", term1311);
        setField(term1260, term1260.getClass(), "avatarUrl", "whBvTVIIlC");
        setField(term1260, term1260.getClass(), "webUrl", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullPath", argTypes, term1260, args);
    }

};


