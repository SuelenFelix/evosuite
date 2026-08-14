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

public class GitlabProjectResponse_getWebUrl_188896672623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29702;

    public GitlabProjectResponse_getWebUrl_188896672623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term29703 = new Integer(-749861210);
        Integer term29847 = new Integer(1694224101);
        Integer term29849 = new Integer(937859191);
        Integer term29862 = new Integer(-916584829);
        Integer term29912 = new Integer(-2131181468);
        term29702 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term29765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29851 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29852 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29856 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29861 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term29702, term29702.getClass(), "id", term29703);
        setField(term29702, term29702.getClass(), "description", "UMMXkhuqzw");
        setField(term29702, term29702.getClass(), "name", "KyGXZcXJwq");
        setField(term29702, term29702.getClass(), "nameWithNamespace", "TqiCjeuoWE");
        setField(term29702, term29702.getClass(), "path", "GWWfkXOYLP");
        setField(term29702, term29702.getClass(), "pathWithNamespace", "qvykDllgpT");
        setIntField(term29766, term29766.getClass(), "year", 2011);
        setShortField(term29766, term29766.getClass(), "month", (short) 10);
        setShortField(term29766, term29766.getClass(), "day", (short) 25);
        setField(term29765, term29765.getClass(), "date", term29766);
        setByteField(term29770, term29770.getClass(), "hour", (byte) 10);
        setByteField(term29770, term29770.getClass(), "minute", (byte) 33);
        setByteField(term29770, term29770.getClass(), "second", (byte) 8);
        setIntField(term29770, term29770.getClass(), "nano", 268304014);
        setField(term29765, term29765.getClass(), "time", term29770);
        setField(term29702, term29702.getClass(), "createdAt", term29765);
        setField(term29702, term29702.getClass(), "defaultBranch", "hzdUbcLZhZ");
        setField(term29702, term29702.getClass(), "sshUrlToRepo", "GlxnEJvYeC");
        setField(term29702, term29702.getClass(), "httpUrlToRepo", "SLdOGaqmNv");
        setField(term29702, term29702.getClass(), "webUrl", "QZfhwDBzyR");
        setField(term29702, term29702.getClass(), "readmeUrl", "HvnMmAOZev");
        setField(term29702, term29702.getClass(), "avatarUrl", "JTPAQsfRtT");
        setField(term29702, term29702.getClass(), "forksCount", term29847);
        setField(term29702, term29702.getClass(), "starCount", term29849);
        setIntField(term29852, term29852.getClass(), "year", 2024);
        setShortField(term29852, term29852.getClass(), "month", (short) 5);
        setShortField(term29852, term29852.getClass(), "day", (short) 6);
        setField(term29851, term29851.getClass(), "date", term29852);
        setByteField(term29856, term29856.getClass(), "hour", (byte) 20);
        setByteField(term29856, term29856.getClass(), "minute", (byte) 14);
        setByteField(term29856, term29856.getClass(), "second", (byte) 27);
        setIntField(term29856, term29856.getClass(), "nano", 900636101);
        setField(term29851, term29851.getClass(), "time", term29856);
        setField(term29702, term29702.getClass(), "lastActivityAt", term29851);
        setField(term29861, term29861.getClass(), "id", term29862);
        setField(term29861, term29861.getClass(), "name", "otxkkKfDfl");
        setField(term29861, term29861.getClass(), "path", "bqIuFFFwnP");
        setField(term29861, term29861.getClass(), "kind", "hDxvvVgGlk");
        setField(term29861, term29861.getClass(), "fullPath", "XdjSvjaTqk");
        setField(term29861, term29861.getClass(), "parentId", term29912);
        setField(term29861, term29861.getClass(), "avatarUrl", "ukrlYVcvsg");
        setField(term29861, term29861.getClass(), "webUrl", "cpjqTCNflQ");
        setField(term29702, term29702.getClass(), "namespace", term29861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWebUrl", argTypes, term29702, args);
    }

};


