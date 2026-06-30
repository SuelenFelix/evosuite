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

public class UserData_getLastEmoneyBrand_1384804206191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79867;

    public UserData_getLastEmoneyBrand_1384804206191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79867 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79867, term79867.getClass(), "id", 0L);
        setField(term79867, term79867.getClass(), "card", null);
        setField(term79867, term79867.getClass(), "userName", null);
        setIntField(term79867, term79867.getClass(), "level", 0);
        setIntField(term79867, term79867.getClass(), "reincarnationNum", 0);
        setLongField(term79867, term79867.getClass(), "exp", 0L);
        setLongField(term79867, term79867.getClass(), "point", 0L);
        setLongField(term79867, term79867.getClass(), "totalPoint", 0L);
        setIntField(term79867, term79867.getClass(), "playCount", 0);
        setIntField(term79867, term79867.getClass(), "jewelCount", 0);
        setIntField(term79867, term79867.getClass(), "totalJewelCount", 0);
        setIntField(term79867, term79867.getClass(), "medalCount", 0);
        setIntField(term79867, term79867.getClass(), "playerRating", 0);
        setIntField(term79867, term79867.getClass(), "highestRating", 0);
        setIntField(term79867, term79867.getClass(), "battlePoint", 0);
        setIntField(term79867, term79867.getClass(), "bestBattlePoint", 0);
        setIntField(term79867, term79867.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79867, term79867.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79867, term79867.getClass(), "nameplateId", 0);
        setIntField(term79867, term79867.getClass(), "trophyId", 0);
        setIntField(term79867, term79867.getClass(), "cardId", 0);
        setIntField(term79867, term79867.getClass(), "characterId", 0);
        setIntField(term79867, term79867.getClass(), "characterVoiceNo", 0);
        setIntField(term79867, term79867.getClass(), "tabSetting", 0);
        setIntField(term79867, term79867.getClass(), "tabSortSetting", 0);
        setIntField(term79867, term79867.getClass(), "cardCategorySetting", 0);
        setIntField(term79867, term79867.getClass(), "cardSortSetting", 0);
        setIntField(term79867, term79867.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79867, term79867.getClass(), "playedTutorialBit", 0);
        setIntField(term79867, term79867.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79867, term79867.getClass(), "sumTechHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79867, term79867.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79867, term79867.getClass(), "eventWatchedDate", null);
        setField(term79867, term79867.getClass(), "cmEventWatchedDate", null);
        setField(term79867, term79867.getClass(), "firstGameId", null);
        setField(term79867, term79867.getClass(), "firstRomVersion", null);
        setField(term79867, term79867.getClass(), "firstDataVersion", null);
        setField(term79867, term79867.getClass(), "firstPlayDate", null);
        setField(term79867, term79867.getClass(), "lastGameId", null);
        setField(term79867, term79867.getClass(), "lastRomVersion", null);
        setField(term79867, term79867.getClass(), "lastDataVersion", null);
        setField(term79867, term79867.getClass(), "compatibleCmVersion", null);
        setField(term79867, term79867.getClass(), "lastPlayDate", null);
        setIntField(term79867, term79867.getClass(), "lastPlaceId", 0);
        setField(term79867, term79867.getClass(), "lastPlaceName", null);
        setIntField(term79867, term79867.getClass(), "lastRegionId", 0);
        setField(term79867, term79867.getClass(), "lastRegionName", null);
        setIntField(term79867, term79867.getClass(), "lastAllNetId", 0);
        setField(term79867, term79867.getClass(), "lastClientId", null);
        setIntField(term79867, term79867.getClass(), "lastUsedDeckId", 0);
        setIntField(term79867, term79867.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79867, term79867.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastEmoneyBrand", argTypes, term79867, args);
    }

};


