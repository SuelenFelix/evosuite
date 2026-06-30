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

public class PlayerProfile_getCommonSkin_1173175482130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942338;

    public PlayerProfile_getCommonSkin_1173175482130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942338 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942338, term942338.getClass(), "id", 0L);
        setIntField(term942338, term942338.getClass(), "pdId", 0);
        setField(term942338, term942338.getClass(), "playerName", null);
        setIntField(term942338, term942338.getClass(), "vocaloidPoints", 0);
        setIntField(term942338, term942338.getClass(), "level", 0);
        setIntField(term942338, term942338.getClass(), "levelExp", 0);
        setField(term942338, term942338.getClass(), "levelTitle", null);
        setIntField(term942338, term942338.getClass(), "plateId", 0);
        setIntField(term942338, term942338.getClass(), "plateEffectId", 0);
        setField(term942338, term942338.getClass(), "passwordStatus", null);
        setField(term942338, term942338.getClass(), "password", null);
        setBooleanField(term942338, term942338.getClass(), "preferPerPvModule", false);
        setBooleanField(term942338, term942338.getClass(), "preferCommonModule", false);
        setBooleanField(term942338, term942338.getClass(), "usePerPvSkin", false);
        setBooleanField(term942338, term942338.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942338, term942338.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942338, term942338.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942338, term942338.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942338, term942338.getClass(), "commonModule", null);
        setField(term942338, term942338.getClass(), "commonCustomizeItems", null);
        setField(term942338, term942338.getClass(), "commonModuleSetTime", null);
        setField(term942338, term942338.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942338, term942338.getClass(), "commonSkin", 0);
        setIntField(term942338, term942338.getClass(), "headphoneVolume", 0);
        setBooleanField(term942338, term942338.getClass(), "buttonSeOn", false);
        setIntField(term942338, term942338.getClass(), "buttonSeVolume", 0);
        setIntField(term942338, term942338.getClass(), "sliderSeVolume", 0);
        setIntField(term942338, term942338.getClass(), "buttonSe", 0);
        setIntField(term942338, term942338.getClass(), "chainSlideSe", 0);
        setIntField(term942338, term942338.getClass(), "slideSe", 0);
        setIntField(term942338, term942338.getClass(), "sliderTouchSe", 0);
        setField(term942338, term942338.getClass(), "sortMode", null);
        setIntField(term942338, term942338.getClass(), "nextPvId", 0);
        setField(term942338, term942338.getClass(), "nextDifficulty", null);
        setField(term942338, term942338.getClass(), "nextEdition", null);
        setBooleanField(term942338, term942338.getClass(), "showInterimRanking", false);
        setBooleanField(term942338, term942338.getClass(), "showClearStatus", false);
        setBooleanField(term942338, term942338.getClass(), "showGreatBorder", false);
        setBooleanField(term942338, term942338.getClass(), "showExcellentBorder", false);
        setBooleanField(term942338, term942338.getClass(), "showRivalBorder", false);
        setBooleanField(term942338, term942338.getClass(), "showRgoSetting", false);
        setBooleanField(term942338, term942338.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942338, term942338.getClass(), "contestNowPlayingId", 0);
        setIntField(term942338, term942338.getClass(), "contestNowPlayingValue", 0);
        setField(term942338, term942338.getClass(), "contestNowPlayingResultRank", null);
        setField(term942338, term942338.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942338, term942338.getClass(), "myList0", null);
        setField(term942338, term942338.getClass(), "myList1", null);
        setField(term942338, term942338.getClass(), "myList2", null);
        setIntField(term942338, term942338.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCommonSkin", argTypes, term942338, args);
    }

};


