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

public class PlayerProfile_setPreferPerPvModule_1502766469169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943717;
     Object term943752;

    public PlayerProfile_setPreferPerPvModule_1502766469169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943717 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943717, term943717.getClass(), "id", 0L);
        setIntField(term943717, term943717.getClass(), "pdId", 0);
        setField(term943717, term943717.getClass(), "playerName", null);
        setIntField(term943717, term943717.getClass(), "vocaloidPoints", 0);
        setIntField(term943717, term943717.getClass(), "level", 0);
        setIntField(term943717, term943717.getClass(), "levelExp", 0);
        setField(term943717, term943717.getClass(), "levelTitle", null);
        setIntField(term943717, term943717.getClass(), "plateId", 0);
        setIntField(term943717, term943717.getClass(), "plateEffectId", 0);
        setField(term943717, term943717.getClass(), "passwordStatus", null);
        setField(term943717, term943717.getClass(), "password", null);
        setBooleanField(term943717, term943717.getClass(), "preferPerPvModule", false);
        setBooleanField(term943717, term943717.getClass(), "preferCommonModule", false);
        setBooleanField(term943717, term943717.getClass(), "usePerPvSkin", false);
        setBooleanField(term943717, term943717.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943717, term943717.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943717, term943717.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943717, term943717.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943717, term943717.getClass(), "commonModule", null);
        setField(term943717, term943717.getClass(), "commonCustomizeItems", null);
        setField(term943717, term943717.getClass(), "commonModuleSetTime", null);
        setField(term943717, term943717.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943717, term943717.getClass(), "commonSkin", 0);
        setIntField(term943717, term943717.getClass(), "headphoneVolume", 0);
        setBooleanField(term943717, term943717.getClass(), "buttonSeOn", false);
        setIntField(term943717, term943717.getClass(), "buttonSeVolume", 0);
        setIntField(term943717, term943717.getClass(), "sliderSeVolume", 0);
        setIntField(term943717, term943717.getClass(), "buttonSe", 0);
        setIntField(term943717, term943717.getClass(), "chainSlideSe", 0);
        setIntField(term943717, term943717.getClass(), "slideSe", 0);
        setIntField(term943717, term943717.getClass(), "sliderTouchSe", 0);
        setField(term943717, term943717.getClass(), "sortMode", null);
        setIntField(term943717, term943717.getClass(), "nextPvId", 0);
        setField(term943717, term943717.getClass(), "nextDifficulty", null);
        setField(term943717, term943717.getClass(), "nextEdition", null);
        setBooleanField(term943717, term943717.getClass(), "showInterimRanking", false);
        setBooleanField(term943717, term943717.getClass(), "showClearStatus", false);
        setBooleanField(term943717, term943717.getClass(), "showGreatBorder", false);
        setBooleanField(term943717, term943717.getClass(), "showExcellentBorder", false);
        setBooleanField(term943717, term943717.getClass(), "showRivalBorder", false);
        setBooleanField(term943717, term943717.getClass(), "showRgoSetting", false);
        setBooleanField(term943717, term943717.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943717, term943717.getClass(), "contestNowPlayingId", 0);
        setIntField(term943717, term943717.getClass(), "contestNowPlayingValue", 0);
        setField(term943717, term943717.getClass(), "contestNowPlayingResultRank", null);
        setField(term943717, term943717.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943717, term943717.getClass(), "myList0", null);
        setField(term943717, term943717.getClass(), "myList1", null);
        setField(term943717, term943717.getClass(), "myList2", null);
        setIntField(term943717, term943717.getClass(), "rivalPdId", 0);
        term943752 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943752;
        callMethod(klass, "setPreferPerPvModule", argTypes, term943717, args);
    }

};


