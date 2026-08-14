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

public class PlayerProfile_setMyList0_131040582198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4895429;

    public PlayerProfile_setMyList0_131040582198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4895429 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4895429, term4895429.getClass(), "id", 0L);
        setIntField(term4895429, term4895429.getClass(), "pdId", 0);
        setField(term4895429, term4895429.getClass(), "playerName", null);
        setIntField(term4895429, term4895429.getClass(), "vocaloidPoints", 0);
        setIntField(term4895429, term4895429.getClass(), "level", 0);
        setIntField(term4895429, term4895429.getClass(), "levelExp", 0);
        setField(term4895429, term4895429.getClass(), "levelTitle", null);
        setIntField(term4895429, term4895429.getClass(), "plateId", 0);
        setIntField(term4895429, term4895429.getClass(), "plateEffectId", 0);
        setField(term4895429, term4895429.getClass(), "passwordStatus", null);
        setField(term4895429, term4895429.getClass(), "password", null);
        setBooleanField(term4895429, term4895429.getClass(), "preferPerPvModule", false);
        setBooleanField(term4895429, term4895429.getClass(), "preferCommonModule", false);
        setBooleanField(term4895429, term4895429.getClass(), "usePerPvSkin", false);
        setBooleanField(term4895429, term4895429.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4895429, term4895429.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4895429, term4895429.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4895429, term4895429.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4895429, term4895429.getClass(), "commonModule", null);
        setField(term4895429, term4895429.getClass(), "commonCustomizeItems", null);
        setField(term4895429, term4895429.getClass(), "commonModuleSetTime", null);
        setField(term4895429, term4895429.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4895429, term4895429.getClass(), "commonSkin", 0);
        setIntField(term4895429, term4895429.getClass(), "headphoneVolume", 0);
        setBooleanField(term4895429, term4895429.getClass(), "buttonSeOn", false);
        setIntField(term4895429, term4895429.getClass(), "buttonSeVolume", 0);
        setIntField(term4895429, term4895429.getClass(), "sliderSeVolume", 0);
        setIntField(term4895429, term4895429.getClass(), "buttonSe", 0);
        setIntField(term4895429, term4895429.getClass(), "chainSlideSe", 0);
        setIntField(term4895429, term4895429.getClass(), "slideSe", 0);
        setIntField(term4895429, term4895429.getClass(), "sliderTouchSe", 0);
        setField(term4895429, term4895429.getClass(), "sortMode", null);
        setIntField(term4895429, term4895429.getClass(), "nextPvId", 0);
        setField(term4895429, term4895429.getClass(), "nextDifficulty", null);
        setField(term4895429, term4895429.getClass(), "nextEdition", null);
        setBooleanField(term4895429, term4895429.getClass(), "showInterimRanking", false);
        setBooleanField(term4895429, term4895429.getClass(), "showClearStatus", false);
        setBooleanField(term4895429, term4895429.getClass(), "showGreatBorder", false);
        setBooleanField(term4895429, term4895429.getClass(), "showExcellentBorder", false);
        setBooleanField(term4895429, term4895429.getClass(), "showRivalBorder", false);
        setBooleanField(term4895429, term4895429.getClass(), "showRgoSetting", false);
        setBooleanField(term4895429, term4895429.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4895429, term4895429.getClass(), "contestNowPlayingId", 0);
        setIntField(term4895429, term4895429.getClass(), "contestNowPlayingValue", 0);
        setField(term4895429, term4895429.getClass(), "contestNowPlayingResultRank", null);
        setField(term4895429, term4895429.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4895429, term4895429.getClass(), "myList0", null);
        setField(term4895429, term4895429.getClass(), "myList1", null);
        setField(term4895429, term4895429.getClass(), "myList2", null);
        setIntField(term4895429, term4895429.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMyList0", argTypes, term4895429, args);
    }

};


