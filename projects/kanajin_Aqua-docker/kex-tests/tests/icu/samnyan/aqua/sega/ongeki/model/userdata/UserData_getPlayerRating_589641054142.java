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

public class UserData_getPlayerRating_589641054142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77564;

    public UserData_getPlayerRating_589641054142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77564 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77564, term77564.getClass(), "id", 0L);
        setField(term77564, term77564.getClass(), "card", null);
        setField(term77564, term77564.getClass(), "userName", null);
        setIntField(term77564, term77564.getClass(), "level", 0);
        setIntField(term77564, term77564.getClass(), "reincarnationNum", 0);
        setLongField(term77564, term77564.getClass(), "exp", 0L);
        setLongField(term77564, term77564.getClass(), "point", 0L);
        setLongField(term77564, term77564.getClass(), "totalPoint", 0L);
        setIntField(term77564, term77564.getClass(), "playCount", 0);
        setIntField(term77564, term77564.getClass(), "jewelCount", 0);
        setIntField(term77564, term77564.getClass(), "totalJewelCount", 0);
        setIntField(term77564, term77564.getClass(), "medalCount", 0);
        setIntField(term77564, term77564.getClass(), "playerRating", 0);
        setIntField(term77564, term77564.getClass(), "highestRating", 0);
        setIntField(term77564, term77564.getClass(), "battlePoint", 0);
        setIntField(term77564, term77564.getClass(), "bestBattlePoint", 0);
        setIntField(term77564, term77564.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77564, term77564.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77564, term77564.getClass(), "nameplateId", 0);
        setIntField(term77564, term77564.getClass(), "trophyId", 0);
        setIntField(term77564, term77564.getClass(), "cardId", 0);
        setIntField(term77564, term77564.getClass(), "characterId", 0);
        setIntField(term77564, term77564.getClass(), "characterVoiceNo", 0);
        setIntField(term77564, term77564.getClass(), "tabSetting", 0);
        setIntField(term77564, term77564.getClass(), "tabSortSetting", 0);
        setIntField(term77564, term77564.getClass(), "cardCategorySetting", 0);
        setIntField(term77564, term77564.getClass(), "cardSortSetting", 0);
        setIntField(term77564, term77564.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77564, term77564.getClass(), "playedTutorialBit", 0);
        setIntField(term77564, term77564.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77564, term77564.getClass(), "sumTechHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77564, term77564.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77564, term77564.getClass(), "eventWatchedDate", null);
        setField(term77564, term77564.getClass(), "cmEventWatchedDate", null);
        setField(term77564, term77564.getClass(), "firstGameId", null);
        setField(term77564, term77564.getClass(), "firstRomVersion", null);
        setField(term77564, term77564.getClass(), "firstDataVersion", null);
        setField(term77564, term77564.getClass(), "firstPlayDate", null);
        setField(term77564, term77564.getClass(), "lastGameId", null);
        setField(term77564, term77564.getClass(), "lastRomVersion", null);
        setField(term77564, term77564.getClass(), "lastDataVersion", null);
        setField(term77564, term77564.getClass(), "compatibleCmVersion", null);
        setField(term77564, term77564.getClass(), "lastPlayDate", null);
        setIntField(term77564, term77564.getClass(), "lastPlaceId", 0);
        setField(term77564, term77564.getClass(), "lastPlaceName", null);
        setIntField(term77564, term77564.getClass(), "lastRegionId", 0);
        setField(term77564, term77564.getClass(), "lastRegionName", null);
        setIntField(term77564, term77564.getClass(), "lastAllNetId", 0);
        setField(term77564, term77564.getClass(), "lastClientId", null);
        setIntField(term77564, term77564.getClass(), "lastUsedDeckId", 0);
        setIntField(term77564, term77564.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77564, term77564.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term77564, args);
    }

};


