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

public class UserData_getLastPlayDate_1903049953182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79444;

    public UserData_getLastPlayDate_1903049953182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79444 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79444, term79444.getClass(), "id", 0L);
        setField(term79444, term79444.getClass(), "card", null);
        setField(term79444, term79444.getClass(), "userName", null);
        setIntField(term79444, term79444.getClass(), "level", 0);
        setIntField(term79444, term79444.getClass(), "reincarnationNum", 0);
        setLongField(term79444, term79444.getClass(), "exp", 0L);
        setLongField(term79444, term79444.getClass(), "point", 0L);
        setLongField(term79444, term79444.getClass(), "totalPoint", 0L);
        setIntField(term79444, term79444.getClass(), "playCount", 0);
        setIntField(term79444, term79444.getClass(), "jewelCount", 0);
        setIntField(term79444, term79444.getClass(), "totalJewelCount", 0);
        setIntField(term79444, term79444.getClass(), "medalCount", 0);
        setIntField(term79444, term79444.getClass(), "playerRating", 0);
        setIntField(term79444, term79444.getClass(), "highestRating", 0);
        setIntField(term79444, term79444.getClass(), "battlePoint", 0);
        setIntField(term79444, term79444.getClass(), "bestBattlePoint", 0);
        setIntField(term79444, term79444.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79444, term79444.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79444, term79444.getClass(), "nameplateId", 0);
        setIntField(term79444, term79444.getClass(), "trophyId", 0);
        setIntField(term79444, term79444.getClass(), "cardId", 0);
        setIntField(term79444, term79444.getClass(), "characterId", 0);
        setIntField(term79444, term79444.getClass(), "characterVoiceNo", 0);
        setIntField(term79444, term79444.getClass(), "tabSetting", 0);
        setIntField(term79444, term79444.getClass(), "tabSortSetting", 0);
        setIntField(term79444, term79444.getClass(), "cardCategorySetting", 0);
        setIntField(term79444, term79444.getClass(), "cardSortSetting", 0);
        setIntField(term79444, term79444.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79444, term79444.getClass(), "playedTutorialBit", 0);
        setIntField(term79444, term79444.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79444, term79444.getClass(), "sumTechHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79444, term79444.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79444, term79444.getClass(), "eventWatchedDate", null);
        setField(term79444, term79444.getClass(), "cmEventWatchedDate", null);
        setField(term79444, term79444.getClass(), "firstGameId", null);
        setField(term79444, term79444.getClass(), "firstRomVersion", null);
        setField(term79444, term79444.getClass(), "firstDataVersion", null);
        setField(term79444, term79444.getClass(), "firstPlayDate", null);
        setField(term79444, term79444.getClass(), "lastGameId", null);
        setField(term79444, term79444.getClass(), "lastRomVersion", null);
        setField(term79444, term79444.getClass(), "lastDataVersion", null);
        setField(term79444, term79444.getClass(), "compatibleCmVersion", null);
        setField(term79444, term79444.getClass(), "lastPlayDate", null);
        setIntField(term79444, term79444.getClass(), "lastPlaceId", 0);
        setField(term79444, term79444.getClass(), "lastPlaceName", null);
        setIntField(term79444, term79444.getClass(), "lastRegionId", 0);
        setField(term79444, term79444.getClass(), "lastRegionName", null);
        setIntField(term79444, term79444.getClass(), "lastAllNetId", 0);
        setField(term79444, term79444.getClass(), "lastClientId", null);
        setIntField(term79444, term79444.getClass(), "lastUsedDeckId", 0);
        setIntField(term79444, term79444.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79444, term79444.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term79444, args);
    }

};


