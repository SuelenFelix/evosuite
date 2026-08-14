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

public class GitlabProjectResponse_getForksCount_161805827029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32204;

    public GitlabProjectResponse_getForksCount_161805827029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32205 = new Integer(1959097203);
        Integer term32349 = new Integer(-209654048);
        Integer term32351 = new Integer(477625804);
        Integer term32364 = new Integer(252575029);
        Integer term32414 = new Integer(57189932);
        term32204 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term32267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32272 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term32363 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term32204, term32204.getClass(), "id", term32205);
        setField(term32204, term32204.getClass(), "description", "ywoADeiUfF");
        setField(term32204, term32204.getClass(), "name", "loHiudJxbt");
        setField(term32204, term32204.getClass(), "nameWithNamespace", "lRbxbybNew");
        setField(term32204, term32204.getClass(), "path", "WzGudiEARD");
        setField(term32204, term32204.getClass(), "pathWithNamespace", "IoefPqGtaj");
        setIntField(term32268, term32268.getClass(), "year", 2029);
        setShortField(term32268, term32268.getClass(), "month", (short) 1);
        setShortField(term32268, term32268.getClass(), "day", (short) 10);
        setField(term32267, term32267.getClass(), "date", term32268);
        setByteField(term32272, term32272.getClass(), "hour", (byte) 8);
        setByteField(term32272, term32272.getClass(), "minute", (byte) 46);
        setByteField(term32272, term32272.getClass(), "second", (byte) 35);
        setIntField(term32272, term32272.getClass(), "nano", 58807194);
        setField(term32267, term32267.getClass(), "time", term32272);
        setField(term32204, term32204.getClass(), "createdAt", term32267);
        setField(term32204, term32204.getClass(), "defaultBranch", "YMmtjELJuB");
        setField(term32204, term32204.getClass(), "sshUrlToRepo", "FzyIShiOmb");
        setField(term32204, term32204.getClass(), "httpUrlToRepo", "PEUfeJaZTk");
        setField(term32204, term32204.getClass(), "webUrl", "AIvyeIdskz");
        setField(term32204, term32204.getClass(), "readmeUrl", "iSQqMWMRlU");
        setField(term32204, term32204.getClass(), "avatarUrl", "djWEnlbOXu");
        setField(term32204, term32204.getClass(), "forksCount", term32349);
        setField(term32204, term32204.getClass(), "starCount", term32351);
        setIntField(term32354, term32354.getClass(), "year", 2016);
        setShortField(term32354, term32354.getClass(), "month", (short) 10);
        setShortField(term32354, term32354.getClass(), "day", (short) 20);
        setField(term32353, term32353.getClass(), "date", term32354);
        setByteField(term32358, term32358.getClass(), "hour", (byte) 18);
        setByteField(term32358, term32358.getClass(), "minute", (byte) 39);
        setByteField(term32358, term32358.getClass(), "second", (byte) 1);
        setIntField(term32358, term32358.getClass(), "nano", 196253988);
        setField(term32353, term32353.getClass(), "time", term32358);
        setField(term32204, term32204.getClass(), "lastActivityAt", term32353);
        setField(term32363, term32363.getClass(), "id", term32364);
        setField(term32363, term32363.getClass(), "name", "MvDMzQBWME");
        setField(term32363, term32363.getClass(), "path", "sZyAwmdGVS");
        setField(term32363, term32363.getClass(), "kind", "VoKhXiLAaW");
        setField(term32363, term32363.getClass(), "fullPath", "CaalXzRXQI");
        setField(term32363, term32363.getClass(), "parentId", term32414);
        setField(term32363, term32363.getClass(), "avatarUrl", "eRBnKPjyVg");
        setField(term32363, term32363.getClass(), "webUrl", "svPqsHBvrm");
        setField(term32204, term32204.getClass(), "namespace", term32363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getForksCount", argTypes, term32204, args);
    }

};


