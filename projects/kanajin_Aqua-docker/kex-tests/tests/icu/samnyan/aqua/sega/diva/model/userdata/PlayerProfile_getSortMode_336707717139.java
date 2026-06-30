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

public class PlayerProfile_getSortMode_336707717139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942653;

    public PlayerProfile_getSortMode_336707717139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942653 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942653, term942653.getClass(), "id", 0L);
        setIntField(term942653, term942653.getClass(), "pdId", 0);
        setField(term942653, term942653.getClass(), "playerName", null);
        setIntField(term942653, term942653.getClass(), "vocaloidPoints", 0);
        setIntField(term942653, term942653.getClass(), "level", 0);
        setIntField(term942653, term942653.getClass(), "levelExp", 0);
        setField(term942653, term942653.getClass(), "levelTitle", null);
        setIntField(term942653, term942653.getClass(), "plateId", 0);
        setIntField(term942653, term942653.getClass(), "plateEffectId", 0);
        setField(term942653, term942653.getClass(), "passwordStatus", null);
        setField(term942653, term942653.getClass(), "password", null);
        setBooleanField(term942653, term942653.getClass(), "preferPerPvModule", false);
        setBooleanField(term942653, term942653.getClass(), "preferCommonModule", false);
        setBooleanField(term942653, term942653.getClass(), "usePerPvSkin", false);
        setBooleanField(term942653, term942653.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942653, term942653.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942653, term942653.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942653, term942653.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942653, term942653.getClass(), "commonModule", null);
        setField(term942653, term942653.getClass(), "commonCustomizeItems", null);
        setField(term942653, term942653.getClass(), "commonModuleSetTime", null);
        setField(term942653, term942653.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942653, term942653.getClass(), "commonSkin", 0);
        setIntField(term942653, term942653.getClass(), "headphoneVolume", 0);
        setBooleanField(term942653, term942653.getClass(), "buttonSeOn", false);
        setIntField(term942653, term942653.getClass(), "buttonSeVolume", 0);
        setIntField(term942653, term942653.getClass(), "sliderSeVolume", 0);
        setIntField(term942653, term942653.getClass(), "buttonSe", 0);
        setIntField(term942653, term942653.getClass(), "chainSlideSe", 0);
        setIntField(term942653, term942653.getClass(), "slideSe", 0);
        setIntField(term942653, term942653.getClass(), "sliderTouchSe", 0);
        setField(term942653, term942653.getClass(), "sortMode", null);
        setIntField(term942653, term942653.getClass(), "nextPvId", 0);
        setField(term942653, term942653.getClass(), "nextDifficulty", null);
        setField(term942653, term942653.getClass(), "nextEdition", null);
        setBooleanField(term942653, term942653.getClass(), "showInterimRanking", false);
        setBooleanField(term942653, term942653.getClass(), "showClearStatus", false);
        setBooleanField(term942653, term942653.getClass(), "showGreatBorder", false);
        setBooleanField(term942653, term942653.getClass(), "showExcellentBorder", false);
        setBooleanField(term942653, term942653.getClass(), "showRivalBorder", false);
        setBooleanField(term942653, term942653.getClass(), "showRgoSetting", false);
        setBooleanField(term942653, term942653.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942653, term942653.getClass(), "contestNowPlayingId", 0);
        setIntField(term942653, term942653.getClass(), "contestNowPlayingValue", 0);
        setField(term942653, term942653.getClass(), "contestNowPlayingResultRank", null);
        setField(term942653, term942653.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942653, term942653.getClass(), "myList0", null);
        setField(term942653, term942653.getClass(), "myList1", null);
        setField(term942653, term942653.getClass(), "myList2", null);
        setIntField(term942653, term942653.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortMode", argTypes, term942653, args);
    }

};


