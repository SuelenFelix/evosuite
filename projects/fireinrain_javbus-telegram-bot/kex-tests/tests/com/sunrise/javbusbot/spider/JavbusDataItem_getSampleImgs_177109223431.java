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

public class JavbusDataItem_getSampleImgs_177109223431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9905;

    public JavbusDataItem_getSampleImgs_177109223431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term9960 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9960, term9960.getClass(), "starName", "");
        setField(term9960, term9960.getClass(), "startPageUrl", "");
        Object term9963 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9963, term9963.getClass(), "starName", "");
        setField(term9963, term9963.getClass(), "startPageUrl", "");
        Object term9966 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9966, term9966.getClass(), "starName", "");
        setField(term9966, term9966.getClass(), "startPageUrl", "");
        ArrayList term9958 = new ArrayList();
        ((ArrayList) term9958).add(term9960);
        ((ArrayList) term9958).add(term9963);
        ((ArrayList) term9958).add(term9966);
        ArrayList term9996 = new ArrayList();
        ArrayList term10000 = new ArrayList();
        term9905 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term9971 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term9905, term9905.getClass(), "videoPreviewUrl", "lzZIObOJmC");
        setField(term9905, term9905.getClass(), "messageChatId", "RFmGKwvSgz");
        setField(term9905, term9905.getClass(), "allFilmCount", "");
        setField(term9905, term9905.getClass(), "haveMagnentCount", "");
        setField(term9905, term9905.getClass(), "visitUrl", "");
        setField(term9905, term9905.getClass(), "bigImgUrl", "");
        setField(term9905, term9905.getClass(), "titleStr", "");
        setField(term9905, term9905.getClass(), "code", "");
        setField(term9905, term9905.getClass(), "publishDate", "");
        setField(term9905, term9905.getClass(), "totalTime", "");
        setField(term9905, term9905.getClass(), "director", "");
        setField(term9905, term9905.getClass(), "produceCompany", "");
        setField(term9905, term9905.getClass(), "publishCompany", "");
        setField(term9905, term9905.getClass(), "series", "");
        setField(term9905, term9905.getClass(), "types", "");
        setField(term9905, term9905.getClass(), "stars", "");
        setField(term9905, term9905.getClass(), "starsPageUrls", term9958);
        setField(term9971, term9971.getClass(), "starName", "SqMpUczXhg");
        setField(term9971, term9971.getClass(), "startPageUrl", "voDQuoTpgt");
        setField(term9905, term9905.getClass(), "mainStarPageUrl", term9971);
        setField(term9905, term9905.getClass(), "sampleImgs", term9996);
        setField(term9905, term9905.getClass(), "magnents", term10000);
        setIntField(term9905, term9905.getClass(), "fetchRetry", 493620644);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSampleImgs", argTypes, term9905, args);
    }

};


