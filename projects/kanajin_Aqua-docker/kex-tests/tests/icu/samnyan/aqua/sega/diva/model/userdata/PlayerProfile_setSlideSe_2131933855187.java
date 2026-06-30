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

public class PlayerProfile_setSlideSe_2131933855187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944375;
     Object term944410;

    public PlayerProfile_setSlideSe_2131933855187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944375 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944375, term944375.getClass(), "id", 0L);
        setIntField(term944375, term944375.getClass(), "pdId", 0);
        setField(term944375, term944375.getClass(), "playerName", null);
        setIntField(term944375, term944375.getClass(), "vocaloidPoints", 0);
        setIntField(term944375, term944375.getClass(), "level", 0);
        setIntField(term944375, term944375.getClass(), "levelExp", 0);
        setField(term944375, term944375.getClass(), "levelTitle", null);
        setIntField(term944375, term944375.getClass(), "plateId", 0);
        setIntField(term944375, term944375.getClass(), "plateEffectId", 0);
        setField(term944375, term944375.getClass(), "passwordStatus", null);
        setField(term944375, term944375.getClass(), "password", null);
        setBooleanField(term944375, term944375.getClass(), "preferPerPvModule", false);
        setBooleanField(term944375, term944375.getClass(), "preferCommonModule", false);
        setBooleanField(term944375, term944375.getClass(), "usePerPvSkin", false);
        setBooleanField(term944375, term944375.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944375, term944375.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944375, term944375.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944375, term944375.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944375, term944375.getClass(), "commonModule", null);
        setField(term944375, term944375.getClass(), "commonCustomizeItems", null);
        setField(term944375, term944375.getClass(), "commonModuleSetTime", null);
        setField(term944375, term944375.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944375, term944375.getClass(), "commonSkin", 0);
        setIntField(term944375, term944375.getClass(), "headphoneVolume", 0);
        setBooleanField(term944375, term944375.getClass(), "buttonSeOn", false);
        setIntField(term944375, term944375.getClass(), "buttonSeVolume", 0);
        setIntField(term944375, term944375.getClass(), "sliderSeVolume", 0);
        setIntField(term944375, term944375.getClass(), "buttonSe", 0);
        setIntField(term944375, term944375.getClass(), "chainSlideSe", 0);
        setIntField(term944375, term944375.getClass(), "slideSe", 0);
        setIntField(term944375, term944375.getClass(), "sliderTouchSe", 0);
        setField(term944375, term944375.getClass(), "sortMode", null);
        setIntField(term944375, term944375.getClass(), "nextPvId", 0);
        setField(term944375, term944375.getClass(), "nextDifficulty", null);
        setField(term944375, term944375.getClass(), "nextEdition", null);
        setBooleanField(term944375, term944375.getClass(), "showInterimRanking", false);
        setBooleanField(term944375, term944375.getClass(), "showClearStatus", false);
        setBooleanField(term944375, term944375.getClass(), "showGreatBorder", false);
        setBooleanField(term944375, term944375.getClass(), "showExcellentBorder", false);
        setBooleanField(term944375, term944375.getClass(), "showRivalBorder", false);
        setBooleanField(term944375, term944375.getClass(), "showRgoSetting", false);
        setBooleanField(term944375, term944375.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944375, term944375.getClass(), "contestNowPlayingId", 0);
        setIntField(term944375, term944375.getClass(), "contestNowPlayingValue", 0);
        setField(term944375, term944375.getClass(), "contestNowPlayingResultRank", null);
        setField(term944375, term944375.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944375, term944375.getClass(), "myList0", null);
        setField(term944375, term944375.getClass(), "myList1", null);
        setField(term944375, term944375.getClass(), "myList2", null);
        setIntField(term944375, term944375.getClass(), "rivalPdId", 0);
        term944410 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944410;
        callMethod(klass, "setSlideSe", argTypes, term944375, args);
    }

};


