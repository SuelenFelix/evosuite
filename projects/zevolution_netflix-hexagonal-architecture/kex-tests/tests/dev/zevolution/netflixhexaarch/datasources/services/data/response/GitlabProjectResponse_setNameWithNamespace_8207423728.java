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

public class GitlabProjectResponse_setNameWithNamespace_8207423728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19707;

    public GitlabProjectResponse_setNameWithNamespace_8207423728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term19708 = new Integer(339854490);
        Integer term19852 = new Integer(-615654495);
        Integer term19854 = new Integer(-1476117762);
        Integer term19867 = new Integer(-341962980);
        Integer term19917 = new Integer(1532716628);
        term19707 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term19770 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19771 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19775 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19856 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19857 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19861 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19866 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term19707, term19707.getClass(), "id", term19708);
        setField(term19707, term19707.getClass(), "description", "qMKmSzOQXg");
        setField(term19707, term19707.getClass(), "name", "CURQCMkqbZ");
        setField(term19707, term19707.getClass(), "nameWithNamespace", "VZwkkQktrm");
        setField(term19707, term19707.getClass(), "path", "wIuJvIvEMb");
        setField(term19707, term19707.getClass(), "pathWithNamespace", "EyojsbSjWT");
        setIntField(term19771, term19771.getClass(), "year", 2012);
        setShortField(term19771, term19771.getClass(), "month", (short) 2);
        setShortField(term19771, term19771.getClass(), "day", (short) 19);
        setField(term19770, term19770.getClass(), "date", term19771);
        setByteField(term19775, term19775.getClass(), "hour", (byte) 8);
        setByteField(term19775, term19775.getClass(), "minute", (byte) 4);
        setByteField(term19775, term19775.getClass(), "second", (byte) 43);
        setIntField(term19775, term19775.getClass(), "nano", 114930008);
        setField(term19770, term19770.getClass(), "time", term19775);
        setField(term19707, term19707.getClass(), "createdAt", term19770);
        setField(term19707, term19707.getClass(), "defaultBranch", "szGicGyWDL");
        setField(term19707, term19707.getClass(), "sshUrlToRepo", "lkdvUiYwRq");
        setField(term19707, term19707.getClass(), "httpUrlToRepo", "XuxkPrpfND");
        setField(term19707, term19707.getClass(), "webUrl", "OxNXeKMDje");
        setField(term19707, term19707.getClass(), "readmeUrl", "hGTqHomrbc");
        setField(term19707, term19707.getClass(), "avatarUrl", "NNMBrIWEBw");
        setField(term19707, term19707.getClass(), "forksCount", term19852);
        setField(term19707, term19707.getClass(), "starCount", term19854);
        setIntField(term19857, term19857.getClass(), "year", 2017);
        setShortField(term19857, term19857.getClass(), "month", (short) 6);
        setShortField(term19857, term19857.getClass(), "day", (short) 8);
        setField(term19856, term19856.getClass(), "date", term19857);
        setByteField(term19861, term19861.getClass(), "hour", (byte) 0);
        setByteField(term19861, term19861.getClass(), "minute", (byte) 18);
        setByteField(term19861, term19861.getClass(), "second", (byte) 55);
        setIntField(term19861, term19861.getClass(), "nano", 680586717);
        setField(term19856, term19856.getClass(), "time", term19861);
        setField(term19707, term19707.getClass(), "lastActivityAt", term19856);
        setField(term19866, term19866.getClass(), "id", term19867);
        setField(term19866, term19866.getClass(), "name", "GrTaccOQzl");
        setField(term19866, term19866.getClass(), "path", "uuSYOUCVHU");
        setField(term19866, term19866.getClass(), "kind", "DfWwbodtVw");
        setField(term19866, term19866.getClass(), "fullPath", "kTbFMpVWqx");
        setField(term19866, term19866.getClass(), "parentId", term19917);
        setField(term19866, term19866.getClass(), "avatarUrl", "HegRNsidFg");
        setField(term19866, term19866.getClass(), "webUrl", "udRdJkgXmH");
        setField(term19707, term19707.getClass(), "namespace", term19866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FBCXbjHVXO";
        callMethod(klass, "setNameWithNamespace", argTypes, term19707, args);
    }

};


