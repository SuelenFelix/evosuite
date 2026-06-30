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

public class PlayerProfile_isShowGreatBorder_1244475258145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942863;

    public PlayerProfile_isShowGreatBorder_1244475258145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term942863 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term942863, term942863.getClass(), "id", 0L);
        setIntField(term942863, term942863.getClass(), "pdId", 0);
        setField(term942863, term942863.getClass(), "playerName", null);
        setIntField(term942863, term942863.getClass(), "vocaloidPoints", 0);
        setIntField(term942863, term942863.getClass(), "level", 0);
        setIntField(term942863, term942863.getClass(), "levelExp", 0);
        setField(term942863, term942863.getClass(), "levelTitle", null);
        setIntField(term942863, term942863.getClass(), "plateId", 0);
        setIntField(term942863, term942863.getClass(), "plateEffectId", 0);
        setField(term942863, term942863.getClass(), "passwordStatus", null);
        setField(term942863, term942863.getClass(), "password", null);
        setBooleanField(term942863, term942863.getClass(), "preferPerPvModule", false);
        setBooleanField(term942863, term942863.getClass(), "preferCommonModule", false);
        setBooleanField(term942863, term942863.getClass(), "usePerPvSkin", false);
        setBooleanField(term942863, term942863.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term942863, term942863.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term942863, term942863.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term942863, term942863.getClass(), "usePerPvTouchSliderSe", false);
        setField(term942863, term942863.getClass(), "commonModule", null);
        setField(term942863, term942863.getClass(), "commonCustomizeItems", null);
        setField(term942863, term942863.getClass(), "commonModuleSetTime", null);
        setField(term942863, term942863.getClass(), "moduleSelectItemFlag", null);
        setIntField(term942863, term942863.getClass(), "commonSkin", 0);
        setIntField(term942863, term942863.getClass(), "headphoneVolume", 0);
        setBooleanField(term942863, term942863.getClass(), "buttonSeOn", false);
        setIntField(term942863, term942863.getClass(), "buttonSeVolume", 0);
        setIntField(term942863, term942863.getClass(), "sliderSeVolume", 0);
        setIntField(term942863, term942863.getClass(), "buttonSe", 0);
        setIntField(term942863, term942863.getClass(), "chainSlideSe", 0);
        setIntField(term942863, term942863.getClass(), "slideSe", 0);
        setIntField(term942863, term942863.getClass(), "sliderTouchSe", 0);
        setField(term942863, term942863.getClass(), "sortMode", null);
        setIntField(term942863, term942863.getClass(), "nextPvId", 0);
        setField(term942863, term942863.getClass(), "nextDifficulty", null);
        setField(term942863, term942863.getClass(), "nextEdition", null);
        setBooleanField(term942863, term942863.getClass(), "showInterimRanking", false);
        setBooleanField(term942863, term942863.getClass(), "showClearStatus", false);
        setBooleanField(term942863, term942863.getClass(), "showGreatBorder", false);
        setBooleanField(term942863, term942863.getClass(), "showExcellentBorder", false);
        setBooleanField(term942863, term942863.getClass(), "showRivalBorder", false);
        setBooleanField(term942863, term942863.getClass(), "showRgoSetting", false);
        setBooleanField(term942863, term942863.getClass(), "contestNowPlayingEnable", false);
        setIntField(term942863, term942863.getClass(), "contestNowPlayingId", 0);
        setIntField(term942863, term942863.getClass(), "contestNowPlayingValue", 0);
        setField(term942863, term942863.getClass(), "contestNowPlayingResultRank", null);
        setField(term942863, term942863.getClass(), "contestNowPlayingSpecifier", null);
        setField(term942863, term942863.getClass(), "myList0", null);
        setField(term942863, term942863.getClass(), "myList1", null);
        setField(term942863, term942863.getClass(), "myList2", null);
        setIntField(term942863, term942863.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isShowGreatBorder", argTypes, term942863, args);
    }

};


