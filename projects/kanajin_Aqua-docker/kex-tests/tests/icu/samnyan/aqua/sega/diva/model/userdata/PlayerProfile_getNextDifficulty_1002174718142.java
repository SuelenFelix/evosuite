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

public class PlayerProfile_getNextDifficulty_1002174718142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915568;

    public PlayerProfile_getNextDifficulty_1002174718142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915568 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915568, term4915568.getClass(), "id", 0L);
        setIntField(term4915568, term4915568.getClass(), "pdId", 0);
        setField(term4915568, term4915568.getClass(), "playerName", null);
        setIntField(term4915568, term4915568.getClass(), "vocaloidPoints", 0);
        setIntField(term4915568, term4915568.getClass(), "level", 0);
        setIntField(term4915568, term4915568.getClass(), "levelExp", 0);
        setField(term4915568, term4915568.getClass(), "levelTitle", null);
        setIntField(term4915568, term4915568.getClass(), "plateId", 0);
        setIntField(term4915568, term4915568.getClass(), "plateEffectId", 0);
        setField(term4915568, term4915568.getClass(), "passwordStatus", null);
        setField(term4915568, term4915568.getClass(), "password", null);
        setBooleanField(term4915568, term4915568.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915568, term4915568.getClass(), "preferCommonModule", false);
        setBooleanField(term4915568, term4915568.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915568, term4915568.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915568, term4915568.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915568, term4915568.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915568, term4915568.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915568, term4915568.getClass(), "commonModule", null);
        setField(term4915568, term4915568.getClass(), "commonCustomizeItems", null);
        setField(term4915568, term4915568.getClass(), "commonModuleSetTime", null);
        setField(term4915568, term4915568.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915568, term4915568.getClass(), "commonSkin", 0);
        setIntField(term4915568, term4915568.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915568, term4915568.getClass(), "buttonSeOn", false);
        setIntField(term4915568, term4915568.getClass(), "buttonSeVolume", 0);
        setIntField(term4915568, term4915568.getClass(), "sliderSeVolume", 0);
        setIntField(term4915568, term4915568.getClass(), "buttonSe", 0);
        setIntField(term4915568, term4915568.getClass(), "chainSlideSe", 0);
        setIntField(term4915568, term4915568.getClass(), "slideSe", 0);
        setIntField(term4915568, term4915568.getClass(), "sliderTouchSe", 0);
        setField(term4915568, term4915568.getClass(), "sortMode", null);
        setIntField(term4915568, term4915568.getClass(), "nextPvId", 0);
        setField(term4915568, term4915568.getClass(), "nextDifficulty", null);
        setField(term4915568, term4915568.getClass(), "nextEdition", null);
        setBooleanField(term4915568, term4915568.getClass(), "showInterimRanking", false);
        setBooleanField(term4915568, term4915568.getClass(), "showClearStatus", false);
        setBooleanField(term4915568, term4915568.getClass(), "showGreatBorder", false);
        setBooleanField(term4915568, term4915568.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915568, term4915568.getClass(), "showRivalBorder", false);
        setBooleanField(term4915568, term4915568.getClass(), "showRgoSetting", false);
        setBooleanField(term4915568, term4915568.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915568, term4915568.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915568, term4915568.getClass(), "contestNowPlayingValue", 0);
        setField(term4915568, term4915568.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915568, term4915568.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915568, term4915568.getClass(), "myList0", null);
        setField(term4915568, term4915568.getClass(), "myList1", null);
        setField(term4915568, term4915568.getClass(), "myList2", null);
        setIntField(term4915568, term4915568.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextDifficulty", argTypes, term4915568, args);
    }

};


