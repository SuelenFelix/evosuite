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

public class PlayerProfile_isButtonSeOn_1558868053132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942408;

    public PlayerProfile_isButtonSeOn_1558868053132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942408 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942408, term942408.getClass(), "id", 0L);
        setIntField(term942408, term942408.getClass(), "pdId", 0);
        setField(term942408, term942408.getClass(), "playerName", null);
        setIntField(term942408, term942408.getClass(), "vocaloidPoints", 0);
        setIntField(term942408, term942408.getClass(), "level", 0);
        setIntField(term942408, term942408.getClass(), "levelExp", 0);
        setField(term942408, term942408.getClass(), "levelTitle", null);
        setIntField(term942408, term942408.getClass(), "plateId", 0);
        setIntField(term942408, term942408.getClass(), "plateEffectId", 0);
        setField(term942408, term942408.getClass(), "passwordStatus", null);
        setField(term942408, term942408.getClass(), "password", null);
        setBooleanField(term942408, term942408.getClass(), "preferPerPvModule", false);
        setBooleanField(term942408, term942408.getClass(), "preferCommonModule", false);
        setBooleanField(term942408, term942408.getClass(), "usePerPvSkin", false);
        setBooleanField(term942408, term942408.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942408, term942408.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942408, term942408.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942408, term942408.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942408, term942408.getClass(), "commonModule", null);
        setField(term942408, term942408.getClass(), "commonCustomizeItems", null);
        setField(term942408, term942408.getClass(), "commonModuleSetTime", null);
        setField(term942408, term942408.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942408, term942408.getClass(), "commonSkin", 0);
        setIntField(term942408, term942408.getClass(), "headphoneVolume", 0);
        setBooleanField(term942408, term942408.getClass(), "buttonSeOn", false);
        setIntField(term942408, term942408.getClass(), "buttonSeVolume", 0);
        setIntField(term942408, term942408.getClass(), "sliderSeVolume", 0);
        setIntField(term942408, term942408.getClass(), "buttonSe", 0);
        setIntField(term942408, term942408.getClass(), "chainSlideSe", 0);
        setIntField(term942408, term942408.getClass(), "slideSe", 0);
        setIntField(term942408, term942408.getClass(), "sliderTouchSe", 0);
        setField(term942408, term942408.getClass(), "sortMode", null);
        setIntField(term942408, term942408.getClass(), "nextPvId", 0);
        setField(term942408, term942408.getClass(), "nextDifficulty", null);
        setField(term942408, term942408.getClass(), "nextEdition", null);
        setBooleanField(term942408, term942408.getClass(), "showInterimRanking", false);
        setBooleanField(term942408, term942408.getClass(), "showClearStatus", false);
        setBooleanField(term942408, term942408.getClass(), "showGreatBorder", false);
        setBooleanField(term942408, term942408.getClass(), "showExcellentBorder", false);
        setBooleanField(term942408, term942408.getClass(), "showRivalBorder", false);
        setBooleanField(term942408, term942408.getClass(), "showRgoSetting", false);
        setBooleanField(term942408, term942408.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942408, term942408.getClass(), "contestNowPlayingId", 0);
        setIntField(term942408, term942408.getClass(), "contestNowPlayingValue", 0);
        setField(term942408, term942408.getClass(), "contestNowPlayingResultRank", null);
        setField(term942408, term942408.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942408, term942408.getClass(), "myList0", null);
        setField(term942408, term942408.getClass(), "myList1", null);
        setField(term942408, term942408.getClass(), "myList2", null);
        setIntField(term942408, term942408.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isButtonSeOn", argTypes, term942408, args);
    }

};


