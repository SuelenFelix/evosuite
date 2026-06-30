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

public class UserData_setSumTechBasicHighScore_341294587223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81429;
     Object term81476;

    public UserData_setSumTechBasicHighScore_341294587223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81429 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81429, term81429.getClass(), "id", 0L);
        setField(term81429, term81429.getClass(), "card", null);
        setField(term81429, term81429.getClass(), "userName", null);
        setIntField(term81429, term81429.getClass(), "level", 0);
        setIntField(term81429, term81429.getClass(), "reincarnationNum", 0);
        setLongField(term81429, term81429.getClass(), "exp", 0L);
        setLongField(term81429, term81429.getClass(), "point", 0L);
        setLongField(term81429, term81429.getClass(), "totalPoint", 0L);
        setIntField(term81429, term81429.getClass(), "playCount", 0);
        setIntField(term81429, term81429.getClass(), "jewelCount", 0);
        setIntField(term81429, term81429.getClass(), "totalJewelCount", 0);
        setIntField(term81429, term81429.getClass(), "medalCount", 0);
        setIntField(term81429, term81429.getClass(), "playerRating", 0);
        setIntField(term81429, term81429.getClass(), "highestRating", 0);
        setIntField(term81429, term81429.getClass(), "battlePoint", 0);
        setIntField(term81429, term81429.getClass(), "bestBattlePoint", 0);
        setIntField(term81429, term81429.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81429, term81429.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81429, term81429.getClass(), "nameplateId", 0);
        setIntField(term81429, term81429.getClass(), "trophyId", 0);
        setIntField(term81429, term81429.getClass(), "cardId", 0);
        setIntField(term81429, term81429.getClass(), "characterId", 0);
        setIntField(term81429, term81429.getClass(), "characterVoiceNo", 0);
        setIntField(term81429, term81429.getClass(), "tabSetting", 0);
        setIntField(term81429, term81429.getClass(), "tabSortSetting", 0);
        setIntField(term81429, term81429.getClass(), "cardCategorySetting", 0);
        setIntField(term81429, term81429.getClass(), "cardSortSetting", 0);
        setIntField(term81429, term81429.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81429, term81429.getClass(), "playedTutorialBit", 0);
        setIntField(term81429, term81429.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81429, term81429.getClass(), "sumTechHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81429, term81429.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81429, term81429.getClass(), "eventWatchedDate", null);
        setField(term81429, term81429.getClass(), "cmEventWatchedDate", null);
        setField(term81429, term81429.getClass(), "firstGameId", null);
        setField(term81429, term81429.getClass(), "firstRomVersion", null);
        setField(term81429, term81429.getClass(), "firstDataVersion", null);
        setField(term81429, term81429.getClass(), "firstPlayDate", null);
        setField(term81429, term81429.getClass(), "lastGameId", null);
        setField(term81429, term81429.getClass(), "lastRomVersion", null);
        setField(term81429, term81429.getClass(), "lastDataVersion", null);
        setField(term81429, term81429.getClass(), "compatibleCmVersion", null);
        setField(term81429, term81429.getClass(), "lastPlayDate", null);
        setIntField(term81429, term81429.getClass(), "lastPlaceId", 0);
        setField(term81429, term81429.getClass(), "lastPlaceName", null);
        setIntField(term81429, term81429.getClass(), "lastRegionId", 0);
        setField(term81429, term81429.getClass(), "lastRegionName", null);
        setIntField(term81429, term81429.getClass(), "lastAllNetId", 0);
        setField(term81429, term81429.getClass(), "lastClientId", null);
        setIntField(term81429, term81429.getClass(), "lastUsedDeckId", 0);
        setIntField(term81429, term81429.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81429, term81429.getClass(), "lastEmoneyBrand", 0);
        term81476 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81476;
        callMethod(klass, "setSumTechBasicHighScore", argTypes, term81429, args);
    }

};


