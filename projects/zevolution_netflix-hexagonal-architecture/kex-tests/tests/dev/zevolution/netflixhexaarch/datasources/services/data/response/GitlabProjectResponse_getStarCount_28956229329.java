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

public class GitlabProjectResponse_getStarCount_28956229329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28443;

    public GitlabProjectResponse_getStarCount_28956229329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28444 = new Integer(-749861210);
        Integer term28588 = new Integer(1694224101);
        Integer term28590 = new Integer(937859191);
        Integer term28603 = new Integer(-916584829);
        Integer term28653 = new Integer(-2131181468);
        term28443 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28506 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28507 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28511 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28597 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28602 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28443, term28443.getClass(), "id", term28444);
        setField(term28443, term28443.getClass(), "description", "fheZXFNQZh");
        setField(term28443, term28443.getClass(), "name", "YxHVWlebna");
        setField(term28443, term28443.getClass(), "nameWithNamespace", "IEmAQCkrPE");
        setField(term28443, term28443.getClass(), "path", "lqFGhtlNRM");
        setField(term28443, term28443.getClass(), "pathWithNamespace", "GLxLHUsuLw");
        setIntField(term28507, term28507.getClass(), "year", 2023);
        setShortField(term28507, term28507.getClass(), "month", (short) 2);
        setShortField(term28507, term28507.getClass(), "day", (short) 16);
        setField(term28506, term28506.getClass(), "date", term28507);
        setByteField(term28511, term28511.getClass(), "hour", (byte) 3);
        setByteField(term28511, term28511.getClass(), "minute", (byte) 18);
        setByteField(term28511, term28511.getClass(), "second", (byte) 56);
        setIntField(term28511, term28511.getClass(), "nano", 733017887);
        setField(term28506, term28506.getClass(), "time", term28511);
        setField(term28443, term28443.getClass(), "createdAt", term28506);
        setField(term28443, term28443.getClass(), "defaultBranch", "HuKdqrrxIm");
        setField(term28443, term28443.getClass(), "sshUrlToRepo", "yJKKddLqMb");
        setField(term28443, term28443.getClass(), "httpUrlToRepo", "LWEYaXeKBe");
        setField(term28443, term28443.getClass(), "webUrl", "cNoFvpHBHw");
        setField(term28443, term28443.getClass(), "readmeUrl", "DoSWbCtsBg");
        setField(term28443, term28443.getClass(), "avatarUrl", "NrXtkbXwDc");
        setField(term28443, term28443.getClass(), "forksCount", term28588);
        setField(term28443, term28443.getClass(), "starCount", term28590);
        setIntField(term28593, term28593.getClass(), "year", 2025);
        setShortField(term28593, term28593.getClass(), "month", (short) 3);
        setShortField(term28593, term28593.getClass(), "day", (short) 28);
        setField(term28592, term28592.getClass(), "date", term28593);
        setByteField(term28597, term28597.getClass(), "hour", (byte) 19);
        setByteField(term28597, term28597.getClass(), "minute", (byte) 56);
        setByteField(term28597, term28597.getClass(), "second", (byte) 52);
        setIntField(term28597, term28597.getClass(), "nano", 738558930);
        setField(term28592, term28592.getClass(), "time", term28597);
        setField(term28443, term28443.getClass(), "lastActivityAt", term28592);
        setField(term28602, term28602.getClass(), "id", term28603);
        setField(term28602, term28602.getClass(), "name", "EUapSrAmOe");
        setField(term28602, term28602.getClass(), "path", "dUHylIprea");
        setField(term28602, term28602.getClass(), "kind", "FKDqHRpMcc");
        setField(term28602, term28602.getClass(), "fullPath", "mIRMQIxHUD");
        setField(term28602, term28602.getClass(), "parentId", term28653);
        setField(term28602, term28602.getClass(), "avatarUrl", "FbBMtntDbw");
        setField(term28602, term28602.getClass(), "webUrl", "zRnpRGaHlI");
        setField(term28443, term28443.getClass(), "namespace", term28602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarCount", argTypes, term28443, args);
    }

};


