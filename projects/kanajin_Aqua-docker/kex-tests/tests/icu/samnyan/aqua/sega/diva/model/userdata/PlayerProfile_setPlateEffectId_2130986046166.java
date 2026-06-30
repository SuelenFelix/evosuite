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

public class PlayerProfile_setPlateEffectId_2130986046166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943610;
     Object term943645;

    public PlayerProfile_setPlateEffectId_2130986046166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943610 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943610, term943610.getClass(), "id", 0L);
        setIntField(term943610, term943610.getClass(), "pdId", 0);
        setField(term943610, term943610.getClass(), "playerName", null);
        setIntField(term943610, term943610.getClass(), "vocaloidPoints", 0);
        setIntField(term943610, term943610.getClass(), "level", 0);
        setIntField(term943610, term943610.getClass(), "levelExp", 0);
        setField(term943610, term943610.getClass(), "levelTitle", null);
        setIntField(term943610, term943610.getClass(), "plateId", 0);
        setIntField(term943610, term943610.getClass(), "plateEffectId", 0);
        setField(term943610, term943610.getClass(), "passwordStatus", null);
        setField(term943610, term943610.getClass(), "password", null);
        setBooleanField(term943610, term943610.getClass(), "preferPerPvModule", false);
        setBooleanField(term943610, term943610.getClass(), "preferCommonModule", false);
        setBooleanField(term943610, term943610.getClass(), "usePerPvSkin", false);
        setBooleanField(term943610, term943610.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943610, term943610.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943610, term943610.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943610, term943610.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943610, term943610.getClass(), "commonModule", null);
        setField(term943610, term943610.getClass(), "commonCustomizeItems", null);
        setField(term943610, term943610.getClass(), "commonModuleSetTime", null);
        setField(term943610, term943610.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943610, term943610.getClass(), "commonSkin", 0);
        setIntField(term943610, term943610.getClass(), "headphoneVolume", 0);
        setBooleanField(term943610, term943610.getClass(), "buttonSeOn", false);
        setIntField(term943610, term943610.getClass(), "buttonSeVolume", 0);
        setIntField(term943610, term943610.getClass(), "sliderSeVolume", 0);
        setIntField(term943610, term943610.getClass(), "buttonSe", 0);
        setIntField(term943610, term943610.getClass(), "chainSlideSe", 0);
        setIntField(term943610, term943610.getClass(), "slideSe", 0);
        setIntField(term943610, term943610.getClass(), "sliderTouchSe", 0);
        setField(term943610, term943610.getClass(), "sortMode", null);
        setIntField(term943610, term943610.getClass(), "nextPvId", 0);
        setField(term943610, term943610.getClass(), "nextDifficulty", null);
        setField(term943610, term943610.getClass(), "nextEdition", null);
        setBooleanField(term943610, term943610.getClass(), "showInterimRanking", false);
        setBooleanField(term943610, term943610.getClass(), "showClearStatus", false);
        setBooleanField(term943610, term943610.getClass(), "showGreatBorder", false);
        setBooleanField(term943610, term943610.getClass(), "showExcellentBorder", false);
        setBooleanField(term943610, term943610.getClass(), "showRivalBorder", false);
        setBooleanField(term943610, term943610.getClass(), "showRgoSetting", false);
        setBooleanField(term943610, term943610.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943610, term943610.getClass(), "contestNowPlayingId", 0);
        setIntField(term943610, term943610.getClass(), "contestNowPlayingValue", 0);
        setField(term943610, term943610.getClass(), "contestNowPlayingResultRank", null);
        setField(term943610, term943610.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943610, term943610.getClass(), "myList0", null);
        setField(term943610, term943610.getClass(), "myList1", null);
        setField(term943610, term943610.getClass(), "myList2", null);
        setIntField(term943610, term943610.getClass(), "rivalPdId", 0);
        term943645 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term943645;
        callMethod(klass, "setPlateEffectId", argTypes, term943610, args);
    }

};


