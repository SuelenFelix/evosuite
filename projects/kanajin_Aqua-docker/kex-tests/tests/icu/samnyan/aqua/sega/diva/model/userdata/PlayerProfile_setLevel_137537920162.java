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
import java.lang.Integer;

public class PlayerProfile_setLevel_137537920162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943464;
     Object term943499;

    public PlayerProfile_setLevel_137537920162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943464 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943464, term943464.getClass(), "id", 0L);
        setIntField(term943464, term943464.getClass(), "pdId", 0);
        setField(term943464, term943464.getClass(), "playerName", null);
        setIntField(term943464, term943464.getClass(), "vocaloidPoints", 0);
        setIntField(term943464, term943464.getClass(), "level", 0);
        setIntField(term943464, term943464.getClass(), "levelExp", 0);
        setField(term943464, term943464.getClass(), "levelTitle", null);
        setIntField(term943464, term943464.getClass(), "plateId", 0);
        setIntField(term943464, term943464.getClass(), "plateEffectId", 0);
        setField(term943464, term943464.getClass(), "passwordStatus", null);
        setField(term943464, term943464.getClass(), "password", null);
        setBooleanField(term943464, term943464.getClass(), "preferPerPvModule", false);
        setBooleanField(term943464, term943464.getClass(), "preferCommonModule", false);
        setBooleanField(term943464, term943464.getClass(), "usePerPvSkin", false);
        setBooleanField(term943464, term943464.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943464, term943464.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943464, term943464.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943464, term943464.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943464, term943464.getClass(), "commonModule", null);
        setField(term943464, term943464.getClass(), "commonCustomizeItems", null);
        setField(term943464, term943464.getClass(), "commonModuleSetTime", null);
        setField(term943464, term943464.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943464, term943464.getClass(), "commonSkin", 0);
        setIntField(term943464, term943464.getClass(), "headphoneVolume", 0);
        setBooleanField(term943464, term943464.getClass(), "buttonSeOn", false);
        setIntField(term943464, term943464.getClass(), "buttonSeVolume", 0);
        setIntField(term943464, term943464.getClass(), "sliderSeVolume", 0);
        setIntField(term943464, term943464.getClass(), "buttonSe", 0);
        setIntField(term943464, term943464.getClass(), "chainSlideSe", 0);
        setIntField(term943464, term943464.getClass(), "slideSe", 0);
        setIntField(term943464, term943464.getClass(), "sliderTouchSe", 0);
        setField(term943464, term943464.getClass(), "sortMode", null);
        setIntField(term943464, term943464.getClass(), "nextPvId", 0);
        setField(term943464, term943464.getClass(), "nextDifficulty", null);
        setField(term943464, term943464.getClass(), "nextEdition", null);
        setBooleanField(term943464, term943464.getClass(), "showInterimRanking", false);
        setBooleanField(term943464, term943464.getClass(), "showClearStatus", false);
        setBooleanField(term943464, term943464.getClass(), "showGreatBorder", false);
        setBooleanField(term943464, term943464.getClass(), "showExcellentBorder", false);
        setBooleanField(term943464, term943464.getClass(), "showRivalBorder", false);
        setBooleanField(term943464, term943464.getClass(), "showRgoSetting", false);
        setBooleanField(term943464, term943464.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943464, term943464.getClass(), "contestNowPlayingId", 0);
        setIntField(term943464, term943464.getClass(), "contestNowPlayingValue", 0);
        setField(term943464, term943464.getClass(), "contestNowPlayingResultRank", null);
        setField(term943464, term943464.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943464, term943464.getClass(), "myList0", null);
        setField(term943464, term943464.getClass(), "myList1", null);
        setField(term943464, term943464.getClass(), "myList2", null);
        setIntField(term943464, term943464.getClass(), "rivalPdId", 0);
        term943499 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term943499;
        callMethod(klass, "setLevel", argTypes, term943464, args);
    }

};


