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

public class GitlabProjectResponse_getAvatarUrl_80358352927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31370;

    public GitlabProjectResponse_getAvatarUrl_80358352927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31371 = new Integer(1045547089);
        Integer term31515 = new Integer(-1122880881);
        Integer term31517 = new Integer(-542712742);
        Integer term31530 = new Integer(-1254072822);
        Integer term31580 = new Integer(-1111249833);
        term31370 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term31433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31438 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31519 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31520 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31524 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31529 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term31370, term31370.getClass(), "id", term31371);
        setField(term31370, term31370.getClass(), "description", "tTfdvLMwEE");
        setField(term31370, term31370.getClass(), "name", "DiSkERzqOE");
        setField(term31370, term31370.getClass(), "nameWithNamespace", "hPSZZeYqHQ");
        setField(term31370, term31370.getClass(), "path", "scReMUKyGq");
        setField(term31370, term31370.getClass(), "pathWithNamespace", "FmIpnxjRxA");
        setIntField(term31434, term31434.getClass(), "year", 2023);
        setShortField(term31434, term31434.getClass(), "month", (short) 2);
        setShortField(term31434, term31434.getClass(), "day", (short) 16);
        setField(term31433, term31433.getClass(), "date", term31434);
        setByteField(term31438, term31438.getClass(), "hour", (byte) 3);
        setByteField(term31438, term31438.getClass(), "minute", (byte) 18);
        setByteField(term31438, term31438.getClass(), "second", (byte) 56);
        setIntField(term31438, term31438.getClass(), "nano", 733017887);
        setField(term31433, term31433.getClass(), "time", term31438);
        setField(term31370, term31370.getClass(), "createdAt", term31433);
        setField(term31370, term31370.getClass(), "defaultBranch", "FTjxxGvyun");
        setField(term31370, term31370.getClass(), "sshUrlToRepo", "qsjXSwKloH");
        setField(term31370, term31370.getClass(), "httpUrlToRepo", "DDZHUPglvb");
        setField(term31370, term31370.getClass(), "webUrl", "rWoaXvNyVg");
        setField(term31370, term31370.getClass(), "readmeUrl", "FLzaBCFjGv");
        setField(term31370, term31370.getClass(), "avatarUrl", "OLYhTSqTqJ");
        setField(term31370, term31370.getClass(), "forksCount", term31515);
        setField(term31370, term31370.getClass(), "starCount", term31517);
        setIntField(term31520, term31520.getClass(), "year", 2025);
        setShortField(term31520, term31520.getClass(), "month", (short) 3);
        setShortField(term31520, term31520.getClass(), "day", (short) 28);
        setField(term31519, term31519.getClass(), "date", term31520);
        setByteField(term31524, term31524.getClass(), "hour", (byte) 19);
        setByteField(term31524, term31524.getClass(), "minute", (byte) 56);
        setByteField(term31524, term31524.getClass(), "second", (byte) 52);
        setIntField(term31524, term31524.getClass(), "nano", 738558930);
        setField(term31519, term31519.getClass(), "time", term31524);
        setField(term31370, term31370.getClass(), "lastActivityAt", term31519);
        setField(term31529, term31529.getClass(), "id", term31530);
        setField(term31529, term31529.getClass(), "name", "AIHoadcpQz");
        setField(term31529, term31529.getClass(), "path", "fWMsLtuOEV");
        setField(term31529, term31529.getClass(), "kind", "fvgZQBalnd");
        setField(term31529, term31529.getClass(), "fullPath", "tViQSKUCLE");
        setField(term31529, term31529.getClass(), "parentId", term31580);
        setField(term31529, term31529.getClass(), "avatarUrl", "QbaeHheqiP");
        setField(term31529, term31529.getClass(), "webUrl", "gASHxChKwn");
        setField(term31370, term31370.getClass(), "namespace", term31529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term31370, args);
    }

};


