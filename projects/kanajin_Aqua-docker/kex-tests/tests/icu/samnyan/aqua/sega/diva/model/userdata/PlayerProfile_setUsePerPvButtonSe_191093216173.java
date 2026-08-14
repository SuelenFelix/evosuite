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

public class PlayerProfile_setUsePerPvButtonSe_191093216173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4916673;
     Object term4916708;

    public PlayerProfile_setUsePerPvButtonSe_191093216173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4916673 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4916673, term4916673.getClass(), "id", 0L);
        setIntField(term4916673, term4916673.getClass(), "pdId", 0);
        setField(term4916673, term4916673.getClass(), "playerName", null);
        setIntField(term4916673, term4916673.getClass(), "vocaloidPoints", 0);
        setIntField(term4916673, term4916673.getClass(), "level", 0);
        setIntField(term4916673, term4916673.getClass(), "levelExp", 0);
        setField(term4916673, term4916673.getClass(), "levelTitle", null);
        setIntField(term4916673, term4916673.getClass(), "plateId", 0);
        setIntField(term4916673, term4916673.getClass(), "plateEffectId", 0);
        setField(term4916673, term4916673.getClass(), "passwordStatus", null);
        setField(term4916673, term4916673.getClass(), "password", null);
        setBooleanField(term4916673, term4916673.getClass(), "preferPerPvModule", false);
        setBooleanField(term4916673, term4916673.getClass(), "preferCommonModule", false);
        setBooleanField(term4916673, term4916673.getClass(), "usePerPvSkin", false);
        setBooleanField(term4916673, term4916673.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4916673, term4916673.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4916673, term4916673.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4916673, term4916673.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4916673, term4916673.getClass(), "commonModule", null);
        setField(term4916673, term4916673.getClass(), "commonCustomizeItems", null);
        setField(term4916673, term4916673.getClass(), "commonModuleSetTime", null);
        setField(term4916673, term4916673.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4916673, term4916673.getClass(), "commonSkin", 0);
        setIntField(term4916673, term4916673.getClass(), "headphoneVolume", 0);
        setBooleanField(term4916673, term4916673.getClass(), "buttonSeOn", false);
        setIntField(term4916673, term4916673.getClass(), "buttonSeVolume", 0);
        setIntField(term4916673, term4916673.getClass(), "sliderSeVolume", 0);
        setIntField(term4916673, term4916673.getClass(), "buttonSe", 0);
        setIntField(term4916673, term4916673.getClass(), "chainSlideSe", 0);
        setIntField(term4916673, term4916673.getClass(), "slideSe", 0);
        setIntField(term4916673, term4916673.getClass(), "sliderTouchSe", 0);
        setField(term4916673, term4916673.getClass(), "sortMode", null);
        setIntField(term4916673, term4916673.getClass(), "nextPvId", 0);
        setField(term4916673, term4916673.getClass(), "nextDifficulty", null);
        setField(term4916673, term4916673.getClass(), "nextEdition", null);
        setBooleanField(term4916673, term4916673.getClass(), "showInterimRanking", false);
        setBooleanField(term4916673, term4916673.getClass(), "showClearStatus", false);
        setBooleanField(term4916673, term4916673.getClass(), "showGreatBorder", false);
        setBooleanField(term4916673, term4916673.getClass(), "showExcellentBorder", false);
        setBooleanField(term4916673, term4916673.getClass(), "showRivalBorder", false);
        setBooleanField(term4916673, term4916673.getClass(), "showRgoSetting", false);
        setBooleanField(term4916673, term4916673.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4916673, term4916673.getClass(), "contestNowPlayingId", 0);
        setIntField(term4916673, term4916673.getClass(), "contestNowPlayingValue", 0);
        setField(term4916673, term4916673.getClass(), "contestNowPlayingResultRank", null);
        setField(term4916673, term4916673.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4916673, term4916673.getClass(), "myList0", null);
        setField(term4916673, term4916673.getClass(), "myList1", null);
        setField(term4916673, term4916673.getClass(), "myList2", null);
        setIntField(term4916673, term4916673.getClass(), "rivalPdId", 0);
        term4916708 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4916708;
        callMethod(klass, "setUsePerPvButtonSe", argTypes, term4916673, args);
    }

};


