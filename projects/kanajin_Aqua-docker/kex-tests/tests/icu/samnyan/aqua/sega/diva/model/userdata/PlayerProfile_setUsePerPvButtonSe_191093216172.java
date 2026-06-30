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

public class PlayerProfile_setUsePerPvButtonSe_191093216172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943828;
     Object term943863;

    public PlayerProfile_setUsePerPvButtonSe_191093216172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943828 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943828, term943828.getClass(), "id", 0L);
        setIntField(term943828, term943828.getClass(), "pdId", 0);
        setField(term943828, term943828.getClass(), "playerName", null);
        setIntField(term943828, term943828.getClass(), "vocaloidPoints", 0);
        setIntField(term943828, term943828.getClass(), "level", 0);
        setIntField(term943828, term943828.getClass(), "levelExp", 0);
        setField(term943828, term943828.getClass(), "levelTitle", null);
        setIntField(term943828, term943828.getClass(), "plateId", 0);
        setIntField(term943828, term943828.getClass(), "plateEffectId", 0);
        setField(term943828, term943828.getClass(), "passwordStatus", null);
        setField(term943828, term943828.getClass(), "password", null);
        setBooleanField(term943828, term943828.getClass(), "preferPerPvModule", false);
        setBooleanField(term943828, term943828.getClass(), "preferCommonModule", false);
        setBooleanField(term943828, term943828.getClass(), "usePerPvSkin", false);
        setBooleanField(term943828, term943828.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943828, term943828.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943828, term943828.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943828, term943828.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943828, term943828.getClass(), "commonModule", null);
        setField(term943828, term943828.getClass(), "commonCustomizeItems", null);
        setField(term943828, term943828.getClass(), "commonModuleSetTime", null);
        setField(term943828, term943828.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943828, term943828.getClass(), "commonSkin", 0);
        setIntField(term943828, term943828.getClass(), "headphoneVolume", 0);
        setBooleanField(term943828, term943828.getClass(), "buttonSeOn", false);
        setIntField(term943828, term943828.getClass(), "buttonSeVolume", 0);
        setIntField(term943828, term943828.getClass(), "sliderSeVolume", 0);
        setIntField(term943828, term943828.getClass(), "buttonSe", 0);
        setIntField(term943828, term943828.getClass(), "chainSlideSe", 0);
        setIntField(term943828, term943828.getClass(), "slideSe", 0);
        setIntField(term943828, term943828.getClass(), "sliderTouchSe", 0);
        setField(term943828, term943828.getClass(), "sortMode", null);
        setIntField(term943828, term943828.getClass(), "nextPvId", 0);
        setField(term943828, term943828.getClass(), "nextDifficulty", null);
        setField(term943828, term943828.getClass(), "nextEdition", null);
        setBooleanField(term943828, term943828.getClass(), "showInterimRanking", false);
        setBooleanField(term943828, term943828.getClass(), "showClearStatus", false);
        setBooleanField(term943828, term943828.getClass(), "showGreatBorder", false);
        setBooleanField(term943828, term943828.getClass(), "showExcellentBorder", false);
        setBooleanField(term943828, term943828.getClass(), "showRivalBorder", false);
        setBooleanField(term943828, term943828.getClass(), "showRgoSetting", false);
        setBooleanField(term943828, term943828.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943828, term943828.getClass(), "contestNowPlayingId", 0);
        setIntField(term943828, term943828.getClass(), "contestNowPlayingValue", 0);
        setField(term943828, term943828.getClass(), "contestNowPlayingResultRank", null);
        setField(term943828, term943828.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943828, term943828.getClass(), "myList0", null);
        setField(term943828, term943828.getClass(), "myList1", null);
        setField(term943828, term943828.getClass(), "myList2", null);
        setIntField(term943828, term943828.getClass(), "rivalPdId", 0);
        term943863 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943863;
        callMethod(klass, "setUsePerPvButtonSe", argTypes, term943828, args);
    }

};


