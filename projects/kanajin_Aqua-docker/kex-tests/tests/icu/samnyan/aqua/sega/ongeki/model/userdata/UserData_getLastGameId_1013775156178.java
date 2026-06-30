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

public class UserData_getLastGameId_1013775156178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79256;

    public UserData_getLastGameId_1013775156178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79256 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79256, term79256.getClass(), "id", 0L);
        setField(term79256, term79256.getClass(), "card", null);
        setField(term79256, term79256.getClass(), "userName", null);
        setIntField(term79256, term79256.getClass(), "level", 0);
        setIntField(term79256, term79256.getClass(), "reincarnationNum", 0);
        setLongField(term79256, term79256.getClass(), "exp", 0L);
        setLongField(term79256, term79256.getClass(), "point", 0L);
        setLongField(term79256, term79256.getClass(), "totalPoint", 0L);
        setIntField(term79256, term79256.getClass(), "playCount", 0);
        setIntField(term79256, term79256.getClass(), "jewelCount", 0);
        setIntField(term79256, term79256.getClass(), "totalJewelCount", 0);
        setIntField(term79256, term79256.getClass(), "medalCount", 0);
        setIntField(term79256, term79256.getClass(), "playerRating", 0);
        setIntField(term79256, term79256.getClass(), "highestRating", 0);
        setIntField(term79256, term79256.getClass(), "battlePoint", 0);
        setIntField(term79256, term79256.getClass(), "bestBattlePoint", 0);
        setIntField(term79256, term79256.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79256, term79256.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79256, term79256.getClass(), "nameplateId", 0);
        setIntField(term79256, term79256.getClass(), "trophyId", 0);
        setIntField(term79256, term79256.getClass(), "cardId", 0);
        setIntField(term79256, term79256.getClass(), "characterId", 0);
        setIntField(term79256, term79256.getClass(), "characterVoiceNo", 0);
        setIntField(term79256, term79256.getClass(), "tabSetting", 0);
        setIntField(term79256, term79256.getClass(), "tabSortSetting", 0);
        setIntField(term79256, term79256.getClass(), "cardCategorySetting", 0);
        setIntField(term79256, term79256.getClass(), "cardSortSetting", 0);
        setIntField(term79256, term79256.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79256, term79256.getClass(), "playedTutorialBit", 0);
        setIntField(term79256, term79256.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79256, term79256.getClass(), "sumTechHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79256, term79256.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79256, term79256.getClass(), "eventWatchedDate", null);
        setField(term79256, term79256.getClass(), "cmEventWatchedDate", null);
        setField(term79256, term79256.getClass(), "firstGameId", null);
        setField(term79256, term79256.getClass(), "firstRomVersion", null);
        setField(term79256, term79256.getClass(), "firstDataVersion", null);
        setField(term79256, term79256.getClass(), "firstPlayDate", null);
        setField(term79256, term79256.getClass(), "lastGameId", null);
        setField(term79256, term79256.getClass(), "lastRomVersion", null);
        setField(term79256, term79256.getClass(), "lastDataVersion", null);
        setField(term79256, term79256.getClass(), "compatibleCmVersion", null);
        setField(term79256, term79256.getClass(), "lastPlayDate", null);
        setIntField(term79256, term79256.getClass(), "lastPlaceId", 0);
        setField(term79256, term79256.getClass(), "lastPlaceName", null);
        setIntField(term79256, term79256.getClass(), "lastRegionId", 0);
        setField(term79256, term79256.getClass(), "lastRegionName", null);
        setIntField(term79256, term79256.getClass(), "lastAllNetId", 0);
        setField(term79256, term79256.getClass(), "lastClientId", null);
        setIntField(term79256, term79256.getClass(), "lastUsedDeckId", 0);
        setIntField(term79256, term79256.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79256, term79256.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastGameId", argTypes, term79256, args);
    }

};


