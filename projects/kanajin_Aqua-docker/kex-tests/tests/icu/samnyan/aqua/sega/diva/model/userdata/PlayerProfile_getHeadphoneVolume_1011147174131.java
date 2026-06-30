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

public class PlayerProfile_getHeadphoneVolume_1011147174131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942373;

    public PlayerProfile_getHeadphoneVolume_1011147174131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942373 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942373, term942373.getClass(), "id", 0L);
        setIntField(term942373, term942373.getClass(), "pdId", 0);
        setField(term942373, term942373.getClass(), "playerName", null);
        setIntField(term942373, term942373.getClass(), "vocaloidPoints", 0);
        setIntField(term942373, term942373.getClass(), "level", 0);
        setIntField(term942373, term942373.getClass(), "levelExp", 0);
        setField(term942373, term942373.getClass(), "levelTitle", null);
        setIntField(term942373, term942373.getClass(), "plateId", 0);
        setIntField(term942373, term942373.getClass(), "plateEffectId", 0);
        setField(term942373, term942373.getClass(), "passwordStatus", null);
        setField(term942373, term942373.getClass(), "password", null);
        setBooleanField(term942373, term942373.getClass(), "preferPerPvModule", false);
        setBooleanField(term942373, term942373.getClass(), "preferCommonModule", false);
        setBooleanField(term942373, term942373.getClass(), "usePerPvSkin", false);
        setBooleanField(term942373, term942373.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942373, term942373.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942373, term942373.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942373, term942373.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942373, term942373.getClass(), "commonModule", null);
        setField(term942373, term942373.getClass(), "commonCustomizeItems", null);
        setField(term942373, term942373.getClass(), "commonModuleSetTime", null);
        setField(term942373, term942373.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942373, term942373.getClass(), "commonSkin", 0);
        setIntField(term942373, term942373.getClass(), "headphoneVolume", 0);
        setBooleanField(term942373, term942373.getClass(), "buttonSeOn", false);
        setIntField(term942373, term942373.getClass(), "buttonSeVolume", 0);
        setIntField(term942373, term942373.getClass(), "sliderSeVolume", 0);
        setIntField(term942373, term942373.getClass(), "buttonSe", 0);
        setIntField(term942373, term942373.getClass(), "chainSlideSe", 0);
        setIntField(term942373, term942373.getClass(), "slideSe", 0);
        setIntField(term942373, term942373.getClass(), "sliderTouchSe", 0);
        setField(term942373, term942373.getClass(), "sortMode", null);
        setIntField(term942373, term942373.getClass(), "nextPvId", 0);
        setField(term942373, term942373.getClass(), "nextDifficulty", null);
        setField(term942373, term942373.getClass(), "nextEdition", null);
        setBooleanField(term942373, term942373.getClass(), "showInterimRanking", false);
        setBooleanField(term942373, term942373.getClass(), "showClearStatus", false);
        setBooleanField(term942373, term942373.getClass(), "showGreatBorder", false);
        setBooleanField(term942373, term942373.getClass(), "showExcellentBorder", false);
        setBooleanField(term942373, term942373.getClass(), "showRivalBorder", false);
        setBooleanField(term942373, term942373.getClass(), "showRgoSetting", false);
        setBooleanField(term942373, term942373.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942373, term942373.getClass(), "contestNowPlayingId", 0);
        setIntField(term942373, term942373.getClass(), "contestNowPlayingValue", 0);
        setField(term942373, term942373.getClass(), "contestNowPlayingResultRank", null);
        setField(term942373, term942373.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942373, term942373.getClass(), "myList0", null);
        setField(term942373, term942373.getClass(), "myList1", null);
        setField(term942373, term942373.getClass(), "myList2", null);
        setIntField(term942373, term942373.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphoneVolume", argTypes, term942373, args);
    }

};


