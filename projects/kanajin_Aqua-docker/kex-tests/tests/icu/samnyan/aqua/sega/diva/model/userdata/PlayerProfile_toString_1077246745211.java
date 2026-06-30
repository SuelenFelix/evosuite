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

public class PlayerProfile_toString_1077246745211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945241;

    public PlayerProfile_toString_1077246745211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945241 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term945241, term945241.getClass(), "id", 0L);
        setIntField(term945241, term945241.getClass(), "pdId", 0);
        setField(term945241, term945241.getClass(), "playerName", null);
        setIntField(term945241, term945241.getClass(), "vocaloidPoints", 0);
        setIntField(term945241, term945241.getClass(), "level", 0);
        setIntField(term945241, term945241.getClass(), "levelExp", 0);
        setField(term945241, term945241.getClass(), "levelTitle", null);
        setIntField(term945241, term945241.getClass(), "plateId", 0);
        setIntField(term945241, term945241.getClass(), "plateEffectId", 0);
        setField(term945241, term945241.getClass(), "passwordStatus", null);
        setField(term945241, term945241.getClass(), "password", null);
        setBooleanField(term945241, term945241.getClass(), "preferPerPvModule", false);
        setBooleanField(term945241, term945241.getClass(), "preferCommonModule", false);
        setBooleanField(term945241, term945241.getClass(), "usePerPvSkin", false);
        setBooleanField(term945241, term945241.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term945241, term945241.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term945241, term945241.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term945241, term945241.getClass(), "usePerPvTouchSliderSe", false);
        setField(term945241, term945241.getClass(), "commonModule", null);
        setField(term945241, term945241.getClass(), "commonCustomizeItems", null);
        setField(term945241, term945241.getClass(), "commonModuleSetTime", null);
        setField(term945241, term945241.getClass(), "moduleSelectItemFlag", null);
        setIntField(term945241, term945241.getClass(), "commonSkin", 0);
        setIntField(term945241, term945241.getClass(), "headphoneVolume", 0);
        setBooleanField(term945241, term945241.getClass(), "buttonSeOn", false);
        setIntField(term945241, term945241.getClass(), "buttonSeVolume", 0);
        setIntField(term945241, term945241.getClass(), "sliderSeVolume", 0);
        setIntField(term945241, term945241.getClass(), "buttonSe", 0);
        setIntField(term945241, term945241.getClass(), "chainSlideSe", 0);
        setIntField(term945241, term945241.getClass(), "slideSe", 0);
        setIntField(term945241, term945241.getClass(), "sliderTouchSe", 0);
        setField(term945241, term945241.getClass(), "sortMode", null);
        setIntField(term945241, term945241.getClass(), "nextPvId", 0);
        setField(term945241, term945241.getClass(), "nextDifficulty", null);
        setField(term945241, term945241.getClass(), "nextEdition", null);
        setBooleanField(term945241, term945241.getClass(), "showInterimRanking", false);
        setBooleanField(term945241, term945241.getClass(), "showClearStatus", false);
        setBooleanField(term945241, term945241.getClass(), "showGreatBorder", false);
        setBooleanField(term945241, term945241.getClass(), "showExcellentBorder", false);
        setBooleanField(term945241, term945241.getClass(), "showRivalBorder", false);
        setBooleanField(term945241, term945241.getClass(), "showRgoSetting", false);
        setBooleanField(term945241, term945241.getClass(), "contestNowPlayingEnable", false);
        setIntField(term945241, term945241.getClass(), "contestNowPlayingId", 0);
        setIntField(term945241, term945241.getClass(), "contestNowPlayingValue", 0);
        setField(term945241, term945241.getClass(), "contestNowPlayingResultRank", null);
        setField(term945241, term945241.getClass(), "contestNowPlayingSpecifier", null);
        setField(term945241, term945241.getClass(), "myList0", null);
        setField(term945241, term945241.getClass(), "myList1", null);
        setField(term945241, term945241.getClass(), "myList2", null);
        setIntField(term945241, term945241.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term945241, args);
    }

};


