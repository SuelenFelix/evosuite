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

public class PlayerProfile_getPlayerName_515753007111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4914483;

    public PlayerProfile_getPlayerName_515753007111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4914483 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4914483, term4914483.getClass(), "id", 0L);
        setIntField(term4914483, term4914483.getClass(), "pdId", 0);
        setField(term4914483, term4914483.getClass(), "playerName", null);
        setIntField(term4914483, term4914483.getClass(), "vocaloidPoints", 0);
        setIntField(term4914483, term4914483.getClass(), "level", 0);
        setIntField(term4914483, term4914483.getClass(), "levelExp", 0);
        setField(term4914483, term4914483.getClass(), "levelTitle", null);
        setIntField(term4914483, term4914483.getClass(), "plateId", 0);
        setIntField(term4914483, term4914483.getClass(), "plateEffectId", 0);
        setField(term4914483, term4914483.getClass(), "passwordStatus", null);
        setField(term4914483, term4914483.getClass(), "password", null);
        setBooleanField(term4914483, term4914483.getClass(), "preferPerPvModule", false);
        setBooleanField(term4914483, term4914483.getClass(), "preferCommonModule", false);
        setBooleanField(term4914483, term4914483.getClass(), "usePerPvSkin", false);
        setBooleanField(term4914483, term4914483.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4914483, term4914483.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4914483, term4914483.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4914483, term4914483.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4914483, term4914483.getClass(), "commonModule", null);
        setField(term4914483, term4914483.getClass(), "commonCustomizeItems", null);
        setField(term4914483, term4914483.getClass(), "commonModuleSetTime", null);
        setField(term4914483, term4914483.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4914483, term4914483.getClass(), "commonSkin", 0);
        setIntField(term4914483, term4914483.getClass(), "headphoneVolume", 0);
        setBooleanField(term4914483, term4914483.getClass(), "buttonSeOn", false);
        setIntField(term4914483, term4914483.getClass(), "buttonSeVolume", 0);
        setIntField(term4914483, term4914483.getClass(), "sliderSeVolume", 0);
        setIntField(term4914483, term4914483.getClass(), "buttonSe", 0);
        setIntField(term4914483, term4914483.getClass(), "chainSlideSe", 0);
        setIntField(term4914483, term4914483.getClass(), "slideSe", 0);
        setIntField(term4914483, term4914483.getClass(), "sliderTouchSe", 0);
        setField(term4914483, term4914483.getClass(), "sortMode", null);
        setIntField(term4914483, term4914483.getClass(), "nextPvId", 0);
        setField(term4914483, term4914483.getClass(), "nextDifficulty", null);
        setField(term4914483, term4914483.getClass(), "nextEdition", null);
        setBooleanField(term4914483, term4914483.getClass(), "showInterimRanking", false);
        setBooleanField(term4914483, term4914483.getClass(), "showClearStatus", false);
        setBooleanField(term4914483, term4914483.getClass(), "showGreatBorder", false);
        setBooleanField(term4914483, term4914483.getClass(), "showExcellentBorder", false);
        setBooleanField(term4914483, term4914483.getClass(), "showRivalBorder", false);
        setBooleanField(term4914483, term4914483.getClass(), "showRgoSetting", false);
        setBooleanField(term4914483, term4914483.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4914483, term4914483.getClass(), "contestNowPlayingId", 0);
        setIntField(term4914483, term4914483.getClass(), "contestNowPlayingValue", 0);
        setField(term4914483, term4914483.getClass(), "contestNowPlayingResultRank", null);
        setField(term4914483, term4914483.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4914483, term4914483.getClass(), "myList0", null);
        setField(term4914483, term4914483.getClass(), "myList1", null);
        setField(term4914483, term4914483.getClass(), "myList2", null);
        setIntField(term4914483, term4914483.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerName", argTypes, term4914483, args);
    }

};


