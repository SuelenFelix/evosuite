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

public class PlayerProfile_setButtonSeVolume_220203038184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917072;
     Object term4917107;

    public PlayerProfile_setButtonSeVolume_220203038184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917072 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917072, term4917072.getClass(), "id", 0L);
        setIntField(term4917072, term4917072.getClass(), "pdId", 0);
        setField(term4917072, term4917072.getClass(), "playerName", null);
        setIntField(term4917072, term4917072.getClass(), "vocaloidPoints", 0);
        setIntField(term4917072, term4917072.getClass(), "level", 0);
        setIntField(term4917072, term4917072.getClass(), "levelExp", 0);
        setField(term4917072, term4917072.getClass(), "levelTitle", null);
        setIntField(term4917072, term4917072.getClass(), "plateId", 0);
        setIntField(term4917072, term4917072.getClass(), "plateEffectId", 0);
        setField(term4917072, term4917072.getClass(), "passwordStatus", null);
        setField(term4917072, term4917072.getClass(), "password", null);
        setBooleanField(term4917072, term4917072.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917072, term4917072.getClass(), "preferCommonModule", false);
        setBooleanField(term4917072, term4917072.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917072, term4917072.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917072, term4917072.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917072, term4917072.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917072, term4917072.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917072, term4917072.getClass(), "commonModule", null);
        setField(term4917072, term4917072.getClass(), "commonCustomizeItems", null);
        setField(term4917072, term4917072.getClass(), "commonModuleSetTime", null);
        setField(term4917072, term4917072.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917072, term4917072.getClass(), "commonSkin", 0);
        setIntField(term4917072, term4917072.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917072, term4917072.getClass(), "buttonSeOn", false);
        setIntField(term4917072, term4917072.getClass(), "buttonSeVolume", 0);
        setIntField(term4917072, term4917072.getClass(), "sliderSeVolume", 0);
        setIntField(term4917072, term4917072.getClass(), "buttonSe", 0);
        setIntField(term4917072, term4917072.getClass(), "chainSlideSe", 0);
        setIntField(term4917072, term4917072.getClass(), "slideSe", 0);
        setIntField(term4917072, term4917072.getClass(), "sliderTouchSe", 0);
        setField(term4917072, term4917072.getClass(), "sortMode", null);
        setIntField(term4917072, term4917072.getClass(), "nextPvId", 0);
        setField(term4917072, term4917072.getClass(), "nextDifficulty", null);
        setField(term4917072, term4917072.getClass(), "nextEdition", null);
        setBooleanField(term4917072, term4917072.getClass(), "showInterimRanking", false);
        setBooleanField(term4917072, term4917072.getClass(), "showClearStatus", false);
        setBooleanField(term4917072, term4917072.getClass(), "showGreatBorder", false);
        setBooleanField(term4917072, term4917072.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917072, term4917072.getClass(), "showRivalBorder", false);
        setBooleanField(term4917072, term4917072.getClass(), "showRgoSetting", false);
        setBooleanField(term4917072, term4917072.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917072, term4917072.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917072, term4917072.getClass(), "contestNowPlayingValue", 0);
        setField(term4917072, term4917072.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917072, term4917072.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917072, term4917072.getClass(), "myList0", null);
        setField(term4917072, term4917072.getClass(), "myList1", null);
        setField(term4917072, term4917072.getClass(), "myList2", null);
        setIntField(term4917072, term4917072.getClass(), "rivalPdId", 0);
        term4917107 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917107;
        callMethod(klass, "setButtonSeVolume", argTypes, term4917072, args);
    }

};


