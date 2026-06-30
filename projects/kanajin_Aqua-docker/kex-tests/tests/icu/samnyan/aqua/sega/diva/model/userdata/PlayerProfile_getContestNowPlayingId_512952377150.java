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

public class PlayerProfile_getContestNowPlayingId_512952377150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943038;

    public PlayerProfile_getContestNowPlayingId_512952377150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943038 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term943038, term943038.getClass(), "id", 0L);
        setIntField(term943038, term943038.getClass(), "pdId", 0);
        setField(term943038, term943038.getClass(), "playerName", null);
        setIntField(term943038, term943038.getClass(), "vocaloidPoints", 0);
        setIntField(term943038, term943038.getClass(), "level", 0);
        setIntField(term943038, term943038.getClass(), "levelExp", 0);
        setField(term943038, term943038.getClass(), "levelTitle", null);
        setIntField(term943038, term943038.getClass(), "plateId", 0);
        setIntField(term943038, term943038.getClass(), "plateEffectId", 0);
        setField(term943038, term943038.getClass(), "passwordStatus", null);
        setField(term943038, term943038.getClass(), "password", null);
        setBooleanField(term943038, term943038.getClass(), "preferPerPvModule", false);
        setBooleanField(term943038, term943038.getClass(), "preferCommonModule", false);
        setBooleanField(term943038, term943038.getClass(), "usePerPvSkin", false);
        setBooleanField(term943038, term943038.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term943038, term943038.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term943038, term943038.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term943038, term943038.getClass(), "usePerPvTouchSliderSe", false);
        setField(term943038, term943038.getClass(), "commonModule", null);
        setField(term943038, term943038.getClass(), "commonCustomizeItems", null);
        setField(term943038, term943038.getClass(), "commonModuleSetTime", null);
        setField(term943038, term943038.getClass(), "moduleSelectItemFlag", null);
        setIntField(term943038, term943038.getClass(), "commonSkin", 0);
        setIntField(term943038, term943038.getClass(), "headphoneVolume", 0);
        setBooleanField(term943038, term943038.getClass(), "buttonSeOn", false);
        setIntField(term943038, term943038.getClass(), "buttonSeVolume", 0);
        setIntField(term943038, term943038.getClass(), "sliderSeVolume", 0);
        setIntField(term943038, term943038.getClass(), "buttonSe", 0);
        setIntField(term943038, term943038.getClass(), "chainSlideSe", 0);
        setIntField(term943038, term943038.getClass(), "slideSe", 0);
        setIntField(term943038, term943038.getClass(), "sliderTouchSe", 0);
        setField(term943038, term943038.getClass(), "sortMode", null);
        setIntField(term943038, term943038.getClass(), "nextPvId", 0);
        setField(term943038, term943038.getClass(), "nextDifficulty", null);
        setField(term943038, term943038.getClass(), "nextEdition", null);
        setBooleanField(term943038, term943038.getClass(), "showInterimRanking", false);
        setBooleanField(term943038, term943038.getClass(), "showClearStatus", false);
        setBooleanField(term943038, term943038.getClass(), "showGreatBorder", false);
        setBooleanField(term943038, term943038.getClass(), "showExcellentBorder", false);
        setBooleanField(term943038, term943038.getClass(), "showRivalBorder", false);
        setBooleanField(term943038, term943038.getClass(), "showRgoSetting", false);
        setBooleanField(term943038, term943038.getClass(), "contestNowPlayingEnable", false);
        setIntField(term943038, term943038.getClass(), "contestNowPlayingId", 0);
        setIntField(term943038, term943038.getClass(), "contestNowPlayingValue", 0);
        setField(term943038, term943038.getClass(), "contestNowPlayingResultRank", null);
        setField(term943038, term943038.getClass(), "contestNowPlayingSpecifier", null);
        setField(term943038, term943038.getClass(), "myList0", null);
        setField(term943038, term943038.getClass(), "myList1", null);
        setField(term943038, term943038.getClass(), "myList2", null);
        setIntField(term943038, term943038.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContestNowPlayingId", argTypes, term943038, args);
    }

};


