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

public class PlayerProfile_setLevelTitle_549038801164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943538;

    public PlayerProfile_setLevelTitle_549038801164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943538 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943538, term943538.getClass(), "id", 0L);
        setIntField(term943538, term943538.getClass(), "pdId", 0);
        setField(term943538, term943538.getClass(), "playerName", null);
        setIntField(term943538, term943538.getClass(), "vocaloidPoints", 0);
        setIntField(term943538, term943538.getClass(), "level", 0);
        setIntField(term943538, term943538.getClass(), "levelExp", 0);
        setField(term943538, term943538.getClass(), "levelTitle", null);
        setIntField(term943538, term943538.getClass(), "plateId", 0);
        setIntField(term943538, term943538.getClass(), "plateEffectId", 0);
        setField(term943538, term943538.getClass(), "passwordStatus", null);
        setField(term943538, term943538.getClass(), "password", null);
        setBooleanField(term943538, term943538.getClass(), "preferPerPvModule", false);
        setBooleanField(term943538, term943538.getClass(), "preferCommonModule", false);
        setBooleanField(term943538, term943538.getClass(), "usePerPvSkin", false);
        setBooleanField(term943538, term943538.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943538, term943538.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943538, term943538.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943538, term943538.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943538, term943538.getClass(), "commonModule", null);
        setField(term943538, term943538.getClass(), "commonCustomizeItems", null);
        setField(term943538, term943538.getClass(), "commonModuleSetTime", null);
        setField(term943538, term943538.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943538, term943538.getClass(), "commonSkin", 0);
        setIntField(term943538, term943538.getClass(), "headphoneVolume", 0);
        setBooleanField(term943538, term943538.getClass(), "buttonSeOn", false);
        setIntField(term943538, term943538.getClass(), "buttonSeVolume", 0);
        setIntField(term943538, term943538.getClass(), "sliderSeVolume", 0);
        setIntField(term943538, term943538.getClass(), "buttonSe", 0);
        setIntField(term943538, term943538.getClass(), "chainSlideSe", 0);
        setIntField(term943538, term943538.getClass(), "slideSe", 0);
        setIntField(term943538, term943538.getClass(), "sliderTouchSe", 0);
        setField(term943538, term943538.getClass(), "sortMode", null);
        setIntField(term943538, term943538.getClass(), "nextPvId", 0);
        setField(term943538, term943538.getClass(), "nextDifficulty", null);
        setField(term943538, term943538.getClass(), "nextEdition", null);
        setBooleanField(term943538, term943538.getClass(), "showInterimRanking", false);
        setBooleanField(term943538, term943538.getClass(), "showClearStatus", false);
        setBooleanField(term943538, term943538.getClass(), "showGreatBorder", false);
        setBooleanField(term943538, term943538.getClass(), "showExcellentBorder", false);
        setBooleanField(term943538, term943538.getClass(), "showRivalBorder", false);
        setBooleanField(term943538, term943538.getClass(), "showRgoSetting", false);
        setBooleanField(term943538, term943538.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943538, term943538.getClass(), "contestNowPlayingId", 0);
        setIntField(term943538, term943538.getClass(), "contestNowPlayingValue", 0);
        setField(term943538, term943538.getClass(), "contestNowPlayingResultRank", null);
        setField(term943538, term943538.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943538, term943538.getClass(), "myList0", null);
        setField(term943538, term943538.getClass(), "myList1", null);
        setField(term943538, term943538.getClass(), "myList2", null);
        setIntField(term943538, term943538.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLevelTitle", argTypes, term943538, args);
    }

};


