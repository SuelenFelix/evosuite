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

public class UserData_getSumBattleLunaticHighScore_866755303171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78927;

    public UserData_getSumBattleLunaticHighScore_866755303171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78927 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78927, term78927.getClass(), "id", 0L);
        setField(term78927, term78927.getClass(), "card", null);
        setField(term78927, term78927.getClass(), "userName", null);
        setIntField(term78927, term78927.getClass(), "level", 0);
        setIntField(term78927, term78927.getClass(), "reincarnationNum", 0);
        setLongField(term78927, term78927.getClass(), "exp", 0L);
        setLongField(term78927, term78927.getClass(), "point", 0L);
        setLongField(term78927, term78927.getClass(), "totalPoint", 0L);
        setIntField(term78927, term78927.getClass(), "playCount", 0);
        setIntField(term78927, term78927.getClass(), "jewelCount", 0);
        setIntField(term78927, term78927.getClass(), "totalJewelCount", 0);
        setIntField(term78927, term78927.getClass(), "medalCount", 0);
        setIntField(term78927, term78927.getClass(), "playerRating", 0);
        setIntField(term78927, term78927.getClass(), "highestRating", 0);
        setIntField(term78927, term78927.getClass(), "battlePoint", 0);
        setIntField(term78927, term78927.getClass(), "bestBattlePoint", 0);
        setIntField(term78927, term78927.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78927, term78927.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78927, term78927.getClass(), "nameplateId", 0);
        setIntField(term78927, term78927.getClass(), "trophyId", 0);
        setIntField(term78927, term78927.getClass(), "cardId", 0);
        setIntField(term78927, term78927.getClass(), "characterId", 0);
        setIntField(term78927, term78927.getClass(), "characterVoiceNo", 0);
        setIntField(term78927, term78927.getClass(), "tabSetting", 0);
        setIntField(term78927, term78927.getClass(), "tabSortSetting", 0);
        setIntField(term78927, term78927.getClass(), "cardCategorySetting", 0);
        setIntField(term78927, term78927.getClass(), "cardSortSetting", 0);
        setIntField(term78927, term78927.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78927, term78927.getClass(), "playedTutorialBit", 0);
        setIntField(term78927, term78927.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78927, term78927.getClass(), "sumTechHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78927, term78927.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78927, term78927.getClass(), "eventWatchedDate", null);
        setField(term78927, term78927.getClass(), "cmEventWatchedDate", null);
        setField(term78927, term78927.getClass(), "firstGameId", null);
        setField(term78927, term78927.getClass(), "firstRomVersion", null);
        setField(term78927, term78927.getClass(), "firstDataVersion", null);
        setField(term78927, term78927.getClass(), "firstPlayDate", null);
        setField(term78927, term78927.getClass(), "lastGameId", null);
        setField(term78927, term78927.getClass(), "lastRomVersion", null);
        setField(term78927, term78927.getClass(), "lastDataVersion", null);
        setField(term78927, term78927.getClass(), "compatibleCmVersion", null);
        setField(term78927, term78927.getClass(), "lastPlayDate", null);
        setIntField(term78927, term78927.getClass(), "lastPlaceId", 0);
        setField(term78927, term78927.getClass(), "lastPlaceName", null);
        setIntField(term78927, term78927.getClass(), "lastRegionId", 0);
        setField(term78927, term78927.getClass(), "lastRegionName", null);
        setIntField(term78927, term78927.getClass(), "lastAllNetId", 0);
        setField(term78927, term78927.getClass(), "lastClientId", null);
        setIntField(term78927, term78927.getClass(), "lastUsedDeckId", 0);
        setIntField(term78927, term78927.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78927, term78927.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleLunaticHighScore", argTypes, term78927, args);
    }

};


