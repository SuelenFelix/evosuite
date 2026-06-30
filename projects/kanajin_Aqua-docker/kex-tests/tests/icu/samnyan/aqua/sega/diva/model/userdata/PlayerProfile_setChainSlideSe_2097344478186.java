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

public class PlayerProfile_setChainSlideSe_2097344478186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944338;
     Object term944373;

    public PlayerProfile_setChainSlideSe_2097344478186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944338 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944338, term944338.getClass(), "id", 0L);
        setIntField(term944338, term944338.getClass(), "pdId", 0);
        setField(term944338, term944338.getClass(), "playerName", null);
        setIntField(term944338, term944338.getClass(), "vocaloidPoints", 0);
        setIntField(term944338, term944338.getClass(), "level", 0);
        setIntField(term944338, term944338.getClass(), "levelExp", 0);
        setField(term944338, term944338.getClass(), "levelTitle", null);
        setIntField(term944338, term944338.getClass(), "plateId", 0);
        setIntField(term944338, term944338.getClass(), "plateEffectId", 0);
        setField(term944338, term944338.getClass(), "passwordStatus", null);
        setField(term944338, term944338.getClass(), "password", null);
        setBooleanField(term944338, term944338.getClass(), "preferPerPvModule", false);
        setBooleanField(term944338, term944338.getClass(), "preferCommonModule", false);
        setBooleanField(term944338, term944338.getClass(), "usePerPvSkin", false);
        setBooleanField(term944338, term944338.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944338, term944338.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944338, term944338.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944338, term944338.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944338, term944338.getClass(), "commonModule", null);
        setField(term944338, term944338.getClass(), "commonCustomizeItems", null);
        setField(term944338, term944338.getClass(), "commonModuleSetTime", null);
        setField(term944338, term944338.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944338, term944338.getClass(), "commonSkin", 0);
        setIntField(term944338, term944338.getClass(), "headphoneVolume", 0);
        setBooleanField(term944338, term944338.getClass(), "buttonSeOn", false);
        setIntField(term944338, term944338.getClass(), "buttonSeVolume", 0);
        setIntField(term944338, term944338.getClass(), "sliderSeVolume", 0);
        setIntField(term944338, term944338.getClass(), "buttonSe", 0);
        setIntField(term944338, term944338.getClass(), "chainSlideSe", 0);
        setIntField(term944338, term944338.getClass(), "slideSe", 0);
        setIntField(term944338, term944338.getClass(), "sliderTouchSe", 0);
        setField(term944338, term944338.getClass(), "sortMode", null);
        setIntField(term944338, term944338.getClass(), "nextPvId", 0);
        setField(term944338, term944338.getClass(), "nextDifficulty", null);
        setField(term944338, term944338.getClass(), "nextEdition", null);
        setBooleanField(term944338, term944338.getClass(), "showInterimRanking", false);
        setBooleanField(term944338, term944338.getClass(), "showClearStatus", false);
        setBooleanField(term944338, term944338.getClass(), "showGreatBorder", false);
        setBooleanField(term944338, term944338.getClass(), "showExcellentBorder", false);
        setBooleanField(term944338, term944338.getClass(), "showRivalBorder", false);
        setBooleanField(term944338, term944338.getClass(), "showRgoSetting", false);
        setBooleanField(term944338, term944338.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944338, term944338.getClass(), "contestNowPlayingId", 0);
        setIntField(term944338, term944338.getClass(), "contestNowPlayingValue", 0);
        setField(term944338, term944338.getClass(), "contestNowPlayingResultRank", null);
        setField(term944338, term944338.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944338, term944338.getClass(), "myList0", null);
        setField(term944338, term944338.getClass(), "myList1", null);
        setField(term944338, term944338.getClass(), "myList2", null);
        setIntField(term944338, term944338.getClass(), "rivalPdId", 0);
        term944373 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944373;
        callMethod(klass, "setChainSlideSe", argTypes, term944338, args);
    }

};


