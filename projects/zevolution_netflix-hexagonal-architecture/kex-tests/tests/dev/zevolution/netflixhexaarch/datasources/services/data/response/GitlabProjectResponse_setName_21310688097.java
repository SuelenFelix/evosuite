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

public class GitlabProjectResponse_setName_21310688097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23447;

    public GitlabProjectResponse_setName_21310688097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term23448 = new Integer(-2015048153);
        Integer term23592 = new Integer(-2063457669);
        Integer term23594 = new Integer(-1222006000);
        Integer term23607 = new Integer(2095798786);
        Integer term23657 = new Integer(-1565502840);
        term23447 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term23510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23515 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23596 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23597 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23601 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23606 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term23447, term23447.getClass(), "id", term23448);
        setField(term23447, term23447.getClass(), "description", "jlhonEGrJH");
        setField(term23447, term23447.getClass(), "name", "RKcKwlEYZb");
        setField(term23447, term23447.getClass(), "nameWithNamespace", "acPRDlpsid");
        setField(term23447, term23447.getClass(), "path", "YyojIzvxLZ");
        setField(term23447, term23447.getClass(), "pathWithNamespace", "fxapaYlZea");
        setIntField(term23511, term23511.getClass(), "year", 2017);
        setShortField(term23511, term23511.getClass(), "month", (short) 3);
        setShortField(term23511, term23511.getClass(), "day", (short) 5);
        setField(term23510, term23510.getClass(), "date", term23511);
        setByteField(term23515, term23515.getClass(), "hour", (byte) 20);
        setByteField(term23515, term23515.getClass(), "minute", (byte) 34);
        setByteField(term23515, term23515.getClass(), "second", (byte) 55);
        setIntField(term23515, term23515.getClass(), "nano", 78024496);
        setField(term23510, term23510.getClass(), "time", term23515);
        setField(term23447, term23447.getClass(), "createdAt", term23510);
        setField(term23447, term23447.getClass(), "defaultBranch", "VJgREHwfRM");
        setField(term23447, term23447.getClass(), "sshUrlToRepo", "kXnpLIZTAr");
        setField(term23447, term23447.getClass(), "httpUrlToRepo", "ZiMAmqpbzk");
        setField(term23447, term23447.getClass(), "webUrl", "UwJtBPAtSU");
        setField(term23447, term23447.getClass(), "readmeUrl", "nBaMiSdFmS");
        setField(term23447, term23447.getClass(), "avatarUrl", "ezwGsjqTai");
        setField(term23447, term23447.getClass(), "forksCount", term23592);
        setField(term23447, term23447.getClass(), "starCount", term23594);
        setIntField(term23597, term23597.getClass(), "year", 2020);
        setShortField(term23597, term23597.getClass(), "month", (short) 7);
        setShortField(term23597, term23597.getClass(), "day", (short) 24);
        setField(term23596, term23596.getClass(), "date", term23597);
        setByteField(term23601, term23601.getClass(), "hour", (byte) 0);
        setByteField(term23601, term23601.getClass(), "minute", (byte) 59);
        setByteField(term23601, term23601.getClass(), "second", (byte) 56);
        setIntField(term23601, term23601.getClass(), "nano", 320219201);
        setField(term23596, term23596.getClass(), "time", term23601);
        setField(term23447, term23447.getClass(), "lastActivityAt", term23596);
        setField(term23606, term23606.getClass(), "id", term23607);
        setField(term23606, term23606.getClass(), "name", "ngeHWMRjnn");
        setField(term23606, term23606.getClass(), "path", "FOKfDXQxMM");
        setField(term23606, term23606.getClass(), "kind", "gbxMvhrWpA");
        setField(term23606, term23606.getClass(), "fullPath", "huNTIobUHx");
        setField(term23606, term23606.getClass(), "parentId", term23657);
        setField(term23606, term23606.getClass(), "avatarUrl", "MrVeCmRVzF");
        setField(term23606, term23606.getClass(), "webUrl", "CPVnQYACKw");
        setField(term23447, term23447.getClass(), "namespace", term23606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sbdLhVCRsw";
        callMethod(klass, "setName", argTypes, term23447, args);
    }

};


