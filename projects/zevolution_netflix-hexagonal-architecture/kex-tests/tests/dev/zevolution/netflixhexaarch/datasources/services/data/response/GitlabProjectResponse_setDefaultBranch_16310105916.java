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

public class GitlabProjectResponse_setDefaultBranch_16310105916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23031;

    public GitlabProjectResponse_setDefaultBranch_16310105916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23032 = new Integer(202001407);
        Integer term23176 = new Integer(158873461);
        Integer term23178 = new Integer(-430151637);
        Integer term23191 = new Integer(-1697741339);
        Integer term23241 = new Integer(98922530);
        term23031 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23099 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23180 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23181 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23185 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23190 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23031, term23031.getClass(), "id", term23032);
        setField(term23031, term23031.getClass(), "description", "RsOfgdMCMv");
        setField(term23031, term23031.getClass(), "name", "nsofCJqJOR");
        setField(term23031, term23031.getClass(), "nameWithNamespace", "CitJiZwsjF");
        setField(term23031, term23031.getClass(), "path", "ZiyMvLArWJ");
        setField(term23031, term23031.getClass(), "pathWithNamespace", "MaeokjEfWD");
        setIntField(term23095, term23095.getClass(), "year", 2012);
        setShortField(term23095, term23095.getClass(), "month", (short) 8);
        setShortField(term23095, term23095.getClass(), "day", (short) 25);
        setField(term23094, term23094.getClass(), "date", term23095);
        setByteField(term23099, term23099.getClass(), "hour", (byte) 19);
        setByteField(term23099, term23099.getClass(), "minute", (byte) 49);
        setByteField(term23099, term23099.getClass(), "second", (byte) 8);
        setIntField(term23099, term23099.getClass(), "nano", 912685024);
        setField(term23094, term23094.getClass(), "time", term23099);
        setField(term23031, term23031.getClass(), "createdAt", term23094);
        setField(term23031, term23031.getClass(), "defaultBranch", "ocZcumnXEz");
        setField(term23031, term23031.getClass(), "sshUrlToRepo", "rNNwyactDR");
        setField(term23031, term23031.getClass(), "httpUrlToRepo", "QJrTMTdxyh");
        setField(term23031, term23031.getClass(), "webUrl", "rgZSPplPSs");
        setField(term23031, term23031.getClass(), "readmeUrl", "NPUSTXlEKx");
        setField(term23031, term23031.getClass(), "avatarUrl", "KKFprGoNpl");
        setField(term23031, term23031.getClass(), "forksCount", term23176);
        setField(term23031, term23031.getClass(), "starCount", term23178);
        setIntField(term23181, term23181.getClass(), "year", 2012);
        setShortField(term23181, term23181.getClass(), "month", (short) 3);
        setShortField(term23181, term23181.getClass(), "day", (short) 27);
        setField(term23180, term23180.getClass(), "date", term23181);
        setByteField(term23185, term23185.getClass(), "hour", (byte) 17);
        setByteField(term23185, term23185.getClass(), "minute", (byte) 49);
        setByteField(term23185, term23185.getClass(), "second", (byte) 24);
        setIntField(term23185, term23185.getClass(), "nano", 530647398);
        setField(term23180, term23180.getClass(), "time", term23185);
        setField(term23031, term23031.getClass(), "lastActivityAt", term23180);
        setField(term23190, term23190.getClass(), "id", term23191);
        setField(term23190, term23190.getClass(), "name", "tWVISJlxKZ");
        setField(term23190, term23190.getClass(), "path", "rOZkUKEoaf");
        setField(term23190, term23190.getClass(), "kind", "yLnzGqyHGL");
        setField(term23190, term23190.getClass(), "fullPath", "IjprPXBDuY");
        setField(term23190, term23190.getClass(), "parentId", term23241);
        setField(term23190, term23190.getClass(), "avatarUrl", "wkqPmmFDAa");
        setField(term23190, term23190.getClass(), "webUrl", "rLTDtNqLyW");
        setField(term23031, term23031.getClass(), "namespace", term23190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CLsbWobdgS";
        callMethod(klass, "setDefaultBranch", argTypes, term23031, args);
    }

};


