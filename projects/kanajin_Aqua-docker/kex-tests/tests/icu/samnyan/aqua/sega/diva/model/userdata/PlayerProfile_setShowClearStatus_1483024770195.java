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
import java.lang.Boolean;

public class PlayerProfile_setShowClearStatus_1483024770195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917473;
     Object term4917508;

    public PlayerProfile_setShowClearStatus_1483024770195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917473 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917473, term4917473.getClass(), "id", 0L);
        setIntField(term4917473, term4917473.getClass(), "pdId", 0);
        setField(term4917473, term4917473.getClass(), "playerName", null);
        setIntField(term4917473, term4917473.getClass(), "vocaloidPoints", 0);
        setIntField(term4917473, term4917473.getClass(), "level", 0);
        setIntField(term4917473, term4917473.getClass(), "levelExp", 0);
        setField(term4917473, term4917473.getClass(), "levelTitle", null);
        setIntField(term4917473, term4917473.getClass(), "plateId", 0);
        setIntField(term4917473, term4917473.getClass(), "plateEffectId", 0);
        setField(term4917473, term4917473.getClass(), "passwordStatus", null);
        setField(term4917473, term4917473.getClass(), "password", null);
        setBooleanField(term4917473, term4917473.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917473, term4917473.getClass(), "preferCommonModule", false);
        setBooleanField(term4917473, term4917473.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917473, term4917473.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917473, term4917473.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917473, term4917473.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917473, term4917473.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917473, term4917473.getClass(), "commonModule", null);
        setField(term4917473, term4917473.getClass(), "commonCustomizeItems", null);
        setField(term4917473, term4917473.getClass(), "commonModuleSetTime", null);
        setField(term4917473, term4917473.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917473, term4917473.getClass(), "commonSkin", 0);
        setIntField(term4917473, term4917473.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917473, term4917473.getClass(), "buttonSeOn", false);
        setIntField(term4917473, term4917473.getClass(), "buttonSeVolume", 0);
        setIntField(term4917473, term4917473.getClass(), "sliderSeVolume", 0);
        setIntField(term4917473, term4917473.getClass(), "buttonSe", 0);
        setIntField(term4917473, term4917473.getClass(), "chainSlideSe", 0);
        setIntField(term4917473, term4917473.getClass(), "slideSe", 0);
        setIntField(term4917473, term4917473.getClass(), "sliderTouchSe", 0);
        setField(term4917473, term4917473.getClass(), "sortMode", null);
        setIntField(term4917473, term4917473.getClass(), "nextPvId", 0);
        setField(term4917473, term4917473.getClass(), "nextDifficulty", null);
        setField(term4917473, term4917473.getClass(), "nextEdition", null);
        setBooleanField(term4917473, term4917473.getClass(), "showInterimRanking", false);
        setBooleanField(term4917473, term4917473.getClass(), "showClearStatus", false);
        setBooleanField(term4917473, term4917473.getClass(), "showGreatBorder", false);
        setBooleanField(term4917473, term4917473.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917473, term4917473.getClass(), "showRivalBorder", false);
        setBooleanField(term4917473, term4917473.getClass(), "showRgoSetting", false);
        setBooleanField(term4917473, term4917473.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917473, term4917473.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917473, term4917473.getClass(), "contestNowPlayingValue", 0);
        setField(term4917473, term4917473.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917473, term4917473.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917473, term4917473.getClass(), "myList0", null);
        setField(term4917473, term4917473.getClass(), "myList1", null);
        setField(term4917473, term4917473.getClass(), "myList2", null);
        setIntField(term4917473, term4917473.getClass(), "rivalPdId", 0);
        term4917508 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4917508;
        callMethod(klass, "setShowClearStatus", argTypes, term4917473, args);
    }

};


