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
import java.lang.Object;

public class GitlabProjectResponse_setCreatedAt_213946453514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22209;
     Object term22445;

    public GitlabProjectResponse_setCreatedAt_213946453514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term22210 = new Integer(1202361360);
        Integer term22354 = new Integer(-2015048153);
        Integer term22356 = new Integer(-2063457669);
        Integer term22369 = new Integer(-1222006000);
        Integer term22419 = new Integer(2095798786);
        term22209 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term22272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22358 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22359 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22363 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22368 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term22209, term22209.getClass(), "id", term22210);
        setField(term22209, term22209.getClass(), "description", "MQUTfIiFnh");
        setField(term22209, term22209.getClass(), "name", "JeyKRznnft");
        setField(term22209, term22209.getClass(), "nameWithNamespace", "vQJUCtuYpK");
        setField(term22209, term22209.getClass(), "path", "GHtOeztAdz");
        setField(term22209, term22209.getClass(), "pathWithNamespace", "gSAtqakaLY");
        setIntField(term22273, term22273.getClass(), "year", 2028);
        setShortField(term22273, term22273.getClass(), "month", (short) 10);
        setShortField(term22273, term22273.getClass(), "day", (short) 1);
        setField(term22272, term22272.getClass(), "date", term22273);
        setByteField(term22277, term22277.getClass(), "hour", (byte) 17);
        setByteField(term22277, term22277.getClass(), "minute", (byte) 29);
        setByteField(term22277, term22277.getClass(), "second", (byte) 30);
        setIntField(term22277, term22277.getClass(), "nano", 845472306);
        setField(term22272, term22272.getClass(), "time", term22277);
        setField(term22209, term22209.getClass(), "createdAt", term22272);
        setField(term22209, term22209.getClass(), "defaultBranch", "taPBiMFNEZ");
        setField(term22209, term22209.getClass(), "sshUrlToRepo", "NoAFAfGyYL");
        setField(term22209, term22209.getClass(), "httpUrlToRepo", "MFtfkBMyOD");
        setField(term22209, term22209.getClass(), "webUrl", "rdiIyXfRtL");
        setField(term22209, term22209.getClass(), "readmeUrl", "douzkltmiI");
        setField(term22209, term22209.getClass(), "avatarUrl", "MFKjhvLtpe");
        setField(term22209, term22209.getClass(), "forksCount", term22354);
        setField(term22209, term22209.getClass(), "starCount", term22356);
        setIntField(term22359, term22359.getClass(), "year", 2027);
        setShortField(term22359, term22359.getClass(), "month", (short) 2);
        setShortField(term22359, term22359.getClass(), "day", (short) 19);
        setField(term22358, term22358.getClass(), "date", term22359);
        setByteField(term22363, term22363.getClass(), "hour", (byte) 17);
        setByteField(term22363, term22363.getClass(), "minute", (byte) 37);
        setByteField(term22363, term22363.getClass(), "second", (byte) 27);
        setIntField(term22363, term22363.getClass(), "nano", 920380537);
        setField(term22358, term22358.getClass(), "time", term22363);
        setField(term22209, term22209.getClass(), "lastActivityAt", term22358);
        setField(term22368, term22368.getClass(), "id", term22369);
        setField(term22368, term22368.getClass(), "name", "xpbLKEsput");
        setField(term22368, term22368.getClass(), "path", "urlyLwPBVn");
        setField(term22368, term22368.getClass(), "kind", "SPQVzOlOzZ");
        setField(term22368, term22368.getClass(), "fullPath", "bOUAgAptAI");
        setField(term22368, term22368.getClass(), "parentId", term22419);
        setField(term22368, term22368.getClass(), "avatarUrl", "KSZfGbvzPE");
        setField(term22368, term22368.getClass(), "webUrl", "YfgYGgzYER");
        setField(term22209, term22209.getClass(), "namespace", term22368);
        term22445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22450 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term22446, term22446.getClass(), "year", 2021);
        setShortField(term22446, term22446.getClass(), "month", (short) 8);
        setShortField(term22446, term22446.getClass(), "day", (short) 12);
        setField(term22445, term22445.getClass(), "date", term22446);
        setByteField(term22450, term22450.getClass(), "hour", (byte) 2);
        setByteField(term22450, term22450.getClass(), "minute", (byte) 17);
        setByteField(term22450, term22450.getClass(), "second", (byte) 51);
        setIntField(term22450, term22450.getClass(), "nano", 207375141);
        setField(term22445, term22445.getClass(), "time", term22450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term22445;
        callMethod(klass, "setCreatedAt", argTypes, term22209, args);
    }

};


