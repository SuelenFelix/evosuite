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

public class JavbusDataItem_setPublishDate_32370026818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6180;

    public JavbusDataItem_setPublishDate_32370026818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6235 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term6235, term6235.getClass(), "starName", "");
        setField(term6235, term6235.getClass(), "startPageUrl", "");
        ArrayList term6233 = new ArrayList();
        ((ArrayList) term6233).add(term6235);
        ArrayList term6265 = new ArrayList();
        ((ArrayList) term6265).add("IbUFkzIgzq");
        ((ArrayList) term6265).add("dTOUSTDdbw");
        ((ArrayList) term6265).add("PECfBejlfo");
        ((ArrayList) term6265).add("SDbDgydVpg");
        ((ArrayList) term6265).add("EEMaiNkiOH");
        ((ArrayList) term6265).add("sFdmTylvqh");
        Object term6343 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term6343, term6343.getClass(), "title", "");
        setField(term6343, term6343.getClass(), "resolution", "");
        setField(term6343, term6343.getClass(), "subTitle", "");
        setField(term6343, term6343.getClass(), "fileSize", "");
        setField(term6343, term6343.getClass(), "shareDate", "");
        setField(term6343, term6343.getClass(), "magnentStr", "");
        Object term6350 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term6350, term6350.getClass(), "title", "");
        setField(term6350, term6350.getClass(), "resolution", "");
        setField(term6350, term6350.getClass(), "subTitle", "");
        setField(term6350, term6350.getClass(), "fileSize", "");
        setField(term6350, term6350.getClass(), "shareDate", "");
        setField(term6350, term6350.getClass(), "magnentStr", "");
        Object term6357 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term6357, term6357.getClass(), "title", "");
        setField(term6357, term6357.getClass(), "resolution", "");
        setField(term6357, term6357.getClass(), "subTitle", "");
        setField(term6357, term6357.getClass(), "fileSize", "");
        setField(term6357, term6357.getClass(), "shareDate", "");
        setField(term6357, term6357.getClass(), "magnentStr", "");
        ArrayList term6341 = new ArrayList();
        ((ArrayList) term6341).add(term6343);
        ((ArrayList) term6341).add(term6350);
        ((ArrayList) term6341).add(term6357);
        term6180 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term6240 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term6180, term6180.getClass(), "videoPreviewUrl", "tViQSKUCLE");
        setField(term6180, term6180.getClass(), "messageChatId", "QbaeHheqiP");
        setField(term6180, term6180.getClass(), "allFilmCount", "");
        setField(term6180, term6180.getClass(), "haveMagnentCount", "");
        setField(term6180, term6180.getClass(), "visitUrl", "");
        setField(term6180, term6180.getClass(), "bigImgUrl", "");
        setField(term6180, term6180.getClass(), "titleStr", "");
        setField(term6180, term6180.getClass(), "code", "");
        setField(term6180, term6180.getClass(), "publishDate", "");
        setField(term6180, term6180.getClass(), "totalTime", "");
        setField(term6180, term6180.getClass(), "director", "");
        setField(term6180, term6180.getClass(), "produceCompany", "");
        setField(term6180, term6180.getClass(), "publishCompany", "");
        setField(term6180, term6180.getClass(), "series", "");
        setField(term6180, term6180.getClass(), "types", "");
        setField(term6180, term6180.getClass(), "stars", "");
        setField(term6180, term6180.getClass(), "starsPageUrls", term6233);
        setField(term6240, term6240.getClass(), "starName", "cAObIvLmLo");
        setField(term6240, term6240.getClass(), "startPageUrl", "xwiCqRSWSe");
        setField(term6180, term6180.getClass(), "mainStarPageUrl", term6240);
        setField(term6180, term6180.getClass(), "sampleImgs", term6265);
        setField(term6180, term6180.getClass(), "magnents", term6341);
        setIntField(term6180, term6180.getClass(), "fetchRetry", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iSQqMWMRlU";
        callMethod(klass, "setPublishDate", argTypes, term6180, args);
    }

};


