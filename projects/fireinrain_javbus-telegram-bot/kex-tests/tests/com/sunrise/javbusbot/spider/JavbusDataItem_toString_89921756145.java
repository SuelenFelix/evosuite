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

public class JavbusDataItem_toString_89921756145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13799;

    public JavbusDataItem_toString_89921756145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13854 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13854, term13854.getClass(), "starName", "");
        setField(term13854, term13854.getClass(), "startPageUrl", "");
        Object term13857 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13857, term13857.getClass(), "starName", "");
        setField(term13857, term13857.getClass(), "startPageUrl", "");
        Object term13860 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13860, term13860.getClass(), "starName", "");
        setField(term13860, term13860.getClass(), "startPageUrl", "");
        ArrayList term13852 = new ArrayList();
        ((ArrayList) term13852).add(term13854);
        ((ArrayList) term13852).add(term13857);
        ((ArrayList) term13852).add(term13860);
        ArrayList term13890 = new ArrayList();
        ((ArrayList) term13890).add("cFwZnaLmLP");
        ((ArrayList) term13890).add("cBtfnWBMkE");
        ((ArrayList) term13890).add("sFixkFlMhw");
        ((ArrayList) term13890).add("wNaCYPwDGZ");
        ((ArrayList) term13890).add("CFojehEtAR");
        ((ArrayList) term13890).add("EYeLeoxDrM");
        ((ArrayList) term13890).add("zIPJJJubgX");
        ((ArrayList) term13890).add("WRbxmSFTaO");
        ((ArrayList) term13890).add("ZekQCuvPXT");
        Object term14004 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term14004, term14004.getClass(), "title", "");
        setField(term14004, term14004.getClass(), "resolution", "");
        setField(term14004, term14004.getClass(), "subTitle", "");
        setField(term14004, term14004.getClass(), "fileSize", "");
        setField(term14004, term14004.getClass(), "shareDate", "");
        setField(term14004, term14004.getClass(), "magnentStr", "");
        Object term14011 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term14011, term14011.getClass(), "title", "");
        setField(term14011, term14011.getClass(), "resolution", "");
        setField(term14011, term14011.getClass(), "subTitle", "");
        setField(term14011, term14011.getClass(), "fileSize", "");
        setField(term14011, term14011.getClass(), "shareDate", "");
        setField(term14011, term14011.getClass(), "magnentStr", "");
        ArrayList term14002 = new ArrayList();
        ((ArrayList) term14002).add(term14004);
        ((ArrayList) term14002).add(term14011);
        term13799 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term13865 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term13799, term13799.getClass(), "videoPreviewUrl", "KsCWHUcJDd");
        setField(term13799, term13799.getClass(), "messageChatId", "zkYsnzzwJu");
        setField(term13799, term13799.getClass(), "allFilmCount", "");
        setField(term13799, term13799.getClass(), "haveMagnentCount", "");
        setField(term13799, term13799.getClass(), "visitUrl", "");
        setField(term13799, term13799.getClass(), "bigImgUrl", "");
        setField(term13799, term13799.getClass(), "titleStr", "");
        setField(term13799, term13799.getClass(), "code", "");
        setField(term13799, term13799.getClass(), "publishDate", "");
        setField(term13799, term13799.getClass(), "totalTime", "");
        setField(term13799, term13799.getClass(), "director", "");
        setField(term13799, term13799.getClass(), "produceCompany", "");
        setField(term13799, term13799.getClass(), "publishCompany", "");
        setField(term13799, term13799.getClass(), "series", "");
        setField(term13799, term13799.getClass(), "types", "");
        setField(term13799, term13799.getClass(), "stars", "");
        setField(term13799, term13799.getClass(), "starsPageUrls", term13852);
        setField(term13865, term13865.getClass(), "starName", "wIDeyLnekQ");
        setField(term13865, term13865.getClass(), "startPageUrl", "tOGPTIqSMm");
        setField(term13799, term13799.getClass(), "mainStarPageUrl", term13865);
        setField(term13799, term13799.getClass(), "sampleImgs", term13890);
        setField(term13799, term13799.getClass(), "magnents", term14002);
        setIntField(term13799, term13799.getClass(), "fetchRetry", 1265463001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13799, args);
    }

};


