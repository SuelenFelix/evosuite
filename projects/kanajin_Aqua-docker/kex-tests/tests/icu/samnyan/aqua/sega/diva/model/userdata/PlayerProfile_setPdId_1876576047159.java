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

public class PlayerProfile_setPdId_1876576047159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943355;
     Object term943390;

    public PlayerProfile_setPdId_1876576047159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943355 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943355, term943355.getClass(), "id", 0L);
        setIntField(term943355, term943355.getClass(), "pdId", 0);
        setField(term943355, term943355.getClass(), "playerName", null);
        setIntField(term943355, term943355.getClass(), "vocaloidPoints", 0);
        setIntField(term943355, term943355.getClass(), "level", 0);
        setIntField(term943355, term943355.getClass(), "levelExp", 0);
        setField(term943355, term943355.getClass(), "levelTitle", null);
        setIntField(term943355, term943355.getClass(), "plateId", 0);
        setIntField(term943355, term943355.getClass(), "plateEffectId", 0);
        setField(term943355, term943355.getClass(), "passwordStatus", null);
        setField(term943355, term943355.getClass(), "password", null);
        setBooleanField(term943355, term943355.getClass(), "preferPerPvModule", false);
        setBooleanField(term943355, term943355.getClass(), "preferCommonModule", false);
        setBooleanField(term943355, term943355.getClass(), "usePerPvSkin", false);
        setBooleanField(term943355, term943355.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943355, term943355.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943355, term943355.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943355, term943355.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943355, term943355.getClass(), "commonModule", null);
        setField(term943355, term943355.getClass(), "commonCustomizeItems", null);
        setField(term943355, term943355.getClass(), "commonModuleSetTime", null);
        setField(term943355, term943355.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943355, term943355.getClass(), "commonSkin", 0);
        setIntField(term943355, term943355.getClass(), "headphoneVolume", 0);
        setBooleanField(term943355, term943355.getClass(), "buttonSeOn", false);
        setIntField(term943355, term943355.getClass(), "buttonSeVolume", 0);
        setIntField(term943355, term943355.getClass(), "sliderSeVolume", 0);
        setIntField(term943355, term943355.getClass(), "buttonSe", 0);
        setIntField(term943355, term943355.getClass(), "chainSlideSe", 0);
        setIntField(term943355, term943355.getClass(), "slideSe", 0);
        setIntField(term943355, term943355.getClass(), "sliderTouchSe", 0);
        setField(term943355, term943355.getClass(), "sortMode", null);
        setIntField(term943355, term943355.getClass(), "nextPvId", 0);
        setField(term943355, term943355.getClass(), "nextDifficulty", null);
        setField(term943355, term943355.getClass(), "nextEdition", null);
        setBooleanField(term943355, term943355.getClass(), "showInterimRanking", false);
        setBooleanField(term943355, term943355.getClass(), "showClearStatus", false);
        setBooleanField(term943355, term943355.getClass(), "showGreatBorder", false);
        setBooleanField(term943355, term943355.getClass(), "showExcellentBorder", false);
        setBooleanField(term943355, term943355.getClass(), "showRivalBorder", false);
        setBooleanField(term943355, term943355.getClass(), "showRgoSetting", false);
        setBooleanField(term943355, term943355.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943355, term943355.getClass(), "contestNowPlayingId", 0);
        setIntField(term943355, term943355.getClass(), "contestNowPlayingValue", 0);
        setField(term943355, term943355.getClass(), "contestNowPlayingResultRank", null);
        setField(term943355, term943355.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943355, term943355.getClass(), "myList0", null);
        setField(term943355, term943355.getClass(), "myList1", null);
        setField(term943355, term943355.getClass(), "myList2", null);
        setIntField(term943355, term943355.getClass(), "rivalPdId", 0);
        term943390 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term943390;
        callMethod(klass, "setPdId", argTypes, term943355, args);
    }

};


