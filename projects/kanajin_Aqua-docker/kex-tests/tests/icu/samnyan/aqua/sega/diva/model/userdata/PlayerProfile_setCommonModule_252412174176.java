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

public class PlayerProfile_setCommonModule_252412174176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943976;

    public PlayerProfile_setCommonModule_252412174176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943976 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943976, term943976.getClass(), "id", 0L);
        setIntField(term943976, term943976.getClass(), "pdId", 0);
        setField(term943976, term943976.getClass(), "playerName", null);
        setIntField(term943976, term943976.getClass(), "vocaloidPoints", 0);
        setIntField(term943976, term943976.getClass(), "level", 0);
        setIntField(term943976, term943976.getClass(), "levelExp", 0);
        setField(term943976, term943976.getClass(), "levelTitle", null);
        setIntField(term943976, term943976.getClass(), "plateId", 0);
        setIntField(term943976, term943976.getClass(), "plateEffectId", 0);
        setField(term943976, term943976.getClass(), "passwordStatus", null);
        setField(term943976, term943976.getClass(), "password", null);
        setBooleanField(term943976, term943976.getClass(), "preferPerPvModule", false);
        setBooleanField(term943976, term943976.getClass(), "preferCommonModule", false);
        setBooleanField(term943976, term943976.getClass(), "usePerPvSkin", false);
        setBooleanField(term943976, term943976.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943976, term943976.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943976, term943976.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943976, term943976.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943976, term943976.getClass(), "commonModule", null);
        setField(term943976, term943976.getClass(), "commonCustomizeItems", null);
        setField(term943976, term943976.getClass(), "commonModuleSetTime", null);
        setField(term943976, term943976.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943976, term943976.getClass(), "commonSkin", 0);
        setIntField(term943976, term943976.getClass(), "headphoneVolume", 0);
        setBooleanField(term943976, term943976.getClass(), "buttonSeOn", false);
        setIntField(term943976, term943976.getClass(), "buttonSeVolume", 0);
        setIntField(term943976, term943976.getClass(), "sliderSeVolume", 0);
        setIntField(term943976, term943976.getClass(), "buttonSe", 0);
        setIntField(term943976, term943976.getClass(), "chainSlideSe", 0);
        setIntField(term943976, term943976.getClass(), "slideSe", 0);
        setIntField(term943976, term943976.getClass(), "sliderTouchSe", 0);
        setField(term943976, term943976.getClass(), "sortMode", null);
        setIntField(term943976, term943976.getClass(), "nextPvId", 0);
        setField(term943976, term943976.getClass(), "nextDifficulty", null);
        setField(term943976, term943976.getClass(), "nextEdition", null);
        setBooleanField(term943976, term943976.getClass(), "showInterimRanking", false);
        setBooleanField(term943976, term943976.getClass(), "showClearStatus", false);
        setBooleanField(term943976, term943976.getClass(), "showGreatBorder", false);
        setBooleanField(term943976, term943976.getClass(), "showExcellentBorder", false);
        setBooleanField(term943976, term943976.getClass(), "showRivalBorder", false);
        setBooleanField(term943976, term943976.getClass(), "showRgoSetting", false);
        setBooleanField(term943976, term943976.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943976, term943976.getClass(), "contestNowPlayingId", 0);
        setIntField(term943976, term943976.getClass(), "contestNowPlayingValue", 0);
        setField(term943976, term943976.getClass(), "contestNowPlayingResultRank", null);
        setField(term943976, term943976.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943976, term943976.getClass(), "myList0", null);
        setField(term943976, term943976.getClass(), "myList1", null);
        setField(term943976, term943976.getClass(), "myList2", null);
        setIntField(term943976, term943976.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCommonModule", argTypes, term943976, args);
    }

};


