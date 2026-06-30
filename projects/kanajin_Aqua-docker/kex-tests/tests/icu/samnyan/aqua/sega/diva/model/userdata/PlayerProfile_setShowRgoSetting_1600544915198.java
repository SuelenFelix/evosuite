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

public class PlayerProfile_setShowRgoSetting_1600544915198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944776;
     Object term944811;

    public PlayerProfile_setShowRgoSetting_1600544915198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944776 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944776, term944776.getClass(), "id", 0L);
        setIntField(term944776, term944776.getClass(), "pdId", 0);
        setField(term944776, term944776.getClass(), "playerName", null);
        setIntField(term944776, term944776.getClass(), "vocaloidPoints", 0);
        setIntField(term944776, term944776.getClass(), "level", 0);
        setIntField(term944776, term944776.getClass(), "levelExp", 0);
        setField(term944776, term944776.getClass(), "levelTitle", null);
        setIntField(term944776, term944776.getClass(), "plateId", 0);
        setIntField(term944776, term944776.getClass(), "plateEffectId", 0);
        setField(term944776, term944776.getClass(), "passwordStatus", null);
        setField(term944776, term944776.getClass(), "password", null);
        setBooleanField(term944776, term944776.getClass(), "preferPerPvModule", false);
        setBooleanField(term944776, term944776.getClass(), "preferCommonModule", false);
        setBooleanField(term944776, term944776.getClass(), "usePerPvSkin", false);
        setBooleanField(term944776, term944776.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944776, term944776.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944776, term944776.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944776, term944776.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944776, term944776.getClass(), "commonModule", null);
        setField(term944776, term944776.getClass(), "commonCustomizeItems", null);
        setField(term944776, term944776.getClass(), "commonModuleSetTime", null);
        setField(term944776, term944776.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944776, term944776.getClass(), "commonSkin", 0);
        setIntField(term944776, term944776.getClass(), "headphoneVolume", 0);
        setBooleanField(term944776, term944776.getClass(), "buttonSeOn", false);
        setIntField(term944776, term944776.getClass(), "buttonSeVolume", 0);
        setIntField(term944776, term944776.getClass(), "sliderSeVolume", 0);
        setIntField(term944776, term944776.getClass(), "buttonSe", 0);
        setIntField(term944776, term944776.getClass(), "chainSlideSe", 0);
        setIntField(term944776, term944776.getClass(), "slideSe", 0);
        setIntField(term944776, term944776.getClass(), "sliderTouchSe", 0);
        setField(term944776, term944776.getClass(), "sortMode", null);
        setIntField(term944776, term944776.getClass(), "nextPvId", 0);
        setField(term944776, term944776.getClass(), "nextDifficulty", null);
        setField(term944776, term944776.getClass(), "nextEdition", null);
        setBooleanField(term944776, term944776.getClass(), "showInterimRanking", false);
        setBooleanField(term944776, term944776.getClass(), "showClearStatus", false);
        setBooleanField(term944776, term944776.getClass(), "showGreatBorder", false);
        setBooleanField(term944776, term944776.getClass(), "showExcellentBorder", false);
        setBooleanField(term944776, term944776.getClass(), "showRivalBorder", false);
        setBooleanField(term944776, term944776.getClass(), "showRgoSetting", false);
        setBooleanField(term944776, term944776.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944776, term944776.getClass(), "contestNowPlayingId", 0);
        setIntField(term944776, term944776.getClass(), "contestNowPlayingValue", 0);
        setField(term944776, term944776.getClass(), "contestNowPlayingResultRank", null);
        setField(term944776, term944776.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944776, term944776.getClass(), "myList0", null);
        setField(term944776, term944776.getClass(), "myList1", null);
        setField(term944776, term944776.getClass(), "myList2", null);
        setIntField(term944776, term944776.getClass(), "rivalPdId", 0);
        term944811 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term944811;
        callMethod(klass, "setShowRgoSetting", argTypes, term944776, args);
    }

};


