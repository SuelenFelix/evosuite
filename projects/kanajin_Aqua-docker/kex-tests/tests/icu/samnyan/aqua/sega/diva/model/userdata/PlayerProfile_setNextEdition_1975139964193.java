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

public class PlayerProfile_setNextEdition_1975139964193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917401;

    public PlayerProfile_setNextEdition_1975139964193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917401 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917401, term4917401.getClass(), "id", 0L);
        setIntField(term4917401, term4917401.getClass(), "pdId", 0);
        setField(term4917401, term4917401.getClass(), "playerName", null);
        setIntField(term4917401, term4917401.getClass(), "vocaloidPoints", 0);
        setIntField(term4917401, term4917401.getClass(), "level", 0);
        setIntField(term4917401, term4917401.getClass(), "levelExp", 0);
        setField(term4917401, term4917401.getClass(), "levelTitle", null);
        setIntField(term4917401, term4917401.getClass(), "plateId", 0);
        setIntField(term4917401, term4917401.getClass(), "plateEffectId", 0);
        setField(term4917401, term4917401.getClass(), "passwordStatus", null);
        setField(term4917401, term4917401.getClass(), "password", null);
        setBooleanField(term4917401, term4917401.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917401, term4917401.getClass(), "preferCommonModule", false);
        setBooleanField(term4917401, term4917401.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917401, term4917401.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917401, term4917401.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917401, term4917401.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917401, term4917401.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917401, term4917401.getClass(), "commonModule", null);
        setField(term4917401, term4917401.getClass(), "commonCustomizeItems", null);
        setField(term4917401, term4917401.getClass(), "commonModuleSetTime", null);
        setField(term4917401, term4917401.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917401, term4917401.getClass(), "commonSkin", 0);
        setIntField(term4917401, term4917401.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917401, term4917401.getClass(), "buttonSeOn", false);
        setIntField(term4917401, term4917401.getClass(), "buttonSeVolume", 0);
        setIntField(term4917401, term4917401.getClass(), "sliderSeVolume", 0);
        setIntField(term4917401, term4917401.getClass(), "buttonSe", 0);
        setIntField(term4917401, term4917401.getClass(), "chainSlideSe", 0);
        setIntField(term4917401, term4917401.getClass(), "slideSe", 0);
        setIntField(term4917401, term4917401.getClass(), "sliderTouchSe", 0);
        setField(term4917401, term4917401.getClass(), "sortMode", null);
        setIntField(term4917401, term4917401.getClass(), "nextPvId", 0);
        setField(term4917401, term4917401.getClass(), "nextDifficulty", null);
        setField(term4917401, term4917401.getClass(), "nextEdition", null);
        setBooleanField(term4917401, term4917401.getClass(), "showInterimRanking", false);
        setBooleanField(term4917401, term4917401.getClass(), "showClearStatus", false);
        setBooleanField(term4917401, term4917401.getClass(), "showGreatBorder", false);
        setBooleanField(term4917401, term4917401.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917401, term4917401.getClass(), "showRivalBorder", false);
        setBooleanField(term4917401, term4917401.getClass(), "showRgoSetting", false);
        setBooleanField(term4917401, term4917401.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917401, term4917401.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917401, term4917401.getClass(), "contestNowPlayingValue", 0);
        setField(term4917401, term4917401.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917401, term4917401.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917401, term4917401.getClass(), "myList0", null);
        setField(term4917401, term4917401.getClass(), "myList1", null);
        setField(term4917401, term4917401.getClass(), "myList2", null);
        setIntField(term4917401, term4917401.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNextEdition", argTypes, term4917401, args);
    }

};


