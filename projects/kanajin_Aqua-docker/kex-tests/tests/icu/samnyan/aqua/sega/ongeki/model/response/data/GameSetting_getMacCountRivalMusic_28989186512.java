package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMacCountRivalMusic_28989186512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5098;

    public GameSetting_getMacCountRivalMusic_28989186512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5098 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5098, term5098.getClass(), "dataVersion", "FnEkAHBfyV");
        setField(term5098, term5098.getClass(), "onlineDataVersion", "VfmNFpEuax");
        setBooleanField(term5098, term5098.getClass(), "isMaintenance", false);
        setIntField(term5098, term5098.getClass(), "requestInterval", 198857801);
        setField(term5098, term5098.getClass(), "rebootStartTime", "ANHjlWPmZG");
        setField(term5098, term5098.getClass(), "rebootEndTime", "SibzENsyyy");
        setBooleanField(term5098, term5098.getClass(), "isBackgroundDistribute", false);
        setIntField(term5098, term5098.getClass(), "maxCountCharacter", 1342884142);
        setIntField(term5098, term5098.getClass(), "maxCountCard", -1454325068);
        setIntField(term5098, term5098.getClass(), "maxCountItem", 346714653);
        setIntField(term5098, term5098.getClass(), "maxCountMusic", 2121928697);
        setIntField(term5098, term5098.getClass(), "maxCountMusicItem", -1741056571);
        setIntField(term5098, term5098.getClass(), "macCountRivalMusic", 522501050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMacCountRivalMusic", argTypes, term5098, args);
    }

};


