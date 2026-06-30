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

public class UserData_getCharacterId_24711868151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77987;

    public UserData_getCharacterId_24711868151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77987 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77987, term77987.getClass(), "id", 0L);
        setField(term77987, term77987.getClass(), "card", null);
        setField(term77987, term77987.getClass(), "userName", null);
        setIntField(term77987, term77987.getClass(), "level", 0);
        setIntField(term77987, term77987.getClass(), "reincarnationNum", 0);
        setLongField(term77987, term77987.getClass(), "exp", 0L);
        setLongField(term77987, term77987.getClass(), "point", 0L);
        setLongField(term77987, term77987.getClass(), "totalPoint", 0L);
        setIntField(term77987, term77987.getClass(), "playCount", 0);
        setIntField(term77987, term77987.getClass(), "jewelCount", 0);
        setIntField(term77987, term77987.getClass(), "totalJewelCount", 0);
        setIntField(term77987, term77987.getClass(), "medalCount", 0);
        setIntField(term77987, term77987.getClass(), "playerRating", 0);
        setIntField(term77987, term77987.getClass(), "highestRating", 0);
        setIntField(term77987, term77987.getClass(), "battlePoint", 0);
        setIntField(term77987, term77987.getClass(), "bestBattlePoint", 0);
        setIntField(term77987, term77987.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77987, term77987.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77987, term77987.getClass(), "nameplateId", 0);
        setIntField(term77987, term77987.getClass(), "trophyId", 0);
        setIntField(term77987, term77987.getClass(), "cardId", 0);
        setIntField(term77987, term77987.getClass(), "characterId", 0);
        setIntField(term77987, term77987.getClass(), "characterVoiceNo", 0);
        setIntField(term77987, term77987.getClass(), "tabSetting", 0);
        setIntField(term77987, term77987.getClass(), "tabSortSetting", 0);
        setIntField(term77987, term77987.getClass(), "cardCategorySetting", 0);
        setIntField(term77987, term77987.getClass(), "cardSortSetting", 0);
        setIntField(term77987, term77987.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77987, term77987.getClass(), "playedTutorialBit", 0);
        setIntField(term77987, term77987.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77987, term77987.getClass(), "sumTechHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77987, term77987.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77987, term77987.getClass(), "eventWatchedDate", null);
        setField(term77987, term77987.getClass(), "cmEventWatchedDate", null);
        setField(term77987, term77987.getClass(), "firstGameId", null);
        setField(term77987, term77987.getClass(), "firstRomVersion", null);
        setField(term77987, term77987.getClass(), "firstDataVersion", null);
        setField(term77987, term77987.getClass(), "firstPlayDate", null);
        setField(term77987, term77987.getClass(), "lastGameId", null);
        setField(term77987, term77987.getClass(), "lastRomVersion", null);
        setField(term77987, term77987.getClass(), "lastDataVersion", null);
        setField(term77987, term77987.getClass(), "compatibleCmVersion", null);
        setField(term77987, term77987.getClass(), "lastPlayDate", null);
        setIntField(term77987, term77987.getClass(), "lastPlaceId", 0);
        setField(term77987, term77987.getClass(), "lastPlaceName", null);
        setIntField(term77987, term77987.getClass(), "lastRegionId", 0);
        setField(term77987, term77987.getClass(), "lastRegionName", null);
        setIntField(term77987, term77987.getClass(), "lastAllNetId", 0);
        setField(term77987, term77987.getClass(), "lastClientId", null);
        setIntField(term77987, term77987.getClass(), "lastUsedDeckId", 0);
        setIntField(term77987, term77987.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77987, term77987.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharacterId", argTypes, term77987, args);
    }

};


