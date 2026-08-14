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

public class PlayerProfile_getLevel_1802894570113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4914553;

    public PlayerProfile_getLevel_1802894570113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4914553 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4914553, term4914553.getClass(), "id", 0L);
        setIntField(term4914553, term4914553.getClass(), "pdId", 0);
        setField(term4914553, term4914553.getClass(), "playerName", null);
        setIntField(term4914553, term4914553.getClass(), "vocaloidPoints", 0);
        setIntField(term4914553, term4914553.getClass(), "level", 0);
        setIntField(term4914553, term4914553.getClass(), "levelExp", 0);
        setField(term4914553, term4914553.getClass(), "levelTitle", null);
        setIntField(term4914553, term4914553.getClass(), "plateId", 0);
        setIntField(term4914553, term4914553.getClass(), "plateEffectId", 0);
        setField(term4914553, term4914553.getClass(), "passwordStatus", null);
        setField(term4914553, term4914553.getClass(), "password", null);
        setBooleanField(term4914553, term4914553.getClass(), "preferPerPvModule", false);
        setBooleanField(term4914553, term4914553.getClass(), "preferCommonModule", false);
        setBooleanField(term4914553, term4914553.getClass(), "usePerPvSkin", false);
        setBooleanField(term4914553, term4914553.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4914553, term4914553.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4914553, term4914553.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4914553, term4914553.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4914553, term4914553.getClass(), "commonModule", null);
        setField(term4914553, term4914553.getClass(), "commonCustomizeItems", null);
        setField(term4914553, term4914553.getClass(), "commonModuleSetTime", null);
        setField(term4914553, term4914553.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4914553, term4914553.getClass(), "commonSkin", 0);
        setIntField(term4914553, term4914553.getClass(), "headphoneVolume", 0);
        setBooleanField(term4914553, term4914553.getClass(), "buttonSeOn", false);
        setIntField(term4914553, term4914553.getClass(), "buttonSeVolume", 0);
        setIntField(term4914553, term4914553.getClass(), "sliderSeVolume", 0);
        setIntField(term4914553, term4914553.getClass(), "buttonSe", 0);
        setIntField(term4914553, term4914553.getClass(), "chainSlideSe", 0);
        setIntField(term4914553, term4914553.getClass(), "slideSe", 0);
        setIntField(term4914553, term4914553.getClass(), "sliderTouchSe", 0);
        setField(term4914553, term4914553.getClass(), "sortMode", null);
        setIntField(term4914553, term4914553.getClass(), "nextPvId", 0);
        setField(term4914553, term4914553.getClass(), "nextDifficulty", null);
        setField(term4914553, term4914553.getClass(), "nextEdition", null);
        setBooleanField(term4914553, term4914553.getClass(), "showInterimRanking", false);
        setBooleanField(term4914553, term4914553.getClass(), "showClearStatus", false);
        setBooleanField(term4914553, term4914553.getClass(), "showGreatBorder", false);
        setBooleanField(term4914553, term4914553.getClass(), "showExcellentBorder", false);
        setBooleanField(term4914553, term4914553.getClass(), "showRivalBorder", false);
        setBooleanField(term4914553, term4914553.getClass(), "showRgoSetting", false);
        setBooleanField(term4914553, term4914553.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4914553, term4914553.getClass(), "contestNowPlayingId", 0);
        setIntField(term4914553, term4914553.getClass(), "contestNowPlayingValue", 0);
        setField(term4914553, term4914553.getClass(), "contestNowPlayingResultRank", null);
        setField(term4914553, term4914553.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4914553, term4914553.getClass(), "myList0", null);
        setField(term4914553, term4914553.getClass(), "myList1", null);
        setField(term4914553, term4914553.getClass(), "myList2", null);
        setIntField(term4914553, term4914553.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term4914553, args);
    }

};


