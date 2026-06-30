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

public class PlayerProfile_setCommonSkin_258795704180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944116;
     Object term944151;

    public PlayerProfile_setCommonSkin_258795704180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944116 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944116, term944116.getClass(), "id", 0L);
        setIntField(term944116, term944116.getClass(), "pdId", 0);
        setField(term944116, term944116.getClass(), "playerName", null);
        setIntField(term944116, term944116.getClass(), "vocaloidPoints", 0);
        setIntField(term944116, term944116.getClass(), "level", 0);
        setIntField(term944116, term944116.getClass(), "levelExp", 0);
        setField(term944116, term944116.getClass(), "levelTitle", null);
        setIntField(term944116, term944116.getClass(), "plateId", 0);
        setIntField(term944116, term944116.getClass(), "plateEffectId", 0);
        setField(term944116, term944116.getClass(), "passwordStatus", null);
        setField(term944116, term944116.getClass(), "password", null);
        setBooleanField(term944116, term944116.getClass(), "preferPerPvModule", false);
        setBooleanField(term944116, term944116.getClass(), "preferCommonModule", false);
        setBooleanField(term944116, term944116.getClass(), "usePerPvSkin", false);
        setBooleanField(term944116, term944116.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944116, term944116.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944116, term944116.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944116, term944116.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944116, term944116.getClass(), "commonModule", null);
        setField(term944116, term944116.getClass(), "commonCustomizeItems", null);
        setField(term944116, term944116.getClass(), "commonModuleSetTime", null);
        setField(term944116, term944116.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944116, term944116.getClass(), "commonSkin", 0);
        setIntField(term944116, term944116.getClass(), "headphoneVolume", 0);
        setBooleanField(term944116, term944116.getClass(), "buttonSeOn", false);
        setIntField(term944116, term944116.getClass(), "buttonSeVolume", 0);
        setIntField(term944116, term944116.getClass(), "sliderSeVolume", 0);
        setIntField(term944116, term944116.getClass(), "buttonSe", 0);
        setIntField(term944116, term944116.getClass(), "chainSlideSe", 0);
        setIntField(term944116, term944116.getClass(), "slideSe", 0);
        setIntField(term944116, term944116.getClass(), "sliderTouchSe", 0);
        setField(term944116, term944116.getClass(), "sortMode", null);
        setIntField(term944116, term944116.getClass(), "nextPvId", 0);
        setField(term944116, term944116.getClass(), "nextDifficulty", null);
        setField(term944116, term944116.getClass(), "nextEdition", null);
        setBooleanField(term944116, term944116.getClass(), "showInterimRanking", false);
        setBooleanField(term944116, term944116.getClass(), "showClearStatus", false);
        setBooleanField(term944116, term944116.getClass(), "showGreatBorder", false);
        setBooleanField(term944116, term944116.getClass(), "showExcellentBorder", false);
        setBooleanField(term944116, term944116.getClass(), "showRivalBorder", false);
        setBooleanField(term944116, term944116.getClass(), "showRgoSetting", false);
        setBooleanField(term944116, term944116.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944116, term944116.getClass(), "contestNowPlayingId", 0);
        setIntField(term944116, term944116.getClass(), "contestNowPlayingValue", 0);
        setField(term944116, term944116.getClass(), "contestNowPlayingResultRank", null);
        setField(term944116, term944116.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944116, term944116.getClass(), "myList0", null);
        setField(term944116, term944116.getClass(), "myList1", null);
        setField(term944116, term944116.getClass(), "myList2", null);
        setIntField(term944116, term944116.getClass(), "rivalPdId", 0);
        term944151 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term944151;
        callMethod(klass, "setCommonSkin", argTypes, term944116, args);
    }

};


