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

public class PlayerProfile_isShowRivalBorder_2053370505147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942933;

    public PlayerProfile_isShowRivalBorder_2053370505147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942933 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942933, term942933.getClass(), "id", 0L);
        setIntField(term942933, term942933.getClass(), "pdId", 0);
        setField(term942933, term942933.getClass(), "playerName", null);
        setIntField(term942933, term942933.getClass(), "vocaloidPoints", 0);
        setIntField(term942933, term942933.getClass(), "level", 0);
        setIntField(term942933, term942933.getClass(), "levelExp", 0);
        setField(term942933, term942933.getClass(), "levelTitle", null);
        setIntField(term942933, term942933.getClass(), "plateId", 0);
        setIntField(term942933, term942933.getClass(), "plateEffectId", 0);
        setField(term942933, term942933.getClass(), "passwordStatus", null);
        setField(term942933, term942933.getClass(), "password", null);
        setBooleanField(term942933, term942933.getClass(), "preferPerPvModule", false);
        setBooleanField(term942933, term942933.getClass(), "preferCommonModule", false);
        setBooleanField(term942933, term942933.getClass(), "usePerPvSkin", false);
        setBooleanField(term942933, term942933.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942933, term942933.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942933, term942933.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942933, term942933.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942933, term942933.getClass(), "commonModule", null);
        setField(term942933, term942933.getClass(), "commonCustomizeItems", null);
        setField(term942933, term942933.getClass(), "commonModuleSetTime", null);
        setField(term942933, term942933.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942933, term942933.getClass(), "commonSkin", 0);
        setIntField(term942933, term942933.getClass(), "headphoneVolume", 0);
        setBooleanField(term942933, term942933.getClass(), "buttonSeOn", false);
        setIntField(term942933, term942933.getClass(), "buttonSeVolume", 0);
        setIntField(term942933, term942933.getClass(), "sliderSeVolume", 0);
        setIntField(term942933, term942933.getClass(), "buttonSe", 0);
        setIntField(term942933, term942933.getClass(), "chainSlideSe", 0);
        setIntField(term942933, term942933.getClass(), "slideSe", 0);
        setIntField(term942933, term942933.getClass(), "sliderTouchSe", 0);
        setField(term942933, term942933.getClass(), "sortMode", null);
        setIntField(term942933, term942933.getClass(), "nextPvId", 0);
        setField(term942933, term942933.getClass(), "nextDifficulty", null);
        setField(term942933, term942933.getClass(), "nextEdition", null);
        setBooleanField(term942933, term942933.getClass(), "showInterimRanking", false);
        setBooleanField(term942933, term942933.getClass(), "showClearStatus", false);
        setBooleanField(term942933, term942933.getClass(), "showGreatBorder", false);
        setBooleanField(term942933, term942933.getClass(), "showExcellentBorder", false);
        setBooleanField(term942933, term942933.getClass(), "showRivalBorder", false);
        setBooleanField(term942933, term942933.getClass(), "showRgoSetting", false);
        setBooleanField(term942933, term942933.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942933, term942933.getClass(), "contestNowPlayingId", 0);
        setIntField(term942933, term942933.getClass(), "contestNowPlayingValue", 0);
        setField(term942933, term942933.getClass(), "contestNowPlayingResultRank", null);
        setField(term942933, term942933.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942933, term942933.getClass(), "myList0", null);
        setField(term942933, term942933.getClass(), "myList1", null);
        setField(term942933, term942933.getClass(), "myList2", null);
        setIntField(term942933, term942933.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowRivalBorder", argTypes, term942933, args);
    }

};


