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

public class PlayerProfile_getRivalPdId_1065808939157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943283;

    public PlayerProfile_getRivalPdId_1065808939157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943283 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943283, term943283.getClass(), "id", 0L);
        setIntField(term943283, term943283.getClass(), "pdId", 0);
        setField(term943283, term943283.getClass(), "playerName", null);
        setIntField(term943283, term943283.getClass(), "vocaloidPoints", 0);
        setIntField(term943283, term943283.getClass(), "level", 0);
        setIntField(term943283, term943283.getClass(), "levelExp", 0);
        setField(term943283, term943283.getClass(), "levelTitle", null);
        setIntField(term943283, term943283.getClass(), "plateId", 0);
        setIntField(term943283, term943283.getClass(), "plateEffectId", 0);
        setField(term943283, term943283.getClass(), "passwordStatus", null);
        setField(term943283, term943283.getClass(), "password", null);
        setBooleanField(term943283, term943283.getClass(), "preferPerPvModule", false);
        setBooleanField(term943283, term943283.getClass(), "preferCommonModule", false);
        setBooleanField(term943283, term943283.getClass(), "usePerPvSkin", false);
        setBooleanField(term943283, term943283.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943283, term943283.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943283, term943283.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943283, term943283.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943283, term943283.getClass(), "commonModule", null);
        setField(term943283, term943283.getClass(), "commonCustomizeItems", null);
        setField(term943283, term943283.getClass(), "commonModuleSetTime", null);
        setField(term943283, term943283.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943283, term943283.getClass(), "commonSkin", 0);
        setIntField(term943283, term943283.getClass(), "headphoneVolume", 0);
        setBooleanField(term943283, term943283.getClass(), "buttonSeOn", false);
        setIntField(term943283, term943283.getClass(), "buttonSeVolume", 0);
        setIntField(term943283, term943283.getClass(), "sliderSeVolume", 0);
        setIntField(term943283, term943283.getClass(), "buttonSe", 0);
        setIntField(term943283, term943283.getClass(), "chainSlideSe", 0);
        setIntField(term943283, term943283.getClass(), "slideSe", 0);
        setIntField(term943283, term943283.getClass(), "sliderTouchSe", 0);
        setField(term943283, term943283.getClass(), "sortMode", null);
        setIntField(term943283, term943283.getClass(), "nextPvId", 0);
        setField(term943283, term943283.getClass(), "nextDifficulty", null);
        setField(term943283, term943283.getClass(), "nextEdition", null);
        setBooleanField(term943283, term943283.getClass(), "showInterimRanking", false);
        setBooleanField(term943283, term943283.getClass(), "showClearStatus", false);
        setBooleanField(term943283, term943283.getClass(), "showGreatBorder", false);
        setBooleanField(term943283, term943283.getClass(), "showExcellentBorder", false);
        setBooleanField(term943283, term943283.getClass(), "showRivalBorder", false);
        setBooleanField(term943283, term943283.getClass(), "showRgoSetting", false);
        setBooleanField(term943283, term943283.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943283, term943283.getClass(), "contestNowPlayingId", 0);
        setIntField(term943283, term943283.getClass(), "contestNowPlayingValue", 0);
        setField(term943283, term943283.getClass(), "contestNowPlayingResultRank", null);
        setField(term943283, term943283.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943283, term943283.getClass(), "myList0", null);
        setField(term943283, term943283.getClass(), "myList1", null);
        setField(term943283, term943283.getClass(), "myList2", null);
        setIntField(term943283, term943283.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalPdId", argTypes, term943283, args);
    }

};


