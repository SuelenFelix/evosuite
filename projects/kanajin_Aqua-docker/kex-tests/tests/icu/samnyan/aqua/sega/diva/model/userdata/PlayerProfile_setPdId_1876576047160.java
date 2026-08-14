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
import java.lang.Integer;

public class PlayerProfile_setPdId_1876576047160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916200;
     Object term4916235;

    public PlayerProfile_setPdId_1876576047160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916200 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916200, term4916200.getClass(), "id", 0L);
        setIntField(term4916200, term4916200.getClass(), "pdId", 0);
        setField(term4916200, term4916200.getClass(), "playerName", null);
        setIntField(term4916200, term4916200.getClass(), "vocaloidPoints", 0);
        setIntField(term4916200, term4916200.getClass(), "level", 0);
        setIntField(term4916200, term4916200.getClass(), "levelExp", 0);
        setField(term4916200, term4916200.getClass(), "levelTitle", null);
        setIntField(term4916200, term4916200.getClass(), "plateId", 0);
        setIntField(term4916200, term4916200.getClass(), "plateEffectId", 0);
        setField(term4916200, term4916200.getClass(), "passwordStatus", null);
        setField(term4916200, term4916200.getClass(), "password", null);
        setBooleanField(term4916200, term4916200.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916200, term4916200.getClass(), "preferCommonModule", false);
        setBooleanField(term4916200, term4916200.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916200, term4916200.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916200, term4916200.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916200, term4916200.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916200, term4916200.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916200, term4916200.getClass(), "commonModule", null);
        setField(term4916200, term4916200.getClass(), "commonCustomizeItems", null);
        setField(term4916200, term4916200.getClass(), "commonModuleSetTime", null);
        setField(term4916200, term4916200.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916200, term4916200.getClass(), "commonSkin", 0);
        setIntField(term4916200, term4916200.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916200, term4916200.getClass(), "buttonSeOn", false);
        setIntField(term4916200, term4916200.getClass(), "buttonSeVolume", 0);
        setIntField(term4916200, term4916200.getClass(), "sliderSeVolume", 0);
        setIntField(term4916200, term4916200.getClass(), "buttonSe", 0);
        setIntField(term4916200, term4916200.getClass(), "chainSlideSe", 0);
        setIntField(term4916200, term4916200.getClass(), "slideSe", 0);
        setIntField(term4916200, term4916200.getClass(), "sliderTouchSe", 0);
        setField(term4916200, term4916200.getClass(), "sortMode", null);
        setIntField(term4916200, term4916200.getClass(), "nextPvId", 0);
        setField(term4916200, term4916200.getClass(), "nextDifficulty", null);
        setField(term4916200, term4916200.getClass(), "nextEdition", null);
        setBooleanField(term4916200, term4916200.getClass(), "showInterimRanking", false);
        setBooleanField(term4916200, term4916200.getClass(), "showClearStatus", false);
        setBooleanField(term4916200, term4916200.getClass(), "showGreatBorder", false);
        setBooleanField(term4916200, term4916200.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916200, term4916200.getClass(), "showRivalBorder", false);
        setBooleanField(term4916200, term4916200.getClass(), "showRgoSetting", false);
        setBooleanField(term4916200, term4916200.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916200, term4916200.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916200, term4916200.getClass(), "contestNowPlayingValue", 0);
        setField(term4916200, term4916200.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916200, term4916200.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916200, term4916200.getClass(), "myList0", null);
        setField(term4916200, term4916200.getClass(), "myList1", null);
        setField(term4916200, term4916200.getClass(), "myList2", null);
        setIntField(term4916200, term4916200.getClass(), "rivalPdId", 0);
        term4916235 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4916235;
        callMethod(klass, "setPdId", argTypes, term4916200, args);
    }

};


