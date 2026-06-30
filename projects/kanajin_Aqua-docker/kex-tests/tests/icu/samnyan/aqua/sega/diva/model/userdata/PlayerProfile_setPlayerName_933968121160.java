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

public class PlayerProfile_setPlayerName_933968121160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943392;

    public PlayerProfile_setPlayerName_933968121160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943392 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943392, term943392.getClass(), "id", 0L);
        setIntField(term943392, term943392.getClass(), "pdId", 0);
        setField(term943392, term943392.getClass(), "playerName", null);
        setIntField(term943392, term943392.getClass(), "vocaloidPoints", 0);
        setIntField(term943392, term943392.getClass(), "level", 0);
        setIntField(term943392, term943392.getClass(), "levelExp", 0);
        setField(term943392, term943392.getClass(), "levelTitle", null);
        setIntField(term943392, term943392.getClass(), "plateId", 0);
        setIntField(term943392, term943392.getClass(), "plateEffectId", 0);
        setField(term943392, term943392.getClass(), "passwordStatus", null);
        setField(term943392, term943392.getClass(), "password", null);
        setBooleanField(term943392, term943392.getClass(), "preferPerPvModule", false);
        setBooleanField(term943392, term943392.getClass(), "preferCommonModule", false);
        setBooleanField(term943392, term943392.getClass(), "usePerPvSkin", false);
        setBooleanField(term943392, term943392.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943392, term943392.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943392, term943392.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943392, term943392.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943392, term943392.getClass(), "commonModule", null);
        setField(term943392, term943392.getClass(), "commonCustomizeItems", null);
        setField(term943392, term943392.getClass(), "commonModuleSetTime", null);
        setField(term943392, term943392.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943392, term943392.getClass(), "commonSkin", 0);
        setIntField(term943392, term943392.getClass(), "headphoneVolume", 0);
        setBooleanField(term943392, term943392.getClass(), "buttonSeOn", false);
        setIntField(term943392, term943392.getClass(), "buttonSeVolume", 0);
        setIntField(term943392, term943392.getClass(), "sliderSeVolume", 0);
        setIntField(term943392, term943392.getClass(), "buttonSe", 0);
        setIntField(term943392, term943392.getClass(), "chainSlideSe", 0);
        setIntField(term943392, term943392.getClass(), "slideSe", 0);
        setIntField(term943392, term943392.getClass(), "sliderTouchSe", 0);
        setField(term943392, term943392.getClass(), "sortMode", null);
        setIntField(term943392, term943392.getClass(), "nextPvId", 0);
        setField(term943392, term943392.getClass(), "nextDifficulty", null);
        setField(term943392, term943392.getClass(), "nextEdition", null);
        setBooleanField(term943392, term943392.getClass(), "showInterimRanking", false);
        setBooleanField(term943392, term943392.getClass(), "showClearStatus", false);
        setBooleanField(term943392, term943392.getClass(), "showGreatBorder", false);
        setBooleanField(term943392, term943392.getClass(), "showExcellentBorder", false);
        setBooleanField(term943392, term943392.getClass(), "showRivalBorder", false);
        setBooleanField(term943392, term943392.getClass(), "showRgoSetting", false);
        setBooleanField(term943392, term943392.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943392, term943392.getClass(), "contestNowPlayingId", 0);
        setIntField(term943392, term943392.getClass(), "contestNowPlayingValue", 0);
        setField(term943392, term943392.getClass(), "contestNowPlayingResultRank", null);
        setField(term943392, term943392.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943392, term943392.getClass(), "myList0", null);
        setField(term943392, term943392.getClass(), "myList1", null);
        setField(term943392, term943392.getClass(), "myList2", null);
        setIntField(term943392, term943392.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayerName", argTypes, term943392, args);
    }

};


