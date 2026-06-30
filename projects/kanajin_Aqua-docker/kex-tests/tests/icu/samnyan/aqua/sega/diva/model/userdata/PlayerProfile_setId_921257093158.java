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
import java.lang.Long;

public class PlayerProfile_setId_921257093158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943318;
     Object term943353;

    public PlayerProfile_setId_921257093158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943318 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943318, term943318.getClass(), "id", 0L);
        setIntField(term943318, term943318.getClass(), "pdId", 0);
        setField(term943318, term943318.getClass(), "playerName", null);
        setIntField(term943318, term943318.getClass(), "vocaloidPoints", 0);
        setIntField(term943318, term943318.getClass(), "level", 0);
        setIntField(term943318, term943318.getClass(), "levelExp", 0);
        setField(term943318, term943318.getClass(), "levelTitle", null);
        setIntField(term943318, term943318.getClass(), "plateId", 0);
        setIntField(term943318, term943318.getClass(), "plateEffectId", 0);
        setField(term943318, term943318.getClass(), "passwordStatus", null);
        setField(term943318, term943318.getClass(), "password", null);
        setBooleanField(term943318, term943318.getClass(), "preferPerPvModule", false);
        setBooleanField(term943318, term943318.getClass(), "preferCommonModule", false);
        setBooleanField(term943318, term943318.getClass(), "usePerPvSkin", false);
        setBooleanField(term943318, term943318.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943318, term943318.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943318, term943318.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943318, term943318.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943318, term943318.getClass(), "commonModule", null);
        setField(term943318, term943318.getClass(), "commonCustomizeItems", null);
        setField(term943318, term943318.getClass(), "commonModuleSetTime", null);
        setField(term943318, term943318.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943318, term943318.getClass(), "commonSkin", 0);
        setIntField(term943318, term943318.getClass(), "headphoneVolume", 0);
        setBooleanField(term943318, term943318.getClass(), "buttonSeOn", false);
        setIntField(term943318, term943318.getClass(), "buttonSeVolume", 0);
        setIntField(term943318, term943318.getClass(), "sliderSeVolume", 0);
        setIntField(term943318, term943318.getClass(), "buttonSe", 0);
        setIntField(term943318, term943318.getClass(), "chainSlideSe", 0);
        setIntField(term943318, term943318.getClass(), "slideSe", 0);
        setIntField(term943318, term943318.getClass(), "sliderTouchSe", 0);
        setField(term943318, term943318.getClass(), "sortMode", null);
        setIntField(term943318, term943318.getClass(), "nextPvId", 0);
        setField(term943318, term943318.getClass(), "nextDifficulty", null);
        setField(term943318, term943318.getClass(), "nextEdition", null);
        setBooleanField(term943318, term943318.getClass(), "showInterimRanking", false);
        setBooleanField(term943318, term943318.getClass(), "showClearStatus", false);
        setBooleanField(term943318, term943318.getClass(), "showGreatBorder", false);
        setBooleanField(term943318, term943318.getClass(), "showExcellentBorder", false);
        setBooleanField(term943318, term943318.getClass(), "showRivalBorder", false);
        setBooleanField(term943318, term943318.getClass(), "showRgoSetting", false);
        setBooleanField(term943318, term943318.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943318, term943318.getClass(), "contestNowPlayingId", 0);
        setIntField(term943318, term943318.getClass(), "contestNowPlayingValue", 0);
        setField(term943318, term943318.getClass(), "contestNowPlayingResultRank", null);
        setField(term943318, term943318.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943318, term943318.getClass(), "myList0", null);
        setField(term943318, term943318.getClass(), "myList1", null);
        setField(term943318, term943318.getClass(), "myList2", null);
        setIntField(term943318, term943318.getClass(), "rivalPdId", 0);
        term943353 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term943353;
        callMethod(klass, "setId", argTypes, term943318, args);
    }

};


