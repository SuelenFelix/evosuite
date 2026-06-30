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

public class PlayerProfile_isShowInterimRanking_1106840155143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942793;

    public PlayerProfile_isShowInterimRanking_1106840155143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942793 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942793, term942793.getClass(), "id", 0L);
        setIntField(term942793, term942793.getClass(), "pdId", 0);
        setField(term942793, term942793.getClass(), "playerName", null);
        setIntField(term942793, term942793.getClass(), "vocaloidPoints", 0);
        setIntField(term942793, term942793.getClass(), "level", 0);
        setIntField(term942793, term942793.getClass(), "levelExp", 0);
        setField(term942793, term942793.getClass(), "levelTitle", null);
        setIntField(term942793, term942793.getClass(), "plateId", 0);
        setIntField(term942793, term942793.getClass(), "plateEffectId", 0);
        setField(term942793, term942793.getClass(), "passwordStatus", null);
        setField(term942793, term942793.getClass(), "password", null);
        setBooleanField(term942793, term942793.getClass(), "preferPerPvModule", false);
        setBooleanField(term942793, term942793.getClass(), "preferCommonModule", false);
        setBooleanField(term942793, term942793.getClass(), "usePerPvSkin", false);
        setBooleanField(term942793, term942793.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942793, term942793.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942793, term942793.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942793, term942793.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942793, term942793.getClass(), "commonModule", null);
        setField(term942793, term942793.getClass(), "commonCustomizeItems", null);
        setField(term942793, term942793.getClass(), "commonModuleSetTime", null);
        setField(term942793, term942793.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942793, term942793.getClass(), "commonSkin", 0);
        setIntField(term942793, term942793.getClass(), "headphoneVolume", 0);
        setBooleanField(term942793, term942793.getClass(), "buttonSeOn", false);
        setIntField(term942793, term942793.getClass(), "buttonSeVolume", 0);
        setIntField(term942793, term942793.getClass(), "sliderSeVolume", 0);
        setIntField(term942793, term942793.getClass(), "buttonSe", 0);
        setIntField(term942793, term942793.getClass(), "chainSlideSe", 0);
        setIntField(term942793, term942793.getClass(), "slideSe", 0);
        setIntField(term942793, term942793.getClass(), "sliderTouchSe", 0);
        setField(term942793, term942793.getClass(), "sortMode", null);
        setIntField(term942793, term942793.getClass(), "nextPvId", 0);
        setField(term942793, term942793.getClass(), "nextDifficulty", null);
        setField(term942793, term942793.getClass(), "nextEdition", null);
        setBooleanField(term942793, term942793.getClass(), "showInterimRanking", false);
        setBooleanField(term942793, term942793.getClass(), "showClearStatus", false);
        setBooleanField(term942793, term942793.getClass(), "showGreatBorder", false);
        setBooleanField(term942793, term942793.getClass(), "showExcellentBorder", false);
        setBooleanField(term942793, term942793.getClass(), "showRivalBorder", false);
        setBooleanField(term942793, term942793.getClass(), "showRgoSetting", false);
        setBooleanField(term942793, term942793.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942793, term942793.getClass(), "contestNowPlayingId", 0);
        setIntField(term942793, term942793.getClass(), "contestNowPlayingValue", 0);
        setField(term942793, term942793.getClass(), "contestNowPlayingResultRank", null);
        setField(term942793, term942793.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942793, term942793.getClass(), "myList0", null);
        setField(term942793, term942793.getClass(), "myList1", null);
        setField(term942793, term942793.getClass(), "myList2", null);
        setIntField(term942793, term942793.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowInterimRanking", argTypes, term942793, args);
    }

};


