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

public class PlayerProfile_getButtonSeVolume_1760303644133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942443;

    public PlayerProfile_getButtonSeVolume_1760303644133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942443 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942443, term942443.getClass(), "id", 0L);
        setIntField(term942443, term942443.getClass(), "pdId", 0);
        setField(term942443, term942443.getClass(), "playerName", null);
        setIntField(term942443, term942443.getClass(), "vocaloidPoints", 0);
        setIntField(term942443, term942443.getClass(), "level", 0);
        setIntField(term942443, term942443.getClass(), "levelExp", 0);
        setField(term942443, term942443.getClass(), "levelTitle", null);
        setIntField(term942443, term942443.getClass(), "plateId", 0);
        setIntField(term942443, term942443.getClass(), "plateEffectId", 0);
        setField(term942443, term942443.getClass(), "passwordStatus", null);
        setField(term942443, term942443.getClass(), "password", null);
        setBooleanField(term942443, term942443.getClass(), "preferPerPvModule", false);
        setBooleanField(term942443, term942443.getClass(), "preferCommonModule", false);
        setBooleanField(term942443, term942443.getClass(), "usePerPvSkin", false);
        setBooleanField(term942443, term942443.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942443, term942443.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942443, term942443.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942443, term942443.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942443, term942443.getClass(), "commonModule", null);
        setField(term942443, term942443.getClass(), "commonCustomizeItems", null);
        setField(term942443, term942443.getClass(), "commonModuleSetTime", null);
        setField(term942443, term942443.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942443, term942443.getClass(), "commonSkin", 0);
        setIntField(term942443, term942443.getClass(), "headphoneVolume", 0);
        setBooleanField(term942443, term942443.getClass(), "buttonSeOn", false);
        setIntField(term942443, term942443.getClass(), "buttonSeVolume", 0);
        setIntField(term942443, term942443.getClass(), "sliderSeVolume", 0);
        setIntField(term942443, term942443.getClass(), "buttonSe", 0);
        setIntField(term942443, term942443.getClass(), "chainSlideSe", 0);
        setIntField(term942443, term942443.getClass(), "slideSe", 0);
        setIntField(term942443, term942443.getClass(), "sliderTouchSe", 0);
        setField(term942443, term942443.getClass(), "sortMode", null);
        setIntField(term942443, term942443.getClass(), "nextPvId", 0);
        setField(term942443, term942443.getClass(), "nextDifficulty", null);
        setField(term942443, term942443.getClass(), "nextEdition", null);
        setBooleanField(term942443, term942443.getClass(), "showInterimRanking", false);
        setBooleanField(term942443, term942443.getClass(), "showClearStatus", false);
        setBooleanField(term942443, term942443.getClass(), "showGreatBorder", false);
        setBooleanField(term942443, term942443.getClass(), "showExcellentBorder", false);
        setBooleanField(term942443, term942443.getClass(), "showRivalBorder", false);
        setBooleanField(term942443, term942443.getClass(), "showRgoSetting", false);
        setBooleanField(term942443, term942443.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942443, term942443.getClass(), "contestNowPlayingId", 0);
        setIntField(term942443, term942443.getClass(), "contestNowPlayingValue", 0);
        setField(term942443, term942443.getClass(), "contestNowPlayingResultRank", null);
        setField(term942443, term942443.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942443, term942443.getClass(), "myList0", null);
        setField(term942443, term942443.getClass(), "myList1", null);
        setField(term942443, term942443.getClass(), "myList2", null);
        setIntField(term942443, term942443.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getButtonSeVolume", argTypes, term942443, args);
    }

};


