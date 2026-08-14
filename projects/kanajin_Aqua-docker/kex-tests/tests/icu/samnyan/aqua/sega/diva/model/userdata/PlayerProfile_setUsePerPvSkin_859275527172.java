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

public class PlayerProfile_setUsePerPvSkin_859275527172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916636;
     Object term4916671;

    public PlayerProfile_setUsePerPvSkin_859275527172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916636 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916636, term4916636.getClass(), "id", 0L);
        setIntField(term4916636, term4916636.getClass(), "pdId", 0);
        setField(term4916636, term4916636.getClass(), "playerName", null);
        setIntField(term4916636, term4916636.getClass(), "vocaloidPoints", 0);
        setIntField(term4916636, term4916636.getClass(), "level", 0);
        setIntField(term4916636, term4916636.getClass(), "levelExp", 0);
        setField(term4916636, term4916636.getClass(), "levelTitle", null);
        setIntField(term4916636, term4916636.getClass(), "plateId", 0);
        setIntField(term4916636, term4916636.getClass(), "plateEffectId", 0);
        setField(term4916636, term4916636.getClass(), "passwordStatus", null);
        setField(term4916636, term4916636.getClass(), "password", null);
        setBooleanField(term4916636, term4916636.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916636, term4916636.getClass(), "preferCommonModule", false);
        setBooleanField(term4916636, term4916636.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916636, term4916636.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916636, term4916636.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916636, term4916636.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916636, term4916636.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916636, term4916636.getClass(), "commonModule", null);
        setField(term4916636, term4916636.getClass(), "commonCustomizeItems", null);
        setField(term4916636, term4916636.getClass(), "commonModuleSetTime", null);
        setField(term4916636, term4916636.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916636, term4916636.getClass(), "commonSkin", 0);
        setIntField(term4916636, term4916636.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916636, term4916636.getClass(), "buttonSeOn", false);
        setIntField(term4916636, term4916636.getClass(), "buttonSeVolume", 0);
        setIntField(term4916636, term4916636.getClass(), "sliderSeVolume", 0);
        setIntField(term4916636, term4916636.getClass(), "buttonSe", 0);
        setIntField(term4916636, term4916636.getClass(), "chainSlideSe", 0);
        setIntField(term4916636, term4916636.getClass(), "slideSe", 0);
        setIntField(term4916636, term4916636.getClass(), "sliderTouchSe", 0);
        setField(term4916636, term4916636.getClass(), "sortMode", null);
        setIntField(term4916636, term4916636.getClass(), "nextPvId", 0);
        setField(term4916636, term4916636.getClass(), "nextDifficulty", null);
        setField(term4916636, term4916636.getClass(), "nextEdition", null);
        setBooleanField(term4916636, term4916636.getClass(), "showInterimRanking", false);
        setBooleanField(term4916636, term4916636.getClass(), "showClearStatus", false);
        setBooleanField(term4916636, term4916636.getClass(), "showGreatBorder", false);
        setBooleanField(term4916636, term4916636.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916636, term4916636.getClass(), "showRivalBorder", false);
        setBooleanField(term4916636, term4916636.getClass(), "showRgoSetting", false);
        setBooleanField(term4916636, term4916636.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916636, term4916636.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916636, term4916636.getClass(), "contestNowPlayingValue", 0);
        setField(term4916636, term4916636.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916636, term4916636.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916636, term4916636.getClass(), "myList0", null);
        setField(term4916636, term4916636.getClass(), "myList1", null);
        setField(term4916636, term4916636.getClass(), "myList2", null);
        setIntField(term4916636, term4916636.getClass(), "rivalPdId", 0);
        term4916671 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4916671;
        callMethod(klass, "setUsePerPvSkin", argTypes, term4916636, args);
    }

};


