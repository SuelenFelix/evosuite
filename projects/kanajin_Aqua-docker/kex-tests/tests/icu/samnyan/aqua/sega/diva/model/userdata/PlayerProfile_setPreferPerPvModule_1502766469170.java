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

public class PlayerProfile_setPreferPerPvModule_1502766469170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916562;
     Object term4916597;

    public PlayerProfile_setPreferPerPvModule_1502766469170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916562 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916562, term4916562.getClass(), "id", 0L);
        setIntField(term4916562, term4916562.getClass(), "pdId", 0);
        setField(term4916562, term4916562.getClass(), "playerName", null);
        setIntField(term4916562, term4916562.getClass(), "vocaloidPoints", 0);
        setIntField(term4916562, term4916562.getClass(), "level", 0);
        setIntField(term4916562, term4916562.getClass(), "levelExp", 0);
        setField(term4916562, term4916562.getClass(), "levelTitle", null);
        setIntField(term4916562, term4916562.getClass(), "plateId", 0);
        setIntField(term4916562, term4916562.getClass(), "plateEffectId", 0);
        setField(term4916562, term4916562.getClass(), "passwordStatus", null);
        setField(term4916562, term4916562.getClass(), "password", null);
        setBooleanField(term4916562, term4916562.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916562, term4916562.getClass(), "preferCommonModule", false);
        setBooleanField(term4916562, term4916562.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916562, term4916562.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916562, term4916562.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916562, term4916562.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916562, term4916562.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916562, term4916562.getClass(), "commonModule", null);
        setField(term4916562, term4916562.getClass(), "commonCustomizeItems", null);
        setField(term4916562, term4916562.getClass(), "commonModuleSetTime", null);
        setField(term4916562, term4916562.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916562, term4916562.getClass(), "commonSkin", 0);
        setIntField(term4916562, term4916562.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916562, term4916562.getClass(), "buttonSeOn", false);
        setIntField(term4916562, term4916562.getClass(), "buttonSeVolume", 0);
        setIntField(term4916562, term4916562.getClass(), "sliderSeVolume", 0);
        setIntField(term4916562, term4916562.getClass(), "buttonSe", 0);
        setIntField(term4916562, term4916562.getClass(), "chainSlideSe", 0);
        setIntField(term4916562, term4916562.getClass(), "slideSe", 0);
        setIntField(term4916562, term4916562.getClass(), "sliderTouchSe", 0);
        setField(term4916562, term4916562.getClass(), "sortMode", null);
        setIntField(term4916562, term4916562.getClass(), "nextPvId", 0);
        setField(term4916562, term4916562.getClass(), "nextDifficulty", null);
        setField(term4916562, term4916562.getClass(), "nextEdition", null);
        setBooleanField(term4916562, term4916562.getClass(), "showInterimRanking", false);
        setBooleanField(term4916562, term4916562.getClass(), "showClearStatus", false);
        setBooleanField(term4916562, term4916562.getClass(), "showGreatBorder", false);
        setBooleanField(term4916562, term4916562.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916562, term4916562.getClass(), "showRivalBorder", false);
        setBooleanField(term4916562, term4916562.getClass(), "showRgoSetting", false);
        setBooleanField(term4916562, term4916562.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916562, term4916562.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916562, term4916562.getClass(), "contestNowPlayingValue", 0);
        setField(term4916562, term4916562.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916562, term4916562.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916562, term4916562.getClass(), "myList0", null);
        setField(term4916562, term4916562.getClass(), "myList1", null);
        setField(term4916562, term4916562.getClass(), "myList2", null);
        setIntField(term4916562, term4916562.getClass(), "rivalPdId", 0);
        term4916597 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4916597;
        callMethod(klass, "setPreferPerPvModule", argTypes, term4916562, args);
    }

};


