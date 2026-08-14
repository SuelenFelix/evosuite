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

public class VideoAllInfo_getPubDate_54883599323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7355;

    public VideoAllInfo_getPubDate_54883599323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7422 = new ArrayList();
        Object term7442 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7442, term7442.getClass(), "cid", -5724112525188606013L);
        setIntField(term7442, term7442.getClass(), "page", -1702055571);
        setField(term7442, term7442.getClass(), "from", "");
        setField(term7442, term7442.getClass(), "partName", "");
        setLongField(term7442, term7442.getClass(), "duration", -6100012593724108983L);
        setIntField(term7442, term7442.getClass(), "width", -944542900);
        setIntField(term7442, term7442.getClass(), "height", 2063762142);
        setBooleanField(term7442, term7442.getClass(), "rotate", false);
        Object term7451 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoPage"));
        setLongField(term7451, term7451.getClass(), "cid", 5465527210299101732L);
        setIntField(term7451, term7451.getClass(), "page", 1658391716);
        setField(term7451, term7451.getClass(), "from", "");
        setField(term7451, term7451.getClass(), "partName", "");
        setLongField(term7451, term7451.getClass(), "duration", 4699157009689333952L);
        setIntField(term7451, term7451.getClass(), "width", 2143282300);
        setIntField(term7451, term7451.getClass(), "height", 1137624258);
        setBooleanField(term7451, term7451.getClass(), "rotate", true);
        ArrayList term7440 = new ArrayList();
        ((ArrayList) term7440).add(term7442);
        ((ArrayList) term7440).add(term7451);
        ArrayList term7462 = new ArrayList();
        ((ArrayList) term7462).add("PSizQDoxxe");
        ((ArrayList) term7462).add("mKaHyMybrK");
        ((ArrayList) term7462).add("AyrEXuGrEj");
        ((ArrayList) term7462).add("yevIIoVYHq");
        ((ArrayList) term7462).add("UuYWMTqWTV");
        ((ArrayList) term7462).add("DSFGlcaXUb");
        ((ArrayList) term7462).add("sHMXNUzNeM");
        term7355 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term7355, term7355.getClass(), "bvId", "SqjyKmayBx");
        setIntField(term7355, term7355.getClass(), "avId", 1820784228);
        setIntField(term7355, term7355.getClass(), "videos", 1390820006);
        setIntField(term7355, term7355.getClass(), "tid", -828982065);
        setField(term7355, term7355.getClass(), "tName", "XjDhvToxJy");
        setIntField(term7355, term7355.getClass(), "copyright", 1221443226);
        setField(term7355, term7355.getClass(), "pic", "nxSTJflLQy");
        setField(term7355, term7355.getClass(), "title", "FlHzxEfFzI");
        setIntField(term7355, term7355.getClass(), "pubDate", 908108726);
        setIntField(term7355, term7355.getClass(), "ctime", 1023209512);
        setField(term7355, term7355.getClass(), "desc", "aSATgQUpoe");
        setField(term7355, term7355.getClass(), "descV2", term7422);
        setIntField(term7355, term7355.getClass(), "state", 1084849225);
        setLongField(term7355, term7355.getClass(), "duration", -5447369594017685765L);
        setField(term7355, term7355.getClass(), "creatorUid", "VkPSXewZfB");
        setField(term7355, term7355.getClass(), "pages", term7440);
        setField(term7355, term7355.getClass(), "tagList", term7462);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPubDate", argTypes, term7355, args);
    }

};


