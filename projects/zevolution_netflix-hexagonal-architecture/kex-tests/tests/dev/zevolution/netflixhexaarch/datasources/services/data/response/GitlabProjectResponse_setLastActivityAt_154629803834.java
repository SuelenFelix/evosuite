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

public class GitlabProjectResponse_setLastActivityAt_154629803834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34238;
     Object term34474;

    public GitlabProjectResponse_setLastActivityAt_154629803834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34239 = new Integer(199287428);
        Integer term34383 = new Integer(-1195339592);
        Integer term34385 = new Integer(-376422566);
        Integer term34398 = new Integer(306847454);
        Integer term34448 = new Integer(1745276158);
        term34238 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term34301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34387 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34388 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34392 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34397 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term34238, term34238.getClass(), "id", term34239);
        setField(term34238, term34238.getClass(), "description", "HvSKssbEES");
        setField(term34238, term34238.getClass(), "name", "UjIAQAHhul");
        setField(term34238, term34238.getClass(), "nameWithNamespace", "oWBXOvjPUT");
        setField(term34238, term34238.getClass(), "path", "DcKqrrTdId");
        setField(term34238, term34238.getClass(), "pathWithNamespace", "fwtOJhjXbW");
        setIntField(term34302, term34302.getClass(), "year", 2026);
        setShortField(term34302, term34302.getClass(), "month", (short) 10);
        setShortField(term34302, term34302.getClass(), "day", (short) 31);
        setField(term34301, term34301.getClass(), "date", term34302);
        setByteField(term34306, term34306.getClass(), "hour", (byte) 17);
        setByteField(term34306, term34306.getClass(), "minute", (byte) 6);
        setByteField(term34306, term34306.getClass(), "second", (byte) 30);
        setIntField(term34306, term34306.getClass(), "nano", 785931660);
        setField(term34301, term34301.getClass(), "time", term34306);
        setField(term34238, term34238.getClass(), "createdAt", term34301);
        setField(term34238, term34238.getClass(), "defaultBranch", "ltWBKZaXwJ");
        setField(term34238, term34238.getClass(), "sshUrlToRepo", "FSQpgxQnsH");
        setField(term34238, term34238.getClass(), "httpUrlToRepo", "LBPwnVMEpP");
        setField(term34238, term34238.getClass(), "webUrl", "cwALzyQVjH");
        setField(term34238, term34238.getClass(), "readmeUrl", "jlYNjpdkoz");
        setField(term34238, term34238.getClass(), "avatarUrl", "DZAGnhJkeU");
        setField(term34238, term34238.getClass(), "forksCount", term34383);
        setField(term34238, term34238.getClass(), "starCount", term34385);
        setIntField(term34388, term34388.getClass(), "year", 2022);
        setShortField(term34388, term34388.getClass(), "month", (short) 11);
        setShortField(term34388, term34388.getClass(), "day", (short) 10);
        setField(term34387, term34387.getClass(), "date", term34388);
        setByteField(term34392, term34392.getClass(), "hour", (byte) 20);
        setByteField(term34392, term34392.getClass(), "minute", (byte) 8);
        setByteField(term34392, term34392.getClass(), "second", (byte) 35);
        setIntField(term34392, term34392.getClass(), "nano", 658416570);
        setField(term34387, term34387.getClass(), "time", term34392);
        setField(term34238, term34238.getClass(), "lastActivityAt", term34387);
        setField(term34397, term34397.getClass(), "id", term34398);
        setField(term34397, term34397.getClass(), "name", "xQuVexkiVz");
        setField(term34397, term34397.getClass(), "path", "LqNgPziYtv");
        setField(term34397, term34397.getClass(), "kind", "wiDfuaXnrP");
        setField(term34397, term34397.getClass(), "fullPath", "btdGZUcaZl");
        setField(term34397, term34397.getClass(), "parentId", term34448);
        setField(term34397, term34397.getClass(), "avatarUrl", "WnEAVdCxna");
        setField(term34397, term34397.getClass(), "webUrl", "lnPIxHHyEK");
        setField(term34238, term34238.getClass(), "namespace", term34397);
        term34474 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34475 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34479 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term34475, term34475.getClass(), "year", 2018);
        setShortField(term34475, term34475.getClass(), "month", (short) 11);
        setShortField(term34475, term34475.getClass(), "day", (short) 9);
        setField(term34474, term34474.getClass(), "date", term34475);
        setByteField(term34479, term34479.getClass(), "hour", (byte) 6);
        setByteField(term34479, term34479.getClass(), "minute", (byte) 8);
        setByteField(term34479, term34479.getClass(), "second", (byte) 32);
        setIntField(term34479, term34479.getClass(), "nano", 750733310);
        setField(term34474, term34474.getClass(), "time", term34479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term34474;
        callMethod(klass, "setLastActivityAt", argTypes, term34238, args);
    }

};


