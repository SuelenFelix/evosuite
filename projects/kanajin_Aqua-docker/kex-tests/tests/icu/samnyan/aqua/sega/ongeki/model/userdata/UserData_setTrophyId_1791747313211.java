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
import java.lang.Integer;

public class UserData_setTrophyId_1791747313211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80841;
     Object term80888;

    public UserData_setTrophyId_1791747313211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80841 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80841, term80841.getClass(), "id", 0L);
        setField(term80841, term80841.getClass(), "card", null);
        setField(term80841, term80841.getClass(), "userName", null);
        setIntField(term80841, term80841.getClass(), "level", 0);
        setIntField(term80841, term80841.getClass(), "reincarnationNum", 0);
        setLongField(term80841, term80841.getClass(), "exp", 0L);
        setLongField(term80841, term80841.getClass(), "point", 0L);
        setLongField(term80841, term80841.getClass(), "totalPoint", 0L);
        setIntField(term80841, term80841.getClass(), "playCount", 0);
        setIntField(term80841, term80841.getClass(), "jewelCount", 0);
        setIntField(term80841, term80841.getClass(), "totalJewelCount", 0);
        setIntField(term80841, term80841.getClass(), "medalCount", 0);
        setIntField(term80841, term80841.getClass(), "playerRating", 0);
        setIntField(term80841, term80841.getClass(), "highestRating", 0);
        setIntField(term80841, term80841.getClass(), "battlePoint", 0);
        setIntField(term80841, term80841.getClass(), "bestBattlePoint", 0);
        setIntField(term80841, term80841.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80841, term80841.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80841, term80841.getClass(), "nameplateId", 0);
        setIntField(term80841, term80841.getClass(), "trophyId", 0);
        setIntField(term80841, term80841.getClass(), "cardId", 0);
        setIntField(term80841, term80841.getClass(), "characterId", 0);
        setIntField(term80841, term80841.getClass(), "characterVoiceNo", 0);
        setIntField(term80841, term80841.getClass(), "tabSetting", 0);
        setIntField(term80841, term80841.getClass(), "tabSortSetting", 0);
        setIntField(term80841, term80841.getClass(), "cardCategorySetting", 0);
        setIntField(term80841, term80841.getClass(), "cardSortSetting", 0);
        setIntField(term80841, term80841.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80841, term80841.getClass(), "playedTutorialBit", 0);
        setIntField(term80841, term80841.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80841, term80841.getClass(), "sumTechHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80841, term80841.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80841, term80841.getClass(), "eventWatchedDate", null);
        setField(term80841, term80841.getClass(), "cmEventWatchedDate", null);
        setField(term80841, term80841.getClass(), "firstGameId", null);
        setField(term80841, term80841.getClass(), "firstRomVersion", null);
        setField(term80841, term80841.getClass(), "firstDataVersion", null);
        setField(term80841, term80841.getClass(), "firstPlayDate", null);
        setField(term80841, term80841.getClass(), "lastGameId", null);
        setField(term80841, term80841.getClass(), "lastRomVersion", null);
        setField(term80841, term80841.getClass(), "lastDataVersion", null);
        setField(term80841, term80841.getClass(), "compatibleCmVersion", null);
        setField(term80841, term80841.getClass(), "lastPlayDate", null);
        setIntField(term80841, term80841.getClass(), "lastPlaceId", 0);
        setField(term80841, term80841.getClass(), "lastPlaceName", null);
        setIntField(term80841, term80841.getClass(), "lastRegionId", 0);
        setField(term80841, term80841.getClass(), "lastRegionName", null);
        setIntField(term80841, term80841.getClass(), "lastAllNetId", 0);
        setField(term80841, term80841.getClass(), "lastClientId", null);
        setIntField(term80841, term80841.getClass(), "lastUsedDeckId", 0);
        setIntField(term80841, term80841.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80841, term80841.getClass(), "lastEmoneyBrand", 0);
        term80888 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80888;
        callMethod(klass, "setTrophyId", argTypes, term80841, args);
    }

};


