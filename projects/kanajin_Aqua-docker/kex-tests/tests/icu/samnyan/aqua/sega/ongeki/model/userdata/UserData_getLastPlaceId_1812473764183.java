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

public class UserData_getLastPlaceId_1812473764183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79491;

    public UserData_getLastPlaceId_1812473764183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79491 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79491, term79491.getClass(), "id", 0L);
        setField(term79491, term79491.getClass(), "card", null);
        setField(term79491, term79491.getClass(), "userName", null);
        setIntField(term79491, term79491.getClass(), "level", 0);
        setIntField(term79491, term79491.getClass(), "reincarnationNum", 0);
        setLongField(term79491, term79491.getClass(), "exp", 0L);
        setLongField(term79491, term79491.getClass(), "point", 0L);
        setLongField(term79491, term79491.getClass(), "totalPoint", 0L);
        setIntField(term79491, term79491.getClass(), "playCount", 0);
        setIntField(term79491, term79491.getClass(), "jewelCount", 0);
        setIntField(term79491, term79491.getClass(), "totalJewelCount", 0);
        setIntField(term79491, term79491.getClass(), "medalCount", 0);
        setIntField(term79491, term79491.getClass(), "playerRating", 0);
        setIntField(term79491, term79491.getClass(), "highestRating", 0);
        setIntField(term79491, term79491.getClass(), "battlePoint", 0);
        setIntField(term79491, term79491.getClass(), "bestBattlePoint", 0);
        setIntField(term79491, term79491.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79491, term79491.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79491, term79491.getClass(), "nameplateId", 0);
        setIntField(term79491, term79491.getClass(), "trophyId", 0);
        setIntField(term79491, term79491.getClass(), "cardId", 0);
        setIntField(term79491, term79491.getClass(), "characterId", 0);
        setIntField(term79491, term79491.getClass(), "characterVoiceNo", 0);
        setIntField(term79491, term79491.getClass(), "tabSetting", 0);
        setIntField(term79491, term79491.getClass(), "tabSortSetting", 0);
        setIntField(term79491, term79491.getClass(), "cardCategorySetting", 0);
        setIntField(term79491, term79491.getClass(), "cardSortSetting", 0);
        setIntField(term79491, term79491.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79491, term79491.getClass(), "playedTutorialBit", 0);
        setIntField(term79491, term79491.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79491, term79491.getClass(), "sumTechHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79491, term79491.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79491, term79491.getClass(), "eventWatchedDate", null);
        setField(term79491, term79491.getClass(), "cmEventWatchedDate", null);
        setField(term79491, term79491.getClass(), "firstGameId", null);
        setField(term79491, term79491.getClass(), "firstRomVersion", null);
        setField(term79491, term79491.getClass(), "firstDataVersion", null);
        setField(term79491, term79491.getClass(), "firstPlayDate", null);
        setField(term79491, term79491.getClass(), "lastGameId", null);
        setField(term79491, term79491.getClass(), "lastRomVersion", null);
        setField(term79491, term79491.getClass(), "lastDataVersion", null);
        setField(term79491, term79491.getClass(), "compatibleCmVersion", null);
        setField(term79491, term79491.getClass(), "lastPlayDate", null);
        setIntField(term79491, term79491.getClass(), "lastPlaceId", 0);
        setField(term79491, term79491.getClass(), "lastPlaceName", null);
        setIntField(term79491, term79491.getClass(), "lastRegionId", 0);
        setField(term79491, term79491.getClass(), "lastRegionName", null);
        setIntField(term79491, term79491.getClass(), "lastAllNetId", 0);
        setField(term79491, term79491.getClass(), "lastClientId", null);
        setIntField(term79491, term79491.getClass(), "lastUsedDeckId", 0);
        setIntField(term79491, term79491.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79491, term79491.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceId", argTypes, term79491, args);
    }

};


