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

public class PlayerProfile_getMyList2_2121888767156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943248;

    public PlayerProfile_getMyList2_2121888767156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943248 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943248, term943248.getClass(), "id", 0L);
        setIntField(term943248, term943248.getClass(), "pdId", 0);
        setField(term943248, term943248.getClass(), "playerName", null);
        setIntField(term943248, term943248.getClass(), "vocaloidPoints", 0);
        setIntField(term943248, term943248.getClass(), "level", 0);
        setIntField(term943248, term943248.getClass(), "levelExp", 0);
        setField(term943248, term943248.getClass(), "levelTitle", null);
        setIntField(term943248, term943248.getClass(), "plateId", 0);
        setIntField(term943248, term943248.getClass(), "plateEffectId", 0);
        setField(term943248, term943248.getClass(), "passwordStatus", null);
        setField(term943248, term943248.getClass(), "password", null);
        setBooleanField(term943248, term943248.getClass(), "preferPerPvModule", false);
        setBooleanField(term943248, term943248.getClass(), "preferCommonModule", false);
        setBooleanField(term943248, term943248.getClass(), "usePerPvSkin", false);
        setBooleanField(term943248, term943248.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943248, term943248.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943248, term943248.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943248, term943248.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943248, term943248.getClass(), "commonModule", null);
        setField(term943248, term943248.getClass(), "commonCustomizeItems", null);
        setField(term943248, term943248.getClass(), "commonModuleSetTime", null);
        setField(term943248, term943248.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943248, term943248.getClass(), "commonSkin", 0);
        setIntField(term943248, term943248.getClass(), "headphoneVolume", 0);
        setBooleanField(term943248, term943248.getClass(), "buttonSeOn", false);
        setIntField(term943248, term943248.getClass(), "buttonSeVolume", 0);
        setIntField(term943248, term943248.getClass(), "sliderSeVolume", 0);
        setIntField(term943248, term943248.getClass(), "buttonSe", 0);
        setIntField(term943248, term943248.getClass(), "chainSlideSe", 0);
        setIntField(term943248, term943248.getClass(), "slideSe", 0);
        setIntField(term943248, term943248.getClass(), "sliderTouchSe", 0);
        setField(term943248, term943248.getClass(), "sortMode", null);
        setIntField(term943248, term943248.getClass(), "nextPvId", 0);
        setField(term943248, term943248.getClass(), "nextDifficulty", null);
        setField(term943248, term943248.getClass(), "nextEdition", null);
        setBooleanField(term943248, term943248.getClass(), "showInterimRanking", false);
        setBooleanField(term943248, term943248.getClass(), "showClearStatus", false);
        setBooleanField(term943248, term943248.getClass(), "showGreatBorder", false);
        setBooleanField(term943248, term943248.getClass(), "showExcellentBorder", false);
        setBooleanField(term943248, term943248.getClass(), "showRivalBorder", false);
        setBooleanField(term943248, term943248.getClass(), "showRgoSetting", false);
        setBooleanField(term943248, term943248.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943248, term943248.getClass(), "contestNowPlayingId", 0);
        setIntField(term943248, term943248.getClass(), "contestNowPlayingValue", 0);
        setField(term943248, term943248.getClass(), "contestNowPlayingResultRank", null);
        setField(term943248, term943248.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943248, term943248.getClass(), "myList0", null);
        setField(term943248, term943248.getClass(), "myList1", null);
        setField(term943248, term943248.getClass(), "myList2", null);
        setIntField(term943248, term943248.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList2", argTypes, term943248, args);
    }

};


