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

public class UserData_getFirstGameId_196102982174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79068;

    public UserData_getFirstGameId_196102982174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79068 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79068, term79068.getClass(), "id", 0L);
        setField(term79068, term79068.getClass(), "card", null);
        setField(term79068, term79068.getClass(), "userName", null);
        setIntField(term79068, term79068.getClass(), "level", 0);
        setIntField(term79068, term79068.getClass(), "reincarnationNum", 0);
        setLongField(term79068, term79068.getClass(), "exp", 0L);
        setLongField(term79068, term79068.getClass(), "point", 0L);
        setLongField(term79068, term79068.getClass(), "totalPoint", 0L);
        setIntField(term79068, term79068.getClass(), "playCount", 0);
        setIntField(term79068, term79068.getClass(), "jewelCount", 0);
        setIntField(term79068, term79068.getClass(), "totalJewelCount", 0);
        setIntField(term79068, term79068.getClass(), "medalCount", 0);
        setIntField(term79068, term79068.getClass(), "playerRating", 0);
        setIntField(term79068, term79068.getClass(), "highestRating", 0);
        setIntField(term79068, term79068.getClass(), "battlePoint", 0);
        setIntField(term79068, term79068.getClass(), "bestBattlePoint", 0);
        setIntField(term79068, term79068.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79068, term79068.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79068, term79068.getClass(), "nameplateId", 0);
        setIntField(term79068, term79068.getClass(), "trophyId", 0);
        setIntField(term79068, term79068.getClass(), "cardId", 0);
        setIntField(term79068, term79068.getClass(), "characterId", 0);
        setIntField(term79068, term79068.getClass(), "characterVoiceNo", 0);
        setIntField(term79068, term79068.getClass(), "tabSetting", 0);
        setIntField(term79068, term79068.getClass(), "tabSortSetting", 0);
        setIntField(term79068, term79068.getClass(), "cardCategorySetting", 0);
        setIntField(term79068, term79068.getClass(), "cardSortSetting", 0);
        setIntField(term79068, term79068.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79068, term79068.getClass(), "playedTutorialBit", 0);
        setIntField(term79068, term79068.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79068, term79068.getClass(), "sumTechHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79068, term79068.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79068, term79068.getClass(), "eventWatchedDate", null);
        setField(term79068, term79068.getClass(), "cmEventWatchedDate", null);
        setField(term79068, term79068.getClass(), "firstGameId", null);
        setField(term79068, term79068.getClass(), "firstRomVersion", null);
        setField(term79068, term79068.getClass(), "firstDataVersion", null);
        setField(term79068, term79068.getClass(), "firstPlayDate", null);
        setField(term79068, term79068.getClass(), "lastGameId", null);
        setField(term79068, term79068.getClass(), "lastRomVersion", null);
        setField(term79068, term79068.getClass(), "lastDataVersion", null);
        setField(term79068, term79068.getClass(), "compatibleCmVersion", null);
        setField(term79068, term79068.getClass(), "lastPlayDate", null);
        setIntField(term79068, term79068.getClass(), "lastPlaceId", 0);
        setField(term79068, term79068.getClass(), "lastPlaceName", null);
        setIntField(term79068, term79068.getClass(), "lastRegionId", 0);
        setField(term79068, term79068.getClass(), "lastRegionName", null);
        setIntField(term79068, term79068.getClass(), "lastAllNetId", 0);
        setField(term79068, term79068.getClass(), "lastClientId", null);
        setIntField(term79068, term79068.getClass(), "lastUsedDeckId", 0);
        setIntField(term79068, term79068.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79068, term79068.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term79068, args);
    }

};


