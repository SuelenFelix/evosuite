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

public class GitlabProjectResponse_getNamespace_62483333835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34654;

    public GitlabProjectResponse_getNamespace_62483333835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34655 = new Integer(2009020256);
        Integer term34799 = new Integer(2049577015);
        Integer term34801 = new Integer(1236004505);
        Integer term34814 = new Integer(1050765721);
        Integer term34864 = new Integer(474518942);
        term34654 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term34717 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34718 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34722 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34808 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34813 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term34654, term34654.getClass(), "id", term34655);
        setField(term34654, term34654.getClass(), "description", "unvQfYuBUz");
        setField(term34654, term34654.getClass(), "name", "RqnYUpQBbG");
        setField(term34654, term34654.getClass(), "nameWithNamespace", "sKnuhmcjCC");
        setField(term34654, term34654.getClass(), "path", "oCBbVNwMnb");
        setField(term34654, term34654.getClass(), "pathWithNamespace", "miJxAzOVJy");
        setIntField(term34718, term34718.getClass(), "year", 2010);
        setShortField(term34718, term34718.getClass(), "month", (short) 2);
        setShortField(term34718, term34718.getClass(), "day", (short) 24);
        setField(term34717, term34717.getClass(), "date", term34718);
        setByteField(term34722, term34722.getClass(), "hour", (byte) 17);
        setByteField(term34722, term34722.getClass(), "minute", (byte) 58);
        setByteField(term34722, term34722.getClass(), "second", (byte) 56);
        setIntField(term34722, term34722.getClass(), "nano", 291725532);
        setField(term34717, term34717.getClass(), "time", term34722);
        setField(term34654, term34654.getClass(), "createdAt", term34717);
        setField(term34654, term34654.getClass(), "defaultBranch", "kjqlBVaviD");
        setField(term34654, term34654.getClass(), "sshUrlToRepo", "iVRXRDCrcM");
        setField(term34654, term34654.getClass(), "httpUrlToRepo", "WAZFhrxcSM");
        setField(term34654, term34654.getClass(), "webUrl", "gCRUlTuVMX");
        setField(term34654, term34654.getClass(), "readmeUrl", "tYBgGQtkhi");
        setField(term34654, term34654.getClass(), "avatarUrl", "PhGPFLIMKH");
        setField(term34654, term34654.getClass(), "forksCount", term34799);
        setField(term34654, term34654.getClass(), "starCount", term34801);
        setIntField(term34804, term34804.getClass(), "year", 2028);
        setShortField(term34804, term34804.getClass(), "month", (short) 7);
        setShortField(term34804, term34804.getClass(), "day", (short) 22);
        setField(term34803, term34803.getClass(), "date", term34804);
        setByteField(term34808, term34808.getClass(), "hour", (byte) 18);
        setByteField(term34808, term34808.getClass(), "minute", (byte) 33);
        setByteField(term34808, term34808.getClass(), "second", (byte) 7);
        setIntField(term34808, term34808.getClass(), "nano", 763613074);
        setField(term34803, term34803.getClass(), "time", term34808);
        setField(term34654, term34654.getClass(), "lastActivityAt", term34803);
        setField(term34813, term34813.getClass(), "id", term34814);
        setField(term34813, term34813.getClass(), "name", "pWCYcLhoms");
        setField(term34813, term34813.getClass(), "path", "IWNJVfvTuw");
        setField(term34813, term34813.getClass(), "kind", "DLpKfwPpvr");
        setField(term34813, term34813.getClass(), "fullPath", "DLFXidLbuT");
        setField(term34813, term34813.getClass(), "parentId", term34864);
        setField(term34813, term34813.getClass(), "avatarUrl", "FjkxfTXGIH");
        setField(term34813, term34813.getClass(), "webUrl", "KJkWSFFnmR");
        setField(term34654, term34654.getClass(), "namespace", term34813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNamespace", argTypes, term34654, args);
    }

};


