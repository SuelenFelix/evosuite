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

public class UserData_getFirstRomVersion_386226891175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79115;

    public UserData_getFirstRomVersion_386226891175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79115 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79115, term79115.getClass(), "id", 0L);
        setField(term79115, term79115.getClass(), "card", null);
        setField(term79115, term79115.getClass(), "userName", null);
        setIntField(term79115, term79115.getClass(), "level", 0);
        setIntField(term79115, term79115.getClass(), "reincarnationNum", 0);
        setLongField(term79115, term79115.getClass(), "exp", 0L);
        setLongField(term79115, term79115.getClass(), "point", 0L);
        setLongField(term79115, term79115.getClass(), "totalPoint", 0L);
        setIntField(term79115, term79115.getClass(), "playCount", 0);
        setIntField(term79115, term79115.getClass(), "jewelCount", 0);
        setIntField(term79115, term79115.getClass(), "totalJewelCount", 0);
        setIntField(term79115, term79115.getClass(), "medalCount", 0);
        setIntField(term79115, term79115.getClass(), "playerRating", 0);
        setIntField(term79115, term79115.getClass(), "highestRating", 0);
        setIntField(term79115, term79115.getClass(), "battlePoint", 0);
        setIntField(term79115, term79115.getClass(), "bestBattlePoint", 0);
        setIntField(term79115, term79115.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79115, term79115.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79115, term79115.getClass(), "nameplateId", 0);
        setIntField(term79115, term79115.getClass(), "trophyId", 0);
        setIntField(term79115, term79115.getClass(), "cardId", 0);
        setIntField(term79115, term79115.getClass(), "characterId", 0);
        setIntField(term79115, term79115.getClass(), "characterVoiceNo", 0);
        setIntField(term79115, term79115.getClass(), "tabSetting", 0);
        setIntField(term79115, term79115.getClass(), "tabSortSetting", 0);
        setIntField(term79115, term79115.getClass(), "cardCategorySetting", 0);
        setIntField(term79115, term79115.getClass(), "cardSortSetting", 0);
        setIntField(term79115, term79115.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79115, term79115.getClass(), "playedTutorialBit", 0);
        setIntField(term79115, term79115.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79115, term79115.getClass(), "sumTechHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79115, term79115.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79115, term79115.getClass(), "eventWatchedDate", null);
        setField(term79115, term79115.getClass(), "cmEventWatchedDate", null);
        setField(term79115, term79115.getClass(), "firstGameId", null);
        setField(term79115, term79115.getClass(), "firstRomVersion", null);
        setField(term79115, term79115.getClass(), "firstDataVersion", null);
        setField(term79115, term79115.getClass(), "firstPlayDate", null);
        setField(term79115, term79115.getClass(), "lastGameId", null);
        setField(term79115, term79115.getClass(), "lastRomVersion", null);
        setField(term79115, term79115.getClass(), "lastDataVersion", null);
        setField(term79115, term79115.getClass(), "compatibleCmVersion", null);
        setField(term79115, term79115.getClass(), "lastPlayDate", null);
        setIntField(term79115, term79115.getClass(), "lastPlaceId", 0);
        setField(term79115, term79115.getClass(), "lastPlaceName", null);
        setIntField(term79115, term79115.getClass(), "lastRegionId", 0);
        setField(term79115, term79115.getClass(), "lastRegionName", null);
        setIntField(term79115, term79115.getClass(), "lastAllNetId", 0);
        setField(term79115, term79115.getClass(), "lastClientId", null);
        setIntField(term79115, term79115.getClass(), "lastUsedDeckId", 0);
        setIntField(term79115, term79115.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79115, term79115.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstRomVersion", argTypes, term79115, args);
    }

};


