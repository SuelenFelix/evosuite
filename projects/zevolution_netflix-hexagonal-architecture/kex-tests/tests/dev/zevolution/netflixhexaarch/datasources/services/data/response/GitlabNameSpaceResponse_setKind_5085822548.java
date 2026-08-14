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

public class GitlabNameSpaceResponse_setKind_5085822548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;

    public GitlabNameSpaceResponse_setKind_5085822548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1007 = new Integer(597278769);
        Integer term1057 = new Integer(-1685132342);
        term1006 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term1006, term1006.getClass(), "id", term1007);
        setField(term1006, term1006.getClass(), "name", "BndsHwAFMv");
        setField(term1006, term1006.getClass(), "path", "GzFkzHGYFt");
        setField(term1006, term1006.getClass(), "kind", "tShwQLRGNe");
        setField(term1006, term1006.getClass(), "fullPath", "LvtrsXUliU");
        setField(term1006, term1006.getClass(), "parentId", term1057);
        setField(term1006, term1006.getClass(), "avatarUrl", "xLbjWUgOIL");
        setField(term1006, term1006.getClass(), "webUrl", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setKind", argTypes, term1006, args);
    }

};


