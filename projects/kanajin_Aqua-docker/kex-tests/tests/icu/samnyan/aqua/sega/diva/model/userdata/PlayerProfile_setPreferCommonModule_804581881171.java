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

public class PlayerProfile_setPreferCommonModule_804581881171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916599;
     Object term4916634;

    public PlayerProfile_setPreferCommonModule_804581881171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916599 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916599, term4916599.getClass(), "id", 0L);
        setIntField(term4916599, term4916599.getClass(), "pdId", 0);
        setField(term4916599, term4916599.getClass(), "playerName", null);
        setIntField(term4916599, term4916599.getClass(), "vocaloidPoints", 0);
        setIntField(term4916599, term4916599.getClass(), "level", 0);
        setIntField(term4916599, term4916599.getClass(), "levelExp", 0);
        setField(term4916599, term4916599.getClass(), "levelTitle", null);
        setIntField(term4916599, term4916599.getClass(), "plateId", 0);
        setIntField(term4916599, term4916599.getClass(), "plateEffectId", 0);
        setField(term4916599, term4916599.getClass(), "passwordStatus", null);
        setField(term4916599, term4916599.getClass(), "password", null);
        setBooleanField(term4916599, term4916599.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916599, term4916599.getClass(), "preferCommonModule", false);
        setBooleanField(term4916599, term4916599.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916599, term4916599.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916599, term4916599.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916599, term4916599.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916599, term4916599.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916599, term4916599.getClass(), "commonModule", null);
        setField(term4916599, term4916599.getClass(), "commonCustomizeItems", null);
        setField(term4916599, term4916599.getClass(), "commonModuleSetTime", null);
        setField(term4916599, term4916599.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916599, term4916599.getClass(), "commonSkin", 0);
        setIntField(term4916599, term4916599.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916599, term4916599.getClass(), "buttonSeOn", false);
        setIntField(term4916599, term4916599.getClass(), "buttonSeVolume", 0);
        setIntField(term4916599, term4916599.getClass(), "sliderSeVolume", 0);
        setIntField(term4916599, term4916599.getClass(), "buttonSe", 0);
        setIntField(term4916599, term4916599.getClass(), "chainSlideSe", 0);
        setIntField(term4916599, term4916599.getClass(), "slideSe", 0);
        setIntField(term4916599, term4916599.getClass(), "sliderTouchSe", 0);
        setField(term4916599, term4916599.getClass(), "sortMode", null);
        setIntField(term4916599, term4916599.getClass(), "nextPvId", 0);
        setField(term4916599, term4916599.getClass(), "nextDifficulty", null);
        setField(term4916599, term4916599.getClass(), "nextEdition", null);
        setBooleanField(term4916599, term4916599.getClass(), "showInterimRanking", false);
        setBooleanField(term4916599, term4916599.getClass(), "showClearStatus", false);
        setBooleanField(term4916599, term4916599.getClass(), "showGreatBorder", false);
        setBooleanField(term4916599, term4916599.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916599, term4916599.getClass(), "showRivalBorder", false);
        setBooleanField(term4916599, term4916599.getClass(), "showRgoSetting", false);
        setBooleanField(term4916599, term4916599.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916599, term4916599.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916599, term4916599.getClass(), "contestNowPlayingValue", 0);
        setField(term4916599, term4916599.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916599, term4916599.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916599, term4916599.getClass(), "myList0", null);
        setField(term4916599, term4916599.getClass(), "myList1", null);
        setField(term4916599, term4916599.getClass(), "myList2", null);
        setIntField(term4916599, term4916599.getClass(), "rivalPdId", 0);
        term4916634 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4916634;
        callMethod(klass, "setPreferCommonModule", argTypes, term4916599, args);
    }

};


