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
import java.lang.Long;

public class UserData_setSumTechAdvancedHighScore_1754103667224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81478;
     Object term81525;

    public UserData_setSumTechAdvancedHighScore_1754103667224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81478 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81478, term81478.getClass(), "id", 0L);
        setField(term81478, term81478.getClass(), "card", null);
        setField(term81478, term81478.getClass(), "userName", null);
        setIntField(term81478, term81478.getClass(), "level", 0);
        setIntField(term81478, term81478.getClass(), "reincarnationNum", 0);
        setLongField(term81478, term81478.getClass(), "exp", 0L);
        setLongField(term81478, term81478.getClass(), "point", 0L);
        setLongField(term81478, term81478.getClass(), "totalPoint", 0L);
        setIntField(term81478, term81478.getClass(), "playCount", 0);
        setIntField(term81478, term81478.getClass(), "jewelCount", 0);
        setIntField(term81478, term81478.getClass(), "totalJewelCount", 0);
        setIntField(term81478, term81478.getClass(), "medalCount", 0);
        setIntField(term81478, term81478.getClass(), "playerRating", 0);
        setIntField(term81478, term81478.getClass(), "highestRating", 0);
        setIntField(term81478, term81478.getClass(), "battlePoint", 0);
        setIntField(term81478, term81478.getClass(), "bestBattlePoint", 0);
        setIntField(term81478, term81478.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81478, term81478.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81478, term81478.getClass(), "nameplateId", 0);
        setIntField(term81478, term81478.getClass(), "trophyId", 0);
        setIntField(term81478, term81478.getClass(), "cardId", 0);
        setIntField(term81478, term81478.getClass(), "characterId", 0);
        setIntField(term81478, term81478.getClass(), "characterVoiceNo", 0);
        setIntField(term81478, term81478.getClass(), "tabSetting", 0);
        setIntField(term81478, term81478.getClass(), "tabSortSetting", 0);
        setIntField(term81478, term81478.getClass(), "cardCategorySetting", 0);
        setIntField(term81478, term81478.getClass(), "cardSortSetting", 0);
        setIntField(term81478, term81478.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81478, term81478.getClass(), "playedTutorialBit", 0);
        setIntField(term81478, term81478.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81478, term81478.getClass(), "sumTechHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81478, term81478.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81478, term81478.getClass(), "eventWatchedDate", null);
        setField(term81478, term81478.getClass(), "cmEventWatchedDate", null);
        setField(term81478, term81478.getClass(), "firstGameId", null);
        setField(term81478, term81478.getClass(), "firstRomVersion", null);
        setField(term81478, term81478.getClass(), "firstDataVersion", null);
        setField(term81478, term81478.getClass(), "firstPlayDate", null);
        setField(term81478, term81478.getClass(), "lastGameId", null);
        setField(term81478, term81478.getClass(), "lastRomVersion", null);
        setField(term81478, term81478.getClass(), "lastDataVersion", null);
        setField(term81478, term81478.getClass(), "compatibleCmVersion", null);
        setField(term81478, term81478.getClass(), "lastPlayDate", null);
        setIntField(term81478, term81478.getClass(), "lastPlaceId", 0);
        setField(term81478, term81478.getClass(), "lastPlaceName", null);
        setIntField(term81478, term81478.getClass(), "lastRegionId", 0);
        setField(term81478, term81478.getClass(), "lastRegionName", null);
        setIntField(term81478, term81478.getClass(), "lastAllNetId", 0);
        setField(term81478, term81478.getClass(), "lastClientId", null);
        setIntField(term81478, term81478.getClass(), "lastUsedDeckId", 0);
        setIntField(term81478, term81478.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81478, term81478.getClass(), "lastEmoneyBrand", 0);
        term81525 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81525;
        callMethod(klass, "setSumTechAdvancedHighScore", argTypes, term81478, args);
    }

};


