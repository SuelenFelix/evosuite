package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setLastRegionId_77521429247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82581;
     Object term82628;

    public UserData_setLastRegionId_77521429247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82581 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term82581, term82581.getClass(), "id", 0L);
        setField(term82581, term82581.getClass(), "card", null);
        setField(term82581, term82581.getClass(), "userName", null);
        setIntField(term82581, term82581.getClass(), "level", 0);
        setIntField(term82581, term82581.getClass(), "reincarnationNum", 0);
        setLongField(term82581, term82581.getClass(), "exp", 0L);
        setLongField(term82581, term82581.getClass(), "point", 0L);
        setLongField(term82581, term82581.getClass(), "totalPoint", 0L);
        setIntField(term82581, term82581.getClass(), "playCount", 0);
        setIntField(term82581, term82581.getClass(), "jewelCount", 0);
        setIntField(term82581, term82581.getClass(), "totalJewelCount", 0);
        setIntField(term82581, term82581.getClass(), "medalCount", 0);
        setIntField(term82581, term82581.getClass(), "playerRating", 0);
        setIntField(term82581, term82581.getClass(), "highestRating", 0);
        setIntField(term82581, term82581.getClass(), "battlePoint", 0);
        setIntField(term82581, term82581.getClass(), "bestBattlePoint", 0);
        setIntField(term82581, term82581.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term82581, term82581.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term82581, term82581.getClass(), "nameplateId", 0);
        setIntField(term82581, term82581.getClass(), "trophyId", 0);
        setIntField(term82581, term82581.getClass(), "cardId", 0);
        setIntField(term82581, term82581.getClass(), "characterId", 0);
        setIntField(term82581, term82581.getClass(), "characterVoiceNo", 0);
        setIntField(term82581, term82581.getClass(), "tabSetting", 0);
        setIntField(term82581, term82581.getClass(), "tabSortSetting", 0);
        setIntField(term82581, term82581.getClass(), "cardCategorySetting", 0);
        setIntField(term82581, term82581.getClass(), "cardSortSetting", 0);
        setIntField(term82581, term82581.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term82581, term82581.getClass(), "playedTutorialBit", 0);
        setIntField(term82581, term82581.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term82581, term82581.getClass(), "sumTechHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term82581, term82581.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term82581, term82581.getClass(), "eventWatchedDate", null);
        setField(term82581, term82581.getClass(), "cmEventWatchedDate", null);
        setField(term82581, term82581.getClass(), "firstGameId", null);
        setField(term82581, term82581.getClass(), "firstRomVersion", null);
        setField(term82581, term82581.getClass(), "firstDataVersion", null);
        setField(term82581, term82581.getClass(), "firstPlayDate", null);
        setField(term82581, term82581.getClass(), "lastGameId", null);
        setField(term82581, term82581.getClass(), "lastRomVersion", null);
        setField(term82581, term82581.getClass(), "lastDataVersion", null);
        setField(term82581, term82581.getClass(), "compatibleCmVersion", null);
        setField(term82581, term82581.getClass(), "lastPlayDate", null);
        setIntField(term82581, term82581.getClass(), "lastPlaceId", 0);
        setField(term82581, term82581.getClass(), "lastPlaceName", null);
        setIntField(term82581, term82581.getClass(), "lastRegionId", 0);
        setField(term82581, term82581.getClass(), "lastRegionName", null);
        setIntField(term82581, term82581.getClass(), "lastAllNetId", 0);
        setField(term82581, term82581.getClass(), "lastClientId", null);
        setIntField(term82581, term82581.getClass(), "lastUsedDeckId", 0);
        setIntField(term82581, term82581.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term82581, term82581.getClass(), "lastEmoneyBrand", 0);
        term82628 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term82628;
        callMethod(klass, "setLastRegionId", argTypes, term82581, args);
    }

};


