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

public class UserData_getCompatibleCmVersion_43135849181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79397;

    public UserData_getCompatibleCmVersion_43135849181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79397 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79397, term79397.getClass(), "id", 0L);
        setField(term79397, term79397.getClass(), "card", null);
        setField(term79397, term79397.getClass(), "userName", null);
        setIntField(term79397, term79397.getClass(), "level", 0);
        setIntField(term79397, term79397.getClass(), "reincarnationNum", 0);
        setLongField(term79397, term79397.getClass(), "exp", 0L);
        setLongField(term79397, term79397.getClass(), "point", 0L);
        setLongField(term79397, term79397.getClass(), "totalPoint", 0L);
        setIntField(term79397, term79397.getClass(), "playCount", 0);
        setIntField(term79397, term79397.getClass(), "jewelCount", 0);
        setIntField(term79397, term79397.getClass(), "totalJewelCount", 0);
        setIntField(term79397, term79397.getClass(), "medalCount", 0);
        setIntField(term79397, term79397.getClass(), "playerRating", 0);
        setIntField(term79397, term79397.getClass(), "highestRating", 0);
        setIntField(term79397, term79397.getClass(), "battlePoint", 0);
        setIntField(term79397, term79397.getClass(), "bestBattlePoint", 0);
        setIntField(term79397, term79397.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79397, term79397.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79397, term79397.getClass(), "nameplateId", 0);
        setIntField(term79397, term79397.getClass(), "trophyId", 0);
        setIntField(term79397, term79397.getClass(), "cardId", 0);
        setIntField(term79397, term79397.getClass(), "characterId", 0);
        setIntField(term79397, term79397.getClass(), "characterVoiceNo", 0);
        setIntField(term79397, term79397.getClass(), "tabSetting", 0);
        setIntField(term79397, term79397.getClass(), "tabSortSetting", 0);
        setIntField(term79397, term79397.getClass(), "cardCategorySetting", 0);
        setIntField(term79397, term79397.getClass(), "cardSortSetting", 0);
        setIntField(term79397, term79397.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79397, term79397.getClass(), "playedTutorialBit", 0);
        setIntField(term79397, term79397.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79397, term79397.getClass(), "sumTechHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79397, term79397.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79397, term79397.getClass(), "eventWatchedDate", null);
        setField(term79397, term79397.getClass(), "cmEventWatchedDate", null);
        setField(term79397, term79397.getClass(), "firstGameId", null);
        setField(term79397, term79397.getClass(), "firstRomVersion", null);
        setField(term79397, term79397.getClass(), "firstDataVersion", null);
        setField(term79397, term79397.getClass(), "firstPlayDate", null);
        setField(term79397, term79397.getClass(), "lastGameId", null);
        setField(term79397, term79397.getClass(), "lastRomVersion", null);
        setField(term79397, term79397.getClass(), "lastDataVersion", null);
        setField(term79397, term79397.getClass(), "compatibleCmVersion", null);
        setField(term79397, term79397.getClass(), "lastPlayDate", null);
        setIntField(term79397, term79397.getClass(), "lastPlaceId", 0);
        setField(term79397, term79397.getClass(), "lastPlaceName", null);
        setIntField(term79397, term79397.getClass(), "lastRegionId", 0);
        setField(term79397, term79397.getClass(), "lastRegionName", null);
        setIntField(term79397, term79397.getClass(), "lastAllNetId", 0);
        setField(term79397, term79397.getClass(), "lastClientId", null);
        setIntField(term79397, term79397.getClass(), "lastUsedDeckId", 0);
        setIntField(term79397, term79397.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79397, term79397.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCompatibleCmVersion", argTypes, term79397, args);
    }

};


