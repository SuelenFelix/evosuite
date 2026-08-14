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

public class PlayerProfile_setUsePerPvSliderSe_938720271174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916710;
     Object term4916745;

    public PlayerProfile_setUsePerPvSliderSe_938720271174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916710 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916710, term4916710.getClass(), "id", 0L);
        setIntField(term4916710, term4916710.getClass(), "pdId", 0);
        setField(term4916710, term4916710.getClass(), "playerName", null);
        setIntField(term4916710, term4916710.getClass(), "vocaloidPoints", 0);
        setIntField(term4916710, term4916710.getClass(), "level", 0);
        setIntField(term4916710, term4916710.getClass(), "levelExp", 0);
        setField(term4916710, term4916710.getClass(), "levelTitle", null);
        setIntField(term4916710, term4916710.getClass(), "plateId", 0);
        setIntField(term4916710, term4916710.getClass(), "plateEffectId", 0);
        setField(term4916710, term4916710.getClass(), "passwordStatus", null);
        setField(term4916710, term4916710.getClass(), "password", null);
        setBooleanField(term4916710, term4916710.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916710, term4916710.getClass(), "preferCommonModule", false);
        setBooleanField(term4916710, term4916710.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916710, term4916710.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916710, term4916710.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916710, term4916710.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916710, term4916710.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916710, term4916710.getClass(), "commonModule", null);
        setField(term4916710, term4916710.getClass(), "commonCustomizeItems", null);
        setField(term4916710, term4916710.getClass(), "commonModuleSetTime", null);
        setField(term4916710, term4916710.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916710, term4916710.getClass(), "commonSkin", 0);
        setIntField(term4916710, term4916710.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916710, term4916710.getClass(), "buttonSeOn", false);
        setIntField(term4916710, term4916710.getClass(), "buttonSeVolume", 0);
        setIntField(term4916710, term4916710.getClass(), "sliderSeVolume", 0);
        setIntField(term4916710, term4916710.getClass(), "buttonSe", 0);
        setIntField(term4916710, term4916710.getClass(), "chainSlideSe", 0);
        setIntField(term4916710, term4916710.getClass(), "slideSe", 0);
        setIntField(term4916710, term4916710.getClass(), "sliderTouchSe", 0);
        setField(term4916710, term4916710.getClass(), "sortMode", null);
        setIntField(term4916710, term4916710.getClass(), "nextPvId", 0);
        setField(term4916710, term4916710.getClass(), "nextDifficulty", null);
        setField(term4916710, term4916710.getClass(), "nextEdition", null);
        setBooleanField(term4916710, term4916710.getClass(), "showInterimRanking", false);
        setBooleanField(term4916710, term4916710.getClass(), "showClearStatus", false);
        setBooleanField(term4916710, term4916710.getClass(), "showGreatBorder", false);
        setBooleanField(term4916710, term4916710.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916710, term4916710.getClass(), "showRivalBorder", false);
        setBooleanField(term4916710, term4916710.getClass(), "showRgoSetting", false);
        setBooleanField(term4916710, term4916710.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916710, term4916710.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916710, term4916710.getClass(), "contestNowPlayingValue", 0);
        setField(term4916710, term4916710.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916710, term4916710.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916710, term4916710.getClass(), "myList0", null);
        setField(term4916710, term4916710.getClass(), "myList1", null);
        setField(term4916710, term4916710.getClass(), "myList2", null);
        setIntField(term4916710, term4916710.getClass(), "rivalPdId", 0);
        term4916745 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4916745;
        callMethod(klass, "setUsePerPvSliderSe", argTypes, term4916710, args);
    }

};


