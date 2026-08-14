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

public class PlayerProfile_setHeadphoneVolume_1618443324182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916998;
     Object term4917033;

    public PlayerProfile_setHeadphoneVolume_1618443324182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916998 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916998, term4916998.getClass(), "id", 0L);
        setIntField(term4916998, term4916998.getClass(), "pdId", 0);
        setField(term4916998, term4916998.getClass(), "playerName", null);
        setIntField(term4916998, term4916998.getClass(), "vocaloidPoints", 0);
        setIntField(term4916998, term4916998.getClass(), "level", 0);
        setIntField(term4916998, term4916998.getClass(), "levelExp", 0);
        setField(term4916998, term4916998.getClass(), "levelTitle", null);
        setIntField(term4916998, term4916998.getClass(), "plateId", 0);
        setIntField(term4916998, term4916998.getClass(), "plateEffectId", 0);
        setField(term4916998, term4916998.getClass(), "passwordStatus", null);
        setField(term4916998, term4916998.getClass(), "password", null);
        setBooleanField(term4916998, term4916998.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916998, term4916998.getClass(), "preferCommonModule", false);
        setBooleanField(term4916998, term4916998.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916998, term4916998.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916998, term4916998.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916998, term4916998.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916998, term4916998.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916998, term4916998.getClass(), "commonModule", null);
        setField(term4916998, term4916998.getClass(), "commonCustomizeItems", null);
        setField(term4916998, term4916998.getClass(), "commonModuleSetTime", null);
        setField(term4916998, term4916998.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916998, term4916998.getClass(), "commonSkin", 0);
        setIntField(term4916998, term4916998.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916998, term4916998.getClass(), "buttonSeOn", false);
        setIntField(term4916998, term4916998.getClass(), "buttonSeVolume", 0);
        setIntField(term4916998, term4916998.getClass(), "sliderSeVolume", 0);
        setIntField(term4916998, term4916998.getClass(), "buttonSe", 0);
        setIntField(term4916998, term4916998.getClass(), "chainSlideSe", 0);
        setIntField(term4916998, term4916998.getClass(), "slideSe", 0);
        setIntField(term4916998, term4916998.getClass(), "sliderTouchSe", 0);
        setField(term4916998, term4916998.getClass(), "sortMode", null);
        setIntField(term4916998, term4916998.getClass(), "nextPvId", 0);
        setField(term4916998, term4916998.getClass(), "nextDifficulty", null);
        setField(term4916998, term4916998.getClass(), "nextEdition", null);
        setBooleanField(term4916998, term4916998.getClass(), "showInterimRanking", false);
        setBooleanField(term4916998, term4916998.getClass(), "showClearStatus", false);
        setBooleanField(term4916998, term4916998.getClass(), "showGreatBorder", false);
        setBooleanField(term4916998, term4916998.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916998, term4916998.getClass(), "showRivalBorder", false);
        setBooleanField(term4916998, term4916998.getClass(), "showRgoSetting", false);
        setBooleanField(term4916998, term4916998.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916998, term4916998.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916998, term4916998.getClass(), "contestNowPlayingValue", 0);
        setField(term4916998, term4916998.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916998, term4916998.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916998, term4916998.getClass(), "myList0", null);
        setField(term4916998, term4916998.getClass(), "myList1", null);
        setField(term4916998, term4916998.getClass(), "myList2", null);
        setIntField(term4916998, term4916998.getClass(), "rivalPdId", 0);
        term4917033 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917033;
        callMethod(klass, "setHeadphoneVolume", argTypes, term4916998, args);
    }

};


