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

public class JavbusDataItem_setAllFilmCount_124762194742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12973;

    public JavbusDataItem_setAllFilmCount_124762194742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13028 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13028, term13028.getClass(), "starName", "");
        setField(term13028, term13028.getClass(), "startPageUrl", "");
        Object term13031 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13031, term13031.getClass(), "starName", "");
        setField(term13031, term13031.getClass(), "startPageUrl", "");
        Object term13034 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13034, term13034.getClass(), "starName", "");
        setField(term13034, term13034.getClass(), "startPageUrl", "");
        Object term13037 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13037, term13037.getClass(), "starName", "");
        setField(term13037, term13037.getClass(), "startPageUrl", "");
        Object term13040 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13040, term13040.getClass(), "starName", "");
        setField(term13040, term13040.getClass(), "startPageUrl", "");
        ArrayList term13026 = new ArrayList();
        ((ArrayList) term13026).add(term13028);
        ((ArrayList) term13026).add(term13031);
        ((ArrayList) term13026).add(term13034);
        ((ArrayList) term13026).add(term13037);
        ((ArrayList) term13026).add(term13040);
        ArrayList term13070 = new ArrayList();
        ((ArrayList) term13070).add("QbRtvZIDtW");
        ((ArrayList) term13070).add("fbsmDvjMqr");
        ((ArrayList) term13070).add("tycssGWZvU");
        ((ArrayList) term13070).add("jcvrILwbgt");
        Object term13124 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term13124, term13124.getClass(), "title", "");
        setField(term13124, term13124.getClass(), "resolution", "");
        setField(term13124, term13124.getClass(), "subTitle", "");
        setField(term13124, term13124.getClass(), "fileSize", "");
        setField(term13124, term13124.getClass(), "shareDate", "");
        setField(term13124, term13124.getClass(), "magnentStr", "");
        ArrayList term13122 = new ArrayList();
        ((ArrayList) term13122).add(term13124);
        term12973 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term13045 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term12973, term12973.getClass(), "videoPreviewUrl", "agbhgbQisl");
        setField(term12973, term12973.getClass(), "messageChatId", "EZvlAVCXCm");
        setField(term12973, term12973.getClass(), "allFilmCount", "");
        setField(term12973, term12973.getClass(), "haveMagnentCount", "");
        setField(term12973, term12973.getClass(), "visitUrl", "");
        setField(term12973, term12973.getClass(), "bigImgUrl", "");
        setField(term12973, term12973.getClass(), "titleStr", "");
        setField(term12973, term12973.getClass(), "code", "");
        setField(term12973, term12973.getClass(), "publishDate", "");
        setField(term12973, term12973.getClass(), "totalTime", "");
        setField(term12973, term12973.getClass(), "director", "");
        setField(term12973, term12973.getClass(), "produceCompany", "");
        setField(term12973, term12973.getClass(), "publishCompany", "");
        setField(term12973, term12973.getClass(), "series", "");
        setField(term12973, term12973.getClass(), "types", "");
        setField(term12973, term12973.getClass(), "stars", "");
        setField(term12973, term12973.getClass(), "starsPageUrls", term13026);
        setField(term13045, term13045.getClass(), "starName", "PxinRhWgwT");
        setField(term13045, term13045.getClass(), "startPageUrl", "pZcEKUNIXL");
        setField(term12973, term12973.getClass(), "mainStarPageUrl", term13045);
        setField(term12973, term12973.getClass(), "sampleImgs", term13070);
        setField(term12973, term12973.getClass(), "magnents", term13122);
        setIntField(term12973, term12973.getClass(), "fetchRetry", 287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "reGIMbnrGF";
        callMethod(klass, "setAllFilmCount", argTypes, term12973, args);
    }

};


