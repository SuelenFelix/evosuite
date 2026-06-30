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
import java.lang.Boolean;

public class PlayerProfile_setShowExcellentBorder_391224481196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944702;
     Object term944737;

    public PlayerProfile_setShowExcellentBorder_391224481196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944702 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944702, term944702.getClass(), "id", 0L);
        setIntField(term944702, term944702.getClass(), "pdId", 0);
        setField(term944702, term944702.getClass(), "playerName", null);
        setIntField(term944702, term944702.getClass(), "vocaloidPoints", 0);
        setIntField(term944702, term944702.getClass(), "level", 0);
        setIntField(term944702, term944702.getClass(), "levelExp", 0);
        setField(term944702, term944702.getClass(), "levelTitle", null);
        setIntField(term944702, term944702.getClass(), "plateId", 0);
        setIntField(term944702, term944702.getClass(), "plateEffectId", 0);
        setField(term944702, term944702.getClass(), "passwordStatus", null);
        setField(term944702, term944702.getClass(), "password", null);
        setBooleanField(term944702, term944702.getClass(), "preferPerPvModule", false);
        setBooleanField(term944702, term944702.getClass(), "preferCommonModule", false);
        setBooleanField(term944702, term944702.getClass(), "usePerPvSkin", false);
        setBooleanField(term944702, term944702.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944702, term944702.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944702, term944702.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944702, term944702.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944702, term944702.getClass(), "commonModule", null);
        setField(term944702, term944702.getClass(), "commonCustomizeItems", null);
        setField(term944702, term944702.getClass(), "commonModuleSetTime", null);
        setField(term944702, term944702.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944702, term944702.getClass(), "commonSkin", 0);
        setIntField(term944702, term944702.getClass(), "headphoneVolume", 0);
        setBooleanField(term944702, term944702.getClass(), "buttonSeOn", false);
        setIntField(term944702, term944702.getClass(), "buttonSeVolume", 0);
        setIntField(term944702, term944702.getClass(), "sliderSeVolume", 0);
        setIntField(term944702, term944702.getClass(), "buttonSe", 0);
        setIntField(term944702, term944702.getClass(), "chainSlideSe", 0);
        setIntField(term944702, term944702.getClass(), "slideSe", 0);
        setIntField(term944702, term944702.getClass(), "sliderTouchSe", 0);
        setField(term944702, term944702.getClass(), "sortMode", null);
        setIntField(term944702, term944702.getClass(), "nextPvId", 0);
        setField(term944702, term944702.getClass(), "nextDifficulty", null);
        setField(term944702, term944702.getClass(), "nextEdition", null);
        setBooleanField(term944702, term944702.getClass(), "showInterimRanking", false);
        setBooleanField(term944702, term944702.getClass(), "showClearStatus", false);
        setBooleanField(term944702, term944702.getClass(), "showGreatBorder", false);
        setBooleanField(term944702, term944702.getClass(), "showExcellentBorder", false);
        setBooleanField(term944702, term944702.getClass(), "showRivalBorder", false);
        setBooleanField(term944702, term944702.getClass(), "showRgoSetting", false);
        setBooleanField(term944702, term944702.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944702, term944702.getClass(), "contestNowPlayingId", 0);
        setIntField(term944702, term944702.getClass(), "contestNowPlayingValue", 0);
        setField(term944702, term944702.getClass(), "contestNowPlayingResultRank", null);
        setField(term944702, term944702.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944702, term944702.getClass(), "myList0", null);
        setField(term944702, term944702.getClass(), "myList1", null);
        setField(term944702, term944702.getClass(), "myList2", null);
        setIntField(term944702, term944702.getClass(), "rivalPdId", 0);
        term944737 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term944737;
        callMethod(klass, "setShowExcellentBorder", argTypes, term944702, args);
    }

};


