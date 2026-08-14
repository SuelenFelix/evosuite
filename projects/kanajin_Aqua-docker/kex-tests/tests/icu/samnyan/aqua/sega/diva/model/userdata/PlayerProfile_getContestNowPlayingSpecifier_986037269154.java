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

public class PlayerProfile_getContestNowPlayingSpecifier_986037269154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915988;

    public PlayerProfile_getContestNowPlayingSpecifier_986037269154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915988 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915988, term4915988.getClass(), "id", 0L);
        setIntField(term4915988, term4915988.getClass(), "pdId", 0);
        setField(term4915988, term4915988.getClass(), "playerName", null);
        setIntField(term4915988, term4915988.getClass(), "vocaloidPoints", 0);
        setIntField(term4915988, term4915988.getClass(), "level", 0);
        setIntField(term4915988, term4915988.getClass(), "levelExp", 0);
        setField(term4915988, term4915988.getClass(), "levelTitle", null);
        setIntField(term4915988, term4915988.getClass(), "plateId", 0);
        setIntField(term4915988, term4915988.getClass(), "plateEffectId", 0);
        setField(term4915988, term4915988.getClass(), "passwordStatus", null);
        setField(term4915988, term4915988.getClass(), "password", null);
        setBooleanField(term4915988, term4915988.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915988, term4915988.getClass(), "preferCommonModule", false);
        setBooleanField(term4915988, term4915988.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915988, term4915988.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915988, term4915988.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915988, term4915988.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915988, term4915988.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915988, term4915988.getClass(), "commonModule", null);
        setField(term4915988, term4915988.getClass(), "commonCustomizeItems", null);
        setField(term4915988, term4915988.getClass(), "commonModuleSetTime", null);
        setField(term4915988, term4915988.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915988, term4915988.getClass(), "commonSkin", 0);
        setIntField(term4915988, term4915988.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915988, term4915988.getClass(), "buttonSeOn", false);
        setIntField(term4915988, term4915988.getClass(), "buttonSeVolume", 0);
        setIntField(term4915988, term4915988.getClass(), "sliderSeVolume", 0);
        setIntField(term4915988, term4915988.getClass(), "buttonSe", 0);
        setIntField(term4915988, term4915988.getClass(), "chainSlideSe", 0);
        setIntField(term4915988, term4915988.getClass(), "slideSe", 0);
        setIntField(term4915988, term4915988.getClass(), "sliderTouchSe", 0);
        setField(term4915988, term4915988.getClass(), "sortMode", null);
        setIntField(term4915988, term4915988.getClass(), "nextPvId", 0);
        setField(term4915988, term4915988.getClass(), "nextDifficulty", null);
        setField(term4915988, term4915988.getClass(), "nextEdition", null);
        setBooleanField(term4915988, term4915988.getClass(), "showInterimRanking", false);
        setBooleanField(term4915988, term4915988.getClass(), "showClearStatus", false);
        setBooleanField(term4915988, term4915988.getClass(), "showGreatBorder", false);
        setBooleanField(term4915988, term4915988.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915988, term4915988.getClass(), "showRivalBorder", false);
        setBooleanField(term4915988, term4915988.getClass(), "showRgoSetting", false);
        setBooleanField(term4915988, term4915988.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915988, term4915988.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915988, term4915988.getClass(), "contestNowPlayingValue", 0);
        setField(term4915988, term4915988.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915988, term4915988.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915988, term4915988.getClass(), "myList0", null);
        setField(term4915988, term4915988.getClass(), "myList1", null);
        setField(term4915988, term4915988.getClass(), "myList2", null);
        setIntField(term4915988, term4915988.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingSpecifier", argTypes, term4915988, args);
    }

};


