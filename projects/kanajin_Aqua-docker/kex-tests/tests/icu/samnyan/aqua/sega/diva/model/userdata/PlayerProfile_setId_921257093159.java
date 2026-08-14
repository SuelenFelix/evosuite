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
import java.lang.Long;

public class PlayerProfile_setId_921257093159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916163;
     Object term4916198;

    public PlayerProfile_setId_921257093159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916163 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916163, term4916163.getClass(), "id", 0L);
        setIntField(term4916163, term4916163.getClass(), "pdId", 0);
        setField(term4916163, term4916163.getClass(), "playerName", null);
        setIntField(term4916163, term4916163.getClass(), "vocaloidPoints", 0);
        setIntField(term4916163, term4916163.getClass(), "level", 0);
        setIntField(term4916163, term4916163.getClass(), "levelExp", 0);
        setField(term4916163, term4916163.getClass(), "levelTitle", null);
        setIntField(term4916163, term4916163.getClass(), "plateId", 0);
        setIntField(term4916163, term4916163.getClass(), "plateEffectId", 0);
        setField(term4916163, term4916163.getClass(), "passwordStatus", null);
        setField(term4916163, term4916163.getClass(), "password", null);
        setBooleanField(term4916163, term4916163.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916163, term4916163.getClass(), "preferCommonModule", false);
        setBooleanField(term4916163, term4916163.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916163, term4916163.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916163, term4916163.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916163, term4916163.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916163, term4916163.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916163, term4916163.getClass(), "commonModule", null);
        setField(term4916163, term4916163.getClass(), "commonCustomizeItems", null);
        setField(term4916163, term4916163.getClass(), "commonModuleSetTime", null);
        setField(term4916163, term4916163.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916163, term4916163.getClass(), "commonSkin", 0);
        setIntField(term4916163, term4916163.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916163, term4916163.getClass(), "buttonSeOn", false);
        setIntField(term4916163, term4916163.getClass(), "buttonSeVolume", 0);
        setIntField(term4916163, term4916163.getClass(), "sliderSeVolume", 0);
        setIntField(term4916163, term4916163.getClass(), "buttonSe", 0);
        setIntField(term4916163, term4916163.getClass(), "chainSlideSe", 0);
        setIntField(term4916163, term4916163.getClass(), "slideSe", 0);
        setIntField(term4916163, term4916163.getClass(), "sliderTouchSe", 0);
        setField(term4916163, term4916163.getClass(), "sortMode", null);
        setIntField(term4916163, term4916163.getClass(), "nextPvId", 0);
        setField(term4916163, term4916163.getClass(), "nextDifficulty", null);
        setField(term4916163, term4916163.getClass(), "nextEdition", null);
        setBooleanField(term4916163, term4916163.getClass(), "showInterimRanking", false);
        setBooleanField(term4916163, term4916163.getClass(), "showClearStatus", false);
        setBooleanField(term4916163, term4916163.getClass(), "showGreatBorder", false);
        setBooleanField(term4916163, term4916163.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916163, term4916163.getClass(), "showRivalBorder", false);
        setBooleanField(term4916163, term4916163.getClass(), "showRgoSetting", false);
        setBooleanField(term4916163, term4916163.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916163, term4916163.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916163, term4916163.getClass(), "contestNowPlayingValue", 0);
        setField(term4916163, term4916163.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916163, term4916163.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916163, term4916163.getClass(), "myList0", null);
        setField(term4916163, term4916163.getClass(), "myList1", null);
        setField(term4916163, term4916163.getClass(), "myList2", null);
        setIntField(term4916163, term4916163.getClass(), "rivalPdId", 0);
        term4916198 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4916198;
        callMethod(klass, "setId", argTypes, term4916163, args);
    }

};


