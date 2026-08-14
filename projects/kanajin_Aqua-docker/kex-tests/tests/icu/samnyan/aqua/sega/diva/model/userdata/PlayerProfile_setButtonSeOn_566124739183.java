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

public class PlayerProfile_setButtonSeOn_566124739183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917035;
     Object term4917070;

    public PlayerProfile_setButtonSeOn_566124739183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917035 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917035, term4917035.getClass(), "id", 0L);
        setIntField(term4917035, term4917035.getClass(), "pdId", 0);
        setField(term4917035, term4917035.getClass(), "playerName", null);
        setIntField(term4917035, term4917035.getClass(), "vocaloidPoints", 0);
        setIntField(term4917035, term4917035.getClass(), "level", 0);
        setIntField(term4917035, term4917035.getClass(), "levelExp", 0);
        setField(term4917035, term4917035.getClass(), "levelTitle", null);
        setIntField(term4917035, term4917035.getClass(), "plateId", 0);
        setIntField(term4917035, term4917035.getClass(), "plateEffectId", 0);
        setField(term4917035, term4917035.getClass(), "passwordStatus", null);
        setField(term4917035, term4917035.getClass(), "password", null);
        setBooleanField(term4917035, term4917035.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917035, term4917035.getClass(), "preferCommonModule", false);
        setBooleanField(term4917035, term4917035.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917035, term4917035.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917035, term4917035.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917035, term4917035.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917035, term4917035.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917035, term4917035.getClass(), "commonModule", null);
        setField(term4917035, term4917035.getClass(), "commonCustomizeItems", null);
        setField(term4917035, term4917035.getClass(), "commonModuleSetTime", null);
        setField(term4917035, term4917035.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917035, term4917035.getClass(), "commonSkin", 0);
        setIntField(term4917035, term4917035.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917035, term4917035.getClass(), "buttonSeOn", false);
        setIntField(term4917035, term4917035.getClass(), "buttonSeVolume", 0);
        setIntField(term4917035, term4917035.getClass(), "sliderSeVolume", 0);
        setIntField(term4917035, term4917035.getClass(), "buttonSe", 0);
        setIntField(term4917035, term4917035.getClass(), "chainSlideSe", 0);
        setIntField(term4917035, term4917035.getClass(), "slideSe", 0);
        setIntField(term4917035, term4917035.getClass(), "sliderTouchSe", 0);
        setField(term4917035, term4917035.getClass(), "sortMode", null);
        setIntField(term4917035, term4917035.getClass(), "nextPvId", 0);
        setField(term4917035, term4917035.getClass(), "nextDifficulty", null);
        setField(term4917035, term4917035.getClass(), "nextEdition", null);
        setBooleanField(term4917035, term4917035.getClass(), "showInterimRanking", false);
        setBooleanField(term4917035, term4917035.getClass(), "showClearStatus", false);
        setBooleanField(term4917035, term4917035.getClass(), "showGreatBorder", false);
        setBooleanField(term4917035, term4917035.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917035, term4917035.getClass(), "showRivalBorder", false);
        setBooleanField(term4917035, term4917035.getClass(), "showRgoSetting", false);
        setBooleanField(term4917035, term4917035.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917035, term4917035.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917035, term4917035.getClass(), "contestNowPlayingValue", 0);
        setField(term4917035, term4917035.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917035, term4917035.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917035, term4917035.getClass(), "myList0", null);
        setField(term4917035, term4917035.getClass(), "myList1", null);
        setField(term4917035, term4917035.getClass(), "myList2", null);
        setIntField(term4917035, term4917035.getClass(), "rivalPdId", 0);
        term4917070 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4917070;
        callMethod(klass, "setButtonSeOn", argTypes, term4917035, args);
    }

};


