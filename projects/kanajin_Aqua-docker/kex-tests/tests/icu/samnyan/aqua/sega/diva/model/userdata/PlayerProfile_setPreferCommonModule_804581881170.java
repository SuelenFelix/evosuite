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

public class PlayerProfile_setPreferCommonModule_804581881170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943754;
     Object term943789;

    public PlayerProfile_setPreferCommonModule_804581881170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943754 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943754, term943754.getClass(), "id", 0L);
        setIntField(term943754, term943754.getClass(), "pdId", 0);
        setField(term943754, term943754.getClass(), "playerName", null);
        setIntField(term943754, term943754.getClass(), "vocaloidPoints", 0);
        setIntField(term943754, term943754.getClass(), "level", 0);
        setIntField(term943754, term943754.getClass(), "levelExp", 0);
        setField(term943754, term943754.getClass(), "levelTitle", null);
        setIntField(term943754, term943754.getClass(), "plateId", 0);
        setIntField(term943754, term943754.getClass(), "plateEffectId", 0);
        setField(term943754, term943754.getClass(), "passwordStatus", null);
        setField(term943754, term943754.getClass(), "password", null);
        setBooleanField(term943754, term943754.getClass(), "preferPerPvModule", false);
        setBooleanField(term943754, term943754.getClass(), "preferCommonModule", false);
        setBooleanField(term943754, term943754.getClass(), "usePerPvSkin", false);
        setBooleanField(term943754, term943754.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943754, term943754.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943754, term943754.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943754, term943754.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943754, term943754.getClass(), "commonModule", null);
        setField(term943754, term943754.getClass(), "commonCustomizeItems", null);
        setField(term943754, term943754.getClass(), "commonModuleSetTime", null);
        setField(term943754, term943754.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943754, term943754.getClass(), "commonSkin", 0);
        setIntField(term943754, term943754.getClass(), "headphoneVolume", 0);
        setBooleanField(term943754, term943754.getClass(), "buttonSeOn", false);
        setIntField(term943754, term943754.getClass(), "buttonSeVolume", 0);
        setIntField(term943754, term943754.getClass(), "sliderSeVolume", 0);
        setIntField(term943754, term943754.getClass(), "buttonSe", 0);
        setIntField(term943754, term943754.getClass(), "chainSlideSe", 0);
        setIntField(term943754, term943754.getClass(), "slideSe", 0);
        setIntField(term943754, term943754.getClass(), "sliderTouchSe", 0);
        setField(term943754, term943754.getClass(), "sortMode", null);
        setIntField(term943754, term943754.getClass(), "nextPvId", 0);
        setField(term943754, term943754.getClass(), "nextDifficulty", null);
        setField(term943754, term943754.getClass(), "nextEdition", null);
        setBooleanField(term943754, term943754.getClass(), "showInterimRanking", false);
        setBooleanField(term943754, term943754.getClass(), "showClearStatus", false);
        setBooleanField(term943754, term943754.getClass(), "showGreatBorder", false);
        setBooleanField(term943754, term943754.getClass(), "showExcellentBorder", false);
        setBooleanField(term943754, term943754.getClass(), "showRivalBorder", false);
        setBooleanField(term943754, term943754.getClass(), "showRgoSetting", false);
        setBooleanField(term943754, term943754.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943754, term943754.getClass(), "contestNowPlayingId", 0);
        setIntField(term943754, term943754.getClass(), "contestNowPlayingValue", 0);
        setField(term943754, term943754.getClass(), "contestNowPlayingResultRank", null);
        setField(term943754, term943754.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943754, term943754.getClass(), "myList0", null);
        setField(term943754, term943754.getClass(), "myList1", null);
        setField(term943754, term943754.getClass(), "myList2", null);
        setIntField(term943754, term943754.getClass(), "rivalPdId", 0);
        term943789 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943789;
        callMethod(klass, "setPreferCommonModule", argTypes, term943754, args);
    }

};


