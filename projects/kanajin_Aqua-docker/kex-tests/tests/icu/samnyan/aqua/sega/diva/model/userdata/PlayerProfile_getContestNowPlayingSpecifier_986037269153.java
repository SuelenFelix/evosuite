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

public class PlayerProfile_getContestNowPlayingSpecifier_986037269153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943143;

    public PlayerProfile_getContestNowPlayingSpecifier_986037269153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943143 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943143, term943143.getClass(), "id", 0L);
        setIntField(term943143, term943143.getClass(), "pdId", 0);
        setField(term943143, term943143.getClass(), "playerName", null);
        setIntField(term943143, term943143.getClass(), "vocaloidPoints", 0);
        setIntField(term943143, term943143.getClass(), "level", 0);
        setIntField(term943143, term943143.getClass(), "levelExp", 0);
        setField(term943143, term943143.getClass(), "levelTitle", null);
        setIntField(term943143, term943143.getClass(), "plateId", 0);
        setIntField(term943143, term943143.getClass(), "plateEffectId", 0);
        setField(term943143, term943143.getClass(), "passwordStatus", null);
        setField(term943143, term943143.getClass(), "password", null);
        setBooleanField(term943143, term943143.getClass(), "preferPerPvModule", false);
        setBooleanField(term943143, term943143.getClass(), "preferCommonModule", false);
        setBooleanField(term943143, term943143.getClass(), "usePerPvSkin", false);
        setBooleanField(term943143, term943143.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943143, term943143.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943143, term943143.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943143, term943143.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943143, term943143.getClass(), "commonModule", null);
        setField(term943143, term943143.getClass(), "commonCustomizeItems", null);
        setField(term943143, term943143.getClass(), "commonModuleSetTime", null);
        setField(term943143, term943143.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943143, term943143.getClass(), "commonSkin", 0);
        setIntField(term943143, term943143.getClass(), "headphoneVolume", 0);
        setBooleanField(term943143, term943143.getClass(), "buttonSeOn", false);
        setIntField(term943143, term943143.getClass(), "buttonSeVolume", 0);
        setIntField(term943143, term943143.getClass(), "sliderSeVolume", 0);
        setIntField(term943143, term943143.getClass(), "buttonSe", 0);
        setIntField(term943143, term943143.getClass(), "chainSlideSe", 0);
        setIntField(term943143, term943143.getClass(), "slideSe", 0);
        setIntField(term943143, term943143.getClass(), "sliderTouchSe", 0);
        setField(term943143, term943143.getClass(), "sortMode", null);
        setIntField(term943143, term943143.getClass(), "nextPvId", 0);
        setField(term943143, term943143.getClass(), "nextDifficulty", null);
        setField(term943143, term943143.getClass(), "nextEdition", null);
        setBooleanField(term943143, term943143.getClass(), "showInterimRanking", false);
        setBooleanField(term943143, term943143.getClass(), "showClearStatus", false);
        setBooleanField(term943143, term943143.getClass(), "showGreatBorder", false);
        setBooleanField(term943143, term943143.getClass(), "showExcellentBorder", false);
        setBooleanField(term943143, term943143.getClass(), "showRivalBorder", false);
        setBooleanField(term943143, term943143.getClass(), "showRgoSetting", false);
        setBooleanField(term943143, term943143.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943143, term943143.getClass(), "contestNowPlayingId", 0);
        setIntField(term943143, term943143.getClass(), "contestNowPlayingValue", 0);
        setField(term943143, term943143.getClass(), "contestNowPlayingResultRank", null);
        setField(term943143, term943143.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943143, term943143.getClass(), "myList0", null);
        setField(term943143, term943143.getClass(), "myList1", null);
        setField(term943143, term943143.getClass(), "myList2", null);
        setIntField(term943143, term943143.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingSpecifier", argTypes, term943143, args);
    }

};


