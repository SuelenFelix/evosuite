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

public class GitlabProjectResponse_setId_21053958522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17225;
     Object term17461;

    public GitlabProjectResponse_setId_21053958522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17226 = new Integer(-2027534003);
        Integer term17370 = new Integer(1063420942);
        Integer term17372 = new Integer(1375330971);
        Integer term17385 = new Integer(-478195677);
        Integer term17435 = new Integer(972867650);
        term17225 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term17288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17384 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term17225, term17225.getClass(), "id", term17226);
        setField(term17225, term17225.getClass(), "description", "itAUCFhZhq");
        setField(term17225, term17225.getClass(), "name", "bIqaKgXgPm");
        setField(term17225, term17225.getClass(), "nameWithNamespace", "uOJFOUcNvv");
        setField(term17225, term17225.getClass(), "path", "tkmmGweDwJ");
        setField(term17225, term17225.getClass(), "pathWithNamespace", "pMfTuAFXxg");
        setIntField(term17289, term17289.getClass(), "year", 2015);
        setShortField(term17289, term17289.getClass(), "month", (short) 9);
        setShortField(term17289, term17289.getClass(), "day", (short) 19);
        setField(term17288, term17288.getClass(), "date", term17289);
        setByteField(term17293, term17293.getClass(), "hour", (byte) 9);
        setByteField(term17293, term17293.getClass(), "minute", (byte) 4);
        setByteField(term17293, term17293.getClass(), "second", (byte) 10);
        setIntField(term17293, term17293.getClass(), "nano", 401765865);
        setField(term17288, term17288.getClass(), "time", term17293);
        setField(term17225, term17225.getClass(), "createdAt", term17288);
        setField(term17225, term17225.getClass(), "defaultBranch", "XCZmhkblRc");
        setField(term17225, term17225.getClass(), "sshUrlToRepo", "gFUWMydGCU");
        setField(term17225, term17225.getClass(), "httpUrlToRepo", "LLegSTfqJt");
        setField(term17225, term17225.getClass(), "webUrl", "XQfmqLbqHS");
        setField(term17225, term17225.getClass(), "readmeUrl", "jLVLqQSjqg");
        setField(term17225, term17225.getClass(), "avatarUrl", "JKGueoHesL");
        setField(term17225, term17225.getClass(), "forksCount", term17370);
        setField(term17225, term17225.getClass(), "starCount", term17372);
        setIntField(term17375, term17375.getClass(), "year", 2015);
        setShortField(term17375, term17375.getClass(), "month", (short) 4);
        setShortField(term17375, term17375.getClass(), "day", (short) 14);
        setField(term17374, term17374.getClass(), "date", term17375);
        setByteField(term17379, term17379.getClass(), "hour", (byte) 18);
        setByteField(term17379, term17379.getClass(), "minute", (byte) 24);
        setByteField(term17379, term17379.getClass(), "second", (byte) 32);
        setIntField(term17379, term17379.getClass(), "nano", 369233818);
        setField(term17374, term17374.getClass(), "time", term17379);
        setField(term17225, term17225.getClass(), "lastActivityAt", term17374);
        setField(term17384, term17384.getClass(), "id", term17385);
        setField(term17384, term17384.getClass(), "name", "CRAUqtVBkU");
        setField(term17384, term17384.getClass(), "path", "DddqUYfomL");
        setField(term17384, term17384.getClass(), "kind", "YQwoogpPyi");
        setField(term17384, term17384.getClass(), "fullPath", "rnPhHoorxj");
        setField(term17384, term17384.getClass(), "parentId", term17435);
        setField(term17384, term17384.getClass(), "avatarUrl", "GuwJLKquuI");
        setField(term17384, term17384.getClass(), "webUrl", "vYMCjgnztg");
        setField(term17225, term17225.getClass(), "namespace", term17384);
        term17461 = new Integer(1655935355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term17461;
        callMethod(klass, "setId", argTypes, term17225, args);
    }

};


