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

public class PlayerProfile_setSortMode_1590445253189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944449;

    public PlayerProfile_setSortMode_1590445253189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944449 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944449, term944449.getClass(), "id", 0L);
        setIntField(term944449, term944449.getClass(), "pdId", 0);
        setField(term944449, term944449.getClass(), "playerName", null);
        setIntField(term944449, term944449.getClass(), "vocaloidPoints", 0);
        setIntField(term944449, term944449.getClass(), "level", 0);
        setIntField(term944449, term944449.getClass(), "levelExp", 0);
        setField(term944449, term944449.getClass(), "levelTitle", null);
        setIntField(term944449, term944449.getClass(), "plateId", 0);
        setIntField(term944449, term944449.getClass(), "plateEffectId", 0);
        setField(term944449, term944449.getClass(), "passwordStatus", null);
        setField(term944449, term944449.getClass(), "password", null);
        setBooleanField(term944449, term944449.getClass(), "preferPerPvModule", false);
        setBooleanField(term944449, term944449.getClass(), "preferCommonModule", false);
        setBooleanField(term944449, term944449.getClass(), "usePerPvSkin", false);
        setBooleanField(term944449, term944449.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944449, term944449.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944449, term944449.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944449, term944449.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944449, term944449.getClass(), "commonModule", null);
        setField(term944449, term944449.getClass(), "commonCustomizeItems", null);
        setField(term944449, term944449.getClass(), "commonModuleSetTime", null);
        setField(term944449, term944449.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944449, term944449.getClass(), "commonSkin", 0);
        setIntField(term944449, term944449.getClass(), "headphoneVolume", 0);
        setBooleanField(term944449, term944449.getClass(), "buttonSeOn", false);
        setIntField(term944449, term944449.getClass(), "buttonSeVolume", 0);
        setIntField(term944449, term944449.getClass(), "sliderSeVolume", 0);
        setIntField(term944449, term944449.getClass(), "buttonSe", 0);
        setIntField(term944449, term944449.getClass(), "chainSlideSe", 0);
        setIntField(term944449, term944449.getClass(), "slideSe", 0);
        setIntField(term944449, term944449.getClass(), "sliderTouchSe", 0);
        setField(term944449, term944449.getClass(), "sortMode", null);
        setIntField(term944449, term944449.getClass(), "nextPvId", 0);
        setField(term944449, term944449.getClass(), "nextDifficulty", null);
        setField(term944449, term944449.getClass(), "nextEdition", null);
        setBooleanField(term944449, term944449.getClass(), "showInterimRanking", false);
        setBooleanField(term944449, term944449.getClass(), "showClearStatus", false);
        setBooleanField(term944449, term944449.getClass(), "showGreatBorder", false);
        setBooleanField(term944449, term944449.getClass(), "showExcellentBorder", false);
        setBooleanField(term944449, term944449.getClass(), "showRivalBorder", false);
        setBooleanField(term944449, term944449.getClass(), "showRgoSetting", false);
        setBooleanField(term944449, term944449.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944449, term944449.getClass(), "contestNowPlayingId", 0);
        setIntField(term944449, term944449.getClass(), "contestNowPlayingValue", 0);
        setField(term944449, term944449.getClass(), "contestNowPlayingResultRank", null);
        setField(term944449, term944449.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944449, term944449.getClass(), "myList0", null);
        setField(term944449, term944449.getClass(), "myList1", null);
        setField(term944449, term944449.getClass(), "myList2", null);
        setIntField(term944449, term944449.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.SortMode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortMode", argTypes, term944449, args);
    }

};


