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

public class PlayerProfile_getSliderTouchSe_951500702139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915463;

    public PlayerProfile_getSliderTouchSe_951500702139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915463 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915463, term4915463.getClass(), "id", 0L);
        setIntField(term4915463, term4915463.getClass(), "pdId", 0);
        setField(term4915463, term4915463.getClass(), "playerName", null);
        setIntField(term4915463, term4915463.getClass(), "vocaloidPoints", 0);
        setIntField(term4915463, term4915463.getClass(), "level", 0);
        setIntField(term4915463, term4915463.getClass(), "levelExp", 0);
        setField(term4915463, term4915463.getClass(), "levelTitle", null);
        setIntField(term4915463, term4915463.getClass(), "plateId", 0);
        setIntField(term4915463, term4915463.getClass(), "plateEffectId", 0);
        setField(term4915463, term4915463.getClass(), "passwordStatus", null);
        setField(term4915463, term4915463.getClass(), "password", null);
        setBooleanField(term4915463, term4915463.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915463, term4915463.getClass(), "preferCommonModule", false);
        setBooleanField(term4915463, term4915463.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915463, term4915463.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915463, term4915463.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915463, term4915463.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915463, term4915463.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915463, term4915463.getClass(), "commonModule", null);
        setField(term4915463, term4915463.getClass(), "commonCustomizeItems", null);
        setField(term4915463, term4915463.getClass(), "commonModuleSetTime", null);
        setField(term4915463, term4915463.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915463, term4915463.getClass(), "commonSkin", 0);
        setIntField(term4915463, term4915463.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915463, term4915463.getClass(), "buttonSeOn", false);
        setIntField(term4915463, term4915463.getClass(), "buttonSeVolume", 0);
        setIntField(term4915463, term4915463.getClass(), "sliderSeVolume", 0);
        setIntField(term4915463, term4915463.getClass(), "buttonSe", 0);
        setIntField(term4915463, term4915463.getClass(), "chainSlideSe", 0);
        setIntField(term4915463, term4915463.getClass(), "slideSe", 0);
        setIntField(term4915463, term4915463.getClass(), "sliderTouchSe", 0);
        setField(term4915463, term4915463.getClass(), "sortMode", null);
        setIntField(term4915463, term4915463.getClass(), "nextPvId", 0);
        setField(term4915463, term4915463.getClass(), "nextDifficulty", null);
        setField(term4915463, term4915463.getClass(), "nextEdition", null);
        setBooleanField(term4915463, term4915463.getClass(), "showInterimRanking", false);
        setBooleanField(term4915463, term4915463.getClass(), "showClearStatus", false);
        setBooleanField(term4915463, term4915463.getClass(), "showGreatBorder", false);
        setBooleanField(term4915463, term4915463.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915463, term4915463.getClass(), "showRivalBorder", false);
        setBooleanField(term4915463, term4915463.getClass(), "showRgoSetting", false);
        setBooleanField(term4915463, term4915463.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915463, term4915463.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915463, term4915463.getClass(), "contestNowPlayingValue", 0);
        setField(term4915463, term4915463.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915463, term4915463.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915463, term4915463.getClass(), "myList0", null);
        setField(term4915463, term4915463.getClass(), "myList1", null);
        setField(term4915463, term4915463.getClass(), "myList2", null);
        setIntField(term4915463, term4915463.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderTouchSe", argTypes, term4915463, args);
    }

};


