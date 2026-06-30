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
import java.util.ArrayList;
import java.lang.Object;

public class JavbusDataItem_toPrettyStr_50352363546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14151;

    public JavbusDataItem_toPrettyStr_50352363546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term14206 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14206, term14206.getClass(), "starName", "");
        setField(term14206, term14206.getClass(), "startPageUrl", "");
        Object term14209 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14209, term14209.getClass(), "starName", "");
        setField(term14209, term14209.getClass(), "startPageUrl", "");
        Object term14212 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14212, term14212.getClass(), "starName", "");
        setField(term14212, term14212.getClass(), "startPageUrl", "");
        Object term14215 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14215, term14215.getClass(), "starName", "");
        setField(term14215, term14215.getClass(), "startPageUrl", "");
        Object term14218 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14218, term14218.getClass(), "starName", "");
        setField(term14218, term14218.getClass(), "startPageUrl", "");
        ArrayList term14204 = new ArrayList();
        ((ArrayList) term14204).add(term14206);
        ((ArrayList) term14204).add(term14209);
        ((ArrayList) term14204).add(term14212);
        ((ArrayList) term14204).add(term14215);
        ((ArrayList) term14204).add(term14218);
        ArrayList term14248 = new ArrayList();
        ((ArrayList) term14248).add("MuJvYyPzjX");
        ((ArrayList) term14248).add("pEZeQhLjKN");
        ((ArrayList) term14248).add("saKRDpPnGD");
        ((ArrayList) term14248).add("UesGweYSco");
        ((ArrayList) term14248).add("uVnPUUZHSY");
        ((ArrayList) term14248).add("LaWPqdDqyl");
        ((ArrayList) term14248).add("BGDjrSZTJY");
        ((ArrayList) term14248).add("VUVCEVItic");
        ((ArrayList) term14248).add("tloEDDASGy");
        Object term14362 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term14362, term14362.getClass(), "title", "");
        setField(term14362, term14362.getClass(), "resolution", "");
        setField(term14362, term14362.getClass(), "subTitle", "");
        setField(term14362, term14362.getClass(), "fileSize", "");
        setField(term14362, term14362.getClass(), "shareDate", "");
        setField(term14362, term14362.getClass(), "magnentStr", "");
        Object term14369 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term14369, term14369.getClass(), "title", "");
        setField(term14369, term14369.getClass(), "resolution", "");
        setField(term14369, term14369.getClass(), "subTitle", "");
        setField(term14369, term14369.getClass(), "fileSize", "");
        setField(term14369, term14369.getClass(), "shareDate", "");
        setField(term14369, term14369.getClass(), "magnentStr", "");
        ArrayList term14360 = new ArrayList();
        ((ArrayList) term14360).add(term14362);
        ((ArrayList) term14360).add(term14369);
        term14151 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term14223 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term14151, term14151.getClass(), "videoPreviewUrl", "WIJiLZqEqc");
        setField(term14151, term14151.getClass(), "messageChatId", "OuZMVgPpoE");
        setField(term14151, term14151.getClass(), "allFilmCount", "");
        setField(term14151, term14151.getClass(), "haveMagnentCount", "");
        setField(term14151, term14151.getClass(), "visitUrl", "");
        setField(term14151, term14151.getClass(), "bigImgUrl", "");
        setField(term14151, term14151.getClass(), "titleStr", "");
        setField(term14151, term14151.getClass(), "code", "");
        setField(term14151, term14151.getClass(), "publishDate", "");
        setField(term14151, term14151.getClass(), "totalTime", "");
        setField(term14151, term14151.getClass(), "director", "");
        setField(term14151, term14151.getClass(), "produceCompany", "");
        setField(term14151, term14151.getClass(), "publishCompany", "");
        setField(term14151, term14151.getClass(), "series", "");
        setField(term14151, term14151.getClass(), "types", "");
        setField(term14151, term14151.getClass(), "stars", "");
        setField(term14151, term14151.getClass(), "starsPageUrls", term14204);
        setField(term14223, term14223.getClass(), "starName", "aCfzlsgXhB");
        setField(term14223, term14223.getClass(), "startPageUrl", "HmhoMiUgEv");
        setField(term14151, term14151.getClass(), "mainStarPageUrl", term14223);
        setField(term14151, term14151.getClass(), "sampleImgs", term14248);
        setField(term14151, term14151.getClass(), "magnents", term14360);
        setIntField(term14151, term14151.getClass(), "fetchRetry", 335112684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toPrettyStr", argTypes, term14151, args);
    }

};


