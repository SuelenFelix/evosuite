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

public class PlayerProfile_getHeadphoneVolume_1011147174132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915218;

    public PlayerProfile_getHeadphoneVolume_1011147174132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915218 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915218, term4915218.getClass(), "id", 0L);
        setIntField(term4915218, term4915218.getClass(), "pdId", 0);
        setField(term4915218, term4915218.getClass(), "playerName", null);
        setIntField(term4915218, term4915218.getClass(), "vocaloidPoints", 0);
        setIntField(term4915218, term4915218.getClass(), "level", 0);
        setIntField(term4915218, term4915218.getClass(), "levelExp", 0);
        setField(term4915218, term4915218.getClass(), "levelTitle", null);
        setIntField(term4915218, term4915218.getClass(), "plateId", 0);
        setIntField(term4915218, term4915218.getClass(), "plateEffectId", 0);
        setField(term4915218, term4915218.getClass(), "passwordStatus", null);
        setField(term4915218, term4915218.getClass(), "password", null);
        setBooleanField(term4915218, term4915218.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915218, term4915218.getClass(), "preferCommonModule", false);
        setBooleanField(term4915218, term4915218.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915218, term4915218.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915218, term4915218.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915218, term4915218.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915218, term4915218.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915218, term4915218.getClass(), "commonModule", null);
        setField(term4915218, term4915218.getClass(), "commonCustomizeItems", null);
        setField(term4915218, term4915218.getClass(), "commonModuleSetTime", null);
        setField(term4915218, term4915218.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915218, term4915218.getClass(), "commonSkin", 0);
        setIntField(term4915218, term4915218.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915218, term4915218.getClass(), "buttonSeOn", false);
        setIntField(term4915218, term4915218.getClass(), "buttonSeVolume", 0);
        setIntField(term4915218, term4915218.getClass(), "sliderSeVolume", 0);
        setIntField(term4915218, term4915218.getClass(), "buttonSe", 0);
        setIntField(term4915218, term4915218.getClass(), "chainSlideSe", 0);
        setIntField(term4915218, term4915218.getClass(), "slideSe", 0);
        setIntField(term4915218, term4915218.getClass(), "sliderTouchSe", 0);
        setField(term4915218, term4915218.getClass(), "sortMode", null);
        setIntField(term4915218, term4915218.getClass(), "nextPvId", 0);
        setField(term4915218, term4915218.getClass(), "nextDifficulty", null);
        setField(term4915218, term4915218.getClass(), "nextEdition", null);
        setBooleanField(term4915218, term4915218.getClass(), "showInterimRanking", false);
        setBooleanField(term4915218, term4915218.getClass(), "showClearStatus", false);
        setBooleanField(term4915218, term4915218.getClass(), "showGreatBorder", false);
        setBooleanField(term4915218, term4915218.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915218, term4915218.getClass(), "showRivalBorder", false);
        setBooleanField(term4915218, term4915218.getClass(), "showRgoSetting", false);
        setBooleanField(term4915218, term4915218.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915218, term4915218.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915218, term4915218.getClass(), "contestNowPlayingValue", 0);
        setField(term4915218, term4915218.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915218, term4915218.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915218, term4915218.getClass(), "myList0", null);
        setField(term4915218, term4915218.getClass(), "myList1", null);
        setField(term4915218, term4915218.getClass(), "myList2", null);
        setIntField(term4915218, term4915218.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphoneVolume", argTypes, term4915218, args);
    }

};


