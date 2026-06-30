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

public class UserData_getSumTechMasterHighScore_403641423164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78598;

    public UserData_getSumTechMasterHighScore_403641423164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78598 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78598, term78598.getClass(), "id", 0L);
        setField(term78598, term78598.getClass(), "card", null);
        setField(term78598, term78598.getClass(), "userName", null);
        setIntField(term78598, term78598.getClass(), "level", 0);
        setIntField(term78598, term78598.getClass(), "reincarnationNum", 0);
        setLongField(term78598, term78598.getClass(), "exp", 0L);
        setLongField(term78598, term78598.getClass(), "point", 0L);
        setLongField(term78598, term78598.getClass(), "totalPoint", 0L);
        setIntField(term78598, term78598.getClass(), "playCount", 0);
        setIntField(term78598, term78598.getClass(), "jewelCount", 0);
        setIntField(term78598, term78598.getClass(), "totalJewelCount", 0);
        setIntField(term78598, term78598.getClass(), "medalCount", 0);
        setIntField(term78598, term78598.getClass(), "playerRating", 0);
        setIntField(term78598, term78598.getClass(), "highestRating", 0);
        setIntField(term78598, term78598.getClass(), "battlePoint", 0);
        setIntField(term78598, term78598.getClass(), "bestBattlePoint", 0);
        setIntField(term78598, term78598.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78598, term78598.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78598, term78598.getClass(), "nameplateId", 0);
        setIntField(term78598, term78598.getClass(), "trophyId", 0);
        setIntField(term78598, term78598.getClass(), "cardId", 0);
        setIntField(term78598, term78598.getClass(), "characterId", 0);
        setIntField(term78598, term78598.getClass(), "characterVoiceNo", 0);
        setIntField(term78598, term78598.getClass(), "tabSetting", 0);
        setIntField(term78598, term78598.getClass(), "tabSortSetting", 0);
        setIntField(term78598, term78598.getClass(), "cardCategorySetting", 0);
        setIntField(term78598, term78598.getClass(), "cardSortSetting", 0);
        setIntField(term78598, term78598.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78598, term78598.getClass(), "playedTutorialBit", 0);
        setIntField(term78598, term78598.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78598, term78598.getClass(), "sumTechHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78598, term78598.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78598, term78598.getClass(), "eventWatchedDate", null);
        setField(term78598, term78598.getClass(), "cmEventWatchedDate", null);
        setField(term78598, term78598.getClass(), "firstGameId", null);
        setField(term78598, term78598.getClass(), "firstRomVersion", null);
        setField(term78598, term78598.getClass(), "firstDataVersion", null);
        setField(term78598, term78598.getClass(), "firstPlayDate", null);
        setField(term78598, term78598.getClass(), "lastGameId", null);
        setField(term78598, term78598.getClass(), "lastRomVersion", null);
        setField(term78598, term78598.getClass(), "lastDataVersion", null);
        setField(term78598, term78598.getClass(), "compatibleCmVersion", null);
        setField(term78598, term78598.getClass(), "lastPlayDate", null);
        setIntField(term78598, term78598.getClass(), "lastPlaceId", 0);
        setField(term78598, term78598.getClass(), "lastPlaceName", null);
        setIntField(term78598, term78598.getClass(), "lastRegionId", 0);
        setField(term78598, term78598.getClass(), "lastRegionName", null);
        setIntField(term78598, term78598.getClass(), "lastAllNetId", 0);
        setField(term78598, term78598.getClass(), "lastClientId", null);
        setIntField(term78598, term78598.getClass(), "lastUsedDeckId", 0);
        setIntField(term78598, term78598.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78598, term78598.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechMasterHighScore", argTypes, term78598, args);
    }

};


