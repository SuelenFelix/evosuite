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

public class PlayerProfile_setShowRivalBorder_560925301197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944739;
     Object term944774;

    public PlayerProfile_setShowRivalBorder_560925301197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944739 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944739, term944739.getClass(), "id", 0L);
        setIntField(term944739, term944739.getClass(), "pdId", 0);
        setField(term944739, term944739.getClass(), "playerName", null);
        setIntField(term944739, term944739.getClass(), "vocaloidPoints", 0);
        setIntField(term944739, term944739.getClass(), "level", 0);
        setIntField(term944739, term944739.getClass(), "levelExp", 0);
        setField(term944739, term944739.getClass(), "levelTitle", null);
        setIntField(term944739, term944739.getClass(), "plateId", 0);
        setIntField(term944739, term944739.getClass(), "plateEffectId", 0);
        setField(term944739, term944739.getClass(), "passwordStatus", null);
        setField(term944739, term944739.getClass(), "password", null);
        setBooleanField(term944739, term944739.getClass(), "preferPerPvModule", false);
        setBooleanField(term944739, term944739.getClass(), "preferCommonModule", false);
        setBooleanField(term944739, term944739.getClass(), "usePerPvSkin", false);
        setBooleanField(term944739, term944739.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944739, term944739.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944739, term944739.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944739, term944739.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944739, term944739.getClass(), "commonModule", null);
        setField(term944739, term944739.getClass(), "commonCustomizeItems", null);
        setField(term944739, term944739.getClass(), "commonModuleSetTime", null);
        setField(term944739, term944739.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944739, term944739.getClass(), "commonSkin", 0);
        setIntField(term944739, term944739.getClass(), "headphoneVolume", 0);
        setBooleanField(term944739, term944739.getClass(), "buttonSeOn", false);
        setIntField(term944739, term944739.getClass(), "buttonSeVolume", 0);
        setIntField(term944739, term944739.getClass(), "sliderSeVolume", 0);
        setIntField(term944739, term944739.getClass(), "buttonSe", 0);
        setIntField(term944739, term944739.getClass(), "chainSlideSe", 0);
        setIntField(term944739, term944739.getClass(), "slideSe", 0);
        setIntField(term944739, term944739.getClass(), "sliderTouchSe", 0);
        setField(term944739, term944739.getClass(), "sortMode", null);
        setIntField(term944739, term944739.getClass(), "nextPvId", 0);
        setField(term944739, term944739.getClass(), "nextDifficulty", null);
        setField(term944739, term944739.getClass(), "nextEdition", null);
        setBooleanField(term944739, term944739.getClass(), "showInterimRanking", false);
        setBooleanField(term944739, term944739.getClass(), "showClearStatus", false);
        setBooleanField(term944739, term944739.getClass(), "showGreatBorder", false);
        setBooleanField(term944739, term944739.getClass(), "showExcellentBorder", false);
        setBooleanField(term944739, term944739.getClass(), "showRivalBorder", false);
        setBooleanField(term944739, term944739.getClass(), "showRgoSetting", false);
        setBooleanField(term944739, term944739.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944739, term944739.getClass(), "contestNowPlayingId", 0);
        setIntField(term944739, term944739.getClass(), "contestNowPlayingValue", 0);
        setField(term944739, term944739.getClass(), "contestNowPlayingResultRank", null);
        setField(term944739, term944739.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944739, term944739.getClass(), "myList0", null);
        setField(term944739, term944739.getClass(), "myList1", null);
        setField(term944739, term944739.getClass(), "myList2", null);
        setIntField(term944739, term944739.getClass(), "rivalPdId", 0);
        term944774 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term944774;
        callMethod(klass, "setShowRivalBorder", argTypes, term944739, args);
    }

};


