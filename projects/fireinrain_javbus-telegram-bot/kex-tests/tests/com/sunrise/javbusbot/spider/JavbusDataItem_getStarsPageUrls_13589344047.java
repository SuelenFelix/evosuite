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

public class JavbusDataItem_getStarsPageUrls_13589344047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2808;

    public JavbusDataItem_getStarsPageUrls_13589344047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2863 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term2863, term2863.getClass(), "starName", "");
        setField(term2863, term2863.getClass(), "startPageUrl", "");
        ArrayList term2861 = new ArrayList();
        ((ArrayList) term2861).add(term2863);
        ArrayList term2893 = new ArrayList();
        ((ArrayList) term2893).add("lkdvUiYwRq");
        ((ArrayList) term2893).add("XuxkPrpfND");
        ((ArrayList) term2893).add("OxNXeKMDje");
        ((ArrayList) term2893).add("hGTqHomrbc");
        ((ArrayList) term2893).add("NNMBrIWEBw");
        ((ArrayList) term2893).add("GrTaccOQzl");
        Object term2971 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term2971, term2971.getClass(), "title", "");
        setField(term2971, term2971.getClass(), "resolution", "");
        setField(term2971, term2971.getClass(), "subTitle", "");
        setField(term2971, term2971.getClass(), "fileSize", "");
        setField(term2971, term2971.getClass(), "shareDate", "");
        setField(term2971, term2971.getClass(), "magnentStr", "");
        Object term2978 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term2978, term2978.getClass(), "title", "");
        setField(term2978, term2978.getClass(), "resolution", "");
        setField(term2978, term2978.getClass(), "subTitle", "");
        setField(term2978, term2978.getClass(), "fileSize", "");
        setField(term2978, term2978.getClass(), "shareDate", "");
        setField(term2978, term2978.getClass(), "magnentStr", "");
        Object term2985 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term2985, term2985.getClass(), "title", "");
        setField(term2985, term2985.getClass(), "resolution", "");
        setField(term2985, term2985.getClass(), "subTitle", "");
        setField(term2985, term2985.getClass(), "fileSize", "");
        setField(term2985, term2985.getClass(), "shareDate", "");
        setField(term2985, term2985.getClass(), "magnentStr", "");
        Object term2992 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term2992, term2992.getClass(), "title", "");
        setField(term2992, term2992.getClass(), "resolution", "");
        setField(term2992, term2992.getClass(), "subTitle", "");
        setField(term2992, term2992.getClass(), "fileSize", "");
        setField(term2992, term2992.getClass(), "shareDate", "");
        setField(term2992, term2992.getClass(), "magnentStr", "");
        ArrayList term2969 = new ArrayList();
        ((ArrayList) term2969).add(term2971);
        ((ArrayList) term2969).add(term2978);
        ((ArrayList) term2969).add(term2985);
        ((ArrayList) term2969).add(term2992);
        term2808 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term2868 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term2808, term2808.getClass(), "videoPreviewUrl", "qMKmSzOQXg");
        setField(term2808, term2808.getClass(), "messageChatId", "CURQCMkqbZ");
        setField(term2808, term2808.getClass(), "allFilmCount", "");
        setField(term2808, term2808.getClass(), "haveMagnentCount", "");
        setField(term2808, term2808.getClass(), "visitUrl", "");
        setField(term2808, term2808.getClass(), "bigImgUrl", "");
        setField(term2808, term2808.getClass(), "titleStr", "");
        setField(term2808, term2808.getClass(), "code", "");
        setField(term2808, term2808.getClass(), "publishDate", "");
        setField(term2808, term2808.getClass(), "totalTime", "");
        setField(term2808, term2808.getClass(), "director", "");
        setField(term2808, term2808.getClass(), "produceCompany", "");
        setField(term2808, term2808.getClass(), "publishCompany", "");
        setField(term2808, term2808.getClass(), "series", "");
        setField(term2808, term2808.getClass(), "types", "");
        setField(term2808, term2808.getClass(), "stars", "");
        setField(term2808, term2808.getClass(), "starsPageUrls", term2861);
        setField(term2868, term2868.getClass(), "starName", "EyojsbSjWT");
        setField(term2868, term2868.getClass(), "startPageUrl", "szGicGyWDL");
        setField(term2808, term2808.getClass(), "mainStarPageUrl", term2868);
        setField(term2808, term2808.getClass(), "sampleImgs", term2893);
        setField(term2808, term2808.getClass(), "magnents", term2969);
        setIntField(term2808, term2808.getClass(), "fetchRetry", 1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStarsPageUrls", argTypes, term2808, args);
    }

};


