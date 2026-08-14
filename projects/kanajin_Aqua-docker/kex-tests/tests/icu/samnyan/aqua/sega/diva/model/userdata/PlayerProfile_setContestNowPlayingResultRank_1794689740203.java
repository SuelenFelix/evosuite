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

public class PlayerProfile_setContestNowPlayingResultRank_1794689740203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4917769;

    public PlayerProfile_setContestNowPlayingResultRank_1794689740203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4917769 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile"));
        setLongField(term4917769, term4917769.getClass(), "id", 0L);
        setIntField(term4917769, term4917769.getClass(), "pdId", 0);
        setField(term4917769, term4917769.getClass(), "playerName", null);
        setIntField(term4917769, term4917769.getClass(), "vocaloidPoints", 0);
        setIntField(term4917769, term4917769.getClass(), "level", 0);
        setIntField(term4917769, term4917769.getClass(), "levelExp", 0);
        setField(term4917769, term4917769.getClass(), "levelTitle", null);
        setIntField(term4917769, term4917769.getClass(), "plateId", 0);
        setIntField(term4917769, term4917769.getClass(), "plateEffectId", 0);
        setField(term4917769, term4917769.getClass(), "passwordStatus", null);
        setField(term4917769, term4917769.getClass(), "password", null);
        setBooleanField(term4917769, term4917769.getClass(), "preferPerPvModule", false);
        setBooleanField(term4917769, term4917769.getClass(), "preferCommonModule", false);
        setBooleanField(term4917769, term4917769.getClass(), "usePerPvSkin", false);
        setBooleanField(term4917769, term4917769.getClass(), "usePerPvButtonSe", false);
        setBooleanField(term4917769, term4917769.getClass(), "usePerPvSliderSe", false);
        setBooleanField(term4917769, term4917769.getClass(), "usePerPvChainSliderSe", false);
        setBooleanField(term4917769, term4917769.getClass(), "usePerPvTouchSliderSe", false);
        setField(term4917769, term4917769.getClass(), "commonModule", null);
        setField(term4917769, term4917769.getClass(), "commonCustomizeItems", null);
        setField(term4917769, term4917769.getClass(), "commonModuleSetTime", null);
        setField(term4917769, term4917769.getClass(), "moduleSelectItemFlag", null);
        setIntField(term4917769, term4917769.getClass(), "commonSkin", 0);
        setIntField(term4917769, term4917769.getClass(), "headphoneVolume", 0);
        setBooleanField(term4917769, term4917769.getClass(), "buttonSeOn", false);
        setIntField(term4917769, term4917769.getClass(), "buttonSeVolume", 0);
        setIntField(term4917769, term4917769.getClass(), "sliderSeVolume", 0);
        setIntField(term4917769, term4917769.getClass(), "buttonSe", 0);
        setIntField(term4917769, term4917769.getClass(), "chainSlideSe", 0);
        setIntField(term4917769, term4917769.getClass(), "slideSe", 0);
        setIntField(term4917769, term4917769.getClass(), "sliderTouchSe", 0);
        setField(term4917769, term4917769.getClass(), "sortMode", null);
        setIntField(term4917769, term4917769.getClass(), "nextPvId", 0);
        setField(term4917769, term4917769.getClass(), "nextDifficulty", null);
        setField(term4917769, term4917769.getClass(), "nextEdition", null);
        setBooleanField(term4917769, term4917769.getClass(), "showInterimRanking", false);
        setBooleanField(term4917769, term4917769.getClass(), "showClearStatus", false);
        setBooleanField(term4917769, term4917769.getClass(), "showGreatBorder", false);
        setBooleanField(term4917769, term4917769.getClass(), "showExcellentBorder", false);
        setBooleanField(term4917769, term4917769.getClass(), "showRivalBorder", false);
        setBooleanField(term4917769, term4917769.getClass(), "showRgoSetting", false);
        setBooleanField(term4917769, term4917769.getClass(), "contestNowPlayingEnable", false);
        setIntField(term4917769, term4917769.getClass(), "contestNowPlayingId", 0);
        setIntField(term4917769, term4917769.getClass(), "contestNowPlayingValue", 0);
        setField(term4917769, term4917769.getClass(), "contestNowPlayingResultRank", null);
        setField(term4917769, term4917769.getClass(), "contestNowPlayingSpecifier", null);
        setField(term4917769, term4917769.getClass(), "myList0", null);
        setField(term4917769, term4917769.getClass(), "myList1", null);
        setField(term4917769, term4917769.getClass(), "myList2", null);
        setIntField(term4917769, term4917769.getClass(), "rivalPdId", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayerProfile");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ContestBorder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setContestNowPlayingResultRank", argTypes, term4917769, args);
    }

};


