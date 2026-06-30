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

public class PlayerProfile_setMyList2_1310407743206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term945064;

    public PlayerProfile_setMyList2_1310407743206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term945064 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term945064, term945064.getClass(), "id", 0L);
        setIntField(term945064, term945064.getClass(), "pdId", 0);
        setField(term945064, term945064.getClass(), "playerName", null);
        setIntField(term945064, term945064.getClass(), "vocaloidPoints", 0);
        setIntField(term945064, term945064.getClass(), "level", 0);
        setIntField(term945064, term945064.getClass(), "levelExp", 0);
        setField(term945064, term945064.getClass(), "levelTitle", null);
        setIntField(term945064, term945064.getClass(), "plateId", 0);
        setIntField(term945064, term945064.getClass(), "plateEffectId", 0);
        setField(term945064, term945064.getClass(), "passwordStatus", null);
        setField(term945064, term945064.getClass(), "password", null);
        setBooleanField(term945064, term945064.getClass(), "preferPerPvModule", false);
        setBooleanField(term945064, term945064.getClass(), "preferCommonModule", false);
        setBooleanField(term945064, term945064.getClass(), "usePerPvSkin", false);
        setBooleanField(term945064, term945064.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term945064, term945064.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term945064, term945064.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term945064, term945064.getClass(), "usePerPvTouchSliderSe", false);
        setField(term945064, term945064.getClass(), "commonModule", null);
        setField(term945064, term945064.getClass(), "commonCustomizeItems", null);
        setField(term945064, term945064.getClass(), "commonModuleSetTime", null);
        setField(term945064, term945064.getClass(), "moduleSelectItemFlag", null);
        setIntField(term945064, term945064.getClass(), "commonSkin", 0);
        setIntField(term945064, term945064.getClass(), "headphoneVolume", 0);
        setBooleanField(term945064, term945064.getClass(), "buttonSeOn", false);
        setIntField(term945064, term945064.getClass(), "buttonSeVolume", 0);
        setIntField(term945064, term945064.getClass(), "sliderSeVolume", 0);
        setIntField(term945064, term945064.getClass(), "buttonSe", 0);
        setIntField(term945064, term945064.getClass(), "chainSlideSe", 0);
        setIntField(term945064, term945064.getClass(), "slideSe", 0);
        setIntField(term945064, term945064.getClass(), "sliderTouchSe", 0);
        setField(term945064, term945064.getClass(), "sortMode", null);
        setIntField(term945064, term945064.getClass(), "nextPvId", 0);
        setField(term945064, term945064.getClass(), "nextDifficulty", null);
        setField(term945064, term945064.getClass(), "nextEdition", null);
        setBooleanField(term945064, term945064.getClass(), "showInterimRanking", false);
        setBooleanField(term945064, term945064.getClass(), "showClearStatus", false);
        setBooleanField(term945064, term945064.getClass(), "showGreatBorder", false);
        setBooleanField(term945064, term945064.getClass(), "showExcellentBorder", false);
        setBooleanField(term945064, term945064.getClass(), "showRivalBorder", false);
        setBooleanField(term945064, term945064.getClass(), "showRgoSetting", false);
        setBooleanField(term945064, term945064.getClass(), "contestNowPlayingEnable", false);
        setIntField(term945064, term945064.getClass(), "contestNowPlayingId", 0);
        setIntField(term945064, term945064.getClass(), "contestNowPlayingValue", 0);
        setField(term945064, term945064.getClass(), "contestNowPlayingResultRank", null);
        setField(term945064, term945064.getClass(), "contestNowPlayingSpecifier", null);
        setField(term945064, term945064.getClass(), "myList0", null);
        setField(term945064, term945064.getClass(), "myList1", null);
        setField(term945064, term945064.getClass(), "myList2", null);
        setIntField(term945064, term945064.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMyList2", argTypes, term945064, args);
    }

};


