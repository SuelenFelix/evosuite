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

public class GitlabProjectResponse_getCreatedAt_52083223014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26377;

    public GitlabProjectResponse_getCreatedAt_52083223014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26378 = new Integer(-601863069);
        Integer term26522 = new Integer(663292551);
        Integer term26524 = new Integer(-1885090354);
        Integer term26537 = new Integer(-2066804303);
        Integer term26587 = new Integer(-1731761810);
        term26377 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26440 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26441 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26445 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26526 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26527 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26531 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26536 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term26377, term26377.getClass(), "id", term26378);
        setField(term26377, term26377.getClass(), "description", "AWtIUOuutt");
        setField(term26377, term26377.getClass(), "name", "jBgJZpHifl");
        setField(term26377, term26377.getClass(), "nameWithNamespace", "azMTTmEXnh");
        setField(term26377, term26377.getClass(), "path", "BjJtxwsIpt");
        setField(term26377, term26377.getClass(), "pathWithNamespace", "gUQhOyGfzF");
        setIntField(term26441, term26441.getClass(), "year", 2012);
        setShortField(term26441, term26441.getClass(), "month", (short) 3);
        setShortField(term26441, term26441.getClass(), "day", (short) 27);
        setField(term26440, term26440.getClass(), "date", term26441);
        setByteField(term26445, term26445.getClass(), "hour", (byte) 17);
        setByteField(term26445, term26445.getClass(), "minute", (byte) 49);
        setByteField(term26445, term26445.getClass(), "second", (byte) 24);
        setIntField(term26445, term26445.getClass(), "nano", 530647398);
        setField(term26440, term26440.getClass(), "time", term26445);
        setField(term26377, term26377.getClass(), "createdAt", term26440);
        setField(term26377, term26377.getClass(), "defaultBranch", "IqDObvPBZX");
        setField(term26377, term26377.getClass(), "sshUrlToRepo", "NITCrIISoC");
        setField(term26377, term26377.getClass(), "httpUrlToRepo", "nSzzeexTDI");
        setField(term26377, term26377.getClass(), "webUrl", "WBrpvMhmsz");
        setField(term26377, term26377.getClass(), "readmeUrl", "ZzqRHVEXcM");
        setField(term26377, term26377.getClass(), "avatarUrl", "YYwIEARNxi");
        setField(term26377, term26377.getClass(), "forksCount", term26522);
        setField(term26377, term26377.getClass(), "starCount", term26524);
        setIntField(term26527, term26527.getClass(), "year", 2010);
        setShortField(term26527, term26527.getClass(), "month", (short) 6);
        setShortField(term26527, term26527.getClass(), "day", (short) 14);
        setField(term26526, term26526.getClass(), "date", term26527);
        setByteField(term26531, term26531.getClass(), "hour", (byte) 6);
        setByteField(term26531, term26531.getClass(), "minute", (byte) 22);
        setByteField(term26531, term26531.getClass(), "second", (byte) 20);
        setIntField(term26531, term26531.getClass(), "nano", 25133051);
        setField(term26526, term26526.getClass(), "time", term26531);
        setField(term26377, term26377.getClass(), "lastActivityAt", term26526);
        setField(term26536, term26536.getClass(), "id", term26537);
        setField(term26536, term26536.getClass(), "name", "rblXBUdTFc");
        setField(term26536, term26536.getClass(), "path", "rbsXSOJFKW");
        setField(term26536, term26536.getClass(), "kind", "sAgGDoUNlf");
        setField(term26536, term26536.getClass(), "fullPath", "TSTZcXdFFi");
        setField(term26536, term26536.getClass(), "parentId", term26587);
        setField(term26536, term26536.getClass(), "avatarUrl", "RyaaOzWfYO");
        setField(term26536, term26536.getClass(), "webUrl", "HAkxFBZZzz");
        setField(term26377, term26377.getClass(), "namespace", term26536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term26377, args);
    }

};


