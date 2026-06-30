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

public class UserData_getJewelCount_2046587728139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77423;

    public UserData_getJewelCount_2046587728139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77423 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77423, term77423.getClass(), "id", 0L);
        setField(term77423, term77423.getClass(), "card", null);
        setField(term77423, term77423.getClass(), "userName", null);
        setIntField(term77423, term77423.getClass(), "level", 0);
        setIntField(term77423, term77423.getClass(), "reincarnationNum", 0);
        setLongField(term77423, term77423.getClass(), "exp", 0L);
        setLongField(term77423, term77423.getClass(), "point", 0L);
        setLongField(term77423, term77423.getClass(), "totalPoint", 0L);
        setIntField(term77423, term77423.getClass(), "playCount", 0);
        setIntField(term77423, term77423.getClass(), "jewelCount", 0);
        setIntField(term77423, term77423.getClass(), "totalJewelCount", 0);
        setIntField(term77423, term77423.getClass(), "medalCount", 0);
        setIntField(term77423, term77423.getClass(), "playerRating", 0);
        setIntField(term77423, term77423.getClass(), "highestRating", 0);
        setIntField(term77423, term77423.getClass(), "battlePoint", 0);
        setIntField(term77423, term77423.getClass(), "bestBattlePoint", 0);
        setIntField(term77423, term77423.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77423, term77423.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77423, term77423.getClass(), "nameplateId", 0);
        setIntField(term77423, term77423.getClass(), "trophyId", 0);
        setIntField(term77423, term77423.getClass(), "cardId", 0);
        setIntField(term77423, term77423.getClass(), "characterId", 0);
        setIntField(term77423, term77423.getClass(), "characterVoiceNo", 0);
        setIntField(term77423, term77423.getClass(), "tabSetting", 0);
        setIntField(term77423, term77423.getClass(), "tabSortSetting", 0);
        setIntField(term77423, term77423.getClass(), "cardCategorySetting", 0);
        setIntField(term77423, term77423.getClass(), "cardSortSetting", 0);
        setIntField(term77423, term77423.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77423, term77423.getClass(), "playedTutorialBit", 0);
        setIntField(term77423, term77423.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77423, term77423.getClass(), "sumTechHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77423, term77423.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77423, term77423.getClass(), "eventWatchedDate", null);
        setField(term77423, term77423.getClass(), "cmEventWatchedDate", null);
        setField(term77423, term77423.getClass(), "firstGameId", null);
        setField(term77423, term77423.getClass(), "firstRomVersion", null);
        setField(term77423, term77423.getClass(), "firstDataVersion", null);
        setField(term77423, term77423.getClass(), "firstPlayDate", null);
        setField(term77423, term77423.getClass(), "lastGameId", null);
        setField(term77423, term77423.getClass(), "lastRomVersion", null);
        setField(term77423, term77423.getClass(), "lastDataVersion", null);
        setField(term77423, term77423.getClass(), "compatibleCmVersion", null);
        setField(term77423, term77423.getClass(), "lastPlayDate", null);
        setIntField(term77423, term77423.getClass(), "lastPlaceId", 0);
        setField(term77423, term77423.getClass(), "lastPlaceName", null);
        setIntField(term77423, term77423.getClass(), "lastRegionId", 0);
        setField(term77423, term77423.getClass(), "lastRegionName", null);
        setIntField(term77423, term77423.getClass(), "lastAllNetId", 0);
        setField(term77423, term77423.getClass(), "lastClientId", null);
        setIntField(term77423, term77423.getClass(), "lastUsedDeckId", 0);
        setIntField(term77423, term77423.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77423, term77423.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJewelCount", argTypes, term77423, args);
    }

};


