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

public class UserData_getLastRegionName_958264638186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79632;

    public UserData_getLastRegionName_958264638186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79632 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79632, term79632.getClass(), "id", 0L);
        setField(term79632, term79632.getClass(), "card", null);
        setField(term79632, term79632.getClass(), "userName", null);
        setIntField(term79632, term79632.getClass(), "level", 0);
        setIntField(term79632, term79632.getClass(), "reincarnationNum", 0);
        setLongField(term79632, term79632.getClass(), "exp", 0L);
        setLongField(term79632, term79632.getClass(), "point", 0L);
        setLongField(term79632, term79632.getClass(), "totalPoint", 0L);
        setIntField(term79632, term79632.getClass(), "playCount", 0);
        setIntField(term79632, term79632.getClass(), "jewelCount", 0);
        setIntField(term79632, term79632.getClass(), "totalJewelCount", 0);
        setIntField(term79632, term79632.getClass(), "medalCount", 0);
        setIntField(term79632, term79632.getClass(), "playerRating", 0);
        setIntField(term79632, term79632.getClass(), "highestRating", 0);
        setIntField(term79632, term79632.getClass(), "battlePoint", 0);
        setIntField(term79632, term79632.getClass(), "bestBattlePoint", 0);
        setIntField(term79632, term79632.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79632, term79632.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79632, term79632.getClass(), "nameplateId", 0);
        setIntField(term79632, term79632.getClass(), "trophyId", 0);
        setIntField(term79632, term79632.getClass(), "cardId", 0);
        setIntField(term79632, term79632.getClass(), "characterId", 0);
        setIntField(term79632, term79632.getClass(), "characterVoiceNo", 0);
        setIntField(term79632, term79632.getClass(), "tabSetting", 0);
        setIntField(term79632, term79632.getClass(), "tabSortSetting", 0);
        setIntField(term79632, term79632.getClass(), "cardCategorySetting", 0);
        setIntField(term79632, term79632.getClass(), "cardSortSetting", 0);
        setIntField(term79632, term79632.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79632, term79632.getClass(), "playedTutorialBit", 0);
        setIntField(term79632, term79632.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79632, term79632.getClass(), "sumTechHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79632, term79632.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79632, term79632.getClass(), "eventWatchedDate", null);
        setField(term79632, term79632.getClass(), "cmEventWatchedDate", null);
        setField(term79632, term79632.getClass(), "firstGameId", null);
        setField(term79632, term79632.getClass(), "firstRomVersion", null);
        setField(term79632, term79632.getClass(), "firstDataVersion", null);
        setField(term79632, term79632.getClass(), "firstPlayDate", null);
        setField(term79632, term79632.getClass(), "lastGameId", null);
        setField(term79632, term79632.getClass(), "lastRomVersion", null);
        setField(term79632, term79632.getClass(), "lastDataVersion", null);
        setField(term79632, term79632.getClass(), "compatibleCmVersion", null);
        setField(term79632, term79632.getClass(), "lastPlayDate", null);
        setIntField(term79632, term79632.getClass(), "lastPlaceId", 0);
        setField(term79632, term79632.getClass(), "lastPlaceName", null);
        setIntField(term79632, term79632.getClass(), "lastRegionId", 0);
        setField(term79632, term79632.getClass(), "lastRegionName", null);
        setIntField(term79632, term79632.getClass(), "lastAllNetId", 0);
        setField(term79632, term79632.getClass(), "lastClientId", null);
        setIntField(term79632, term79632.getClass(), "lastUsedDeckId", 0);
        setIntField(term79632, term79632.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79632, term79632.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term79632, args);
    }

};


