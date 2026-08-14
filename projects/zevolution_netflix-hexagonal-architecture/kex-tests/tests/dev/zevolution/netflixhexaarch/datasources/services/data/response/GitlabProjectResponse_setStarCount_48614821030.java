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

public class GitlabProjectResponse_setStarCount_48614821030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28849;
     Object term29085;

    public GitlabProjectResponse_setStarCount_48614821030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term28850 = new Integer(282916351);
        Integer term28994 = new Integer(880977281);
        Integer term28996 = new Integer(371943306);
        Integer term29009 = new Integer(982388293);
        Integer term29059 = new Integer(-159494544);
        term28849 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term28912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28917 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28998 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28999 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29003 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29008 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term28849, term28849.getClass(), "id", term28850);
        setField(term28849, term28849.getClass(), "description", "dVHfxjbMRK");
        setField(term28849, term28849.getClass(), "name", "LzwyLxKJpw");
        setField(term28849, term28849.getClass(), "nameWithNamespace", "ZhWJlplAVK");
        setField(term28849, term28849.getClass(), "path", "pnmjTuTojv");
        setField(term28849, term28849.getClass(), "pathWithNamespace", "eMtshhmGEm");
        setIntField(term28913, term28913.getClass(), "year", 2024);
        setShortField(term28913, term28913.getClass(), "month", (short) 2);
        setShortField(term28913, term28913.getClass(), "day", (short) 29);
        setField(term28912, term28912.getClass(), "date", term28913);
        setByteField(term28917, term28917.getClass(), "hour", (byte) 17);
        setByteField(term28917, term28917.getClass(), "minute", (byte) 54);
        setByteField(term28917, term28917.getClass(), "second", (byte) 21);
        setIntField(term28917, term28917.getClass(), "nano", 605973408);
        setField(term28912, term28912.getClass(), "time", term28917);
        setField(term28849, term28849.getClass(), "createdAt", term28912);
        setField(term28849, term28849.getClass(), "defaultBranch", "VJUbzHGOvg");
        setField(term28849, term28849.getClass(), "sshUrlToRepo", "SiwcigIrfD");
        setField(term28849, term28849.getClass(), "httpUrlToRepo", "MFIdGVLoDo");
        setField(term28849, term28849.getClass(), "webUrl", "kbxgTcnXyU");
        setField(term28849, term28849.getClass(), "readmeUrl", "lnJvDbbuwo");
        setField(term28849, term28849.getClass(), "avatarUrl", "KExnWkKGvF");
        setField(term28849, term28849.getClass(), "forksCount", term28994);
        setField(term28849, term28849.getClass(), "starCount", term28996);
        setIntField(term28999, term28999.getClass(), "year", 2016);
        setShortField(term28999, term28999.getClass(), "month", (short) 2);
        setShortField(term28999, term28999.getClass(), "day", (short) 25);
        setField(term28998, term28998.getClass(), "date", term28999);
        setByteField(term29003, term29003.getClass(), "hour", (byte) 8);
        setByteField(term29003, term29003.getClass(), "minute", (byte) 54);
        setByteField(term29003, term29003.getClass(), "second", (byte) 40);
        setIntField(term29003, term29003.getClass(), "nano", 124525896);
        setField(term28998, term28998.getClass(), "time", term29003);
        setField(term28849, term28849.getClass(), "lastActivityAt", term28998);
        setField(term29008, term29008.getClass(), "id", term29009);
        setField(term29008, term29008.getClass(), "name", "luGUNfvmKk");
        setField(term29008, term29008.getClass(), "path", "oOUHomyJff");
        setField(term29008, term29008.getClass(), "kind", "KnnoLMOuur");
        setField(term29008, term29008.getClass(), "fullPath", "buRpVghIvt");
        setField(term29008, term29008.getClass(), "parentId", term29059);
        setField(term29008, term29008.getClass(), "avatarUrl", "oTGxFdiaIW");
        setField(term29008, term29008.getClass(), "webUrl", "jlyFvaZlmv");
        setField(term28849, term28849.getClass(), "namespace", term29008);
        term29085 = new Integer(-75206835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term29085;
        callMethod(klass, "setStarCount", argTypes, term28849, args);
    }

};


