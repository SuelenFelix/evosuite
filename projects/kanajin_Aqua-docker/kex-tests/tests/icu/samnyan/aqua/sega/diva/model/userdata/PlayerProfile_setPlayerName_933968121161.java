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

public class PlayerProfile_setPlayerName_933968121161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916237;

    public PlayerProfile_setPlayerName_933968121161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916237 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916237, term4916237.getClass(), "id", 0L);
        setIntField(term4916237, term4916237.getClass(), "pdId", 0);
        setField(term4916237, term4916237.getClass(), "playerName", null);
        setIntField(term4916237, term4916237.getClass(), "vocaloidPoints", 0);
        setIntField(term4916237, term4916237.getClass(), "level", 0);
        setIntField(term4916237, term4916237.getClass(), "levelExp", 0);
        setField(term4916237, term4916237.getClass(), "levelTitle", null);
        setIntField(term4916237, term4916237.getClass(), "plateId", 0);
        setIntField(term4916237, term4916237.getClass(), "plateEffectId", 0);
        setField(term4916237, term4916237.getClass(), "passwordStatus", null);
        setField(term4916237, term4916237.getClass(), "password", null);
        setBooleanField(term4916237, term4916237.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916237, term4916237.getClass(), "preferCommonModule", false);
        setBooleanField(term4916237, term4916237.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916237, term4916237.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916237, term4916237.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916237, term4916237.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916237, term4916237.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916237, term4916237.getClass(), "commonModule", null);
        setField(term4916237, term4916237.getClass(), "commonCustomizeItems", null);
        setField(term4916237, term4916237.getClass(), "commonModuleSetTime", null);
        setField(term4916237, term4916237.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916237, term4916237.getClass(), "commonSkin", 0);
        setIntField(term4916237, term4916237.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916237, term4916237.getClass(), "buttonSeOn", false);
        setIntField(term4916237, term4916237.getClass(), "buttonSeVolume", 0);
        setIntField(term4916237, term4916237.getClass(), "sliderSeVolume", 0);
        setIntField(term4916237, term4916237.getClass(), "buttonSe", 0);
        setIntField(term4916237, term4916237.getClass(), "chainSlideSe", 0);
        setIntField(term4916237, term4916237.getClass(), "slideSe", 0);
        setIntField(term4916237, term4916237.getClass(), "sliderTouchSe", 0);
        setField(term4916237, term4916237.getClass(), "sortMode", null);
        setIntField(term4916237, term4916237.getClass(), "nextPvId", 0);
        setField(term4916237, term4916237.getClass(), "nextDifficulty", null);
        setField(term4916237, term4916237.getClass(), "nextEdition", null);
        setBooleanField(term4916237, term4916237.getClass(), "showInterimRanking", false);
        setBooleanField(term4916237, term4916237.getClass(), "showClearStatus", false);
        setBooleanField(term4916237, term4916237.getClass(), "showGreatBorder", false);
        setBooleanField(term4916237, term4916237.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916237, term4916237.getClass(), "showRivalBorder", false);
        setBooleanField(term4916237, term4916237.getClass(), "showRgoSetting", false);
        setBooleanField(term4916237, term4916237.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916237, term4916237.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916237, term4916237.getClass(), "contestNowPlayingValue", 0);
        setField(term4916237, term4916237.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916237, term4916237.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916237, term4916237.getClass(), "myList0", null);
        setField(term4916237, term4916237.getClass(), "myList1", null);
        setField(term4916237, term4916237.getClass(), "myList2", null);
        setIntField(term4916237, term4916237.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlayerName", argTypes, term4916237, args);
    }

};


