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

public class GitlabProjectResponse_setForksCount_126101637530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32610;
     Object term32846;

    public GitlabProjectResponse_setForksCount_126101637530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32611 = new Integer(1460722225);
        Integer term32755 = new Integer(1743224434);
        Integer term32757 = new Integer(842904495);
        Integer term32770 = new Integer(1008080511);
        Integer term32820 = new Integer(1935707624);
        term32610 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term32673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32769 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term32610, term32610.getClass(), "id", term32611);
        setField(term32610, term32610.getClass(), "description", "sRzUJLYMmB");
        setField(term32610, term32610.getClass(), "name", "XxILklSDwz");
        setField(term32610, term32610.getClass(), "nameWithNamespace", "TLjhFZbwKO");
        setField(term32610, term32610.getClass(), "path", "nxEbLIApFc");
        setField(term32610, term32610.getClass(), "pathWithNamespace", "zzsdNZhejE");
        setIntField(term32674, term32674.getClass(), "year", 2019);
        setShortField(term32674, term32674.getClass(), "month", (short) 1);
        setShortField(term32674, term32674.getClass(), "day", (short) 6);
        setField(term32673, term32673.getClass(), "date", term32674);
        setByteField(term32678, term32678.getClass(), "hour", (byte) 18);
        setByteField(term32678, term32678.getClass(), "minute", (byte) 8);
        setByteField(term32678, term32678.getClass(), "second", (byte) 46);
        setIntField(term32678, term32678.getClass(), "nano", 934136445);
        setField(term32673, term32673.getClass(), "time", term32678);
        setField(term32610, term32610.getClass(), "createdAt", term32673);
        setField(term32610, term32610.getClass(), "defaultBranch", "ILoodMZrgR");
        setField(term32610, term32610.getClass(), "sshUrlToRepo", "XQiKmsCacK");
        setField(term32610, term32610.getClass(), "httpUrlToRepo", "cTCixEbHYT");
        setField(term32610, term32610.getClass(), "webUrl", "bqKksqtAdT");
        setField(term32610, term32610.getClass(), "readmeUrl", "jAIAdEmULK");
        setField(term32610, term32610.getClass(), "avatarUrl", "EuAshkmbna");
        setField(term32610, term32610.getClass(), "forksCount", term32755);
        setField(term32610, term32610.getClass(), "starCount", term32757);
        setIntField(term32760, term32760.getClass(), "year", 2028);
        setShortField(term32760, term32760.getClass(), "month", (short) 1);
        setShortField(term32760, term32760.getClass(), "day", (short) 18);
        setField(term32759, term32759.getClass(), "date", term32760);
        setByteField(term32764, term32764.getClass(), "hour", (byte) 12);
        setByteField(term32764, term32764.getClass(), "minute", (byte) 4);
        setByteField(term32764, term32764.getClass(), "second", (byte) 39);
        setIntField(term32764, term32764.getClass(), "nano", 651287093);
        setField(term32759, term32759.getClass(), "time", term32764);
        setField(term32610, term32610.getClass(), "lastActivityAt", term32759);
        setField(term32769, term32769.getClass(), "id", term32770);
        setField(term32769, term32769.getClass(), "name", "JwQlbBbGJR");
        setField(term32769, term32769.getClass(), "path", "HdWLwfVsAM");
        setField(term32769, term32769.getClass(), "kind", "SxeKEdHXSl");
        setField(term32769, term32769.getClass(), "fullPath", "BCAlJpNjIX");
        setField(term32769, term32769.getClass(), "parentId", term32820);
        setField(term32769, term32769.getClass(), "avatarUrl", "PKClfBAwUr");
        setField(term32769, term32769.getClass(), "webUrl", "JqbKrmVEMy");
        setField(term32610, term32610.getClass(), "namespace", term32769);
        term32846 = new Integer(1507074215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term32846;
        callMethod(klass, "setForksCount", argTypes, term32610, args);
    }

};


