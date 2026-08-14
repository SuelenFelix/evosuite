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

public class GitlabProjectResponse_setNamespace_85339424336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35060;
     Object term35296;

    public GitlabProjectResponse_setNamespace_85339424336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term35061 = new Integer(-1656687479);
        Integer term35205 = new Integer(-249614216);
        Integer term35207 = new Integer(1870727665);
        Integer term35220 = new Integer(-519881101);
        Integer term35270 = new Integer(-680920524);
        term35060 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term35123 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35124 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35128 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35219 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term35060, term35060.getClass(), "id", term35061);
        setField(term35060, term35060.getClass(), "description", "FBYRIDZvmW");
        setField(term35060, term35060.getClass(), "name", "IyjLfrDZrV");
        setField(term35060, term35060.getClass(), "nameWithNamespace", "BRMTHqqoRg");
        setField(term35060, term35060.getClass(), "path", "nOElYZBeyU");
        setField(term35060, term35060.getClass(), "pathWithNamespace", "eUXPtGmoNg");
        setIntField(term35124, term35124.getClass(), "year", 2011);
        setShortField(term35124, term35124.getClass(), "month", (short) 8);
        setShortField(term35124, term35124.getClass(), "day", (short) 1);
        setField(term35123, term35123.getClass(), "date", term35124);
        setByteField(term35128, term35128.getClass(), "hour", (byte) 7);
        setByteField(term35128, term35128.getClass(), "minute", (byte) 2);
        setByteField(term35128, term35128.getClass(), "second", (byte) 46);
        setIntField(term35128, term35128.getClass(), "nano", 187178462);
        setField(term35123, term35123.getClass(), "time", term35128);
        setField(term35060, term35060.getClass(), "createdAt", term35123);
        setField(term35060, term35060.getClass(), "defaultBranch", "ZjqXyUmAJY");
        setField(term35060, term35060.getClass(), "sshUrlToRepo", "pjEERkBbYo");
        setField(term35060, term35060.getClass(), "httpUrlToRepo", "FQPqmjhWog");
        setField(term35060, term35060.getClass(), "webUrl", "sYtJsiIiSX");
        setField(term35060, term35060.getClass(), "readmeUrl", "KgfsAwTFFn");
        setField(term35060, term35060.getClass(), "avatarUrl", "hFnFlgThhp");
        setField(term35060, term35060.getClass(), "forksCount", term35205);
        setField(term35060, term35060.getClass(), "starCount", term35207);
        setIntField(term35210, term35210.getClass(), "year", 2020);
        setShortField(term35210, term35210.getClass(), "month", (short) 9);
        setShortField(term35210, term35210.getClass(), "day", (short) 3);
        setField(term35209, term35209.getClass(), "date", term35210);
        setByteField(term35214, term35214.getClass(), "hour", (byte) 10);
        setByteField(term35214, term35214.getClass(), "minute", (byte) 44);
        setByteField(term35214, term35214.getClass(), "second", (byte) 5);
        setIntField(term35214, term35214.getClass(), "nano", 572560230);
        setField(term35209, term35209.getClass(), "time", term35214);
        setField(term35060, term35060.getClass(), "lastActivityAt", term35209);
        setField(term35219, term35219.getClass(), "id", term35220);
        setField(term35219, term35219.getClass(), "name", "aEZAnHuGSR");
        setField(term35219, term35219.getClass(), "path", "uMzGGnJFYF");
        setField(term35219, term35219.getClass(), "kind", "iAIRLRjFkP");
        setField(term35219, term35219.getClass(), "fullPath", "cdXvvxXVTz");
        setField(term35219, term35219.getClass(), "parentId", term35270);
        setField(term35219, term35219.getClass(), "avatarUrl", "tXsfWIqIPn");
        setField(term35219, term35219.getClass(), "webUrl", "tDmfqEyHaN");
        setField(term35060, term35060.getClass(), "namespace", term35219);
        Integer term35297 = new Integer(-916335264);
        Integer term35347 = new Integer(-919416536);
        term35296 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term35296, term35296.getClass(), "id", term35297);
        setField(term35296, term35296.getClass(), "name", "mTSMXFkWRr");
        setField(term35296, term35296.getClass(), "path", "qdIiMKwfzT");
        setField(term35296, term35296.getClass(), "kind", "qrmUWIxufo");
        setField(term35296, term35296.getClass(), "fullPath", "SeWCUkXfZv");
        setField(term35296, term35296.getClass(), "parentId", term35347);
        setField(term35296, term35296.getClass(), "avatarUrl", "woQcQRYwNH");
        setField(term35296, term35296.getClass(), "webUrl", "uQjzusifTg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse");
        Object[] args = new Object[1];
        args[0] = term35296;
        callMethod(klass, "setNamespace", argTypes, term35060, args);
    }

};


