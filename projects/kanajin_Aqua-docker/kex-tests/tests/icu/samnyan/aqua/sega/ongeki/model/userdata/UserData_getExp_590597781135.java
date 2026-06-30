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

public class UserData_getExp_590597781135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77235;

    public UserData_getExp_590597781135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77235 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77235, term77235.getClass(), "id", 0L);
        setField(term77235, term77235.getClass(), "card", null);
        setField(term77235, term77235.getClass(), "userName", null);
        setIntField(term77235, term77235.getClass(), "level", 0);
        setIntField(term77235, term77235.getClass(), "reincarnationNum", 0);
        setLongField(term77235, term77235.getClass(), "exp", 0L);
        setLongField(term77235, term77235.getClass(), "point", 0L);
        setLongField(term77235, term77235.getClass(), "totalPoint", 0L);
        setIntField(term77235, term77235.getClass(), "playCount", 0);
        setIntField(term77235, term77235.getClass(), "jewelCount", 0);
        setIntField(term77235, term77235.getClass(), "totalJewelCount", 0);
        setIntField(term77235, term77235.getClass(), "medalCount", 0);
        setIntField(term77235, term77235.getClass(), "playerRating", 0);
        setIntField(term77235, term77235.getClass(), "highestRating", 0);
        setIntField(term77235, term77235.getClass(), "battlePoint", 0);
        setIntField(term77235, term77235.getClass(), "bestBattlePoint", 0);
        setIntField(term77235, term77235.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77235, term77235.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77235, term77235.getClass(), "nameplateId", 0);
        setIntField(term77235, term77235.getClass(), "trophyId", 0);
        setIntField(term77235, term77235.getClass(), "cardId", 0);
        setIntField(term77235, term77235.getClass(), "characterId", 0);
        setIntField(term77235, term77235.getClass(), "characterVoiceNo", 0);
        setIntField(term77235, term77235.getClass(), "tabSetting", 0);
        setIntField(term77235, term77235.getClass(), "tabSortSetting", 0);
        setIntField(term77235, term77235.getClass(), "cardCategorySetting", 0);
        setIntField(term77235, term77235.getClass(), "cardSortSetting", 0);
        setIntField(term77235, term77235.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77235, term77235.getClass(), "playedTutorialBit", 0);
        setIntField(term77235, term77235.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77235, term77235.getClass(), "sumTechHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77235, term77235.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77235, term77235.getClass(), "eventWatchedDate", null);
        setField(term77235, term77235.getClass(), "cmEventWatchedDate", null);
        setField(term77235, term77235.getClass(), "firstGameId", null);
        setField(term77235, term77235.getClass(), "firstRomVersion", null);
        setField(term77235, term77235.getClass(), "firstDataVersion", null);
        setField(term77235, term77235.getClass(), "firstPlayDate", null);
        setField(term77235, term77235.getClass(), "lastGameId", null);
        setField(term77235, term77235.getClass(), "lastRomVersion", null);
        setField(term77235, term77235.getClass(), "lastDataVersion", null);
        setField(term77235, term77235.getClass(), "compatibleCmVersion", null);
        setField(term77235, term77235.getClass(), "lastPlayDate", null);
        setIntField(term77235, term77235.getClass(), "lastPlaceId", 0);
        setField(term77235, term77235.getClass(), "lastPlaceName", null);
        setIntField(term77235, term77235.getClass(), "lastRegionId", 0);
        setField(term77235, term77235.getClass(), "lastRegionName", null);
        setIntField(term77235, term77235.getClass(), "lastAllNetId", 0);
        setField(term77235, term77235.getClass(), "lastClientId", null);
        setIntField(term77235, term77235.getClass(), "lastUsedDeckId", 0);
        setIntField(term77235, term77235.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77235, term77235.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term77235, args);
    }

};


