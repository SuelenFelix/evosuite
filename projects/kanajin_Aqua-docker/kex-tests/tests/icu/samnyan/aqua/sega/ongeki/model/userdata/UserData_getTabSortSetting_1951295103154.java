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

public class UserData_getTabSortSetting_1951295103154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78128;

    public UserData_getTabSortSetting_1951295103154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78128 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78128, term78128.getClass(), "id", 0L);
        setField(term78128, term78128.getClass(), "card", null);
        setField(term78128, term78128.getClass(), "userName", null);
        setIntField(term78128, term78128.getClass(), "level", 0);
        setIntField(term78128, term78128.getClass(), "reincarnationNum", 0);
        setLongField(term78128, term78128.getClass(), "exp", 0L);
        setLongField(term78128, term78128.getClass(), "point", 0L);
        setLongField(term78128, term78128.getClass(), "totalPoint", 0L);
        setIntField(term78128, term78128.getClass(), "playCount", 0);
        setIntField(term78128, term78128.getClass(), "jewelCount", 0);
        setIntField(term78128, term78128.getClass(), "totalJewelCount", 0);
        setIntField(term78128, term78128.getClass(), "medalCount", 0);
        setIntField(term78128, term78128.getClass(), "playerRating", 0);
        setIntField(term78128, term78128.getClass(), "highestRating", 0);
        setIntField(term78128, term78128.getClass(), "battlePoint", 0);
        setIntField(term78128, term78128.getClass(), "bestBattlePoint", 0);
        setIntField(term78128, term78128.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78128, term78128.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78128, term78128.getClass(), "nameplateId", 0);
        setIntField(term78128, term78128.getClass(), "trophyId", 0);
        setIntField(term78128, term78128.getClass(), "cardId", 0);
        setIntField(term78128, term78128.getClass(), "characterId", 0);
        setIntField(term78128, term78128.getClass(), "characterVoiceNo", 0);
        setIntField(term78128, term78128.getClass(), "tabSetting", 0);
        setIntField(term78128, term78128.getClass(), "tabSortSetting", 0);
        setIntField(term78128, term78128.getClass(), "cardCategorySetting", 0);
        setIntField(term78128, term78128.getClass(), "cardSortSetting", 0);
        setIntField(term78128, term78128.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78128, term78128.getClass(), "playedTutorialBit", 0);
        setIntField(term78128, term78128.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78128, term78128.getClass(), "sumTechHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78128, term78128.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78128, term78128.getClass(), "eventWatchedDate", null);
        setField(term78128, term78128.getClass(), "cmEventWatchedDate", null);
        setField(term78128, term78128.getClass(), "firstGameId", null);
        setField(term78128, term78128.getClass(), "firstRomVersion", null);
        setField(term78128, term78128.getClass(), "firstDataVersion", null);
        setField(term78128, term78128.getClass(), "firstPlayDate", null);
        setField(term78128, term78128.getClass(), "lastGameId", null);
        setField(term78128, term78128.getClass(), "lastRomVersion", null);
        setField(term78128, term78128.getClass(), "lastDataVersion", null);
        setField(term78128, term78128.getClass(), "compatibleCmVersion", null);
        setField(term78128, term78128.getClass(), "lastPlayDate", null);
        setIntField(term78128, term78128.getClass(), "lastPlaceId", 0);
        setField(term78128, term78128.getClass(), "lastPlaceName", null);
        setIntField(term78128, term78128.getClass(), "lastRegionId", 0);
        setField(term78128, term78128.getClass(), "lastRegionName", null);
        setIntField(term78128, term78128.getClass(), "lastAllNetId", 0);
        setField(term78128, term78128.getClass(), "lastClientId", null);
        setIntField(term78128, term78128.getClass(), "lastUsedDeckId", 0);
        setIntField(term78128, term78128.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78128, term78128.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTabSortSetting", argTypes, term78128, args);
    }

};


