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

public class GitlabNameSpaceResponse_getName_17680267923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public GitlabNameSpaceResponse_getName_17680267923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term278 = new Integer(-616727354);
        Integer term328 = new Integer(-1955890973);
        term277 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term277, term277.getClass(), "id", term278);
        setField(term277, term277.getClass(), "name", "MxlszYVzRf");
        setField(term277, term277.getClass(), "path", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "kind", "oVcInYnLWB");
        setField(term277, term277.getClass(), "fullPath", "aJlieCFVtF");
        setField(term277, term277.getClass(), "parentId", term328);
        setField(term277, term277.getClass(), "avatarUrl", "ZiaGIbnzTs");
        setField(term277, term277.getClass(), "webUrl", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term277, args);
    }

};


