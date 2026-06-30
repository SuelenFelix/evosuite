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

public class JavbusDataItem_getSeries_172569104635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10949;

    public JavbusDataItem_getSeries_172569104635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11004 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11004, term11004.getClass(), "starName", "");
        setField(term11004, term11004.getClass(), "startPageUrl", "");
        Object term11007 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term11007, term11007.getClass(), "starName", "");
        setField(term11007, term11007.getClass(), "startPageUrl", "");
        ArrayList term11002 = new ArrayList();
        ((ArrayList) term11002).add(term11004);
        ((ArrayList) term11002).add(term11007);
        ArrayList term11037 = new ArrayList();
        ((ArrayList) term11037).add("TRfRRMMCZw");
        ((ArrayList) term11037).add("rwbfUcOMVc");
        ((ArrayList) term11037).add("ljTkNgJRUl");
        Object term11079 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11079, term11079.getClass(), "title", "");
        setField(term11079, term11079.getClass(), "resolution", "");
        setField(term11079, term11079.getClass(), "subTitle", "");
        setField(term11079, term11079.getClass(), "fileSize", "");
        setField(term11079, term11079.getClass(), "shareDate", "");
        setField(term11079, term11079.getClass(), "magnentStr", "");
        Object term11086 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11086, term11086.getClass(), "title", "");
        setField(term11086, term11086.getClass(), "resolution", "");
        setField(term11086, term11086.getClass(), "subTitle", "");
        setField(term11086, term11086.getClass(), "fileSize", "");
        setField(term11086, term11086.getClass(), "shareDate", "");
        setField(term11086, term11086.getClass(), "magnentStr", "");
        Object term11093 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11093, term11093.getClass(), "title", "");
        setField(term11093, term11093.getClass(), "resolution", "");
        setField(term11093, term11093.getClass(), "subTitle", "");
        setField(term11093, term11093.getClass(), "fileSize", "");
        setField(term11093, term11093.getClass(), "shareDate", "");
        setField(term11093, term11093.getClass(), "magnentStr", "");
        Object term11100 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11100, term11100.getClass(), "title", "");
        setField(term11100, term11100.getClass(), "resolution", "");
        setField(term11100, term11100.getClass(), "subTitle", "");
        setField(term11100, term11100.getClass(), "fileSize", "");
        setField(term11100, term11100.getClass(), "shareDate", "");
        setField(term11100, term11100.getClass(), "magnentStr", "");
        Object term11107 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11107, term11107.getClass(), "title", "");
        setField(term11107, term11107.getClass(), "resolution", "");
        setField(term11107, term11107.getClass(), "subTitle", "");
        setField(term11107, term11107.getClass(), "fileSize", "");
        setField(term11107, term11107.getClass(), "shareDate", "");
        setField(term11107, term11107.getClass(), "magnentStr", "");
        Object term11114 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term11114, term11114.getClass(), "title", "");
        setField(term11114, term11114.getClass(), "resolution", "");
        setField(term11114, term11114.getClass(), "subTitle", "");
        setField(term11114, term11114.getClass(), "fileSize", "");
        setField(term11114, term11114.getClass(), "shareDate", "");
        setField(term11114, term11114.getClass(), "magnentStr", "");
        ArrayList term11077 = new ArrayList();
        ((ArrayList) term11077).add(term11079);
        ((ArrayList) term11077).add(term11086);
        ((ArrayList) term11077).add(term11093);
        ((ArrayList) term11077).add(term11100);
        ((ArrayList) term11077).add(term11107);
        ((ArrayList) term11077).add(term11114);
        term10949 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term11012 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10949, term10949.getClass(), "videoPreviewUrl", "FtyaWnfsgn");
        setField(term10949, term10949.getClass(), "messageChatId", "qphbpPdwrD");
        setField(term10949, term10949.getClass(), "allFilmCount", "");
        setField(term10949, term10949.getClass(), "haveMagnentCount", "");
        setField(term10949, term10949.getClass(), "visitUrl", "");
        setField(term10949, term10949.getClass(), "bigImgUrl", "");
        setField(term10949, term10949.getClass(), "titleStr", "");
        setField(term10949, term10949.getClass(), "code", "");
        setField(term10949, term10949.getClass(), "publishDate", "");
        setField(term10949, term10949.getClass(), "totalTime", "");
        setField(term10949, term10949.getClass(), "director", "");
        setField(term10949, term10949.getClass(), "produceCompany", "");
        setField(term10949, term10949.getClass(), "publishCompany", "");
        setField(term10949, term10949.getClass(), "series", "");
        setField(term10949, term10949.getClass(), "types", "");
        setField(term10949, term10949.getClass(), "stars", "");
        setField(term10949, term10949.getClass(), "starsPageUrls", term11002);
        setField(term11012, term11012.getClass(), "starName", "HlVHAsOBmJ");
        setField(term11012, term11012.getClass(), "startPageUrl", "nyThJEXHhd");
        setField(term10949, term10949.getClass(), "mainStarPageUrl", term11012);
        setField(term10949, term10949.getClass(), "sampleImgs", term11037);
        setField(term10949, term10949.getClass(), "magnents", term11077);
        setIntField(term10949, term10949.getClass(), "fetchRetry", -1371869594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSeries", argTypes, term10949, args);
    }

};


