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

public class PlayerProfile_getMyList1_2121887806155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943213;

    public PlayerProfile_getMyList1_2121887806155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943213 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943213, term943213.getClass(), "id", 0L);
        setIntField(term943213, term943213.getClass(), "pdId", 0);
        setField(term943213, term943213.getClass(), "playerName", null);
        setIntField(term943213, term943213.getClass(), "vocaloidPoints", 0);
        setIntField(term943213, term943213.getClass(), "level", 0);
        setIntField(term943213, term943213.getClass(), "levelExp", 0);
        setField(term943213, term943213.getClass(), "levelTitle", null);
        setIntField(term943213, term943213.getClass(), "plateId", 0);
        setIntField(term943213, term943213.getClass(), "plateEffectId", 0);
        setField(term943213, term943213.getClass(), "passwordStatus", null);
        setField(term943213, term943213.getClass(), "password", null);
        setBooleanField(term943213, term943213.getClass(), "preferPerPvModule", false);
        setBooleanField(term943213, term943213.getClass(), "preferCommonModule", false);
        setBooleanField(term943213, term943213.getClass(), "usePerPvSkin", false);
        setBooleanField(term943213, term943213.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943213, term943213.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943213, term943213.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943213, term943213.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943213, term943213.getClass(), "commonModule", null);
        setField(term943213, term943213.getClass(), "commonCustomizeItems", null);
        setField(term943213, term943213.getClass(), "commonModuleSetTime", null);
        setField(term943213, term943213.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943213, term943213.getClass(), "commonSkin", 0);
        setIntField(term943213, term943213.getClass(), "headphoneVolume", 0);
        setBooleanField(term943213, term943213.getClass(), "buttonSeOn", false);
        setIntField(term943213, term943213.getClass(), "buttonSeVolume", 0);
        setIntField(term943213, term943213.getClass(), "sliderSeVolume", 0);
        setIntField(term943213, term943213.getClass(), "buttonSe", 0);
        setIntField(term943213, term943213.getClass(), "chainSlideSe", 0);
        setIntField(term943213, term943213.getClass(), "slideSe", 0);
        setIntField(term943213, term943213.getClass(), "sliderTouchSe", 0);
        setField(term943213, term943213.getClass(), "sortMode", null);
        setIntField(term943213, term943213.getClass(), "nextPvId", 0);
        setField(term943213, term943213.getClass(), "nextDifficulty", null);
        setField(term943213, term943213.getClass(), "nextEdition", null);
        setBooleanField(term943213, term943213.getClass(), "showInterimRanking", false);
        setBooleanField(term943213, term943213.getClass(), "showClearStatus", false);
        setBooleanField(term943213, term943213.getClass(), "showGreatBorder", false);
        setBooleanField(term943213, term943213.getClass(), "showExcellentBorder", false);
        setBooleanField(term943213, term943213.getClass(), "showRivalBorder", false);
        setBooleanField(term943213, term943213.getClass(), "showRgoSetting", false);
        setBooleanField(term943213, term943213.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943213, term943213.getClass(), "contestNowPlayingId", 0);
        setIntField(term943213, term943213.getClass(), "contestNowPlayingValue", 0);
        setField(term943213, term943213.getClass(), "contestNowPlayingResultRank", null);
        setField(term943213, term943213.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943213, term943213.getClass(), "myList0", null);
        setField(term943213, term943213.getClass(), "myList1", null);
        setField(term943213, term943213.getClass(), "myList2", null);
        setIntField(term943213, term943213.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMyList1", argTypes, term943213, args);
    }

};


