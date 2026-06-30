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

public class JavbusDataItem_setMagnents_55128620334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10664;
     Object term10846;

    public JavbusDataItem_setMagnents_55128620334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10719 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10719, term10719.getClass(), "starName", "");
        setField(term10719, term10719.getClass(), "startPageUrl", "");
        Object term10722 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10722, term10722.getClass(), "starName", "");
        setField(term10722, term10722.getClass(), "startPageUrl", "");
        Object term10725 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10725, term10725.getClass(), "starName", "");
        setField(term10725, term10725.getClass(), "startPageUrl", "");
        Object term10728 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10728, term10728.getClass(), "starName", "");
        setField(term10728, term10728.getClass(), "startPageUrl", "");
        ArrayList term10717 = new ArrayList();
        ((ArrayList) term10717).add(term10719);
        ((ArrayList) term10717).add(term10722);
        ((ArrayList) term10717).add(term10725);
        ((ArrayList) term10717).add(term10728);
        ArrayList term10758 = new ArrayList();
        ((ArrayList) term10758).add("CPZCLJxTuA");
        ((ArrayList) term10758).add("ivAOXnVjmg");
        ((ArrayList) term10758).add("FivesaUeHG");
        ((ArrayList) term10758).add("TnpXhZmCRY");
        ((ArrayList) term10758).add("ECVAXFhrTP");
        ((ArrayList) term10758).add("ypytdNbrBc");
        Object term10836 = newInstance(Class.forName("com.sunrise.javbusbot.spider.MagnentItem"));
        setField(term10836, term10836.getClass(), "title", "");
        setField(term10836, term10836.getClass(), "resolution", "");
        setField(term10836, term10836.getClass(), "subTitle", "");
        setField(term10836, term10836.getClass(), "fileSize", "");
        setField(term10836, term10836.getClass(), "shareDate", "");
        setField(term10836, term10836.getClass(), "magnentStr", "");
        ArrayList term10834 = new ArrayList();
        ((ArrayList) term10834).add(term10836);
        term10664 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem"));
        Object term10733 = newInstance(Class.forName("com.sunrise.javbusbot.spider.JavbusStarUrlItem"));
        setField(term10664, term10664.getClass(), "videoPreviewUrl", "ZRoptBRTDM");
        setField(term10664, term10664.getClass(), "messageChatId", "vVVFChfeBQ");
        setField(term10664, term10664.getClass(), "allFilmCount", "");
        setField(term10664, term10664.getClass(), "haveMagnentCount", "");
        setField(term10664, term10664.getClass(), "visitUrl", "");
        setField(term10664, term10664.getClass(), "bigImgUrl", "");
        setField(term10664, term10664.getClass(), "titleStr", "");
        setField(term10664, term10664.getClass(), "code", "");
        setField(term10664, term10664.getClass(), "publishDate", "");
        setField(term10664, term10664.getClass(), "totalTime", "");
        setField(term10664, term10664.getClass(), "director", "");
        setField(term10664, term10664.getClass(), "produceCompany", "");
        setField(term10664, term10664.getClass(), "publishCompany", "");
        setField(term10664, term10664.getClass(), "series", "");
        setField(term10664, term10664.getClass(), "types", "");
        setField(term10664, term10664.getClass(), "stars", "");
        setField(term10664, term10664.getClass(), "starsPageUrls", term10717);
        setField(term10733, term10733.getClass(), "starName", "myfXkIEBSV");
        setField(term10733, term10733.getClass(), "startPageUrl", "LSrqDVjzEP");
        setField(term10664, term10664.getClass(), "mainStarPageUrl", term10733);
        setField(term10664, term10664.getClass(), "sampleImgs", term10758);
        setField(term10664, term10664.getClass(), "magnents", term10834);
        setIntField(term10664, term10664.getClass(), "fetchRetry", 97029295);
        term10846 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.spider.JavbusDataItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term10846;
        callMethod(klass, "setMagnents", argTypes, term10664, args);
    }

};


