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
import java.lang.Boolean;

public class PlayerProfile_setUsePerPvSliderSe_938720271173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943865;
     Object term943900;

    public PlayerProfile_setUsePerPvSliderSe_938720271173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943865 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943865, term943865.getClass(), "id", 0L);
        setIntField(term943865, term943865.getClass(), "pdId", 0);
        setField(term943865, term943865.getClass(), "playerName", null);
        setIntField(term943865, term943865.getClass(), "vocaloidPoints", 0);
        setIntField(term943865, term943865.getClass(), "level", 0);
        setIntField(term943865, term943865.getClass(), "levelExp", 0);
        setField(term943865, term943865.getClass(), "levelTitle", null);
        setIntField(term943865, term943865.getClass(), "plateId", 0);
        setIntField(term943865, term943865.getClass(), "plateEffectId", 0);
        setField(term943865, term943865.getClass(), "passwordStatus", null);
        setField(term943865, term943865.getClass(), "password", null);
        setBooleanField(term943865, term943865.getClass(), "preferPerPvModule", false);
        setBooleanField(term943865, term943865.getClass(), "preferCommonModule", false);
        setBooleanField(term943865, term943865.getClass(), "usePerPvSkin", false);
        setBooleanField(term943865, term943865.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943865, term943865.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943865, term943865.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943865, term943865.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943865, term943865.getClass(), "commonModule", null);
        setField(term943865, term943865.getClass(), "commonCustomizeItems", null);
        setField(term943865, term943865.getClass(), "commonModuleSetTime", null);
        setField(term943865, term943865.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943865, term943865.getClass(), "commonSkin", 0);
        setIntField(term943865, term943865.getClass(), "headphoneVolume", 0);
        setBooleanField(term943865, term943865.getClass(), "buttonSeOn", false);
        setIntField(term943865, term943865.getClass(), "buttonSeVolume", 0);
        setIntField(term943865, term943865.getClass(), "sliderSeVolume", 0);
        setIntField(term943865, term943865.getClass(), "buttonSe", 0);
        setIntField(term943865, term943865.getClass(), "chainSlideSe", 0);
        setIntField(term943865, term943865.getClass(), "slideSe", 0);
        setIntField(term943865, term943865.getClass(), "sliderTouchSe", 0);
        setField(term943865, term943865.getClass(), "sortMode", null);
        setIntField(term943865, term943865.getClass(), "nextPvId", 0);
        setField(term943865, term943865.getClass(), "nextDifficulty", null);
        setField(term943865, term943865.getClass(), "nextEdition", null);
        setBooleanField(term943865, term943865.getClass(), "showInterimRanking", false);
        setBooleanField(term943865, term943865.getClass(), "showClearStatus", false);
        setBooleanField(term943865, term943865.getClass(), "showGreatBorder", false);
        setBooleanField(term943865, term943865.getClass(), "showExcellentBorder", false);
        setBooleanField(term943865, term943865.getClass(), "showRivalBorder", false);
        setBooleanField(term943865, term943865.getClass(), "showRgoSetting", false);
        setBooleanField(term943865, term943865.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943865, term943865.getClass(), "contestNowPlayingId", 0);
        setIntField(term943865, term943865.getClass(), "contestNowPlayingValue", 0);
        setField(term943865, term943865.getClass(), "contestNowPlayingResultRank", null);
        setField(term943865, term943865.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943865, term943865.getClass(), "myList0", null);
        setField(term943865, term943865.getClass(), "myList1", null);
        setField(term943865, term943865.getClass(), "myList2", null);
        setIntField(term943865, term943865.getClass(), "rivalPdId", 0);
        term943900 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term943900;
        callMethod(klass, "setUsePerPvSliderSe", argTypes, term943865, args);
    }

};


