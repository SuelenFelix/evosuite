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

public class PlayerProfile_setLevelExp_2048645497164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916346;
     Object term4916381;

    public PlayerProfile_setLevelExp_2048645497164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916346 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916346, term4916346.getClass(), "id", 0L);
        setIntField(term4916346, term4916346.getClass(), "pdId", 0);
        setField(term4916346, term4916346.getClass(), "playerName", null);
        setIntField(term4916346, term4916346.getClass(), "vocaloidPoints", 0);
        setIntField(term4916346, term4916346.getClass(), "level", 0);
        setIntField(term4916346, term4916346.getClass(), "levelExp", 0);
        setField(term4916346, term4916346.getClass(), "levelTitle", null);
        setIntField(term4916346, term4916346.getClass(), "plateId", 0);
        setIntField(term4916346, term4916346.getClass(), "plateEffectId", 0);
        setField(term4916346, term4916346.getClass(), "passwordStatus", null);
        setField(term4916346, term4916346.getClass(), "password", null);
        setBooleanField(term4916346, term4916346.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916346, term4916346.getClass(), "preferCommonModule", false);
        setBooleanField(term4916346, term4916346.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916346, term4916346.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916346, term4916346.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916346, term4916346.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916346, term4916346.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916346, term4916346.getClass(), "commonModule", null);
        setField(term4916346, term4916346.getClass(), "commonCustomizeItems", null);
        setField(term4916346, term4916346.getClass(), "commonModuleSetTime", null);
        setField(term4916346, term4916346.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916346, term4916346.getClass(), "commonSkin", 0);
        setIntField(term4916346, term4916346.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916346, term4916346.getClass(), "buttonSeOn", false);
        setIntField(term4916346, term4916346.getClass(), "buttonSeVolume", 0);
        setIntField(term4916346, term4916346.getClass(), "sliderSeVolume", 0);
        setIntField(term4916346, term4916346.getClass(), "buttonSe", 0);
        setIntField(term4916346, term4916346.getClass(), "chainSlideSe", 0);
        setIntField(term4916346, term4916346.getClass(), "slideSe", 0);
        setIntField(term4916346, term4916346.getClass(), "sliderTouchSe", 0);
        setField(term4916346, term4916346.getClass(), "sortMode", null);
        setIntField(term4916346, term4916346.getClass(), "nextPvId", 0);
        setField(term4916346, term4916346.getClass(), "nextDifficulty", null);
        setField(term4916346, term4916346.getClass(), "nextEdition", null);
        setBooleanField(term4916346, term4916346.getClass(), "showInterimRanking", false);
        setBooleanField(term4916346, term4916346.getClass(), "showClearStatus", false);
        setBooleanField(term4916346, term4916346.getClass(), "showGreatBorder", false);
        setBooleanField(term4916346, term4916346.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916346, term4916346.getClass(), "showRivalBorder", false);
        setBooleanField(term4916346, term4916346.getClass(), "showRgoSetting", false);
        setBooleanField(term4916346, term4916346.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916346, term4916346.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916346, term4916346.getClass(), "contestNowPlayingValue", 0);
        setField(term4916346, term4916346.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916346, term4916346.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916346, term4916346.getClass(), "myList0", null);
        setField(term4916346, term4916346.getClass(), "myList1", null);
        setField(term4916346, term4916346.getClass(), "myList2", null);
        setIntField(term4916346, term4916346.getClass(), "rivalPdId", 0);
        term4916381 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4916381;
        callMethod(klass, "setLevelExp", argTypes, term4916346, args);
    }

};


