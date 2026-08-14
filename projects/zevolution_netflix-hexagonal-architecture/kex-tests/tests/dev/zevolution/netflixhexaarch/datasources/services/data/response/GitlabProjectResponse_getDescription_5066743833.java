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

public class GitlabProjectResponse_getDescription_5066743833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17633;

    public GitlabProjectResponse_getDescription_5066743833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term17634 = new Integer(-481533957);
        Integer term17778 = new Integer(1240914516);
        Integer term17780 = new Integer(-1465035361);
        Integer term17793 = new Integer(1090617576);
        Integer term17843 = new Integer(-1547384488);
        term17633 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term17696 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17697 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17701 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term17787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term17792 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term17633, term17633.getClass(), "id", term17634);
        setField(term17633, term17633.getClass(), "description", "YupgKTSEiI");
        setField(term17633, term17633.getClass(), "name", "HuOUlaFmvJ");
        setField(term17633, term17633.getClass(), "nameWithNamespace", "dWVwcwFGNo");
        setField(term17633, term17633.getClass(), "path", "PNdLRrSAIY");
        setField(term17633, term17633.getClass(), "pathWithNamespace", "nJnRIRiLZK");
        setIntField(term17697, term17697.getClass(), "year", 2022);
        setShortField(term17697, term17697.getClass(), "month", (short) 2);
        setShortField(term17697, term17697.getClass(), "day", (short) 26);
        setField(term17696, term17696.getClass(), "date", term17697);
        setByteField(term17701, term17701.getClass(), "hour", (byte) 11);
        setByteField(term17701, term17701.getClass(), "minute", (byte) 42);
        setByteField(term17701, term17701.getClass(), "second", (byte) 15);
        setIntField(term17701, term17701.getClass(), "nano", 377731937);
        setField(term17696, term17696.getClass(), "time", term17701);
        setField(term17633, term17633.getClass(), "createdAt", term17696);
        setField(term17633, term17633.getClass(), "defaultBranch", "eWnrMSbYbT");
        setField(term17633, term17633.getClass(), "sshUrlToRepo", "AjoFvDFyCY");
        setField(term17633, term17633.getClass(), "httpUrlToRepo", "OFTJwdPiTG");
        setField(term17633, term17633.getClass(), "webUrl", "QiUprSEluR");
        setField(term17633, term17633.getClass(), "readmeUrl", "cDOXXottZh");
        setField(term17633, term17633.getClass(), "avatarUrl", "rfqJDkDppz");
        setField(term17633, term17633.getClass(), "forksCount", term17778);
        setField(term17633, term17633.getClass(), "starCount", term17780);
        setIntField(term17783, term17783.getClass(), "year", 2026);
        setShortField(term17783, term17783.getClass(), "month", (short) 12);
        setShortField(term17783, term17783.getClass(), "day", (short) 14);
        setField(term17782, term17782.getClass(), "date", term17783);
        setByteField(term17787, term17787.getClass(), "hour", (byte) 16);
        setByteField(term17787, term17787.getClass(), "minute", (byte) 34);
        setByteField(term17787, term17787.getClass(), "second", (byte) 9);
        setIntField(term17787, term17787.getClass(), "nano", 518326996);
        setField(term17782, term17782.getClass(), "time", term17787);
        setField(term17633, term17633.getClass(), "lastActivityAt", term17782);
        setField(term17792, term17792.getClass(), "id", term17793);
        setField(term17792, term17792.getClass(), "name", "MGorMVGauT");
        setField(term17792, term17792.getClass(), "path", "jXKxUGTuEF");
        setField(term17792, term17792.getClass(), "kind", "nDCcyhiTnS");
        setField(term17792, term17792.getClass(), "fullPath", "Bcivwcjece");
        setField(term17792, term17792.getClass(), "parentId", term17843);
        setField(term17792, term17792.getClass(), "avatarUrl", "QTefjRuiez");
        setField(term17792, term17792.getClass(), "webUrl", "SQZVNkAVBB");
        setField(term17633, term17633.getClass(), "namespace", term17792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term17633, args);
    }

};


