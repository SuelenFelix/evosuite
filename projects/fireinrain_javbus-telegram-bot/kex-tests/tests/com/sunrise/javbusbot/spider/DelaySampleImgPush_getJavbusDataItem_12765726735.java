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

public class DelaySampleImgPush_getJavbusDataItem_12765726735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19765;

    public DelaySampleImgPush_getJavbusDataItem_12765726735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19833 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19833, term19833.getClass(), "starName", null);
        setField(term19833, term19833.getClass(), "startPageUrl", null);
        Object term19834 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19834, term19834.getClass(), "starName", null);
        setField(term19834, term19834.getClass(), "startPageUrl", null);
        Object term19835 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19835, term19835.getClass(), "starName", null);
        setField(term19835, term19835.getClass(), "startPageUrl", null);
        Object term19836 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19836, term19836.getClass(), "starName", null);
        setField(term19836, term19836.getClass(), "startPageUrl", null);
        Object term19837 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19837, term19837.getClass(), "starName", null);
        setField(term19837, term19837.getClass(), "startPageUrl", null);
        Object term19838 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19838, term19838.getClass(), "starName", null);
        setField(term19838, term19838.getClass(), "startPageUrl", null);
        Object term19839 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19839, term19839.getClass(), "starName", null);
        setField(term19839, term19839.getClass(), "startPageUrl", null);
        Object term19840 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19840, term19840.getClass(), "starName", null);
        setField(term19840, term19840.getClass(), "startPageUrl", null);
        Object term19841 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19841, term19841.getClass(), "starName", null);
        setField(term19841, term19841.getClass(), "startPageUrl", null);
        ArrayList term19831 = new ArrayList();
        ((ArrayList) term19831).add(term19833);
        ((ArrayList) term19831).add(term19834);
        ((ArrayList) term19831).add(term19835);
        ((ArrayList) term19831).add(term19836);
        ((ArrayList) term19831).add(term19837);
        ((ArrayList) term19831).add(term19838);
        ((ArrayList) term19831).add(term19839);
        ((ArrayList) term19831).add(term19840);
        ((ArrayList) term19831).add(term19841);
        ArrayList term19869 = new ArrayList();
        ((ArrayList) term19869).add("");
        ((ArrayList) term19869).add("");
        ((ArrayList) term19869).add("");
        ((ArrayList) term19869).add("");
        ((ArrayList) term19869).add("");
        ArrayList term19878 = new ArrayList();
        term19765 = newInstance(Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush"));
        Object term19778 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term19844 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term19765, term19765.getClass(), "code", "ryTUTfVgWx");
        setField(term19778, term19778.getClass(), "videoPreviewUrl", "ImdGsYOHJc");
        setField(term19778, term19778.getClass(), "messageChatId", "MBkxidzets");
        setField(term19778, term19778.getClass(), "allFilmCount", "");
        setField(term19778, term19778.getClass(), "haveMagnentCount", "");
        setField(term19778, term19778.getClass(), "visitUrl", "");
        setField(term19778, term19778.getClass(), "bigImgUrl", "");
        setField(term19778, term19778.getClass(), "titleStr", "");
        setField(term19778, term19778.getClass(), "code", "");
        setField(term19778, term19778.getClass(), "publishDate", "");
        setField(term19778, term19778.getClass(), "totalTime", "");
        setField(term19778, term19778.getClass(), "director", "");
        setField(term19778, term19778.getClass(), "produceCompany", "");
        setField(term19778, term19778.getClass(), "publishCompany", "");
        setField(term19778, term19778.getClass(), "series", "");
        setField(term19778, term19778.getClass(), "types", "");
        setField(term19778, term19778.getClass(), "stars", "");
        setField(term19778, term19778.getClass(), "starsPageUrls", term19831);
        setField(term19844, term19844.getClass(), "starName", "DhSWasYJlP");
        setField(term19844, term19844.getClass(), "startPageUrl", "JOSsHVpnAd");
        setField(term19778, term19778.getClass(), "mainStarPageUrl", term19844);
        setField(term19778, term19778.getClass(), "sampleImgs", term19869);
        setField(term19778, term19778.getClass(), "magnents", term19878);
        setIntField(term19778, term19778.getClass(), "fetchRetry", 1240914516);
        setField(term19765, term19765.getClass(), "javbusDataItem", term19778);
        setLongField(term19765, term19765.getClass(), "excuteTime", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.DelaySampleImgPush");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJavbusDataItem", argTypes, term19765, args);
    }

};


