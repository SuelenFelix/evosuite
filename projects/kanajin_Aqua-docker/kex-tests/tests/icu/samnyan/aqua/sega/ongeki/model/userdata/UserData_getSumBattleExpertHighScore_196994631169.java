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

public class UserData_getSumBattleExpertHighScore_196994631169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78833;

    public UserData_getSumBattleExpertHighScore_196994631169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78833 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78833, term78833.getClass(), "id", 0L);
        setField(term78833, term78833.getClass(), "card", null);
        setField(term78833, term78833.getClass(), "userName", null);
        setIntField(term78833, term78833.getClass(), "level", 0);
        setIntField(term78833, term78833.getClass(), "reincarnationNum", 0);
        setLongField(term78833, term78833.getClass(), "exp", 0L);
        setLongField(term78833, term78833.getClass(), "point", 0L);
        setLongField(term78833, term78833.getClass(), "totalPoint", 0L);
        setIntField(term78833, term78833.getClass(), "playCount", 0);
        setIntField(term78833, term78833.getClass(), "jewelCount", 0);
        setIntField(term78833, term78833.getClass(), "totalJewelCount", 0);
        setIntField(term78833, term78833.getClass(), "medalCount", 0);
        setIntField(term78833, term78833.getClass(), "playerRating", 0);
        setIntField(term78833, term78833.getClass(), "highestRating", 0);
        setIntField(term78833, term78833.getClass(), "battlePoint", 0);
        setIntField(term78833, term78833.getClass(), "bestBattlePoint", 0);
        setIntField(term78833, term78833.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78833, term78833.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78833, term78833.getClass(), "nameplateId", 0);
        setIntField(term78833, term78833.getClass(), "trophyId", 0);
        setIntField(term78833, term78833.getClass(), "cardId", 0);
        setIntField(term78833, term78833.getClass(), "characterId", 0);
        setIntField(term78833, term78833.getClass(), "characterVoiceNo", 0);
        setIntField(term78833, term78833.getClass(), "tabSetting", 0);
        setIntField(term78833, term78833.getClass(), "tabSortSetting", 0);
        setIntField(term78833, term78833.getClass(), "cardCategorySetting", 0);
        setIntField(term78833, term78833.getClass(), "cardSortSetting", 0);
        setIntField(term78833, term78833.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78833, term78833.getClass(), "playedTutorialBit", 0);
        setIntField(term78833, term78833.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78833, term78833.getClass(), "sumTechHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78833, term78833.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78833, term78833.getClass(), "eventWatchedDate", null);
        setField(term78833, term78833.getClass(), "cmEventWatchedDate", null);
        setField(term78833, term78833.getClass(), "firstGameId", null);
        setField(term78833, term78833.getClass(), "firstRomVersion", null);
        setField(term78833, term78833.getClass(), "firstDataVersion", null);
        setField(term78833, term78833.getClass(), "firstPlayDate", null);
        setField(term78833, term78833.getClass(), "lastGameId", null);
        setField(term78833, term78833.getClass(), "lastRomVersion", null);
        setField(term78833, term78833.getClass(), "lastDataVersion", null);
        setField(term78833, term78833.getClass(), "compatibleCmVersion", null);
        setField(term78833, term78833.getClass(), "lastPlayDate", null);
        setIntField(term78833, term78833.getClass(), "lastPlaceId", 0);
        setField(term78833, term78833.getClass(), "lastPlaceName", null);
        setIntField(term78833, term78833.getClass(), "lastRegionId", 0);
        setField(term78833, term78833.getClass(), "lastRegionName", null);
        setIntField(term78833, term78833.getClass(), "lastAllNetId", 0);
        setField(term78833, term78833.getClass(), "lastClientId", null);
        setIntField(term78833, term78833.getClass(), "lastUsedDeckId", 0);
        setIntField(term78833, term78833.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78833, term78833.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumBattleExpertHighScore", argTypes, term78833, args);
    }

};


