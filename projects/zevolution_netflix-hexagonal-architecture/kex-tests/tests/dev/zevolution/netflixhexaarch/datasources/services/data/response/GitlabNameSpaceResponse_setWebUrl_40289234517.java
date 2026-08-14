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

public class GitlabNameSpaceResponse_setWebUrl_40289234517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265;

    public GitlabNameSpaceResponse_setWebUrl_40289234517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2266 = new Integer(1193880199);
        Integer term2316 = new Integer(-1087774327);
        term2265 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term2265, term2265.getClass(), "id", term2266);
        setField(term2265, term2265.getClass(), "name", "eVpkWxjuki");
        setField(term2265, term2265.getClass(), "path", "SJiQaLvSKv");
        setField(term2265, term2265.getClass(), "kind", "OEXDRUKcFl");
        setField(term2265, term2265.getClass(), "fullPath", "RYdKCNNMBR");
        setField(term2265, term2265.getClass(), "parentId", term2316);
        setField(term2265, term2265.getClass(), "avatarUrl", "yGtHPyvYiQ");
        setField(term2265, term2265.getClass(), "webUrl", "MvRIxilFMJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setWebUrl", argTypes, term2265, args);
    }

};


