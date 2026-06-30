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

public class UserData_setSumTechHighScore_1216715253222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81380;
     Object term81427;

    public UserData_setSumTechHighScore_1216715253222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81380 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81380, term81380.getClass(), "id", 0L);
        setField(term81380, term81380.getClass(), "card", null);
        setField(term81380, term81380.getClass(), "userName", null);
        setIntField(term81380, term81380.getClass(), "level", 0);
        setIntField(term81380, term81380.getClass(), "reincarnationNum", 0);
        setLongField(term81380, term81380.getClass(), "exp", 0L);
        setLongField(term81380, term81380.getClass(), "point", 0L);
        setLongField(term81380, term81380.getClass(), "totalPoint", 0L);
        setIntField(term81380, term81380.getClass(), "playCount", 0);
        setIntField(term81380, term81380.getClass(), "jewelCount", 0);
        setIntField(term81380, term81380.getClass(), "totalJewelCount", 0);
        setIntField(term81380, term81380.getClass(), "medalCount", 0);
        setIntField(term81380, term81380.getClass(), "playerRating", 0);
        setIntField(term81380, term81380.getClass(), "highestRating", 0);
        setIntField(term81380, term81380.getClass(), "battlePoint", 0);
        setIntField(term81380, term81380.getClass(), "bestBattlePoint", 0);
        setIntField(term81380, term81380.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81380, term81380.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81380, term81380.getClass(), "nameplateId", 0);
        setIntField(term81380, term81380.getClass(), "trophyId", 0);
        setIntField(term81380, term81380.getClass(), "cardId", 0);
        setIntField(term81380, term81380.getClass(), "characterId", 0);
        setIntField(term81380, term81380.getClass(), "characterVoiceNo", 0);
        setIntField(term81380, term81380.getClass(), "tabSetting", 0);
        setIntField(term81380, term81380.getClass(), "tabSortSetting", 0);
        setIntField(term81380, term81380.getClass(), "cardCategorySetting", 0);
        setIntField(term81380, term81380.getClass(), "cardSortSetting", 0);
        setIntField(term81380, term81380.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81380, term81380.getClass(), "playedTutorialBit", 0);
        setIntField(term81380, term81380.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81380, term81380.getClass(), "sumTechHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81380, term81380.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81380, term81380.getClass(), "eventWatchedDate", null);
        setField(term81380, term81380.getClass(), "cmEventWatchedDate", null);
        setField(term81380, term81380.getClass(), "firstGameId", null);
        setField(term81380, term81380.getClass(), "firstRomVersion", null);
        setField(term81380, term81380.getClass(), "firstDataVersion", null);
        setField(term81380, term81380.getClass(), "firstPlayDate", null);
        setField(term81380, term81380.getClass(), "lastGameId", null);
        setField(term81380, term81380.getClass(), "lastRomVersion", null);
        setField(term81380, term81380.getClass(), "lastDataVersion", null);
        setField(term81380, term81380.getClass(), "compatibleCmVersion", null);
        setField(term81380, term81380.getClass(), "lastPlayDate", null);
        setIntField(term81380, term81380.getClass(), "lastPlaceId", 0);
        setField(term81380, term81380.getClass(), "lastPlaceName", null);
        setIntField(term81380, term81380.getClass(), "lastRegionId", 0);
        setField(term81380, term81380.getClass(), "lastRegionName", null);
        setIntField(term81380, term81380.getClass(), "lastAllNetId", 0);
        setField(term81380, term81380.getClass(), "lastClientId", null);
        setIntField(term81380, term81380.getClass(), "lastUsedDeckId", 0);
        setIntField(term81380, term81380.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81380, term81380.getClass(), "lastEmoneyBrand", 0);
        term81427 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81427;
        callMethod(klass, "setSumTechHighScore", argTypes, term81380, args);
    }

};


