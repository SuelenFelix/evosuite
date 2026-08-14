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

public class PlayerProfile_setContestNowPlayingId_287501405201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917695;
     Object term4917730;

    public PlayerProfile_setContestNowPlayingId_287501405201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917695 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917695, term4917695.getClass(), "id", 0L);
        setIntField(term4917695, term4917695.getClass(), "pdId", 0);
        setField(term4917695, term4917695.getClass(), "playerName", null);
        setIntField(term4917695, term4917695.getClass(), "vocaloidPoints", 0);
        setIntField(term4917695, term4917695.getClass(), "level", 0);
        setIntField(term4917695, term4917695.getClass(), "levelExp", 0);
        setField(term4917695, term4917695.getClass(), "levelTitle", null);
        setIntField(term4917695, term4917695.getClass(), "plateId", 0);
        setIntField(term4917695, term4917695.getClass(), "plateEffectId", 0);
        setField(term4917695, term4917695.getClass(), "passwordStatus", null);
        setField(term4917695, term4917695.getClass(), "password", null);
        setBooleanField(term4917695, term4917695.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917695, term4917695.getClass(), "preferCommonModule", false);
        setBooleanField(term4917695, term4917695.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917695, term4917695.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917695, term4917695.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917695, term4917695.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917695, term4917695.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917695, term4917695.getClass(), "commonModule", null);
        setField(term4917695, term4917695.getClass(), "commonCustomizeItems", null);
        setField(term4917695, term4917695.getClass(), "commonModuleSetTime", null);
        setField(term4917695, term4917695.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917695, term4917695.getClass(), "commonSkin", 0);
        setIntField(term4917695, term4917695.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917695, term4917695.getClass(), "buttonSeOn", false);
        setIntField(term4917695, term4917695.getClass(), "buttonSeVolume", 0);
        setIntField(term4917695, term4917695.getClass(), "sliderSeVolume", 0);
        setIntField(term4917695, term4917695.getClass(), "buttonSe", 0);
        setIntField(term4917695, term4917695.getClass(), "chainSlideSe", 0);
        setIntField(term4917695, term4917695.getClass(), "slideSe", 0);
        setIntField(term4917695, term4917695.getClass(), "sliderTouchSe", 0);
        setField(term4917695, term4917695.getClass(), "sortMode", null);
        setIntField(term4917695, term4917695.getClass(), "nextPvId", 0);
        setField(term4917695, term4917695.getClass(), "nextDifficulty", null);
        setField(term4917695, term4917695.getClass(), "nextEdition", null);
        setBooleanField(term4917695, term4917695.getClass(), "showInterimRanking", false);
        setBooleanField(term4917695, term4917695.getClass(), "showClearStatus", false);
        setBooleanField(term4917695, term4917695.getClass(), "showGreatBorder", false);
        setBooleanField(term4917695, term4917695.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917695, term4917695.getClass(), "showRivalBorder", false);
        setBooleanField(term4917695, term4917695.getClass(), "showRgoSetting", false);
        setBooleanField(term4917695, term4917695.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917695, term4917695.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917695, term4917695.getClass(), "contestNowPlayingValue", 0);
        setField(term4917695, term4917695.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917695, term4917695.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917695, term4917695.getClass(), "myList0", null);
        setField(term4917695, term4917695.getClass(), "myList1", null);
        setField(term4917695, term4917695.getClass(), "myList2", null);
        setIntField(term4917695, term4917695.getClass(), "rivalPdId", 0);
        term4917730 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4917730;
        callMethod(klass, "setContestNowPlayingId", argTypes, term4917695, args);
    }

};


