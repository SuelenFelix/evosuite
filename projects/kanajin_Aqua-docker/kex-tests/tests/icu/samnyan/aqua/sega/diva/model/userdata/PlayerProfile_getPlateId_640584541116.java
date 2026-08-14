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

public class PlayerProfile_getPlateId_640584541116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4914658;

    public PlayerProfile_getPlateId_640584541116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4914658 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4914658, term4914658.getClass(), "id", 0L);
        setIntField(term4914658, term4914658.getClass(), "pdId", 0);
        setField(term4914658, term4914658.getClass(), "playerName", null);
        setIntField(term4914658, term4914658.getClass(), "vocaloidPoints", 0);
        setIntField(term4914658, term4914658.getClass(), "level", 0);
        setIntField(term4914658, term4914658.getClass(), "levelExp", 0);
        setField(term4914658, term4914658.getClass(), "levelTitle", null);
        setIntField(term4914658, term4914658.getClass(), "plateId", 0);
        setIntField(term4914658, term4914658.getClass(), "plateEffectId", 0);
        setField(term4914658, term4914658.getClass(), "passwordStatus", null);
        setField(term4914658, term4914658.getClass(), "password", null);
        setBooleanField(term4914658, term4914658.getClass(), "preferPerPvModule", false);
        setBooleanField(term4914658, term4914658.getClass(), "preferCommonModule", false);
        setBooleanField(term4914658, term4914658.getClass(), "usePerPvSkin", false);
        setBooleanField(term4914658, term4914658.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4914658, term4914658.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4914658, term4914658.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4914658, term4914658.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4914658, term4914658.getClass(), "commonModule", null);
        setField(term4914658, term4914658.getClass(), "commonCustomizeItems", null);
        setField(term4914658, term4914658.getClass(), "commonModuleSetTime", null);
        setField(term4914658, term4914658.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4914658, term4914658.getClass(), "commonSkin", 0);
        setIntField(term4914658, term4914658.getClass(), "headphoneVolume", 0);
        setBooleanField(term4914658, term4914658.getClass(), "buttonSeOn", false);
        setIntField(term4914658, term4914658.getClass(), "buttonSeVolume", 0);
        setIntField(term4914658, term4914658.getClass(), "sliderSeVolume", 0);
        setIntField(term4914658, term4914658.getClass(), "buttonSe", 0);
        setIntField(term4914658, term4914658.getClass(), "chainSlideSe", 0);
        setIntField(term4914658, term4914658.getClass(), "slideSe", 0);
        setIntField(term4914658, term4914658.getClass(), "sliderTouchSe", 0);
        setField(term4914658, term4914658.getClass(), "sortMode", null);
        setIntField(term4914658, term4914658.getClass(), "nextPvId", 0);
        setField(term4914658, term4914658.getClass(), "nextDifficulty", null);
        setField(term4914658, term4914658.getClass(), "nextEdition", null);
        setBooleanField(term4914658, term4914658.getClass(), "showInterimRanking", false);
        setBooleanField(term4914658, term4914658.getClass(), "showClearStatus", false);
        setBooleanField(term4914658, term4914658.getClass(), "showGreatBorder", false);
        setBooleanField(term4914658, term4914658.getClass(), "showExcellentBorder", false);
        setBooleanField(term4914658, term4914658.getClass(), "showRivalBorder", false);
        setBooleanField(term4914658, term4914658.getClass(), "showRgoSetting", false);
        setBooleanField(term4914658, term4914658.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4914658, term4914658.getClass(), "contestNowPlayingId", 0);
        setIntField(term4914658, term4914658.getClass(), "contestNowPlayingValue", 0);
        setField(term4914658, term4914658.getClass(), "contestNowPlayingResultRank", null);
        setField(term4914658, term4914658.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4914658, term4914658.getClass(), "myList0", null);
        setField(term4914658, term4914658.getClass(), "myList1", null);
        setField(term4914658, term4914658.getClass(), "myList2", null);
        setIntField(term4914658, term4914658.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateId", argTypes, term4914658, args);
    }

};


