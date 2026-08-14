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

public class PlayerProfile_setChainSlideSe_2097344478187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917183;
     Object term4917218;

    public PlayerProfile_setChainSlideSe_2097344478187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917183 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917183, term4917183.getClass(), "id", 0L);
        setIntField(term4917183, term4917183.getClass(), "pdId", 0);
        setField(term4917183, term4917183.getClass(), "playerName", null);
        setIntField(term4917183, term4917183.getClass(), "vocaloidPoints", 0);
        setIntField(term4917183, term4917183.getClass(), "level", 0);
        setIntField(term4917183, term4917183.getClass(), "levelExp", 0);
        setField(term4917183, term4917183.getClass(), "levelTitle", null);
        setIntField(term4917183, term4917183.getClass(), "plateId", 0);
        setIntField(term4917183, term4917183.getClass(), "plateEffectId", 0);
        setField(term4917183, term4917183.getClass(), "passwordStatus", null);
        setField(term4917183, term4917183.getClass(), "password", null);
        setBooleanField(term4917183, term4917183.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917183, term4917183.getClass(), "preferCommonModule", false);
        setBooleanField(term4917183, term4917183.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917183, term4917183.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917183, term4917183.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917183, term4917183.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917183, term4917183.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917183, term4917183.getClass(), "commonModule", null);
        setField(term4917183, term4917183.getClass(), "commonCustomizeItems", null);
        setField(term4917183, term4917183.getClass(), "commonModuleSetTime", null);
        setField(term4917183, term4917183.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917183, term4917183.getClass(), "commonSkin", 0);
        setIntField(term4917183, term4917183.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917183, term4917183.getClass(), "buttonSeOn", false);
        setIntField(term4917183, term4917183.getClass(), "buttonSeVolume", 0);
        setIntField(term4917183, term4917183.getClass(), "sliderSeVolume", 0);
        setIntField(term4917183, term4917183.getClass(), "buttonSe", 0);
        setIntField(term4917183, term4917183.getClass(), "chainSlideSe", 0);
        setIntField(term4917183, term4917183.getClass(), "slideSe", 0);
        setIntField(term4917183, term4917183.getClass(), "sliderTouchSe", 0);
        setField(term4917183, term4917183.getClass(), "sortMode", null);
        setIntField(term4917183, term4917183.getClass(), "nextPvId", 0);
        setField(term4917183, term4917183.getClass(), "nextDifficulty", null);
        setField(term4917183, term4917183.getClass(), "nextEdition", null);
        setBooleanField(term4917183, term4917183.getClass(), "showInterimRanking", false);
        setBooleanField(term4917183, term4917183.getClass(), "showClearStatus", false);
        setBooleanField(term4917183, term4917183.getClass(), "showGreatBorder", false);
        setBooleanField(term4917183, term4917183.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917183, term4917183.getClass(), "showRivalBorder", false);
        setBooleanField(term4917183, term4917183.getClass(), "showRgoSetting", false);
        setBooleanField(term4917183, term4917183.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917183, term4917183.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917183, term4917183.getClass(), "contestNowPlayingValue", 0);
        setField(term4917183, term4917183.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917183, term4917183.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917183, term4917183.getClass(), "myList0", null);
        setField(term4917183, term4917183.getClass(), "myList1", null);
        setField(term4917183, term4917183.getClass(), "myList2", null);
        setIntField(term4917183, term4917183.getClass(), "rivalPdId", 0);
        term4917218 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917218;
        callMethod(klass, "setChainSlideSe", argTypes, term4917183, args);
    }

};


