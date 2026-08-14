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

public class PlayerProfile_setSliderTouchSe_27839796189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917257;
     Object term4917292;

    public PlayerProfile_setSliderTouchSe_27839796189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917257 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917257, term4917257.getClass(), "id", 0L);
        setIntField(term4917257, term4917257.getClass(), "pdId", 0);
        setField(term4917257, term4917257.getClass(), "playerName", null);
        setIntField(term4917257, term4917257.getClass(), "vocaloidPoints", 0);
        setIntField(term4917257, term4917257.getClass(), "level", 0);
        setIntField(term4917257, term4917257.getClass(), "levelExp", 0);
        setField(term4917257, term4917257.getClass(), "levelTitle", null);
        setIntField(term4917257, term4917257.getClass(), "plateId", 0);
        setIntField(term4917257, term4917257.getClass(), "plateEffectId", 0);
        setField(term4917257, term4917257.getClass(), "passwordStatus", null);
        setField(term4917257, term4917257.getClass(), "password", null);
        setBooleanField(term4917257, term4917257.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917257, term4917257.getClass(), "preferCommonModule", false);
        setBooleanField(term4917257, term4917257.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917257, term4917257.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917257, term4917257.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917257, term4917257.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917257, term4917257.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917257, term4917257.getClass(), "commonModule", null);
        setField(term4917257, term4917257.getClass(), "commonCustomizeItems", null);
        setField(term4917257, term4917257.getClass(), "commonModuleSetTime", null);
        setField(term4917257, term4917257.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917257, term4917257.getClass(), "commonSkin", 0);
        setIntField(term4917257, term4917257.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917257, term4917257.getClass(), "buttonSeOn", false);
        setIntField(term4917257, term4917257.getClass(), "buttonSeVolume", 0);
        setIntField(term4917257, term4917257.getClass(), "sliderSeVolume", 0);
        setIntField(term4917257, term4917257.getClass(), "buttonSe", 0);
        setIntField(term4917257, term4917257.getClass(), "chainSlideSe", 0);
        setIntField(term4917257, term4917257.getClass(), "slideSe", 0);
        setIntField(term4917257, term4917257.getClass(), "sliderTouchSe", 0);
        setField(term4917257, term4917257.getClass(), "sortMode", null);
        setIntField(term4917257, term4917257.getClass(), "nextPvId", 0);
        setField(term4917257, term4917257.getClass(), "nextDifficulty", null);
        setField(term4917257, term4917257.getClass(), "nextEdition", null);
        setBooleanField(term4917257, term4917257.getClass(), "showInterimRanking", false);
        setBooleanField(term4917257, term4917257.getClass(), "showClearStatus", false);
        setBooleanField(term4917257, term4917257.getClass(), "showGreatBorder", false);
        setBooleanField(term4917257, term4917257.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917257, term4917257.getClass(), "showRivalBorder", false);
        setBooleanField(term4917257, term4917257.getClass(), "showRgoSetting", false);
        setBooleanField(term4917257, term4917257.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917257, term4917257.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917257, term4917257.getClass(), "contestNowPlayingValue", 0);
        setField(term4917257, term4917257.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917257, term4917257.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917257, term4917257.getClass(), "myList0", null);
        setField(term4917257, term4917257.getClass(), "myList1", null);
        setField(term4917257, term4917257.getClass(), "myList2", null);
        setIntField(term4917257, term4917257.getClass(), "rivalPdId", 0);
        term4917292 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917292;
        callMethod(klass, "setSliderTouchSe", argTypes, term4917257, args);
    }

};


