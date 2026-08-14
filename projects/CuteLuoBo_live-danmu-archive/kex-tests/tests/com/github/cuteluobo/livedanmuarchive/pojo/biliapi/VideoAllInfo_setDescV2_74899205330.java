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
import java.util.LinkedList;

public class VideoAllInfo_setDescV2_74899205330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10161;
     Object term10347;

    public VideoAllInfo_setDescV2_74899205330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10228 = new ArrayList();
        ((ArrayList) term10228).add("YfkhviKZwl");
        Object term10260 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term10260, term10260.getClass(), "cid", 3752337209837437327L);
        setIntField(term10260, term10260.getClass(), "page", 1692937831);
        setField(term10260, term10260.getClass(), "from", "");
        setField(term10260, term10260.getClass(), "partName", "");
        setLongField(term10260, term10260.getClass(), "duration", 1860789353508856614L);
        setIntField(term10260, term10260.getClass(), "width", -1539747985);
        setIntField(term10260, term10260.getClass(), "height", -1982489643);
        setBooleanField(term10260, term10260.getClass(), "rotate", true);
        ArrayList term10258 = new ArrayList();
        ((ArrayList) term10258).add(term10260);
        ArrayList term10271 = new ArrayList();
        ((ArrayList) term10271).add("pdSvedKgPq");
        ((ArrayList) term10271).add("epPTwvcoyb");
        ((ArrayList) term10271).add("UBPHmOICBs");
        ((ArrayList) term10271).add("IDJUVPgUJf");
        ((ArrayList) term10271).add("JmnWRJUxGr");
        ((ArrayList) term10271).add("wgRGBNrTGP");
        term10161 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term10161, term10161.getClass(), "bvId", "HqoTWlkbwF");
        setIntField(term10161, term10161.getClass(), "avId", -1114668574);
        setIntField(term10161, term10161.getClass(), "videos", 514511037);
        setIntField(term10161, term10161.getClass(), "tid", 1713573821);
        setField(term10161, term10161.getClass(), "tName", "CwNELDTAPP");
        setIntField(term10161, term10161.getClass(), "copyright", 1956590498);
        setField(term10161, term10161.getClass(), "pic", "GSzQdbHLHw");
        setField(term10161, term10161.getClass(), "title", "IkfarsYNJO");
        setIntField(term10161, term10161.getClass(), "pubDate", 1467356494);
        setIntField(term10161, term10161.getClass(), "ctime", -26316536);
        setField(term10161, term10161.getClass(), "desc", "aZKOWhHMEh");
        setField(term10161, term10161.getClass(), "descV2", term10228);
        setIntField(term10161, term10161.getClass(), "state", 1716165145);
        setLongField(term10161, term10161.getClass(), "duration", 3108750145697087661L);
        setField(term10161, term10161.getClass(), "creatorUid", "DcOhhAfJTI");
        setField(term10161, term10161.getClass(), "pages", term10258);
        setField(term10161, term10161.getClass(), "tagList", term10271);
        term10347 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10347;
        callMethod(klass, "setDescV2", argTypes, term10161, args);
    }

};


