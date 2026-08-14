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

public class PlayerProfile_getContestNowPlayingResultRank_460645300153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4915953;

    public PlayerProfile_getContestNowPlayingResultRank_460645300153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4915953 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4915953, term4915953.getClass(), "id", 0L);
        setIntField(term4915953, term4915953.getClass(), "pdId", 0);
        setField(term4915953, term4915953.getClass(), "playerName", null);
        setIntField(term4915953, term4915953.getClass(), "vocaloidPoints", 0);
        setIntField(term4915953, term4915953.getClass(), "level", 0);
        setIntField(term4915953, term4915953.getClass(), "levelExp", 0);
        setField(term4915953, term4915953.getClass(), "levelTitle", null);
        setIntField(term4915953, term4915953.getClass(), "plateId", 0);
        setIntField(term4915953, term4915953.getClass(), "plateEffectId", 0);
        setField(term4915953, term4915953.getClass(), "passwordStatus", null);
        setField(term4915953, term4915953.getClass(), "password", null);
        setBooleanField(term4915953, term4915953.getClass(), "preferPerPvModule", false);
        setBooleanField(term4915953, term4915953.getClass(), "preferCommonModule", false);
        setBooleanField(term4915953, term4915953.getClass(), "usePerPvSkin", false);
        setBooleanField(term4915953, term4915953.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4915953, term4915953.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4915953, term4915953.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4915953, term4915953.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4915953, term4915953.getClass(), "commonModule", null);
        setField(term4915953, term4915953.getClass(), "commonCustomizeItems", null);
        setField(term4915953, term4915953.getClass(), "commonModuleSetTime", null);
        setField(term4915953, term4915953.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4915953, term4915953.getClass(), "commonSkin", 0);
        setIntField(term4915953, term4915953.getClass(), "headphoneVolume", 0);
        setBooleanField(term4915953, term4915953.getClass(), "buttonSeOn", false);
        setIntField(term4915953, term4915953.getClass(), "buttonSeVolume", 0);
        setIntField(term4915953, term4915953.getClass(), "sliderSeVolume", 0);
        setIntField(term4915953, term4915953.getClass(), "buttonSe", 0);
        setIntField(term4915953, term4915953.getClass(), "chainSlideSe", 0);
        setIntField(term4915953, term4915953.getClass(), "slideSe", 0);
        setIntField(term4915953, term4915953.getClass(), "sliderTouchSe", 0);
        setField(term4915953, term4915953.getClass(), "sortMode", null);
        setIntField(term4915953, term4915953.getClass(), "nextPvId", 0);
        setField(term4915953, term4915953.getClass(), "nextDifficulty", null);
        setField(term4915953, term4915953.getClass(), "nextEdition", null);
        setBooleanField(term4915953, term4915953.getClass(), "showInterimRanking", false);
        setBooleanField(term4915953, term4915953.getClass(), "showClearStatus", false);
        setBooleanField(term4915953, term4915953.getClass(), "showGreatBorder", false);
        setBooleanField(term4915953, term4915953.getClass(), "showExcellentBorder", false);
        setBooleanField(term4915953, term4915953.getClass(), "showRivalBorder", false);
        setBooleanField(term4915953, term4915953.getClass(), "showRgoSetting", false);
        setBooleanField(term4915953, term4915953.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4915953, term4915953.getClass(), "contestNowPlayingId", 0);
        setIntField(term4915953, term4915953.getClass(), "contestNowPlayingValue", 0);
        setField(term4915953, term4915953.getClass(), "contestNowPlayingResultRank", null);
        setField(term4915953, term4915953.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4915953, term4915953.getClass(), "myList0", null);
        setField(term4915953, term4915953.getClass(), "myList1", null);
        setField(term4915953, term4915953.getClass(), "myList2", null);
        setIntField(term4915953, term4915953.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingResultRank", argTypes, term4915953, args);
    }

};


