package com.github.cuteluobo.livedanmuarchive.pojo.biliapi;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.biliapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class VideoAllInfo_getAvId_5528890665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7553;

    public VideoAllInfo_getAvId_5528890665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7620 = new ArrayList();
        Object term7640 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7640, term7640.getClass(), "cid", -7983954942068142191L);
        setIntField(term7640, term7640.getClass(), "page", -243422082);
        setField(term7640, term7640.getClass(), "from", "");
        setField(term7640, term7640.getClass(), "partName", "");
        setLongField(term7640, term7640.getClass(), "duration", 2274723545906746965L);
        setIntField(term7640, term7640.getClass(), "width", 1384592638);
        setIntField(term7640, term7640.getClass(), "height", -1002370457);
        setBooleanField(term7640, term7640.getClass(), "rotate", true);
        ArrayList term7638 = new ArrayList();
        ((ArrayList) term7638).add(term7640);
        ArrayList term7651 = new ArrayList();
        ((ArrayList) term7651).add("XjDhvToxJy");
        ((ArrayList) term7651).add("nxSTJflLQy");
        ((ArrayList) term7651).add("FlHzxEfFzI");
        ((ArrayList) term7651).add("aSATgQUpoe");
        ((ArrayList) term7651).add("VkPSXewZfB");
        term7553 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term7553, term7553.getClass(), "bvId", "dwlZSxlXOo");
        setIntField(term7553, term7553.getClass(), "avId", 11724947);
        setIntField(term7553, term7553.getClass(), "videos", 1953277050);
        setIntField(term7553, term7553.getClass(), "tid", 1283079251);
        setField(term7553, term7553.getClass(), "tName", "lKrEAkypza");
        setIntField(term7553, term7553.getClass(), "copyright", -523949691);
        setField(term7553, term7553.getClass(), "pic", "KtuuNAqGCQ");
        setField(term7553, term7553.getClass(), "title", "OGQsfjmReM");
        setIntField(term7553, term7553.getClass(), "pubDate", 1398204340);
        setIntField(term7553, term7553.getClass(), "ctime", 229204365);
        setField(term7553, term7553.getClass(), "desc", "YsUtbngnRO");
        setField(term7553, term7553.getClass(), "descV2", term7620);
        setIntField(term7553, term7553.getClass(), "state", -461771056);
        setLongField(term7553, term7553.getClass(), "duration", -1571034605670661708L);
        setField(term7553, term7553.getClass(), "creatorUid", "JisaWUxcNb");
        setField(term7553, term7553.getClass(), "pages", term7638);
        setField(term7553, term7553.getClass(), "tagList", term7651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvId", argTypes, term7553, args);
    }

};


