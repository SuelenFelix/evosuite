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

public class PlayerProfile_setContestNowPlayingId_287501405200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944850;
     Object term944885;

    public PlayerProfile_setContestNowPlayingId_287501405200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944850 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944850, term944850.getClass(), "id", 0L);
        setIntField(term944850, term944850.getClass(), "pdId", 0);
        setField(term944850, term944850.getClass(), "playerName", null);
        setIntField(term944850, term944850.getClass(), "vocaloidPoints", 0);
        setIntField(term944850, term944850.getClass(), "level", 0);
        setIntField(term944850, term944850.getClass(), "levelExp", 0);
        setField(term944850, term944850.getClass(), "levelTitle", null);
        setIntField(term944850, term944850.getClass(), "plateId", 0);
        setIntField(term944850, term944850.getClass(), "plateEffectId", 0);
        setField(term944850, term944850.getClass(), "passwordStatus", null);
        setField(term944850, term944850.getClass(), "password", null);
        setBooleanField(term944850, term944850.getClass(), "preferPerPvModule", false);
        setBooleanField(term944850, term944850.getClass(), "preferCommonModule", false);
        setBooleanField(term944850, term944850.getClass(), "usePerPvSkin", false);
        setBooleanField(term944850, term944850.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944850, term944850.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944850, term944850.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944850, term944850.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944850, term944850.getClass(), "commonModule", null);
        setField(term944850, term944850.getClass(), "commonCustomizeItems", null);
        setField(term944850, term944850.getClass(), "commonModuleSetTime", null);
        setField(term944850, term944850.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944850, term944850.getClass(), "commonSkin", 0);
        setIntField(term944850, term944850.getClass(), "headphoneVolume", 0);
        setBooleanField(term944850, term944850.getClass(), "buttonSeOn", false);
        setIntField(term944850, term944850.getClass(), "buttonSeVolume", 0);
        setIntField(term944850, term944850.getClass(), "sliderSeVolume", 0);
        setIntField(term944850, term944850.getClass(), "buttonSe", 0);
        setIntField(term944850, term944850.getClass(), "chainSlideSe", 0);
        setIntField(term944850, term944850.getClass(), "slideSe", 0);
        setIntField(term944850, term944850.getClass(), "sliderTouchSe", 0);
        setField(term944850, term944850.getClass(), "sortMode", null);
        setIntField(term944850, term944850.getClass(), "nextPvId", 0);
        setField(term944850, term944850.getClass(), "nextDifficulty", null);
        setField(term944850, term944850.getClass(), "nextEdition", null);
        setBooleanField(term944850, term944850.getClass(), "showInterimRanking", false);
        setBooleanField(term944850, term944850.getClass(), "showClearStatus", false);
        setBooleanField(term944850, term944850.getClass(), "showGreatBorder", false);
        setBooleanField(term944850, term944850.getClass(), "showExcellentBorder", false);
        setBooleanField(term944850, term944850.getClass(), "showRivalBorder", false);
        setBooleanField(term944850, term944850.getClass(), "showRgoSetting", false);
        setBooleanField(term944850, term944850.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944850, term944850.getClass(), "contestNowPlayingId", 0);
        setIntField(term944850, term944850.getClass(), "contestNowPlayingValue", 0);
        setField(term944850, term944850.getClass(), "contestNowPlayingResultRank", null);
        setField(term944850, term944850.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944850, term944850.getClass(), "myList0", null);
        setField(term944850, term944850.getClass(), "myList1", null);
        setField(term944850, term944850.getClass(), "myList2", null);
        setIntField(term944850, term944850.getClass(), "rivalPdId", 0);
        term944885 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944885;
        callMethod(klass, "setContestNowPlayingId", argTypes, term944850, args);
    }

};


