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

public class PlayerProfile_setRivalPdId_702300011207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945099;
     Object term945134;

    public PlayerProfile_setRivalPdId_702300011207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945099 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term945099, term945099.getClass(), "id", 0L);
        setIntField(term945099, term945099.getClass(), "pdId", 0);
        setField(term945099, term945099.getClass(), "playerName", null);
        setIntField(term945099, term945099.getClass(), "vocaloidPoints", 0);
        setIntField(term945099, term945099.getClass(), "level", 0);
        setIntField(term945099, term945099.getClass(), "levelExp", 0);
        setField(term945099, term945099.getClass(), "levelTitle", null);
        setIntField(term945099, term945099.getClass(), "plateId", 0);
        setIntField(term945099, term945099.getClass(), "plateEffectId", 0);
        setField(term945099, term945099.getClass(), "passwordStatus", null);
        setField(term945099, term945099.getClass(), "password", null);
        setBooleanField(term945099, term945099.getClass(), "preferPerPvModule", false);
        setBooleanField(term945099, term945099.getClass(), "preferCommonModule", false);
        setBooleanField(term945099, term945099.getClass(), "usePerPvSkin", false);
        setBooleanField(term945099, term945099.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term945099, term945099.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term945099, term945099.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term945099, term945099.getClass(), "usePerPvTouchSliderSe", false);
        setField(term945099, term945099.getClass(), "commonModule", null);
        setField(term945099, term945099.getClass(), "commonCustomizeItems", null);
        setField(term945099, term945099.getClass(), "commonModuleSetTime", null);
        setField(term945099, term945099.getClass(), "moduleSelectItemFlag", null);
        setIntField(term945099, term945099.getClass(), "commonSkin", 0);
        setIntField(term945099, term945099.getClass(), "headphoneVolume", 0);
        setBooleanField(term945099, term945099.getClass(), "buttonSeOn", false);
        setIntField(term945099, term945099.getClass(), "buttonSeVolume", 0);
        setIntField(term945099, term945099.getClass(), "sliderSeVolume", 0);
        setIntField(term945099, term945099.getClass(), "buttonSe", 0);
        setIntField(term945099, term945099.getClass(), "chainSlideSe", 0);
        setIntField(term945099, term945099.getClass(), "slideSe", 0);
        setIntField(term945099, term945099.getClass(), "sliderTouchSe", 0);
        setField(term945099, term945099.getClass(), "sortMode", null);
        setIntField(term945099, term945099.getClass(), "nextPvId", 0);
        setField(term945099, term945099.getClass(), "nextDifficulty", null);
        setField(term945099, term945099.getClass(), "nextEdition", null);
        setBooleanField(term945099, term945099.getClass(), "showInterimRanking", false);
        setBooleanField(term945099, term945099.getClass(), "showClearStatus", false);
        setBooleanField(term945099, term945099.getClass(), "showGreatBorder", false);
        setBooleanField(term945099, term945099.getClass(), "showExcellentBorder", false);
        setBooleanField(term945099, term945099.getClass(), "showRivalBorder", false);
        setBooleanField(term945099, term945099.getClass(), "showRgoSetting", false);
        setBooleanField(term945099, term945099.getClass(), "contestNowPlayingEnable", false);
        setIntField(term945099, term945099.getClass(), "contestNowPlayingId", 0);
        setIntField(term945099, term945099.getClass(), "contestNowPlayingValue", 0);
        setField(term945099, term945099.getClass(), "contestNowPlayingResultRank", null);
        setField(term945099, term945099.getClass(), "contestNowPlayingSpecifier", null);
        setField(term945099, term945099.getClass(), "myList0", null);
        setField(term945099, term945099.getClass(), "myList1", null);
        setField(term945099, term945099.getClass(), "myList2", null);
        setIntField(term945099, term945099.getClass(), "rivalPdId", 0);
        term945134 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term945134;
        callMethod(klass, "setRivalPdId", argTypes, term945099, args);
    }

};


