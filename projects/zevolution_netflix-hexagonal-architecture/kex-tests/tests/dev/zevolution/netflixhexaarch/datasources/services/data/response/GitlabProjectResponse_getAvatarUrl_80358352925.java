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

public class GitlabProjectResponse_getAvatarUrl_80358352925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26795;

    public GitlabProjectResponse_getAvatarUrl_80358352925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term26796 = new Integer(497269071);
        Integer term26940 = new Integer(-1899301124);
        Integer term26942 = new Integer(-1882480155);
        Integer term26955 = new Integer(-1410220680);
        Integer term27005 = new Integer(389427431);
        term26795 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term26858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26949 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26954 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term26795, term26795.getClass(), "id", term26796);
        setField(term26795, term26795.getClass(), "description", "azMTTmEXnh");
        setField(term26795, term26795.getClass(), "name", "BjJtxwsIpt");
        setField(term26795, term26795.getClass(), "nameWithNamespace", "gUQhOyGfzF");
        setField(term26795, term26795.getClass(), "path", "IqDObvPBZX");
        setField(term26795, term26795.getClass(), "pathWithNamespace", "NITCrIISoC");
        setIntField(term26859, term26859.getClass(), "year", 2011);
        setShortField(term26859, term26859.getClass(), "month", (short) 10);
        setShortField(term26859, term26859.getClass(), "day", (short) 25);
        setField(term26858, term26858.getClass(), "date", term26859);
        setByteField(term26863, term26863.getClass(), "hour", (byte) 10);
        setByteField(term26863, term26863.getClass(), "minute", (byte) 33);
        setByteField(term26863, term26863.getClass(), "second", (byte) 8);
        setIntField(term26863, term26863.getClass(), "nano", 268304014);
        setField(term26858, term26858.getClass(), "time", term26863);
        setField(term26795, term26795.getClass(), "createdAt", term26858);
        setField(term26795, term26795.getClass(), "defaultBranch", "nSzzeexTDI");
        setField(term26795, term26795.getClass(), "sshUrlToRepo", "WBrpvMhmsz");
        setField(term26795, term26795.getClass(), "httpUrlToRepo", "ZzqRHVEXcM");
        setField(term26795, term26795.getClass(), "webUrl", "YYwIEARNxi");
        setField(term26795, term26795.getClass(), "readmeUrl", "rblXBUdTFc");
        setField(term26795, term26795.getClass(), "avatarUrl", "rbsXSOJFKW");
        setField(term26795, term26795.getClass(), "forksCount", term26940);
        setField(term26795, term26795.getClass(), "starCount", term26942);
        setIntField(term26945, term26945.getClass(), "year", 2024);
        setShortField(term26945, term26945.getClass(), "month", (short) 5);
        setShortField(term26945, term26945.getClass(), "day", (short) 6);
        setField(term26944, term26944.getClass(), "date", term26945);
        setByteField(term26949, term26949.getClass(), "hour", (byte) 20);
        setByteField(term26949, term26949.getClass(), "minute", (byte) 14);
        setByteField(term26949, term26949.getClass(), "second", (byte) 27);
        setIntField(term26949, term26949.getClass(), "nano", 900636101);
        setField(term26944, term26944.getClass(), "time", term26949);
        setField(term26795, term26795.getClass(), "lastActivityAt", term26944);
        setField(term26954, term26954.getClass(), "id", term26955);
        setField(term26954, term26954.getClass(), "name", "sAgGDoUNlf");
        setField(term26954, term26954.getClass(), "path", "TSTZcXdFFi");
        setField(term26954, term26954.getClass(), "kind", "RyaaOzWfYO");
        setField(term26954, term26954.getClass(), "fullPath", "HAkxFBZZzz");
        setField(term26954, term26954.getClass(), "parentId", term27005);
        setField(term26954, term26954.getClass(), "avatarUrl", "yejonZnVuy");
        setField(term26954, term26954.getClass(), "webUrl", "ouesGIsvuG");
        setField(term26795, term26795.getClass(), "namespace", term26954);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarUrl", argTypes, term26795, args);
    }

};


