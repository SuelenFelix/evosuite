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
import java.lang.Integer;

public class PlayerProfile_setNextPvId_516149780190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944484;
     Object term944519;

    public PlayerProfile_setNextPvId_516149780190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944484 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944484, term944484.getClass(), "id", 0L);
        setIntField(term944484, term944484.getClass(), "pdId", 0);
        setField(term944484, term944484.getClass(), "playerName", null);
        setIntField(term944484, term944484.getClass(), "vocaloidPoints", 0);
        setIntField(term944484, term944484.getClass(), "level", 0);
        setIntField(term944484, term944484.getClass(), "levelExp", 0);
        setField(term944484, term944484.getClass(), "levelTitle", null);
        setIntField(term944484, term944484.getClass(), "plateId", 0);
        setIntField(term944484, term944484.getClass(), "plateEffectId", 0);
        setField(term944484, term944484.getClass(), "passwordStatus", null);
        setField(term944484, term944484.getClass(), "password", null);
        setBooleanField(term944484, term944484.getClass(), "preferPerPvModule", false);
        setBooleanField(term944484, term944484.getClass(), "preferCommonModule", false);
        setBooleanField(term944484, term944484.getClass(), "usePerPvSkin", false);
        setBooleanField(term944484, term944484.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944484, term944484.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944484, term944484.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944484, term944484.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944484, term944484.getClass(), "commonModule", null);
        setField(term944484, term944484.getClass(), "commonCustomizeItems", null);
        setField(term944484, term944484.getClass(), "commonModuleSetTime", null);
        setField(term944484, term944484.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944484, term944484.getClass(), "commonSkin", 0);
        setIntField(term944484, term944484.getClass(), "headphoneVolume", 0);
        setBooleanField(term944484, term944484.getClass(), "buttonSeOn", false);
        setIntField(term944484, term944484.getClass(), "buttonSeVolume", 0);
        setIntField(term944484, term944484.getClass(), "sliderSeVolume", 0);
        setIntField(term944484, term944484.getClass(), "buttonSe", 0);
        setIntField(term944484, term944484.getClass(), "chainSlideSe", 0);
        setIntField(term944484, term944484.getClass(), "slideSe", 0);
        setIntField(term944484, term944484.getClass(), "sliderTouchSe", 0);
        setField(term944484, term944484.getClass(), "sortMode", null);
        setIntField(term944484, term944484.getClass(), "nextPvId", 0);
        setField(term944484, term944484.getClass(), "nextDifficulty", null);
        setField(term944484, term944484.getClass(), "nextEdition", null);
        setBooleanField(term944484, term944484.getClass(), "showInterimRanking", false);
        setBooleanField(term944484, term944484.getClass(), "showClearStatus", false);
        setBooleanField(term944484, term944484.getClass(), "showGreatBorder", false);
        setBooleanField(term944484, term944484.getClass(), "showExcellentBorder", false);
        setBooleanField(term944484, term944484.getClass(), "showRivalBorder", false);
        setBooleanField(term944484, term944484.getClass(), "showRgoSetting", false);
        setBooleanField(term944484, term944484.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944484, term944484.getClass(), "contestNowPlayingId", 0);
        setIntField(term944484, term944484.getClass(), "contestNowPlayingValue", 0);
        setField(term944484, term944484.getClass(), "contestNowPlayingResultRank", null);
        setField(term944484, term944484.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944484, term944484.getClass(), "myList0", null);
        setField(term944484, term944484.getClass(), "myList1", null);
        setField(term944484, term944484.getClass(), "myList2", null);
        setIntField(term944484, term944484.getClass(), "rivalPdId", 0);
        term944519 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944519;
        callMethod(klass, "setNextPvId", argTypes, term944484, args);
    }

};


