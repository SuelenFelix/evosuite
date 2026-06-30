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

public class PlayerProfile_setUsePerPvSkin_859275527171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943791;
     Object term943826;

    public PlayerProfile_setUsePerPvSkin_859275527171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943791 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943791, term943791.getClass(), "id", 0L);
        setIntField(term943791, term943791.getClass(), "pdId", 0);
        setField(term943791, term943791.getClass(), "playerName", null);
        setIntField(term943791, term943791.getClass(), "vocaloidPoints", 0);
        setIntField(term943791, term943791.getClass(), "level", 0);
        setIntField(term943791, term943791.getClass(), "levelExp", 0);
        setField(term943791, term943791.getClass(), "levelTitle", null);
        setIntField(term943791, term943791.getClass(), "plateId", 0);
        setIntField(term943791, term943791.getClass(), "plateEffectId", 0);
        setField(term943791, term943791.getClass(), "passwordStatus", null);
        setField(term943791, term943791.getClass(), "password", null);
        setBooleanField(term943791, term943791.getClass(), "preferPerPvModule", false);
        setBooleanField(term943791, term943791.getClass(), "preferCommonModule", false);
        setBooleanField(term943791, term943791.getClass(), "usePerPvSkin", false);
        setBooleanField(term943791, term943791.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943791, term943791.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943791, term943791.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943791, term943791.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943791, term943791.getClass(), "commonModule", null);
        setField(term943791, term943791.getClass(), "commonCustomizeItems", null);
        setField(term943791, term943791.getClass(), "commonModuleSetTime", null);
        setField(term943791, term943791.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943791, term943791.getClass(), "commonSkin", 0);
        setIntField(term943791, term943791.getClass(), "headphoneVolume", 0);
        setBooleanField(term943791, term943791.getClass(), "buttonSeOn", false);
        setIntField(term943791, term943791.getClass(), "buttonSeVolume", 0);
        setIntField(term943791, term943791.getClass(), "sliderSeVolume", 0);
        setIntField(term943791, term943791.getClass(), "buttonSe", 0);
        setIntField(term943791, term943791.getClass(), "chainSlideSe", 0);
        setIntField(term943791, term943791.getClass(), "slideSe", 0);
        setIntField(term943791, term943791.getClass(), "sliderTouchSe", 0);
        setField(term943791, term943791.getClass(), "sortMode", null);
        setIntField(term943791, term943791.getClass(), "nextPvId", 0);
        setField(term943791, term943791.getClass(), "nextDifficulty", null);
        setField(term943791, term943791.getClass(), "nextEdition", null);
        setBooleanField(term943791, term943791.getClass(), "showInterimRanking", false);
        setBooleanField(term943791, term943791.getClass(), "showClearStatus", false);
        setBooleanField(term943791, term943791.getClass(), "showGreatBorder", false);
        setBooleanField(term943791, term943791.getClass(), "showExcellentBorder", false);
        setBooleanField(term943791, term943791.getClass(), "showRivalBorder", false);
        setBooleanField(term943791, term943791.getClass(), "showRgoSetting", false);
        setBooleanField(term943791, term943791.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943791, term943791.getClass(), "contestNowPlayingId", 0);
        setIntField(term943791, term943791.getClass(), "contestNowPlayingValue", 0);
        setField(term943791, term943791.getClass(), "contestNowPlayingResultRank", null);
        setField(term943791, term943791.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943791, term943791.getClass(), "myList0", null);
        setField(term943791, term943791.getClass(), "myList1", null);
        setField(term943791, term943791.getClass(), "myList2", null);
        setIntField(term943791, term943791.getClass(), "rivalPdId", 0);
        term943826 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943826;
        callMethod(klass, "setUsePerPvSkin", argTypes, term943791, args);
    }

};


