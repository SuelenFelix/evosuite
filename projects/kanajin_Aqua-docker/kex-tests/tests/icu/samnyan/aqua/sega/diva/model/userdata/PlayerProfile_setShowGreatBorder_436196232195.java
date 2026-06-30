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

public class PlayerProfile_setShowGreatBorder_436196232195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term944665;
     Object term944700;

    public PlayerProfile_setShowGreatBorder_436196232195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term944665 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term944665, term944665.getClass(), "id", 0L);
        setIntField(term944665, term944665.getClass(), "pdId", 0);
        setField(term944665, term944665.getClass(), "playerName", null);
        setIntField(term944665, term944665.getClass(), "vocaloidPoints", 0);
        setIntField(term944665, term944665.getClass(), "level", 0);
        setIntField(term944665, term944665.getClass(), "levelExp", 0);
        setField(term944665, term944665.getClass(), "levelTitle", null);
        setIntField(term944665, term944665.getClass(), "plateId", 0);
        setIntField(term944665, term944665.getClass(), "plateEffectId", 0);
        setField(term944665, term944665.getClass(), "passwordStatus", null);
        setField(term944665, term944665.getClass(), "password", null);
        setBooleanField(term944665, term944665.getClass(), "preferPerPvModule", false);
        setBooleanField(term944665, term944665.getClass(), "preferCommonModule", false);
        setBooleanField(term944665, term944665.getClass(), "usePerPvSkin", false);
        setBooleanField(term944665, term944665.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term944665, term944665.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term944665, term944665.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term944665, term944665.getClass(), "usePerPvTouchSliderSe", false);
        setField(term944665, term944665.getClass(), "commonModule", null);
        setField(term944665, term944665.getClass(), "commonCustomizeItems", null);
        setField(term944665, term944665.getClass(), "commonModuleSetTime", null);
        setField(term944665, term944665.getClass(), "moduleSelectItemFlag", null);
        setIntField(term944665, term944665.getClass(), "commonSkin", 0);
        setIntField(term944665, term944665.getClass(), "headphoneVolume", 0);
        setBooleanField(term944665, term944665.getClass(), "buttonSeOn", false);
        setIntField(term944665, term944665.getClass(), "buttonSeVolume", 0);
        setIntField(term944665, term944665.getClass(), "sliderSeVolume", 0);
        setIntField(term944665, term944665.getClass(), "buttonSe", 0);
        setIntField(term944665, term944665.getClass(), "chainSlideSe", 0);
        setIntField(term944665, term944665.getClass(), "slideSe", 0);
        setIntField(term944665, term944665.getClass(), "sliderTouchSe", 0);
        setField(term944665, term944665.getClass(), "sortMode", null);
        setIntField(term944665, term944665.getClass(), "nextPvId", 0);
        setField(term944665, term944665.getClass(), "nextDifficulty", null);
        setField(term944665, term944665.getClass(), "nextEdition", null);
        setBooleanField(term944665, term944665.getClass(), "showInterimRanking", false);
        setBooleanField(term944665, term944665.getClass(), "showClearStatus", false);
        setBooleanField(term944665, term944665.getClass(), "showGreatBorder", false);
        setBooleanField(term944665, term944665.getClass(), "showExcellentBorder", false);
        setBooleanField(term944665, term944665.getClass(), "showRivalBorder", false);
        setBooleanField(term944665, term944665.getClass(), "showRgoSetting", false);
        setBooleanField(term944665, term944665.getClass(), "contestNowPlayingEnable", false);
        setIntField(term944665, term944665.getClass(), "contestNowPlayingId", 0);
        setIntField(term944665, term944665.getClass(), "contestNowPlayingValue", 0);
        setField(term944665, term944665.getClass(), "contestNowPlayingResultRank", null);
        setField(term944665, term944665.getClass(), "contestNowPlayingSpecifier", null);
        setField(term944665, term944665.getClass(), "myList0", null);
        setField(term944665, term944665.getClass(), "myList1", null);
        setField(term944665, term944665.getClass(), "myList2", null);
        setIntField(term944665, term944665.getClass(), "rivalPdId", 0);
        term944700 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term944700;
        callMethod(klass, "setShowGreatBorder", argTypes, term944665, args);
    }

};


