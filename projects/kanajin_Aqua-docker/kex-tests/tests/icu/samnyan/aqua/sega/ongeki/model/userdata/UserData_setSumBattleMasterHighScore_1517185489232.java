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

public class UserData_setSumBattleMasterHighScore_1517185489232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81870;
     Object term81917;

    public UserData_setSumBattleMasterHighScore_1517185489232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81870 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81870, term81870.getClass(), "id", 0L);
        setField(term81870, term81870.getClass(), "card", null);
        setField(term81870, term81870.getClass(), "userName", null);
        setIntField(term81870, term81870.getClass(), "level", 0);
        setIntField(term81870, term81870.getClass(), "reincarnationNum", 0);
        setLongField(term81870, term81870.getClass(), "exp", 0L);
        setLongField(term81870, term81870.getClass(), "point", 0L);
        setLongField(term81870, term81870.getClass(), "totalPoint", 0L);
        setIntField(term81870, term81870.getClass(), "playCount", 0);
        setIntField(term81870, term81870.getClass(), "jewelCount", 0);
        setIntField(term81870, term81870.getClass(), "totalJewelCount", 0);
        setIntField(term81870, term81870.getClass(), "medalCount", 0);
        setIntField(term81870, term81870.getClass(), "playerRating", 0);
        setIntField(term81870, term81870.getClass(), "highestRating", 0);
        setIntField(term81870, term81870.getClass(), "battlePoint", 0);
        setIntField(term81870, term81870.getClass(), "bestBattlePoint", 0);
        setIntField(term81870, term81870.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81870, term81870.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81870, term81870.getClass(), "nameplateId", 0);
        setIntField(term81870, term81870.getClass(), "trophyId", 0);
        setIntField(term81870, term81870.getClass(), "cardId", 0);
        setIntField(term81870, term81870.getClass(), "characterId", 0);
        setIntField(term81870, term81870.getClass(), "characterVoiceNo", 0);
        setIntField(term81870, term81870.getClass(), "tabSetting", 0);
        setIntField(term81870, term81870.getClass(), "tabSortSetting", 0);
        setIntField(term81870, term81870.getClass(), "cardCategorySetting", 0);
        setIntField(term81870, term81870.getClass(), "cardSortSetting", 0);
        setIntField(term81870, term81870.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81870, term81870.getClass(), "playedTutorialBit", 0);
        setIntField(term81870, term81870.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81870, term81870.getClass(), "sumTechHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81870, term81870.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81870, term81870.getClass(), "eventWatchedDate", null);
        setField(term81870, term81870.getClass(), "cmEventWatchedDate", null);
        setField(term81870, term81870.getClass(), "firstGameId", null);
        setField(term81870, term81870.getClass(), "firstRomVersion", null);
        setField(term81870, term81870.getClass(), "firstDataVersion", null);
        setField(term81870, term81870.getClass(), "firstPlayDate", null);
        setField(term81870, term81870.getClass(), "lastGameId", null);
        setField(term81870, term81870.getClass(), "lastRomVersion", null);
        setField(term81870, term81870.getClass(), "lastDataVersion", null);
        setField(term81870, term81870.getClass(), "compatibleCmVersion", null);
        setField(term81870, term81870.getClass(), "lastPlayDate", null);
        setIntField(term81870, term81870.getClass(), "lastPlaceId", 0);
        setField(term81870, term81870.getClass(), "lastPlaceName", null);
        setIntField(term81870, term81870.getClass(), "lastRegionId", 0);
        setField(term81870, term81870.getClass(), "lastRegionName", null);
        setIntField(term81870, term81870.getClass(), "lastAllNetId", 0);
        setField(term81870, term81870.getClass(), "lastClientId", null);
        setIntField(term81870, term81870.getClass(), "lastUsedDeckId", 0);
        setIntField(term81870, term81870.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81870, term81870.getClass(), "lastEmoneyBrand", 0);
        term81917 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81917;
        callMethod(klass, "setSumBattleMasterHighScore", argTypes, term81870, args);
    }

};


