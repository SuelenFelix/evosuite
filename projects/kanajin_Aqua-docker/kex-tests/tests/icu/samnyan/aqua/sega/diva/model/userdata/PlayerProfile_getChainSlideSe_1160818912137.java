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

public class PlayerProfile_getChainSlideSe_1160818912137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915393;

    public PlayerProfile_getChainSlideSe_1160818912137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915393 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915393, term4915393.getClass(), "id", 0L);
        setIntField(term4915393, term4915393.getClass(), "pdId", 0);
        setField(term4915393, term4915393.getClass(), "playerName", null);
        setIntField(term4915393, term4915393.getClass(), "vocaloidPoints", 0);
        setIntField(term4915393, term4915393.getClass(), "level", 0);
        setIntField(term4915393, term4915393.getClass(), "levelExp", 0);
        setField(term4915393, term4915393.getClass(), "levelTitle", null);
        setIntField(term4915393, term4915393.getClass(), "plateId", 0);
        setIntField(term4915393, term4915393.getClass(), "plateEffectId", 0);
        setField(term4915393, term4915393.getClass(), "passwordStatus", null);
        setField(term4915393, term4915393.getClass(), "password", null);
        setBooleanField(term4915393, term4915393.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915393, term4915393.getClass(), "preferCommonModule", false);
        setBooleanField(term4915393, term4915393.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915393, term4915393.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915393, term4915393.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915393, term4915393.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915393, term4915393.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915393, term4915393.getClass(), "commonModule", null);
        setField(term4915393, term4915393.getClass(), "commonCustomizeItems", null);
        setField(term4915393, term4915393.getClass(), "commonModuleSetTime", null);
        setField(term4915393, term4915393.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915393, term4915393.getClass(), "commonSkin", 0);
        setIntField(term4915393, term4915393.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915393, term4915393.getClass(), "buttonSeOn", false);
        setIntField(term4915393, term4915393.getClass(), "buttonSeVolume", 0);
        setIntField(term4915393, term4915393.getClass(), "sliderSeVolume", 0);
        setIntField(term4915393, term4915393.getClass(), "buttonSe", 0);
        setIntField(term4915393, term4915393.getClass(), "chainSlideSe", 0);
        setIntField(term4915393, term4915393.getClass(), "slideSe", 0);
        setIntField(term4915393, term4915393.getClass(), "sliderTouchSe", 0);
        setField(term4915393, term4915393.getClass(), "sortMode", null);
        setIntField(term4915393, term4915393.getClass(), "nextPvId", 0);
        setField(term4915393, term4915393.getClass(), "nextDifficulty", null);
        setField(term4915393, term4915393.getClass(), "nextEdition", null);
        setBooleanField(term4915393, term4915393.getClass(), "showInterimRanking", false);
        setBooleanField(term4915393, term4915393.getClass(), "showClearStatus", false);
        setBooleanField(term4915393, term4915393.getClass(), "showGreatBorder", false);
        setBooleanField(term4915393, term4915393.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915393, term4915393.getClass(), "showRivalBorder", false);
        setBooleanField(term4915393, term4915393.getClass(), "showRgoSetting", false);
        setBooleanField(term4915393, term4915393.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915393, term4915393.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915393, term4915393.getClass(), "contestNowPlayingValue", 0);
        setField(term4915393, term4915393.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915393, term4915393.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915393, term4915393.getClass(), "myList0", null);
        setField(term4915393, term4915393.getClass(), "myList1", null);
        setField(term4915393, term4915393.getClass(), "myList2", null);
        setIntField(term4915393, term4915393.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChainSlideSe", argTypes, term4915393, args);
    }

};


