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

public class PlayerProfile_setVocaloidPoints_1359164600162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916272;
     Object term4916307;

    public PlayerProfile_setVocaloidPoints_1359164600162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916272 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916272, term4916272.getClass(), "id", 0L);
        setIntField(term4916272, term4916272.getClass(), "pdId", 0);
        setField(term4916272, term4916272.getClass(), "playerName", null);
        setIntField(term4916272, term4916272.getClass(), "vocaloidPoints", 0);
        setIntField(term4916272, term4916272.getClass(), "level", 0);
        setIntField(term4916272, term4916272.getClass(), "levelExp", 0);
        setField(term4916272, term4916272.getClass(), "levelTitle", null);
        setIntField(term4916272, term4916272.getClass(), "plateId", 0);
        setIntField(term4916272, term4916272.getClass(), "plateEffectId", 0);
        setField(term4916272, term4916272.getClass(), "passwordStatus", null);
        setField(term4916272, term4916272.getClass(), "password", null);
        setBooleanField(term4916272, term4916272.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916272, term4916272.getClass(), "preferCommonModule", false);
        setBooleanField(term4916272, term4916272.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916272, term4916272.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916272, term4916272.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916272, term4916272.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916272, term4916272.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916272, term4916272.getClass(), "commonModule", null);
        setField(term4916272, term4916272.getClass(), "commonCustomizeItems", null);
        setField(term4916272, term4916272.getClass(), "commonModuleSetTime", null);
        setField(term4916272, term4916272.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916272, term4916272.getClass(), "commonSkin", 0);
        setIntField(term4916272, term4916272.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916272, term4916272.getClass(), "buttonSeOn", false);
        setIntField(term4916272, term4916272.getClass(), "buttonSeVolume", 0);
        setIntField(term4916272, term4916272.getClass(), "sliderSeVolume", 0);
        setIntField(term4916272, term4916272.getClass(), "buttonSe", 0);
        setIntField(term4916272, term4916272.getClass(), "chainSlideSe", 0);
        setIntField(term4916272, term4916272.getClass(), "slideSe", 0);
        setIntField(term4916272, term4916272.getClass(), "sliderTouchSe", 0);
        setField(term4916272, term4916272.getClass(), "sortMode", null);
        setIntField(term4916272, term4916272.getClass(), "nextPvId", 0);
        setField(term4916272, term4916272.getClass(), "nextDifficulty", null);
        setField(term4916272, term4916272.getClass(), "nextEdition", null);
        setBooleanField(term4916272, term4916272.getClass(), "showInterimRanking", false);
        setBooleanField(term4916272, term4916272.getClass(), "showClearStatus", false);
        setBooleanField(term4916272, term4916272.getClass(), "showGreatBorder", false);
        setBooleanField(term4916272, term4916272.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916272, term4916272.getClass(), "showRivalBorder", false);
        setBooleanField(term4916272, term4916272.getClass(), "showRgoSetting", false);
        setBooleanField(term4916272, term4916272.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916272, term4916272.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916272, term4916272.getClass(), "contestNowPlayingValue", 0);
        setField(term4916272, term4916272.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916272, term4916272.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916272, term4916272.getClass(), "myList0", null);
        setField(term4916272, term4916272.getClass(), "myList1", null);
        setField(term4916272, term4916272.getClass(), "myList2", null);
        setIntField(term4916272, term4916272.getClass(), "rivalPdId", 0);
        term4916307 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4916307;
        callMethod(klass, "setVocaloidPoints", argTypes, term4916272, args);
    }

};


