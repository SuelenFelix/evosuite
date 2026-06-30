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

public class PlayerProfile_setSliderSeVolume_1224952589184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944264;
     Object term944299;

    public PlayerProfile_setSliderSeVolume_1224952589184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944264 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944264, term944264.getClass(), "id", 0L);
        setIntField(term944264, term944264.getClass(), "pdId", 0);
        setField(term944264, term944264.getClass(), "playerName", null);
        setIntField(term944264, term944264.getClass(), "vocaloidPoints", 0);
        setIntField(term944264, term944264.getClass(), "level", 0);
        setIntField(term944264, term944264.getClass(), "levelExp", 0);
        setField(term944264, term944264.getClass(), "levelTitle", null);
        setIntField(term944264, term944264.getClass(), "plateId", 0);
        setIntField(term944264, term944264.getClass(), "plateEffectId", 0);
        setField(term944264, term944264.getClass(), "passwordStatus", null);
        setField(term944264, term944264.getClass(), "password", null);
        setBooleanField(term944264, term944264.getClass(), "preferPerPvModule", false);
        setBooleanField(term944264, term944264.getClass(), "preferCommonModule", false);
        setBooleanField(term944264, term944264.getClass(), "usePerPvSkin", false);
        setBooleanField(term944264, term944264.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944264, term944264.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944264, term944264.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944264, term944264.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944264, term944264.getClass(), "commonModule", null);
        setField(term944264, term944264.getClass(), "commonCustomizeItems", null);
        setField(term944264, term944264.getClass(), "commonModuleSetTime", null);
        setField(term944264, term944264.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944264, term944264.getClass(), "commonSkin", 0);
        setIntField(term944264, term944264.getClass(), "headphoneVolume", 0);
        setBooleanField(term944264, term944264.getClass(), "buttonSeOn", false);
        setIntField(term944264, term944264.getClass(), "buttonSeVolume", 0);
        setIntField(term944264, term944264.getClass(), "sliderSeVolume", 0);
        setIntField(term944264, term944264.getClass(), "buttonSe", 0);
        setIntField(term944264, term944264.getClass(), "chainSlideSe", 0);
        setIntField(term944264, term944264.getClass(), "slideSe", 0);
        setIntField(term944264, term944264.getClass(), "sliderTouchSe", 0);
        setField(term944264, term944264.getClass(), "sortMode", null);
        setIntField(term944264, term944264.getClass(), "nextPvId", 0);
        setField(term944264, term944264.getClass(), "nextDifficulty", null);
        setField(term944264, term944264.getClass(), "nextEdition", null);
        setBooleanField(term944264, term944264.getClass(), "showInterimRanking", false);
        setBooleanField(term944264, term944264.getClass(), "showClearStatus", false);
        setBooleanField(term944264, term944264.getClass(), "showGreatBorder", false);
        setBooleanField(term944264, term944264.getClass(), "showExcellentBorder", false);
        setBooleanField(term944264, term944264.getClass(), "showRivalBorder", false);
        setBooleanField(term944264, term944264.getClass(), "showRgoSetting", false);
        setBooleanField(term944264, term944264.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944264, term944264.getClass(), "contestNowPlayingId", 0);
        setIntField(term944264, term944264.getClass(), "contestNowPlayingValue", 0);
        setField(term944264, term944264.getClass(), "contestNowPlayingResultRank", null);
        setField(term944264, term944264.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944264, term944264.getClass(), "myList0", null);
        setField(term944264, term944264.getClass(), "myList1", null);
        setField(term944264, term944264.getClass(), "myList2", null);
        setIntField(term944264, term944264.getClass(), "rivalPdId", 0);
        term944299 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944299;
        callMethod(klass, "setSliderSeVolume", argTypes, term944264, args);
    }

};


