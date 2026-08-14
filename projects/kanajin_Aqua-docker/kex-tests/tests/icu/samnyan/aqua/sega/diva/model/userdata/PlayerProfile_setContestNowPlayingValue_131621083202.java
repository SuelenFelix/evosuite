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

public class PlayerProfile_setContestNowPlayingValue_131621083202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917732;
     Object term4917767;

    public PlayerProfile_setContestNowPlayingValue_131621083202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917732 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917732, term4917732.getClass(), "id", 0L);
        setIntField(term4917732, term4917732.getClass(), "pdId", 0);
        setField(term4917732, term4917732.getClass(), "playerName", null);
        setIntField(term4917732, term4917732.getClass(), "vocaloidPoints", 0);
        setIntField(term4917732, term4917732.getClass(), "level", 0);
        setIntField(term4917732, term4917732.getClass(), "levelExp", 0);
        setField(term4917732, term4917732.getClass(), "levelTitle", null);
        setIntField(term4917732, term4917732.getClass(), "plateId", 0);
        setIntField(term4917732, term4917732.getClass(), "plateEffectId", 0);
        setField(term4917732, term4917732.getClass(), "passwordStatus", null);
        setField(term4917732, term4917732.getClass(), "password", null);
        setBooleanField(term4917732, term4917732.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917732, term4917732.getClass(), "preferCommonModule", false);
        setBooleanField(term4917732, term4917732.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917732, term4917732.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917732, term4917732.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917732, term4917732.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917732, term4917732.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917732, term4917732.getClass(), "commonModule", null);
        setField(term4917732, term4917732.getClass(), "commonCustomizeItems", null);
        setField(term4917732, term4917732.getClass(), "commonModuleSetTime", null);
        setField(term4917732, term4917732.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917732, term4917732.getClass(), "commonSkin", 0);
        setIntField(term4917732, term4917732.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917732, term4917732.getClass(), "buttonSeOn", false);
        setIntField(term4917732, term4917732.getClass(), "buttonSeVolume", 0);
        setIntField(term4917732, term4917732.getClass(), "sliderSeVolume", 0);
        setIntField(term4917732, term4917732.getClass(), "buttonSe", 0);
        setIntField(term4917732, term4917732.getClass(), "chainSlideSe", 0);
        setIntField(term4917732, term4917732.getClass(), "slideSe", 0);
        setIntField(term4917732, term4917732.getClass(), "sliderTouchSe", 0);
        setField(term4917732, term4917732.getClass(), "sortMode", null);
        setIntField(term4917732, term4917732.getClass(), "nextPvId", 0);
        setField(term4917732, term4917732.getClass(), "nextDifficulty", null);
        setField(term4917732, term4917732.getClass(), "nextEdition", null);
        setBooleanField(term4917732, term4917732.getClass(), "showInterimRanking", false);
        setBooleanField(term4917732, term4917732.getClass(), "showClearStatus", false);
        setBooleanField(term4917732, term4917732.getClass(), "showGreatBorder", false);
        setBooleanField(term4917732, term4917732.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917732, term4917732.getClass(), "showRivalBorder", false);
        setBooleanField(term4917732, term4917732.getClass(), "showRgoSetting", false);
        setBooleanField(term4917732, term4917732.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917732, term4917732.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917732, term4917732.getClass(), "contestNowPlayingValue", 0);
        setField(term4917732, term4917732.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917732, term4917732.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917732, term4917732.getClass(), "myList0", null);
        setField(term4917732, term4917732.getClass(), "myList1", null);
        setField(term4917732, term4917732.getClass(), "myList2", null);
        setIntField(term4917732, term4917732.getClass(), "rivalPdId", 0);
        term4917767 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917767;
        callMethod(klass, "setContestNowPlayingValue", argTypes, term4917732, args);
    }

};


