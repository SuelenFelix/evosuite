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

public class PlayerProfile_setNextPvId_516149780191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917329;
     Object term4917364;

    public PlayerProfile_setNextPvId_516149780191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917329, term4917329.getClass(), "id", 0L);
        setIntField(term4917329, term4917329.getClass(), "pdId", 0);
        setField(term4917329, term4917329.getClass(), "playerName", null);
        setIntField(term4917329, term4917329.getClass(), "vocaloidPoints", 0);
        setIntField(term4917329, term4917329.getClass(), "level", 0);
        setIntField(term4917329, term4917329.getClass(), "levelExp", 0);
        setField(term4917329, term4917329.getClass(), "levelTitle", null);
        setIntField(term4917329, term4917329.getClass(), "plateId", 0);
        setIntField(term4917329, term4917329.getClass(), "plateEffectId", 0);
        setField(term4917329, term4917329.getClass(), "passwordStatus", null);
        setField(term4917329, term4917329.getClass(), "password", null);
        setBooleanField(term4917329, term4917329.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917329, term4917329.getClass(), "preferCommonModule", false);
        setBooleanField(term4917329, term4917329.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917329, term4917329.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917329, term4917329.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917329, term4917329.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917329, term4917329.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917329, term4917329.getClass(), "commonModule", null);
        setField(term4917329, term4917329.getClass(), "commonCustomizeItems", null);
        setField(term4917329, term4917329.getClass(), "commonModuleSetTime", null);
        setField(term4917329, term4917329.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917329, term4917329.getClass(), "commonSkin", 0);
        setIntField(term4917329, term4917329.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917329, term4917329.getClass(), "buttonSeOn", false);
        setIntField(term4917329, term4917329.getClass(), "buttonSeVolume", 0);
        setIntField(term4917329, term4917329.getClass(), "sliderSeVolume", 0);
        setIntField(term4917329, term4917329.getClass(), "buttonSe", 0);
        setIntField(term4917329, term4917329.getClass(), "chainSlideSe", 0);
        setIntField(term4917329, term4917329.getClass(), "slideSe", 0);
        setIntField(term4917329, term4917329.getClass(), "sliderTouchSe", 0);
        setField(term4917329, term4917329.getClass(), "sortMode", null);
        setIntField(term4917329, term4917329.getClass(), "nextPvId", 0);
        setField(term4917329, term4917329.getClass(), "nextDifficulty", null);
        setField(term4917329, term4917329.getClass(), "nextEdition", null);
        setBooleanField(term4917329, term4917329.getClass(), "showInterimRanking", false);
        setBooleanField(term4917329, term4917329.getClass(), "showClearStatus", false);
        setBooleanField(term4917329, term4917329.getClass(), "showGreatBorder", false);
        setBooleanField(term4917329, term4917329.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917329, term4917329.getClass(), "showRivalBorder", false);
        setBooleanField(term4917329, term4917329.getClass(), "showRgoSetting", false);
        setBooleanField(term4917329, term4917329.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917329, term4917329.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917329, term4917329.getClass(), "contestNowPlayingValue", 0);
        setField(term4917329, term4917329.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917329, term4917329.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917329, term4917329.getClass(), "myList0", null);
        setField(term4917329, term4917329.getClass(), "myList1", null);
        setField(term4917329, term4917329.getClass(), "myList2", null);
        setIntField(term4917329, term4917329.getClass(), "rivalPdId", 0);
        term4917364 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917364;
        callMethod(klass, "setNextPvId", argTypes, term4917329, args);
    }

};


