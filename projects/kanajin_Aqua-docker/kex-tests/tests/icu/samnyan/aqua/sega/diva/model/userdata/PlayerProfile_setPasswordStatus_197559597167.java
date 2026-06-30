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

public class PlayerProfile_setPasswordStatus_197559597167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943647;

    public PlayerProfile_setPasswordStatus_197559597167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943647 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943647, term943647.getClass(), "id", 0L);
        setIntField(term943647, term943647.getClass(), "pdId", 0);
        setField(term943647, term943647.getClass(), "playerName", null);
        setIntField(term943647, term943647.getClass(), "vocaloidPoints", 0);
        setIntField(term943647, term943647.getClass(), "level", 0);
        setIntField(term943647, term943647.getClass(), "levelExp", 0);
        setField(term943647, term943647.getClass(), "levelTitle", null);
        setIntField(term943647, term943647.getClass(), "plateId", 0);
        setIntField(term943647, term943647.getClass(), "plateEffectId", 0);
        setField(term943647, term943647.getClass(), "passwordStatus", null);
        setField(term943647, term943647.getClass(), "password", null);
        setBooleanField(term943647, term943647.getClass(), "preferPerPvModule", false);
        setBooleanField(term943647, term943647.getClass(), "preferCommonModule", false);
        setBooleanField(term943647, term943647.getClass(), "usePerPvSkin", false);
        setBooleanField(term943647, term943647.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943647, term943647.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943647, term943647.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943647, term943647.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943647, term943647.getClass(), "commonModule", null);
        setField(term943647, term943647.getClass(), "commonCustomizeItems", null);
        setField(term943647, term943647.getClass(), "commonModuleSetTime", null);
        setField(term943647, term943647.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943647, term943647.getClass(), "commonSkin", 0);
        setIntField(term943647, term943647.getClass(), "headphoneVolume", 0);
        setBooleanField(term943647, term943647.getClass(), "buttonSeOn", false);
        setIntField(term943647, term943647.getClass(), "buttonSeVolume", 0);
        setIntField(term943647, term943647.getClass(), "sliderSeVolume", 0);
        setIntField(term943647, term943647.getClass(), "buttonSe", 0);
        setIntField(term943647, term943647.getClass(), "chainSlideSe", 0);
        setIntField(term943647, term943647.getClass(), "slideSe", 0);
        setIntField(term943647, term943647.getClass(), "sliderTouchSe", 0);
        setField(term943647, term943647.getClass(), "sortMode", null);
        setIntField(term943647, term943647.getClass(), "nextPvId", 0);
        setField(term943647, term943647.getClass(), "nextDifficulty", null);
        setField(term943647, term943647.getClass(), "nextEdition", null);
        setBooleanField(term943647, term943647.getClass(), "showInterimRanking", false);
        setBooleanField(term943647, term943647.getClass(), "showClearStatus", false);
        setBooleanField(term943647, term943647.getClass(), "showGreatBorder", false);
        setBooleanField(term943647, term943647.getClass(), "showExcellentBorder", false);
        setBooleanField(term943647, term943647.getClass(), "showRivalBorder", false);
        setBooleanField(term943647, term943647.getClass(), "showRgoSetting", false);
        setBooleanField(term943647, term943647.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943647, term943647.getClass(), "contestNowPlayingId", 0);
        setIntField(term943647, term943647.getClass(), "contestNowPlayingValue", 0);
        setField(term943647, term943647.getClass(), "contestNowPlayingResultRank", null);
        setField(term943647, term943647.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943647, term943647.getClass(), "myList0", null);
        setField(term943647, term943647.getClass(), "myList1", null);
        setField(term943647, term943647.getClass(), "myList2", null);
        setIntField(term943647, term943647.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.PassStat");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPasswordStatus", argTypes, term943647, args);
    }

};


