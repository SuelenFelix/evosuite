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

public class PlayerProfile_isContestNowPlayingEnable_1003084755149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943003;

    public PlayerProfile_isContestNowPlayingEnable_1003084755149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943003 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943003, term943003.getClass(), "id", 0L);
        setIntField(term943003, term943003.getClass(), "pdId", 0);
        setField(term943003, term943003.getClass(), "playerName", null);
        setIntField(term943003, term943003.getClass(), "vocaloidPoints", 0);
        setIntField(term943003, term943003.getClass(), "level", 0);
        setIntField(term943003, term943003.getClass(), "levelExp", 0);
        setField(term943003, term943003.getClass(), "levelTitle", null);
        setIntField(term943003, term943003.getClass(), "plateId", 0);
        setIntField(term943003, term943003.getClass(), "plateEffectId", 0);
        setField(term943003, term943003.getClass(), "passwordStatus", null);
        setField(term943003, term943003.getClass(), "password", null);
        setBooleanField(term943003, term943003.getClass(), "preferPerPvModule", false);
        setBooleanField(term943003, term943003.getClass(), "preferCommonModule", false);
        setBooleanField(term943003, term943003.getClass(), "usePerPvSkin", false);
        setBooleanField(term943003, term943003.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943003, term943003.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943003, term943003.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943003, term943003.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943003, term943003.getClass(), "commonModule", null);
        setField(term943003, term943003.getClass(), "commonCustomizeItems", null);
        setField(term943003, term943003.getClass(), "commonModuleSetTime", null);
        setField(term943003, term943003.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943003, term943003.getClass(), "commonSkin", 0);
        setIntField(term943003, term943003.getClass(), "headphoneVolume", 0);
        setBooleanField(term943003, term943003.getClass(), "buttonSeOn", false);
        setIntField(term943003, term943003.getClass(), "buttonSeVolume", 0);
        setIntField(term943003, term943003.getClass(), "sliderSeVolume", 0);
        setIntField(term943003, term943003.getClass(), "buttonSe", 0);
        setIntField(term943003, term943003.getClass(), "chainSlideSe", 0);
        setIntField(term943003, term943003.getClass(), "slideSe", 0);
        setIntField(term943003, term943003.getClass(), "sliderTouchSe", 0);
        setField(term943003, term943003.getClass(), "sortMode", null);
        setIntField(term943003, term943003.getClass(), "nextPvId", 0);
        setField(term943003, term943003.getClass(), "nextDifficulty", null);
        setField(term943003, term943003.getClass(), "nextEdition", null);
        setBooleanField(term943003, term943003.getClass(), "showInterimRanking", false);
        setBooleanField(term943003, term943003.getClass(), "showClearStatus", false);
        setBooleanField(term943003, term943003.getClass(), "showGreatBorder", false);
        setBooleanField(term943003, term943003.getClass(), "showExcellentBorder", false);
        setBooleanField(term943003, term943003.getClass(), "showRivalBorder", false);
        setBooleanField(term943003, term943003.getClass(), "showRgoSetting", false);
        setBooleanField(term943003, term943003.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943003, term943003.getClass(), "contestNowPlayingId", 0);
        setIntField(term943003, term943003.getClass(), "contestNowPlayingValue", 0);
        setField(term943003, term943003.getClass(), "contestNowPlayingResultRank", null);
        setField(term943003, term943003.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943003, term943003.getClass(), "myList0", null);
        setField(term943003, term943003.getClass(), "myList1", null);
        setField(term943003, term943003.getClass(), "myList2", null);
        setIntField(term943003, term943003.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isContestNowPlayingEnable", argTypes, term943003, args);
    }

};


