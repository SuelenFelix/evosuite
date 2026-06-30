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

public class PlayerProfile_setUsePerPvChainSliderSe_1194607796174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943902;
     Object term943937;

    public PlayerProfile_setUsePerPvChainSliderSe_1194607796174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943902 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943902, term943902.getClass(), "id", 0L);
        setIntField(term943902, term943902.getClass(), "pdId", 0);
        setField(term943902, term943902.getClass(), "playerName", null);
        setIntField(term943902, term943902.getClass(), "vocaloidPoints", 0);
        setIntField(term943902, term943902.getClass(), "level", 0);
        setIntField(term943902, term943902.getClass(), "levelExp", 0);
        setField(term943902, term943902.getClass(), "levelTitle", null);
        setIntField(term943902, term943902.getClass(), "plateId", 0);
        setIntField(term943902, term943902.getClass(), "plateEffectId", 0);
        setField(term943902, term943902.getClass(), "passwordStatus", null);
        setField(term943902, term943902.getClass(), "password", null);
        setBooleanField(term943902, term943902.getClass(), "preferPerPvModule", false);
        setBooleanField(term943902, term943902.getClass(), "preferCommonModule", false);
        setBooleanField(term943902, term943902.getClass(), "usePerPvSkin", false);
        setBooleanField(term943902, term943902.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943902, term943902.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943902, term943902.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943902, term943902.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943902, term943902.getClass(), "commonModule", null);
        setField(term943902, term943902.getClass(), "commonCustomizeItems", null);
        setField(term943902, term943902.getClass(), "commonModuleSetTime", null);
        setField(term943902, term943902.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943902, term943902.getClass(), "commonSkin", 0);
        setIntField(term943902, term943902.getClass(), "headphoneVolume", 0);
        setBooleanField(term943902, term943902.getClass(), "buttonSeOn", false);
        setIntField(term943902, term943902.getClass(), "buttonSeVolume", 0);
        setIntField(term943902, term943902.getClass(), "sliderSeVolume", 0);
        setIntField(term943902, term943902.getClass(), "buttonSe", 0);
        setIntField(term943902, term943902.getClass(), "chainSlideSe", 0);
        setIntField(term943902, term943902.getClass(), "slideSe", 0);
        setIntField(term943902, term943902.getClass(), "sliderTouchSe", 0);
        setField(term943902, term943902.getClass(), "sortMode", null);
        setIntField(term943902, term943902.getClass(), "nextPvId", 0);
        setField(term943902, term943902.getClass(), "nextDifficulty", null);
        setField(term943902, term943902.getClass(), "nextEdition", null);
        setBooleanField(term943902, term943902.getClass(), "showInterimRanking", false);
        setBooleanField(term943902, term943902.getClass(), "showClearStatus", false);
        setBooleanField(term943902, term943902.getClass(), "showGreatBorder", false);
        setBooleanField(term943902, term943902.getClass(), "showExcellentBorder", false);
        setBooleanField(term943902, term943902.getClass(), "showRivalBorder", false);
        setBooleanField(term943902, term943902.getClass(), "showRgoSetting", false);
        setBooleanField(term943902, term943902.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943902, term943902.getClass(), "contestNowPlayingId", 0);
        setIntField(term943902, term943902.getClass(), "contestNowPlayingValue", 0);
        setField(term943902, term943902.getClass(), "contestNowPlayingResultRank", null);
        setField(term943902, term943902.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943902, term943902.getClass(), "myList0", null);
        setField(term943902, term943902.getClass(), "myList1", null);
        setField(term943902, term943902.getClass(), "myList2", null);
        setIntField(term943902, term943902.getClass(), "rivalPdId", 0);
        term943937 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943937;
        callMethod(klass, "setUsePerPvChainSliderSe", argTypes, term943902, args);
    }

};


