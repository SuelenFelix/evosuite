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

public class PlayerProfile_setPlateId_912035341166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916418;
     Object term4916453;

    public PlayerProfile_setPlateId_912035341166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916418 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916418, term4916418.getClass(), "id", 0L);
        setIntField(term4916418, term4916418.getClass(), "pdId", 0);
        setField(term4916418, term4916418.getClass(), "playerName", null);
        setIntField(term4916418, term4916418.getClass(), "vocaloidPoints", 0);
        setIntField(term4916418, term4916418.getClass(), "level", 0);
        setIntField(term4916418, term4916418.getClass(), "levelExp", 0);
        setField(term4916418, term4916418.getClass(), "levelTitle", null);
        setIntField(term4916418, term4916418.getClass(), "plateId", 0);
        setIntField(term4916418, term4916418.getClass(), "plateEffectId", 0);
        setField(term4916418, term4916418.getClass(), "passwordStatus", null);
        setField(term4916418, term4916418.getClass(), "password", null);
        setBooleanField(term4916418, term4916418.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916418, term4916418.getClass(), "preferCommonModule", false);
        setBooleanField(term4916418, term4916418.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916418, term4916418.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916418, term4916418.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916418, term4916418.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916418, term4916418.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916418, term4916418.getClass(), "commonModule", null);
        setField(term4916418, term4916418.getClass(), "commonCustomizeItems", null);
        setField(term4916418, term4916418.getClass(), "commonModuleSetTime", null);
        setField(term4916418, term4916418.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916418, term4916418.getClass(), "commonSkin", 0);
        setIntField(term4916418, term4916418.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916418, term4916418.getClass(), "buttonSeOn", false);
        setIntField(term4916418, term4916418.getClass(), "buttonSeVolume", 0);
        setIntField(term4916418, term4916418.getClass(), "sliderSeVolume", 0);
        setIntField(term4916418, term4916418.getClass(), "buttonSe", 0);
        setIntField(term4916418, term4916418.getClass(), "chainSlideSe", 0);
        setIntField(term4916418, term4916418.getClass(), "slideSe", 0);
        setIntField(term4916418, term4916418.getClass(), "sliderTouchSe", 0);
        setField(term4916418, term4916418.getClass(), "sortMode", null);
        setIntField(term4916418, term4916418.getClass(), "nextPvId", 0);
        setField(term4916418, term4916418.getClass(), "nextDifficulty", null);
        setField(term4916418, term4916418.getClass(), "nextEdition", null);
        setBooleanField(term4916418, term4916418.getClass(), "showInterimRanking", false);
        setBooleanField(term4916418, term4916418.getClass(), "showClearStatus", false);
        setBooleanField(term4916418, term4916418.getClass(), "showGreatBorder", false);
        setBooleanField(term4916418, term4916418.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916418, term4916418.getClass(), "showRivalBorder", false);
        setBooleanField(term4916418, term4916418.getClass(), "showRgoSetting", false);
        setBooleanField(term4916418, term4916418.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916418, term4916418.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916418, term4916418.getClass(), "contestNowPlayingValue", 0);
        setField(term4916418, term4916418.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916418, term4916418.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916418, term4916418.getClass(), "myList0", null);
        setField(term4916418, term4916418.getClass(), "myList1", null);
        setField(term4916418, term4916418.getClass(), "myList2", null);
        setIntField(term4916418, term4916418.getClass(), "rivalPdId", 0);
        term4916453 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4916453;
        callMethod(klass, "setPlateId", argTypes, term4916418, args);
    }

};


