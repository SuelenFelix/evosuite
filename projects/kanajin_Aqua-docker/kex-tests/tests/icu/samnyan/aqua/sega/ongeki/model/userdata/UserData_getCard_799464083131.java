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

public class UserData_getCard_799464083131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77047;

    public UserData_getCard_799464083131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77047 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77047, term77047.getClass(), "id", 0L);
        setField(term77047, term77047.getClass(), "card", null);
        setField(term77047, term77047.getClass(), "userName", null);
        setIntField(term77047, term77047.getClass(), "level", 0);
        setIntField(term77047, term77047.getClass(), "reincarnationNum", 0);
        setLongField(term77047, term77047.getClass(), "exp", 0L);
        setLongField(term77047, term77047.getClass(), "point", 0L);
        setLongField(term77047, term77047.getClass(), "totalPoint", 0L);
        setIntField(term77047, term77047.getClass(), "playCount", 0);
        setIntField(term77047, term77047.getClass(), "jewelCount", 0);
        setIntField(term77047, term77047.getClass(), "totalJewelCount", 0);
        setIntField(term77047, term77047.getClass(), "medalCount", 0);
        setIntField(term77047, term77047.getClass(), "playerRating", 0);
        setIntField(term77047, term77047.getClass(), "highestRating", 0);
        setIntField(term77047, term77047.getClass(), "battlePoint", 0);
        setIntField(term77047, term77047.getClass(), "bestBattlePoint", 0);
        setIntField(term77047, term77047.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77047, term77047.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77047, term77047.getClass(), "nameplateId", 0);
        setIntField(term77047, term77047.getClass(), "trophyId", 0);
        setIntField(term77047, term77047.getClass(), "cardId", 0);
        setIntField(term77047, term77047.getClass(), "characterId", 0);
        setIntField(term77047, term77047.getClass(), "characterVoiceNo", 0);
        setIntField(term77047, term77047.getClass(), "tabSetting", 0);
        setIntField(term77047, term77047.getClass(), "tabSortSetting", 0);
        setIntField(term77047, term77047.getClass(), "cardCategorySetting", 0);
        setIntField(term77047, term77047.getClass(), "cardSortSetting", 0);
        setIntField(term77047, term77047.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77047, term77047.getClass(), "playedTutorialBit", 0);
        setIntField(term77047, term77047.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77047, term77047.getClass(), "sumTechHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77047, term77047.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77047, term77047.getClass(), "eventWatchedDate", null);
        setField(term77047, term77047.getClass(), "cmEventWatchedDate", null);
        setField(term77047, term77047.getClass(), "firstGameId", null);
        setField(term77047, term77047.getClass(), "firstRomVersion", null);
        setField(term77047, term77047.getClass(), "firstDataVersion", null);
        setField(term77047, term77047.getClass(), "firstPlayDate", null);
        setField(term77047, term77047.getClass(), "lastGameId", null);
        setField(term77047, term77047.getClass(), "lastRomVersion", null);
        setField(term77047, term77047.getClass(), "lastDataVersion", null);
        setField(term77047, term77047.getClass(), "compatibleCmVersion", null);
        setField(term77047, term77047.getClass(), "lastPlayDate", null);
        setIntField(term77047, term77047.getClass(), "lastPlaceId", 0);
        setField(term77047, term77047.getClass(), "lastPlaceName", null);
        setIntField(term77047, term77047.getClass(), "lastRegionId", 0);
        setField(term77047, term77047.getClass(), "lastRegionName", null);
        setIntField(term77047, term77047.getClass(), "lastAllNetId", 0);
        setField(term77047, term77047.getClass(), "lastClientId", null);
        setIntField(term77047, term77047.getClass(), "lastUsedDeckId", 0);
        setIntField(term77047, term77047.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77047, term77047.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCard", argTypes, term77047, args);
    }

};


