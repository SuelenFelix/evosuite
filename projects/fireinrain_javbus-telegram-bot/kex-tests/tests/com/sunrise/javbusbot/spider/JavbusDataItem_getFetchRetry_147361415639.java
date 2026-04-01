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

public class JavbusDataItem_getFetchRetry_147361415639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12116;

    public JavbusDataItem_getFetchRetry_147361415639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term12171 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term12171, term12171.getClass(), "starName", "");
        setField(term12171, term12171.getClass(), "startPageUrl", "");
        Object term12174 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term12174, term12174.getClass(), "starName", "");
        setField(term12174, term12174.getClass(), "startPageUrl", "");
        ArrayList term12169 = new ArrayList();
        ((ArrayList) term12169).add(term12171);
        ((ArrayList) term12169).add(term12174);
        ArrayList term12204 = new ArrayList();
        ((ArrayList) term12204).add("SCmsfHIEPK");
        ((ArrayList) term12204).add("dFOuezLNWb");
        ((ArrayList) term12204).add("PUWJnLuyiR");
        ((ArrayList) term12204).add("ADhJCRgHaS");
        ((ArrayList) term12204).add("qociGUMzem");
        Object term12270 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term12270, term12270.getClass(), "title", "");
        setField(term12270, term12270.getClass(), "resolution", "");
        setField(term12270, term12270.getClass(), "subTitle", "");
        setField(term12270, term12270.getClass(), "fileSize", "");
        setField(term12270, term12270.getClass(), "shareDate", "");
        setField(term12270, term12270.getClass(), "magnentStr", "");
        Object term12277 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term12277, term12277.getClass(), "title", "");
        setField(term12277, term12277.getClass(), "resolution", "");
        setField(term12277, term12277.getClass(), "subTitle", "");
        setField(term12277, term12277.getClass(), "fileSize", "");
        setField(term12277, term12277.getClass(), "shareDate", "");
        setField(term12277, term12277.getClass(), "magnentStr", "");
        ArrayList term12268 = new ArrayList();
        ((ArrayList) term12268).add(term12270);
        ((ArrayList) term12268).add(term12277);
        term12116 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term12179 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term12116, term12116.getClass(), "videoPreviewUrl", "uxoFwkPfXf");
        setField(term12116, term12116.getClass(), "messageChatId", "OoVnZTvxUt");
        setField(term12116, term12116.getClass(), "allFilmCount", "");
        setField(term12116, term12116.getClass(), "haveMagnentCount", "");
        setField(term12116, term12116.getClass(), "visitUrl", "");
        setField(term12116, term12116.getClass(), "bigImgUrl", "");
        setField(term12116, term12116.getClass(), "titleStr", "");
        setField(term12116, term12116.getClass(), "code", "");
        setField(term12116, term12116.getClass(), "publishDate", "");
        setField(term12116, term12116.getClass(), "totalTime", "");
        setField(term12116, term12116.getClass(), "director", "");
        setField(term12116, term12116.getClass(), "produceCompany", "");
        setField(term12116, term12116.getClass(), "publishCompany", "");
        setField(term12116, term12116.getClass(), "series", "");
        setField(term12116, term12116.getClass(), "types", "");
        setField(term12116, term12116.getClass(), "stars", "");
        setField(term12116, term12116.getClass(), "starsPageUrls", term12169);
        setField(term12179, term12179.getClass(), "starName", "mPQmjoknqi");
        setField(term12179, term12179.getClass(), "startPageUrl", "gLgvePQRQT");
        setField(term12116, term12116.getClass(), "mainStarPageUrl", term12179);
        setField(term12116, term12116.getClass(), "sampleImgs", term12204);
        setField(term12116, term12116.getClass(), "magnents", term12268);
        setIntField(term12116, term12116.getClass(), "fetchRetry", -1588772968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFetchRetry", argTypes, term12116, args);
    }

};


