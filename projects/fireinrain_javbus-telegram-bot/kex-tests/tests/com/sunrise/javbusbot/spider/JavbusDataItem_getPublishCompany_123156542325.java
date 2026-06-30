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

public class JavbusDataItem_getPublishCompany_123156542325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8355;

    public JavbusDataItem_getPublishCompany_123156542325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8410 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8410, term8410.getClass(), "starName", "");
        setField(term8410, term8410.getClass(), "startPageUrl", "");
        Object term8413 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8413, term8413.getClass(), "starName", "");
        setField(term8413, term8413.getClass(), "startPageUrl", "");
        Object term8416 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8416, term8416.getClass(), "starName", "");
        setField(term8416, term8416.getClass(), "startPageUrl", "");
        ArrayList term8408 = new ArrayList();
        ((ArrayList) term8408).add(term8410);
        ((ArrayList) term8408).add(term8413);
        ((ArrayList) term8408).add(term8416);
        ArrayList term8446 = new ArrayList();
        Object term8452 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term8452, term8452.getClass(), "title", "");
        setField(term8452, term8452.getClass(), "resolution", "");
        setField(term8452, term8452.getClass(), "subTitle", "");
        setField(term8452, term8452.getClass(), "fileSize", "");
        setField(term8452, term8452.getClass(), "shareDate", "");
        setField(term8452, term8452.getClass(), "magnentStr", "");
        ArrayList term8450 = new ArrayList();
        ((ArrayList) term8450).add(term8452);
        term8355 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term8421 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term8355, term8355.getClass(), "videoPreviewUrl", "SJLRFsNagf");
        setField(term8355, term8355.getClass(), "messageChatId", "UsCZaSgXzI");
        setField(term8355, term8355.getClass(), "allFilmCount", "");
        setField(term8355, term8355.getClass(), "haveMagnentCount", "");
        setField(term8355, term8355.getClass(), "visitUrl", "");
        setField(term8355, term8355.getClass(), "bigImgUrl", "");
        setField(term8355, term8355.getClass(), "titleStr", "");
        setField(term8355, term8355.getClass(), "code", "");
        setField(term8355, term8355.getClass(), "publishDate", "");
        setField(term8355, term8355.getClass(), "totalTime", "");
        setField(term8355, term8355.getClass(), "director", "");
        setField(term8355, term8355.getClass(), "produceCompany", "");
        setField(term8355, term8355.getClass(), "publishCompany", "");
        setField(term8355, term8355.getClass(), "series", "");
        setField(term8355, term8355.getClass(), "types", "");
        setField(term8355, term8355.getClass(), "stars", "");
        setField(term8355, term8355.getClass(), "starsPageUrls", term8408);
        setField(term8421, term8421.getClass(), "starName", "OCCDQbndDE");
        setField(term8421, term8421.getClass(), "startPageUrl", "NMANMKfctU");
        setField(term8355, term8355.getClass(), "mainStarPageUrl", term8421);
        setField(term8355, term8355.getClass(), "sampleImgs", term8446);
        setField(term8355, term8355.getClass(), "magnents", term8450);
        setIntField(term8355, term8355.getClass(), "fetchRetry", -1786399638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublishCompany", argTypes, term8355, args);
    }

};


