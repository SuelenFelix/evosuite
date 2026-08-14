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

public class GitlabProjectResponse_setSshUrlToRepo_88258827420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28440;

    public GitlabProjectResponse_setSshUrlToRepo_88258827420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28441 = new Integer(1152356969);
        Integer term28585 = new Integer(-1667990367);
        Integer term28587 = new Integer(-1214628358);
        Integer term28600 = new Integer(1102721075);
        Integer term28650 = new Integer(-426764678);
        term28440 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28503 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28504 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28508 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28589 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28590 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28594 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28599 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28440, term28440.getClass(), "id", term28441);
        setField(term28440, term28440.getClass(), "description", "FbBMtntDbw");
        setField(term28440, term28440.getClass(), "name", "zRnpRGaHlI");
        setField(term28440, term28440.getClass(), "nameWithNamespace", "dVHfxjbMRK");
        setField(term28440, term28440.getClass(), "path", "LzwyLxKJpw");
        setField(term28440, term28440.getClass(), "pathWithNamespace", "ZhWJlplAVK");
        setIntField(term28504, term28504.getClass(), "year", 2014);
        setShortField(term28504, term28504.getClass(), "month", (short) 11);
        setShortField(term28504, term28504.getClass(), "day", (short) 8);
        setField(term28503, term28503.getClass(), "date", term28504);
        setByteField(term28508, term28508.getClass(), "hour", (byte) 8);
        setByteField(term28508, term28508.getClass(), "minute", (byte) 43);
        setByteField(term28508, term28508.getClass(), "second", (byte) 32);
        setIntField(term28508, term28508.getClass(), "nano", 154434838);
        setField(term28503, term28503.getClass(), "time", term28508);
        setField(term28440, term28440.getClass(), "createdAt", term28503);
        setField(term28440, term28440.getClass(), "defaultBranch", "pnmjTuTojv");
        setField(term28440, term28440.getClass(), "sshUrlToRepo", "eMtshhmGEm");
        setField(term28440, term28440.getClass(), "httpUrlToRepo", "VJUbzHGOvg");
        setField(term28440, term28440.getClass(), "webUrl", "SiwcigIrfD");
        setField(term28440, term28440.getClass(), "readmeUrl", "MFIdGVLoDo");
        setField(term28440, term28440.getClass(), "avatarUrl", "kbxgTcnXyU");
        setField(term28440, term28440.getClass(), "forksCount", term28585);
        setField(term28440, term28440.getClass(), "starCount", term28587);
        setIntField(term28590, term28590.getClass(), "year", 2020);
        setShortField(term28590, term28590.getClass(), "month", (short) 5);
        setShortField(term28590, term28590.getClass(), "day", (short) 18);
        setField(term28589, term28589.getClass(), "date", term28590);
        setByteField(term28594, term28594.getClass(), "hour", (byte) 5);
        setByteField(term28594, term28594.getClass(), "minute", (byte) 46);
        setByteField(term28594, term28594.getClass(), "second", (byte) 13);
        setIntField(term28594, term28594.getClass(), "nano", 45893173);
        setField(term28589, term28589.getClass(), "time", term28594);
        setField(term28440, term28440.getClass(), "lastActivityAt", term28589);
        setField(term28599, term28599.getClass(), "id", term28600);
        setField(term28599, term28599.getClass(), "name", "lnJvDbbuwo");
        setField(term28599, term28599.getClass(), "path", "KExnWkKGvF");
        setField(term28599, term28599.getClass(), "kind", "luGUNfvmKk");
        setField(term28599, term28599.getClass(), "fullPath", "oOUHomyJff");
        setField(term28599, term28599.getClass(), "parentId", term28650);
        setField(term28599, term28599.getClass(), "avatarUrl", "KnnoLMOuur");
        setField(term28599, term28599.getClass(), "webUrl", "buRpVghIvt");
        setField(term28440, term28440.getClass(), "namespace", term28599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oTGxFdiaIW";
        callMethod(klass, "setSshUrlToRepo", argTypes, term28440, args);
    }

};


