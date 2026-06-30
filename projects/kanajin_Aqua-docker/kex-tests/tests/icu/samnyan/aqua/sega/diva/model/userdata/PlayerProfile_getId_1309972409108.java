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

public class PlayerProfile_getId_1309972409108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term941568;

    public PlayerProfile_getId_1309972409108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term941568 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term941568, term941568.getClass(), "id", 0L);
        setIntField(term941568, term941568.getClass(), "pdId", 0);
        setField(term941568, term941568.getClass(), "playerName", null);
        setIntField(term941568, term941568.getClass(), "vocaloidPoints", 0);
        setIntField(term941568, term941568.getClass(), "level", 0);
        setIntField(term941568, term941568.getClass(), "levelExp", 0);
        setField(term941568, term941568.getClass(), "levelTitle", null);
        setIntField(term941568, term941568.getClass(), "plateId", 0);
        setIntField(term941568, term941568.getClass(), "plateEffectId", 0);
        setField(term941568, term941568.getClass(), "passwordStatus", null);
        setField(term941568, term941568.getClass(), "password", null);
        setBooleanField(term941568, term941568.getClass(), "preferPerPvModule", false);
        setBooleanField(term941568, term941568.getClass(), "preferCommonModule", false);
        setBooleanField(term941568, term941568.getClass(), "usePerPvSkin", false);
        setBooleanField(term941568, term941568.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term941568, term941568.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term941568, term941568.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term941568, term941568.getClass(), "usePerPvTouchSliderSe", false);
        setField(term941568, term941568.getClass(), "commonModule", null);
        setField(term941568, term941568.getClass(), "commonCustomizeItems", null);
        setField(term941568, term941568.getClass(), "commonModuleSetTime", null);
        setField(term941568, term941568.getClass(), "moduleSelectItemFlag", null);
        setIntField(term941568, term941568.getClass(), "commonSkin", 0);
        setIntField(term941568, term941568.getClass(), "headphoneVolume", 0);
        setBooleanField(term941568, term941568.getClass(), "buttonSeOn", false);
        setIntField(term941568, term941568.getClass(), "buttonSeVolume", 0);
        setIntField(term941568, term941568.getClass(), "sliderSeVolume", 0);
        setIntField(term941568, term941568.getClass(), "buttonSe", 0);
        setIntField(term941568, term941568.getClass(), "chainSlideSe", 0);
        setIntField(term941568, term941568.getClass(), "slideSe", 0);
        setIntField(term941568, term941568.getClass(), "sliderTouchSe", 0);
        setField(term941568, term941568.getClass(), "sortMode", null);
        setIntField(term941568, term941568.getClass(), "nextPvId", 0);
        setField(term941568, term941568.getClass(), "nextDifficulty", null);
        setField(term941568, term941568.getClass(), "nextEdition", null);
        setBooleanField(term941568, term941568.getClass(), "showInterimRanking", false);
        setBooleanField(term941568, term941568.getClass(), "showClearStatus", false);
        setBooleanField(term941568, term941568.getClass(), "showGreatBorder", false);
        setBooleanField(term941568, term941568.getClass(), "showExcellentBorder", false);
        setBooleanField(term941568, term941568.getClass(), "showRivalBorder", false);
        setBooleanField(term941568, term941568.getClass(), "showRgoSetting", false);
        setBooleanField(term941568, term941568.getClass(), "contestNowPlayingEnable", false);
        setIntField(term941568, term941568.getClass(), "contestNowPlayingId", 0);
        setIntField(term941568, term941568.getClass(), "contestNowPlayingValue", 0);
        setField(term941568, term941568.getClass(), "contestNowPlayingResultRank", null);
        setField(term941568, term941568.getClass(), "contestNowPlayingSpecifier", null);
        setField(term941568, term941568.getClass(), "myList0", null);
        setField(term941568, term941568.getClass(), "myList1", null);
        setField(term941568, term941568.getClass(), "myList2", null);
        setIntField(term941568, term941568.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term941568, args);
    }

};


