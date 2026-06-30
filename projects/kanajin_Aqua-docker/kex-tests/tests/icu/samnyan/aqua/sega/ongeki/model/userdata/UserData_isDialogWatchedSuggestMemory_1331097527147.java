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

public class UserData_isDialogWatchedSuggestMemory_1331097527147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77799;

    public UserData_isDialogWatchedSuggestMemory_1331097527147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77799 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77799, term77799.getClass(), "id", 0L);
        setField(term77799, term77799.getClass(), "card", null);
        setField(term77799, term77799.getClass(), "userName", null);
        setIntField(term77799, term77799.getClass(), "level", 0);
        setIntField(term77799, term77799.getClass(), "reincarnationNum", 0);
        setLongField(term77799, term77799.getClass(), "exp", 0L);
        setLongField(term77799, term77799.getClass(), "point", 0L);
        setLongField(term77799, term77799.getClass(), "totalPoint", 0L);
        setIntField(term77799, term77799.getClass(), "playCount", 0);
        setIntField(term77799, term77799.getClass(), "jewelCount", 0);
        setIntField(term77799, term77799.getClass(), "totalJewelCount", 0);
        setIntField(term77799, term77799.getClass(), "medalCount", 0);
        setIntField(term77799, term77799.getClass(), "playerRating", 0);
        setIntField(term77799, term77799.getClass(), "highestRating", 0);
        setIntField(term77799, term77799.getClass(), "battlePoint", 0);
        setIntField(term77799, term77799.getClass(), "bestBattlePoint", 0);
        setIntField(term77799, term77799.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77799, term77799.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77799, term77799.getClass(), "nameplateId", 0);
        setIntField(term77799, term77799.getClass(), "trophyId", 0);
        setIntField(term77799, term77799.getClass(), "cardId", 0);
        setIntField(term77799, term77799.getClass(), "characterId", 0);
        setIntField(term77799, term77799.getClass(), "characterVoiceNo", 0);
        setIntField(term77799, term77799.getClass(), "tabSetting", 0);
        setIntField(term77799, term77799.getClass(), "tabSortSetting", 0);
        setIntField(term77799, term77799.getClass(), "cardCategorySetting", 0);
        setIntField(term77799, term77799.getClass(), "cardSortSetting", 0);
        setIntField(term77799, term77799.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77799, term77799.getClass(), "playedTutorialBit", 0);
        setIntField(term77799, term77799.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77799, term77799.getClass(), "sumTechHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77799, term77799.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77799, term77799.getClass(), "eventWatchedDate", null);
        setField(term77799, term77799.getClass(), "cmEventWatchedDate", null);
        setField(term77799, term77799.getClass(), "firstGameId", null);
        setField(term77799, term77799.getClass(), "firstRomVersion", null);
        setField(term77799, term77799.getClass(), "firstDataVersion", null);
        setField(term77799, term77799.getClass(), "firstPlayDate", null);
        setField(term77799, term77799.getClass(), "lastGameId", null);
        setField(term77799, term77799.getClass(), "lastRomVersion", null);
        setField(term77799, term77799.getClass(), "lastDataVersion", null);
        setField(term77799, term77799.getClass(), "compatibleCmVersion", null);
        setField(term77799, term77799.getClass(), "lastPlayDate", null);
        setIntField(term77799, term77799.getClass(), "lastPlaceId", 0);
        setField(term77799, term77799.getClass(), "lastPlaceName", null);
        setIntField(term77799, term77799.getClass(), "lastRegionId", 0);
        setField(term77799, term77799.getClass(), "lastRegionName", null);
        setIntField(term77799, term77799.getClass(), "lastAllNetId", 0);
        setField(term77799, term77799.getClass(), "lastClientId", null);
        setIntField(term77799, term77799.getClass(), "lastUsedDeckId", 0);
        setIntField(term77799, term77799.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77799, term77799.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDialogWatchedSuggestMemory", argTypes, term77799, args);
    }

};


