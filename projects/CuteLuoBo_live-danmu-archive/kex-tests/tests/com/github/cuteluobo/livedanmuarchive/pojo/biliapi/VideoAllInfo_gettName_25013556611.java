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

public class VideoAllInfo_gettName_25013556611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9585;

    public VideoAllInfo_gettName_25013556611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9652 = new ArrayList();
        ((ArrayList) term9652).add("PNoWXrsFic");
        ((ArrayList) term9652).add("QZBHZqZope");
        ((ArrayList) term9652).add("VBUahCvyxC");
        ((ArrayList) term9652).add("MlzTkzKMCX");
        ArrayList term9718 = new ArrayList();
        ArrayList term9722 = new ArrayList();
        ((ArrayList) term9722).add("QpYltHAdyY");
        ((ArrayList) term9722).add("lbmSGBwIiV");
        ((ArrayList) term9722).add("DAxyHoTLzZ");
        ((ArrayList) term9722).add("fhZgTouhCC");
        ((ArrayList) term9722).add("wrikqJwXvL");
        ((ArrayList) term9722).add("UiWhvbypdr");
        ((ArrayList) term9722).add("CgleElJNje");
        term9585 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term9585, term9585.getClass(), "bvId", "zHvfKaOstO");
        setIntField(term9585, term9585.getClass(), "avId", 267763294);
        setIntField(term9585, term9585.getClass(), "videos", -1497710478);
        setIntField(term9585, term9585.getClass(), "tid", 49950830);
        setField(term9585, term9585.getClass(), "tName", "tOszriqETr");
        setIntField(term9585, term9585.getClass(), "copyright", -525257914);
        setField(term9585, term9585.getClass(), "pic", "ncSPTkhKjO");
        setField(term9585, term9585.getClass(), "title", "jcWKHRWhyj");
        setIntField(term9585, term9585.getClass(), "pubDate", 147209682);
        setIntField(term9585, term9585.getClass(), "ctime", 34470066);
        setField(term9585, term9585.getClass(), "desc", "nrQjODRMLD");
        setField(term9585, term9585.getClass(), "descV2", term9652);
        setIntField(term9585, term9585.getClass(), "state", 2058711405);
        setLongField(term9585, term9585.getClass(), "duration", 1278107327214302894L);
        setField(term9585, term9585.getClass(), "creatorUid", "UqKUbMyPMJ");
        setField(term9585, term9585.getClass(), "pages", term9718);
        setField(term9585, term9585.getClass(), "tagList", term9722);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "gettName", argTypes, term9585, args);
    }

};


