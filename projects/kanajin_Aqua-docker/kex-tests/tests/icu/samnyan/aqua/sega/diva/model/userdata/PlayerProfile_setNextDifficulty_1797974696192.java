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

public class PlayerProfile_setNextDifficulty_1797974696192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917366;

    public PlayerProfile_setNextDifficulty_1797974696192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917366 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917366, term4917366.getClass(), "id", 0L);
        setIntField(term4917366, term4917366.getClass(), "pdId", 0);
        setField(term4917366, term4917366.getClass(), "playerName", null);
        setIntField(term4917366, term4917366.getClass(), "vocaloidPoints", 0);
        setIntField(term4917366, term4917366.getClass(), "level", 0);
        setIntField(term4917366, term4917366.getClass(), "levelExp", 0);
        setField(term4917366, term4917366.getClass(), "levelTitle", null);
        setIntField(term4917366, term4917366.getClass(), "plateId", 0);
        setIntField(term4917366, term4917366.getClass(), "plateEffectId", 0);
        setField(term4917366, term4917366.getClass(), "passwordStatus", null);
        setField(term4917366, term4917366.getClass(), "password", null);
        setBooleanField(term4917366, term4917366.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917366, term4917366.getClass(), "preferCommonModule", false);
        setBooleanField(term4917366, term4917366.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917366, term4917366.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917366, term4917366.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917366, term4917366.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917366, term4917366.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917366, term4917366.getClass(), "commonModule", null);
        setField(term4917366, term4917366.getClass(), "commonCustomizeItems", null);
        setField(term4917366, term4917366.getClass(), "commonModuleSetTime", null);
        setField(term4917366, term4917366.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917366, term4917366.getClass(), "commonSkin", 0);
        setIntField(term4917366, term4917366.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917366, term4917366.getClass(), "buttonSeOn", false);
        setIntField(term4917366, term4917366.getClass(), "buttonSeVolume", 0);
        setIntField(term4917366, term4917366.getClass(), "sliderSeVolume", 0);
        setIntField(term4917366, term4917366.getClass(), "buttonSe", 0);
        setIntField(term4917366, term4917366.getClass(), "chainSlideSe", 0);
        setIntField(term4917366, term4917366.getClass(), "slideSe", 0);
        setIntField(term4917366, term4917366.getClass(), "sliderTouchSe", 0);
        setField(term4917366, term4917366.getClass(), "sortMode", null);
        setIntField(term4917366, term4917366.getClass(), "nextPvId", 0);
        setField(term4917366, term4917366.getClass(), "nextDifficulty", null);
        setField(term4917366, term4917366.getClass(), "nextEdition", null);
        setBooleanField(term4917366, term4917366.getClass(), "showInterimRanking", false);
        setBooleanField(term4917366, term4917366.getClass(), "showClearStatus", false);
        setBooleanField(term4917366, term4917366.getClass(), "showGreatBorder", false);
        setBooleanField(term4917366, term4917366.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917366, term4917366.getClass(), "showRivalBorder", false);
        setBooleanField(term4917366, term4917366.getClass(), "showRgoSetting", false);
        setBooleanField(term4917366, term4917366.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917366, term4917366.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917366, term4917366.getClass(), "contestNowPlayingValue", 0);
        setField(term4917366, term4917366.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917366, term4917366.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917366, term4917366.getClass(), "myList0", null);
        setField(term4917366, term4917366.getClass(), "myList1", null);
        setField(term4917366, term4917366.getClass(), "myList2", null);
        setIntField(term4917366, term4917366.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Difficulty");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNextDifficulty", argTypes, term4917366, args);
    }

};


