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

public class GitlabProjectResponse_getPathWithNamespace_81861616312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25543;

    public GitlabProjectResponse_getPathWithNamespace_81861616312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term25544 = new Integer(229204365);
        Integer term25688 = new Integer(-461771056);
        Integer term25690 = new Integer(-243422082);
        Integer term25703 = new Integer(1384592638);
        Integer term25753 = new Integer(-1002370457);
        term25543 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term25606 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25607 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25611 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25692 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25693 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25702 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term25543, term25543.getClass(), "id", term25544);
        setField(term25543, term25543.getClass(), "description", "cuWgFcYkPC");
        setField(term25543, term25543.getClass(), "name", "HfbcOKkXBm");
        setField(term25543, term25543.getClass(), "nameWithNamespace", "pLbTzSMbsN");
        setField(term25543, term25543.getClass(), "path", "lFSbxerCPP");
        setField(term25543, term25543.getClass(), "pathWithNamespace", "vjaZIyixCm");
        setIntField(term25607, term25607.getClass(), "year", 2021);
        setShortField(term25607, term25607.getClass(), "month", (short) 8);
        setShortField(term25607, term25607.getClass(), "day", (short) 12);
        setField(term25606, term25606.getClass(), "date", term25607);
        setByteField(term25611, term25611.getClass(), "hour", (byte) 2);
        setByteField(term25611, term25611.getClass(), "minute", (byte) 17);
        setByteField(term25611, term25611.getClass(), "second", (byte) 51);
        setIntField(term25611, term25611.getClass(), "nano", 207375141);
        setField(term25606, term25606.getClass(), "time", term25611);
        setField(term25543, term25543.getClass(), "createdAt", term25606);
        setField(term25543, term25543.getClass(), "defaultBranch", "gAAPyftlIR");
        setField(term25543, term25543.getClass(), "sshUrlToRepo", "kevWstoxwq");
        setField(term25543, term25543.getClass(), "httpUrlToRepo", "aSYOhFwzSm");
        setField(term25543, term25543.getClass(), "webUrl", "pVZlzrBeDB");
        setField(term25543, term25543.getClass(), "readmeUrl", "EfSUvjuZAA");
        setField(term25543, term25543.getClass(), "avatarUrl", "PrHWfHydsG");
        setField(term25543, term25543.getClass(), "forksCount", term25688);
        setField(term25543, term25543.getClass(), "starCount", term25690);
        setIntField(term25693, term25693.getClass(), "year", 2025);
        setShortField(term25693, term25693.getClass(), "month", (short) 11);
        setShortField(term25693, term25693.getClass(), "day", (short) 3);
        setField(term25692, term25692.getClass(), "date", term25693);
        setByteField(term25697, term25697.getClass(), "hour", (byte) 21);
        setByteField(term25697, term25697.getClass(), "minute", (byte) 24);
        setByteField(term25697, term25697.getClass(), "second", (byte) 23);
        setIntField(term25697, term25697.getClass(), "nano", 210986721);
        setField(term25692, term25692.getClass(), "time", term25697);
        setField(term25543, term25543.getClass(), "lastActivityAt", term25692);
        setField(term25702, term25702.getClass(), "id", term25703);
        setField(term25702, term25702.getClass(), "name", "igruEzTbBE");
        setField(term25702, term25702.getClass(), "path", "LFjgROsRUV");
        setField(term25702, term25702.getClass(), "kind", "kHxujKiCsr");
        setField(term25702, term25702.getClass(), "fullPath", "cseZveWowm");
        setField(term25702, term25702.getClass(), "parentId", term25753);
        setField(term25702, term25702.getClass(), "avatarUrl", "idfslIPhgx");
        setField(term25702, term25702.getClass(), "webUrl", "HyFLOXeoDX");
        setField(term25543, term25543.getClass(), "namespace", term25702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWithNamespace", argTypes, term25543, args);
    }

};


