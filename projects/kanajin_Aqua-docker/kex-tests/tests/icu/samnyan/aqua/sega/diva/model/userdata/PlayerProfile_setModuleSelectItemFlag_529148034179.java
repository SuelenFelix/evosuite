package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PlayerProfile_setModuleSelectItemFlag_529148034179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944081;

    public PlayerProfile_setModuleSelectItemFlag_529148034179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944081 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944081, term944081.getClass(), "id", 0L);
        setIntField(term944081, term944081.getClass(), "pdId", 0);
        setField(term944081, term944081.getClass(), "playerName", null);
        setIntField(term944081, term944081.getClass(), "vocaloidPoints", 0);
        setIntField(term944081, term944081.getClass(), "level", 0);
        setIntField(term944081, term944081.getClass(), "levelExp", 0);
        setField(term944081, term944081.getClass(), "levelTitle", null);
        setIntField(term944081, term944081.getClass(), "plateId", 0);
        setIntField(term944081, term944081.getClass(), "plateEffectId", 0);
        setField(term944081, term944081.getClass(), "passwordStatus", null);
        setField(term944081, term944081.getClass(), "password", null);
        setBooleanField(term944081, term944081.getClass(), "preferPerPvModule", false);
        setBooleanField(term944081, term944081.getClass(), "preferCommonModule", false);
        setBooleanField(term944081, term944081.getClass(), "usePerPvSkin", false);
        setBooleanField(term944081, term944081.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944081, term944081.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944081, term944081.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944081, term944081.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944081, term944081.getClass(), "commonModule", null);
        setField(term944081, term944081.getClass(), "commonCustomizeItems", null);
        setField(term944081, term944081.getClass(), "commonModuleSetTime", null);
        setField(term944081, term944081.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944081, term944081.getClass(), "commonSkin", 0);
        setIntField(term944081, term944081.getClass(), "headphoneVolume", 0);
        setBooleanField(term944081, term944081.getClass(), "buttonSeOn", false);
        setIntField(term944081, term944081.getClass(), "buttonSeVolume", 0);
        setIntField(term944081, term944081.getClass(), "sliderSeVolume", 0);
        setIntField(term944081, term944081.getClass(), "buttonSe", 0);
        setIntField(term944081, term944081.getClass(), "chainSlideSe", 0);
        setIntField(term944081, term944081.getClass(), "slideSe", 0);
        setIntField(term944081, term944081.getClass(), "sliderTouchSe", 0);
        setField(term944081, term944081.getClass(), "sortMode", null);
        setIntField(term944081, term944081.getClass(), "nextPvId", 0);
        setField(term944081, term944081.getClass(), "nextDifficulty", null);
        setField(term944081, term944081.getClass(), "nextEdition", null);
        setBooleanField(term944081, term944081.getClass(), "showInterimRanking", false);
        setBooleanField(term944081, term944081.getClass(), "showClearStatus", false);
        setBooleanField(term944081, term944081.getClass(), "showGreatBorder", false);
        setBooleanField(term944081, term944081.getClass(), "showExcellentBorder", false);
        setBooleanField(term944081, term944081.getClass(), "showRivalBorder", false);
        setBooleanField(term944081, term944081.getClass(), "showRgoSetting", false);
        setBooleanField(term944081, term944081.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944081, term944081.getClass(), "contestNowPlayingId", 0);
        setIntField(term944081, term944081.getClass(), "contestNowPlayingValue", 0);
        setField(term944081, term944081.getClass(), "contestNowPlayingResultRank", null);
        setField(term944081, term944081.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944081, term944081.getClass(), "myList0", null);
        setField(term944081, term944081.getClass(), "myList1", null);
        setField(term944081, term944081.getClass(), "myList2", null);
        setIntField(term944081, term944081.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModuleSelectItemFlag", argTypes, term944081, args);
    }

};


