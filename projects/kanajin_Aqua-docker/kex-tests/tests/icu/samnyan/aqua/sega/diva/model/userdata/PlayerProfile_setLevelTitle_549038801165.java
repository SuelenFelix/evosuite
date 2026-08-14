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

public class PlayerProfile_setLevelTitle_549038801165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916383;

    public PlayerProfile_setLevelTitle_549038801165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916383 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916383, term4916383.getClass(), "id", 0L);
        setIntField(term4916383, term4916383.getClass(), "pdId", 0);
        setField(term4916383, term4916383.getClass(), "playerName", null);
        setIntField(term4916383, term4916383.getClass(), "vocaloidPoints", 0);
        setIntField(term4916383, term4916383.getClass(), "level", 0);
        setIntField(term4916383, term4916383.getClass(), "levelExp", 0);
        setField(term4916383, term4916383.getClass(), "levelTitle", null);
        setIntField(term4916383, term4916383.getClass(), "plateId", 0);
        setIntField(term4916383, term4916383.getClass(), "plateEffectId", 0);
        setField(term4916383, term4916383.getClass(), "passwordStatus", null);
        setField(term4916383, term4916383.getClass(), "password", null);
        setBooleanField(term4916383, term4916383.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916383, term4916383.getClass(), "preferCommonModule", false);
        setBooleanField(term4916383, term4916383.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916383, term4916383.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916383, term4916383.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916383, term4916383.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916383, term4916383.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916383, term4916383.getClass(), "commonModule", null);
        setField(term4916383, term4916383.getClass(), "commonCustomizeItems", null);
        setField(term4916383, term4916383.getClass(), "commonModuleSetTime", null);
        setField(term4916383, term4916383.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916383, term4916383.getClass(), "commonSkin", 0);
        setIntField(term4916383, term4916383.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916383, term4916383.getClass(), "buttonSeOn", false);
        setIntField(term4916383, term4916383.getClass(), "buttonSeVolume", 0);
        setIntField(term4916383, term4916383.getClass(), "sliderSeVolume", 0);
        setIntField(term4916383, term4916383.getClass(), "buttonSe", 0);
        setIntField(term4916383, term4916383.getClass(), "chainSlideSe", 0);
        setIntField(term4916383, term4916383.getClass(), "slideSe", 0);
        setIntField(term4916383, term4916383.getClass(), "sliderTouchSe", 0);
        setField(term4916383, term4916383.getClass(), "sortMode", null);
        setIntField(term4916383, term4916383.getClass(), "nextPvId", 0);
        setField(term4916383, term4916383.getClass(), "nextDifficulty", null);
        setField(term4916383, term4916383.getClass(), "nextEdition", null);
        setBooleanField(term4916383, term4916383.getClass(), "showInterimRanking", false);
        setBooleanField(term4916383, term4916383.getClass(), "showClearStatus", false);
        setBooleanField(term4916383, term4916383.getClass(), "showGreatBorder", false);
        setBooleanField(term4916383, term4916383.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916383, term4916383.getClass(), "showRivalBorder", false);
        setBooleanField(term4916383, term4916383.getClass(), "showRgoSetting", false);
        setBooleanField(term4916383, term4916383.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916383, term4916383.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916383, term4916383.getClass(), "contestNowPlayingValue", 0);
        setField(term4916383, term4916383.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916383, term4916383.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916383, term4916383.getClass(), "myList0", null);
        setField(term4916383, term4916383.getClass(), "myList1", null);
        setField(term4916383, term4916383.getClass(), "myList2", null);
        setIntField(term4916383, term4916383.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLevelTitle", argTypes, term4916383, args);
    }

};


