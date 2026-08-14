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
import java.lang.Boolean;

public class PlayerProfile_setShowRgoSetting_1600544915199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917621;
     Object term4917656;

    public PlayerProfile_setShowRgoSetting_1600544915199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917621 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917621, term4917621.getClass(), "id", 0L);
        setIntField(term4917621, term4917621.getClass(), "pdId", 0);
        setField(term4917621, term4917621.getClass(), "playerName", null);
        setIntField(term4917621, term4917621.getClass(), "vocaloidPoints", 0);
        setIntField(term4917621, term4917621.getClass(), "level", 0);
        setIntField(term4917621, term4917621.getClass(), "levelExp", 0);
        setField(term4917621, term4917621.getClass(), "levelTitle", null);
        setIntField(term4917621, term4917621.getClass(), "plateId", 0);
        setIntField(term4917621, term4917621.getClass(), "plateEffectId", 0);
        setField(term4917621, term4917621.getClass(), "passwordStatus", null);
        setField(term4917621, term4917621.getClass(), "password", null);
        setBooleanField(term4917621, term4917621.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917621, term4917621.getClass(), "preferCommonModule", false);
        setBooleanField(term4917621, term4917621.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917621, term4917621.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917621, term4917621.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917621, term4917621.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917621, term4917621.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917621, term4917621.getClass(), "commonModule", null);
        setField(term4917621, term4917621.getClass(), "commonCustomizeItems", null);
        setField(term4917621, term4917621.getClass(), "commonModuleSetTime", null);
        setField(term4917621, term4917621.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917621, term4917621.getClass(), "commonSkin", 0);
        setIntField(term4917621, term4917621.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917621, term4917621.getClass(), "buttonSeOn", false);
        setIntField(term4917621, term4917621.getClass(), "buttonSeVolume", 0);
        setIntField(term4917621, term4917621.getClass(), "sliderSeVolume", 0);
        setIntField(term4917621, term4917621.getClass(), "buttonSe", 0);
        setIntField(term4917621, term4917621.getClass(), "chainSlideSe", 0);
        setIntField(term4917621, term4917621.getClass(), "slideSe", 0);
        setIntField(term4917621, term4917621.getClass(), "sliderTouchSe", 0);
        setField(term4917621, term4917621.getClass(), "sortMode", null);
        setIntField(term4917621, term4917621.getClass(), "nextPvId", 0);
        setField(term4917621, term4917621.getClass(), "nextDifficulty", null);
        setField(term4917621, term4917621.getClass(), "nextEdition", null);
        setBooleanField(term4917621, term4917621.getClass(), "showInterimRanking", false);
        setBooleanField(term4917621, term4917621.getClass(), "showClearStatus", false);
        setBooleanField(term4917621, term4917621.getClass(), "showGreatBorder", false);
        setBooleanField(term4917621, term4917621.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917621, term4917621.getClass(), "showRivalBorder", false);
        setBooleanField(term4917621, term4917621.getClass(), "showRgoSetting", false);
        setBooleanField(term4917621, term4917621.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917621, term4917621.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917621, term4917621.getClass(), "contestNowPlayingValue", 0);
        setField(term4917621, term4917621.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917621, term4917621.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917621, term4917621.getClass(), "myList0", null);
        setField(term4917621, term4917621.getClass(), "myList1", null);
        setField(term4917621, term4917621.getClass(), "myList2", null);
        setIntField(term4917621, term4917621.getClass(), "rivalPdId", 0);
        term4917656 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4917656;
        callMethod(klass, "setShowRgoSetting", argTypes, term4917621, args);
    }

};


