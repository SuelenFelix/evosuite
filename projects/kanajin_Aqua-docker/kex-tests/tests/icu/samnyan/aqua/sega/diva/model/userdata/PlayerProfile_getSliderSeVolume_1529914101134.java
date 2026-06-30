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

public class PlayerProfile_getSliderSeVolume_1529914101134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942478;

    public PlayerProfile_getSliderSeVolume_1529914101134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942478 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942478, term942478.getClass(), "id", 0L);
        setIntField(term942478, term942478.getClass(), "pdId", 0);
        setField(term942478, term942478.getClass(), "playerName", null);
        setIntField(term942478, term942478.getClass(), "vocaloidPoints", 0);
        setIntField(term942478, term942478.getClass(), "level", 0);
        setIntField(term942478, term942478.getClass(), "levelExp", 0);
        setField(term942478, term942478.getClass(), "levelTitle", null);
        setIntField(term942478, term942478.getClass(), "plateId", 0);
        setIntField(term942478, term942478.getClass(), "plateEffectId", 0);
        setField(term942478, term942478.getClass(), "passwordStatus", null);
        setField(term942478, term942478.getClass(), "password", null);
        setBooleanField(term942478, term942478.getClass(), "preferPerPvModule", false);
        setBooleanField(term942478, term942478.getClass(), "preferCommonModule", false);
        setBooleanField(term942478, term942478.getClass(), "usePerPvSkin", false);
        setBooleanField(term942478, term942478.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942478, term942478.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942478, term942478.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942478, term942478.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942478, term942478.getClass(), "commonModule", null);
        setField(term942478, term942478.getClass(), "commonCustomizeItems", null);
        setField(term942478, term942478.getClass(), "commonModuleSetTime", null);
        setField(term942478, term942478.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942478, term942478.getClass(), "commonSkin", 0);
        setIntField(term942478, term942478.getClass(), "headphoneVolume", 0);
        setBooleanField(term942478, term942478.getClass(), "buttonSeOn", false);
        setIntField(term942478, term942478.getClass(), "buttonSeVolume", 0);
        setIntField(term942478, term942478.getClass(), "sliderSeVolume", 0);
        setIntField(term942478, term942478.getClass(), "buttonSe", 0);
        setIntField(term942478, term942478.getClass(), "chainSlideSe", 0);
        setIntField(term942478, term942478.getClass(), "slideSe", 0);
        setIntField(term942478, term942478.getClass(), "sliderTouchSe", 0);
        setField(term942478, term942478.getClass(), "sortMode", null);
        setIntField(term942478, term942478.getClass(), "nextPvId", 0);
        setField(term942478, term942478.getClass(), "nextDifficulty", null);
        setField(term942478, term942478.getClass(), "nextEdition", null);
        setBooleanField(term942478, term942478.getClass(), "showInterimRanking", false);
        setBooleanField(term942478, term942478.getClass(), "showClearStatus", false);
        setBooleanField(term942478, term942478.getClass(), "showGreatBorder", false);
        setBooleanField(term942478, term942478.getClass(), "showExcellentBorder", false);
        setBooleanField(term942478, term942478.getClass(), "showRivalBorder", false);
        setBooleanField(term942478, term942478.getClass(), "showRgoSetting", false);
        setBooleanField(term942478, term942478.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942478, term942478.getClass(), "contestNowPlayingId", 0);
        setIntField(term942478, term942478.getClass(), "contestNowPlayingValue", 0);
        setField(term942478, term942478.getClass(), "contestNowPlayingResultRank", null);
        setField(term942478, term942478.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942478, term942478.getClass(), "myList0", null);
        setField(term942478, term942478.getClass(), "myList1", null);
        setField(term942478, term942478.getClass(), "myList2", null);
        setIntField(term942478, term942478.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderSeVolume", argTypes, term942478, args);
    }

};


