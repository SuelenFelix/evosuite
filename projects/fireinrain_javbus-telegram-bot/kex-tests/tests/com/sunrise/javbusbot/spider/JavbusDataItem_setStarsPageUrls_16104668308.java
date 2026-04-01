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
import java.util.LinkedList;

public class JavbusDataItem_setStarsPageUrls_16104668308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3102;
     Object term3295;

    public JavbusDataItem_setStarsPageUrls_16104668308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3157 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3157, term3157.getClass(), "starName", "");
        setField(term3157, term3157.getClass(), "startPageUrl", "");
        Object term3160 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3160, term3160.getClass(), "starName", "");
        setField(term3160, term3160.getClass(), "startPageUrl", "");
        Object term3163 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3163, term3163.getClass(), "starName", "");
        setField(term3163, term3163.getClass(), "startPageUrl", "");
        Object term3166 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3166, term3166.getClass(), "starName", "");
        setField(term3166, term3166.getClass(), "startPageUrl", "");
        Object term3169 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3169, term3169.getClass(), "starName", "");
        setField(term3169, term3169.getClass(), "startPageUrl", "");
        Object term3172 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3172, term3172.getClass(), "starName", "");
        setField(term3172, term3172.getClass(), "startPageUrl", "");
        ArrayList term3155 = new ArrayList();
        ((ArrayList) term3155).add(term3157);
        ((ArrayList) term3155).add(term3160);
        ((ArrayList) term3155).add(term3163);
        ((ArrayList) term3155).add(term3166);
        ((ArrayList) term3155).add(term3169);
        ((ArrayList) term3155).add(term3172);
        ArrayList term3202 = new ArrayList();
        ((ArrayList) term3202).add("dirFuhqyNu");
        ((ArrayList) term3202).add("YVLRenzuoR");
        ((ArrayList) term3202).add("JukEMhPWql");
        ((ArrayList) term3202).add("ZdNcodHERG");
        ((ArrayList) term3202).add("CLHomjAqIM");
        ((ArrayList) term3202).add("mzCFLzFuSj");
        ((ArrayList) term3202).add("WQnMpDlSfA");
        ArrayList term3290 = new ArrayList();
        term3102 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term3177 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3102, term3102.getClass(), "videoPreviewUrl", "NTXQPWFYSA");
        setField(term3102, term3102.getClass(), "messageChatId", "fOuOhBpldm");
        setField(term3102, term3102.getClass(), "allFilmCount", "");
        setField(term3102, term3102.getClass(), "haveMagnentCount", "");
        setField(term3102, term3102.getClass(), "visitUrl", "");
        setField(term3102, term3102.getClass(), "bigImgUrl", "");
        setField(term3102, term3102.getClass(), "titleStr", "");
        setField(term3102, term3102.getClass(), "code", "");
        setField(term3102, term3102.getClass(), "publishDate", "");
        setField(term3102, term3102.getClass(), "totalTime", "");
        setField(term3102, term3102.getClass(), "director", "");
        setField(term3102, term3102.getClass(), "produceCompany", "");
        setField(term3102, term3102.getClass(), "publishCompany", "");
        setField(term3102, term3102.getClass(), "series", "");
        setField(term3102, term3102.getClass(), "types", "");
        setField(term3102, term3102.getClass(), "stars", "");
        setField(term3102, term3102.getClass(), "starsPageUrls", term3155);
        setField(term3177, term3177.getClass(), "starName", "fuvdkDwBeH");
        setField(term3177, term3177.getClass(), "startPageUrl", "NTefzwLPhx");
        setField(term3102, term3102.getClass(), "mainStarPageUrl", term3177);
        setField(term3102, term3102.getClass(), "sampleImgs", term3202);
        setField(term3102, term3102.getClass(), "magnents", term3290);
        setIntField(term3102, term3102.getClass(), "fetchRetry", -1087774327);
        Object term3298 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term3298, term3298.getClass(), "starName", "aOIvTQtXiv");
        setField(term3298, term3298.getClass(), "startPageUrl", "IyjDiknqhA");
        term3295 = new LinkedList();
        ((LinkedList) term3295).add(term3298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3295;
        callMethod(klass, "setStarsPageUrls", argTypes, term3102, args);
    }

};


