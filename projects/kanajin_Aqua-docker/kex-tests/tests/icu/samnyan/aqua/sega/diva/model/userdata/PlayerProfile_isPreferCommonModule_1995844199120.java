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

public class PlayerProfile_isPreferCommonModule_1995844199120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941988;

    public PlayerProfile_isPreferCommonModule_1995844199120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941988 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term941988, term941988.getClass(), "id", 0L);
        setIntField(term941988, term941988.getClass(), "pdId", 0);
        setField(term941988, term941988.getClass(), "playerName", null);
        setIntField(term941988, term941988.getClass(), "vocaloidPoints", 0);
        setIntField(term941988, term941988.getClass(), "level", 0);
        setIntField(term941988, term941988.getClass(), "levelExp", 0);
        setField(term941988, term941988.getClass(), "levelTitle", null);
        setIntField(term941988, term941988.getClass(), "plateId", 0);
        setIntField(term941988, term941988.getClass(), "plateEffectId", 0);
        setField(term941988, term941988.getClass(), "passwordStatus", null);
        setField(term941988, term941988.getClass(), "password", null);
        setBooleanField(term941988, term941988.getClass(), "preferPerPvModule", false);
        setBooleanField(term941988, term941988.getClass(), "preferCommonModule", false);
        setBooleanField(term941988, term941988.getClass(), "usePerPvSkin", false);
        setBooleanField(term941988, term941988.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term941988, term941988.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term941988, term941988.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term941988, term941988.getClass(), "usePerPvTouchSliderSe", false);
        setField(term941988, term941988.getClass(), "commonModule", null);
        setField(term941988, term941988.getClass(), "commonCustomizeItems", null);
        setField(term941988, term941988.getClass(), "commonModuleSetTime", null);
        setField(term941988, term941988.getClass(), "moduleSelectItemFlag", null);
        setIntField(term941988, term941988.getClass(), "commonSkin", 0);
        setIntField(term941988, term941988.getClass(), "headphoneVolume", 0);
        setBooleanField(term941988, term941988.getClass(), "buttonSeOn", false);
        setIntField(term941988, term941988.getClass(), "buttonSeVolume", 0);
        setIntField(term941988, term941988.getClass(), "sliderSeVolume", 0);
        setIntField(term941988, term941988.getClass(), "buttonSe", 0);
        setIntField(term941988, term941988.getClass(), "chainSlideSe", 0);
        setIntField(term941988, term941988.getClass(), "slideSe", 0);
        setIntField(term941988, term941988.getClass(), "sliderTouchSe", 0);
        setField(term941988, term941988.getClass(), "sortMode", null);
        setIntField(term941988, term941988.getClass(), "nextPvId", 0);
        setField(term941988, term941988.getClass(), "nextDifficulty", null);
        setField(term941988, term941988.getClass(), "nextEdition", null);
        setBooleanField(term941988, term941988.getClass(), "showInterimRanking", false);
        setBooleanField(term941988, term941988.getClass(), "showClearStatus", false);
        setBooleanField(term941988, term941988.getClass(), "showGreatBorder", false);
        setBooleanField(term941988, term941988.getClass(), "showExcellentBorder", false);
        setBooleanField(term941988, term941988.getClass(), "showRivalBorder", false);
        setBooleanField(term941988, term941988.getClass(), "showRgoSetting", false);
        setBooleanField(term941988, term941988.getClass(), "contestNowPlayingEnable", false);
        setIntField(term941988, term941988.getClass(), "contestNowPlayingId", 0);
        setIntField(term941988, term941988.getClass(), "contestNowPlayingValue", 0);
        setField(term941988, term941988.getClass(), "contestNowPlayingResultRank", null);
        setField(term941988, term941988.getClass(), "contestNowPlayingSpecifier", null);
        setField(term941988, term941988.getClass(), "myList0", null);
        setField(term941988, term941988.getClass(), "myList1", null);
        setField(term941988, term941988.getClass(), "myList2", null);
        setIntField(term941988, term941988.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPreferCommonModule", argTypes, term941988, args);
    }

};


