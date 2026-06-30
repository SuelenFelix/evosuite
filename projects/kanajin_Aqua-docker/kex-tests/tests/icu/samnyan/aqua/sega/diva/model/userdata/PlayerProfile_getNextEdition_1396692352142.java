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

public class PlayerProfile_getNextEdition_1396692352142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942758;

    public PlayerProfile_getNextEdition_1396692352142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942758 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942758, term942758.getClass(), "id", 0L);
        setIntField(term942758, term942758.getClass(), "pdId", 0);
        setField(term942758, term942758.getClass(), "playerName", null);
        setIntField(term942758, term942758.getClass(), "vocaloidPoints", 0);
        setIntField(term942758, term942758.getClass(), "level", 0);
        setIntField(term942758, term942758.getClass(), "levelExp", 0);
        setField(term942758, term942758.getClass(), "levelTitle", null);
        setIntField(term942758, term942758.getClass(), "plateId", 0);
        setIntField(term942758, term942758.getClass(), "plateEffectId", 0);
        setField(term942758, term942758.getClass(), "passwordStatus", null);
        setField(term942758, term942758.getClass(), "password", null);
        setBooleanField(term942758, term942758.getClass(), "preferPerPvModule", false);
        setBooleanField(term942758, term942758.getClass(), "preferCommonModule", false);
        setBooleanField(term942758, term942758.getClass(), "usePerPvSkin", false);
        setBooleanField(term942758, term942758.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942758, term942758.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942758, term942758.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942758, term942758.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942758, term942758.getClass(), "commonModule", null);
        setField(term942758, term942758.getClass(), "commonCustomizeItems", null);
        setField(term942758, term942758.getClass(), "commonModuleSetTime", null);
        setField(term942758, term942758.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942758, term942758.getClass(), "commonSkin", 0);
        setIntField(term942758, term942758.getClass(), "headphoneVolume", 0);
        setBooleanField(term942758, term942758.getClass(), "buttonSeOn", false);
        setIntField(term942758, term942758.getClass(), "buttonSeVolume", 0);
        setIntField(term942758, term942758.getClass(), "sliderSeVolume", 0);
        setIntField(term942758, term942758.getClass(), "buttonSe", 0);
        setIntField(term942758, term942758.getClass(), "chainSlideSe", 0);
        setIntField(term942758, term942758.getClass(), "slideSe", 0);
        setIntField(term942758, term942758.getClass(), "sliderTouchSe", 0);
        setField(term942758, term942758.getClass(), "sortMode", null);
        setIntField(term942758, term942758.getClass(), "nextPvId", 0);
        setField(term942758, term942758.getClass(), "nextDifficulty", null);
        setField(term942758, term942758.getClass(), "nextEdition", null);
        setBooleanField(term942758, term942758.getClass(), "showInterimRanking", false);
        setBooleanField(term942758, term942758.getClass(), "showClearStatus", false);
        setBooleanField(term942758, term942758.getClass(), "showGreatBorder", false);
        setBooleanField(term942758, term942758.getClass(), "showExcellentBorder", false);
        setBooleanField(term942758, term942758.getClass(), "showRivalBorder", false);
        setBooleanField(term942758, term942758.getClass(), "showRgoSetting", false);
        setBooleanField(term942758, term942758.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942758, term942758.getClass(), "contestNowPlayingId", 0);
        setIntField(term942758, term942758.getClass(), "contestNowPlayingValue", 0);
        setField(term942758, term942758.getClass(), "contestNowPlayingResultRank", null);
        setField(term942758, term942758.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942758, term942758.getClass(), "myList0", null);
        setField(term942758, term942758.getClass(), "myList1", null);
        setField(term942758, term942758.getClass(), "myList2", null);
        setIntField(term942758, term942758.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNextEdition", argTypes, term942758, args);
    }

};


