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

public class UserData_getLevel_255543396133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77141;

    public UserData_getLevel_255543396133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77141 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77141, term77141.getClass(), "id", 0L);
        setField(term77141, term77141.getClass(), "card", null);
        setField(term77141, term77141.getClass(), "userName", null);
        setIntField(term77141, term77141.getClass(), "level", 0);
        setIntField(term77141, term77141.getClass(), "reincarnationNum", 0);
        setLongField(term77141, term77141.getClass(), "exp", 0L);
        setLongField(term77141, term77141.getClass(), "point", 0L);
        setLongField(term77141, term77141.getClass(), "totalPoint", 0L);
        setIntField(term77141, term77141.getClass(), "playCount", 0);
        setIntField(term77141, term77141.getClass(), "jewelCount", 0);
        setIntField(term77141, term77141.getClass(), "totalJewelCount", 0);
        setIntField(term77141, term77141.getClass(), "medalCount", 0);
        setIntField(term77141, term77141.getClass(), "playerRating", 0);
        setIntField(term77141, term77141.getClass(), "highestRating", 0);
        setIntField(term77141, term77141.getClass(), "battlePoint", 0);
        setIntField(term77141, term77141.getClass(), "bestBattlePoint", 0);
        setIntField(term77141, term77141.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77141, term77141.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77141, term77141.getClass(), "nameplateId", 0);
        setIntField(term77141, term77141.getClass(), "trophyId", 0);
        setIntField(term77141, term77141.getClass(), "cardId", 0);
        setIntField(term77141, term77141.getClass(), "characterId", 0);
        setIntField(term77141, term77141.getClass(), "characterVoiceNo", 0);
        setIntField(term77141, term77141.getClass(), "tabSetting", 0);
        setIntField(term77141, term77141.getClass(), "tabSortSetting", 0);
        setIntField(term77141, term77141.getClass(), "cardCategorySetting", 0);
        setIntField(term77141, term77141.getClass(), "cardSortSetting", 0);
        setIntField(term77141, term77141.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77141, term77141.getClass(), "playedTutorialBit", 0);
        setIntField(term77141, term77141.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77141, term77141.getClass(), "sumTechHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77141, term77141.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77141, term77141.getClass(), "eventWatchedDate", null);
        setField(term77141, term77141.getClass(), "cmEventWatchedDate", null);
        setField(term77141, term77141.getClass(), "firstGameId", null);
        setField(term77141, term77141.getClass(), "firstRomVersion", null);
        setField(term77141, term77141.getClass(), "firstDataVersion", null);
        setField(term77141, term77141.getClass(), "firstPlayDate", null);
        setField(term77141, term77141.getClass(), "lastGameId", null);
        setField(term77141, term77141.getClass(), "lastRomVersion", null);
        setField(term77141, term77141.getClass(), "lastDataVersion", null);
        setField(term77141, term77141.getClass(), "compatibleCmVersion", null);
        setField(term77141, term77141.getClass(), "lastPlayDate", null);
        setIntField(term77141, term77141.getClass(), "lastPlaceId", 0);
        setField(term77141, term77141.getClass(), "lastPlaceName", null);
        setIntField(term77141, term77141.getClass(), "lastRegionId", 0);
        setField(term77141, term77141.getClass(), "lastRegionName", null);
        setIntField(term77141, term77141.getClass(), "lastAllNetId", 0);
        setField(term77141, term77141.getClass(), "lastClientId", null);
        setIntField(term77141, term77141.getClass(), "lastUsedDeckId", 0);
        setIntField(term77141, term77141.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77141, term77141.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term77141, args);
    }

};


