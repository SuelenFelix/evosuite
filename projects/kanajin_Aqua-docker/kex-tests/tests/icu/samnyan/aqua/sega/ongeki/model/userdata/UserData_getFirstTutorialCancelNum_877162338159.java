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

public class UserData_getFirstTutorialCancelNum_877162338159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78363;

    public UserData_getFirstTutorialCancelNum_877162338159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78363 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78363, term78363.getClass(), "id", 0L);
        setField(term78363, term78363.getClass(), "card", null);
        setField(term78363, term78363.getClass(), "userName", null);
        setIntField(term78363, term78363.getClass(), "level", 0);
        setIntField(term78363, term78363.getClass(), "reincarnationNum", 0);
        setLongField(term78363, term78363.getClass(), "exp", 0L);
        setLongField(term78363, term78363.getClass(), "point", 0L);
        setLongField(term78363, term78363.getClass(), "totalPoint", 0L);
        setIntField(term78363, term78363.getClass(), "playCount", 0);
        setIntField(term78363, term78363.getClass(), "jewelCount", 0);
        setIntField(term78363, term78363.getClass(), "totalJewelCount", 0);
        setIntField(term78363, term78363.getClass(), "medalCount", 0);
        setIntField(term78363, term78363.getClass(), "playerRating", 0);
        setIntField(term78363, term78363.getClass(), "highestRating", 0);
        setIntField(term78363, term78363.getClass(), "battlePoint", 0);
        setIntField(term78363, term78363.getClass(), "bestBattlePoint", 0);
        setIntField(term78363, term78363.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78363, term78363.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78363, term78363.getClass(), "nameplateId", 0);
        setIntField(term78363, term78363.getClass(), "trophyId", 0);
        setIntField(term78363, term78363.getClass(), "cardId", 0);
        setIntField(term78363, term78363.getClass(), "characterId", 0);
        setIntField(term78363, term78363.getClass(), "characterVoiceNo", 0);
        setIntField(term78363, term78363.getClass(), "tabSetting", 0);
        setIntField(term78363, term78363.getClass(), "tabSortSetting", 0);
        setIntField(term78363, term78363.getClass(), "cardCategorySetting", 0);
        setIntField(term78363, term78363.getClass(), "cardSortSetting", 0);
        setIntField(term78363, term78363.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78363, term78363.getClass(), "playedTutorialBit", 0);
        setIntField(term78363, term78363.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78363, term78363.getClass(), "sumTechHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78363, term78363.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78363, term78363.getClass(), "eventWatchedDate", null);
        setField(term78363, term78363.getClass(), "cmEventWatchedDate", null);
        setField(term78363, term78363.getClass(), "firstGameId", null);
        setField(term78363, term78363.getClass(), "firstRomVersion", null);
        setField(term78363, term78363.getClass(), "firstDataVersion", null);
        setField(term78363, term78363.getClass(), "firstPlayDate", null);
        setField(term78363, term78363.getClass(), "lastGameId", null);
        setField(term78363, term78363.getClass(), "lastRomVersion", null);
        setField(term78363, term78363.getClass(), "lastDataVersion", null);
        setField(term78363, term78363.getClass(), "compatibleCmVersion", null);
        setField(term78363, term78363.getClass(), "lastPlayDate", null);
        setIntField(term78363, term78363.getClass(), "lastPlaceId", 0);
        setField(term78363, term78363.getClass(), "lastPlaceName", null);
        setIntField(term78363, term78363.getClass(), "lastRegionId", 0);
        setField(term78363, term78363.getClass(), "lastRegionName", null);
        setIntField(term78363, term78363.getClass(), "lastAllNetId", 0);
        setField(term78363, term78363.getClass(), "lastClientId", null);
        setIntField(term78363, term78363.getClass(), "lastUsedDeckId", 0);
        setIntField(term78363, term78363.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78363, term78363.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstTutorialCancelNum", argTypes, term78363, args);
    }

};


