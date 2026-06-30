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

public class PlayerProfile_getNextDifficulty_1002174718141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942723;

    public PlayerProfile_getNextDifficulty_1002174718141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942723 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942723, term942723.getClass(), "id", 0L);
        setIntField(term942723, term942723.getClass(), "pdId", 0);
        setField(term942723, term942723.getClass(), "playerName", null);
        setIntField(term942723, term942723.getClass(), "vocaloidPoints", 0);
        setIntField(term942723, term942723.getClass(), "level", 0);
        setIntField(term942723, term942723.getClass(), "levelExp", 0);
        setField(term942723, term942723.getClass(), "levelTitle", null);
        setIntField(term942723, term942723.getClass(), "plateId", 0);
        setIntField(term942723, term942723.getClass(), "plateEffectId", 0);
        setField(term942723, term942723.getClass(), "passwordStatus", null);
        setField(term942723, term942723.getClass(), "password", null);
        setBooleanField(term942723, term942723.getClass(), "preferPerPvModule", false);
        setBooleanField(term942723, term942723.getClass(), "preferCommonModule", false);
        setBooleanField(term942723, term942723.getClass(), "usePerPvSkin", false);
        setBooleanField(term942723, term942723.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942723, term942723.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942723, term942723.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942723, term942723.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942723, term942723.getClass(), "commonModule", null);
        setField(term942723, term942723.getClass(), "commonCustomizeItems", null);
        setField(term942723, term942723.getClass(), "commonModuleSetTime", null);
        setField(term942723, term942723.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942723, term942723.getClass(), "commonSkin", 0);
        setIntField(term942723, term942723.getClass(), "headphoneVolume", 0);
        setBooleanField(term942723, term942723.getClass(), "buttonSeOn", false);
        setIntField(term942723, term942723.getClass(), "buttonSeVolume", 0);
        setIntField(term942723, term942723.getClass(), "sliderSeVolume", 0);
        setIntField(term942723, term942723.getClass(), "buttonSe", 0);
        setIntField(term942723, term942723.getClass(), "chainSlideSe", 0);
        setIntField(term942723, term942723.getClass(), "slideSe", 0);
        setIntField(term942723, term942723.getClass(), "sliderTouchSe", 0);
        setField(term942723, term942723.getClass(), "sortMode", null);
        setIntField(term942723, term942723.getClass(), "nextPvId", 0);
        setField(term942723, term942723.getClass(), "nextDifficulty", null);
        setField(term942723, term942723.getClass(), "nextEdition", null);
        setBooleanField(term942723, term942723.getClass(), "showInterimRanking", false);
        setBooleanField(term942723, term942723.getClass(), "showClearStatus", false);
        setBooleanField(term942723, term942723.getClass(), "showGreatBorder", false);
        setBooleanField(term942723, term942723.getClass(), "showExcellentBorder", false);
        setBooleanField(term942723, term942723.getClass(), "showRivalBorder", false);
        setBooleanField(term942723, term942723.getClass(), "showRgoSetting", false);
        setBooleanField(term942723, term942723.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942723, term942723.getClass(), "contestNowPlayingId", 0);
        setIntField(term942723, term942723.getClass(), "contestNowPlayingValue", 0);
        setField(term942723, term942723.getClass(), "contestNowPlayingResultRank", null);
        setField(term942723, term942723.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942723, term942723.getClass(), "myList0", null);
        setField(term942723, term942723.getClass(), "myList1", null);
        setField(term942723, term942723.getClass(), "myList2", null);
        setIntField(term942723, term942723.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextDifficulty", argTypes, term942723, args);
    }

};


