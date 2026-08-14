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

public class GitlabProjectResponse_setAvatarUrl_32150046426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27201;

    public GitlabProjectResponse_setAvatarUrl_32150046426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term27202 = new Integer(-1945706126);
        Integer term27346 = new Integer(1152356969);
        Integer term27348 = new Integer(-1667990367);
        Integer term27361 = new Integer(-1214628358);
        Integer term27411 = new Integer(1102721075);
        term27201 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse"));
        Object term27264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27350 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27351 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27355 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27360 = newInstance(Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabNameSpaceResponse"));
        setField(term27201, term27201.getClass(), "id", term27202);
        setField(term27201, term27201.getClass(), "description", "pHBHlmLIZQ");
        setField(term27201, term27201.getClass(), "name", "ZWRAbOuktl");
        setField(term27201, term27201.getClass(), "nameWithNamespace", "iqFRvFmVID");
        setField(term27201, term27201.getClass(), "path", "pNAEtppZdv");
        setField(term27201, term27201.getClass(), "pathWithNamespace", "VsFWNMdyRt");
        setIntField(term27265, term27265.getClass(), "year", 2021);
        setShortField(term27265, term27265.getClass(), "month", (short) 4);
        setShortField(term27265, term27265.getClass(), "day", (short) 17);
        setField(term27264, term27264.getClass(), "date", term27265);
        setByteField(term27269, term27269.getClass(), "hour", (byte) 4);
        setByteField(term27269, term27269.getClass(), "minute", (byte) 11);
        setByteField(term27269, term27269.getClass(), "second", (byte) 16);
        setIntField(term27269, term27269.getClass(), "nano", 509895858);
        setField(term27264, term27264.getClass(), "time", term27269);
        setField(term27201, term27201.getClass(), "createdAt", term27264);
        setField(term27201, term27201.getClass(), "defaultBranch", "QaoYFZhScg");
        setField(term27201, term27201.getClass(), "sshUrlToRepo", "UTvXIenLCR");
        setField(term27201, term27201.getClass(), "httpUrlToRepo", "PLeKpWaxhQ");
        setField(term27201, term27201.getClass(), "webUrl", "EBSKhqDdUW");
        setField(term27201, term27201.getClass(), "readmeUrl", "LvLbdICdfA");
        setField(term27201, term27201.getClass(), "avatarUrl", "rtifrlITwl");
        setField(term27201, term27201.getClass(), "forksCount", term27346);
        setField(term27201, term27201.getClass(), "starCount", term27348);
        setIntField(term27351, term27351.getClass(), "year", 2011);
        setShortField(term27351, term27351.getClass(), "month", (short) 6);
        setShortField(term27351, term27351.getClass(), "day", (short) 26);
        setField(term27350, term27350.getClass(), "date", term27351);
        setByteField(term27355, term27355.getClass(), "hour", (byte) 22);
        setByteField(term27355, term27355.getClass(), "minute", (byte) 39);
        setByteField(term27355, term27355.getClass(), "second", (byte) 11);
        setIntField(term27355, term27355.getClass(), "nano", 686293604);
        setField(term27350, term27350.getClass(), "time", term27355);
        setField(term27201, term27201.getClass(), "lastActivityAt", term27350);
        setField(term27360, term27360.getClass(), "id", term27361);
        setField(term27360, term27360.getClass(), "name", "yGWXZDjnPS");
        setField(term27360, term27360.getClass(), "path", "vZucxbGVyo");
        setField(term27360, term27360.getClass(), "kind", "ZZoLNbeORl");
        setField(term27360, term27360.getClass(), "fullPath", "XjIOUIzJUP");
        setField(term27360, term27360.getClass(), "parentId", term27411);
        setField(term27360, term27360.getClass(), "avatarUrl", "iGTpXnnTqB");
        setField(term27360, term27360.getClass(), "webUrl", "XgJzBOYfQB");
        setField(term27201, term27201.getClass(), "namespace", term27360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GAPGgDekVG";
        callMethod(klass, "setAvatarUrl", argTypes, term27201, args);
    }

};


