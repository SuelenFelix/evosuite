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

public class PlayerProfile_getMyList0_2121886845154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943178;

    public PlayerProfile_getMyList0_2121886845154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943178 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943178, term943178.getClass(), "id", 0L);
        setIntField(term943178, term943178.getClass(), "pdId", 0);
        setField(term943178, term943178.getClass(), "playerName", null);
        setIntField(term943178, term943178.getClass(), "vocaloidPoints", 0);
        setIntField(term943178, term943178.getClass(), "level", 0);
        setIntField(term943178, term943178.getClass(), "levelExp", 0);
        setField(term943178, term943178.getClass(), "levelTitle", null);
        setIntField(term943178, term943178.getClass(), "plateId", 0);
        setIntField(term943178, term943178.getClass(), "plateEffectId", 0);
        setField(term943178, term943178.getClass(), "passwordStatus", null);
        setField(term943178, term943178.getClass(), "password", null);
        setBooleanField(term943178, term943178.getClass(), "preferPerPvModule", false);
        setBooleanField(term943178, term943178.getClass(), "preferCommonModule", false);
        setBooleanField(term943178, term943178.getClass(), "usePerPvSkin", false);
        setBooleanField(term943178, term943178.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943178, term943178.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943178, term943178.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943178, term943178.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943178, term943178.getClass(), "commonModule", null);
        setField(term943178, term943178.getClass(), "commonCustomizeItems", null);
        setField(term943178, term943178.getClass(), "commonModuleSetTime", null);
        setField(term943178, term943178.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943178, term943178.getClass(), "commonSkin", 0);
        setIntField(term943178, term943178.getClass(), "headphoneVolume", 0);
        setBooleanField(term943178, term943178.getClass(), "buttonSeOn", false);
        setIntField(term943178, term943178.getClass(), "buttonSeVolume", 0);
        setIntField(term943178, term943178.getClass(), "sliderSeVolume", 0);
        setIntField(term943178, term943178.getClass(), "buttonSe", 0);
        setIntField(term943178, term943178.getClass(), "chainSlideSe", 0);
        setIntField(term943178, term943178.getClass(), "slideSe", 0);
        setIntField(term943178, term943178.getClass(), "sliderTouchSe", 0);
        setField(term943178, term943178.getClass(), "sortMode", null);
        setIntField(term943178, term943178.getClass(), "nextPvId", 0);
        setField(term943178, term943178.getClass(), "nextDifficulty", null);
        setField(term943178, term943178.getClass(), "nextEdition", null);
        setBooleanField(term943178, term943178.getClass(), "showInterimRanking", false);
        setBooleanField(term943178, term943178.getClass(), "showClearStatus", false);
        setBooleanField(term943178, term943178.getClass(), "showGreatBorder", false);
        setBooleanField(term943178, term943178.getClass(), "showExcellentBorder", false);
        setBooleanField(term943178, term943178.getClass(), "showRivalBorder", false);
        setBooleanField(term943178, term943178.getClass(), "showRgoSetting", false);
        setBooleanField(term943178, term943178.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943178, term943178.getClass(), "contestNowPlayingId", 0);
        setIntField(term943178, term943178.getClass(), "contestNowPlayingValue", 0);
        setField(term943178, term943178.getClass(), "contestNowPlayingResultRank", null);
        setField(term943178, term943178.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943178, term943178.getClass(), "myList0", null);
        setField(term943178, term943178.getClass(), "myList1", null);
        setField(term943178, term943178.getClass(), "myList2", null);
        setIntField(term943178, term943178.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList0", argTypes, term943178, args);
    }

};


