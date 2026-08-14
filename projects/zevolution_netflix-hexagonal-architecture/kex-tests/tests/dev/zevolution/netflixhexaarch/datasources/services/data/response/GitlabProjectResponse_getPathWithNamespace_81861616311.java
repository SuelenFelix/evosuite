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

public class GitlabProjectResponse_getPathWithNamespace_81861616311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20969;

    public GitlabProjectResponse_getPathWithNamespace_81861616311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term20970 = new Integer(1861318859);
        Integer term21114 = new Integer(1474524152);
        Integer term21116 = new Integer(568954359);
        Integer term21129 = new Integer(53410913);
        Integer term21179 = new Integer(-375014958);
        term20969 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term21032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21118 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21119 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21123 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21128 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term20969, term20969.getClass(), "id", term20970);
        setField(term20969, term20969.getClass(), "description", "YVLRenzuoR");
        setField(term20969, term20969.getClass(), "name", "JukEMhPWql");
        setField(term20969, term20969.getClass(), "nameWithNamespace", "ZdNcodHERG");
        setField(term20969, term20969.getClass(), "path", "CLHomjAqIM");
        setField(term20969, term20969.getClass(), "pathWithNamespace", "mzCFLzFuSj");
        setIntField(term21033, term21033.getClass(), "year", 2014);
        setShortField(term21033, term21033.getClass(), "month", (short) 7);
        setShortField(term21033, term21033.getClass(), "day", (short) 13);
        setField(term21032, term21032.getClass(), "date", term21033);
        setByteField(term21037, term21037.getClass(), "hour", (byte) 21);
        setByteField(term21037, term21037.getClass(), "minute", (byte) 46);
        setByteField(term21037, term21037.getClass(), "second", (byte) 0);
        setIntField(term21037, term21037.getClass(), "nano", 887884128);
        setField(term21032, term21032.getClass(), "time", term21037);
        setField(term20969, term20969.getClass(), "createdAt", term21032);
        setField(term20969, term20969.getClass(), "defaultBranch", "WQnMpDlSfA");
        setField(term20969, term20969.getClass(), "sshUrlToRepo", "aOIvTQtXiv");
        setField(term20969, term20969.getClass(), "httpUrlToRepo", "IyjDiknqhA");
        setField(term20969, term20969.getClass(), "webUrl", "IHsXSAFYKi");
        setField(term20969, term20969.getClass(), "readmeUrl", "KyGbLglqbW");
        setField(term20969, term20969.getClass(), "avatarUrl", "ZKVeStsSNT");
        setField(term20969, term20969.getClass(), "forksCount", term21114);
        setField(term20969, term20969.getClass(), "starCount", term21116);
        setIntField(term21119, term21119.getClass(), "year", 2023);
        setShortField(term21119, term21119.getClass(), "month", (short) 3);
        setShortField(term21119, term21119.getClass(), "day", (short) 7);
        setField(term21118, term21118.getClass(), "date", term21119);
        setByteField(term21123, term21123.getClass(), "hour", (byte) 21);
        setByteField(term21123, term21123.getClass(), "minute", (byte) 15);
        setByteField(term21123, term21123.getClass(), "second", (byte) 43);
        setIntField(term21123, term21123.getClass(), "nano", 639721472);
        setField(term21118, term21118.getClass(), "time", term21123);
        setField(term20969, term20969.getClass(), "lastActivityAt", term21118);
        setField(term21128, term21128.getClass(), "id", term21129);
        setField(term21128, term21128.getClass(), "name", "cqCXYaAnFB");
        setField(term21128, term21128.getClass(), "path", "UPLNFZHXjw");
        setField(term21128, term21128.getClass(), "kind", "CwrrJlrGmg");
        setField(term21128, term21128.getClass(), "fullPath", "HejzvyejjG");
        setField(term21128, term21128.getClass(), "parentId", term21179);
        setField(term21128, term21128.getClass(), "avatarUrl", "pbqJjeooBM");
        setField(term21128, term21128.getClass(), "webUrl", "ccnotFfPXt");
        setField(term20969, term20969.getClass(), "namespace", term21128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWithNamespace", argTypes, term20969, args);
    }

};


