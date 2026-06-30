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

public class JavbusDataItem_setStars_213524949630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9684;

    public JavbusDataItem_setStars_213524949630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9739 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9739, term9739.getClass(), "starName", "");
        setField(term9739, term9739.getClass(), "startPageUrl", "");
        Object term9742 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9742, term9742.getClass(), "starName", "");
        setField(term9742, term9742.getClass(), "startPageUrl", "");
        Object term9745 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9745, term9745.getClass(), "starName", "");
        setField(term9745, term9745.getClass(), "startPageUrl", "");
        Object term9748 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9748, term9748.getClass(), "starName", "");
        setField(term9748, term9748.getClass(), "startPageUrl", "");
        Object term9751 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9751, term9751.getClass(), "starName", "");
        setField(term9751, term9751.getClass(), "startPageUrl", "");
        Object term9754 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9754, term9754.getClass(), "starName", "");
        setField(term9754, term9754.getClass(), "startPageUrl", "");
        Object term9757 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9757, term9757.getClass(), "starName", "");
        setField(term9757, term9757.getClass(), "startPageUrl", "");
        Object term9760 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9760, term9760.getClass(), "starName", "");
        setField(term9760, term9760.getClass(), "startPageUrl", "");
        ArrayList term9737 = new ArrayList();
        ((ArrayList) term9737).add(term9739);
        ((ArrayList) term9737).add(term9742);
        ((ArrayList) term9737).add(term9745);
        ((ArrayList) term9737).add(term9748);
        ((ArrayList) term9737).add(term9751);
        ((ArrayList) term9737).add(term9754);
        ((ArrayList) term9737).add(term9757);
        ((ArrayList) term9737).add(term9760);
        ArrayList term9790 = new ArrayList();
        ((ArrayList) term9790).add("GdjCkRsIrS");
        ((ArrayList) term9790).add("MJNyYzLhkh");
        ArrayList term9818 = new ArrayList();
        term9684 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term9765 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9684, term9684.getClass(), "videoPreviewUrl", "IbOvZLmtSE");
        setField(term9684, term9684.getClass(), "messageChatId", "AOsIglRFcp");
        setField(term9684, term9684.getClass(), "allFilmCount", "");
        setField(term9684, term9684.getClass(), "haveMagnentCount", "");
        setField(term9684, term9684.getClass(), "visitUrl", "");
        setField(term9684, term9684.getClass(), "bigImgUrl", "");
        setField(term9684, term9684.getClass(), "titleStr", "");
        setField(term9684, term9684.getClass(), "code", "");
        setField(term9684, term9684.getClass(), "publishDate", "");
        setField(term9684, term9684.getClass(), "totalTime", "");
        setField(term9684, term9684.getClass(), "director", "");
        setField(term9684, term9684.getClass(), "produceCompany", "");
        setField(term9684, term9684.getClass(), "publishCompany", "");
        setField(term9684, term9684.getClass(), "series", "");
        setField(term9684, term9684.getClass(), "types", "");
        setField(term9684, term9684.getClass(), "stars", "");
        setField(term9684, term9684.getClass(), "starsPageUrls", term9737);
        setField(term9765, term9765.getClass(), "starName", "rQFBspqBzf");
        setField(term9765, term9765.getClass(), "startPageUrl", "FmWhAOGAMI");
        setField(term9684, term9684.getClass(), "mainStarPageUrl", term9765);
        setField(term9684, term9684.getClass(), "sampleImgs", term9790);
        setField(term9684, term9684.getClass(), "magnents", term9818);
        setIntField(term9684, term9684.getClass(), "fetchRetry", -184153539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DEugGJIaYt";
        callMethod(klass, "setStars", argTypes, term9684, args);
    }

};


