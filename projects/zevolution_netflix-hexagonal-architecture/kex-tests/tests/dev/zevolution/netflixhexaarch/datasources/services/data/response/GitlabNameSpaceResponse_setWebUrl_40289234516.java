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

public class GitlabNameSpaceResponse_setWebUrl_40289234516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2170;

    public GitlabNameSpaceResponse_setWebUrl_40289234516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term2171 = new Integer(-73683645);
        Integer term2221 = new Integer(-226514366);
        term2170 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term2170, term2170.getClass(), "id", term2171);
        setField(term2170, term2170.getClass(), "name", "DfISiziTgG");
        setField(term2170, term2170.getClass(), "path", "XqgfKFvPSD");
        setField(term2170, term2170.getClass(), "kind", "JiVRgTZvKc");
        setField(term2170, term2170.getClass(), "fullPath", "XPKmummaqg");
        setField(term2170, term2170.getClass(), "parentId", term2221);
        setField(term2170, term2170.getClass(), "avatarUrl", "BKLfkLiZTH");
        setField(term2170, term2170.getClass(), "webUrl", "SPpkrGcPRr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEccwbJKYE";
        callMethod(klass, "setWebUrl", argTypes, term2170, args);
    }

};


