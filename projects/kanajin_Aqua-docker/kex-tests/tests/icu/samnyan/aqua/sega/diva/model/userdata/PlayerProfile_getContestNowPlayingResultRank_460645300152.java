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

public class PlayerProfile_getContestNowPlayingResultRank_460645300152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943108;

    public PlayerProfile_getContestNowPlayingResultRank_460645300152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943108 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943108, term943108.getClass(), "id", 0L);
        setIntField(term943108, term943108.getClass(), "pdId", 0);
        setField(term943108, term943108.getClass(), "playerName", null);
        setIntField(term943108, term943108.getClass(), "vocaloidPoints", 0);
        setIntField(term943108, term943108.getClass(), "level", 0);
        setIntField(term943108, term943108.getClass(), "levelExp", 0);
        setField(term943108, term943108.getClass(), "levelTitle", null);
        setIntField(term943108, term943108.getClass(), "plateId", 0);
        setIntField(term943108, term943108.getClass(), "plateEffectId", 0);
        setField(term943108, term943108.getClass(), "passwordStatus", null);
        setField(term943108, term943108.getClass(), "password", null);
        setBooleanField(term943108, term943108.getClass(), "preferPerPvModule", false);
        setBooleanField(term943108, term943108.getClass(), "preferCommonModule", false);
        setBooleanField(term943108, term943108.getClass(), "usePerPvSkin", false);
        setBooleanField(term943108, term943108.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943108, term943108.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943108, term943108.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943108, term943108.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943108, term943108.getClass(), "commonModule", null);
        setField(term943108, term943108.getClass(), "commonCustomizeItems", null);
        setField(term943108, term943108.getClass(), "commonModuleSetTime", null);
        setField(term943108, term943108.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943108, term943108.getClass(), "commonSkin", 0);
        setIntField(term943108, term943108.getClass(), "headphoneVolume", 0);
        setBooleanField(term943108, term943108.getClass(), "buttonSeOn", false);
        setIntField(term943108, term943108.getClass(), "buttonSeVolume", 0);
        setIntField(term943108, term943108.getClass(), "sliderSeVolume", 0);
        setIntField(term943108, term943108.getClass(), "buttonSe", 0);
        setIntField(term943108, term943108.getClass(), "chainSlideSe", 0);
        setIntField(term943108, term943108.getClass(), "slideSe", 0);
        setIntField(term943108, term943108.getClass(), "sliderTouchSe", 0);
        setField(term943108, term943108.getClass(), "sortMode", null);
        setIntField(term943108, term943108.getClass(), "nextPvId", 0);
        setField(term943108, term943108.getClass(), "nextDifficulty", null);
        setField(term943108, term943108.getClass(), "nextEdition", null);
        setBooleanField(term943108, term943108.getClass(), "showInterimRanking", false);
        setBooleanField(term943108, term943108.getClass(), "showClearStatus", false);
        setBooleanField(term943108, term943108.getClass(), "showGreatBorder", false);
        setBooleanField(term943108, term943108.getClass(), "showExcellentBorder", false);
        setBooleanField(term943108, term943108.getClass(), "showRivalBorder", false);
        setBooleanField(term943108, term943108.getClass(), "showRgoSetting", false);
        setBooleanField(term943108, term943108.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943108, term943108.getClass(), "contestNowPlayingId", 0);
        setIntField(term943108, term943108.getClass(), "contestNowPlayingValue", 0);
        setField(term943108, term943108.getClass(), "contestNowPlayingResultRank", null);
        setField(term943108, term943108.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943108, term943108.getClass(), "myList0", null);
        setField(term943108, term943108.getClass(), "myList1", null);
        setField(term943108, term943108.getClass(), "myList2", null);
        setIntField(term943108, term943108.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingResultRank", argTypes, term943108, args);
    }

};


