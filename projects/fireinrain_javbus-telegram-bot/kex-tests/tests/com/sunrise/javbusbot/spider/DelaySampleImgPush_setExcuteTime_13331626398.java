package com.sunrise.javbusbot.spider;

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
import static com.sunrise.javbusbot.spider.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Long;

public class DelaySampleImgPush_setExcuteTime_13331626398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20578;
     Object term20691;

    public DelaySampleImgPush_setExcuteTime_13331626398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20646 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term20646, term20646.getClass(), "starName", null);
        setField(term20646, term20646.getClass(), "startPageUrl", null);
        Object term20647 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term20647, term20647.getClass(), "starName", null);
        setField(term20647, term20647.getClass(), "startPageUrl", null);
        ArrayList term20644 = new ArrayList();
        ((ArrayList) term20644).add(term20646);
        ((ArrayList) term20644).add(term20647);
        ArrayList term20675 = new ArrayList();
        ((ArrayList) term20675).add("");
        ((ArrayList) term20675).add("");
        ((ArrayList) term20675).add("");
        ((ArrayList) term20675).add("");
        ((ArrayList) term20675).add("");
        Object term20686 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term20686, term20686.getClass(), "title", null);
        setField(term20686, term20686.getClass(), "resolution", null);
        setField(term20686, term20686.getClass(), "subTitle", null);
        setField(term20686, term20686.getClass(), "fileSize", null);
        setField(term20686, term20686.getClass(), "shareDate", null);
        setField(term20686, term20686.getClass(), "magnentStr", null);
        ArrayList term20684 = new ArrayList();
        ((ArrayList) term20684).add(term20686);
        term20578 = newInstance(Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush"));
        Object term20591 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term20650 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term20578, term20578.getClass(), "code", "SRphuuiFTJ");
        setField(term20591, term20591.getClass(), "videoPreviewUrl", "SLJslBhpEj");
        setField(term20591, term20591.getClass(), "messageChatId", "BkSzKYsyMt");
        setField(term20591, term20591.getClass(), "allFilmCount", "");
        setField(term20591, term20591.getClass(), "haveMagnentCount", "");
        setField(term20591, term20591.getClass(), "visitUrl", "");
        setField(term20591, term20591.getClass(), "bigImgUrl", "");
        setField(term20591, term20591.getClass(), "titleStr", "");
        setField(term20591, term20591.getClass(), "code", "");
        setField(term20591, term20591.getClass(), "publishDate", "");
        setField(term20591, term20591.getClass(), "totalTime", "");
        setField(term20591, term20591.getClass(), "director", "");
        setField(term20591, term20591.getClass(), "produceCompany", "");
        setField(term20591, term20591.getClass(), "publishCompany", "");
        setField(term20591, term20591.getClass(), "series", "");
        setField(term20591, term20591.getClass(), "types", "");
        setField(term20591, term20591.getClass(), "stars", "");
        setField(term20591, term20591.getClass(), "starsPageUrls", term20644);
        setField(term20650, term20650.getClass(), "starName", "CvltyVwJfx");
        setField(term20650, term20650.getClass(), "startPageUrl", "aKQcZIBmMO");
        setField(term20591, term20591.getClass(), "mainStarPageUrl", term20650);
        setField(term20591, term20591.getClass(), "sampleImgs", term20675);
        setField(term20591, term20591.getClass(), "magnents", term20684);
        setIntField(term20591, term20591.getClass(), "fetchRetry", 1442160736);
        setField(term20578, term20578.getClass(), "javbusDataItem", term20591);
        setLongField(term20578, term20578.getClass(), "excuteTime", -7237588299778557629L);
        term20691 = new Long(6967924379644551255L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term20691;
        callMethod(klass, "setExcuteTime", argTypes, term20578, args);
    }

};


