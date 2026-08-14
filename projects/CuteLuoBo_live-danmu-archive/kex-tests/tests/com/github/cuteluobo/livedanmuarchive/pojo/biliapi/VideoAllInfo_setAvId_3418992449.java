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
import java.lang.Integer;

public class VideoAllInfo_setAvId_3418992449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2156;
     Object term2285;

    public VideoAllInfo_setAvId_3418992449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2223 = new ArrayList();
        ((ArrayList) term2223).add("lHfTrWKMPk");
        ArrayList term2253 = new ArrayList();
        ArrayList term2257 = new ArrayList();
        ((ArrayList) term2257).add("mLUZFTfjle");
        ((ArrayList) term2257).add("xIeFjkHkOe");
        term2156 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term2156, term2156.getClass(), "bvId", "dpNsDgfPso");
        setIntField(term2156, term2156.getClass(), "avId", 1532716628);
        setIntField(term2156, term2156.getClass(), "videos", -1801760683);
        setIntField(term2156, term2156.getClass(), "tid", 1141317871);
        setField(term2156, term2156.getClass(), "tName", "hCWPJQKpdc");
        setIntField(term2156, term2156.getClass(), "copyright", 890669485);
        setField(term2156, term2156.getClass(), "pic", "WzMEhMXkKx");
        setField(term2156, term2156.getClass(), "title", "XOiDvlDhdc");
        setIntField(term2156, term2156.getClass(), "pubDate", 691577392);
        setIntField(term2156, term2156.getClass(), "ctime", -893623680);
        setField(term2156, term2156.getClass(), "desc", "AdxvLJhNLe");
        setField(term2156, term2156.getClass(), "descV2", term2223);
        setIntField(term2156, term2156.getClass(), "state", -1963434938);
        setLongField(term2156, term2156.getClass(), "duration", -6645965768855543712L);
        setField(term2156, term2156.getClass(), "creatorUid", "JDaAnsVTGV");
        setField(term2156, term2156.getClass(), "pages", term2253);
        setField(term2156, term2156.getClass(), "tagList", term2257);
        term2285 = new Integer(906181092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2285;
        callMethod(klass, "setAvId", argTypes, term2156, args);
    }

};


