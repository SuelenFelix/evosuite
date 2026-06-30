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

public class UserData_getCardId_707135567150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77940;

    public UserData_getCardId_707135567150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77940 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77940, term77940.getClass(), "id", 0L);
        setField(term77940, term77940.getClass(), "card", null);
        setField(term77940, term77940.getClass(), "userName", null);
        setIntField(term77940, term77940.getClass(), "level", 0);
        setIntField(term77940, term77940.getClass(), "reincarnationNum", 0);
        setLongField(term77940, term77940.getClass(), "exp", 0L);
        setLongField(term77940, term77940.getClass(), "point", 0L);
        setLongField(term77940, term77940.getClass(), "totalPoint", 0L);
        setIntField(term77940, term77940.getClass(), "playCount", 0);
        setIntField(term77940, term77940.getClass(), "jewelCount", 0);
        setIntField(term77940, term77940.getClass(), "totalJewelCount", 0);
        setIntField(term77940, term77940.getClass(), "medalCount", 0);
        setIntField(term77940, term77940.getClass(), "playerRating", 0);
        setIntField(term77940, term77940.getClass(), "highestRating", 0);
        setIntField(term77940, term77940.getClass(), "battlePoint", 0);
        setIntField(term77940, term77940.getClass(), "bestBattlePoint", 0);
        setIntField(term77940, term77940.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77940, term77940.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77940, term77940.getClass(), "nameplateId", 0);
        setIntField(term77940, term77940.getClass(), "trophyId", 0);
        setIntField(term77940, term77940.getClass(), "cardId", 0);
        setIntField(term77940, term77940.getClass(), "characterId", 0);
        setIntField(term77940, term77940.getClass(), "characterVoiceNo", 0);
        setIntField(term77940, term77940.getClass(), "tabSetting", 0);
        setIntField(term77940, term77940.getClass(), "tabSortSetting", 0);
        setIntField(term77940, term77940.getClass(), "cardCategorySetting", 0);
        setIntField(term77940, term77940.getClass(), "cardSortSetting", 0);
        setIntField(term77940, term77940.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77940, term77940.getClass(), "playedTutorialBit", 0);
        setIntField(term77940, term77940.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77940, term77940.getClass(), "sumTechHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77940, term77940.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77940, term77940.getClass(), "eventWatchedDate", null);
        setField(term77940, term77940.getClass(), "cmEventWatchedDate", null);
        setField(term77940, term77940.getClass(), "firstGameId", null);
        setField(term77940, term77940.getClass(), "firstRomVersion", null);
        setField(term77940, term77940.getClass(), "firstDataVersion", null);
        setField(term77940, term77940.getClass(), "firstPlayDate", null);
        setField(term77940, term77940.getClass(), "lastGameId", null);
        setField(term77940, term77940.getClass(), "lastRomVersion", null);
        setField(term77940, term77940.getClass(), "lastDataVersion", null);
        setField(term77940, term77940.getClass(), "compatibleCmVersion", null);
        setField(term77940, term77940.getClass(), "lastPlayDate", null);
        setIntField(term77940, term77940.getClass(), "lastPlaceId", 0);
        setField(term77940, term77940.getClass(), "lastPlaceName", null);
        setIntField(term77940, term77940.getClass(), "lastRegionId", 0);
        setField(term77940, term77940.getClass(), "lastRegionName", null);
        setIntField(term77940, term77940.getClass(), "lastAllNetId", 0);
        setField(term77940, term77940.getClass(), "lastClientId", null);
        setIntField(term77940, term77940.getClass(), "lastUsedDeckId", 0);
        setIntField(term77940, term77940.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77940, term77940.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId", argTypes, term77940, args);
    }

};


