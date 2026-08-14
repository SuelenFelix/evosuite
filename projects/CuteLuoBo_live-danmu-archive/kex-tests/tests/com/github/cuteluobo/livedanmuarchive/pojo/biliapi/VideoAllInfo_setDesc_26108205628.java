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

public class VideoAllInfo_setDesc_26108205628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9472;

    public VideoAllInfo_setDesc_26108205628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9539 = new ArrayList();
        ((ArrayList) term9539).add("jlraKkBWFA");
        ArrayList term9569 = new ArrayList();
        ArrayList term9573 = new ArrayList();
        ((ArrayList) term9573).add("IVacFDAZcj");
        ((ArrayList) term9573).add("EEYmuwyVDP");
        ((ArrayList) term9573).add("EWFbEDAVrE");
        ((ArrayList) term9573).add("EMiMtYgfvr");
        ((ArrayList) term9573).add("OyYyYYnJuF");
        ((ArrayList) term9573).add("aYLvcxZohT");
        term9472 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo"));
        setField(term9472, term9472.getClass(), "bvId", "PGfCDJTBek");
        setIntField(term9472, term9472.getClass(), "avId", -20614472);
        setIntField(term9472, term9472.getClass(), "videos", 1126618861);
        setIntField(term9472, term9472.getClass(), "tid", 947449400);
        setField(term9472, term9472.getClass(), "tName", "ZwjARhAtHC");
        setIntField(term9472, term9472.getClass(), "copyright", -763799087);
        setField(term9472, term9472.getClass(), "pic", "XXvscsYBWv");
        setField(term9472, term9472.getClass(), "title", "uePedtiAfL");
        setIntField(term9472, term9472.getClass(), "pubDate", 1207142014);
        setIntField(term9472, term9472.getClass(), "ctime", -876426634);
        setField(term9472, term9472.getClass(), "desc", "AdSHvysxQB");
        setField(term9472, term9472.getClass(), "descV2", term9539);
        setIntField(term9472, term9472.getClass(), "state", 213831054);
        setLongField(term9472, term9472.getClass(), "duration", 868503089567085985L);
        setField(term9472, term9472.getClass(), "creatorUid", "mRBtFTxVdE");
        setField(term9472, term9472.getClass(), "pages", term9569);
        setField(term9472, term9472.getClass(), "tagList", term9573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.biliapi.VideoAllInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mnHyQbMyld";
        callMethod(klass, "setDesc", argTypes, term9472, args);
    }

};


