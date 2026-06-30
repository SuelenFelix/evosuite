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

public class UserData_getLastRomVersion_955016121179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79303;

    public UserData_getLastRomVersion_955016121179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79303 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79303, term79303.getClass(), "id", 0L);
        setField(term79303, term79303.getClass(), "card", null);
        setField(term79303, term79303.getClass(), "userName", null);
        setIntField(term79303, term79303.getClass(), "level", 0);
        setIntField(term79303, term79303.getClass(), "reincarnationNum", 0);
        setLongField(term79303, term79303.getClass(), "exp", 0L);
        setLongField(term79303, term79303.getClass(), "point", 0L);
        setLongField(term79303, term79303.getClass(), "totalPoint", 0L);
        setIntField(term79303, term79303.getClass(), "playCount", 0);
        setIntField(term79303, term79303.getClass(), "jewelCount", 0);
        setIntField(term79303, term79303.getClass(), "totalJewelCount", 0);
        setIntField(term79303, term79303.getClass(), "medalCount", 0);
        setIntField(term79303, term79303.getClass(), "playerRating", 0);
        setIntField(term79303, term79303.getClass(), "highestRating", 0);
        setIntField(term79303, term79303.getClass(), "battlePoint", 0);
        setIntField(term79303, term79303.getClass(), "bestBattlePoint", 0);
        setIntField(term79303, term79303.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79303, term79303.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79303, term79303.getClass(), "nameplateId", 0);
        setIntField(term79303, term79303.getClass(), "trophyId", 0);
        setIntField(term79303, term79303.getClass(), "cardId", 0);
        setIntField(term79303, term79303.getClass(), "characterId", 0);
        setIntField(term79303, term79303.getClass(), "characterVoiceNo", 0);
        setIntField(term79303, term79303.getClass(), "tabSetting", 0);
        setIntField(term79303, term79303.getClass(), "tabSortSetting", 0);
        setIntField(term79303, term79303.getClass(), "cardCategorySetting", 0);
        setIntField(term79303, term79303.getClass(), "cardSortSetting", 0);
        setIntField(term79303, term79303.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79303, term79303.getClass(), "playedTutorialBit", 0);
        setIntField(term79303, term79303.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79303, term79303.getClass(), "sumTechHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79303, term79303.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79303, term79303.getClass(), "eventWatchedDate", null);
        setField(term79303, term79303.getClass(), "cmEventWatchedDate", null);
        setField(term79303, term79303.getClass(), "firstGameId", null);
        setField(term79303, term79303.getClass(), "firstRomVersion", null);
        setField(term79303, term79303.getClass(), "firstDataVersion", null);
        setField(term79303, term79303.getClass(), "firstPlayDate", null);
        setField(term79303, term79303.getClass(), "lastGameId", null);
        setField(term79303, term79303.getClass(), "lastRomVersion", null);
        setField(term79303, term79303.getClass(), "lastDataVersion", null);
        setField(term79303, term79303.getClass(), "compatibleCmVersion", null);
        setField(term79303, term79303.getClass(), "lastPlayDate", null);
        setIntField(term79303, term79303.getClass(), "lastPlaceId", 0);
        setField(term79303, term79303.getClass(), "lastPlaceName", null);
        setIntField(term79303, term79303.getClass(), "lastRegionId", 0);
        setField(term79303, term79303.getClass(), "lastRegionName", null);
        setIntField(term79303, term79303.getClass(), "lastAllNetId", 0);
        setField(term79303, term79303.getClass(), "lastClientId", null);
        setIntField(term79303, term79303.getClass(), "lastUsedDeckId", 0);
        setIntField(term79303, term79303.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79303, term79303.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term79303, args);
    }

};


