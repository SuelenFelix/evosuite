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

public class UserData_getTrophyId_1013988847149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77893;

    public UserData_getTrophyId_1013988847149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77893 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77893, term77893.getClass(), "id", 0L);
        setField(term77893, term77893.getClass(), "card", null);
        setField(term77893, term77893.getClass(), "userName", null);
        setIntField(term77893, term77893.getClass(), "level", 0);
        setIntField(term77893, term77893.getClass(), "reincarnationNum", 0);
        setLongField(term77893, term77893.getClass(), "exp", 0L);
        setLongField(term77893, term77893.getClass(), "point", 0L);
        setLongField(term77893, term77893.getClass(), "totalPoint", 0L);
        setIntField(term77893, term77893.getClass(), "playCount", 0);
        setIntField(term77893, term77893.getClass(), "jewelCount", 0);
        setIntField(term77893, term77893.getClass(), "totalJewelCount", 0);
        setIntField(term77893, term77893.getClass(), "medalCount", 0);
        setIntField(term77893, term77893.getClass(), "playerRating", 0);
        setIntField(term77893, term77893.getClass(), "highestRating", 0);
        setIntField(term77893, term77893.getClass(), "battlePoint", 0);
        setIntField(term77893, term77893.getClass(), "bestBattlePoint", 0);
        setIntField(term77893, term77893.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77893, term77893.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77893, term77893.getClass(), "nameplateId", 0);
        setIntField(term77893, term77893.getClass(), "trophyId", 0);
        setIntField(term77893, term77893.getClass(), "cardId", 0);
        setIntField(term77893, term77893.getClass(), "characterId", 0);
        setIntField(term77893, term77893.getClass(), "characterVoiceNo", 0);
        setIntField(term77893, term77893.getClass(), "tabSetting", 0);
        setIntField(term77893, term77893.getClass(), "tabSortSetting", 0);
        setIntField(term77893, term77893.getClass(), "cardCategorySetting", 0);
        setIntField(term77893, term77893.getClass(), "cardSortSetting", 0);
        setIntField(term77893, term77893.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77893, term77893.getClass(), "playedTutorialBit", 0);
        setIntField(term77893, term77893.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77893, term77893.getClass(), "sumTechHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77893, term77893.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77893, term77893.getClass(), "eventWatchedDate", null);
        setField(term77893, term77893.getClass(), "cmEventWatchedDate", null);
        setField(term77893, term77893.getClass(), "firstGameId", null);
        setField(term77893, term77893.getClass(), "firstRomVersion", null);
        setField(term77893, term77893.getClass(), "firstDataVersion", null);
        setField(term77893, term77893.getClass(), "firstPlayDate", null);
        setField(term77893, term77893.getClass(), "lastGameId", null);
        setField(term77893, term77893.getClass(), "lastRomVersion", null);
        setField(term77893, term77893.getClass(), "lastDataVersion", null);
        setField(term77893, term77893.getClass(), "compatibleCmVersion", null);
        setField(term77893, term77893.getClass(), "lastPlayDate", null);
        setIntField(term77893, term77893.getClass(), "lastPlaceId", 0);
        setField(term77893, term77893.getClass(), "lastPlaceName", null);
        setIntField(term77893, term77893.getClass(), "lastRegionId", 0);
        setField(term77893, term77893.getClass(), "lastRegionName", null);
        setIntField(term77893, term77893.getClass(), "lastAllNetId", 0);
        setField(term77893, term77893.getClass(), "lastClientId", null);
        setIntField(term77893, term77893.getClass(), "lastUsedDeckId", 0);
        setIntField(term77893, term77893.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77893, term77893.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrophyId", argTypes, term77893, args);
    }

};


