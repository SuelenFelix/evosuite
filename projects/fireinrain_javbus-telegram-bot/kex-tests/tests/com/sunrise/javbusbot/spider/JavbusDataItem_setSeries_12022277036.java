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

public class JavbusDataItem_setSeries_12022277036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11194;

    public JavbusDataItem_setSeries_12022277036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11249 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11249, term11249.getClass(), "starName", "");
        setField(term11249, term11249.getClass(), "startPageUrl", "");
        ArrayList term11247 = new ArrayList();
        ((ArrayList) term11247).add(term11249);
        ArrayList term11279 = new ArrayList();
        ((ArrayList) term11279).add("nlvRWrTxvz");
        ((ArrayList) term11279).add("isMKwgUmka");
        ((ArrayList) term11279).add("pDIyzhDtTy");
        ((ArrayList) term11279).add("wXiUlhXQoC");
        ((ArrayList) term11279).add("gKhmgJzimH");
        ((ArrayList) term11279).add("OzRiWLVXNx");
        ((ArrayList) term11279).add("pktmgYsknu");
        Object term11369 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11369, term11369.getClass(), "title", "");
        setField(term11369, term11369.getClass(), "resolution", "");
        setField(term11369, term11369.getClass(), "subTitle", "");
        setField(term11369, term11369.getClass(), "fileSize", "");
        setField(term11369, term11369.getClass(), "shareDate", "");
        setField(term11369, term11369.getClass(), "magnentStr", "");
        Object term11376 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11376, term11376.getClass(), "title", "");
        setField(term11376, term11376.getClass(), "resolution", "");
        setField(term11376, term11376.getClass(), "subTitle", "");
        setField(term11376, term11376.getClass(), "fileSize", "");
        setField(term11376, term11376.getClass(), "shareDate", "");
        setField(term11376, term11376.getClass(), "magnentStr", "");
        Object term11383 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11383, term11383.getClass(), "title", "");
        setField(term11383, term11383.getClass(), "resolution", "");
        setField(term11383, term11383.getClass(), "subTitle", "");
        setField(term11383, term11383.getClass(), "fileSize", "");
        setField(term11383, term11383.getClass(), "shareDate", "");
        setField(term11383, term11383.getClass(), "magnentStr", "");
        ArrayList term11367 = new ArrayList();
        ((ArrayList) term11367).add(term11369);
        ((ArrayList) term11367).add(term11376);
        ((ArrayList) term11367).add(term11383);
        term11194 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term11254 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11194, term11194.getClass(), "videoPreviewUrl", "SUIYUFtCCe");
        setField(term11194, term11194.getClass(), "messageChatId", "eKCrPCkedw");
        setField(term11194, term11194.getClass(), "allFilmCount", "");
        setField(term11194, term11194.getClass(), "haveMagnentCount", "");
        setField(term11194, term11194.getClass(), "visitUrl", "");
        setField(term11194, term11194.getClass(), "bigImgUrl", "");
        setField(term11194, term11194.getClass(), "titleStr", "");
        setField(term11194, term11194.getClass(), "code", "");
        setField(term11194, term11194.getClass(), "publishDate", "");
        setField(term11194, term11194.getClass(), "totalTime", "");
        setField(term11194, term11194.getClass(), "director", "");
        setField(term11194, term11194.getClass(), "produceCompany", "");
        setField(term11194, term11194.getClass(), "publishCompany", "");
        setField(term11194, term11194.getClass(), "series", "");
        setField(term11194, term11194.getClass(), "types", "");
        setField(term11194, term11194.getClass(), "stars", "");
        setField(term11194, term11194.getClass(), "starsPageUrls", term11247);
        setField(term11254, term11254.getClass(), "starName", "wVOypfVLsP");
        setField(term11254, term11254.getClass(), "startPageUrl", "pEazBcUUWX");
        setField(term11194, term11194.getClass(), "mainStarPageUrl", term11254);
        setField(term11194, term11194.getClass(), "sampleImgs", term11279);
        setField(term11194, term11194.getClass(), "magnents", term11367);
        setIntField(term11194, term11194.getClass(), "fetchRetry", -2095575670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FuCKfgAhpC";
        callMethod(klass, "setSeries", argTypes, term11194, args);
    }

};


