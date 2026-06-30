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

public class UserData_getLastUsedDeckId_128108549189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79773;

    public UserData_getLastUsedDeckId_128108549189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79773 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79773, term79773.getClass(), "id", 0L);
        setField(term79773, term79773.getClass(), "card", null);
        setField(term79773, term79773.getClass(), "userName", null);
        setIntField(term79773, term79773.getClass(), "level", 0);
        setIntField(term79773, term79773.getClass(), "reincarnationNum", 0);
        setLongField(term79773, term79773.getClass(), "exp", 0L);
        setLongField(term79773, term79773.getClass(), "point", 0L);
        setLongField(term79773, term79773.getClass(), "totalPoint", 0L);
        setIntField(term79773, term79773.getClass(), "playCount", 0);
        setIntField(term79773, term79773.getClass(), "jewelCount", 0);
        setIntField(term79773, term79773.getClass(), "totalJewelCount", 0);
        setIntField(term79773, term79773.getClass(), "medalCount", 0);
        setIntField(term79773, term79773.getClass(), "playerRating", 0);
        setIntField(term79773, term79773.getClass(), "highestRating", 0);
        setIntField(term79773, term79773.getClass(), "battlePoint", 0);
        setIntField(term79773, term79773.getClass(), "bestBattlePoint", 0);
        setIntField(term79773, term79773.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79773, term79773.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79773, term79773.getClass(), "nameplateId", 0);
        setIntField(term79773, term79773.getClass(), "trophyId", 0);
        setIntField(term79773, term79773.getClass(), "cardId", 0);
        setIntField(term79773, term79773.getClass(), "characterId", 0);
        setIntField(term79773, term79773.getClass(), "characterVoiceNo", 0);
        setIntField(term79773, term79773.getClass(), "tabSetting", 0);
        setIntField(term79773, term79773.getClass(), "tabSortSetting", 0);
        setIntField(term79773, term79773.getClass(), "cardCategorySetting", 0);
        setIntField(term79773, term79773.getClass(), "cardSortSetting", 0);
        setIntField(term79773, term79773.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79773, term79773.getClass(), "playedTutorialBit", 0);
        setIntField(term79773, term79773.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79773, term79773.getClass(), "sumTechHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79773, term79773.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79773, term79773.getClass(), "eventWatchedDate", null);
        setField(term79773, term79773.getClass(), "cmEventWatchedDate", null);
        setField(term79773, term79773.getClass(), "firstGameId", null);
        setField(term79773, term79773.getClass(), "firstRomVersion", null);
        setField(term79773, term79773.getClass(), "firstDataVersion", null);
        setField(term79773, term79773.getClass(), "firstPlayDate", null);
        setField(term79773, term79773.getClass(), "lastGameId", null);
        setField(term79773, term79773.getClass(), "lastRomVersion", null);
        setField(term79773, term79773.getClass(), "lastDataVersion", null);
        setField(term79773, term79773.getClass(), "compatibleCmVersion", null);
        setField(term79773, term79773.getClass(), "lastPlayDate", null);
        setIntField(term79773, term79773.getClass(), "lastPlaceId", 0);
        setField(term79773, term79773.getClass(), "lastPlaceName", null);
        setIntField(term79773, term79773.getClass(), "lastRegionId", 0);
        setField(term79773, term79773.getClass(), "lastRegionName", null);
        setIntField(term79773, term79773.getClass(), "lastAllNetId", 0);
        setField(term79773, term79773.getClass(), "lastClientId", null);
        setIntField(term79773, term79773.getClass(), "lastUsedDeckId", 0);
        setIntField(term79773, term79773.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79773, term79773.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUsedDeckId", argTypes, term79773, args);
    }

};


