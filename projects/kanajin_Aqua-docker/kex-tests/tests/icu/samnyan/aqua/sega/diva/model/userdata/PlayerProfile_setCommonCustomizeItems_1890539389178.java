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

public class PlayerProfile_setCommonCustomizeItems_1890539389178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916856;

    public PlayerProfile_setCommonCustomizeItems_1890539389178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916856 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916856, term4916856.getClass(), "id", 0L);
        setIntField(term4916856, term4916856.getClass(), "pdId", 0);
        setField(term4916856, term4916856.getClass(), "playerName", null);
        setIntField(term4916856, term4916856.getClass(), "vocaloidPoints", 0);
        setIntField(term4916856, term4916856.getClass(), "level", 0);
        setIntField(term4916856, term4916856.getClass(), "levelExp", 0);
        setField(term4916856, term4916856.getClass(), "levelTitle", null);
        setIntField(term4916856, term4916856.getClass(), "plateId", 0);
        setIntField(term4916856, term4916856.getClass(), "plateEffectId", 0);
        setField(term4916856, term4916856.getClass(), "passwordStatus", null);
        setField(term4916856, term4916856.getClass(), "password", null);
        setBooleanField(term4916856, term4916856.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916856, term4916856.getClass(), "preferCommonModule", false);
        setBooleanField(term4916856, term4916856.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916856, term4916856.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916856, term4916856.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916856, term4916856.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916856, term4916856.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916856, term4916856.getClass(), "commonModule", null);
        setField(term4916856, term4916856.getClass(), "commonCustomizeItems", null);
        setField(term4916856, term4916856.getClass(), "commonModuleSetTime", null);
        setField(term4916856, term4916856.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916856, term4916856.getClass(), "commonSkin", 0);
        setIntField(term4916856, term4916856.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916856, term4916856.getClass(), "buttonSeOn", false);
        setIntField(term4916856, term4916856.getClass(), "buttonSeVolume", 0);
        setIntField(term4916856, term4916856.getClass(), "sliderSeVolume", 0);
        setIntField(term4916856, term4916856.getClass(), "buttonSe", 0);
        setIntField(term4916856, term4916856.getClass(), "chainSlideSe", 0);
        setIntField(term4916856, term4916856.getClass(), "slideSe", 0);
        setIntField(term4916856, term4916856.getClass(), "sliderTouchSe", 0);
        setField(term4916856, term4916856.getClass(), "sortMode", null);
        setIntField(term4916856, term4916856.getClass(), "nextPvId", 0);
        setField(term4916856, term4916856.getClass(), "nextDifficulty", null);
        setField(term4916856, term4916856.getClass(), "nextEdition", null);
        setBooleanField(term4916856, term4916856.getClass(), "showInterimRanking", false);
        setBooleanField(term4916856, term4916856.getClass(), "showClearStatus", false);
        setBooleanField(term4916856, term4916856.getClass(), "showGreatBorder", false);
        setBooleanField(term4916856, term4916856.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916856, term4916856.getClass(), "showRivalBorder", false);
        setBooleanField(term4916856, term4916856.getClass(), "showRgoSetting", false);
        setBooleanField(term4916856, term4916856.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916856, term4916856.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916856, term4916856.getClass(), "contestNowPlayingValue", 0);
        setField(term4916856, term4916856.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916856, term4916856.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916856, term4916856.getClass(), "myList0", null);
        setField(term4916856, term4916856.getClass(), "myList1", null);
        setField(term4916856, term4916856.getClass(), "myList2", null);
        setIntField(term4916856, term4916856.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCommonCustomizeItems", argTypes, term4916856, args);
    }

};


