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

public class UserData_getPlayCount_1621423213138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77376;

    public UserData_getPlayCount_1621423213138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77376, term77376.getClass(), "id", 0L);
        setField(term77376, term77376.getClass(), "card", null);
        setField(term77376, term77376.getClass(), "userName", null);
        setIntField(term77376, term77376.getClass(), "level", 0);
        setIntField(term77376, term77376.getClass(), "reincarnationNum", 0);
        setLongField(term77376, term77376.getClass(), "exp", 0L);
        setLongField(term77376, term77376.getClass(), "point", 0L);
        setLongField(term77376, term77376.getClass(), "totalPoint", 0L);
        setIntField(term77376, term77376.getClass(), "playCount", 0);
        setIntField(term77376, term77376.getClass(), "jewelCount", 0);
        setIntField(term77376, term77376.getClass(), "totalJewelCount", 0);
        setIntField(term77376, term77376.getClass(), "medalCount", 0);
        setIntField(term77376, term77376.getClass(), "playerRating", 0);
        setIntField(term77376, term77376.getClass(), "highestRating", 0);
        setIntField(term77376, term77376.getClass(), "battlePoint", 0);
        setIntField(term77376, term77376.getClass(), "bestBattlePoint", 0);
        setIntField(term77376, term77376.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77376, term77376.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77376, term77376.getClass(), "nameplateId", 0);
        setIntField(term77376, term77376.getClass(), "trophyId", 0);
        setIntField(term77376, term77376.getClass(), "cardId", 0);
        setIntField(term77376, term77376.getClass(), "characterId", 0);
        setIntField(term77376, term77376.getClass(), "characterVoiceNo", 0);
        setIntField(term77376, term77376.getClass(), "tabSetting", 0);
        setIntField(term77376, term77376.getClass(), "tabSortSetting", 0);
        setIntField(term77376, term77376.getClass(), "cardCategorySetting", 0);
        setIntField(term77376, term77376.getClass(), "cardSortSetting", 0);
        setIntField(term77376, term77376.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77376, term77376.getClass(), "playedTutorialBit", 0);
        setIntField(term77376, term77376.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77376, term77376.getClass(), "sumTechHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77376, term77376.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77376, term77376.getClass(), "eventWatchedDate", null);
        setField(term77376, term77376.getClass(), "cmEventWatchedDate", null);
        setField(term77376, term77376.getClass(), "firstGameId", null);
        setField(term77376, term77376.getClass(), "firstRomVersion", null);
        setField(term77376, term77376.getClass(), "firstDataVersion", null);
        setField(term77376, term77376.getClass(), "firstPlayDate", null);
        setField(term77376, term77376.getClass(), "lastGameId", null);
        setField(term77376, term77376.getClass(), "lastRomVersion", null);
        setField(term77376, term77376.getClass(), "lastDataVersion", null);
        setField(term77376, term77376.getClass(), "compatibleCmVersion", null);
        setField(term77376, term77376.getClass(), "lastPlayDate", null);
        setIntField(term77376, term77376.getClass(), "lastPlaceId", 0);
        setField(term77376, term77376.getClass(), "lastPlaceName", null);
        setIntField(term77376, term77376.getClass(), "lastRegionId", 0);
        setField(term77376, term77376.getClass(), "lastRegionName", null);
        setIntField(term77376, term77376.getClass(), "lastAllNetId", 0);
        setField(term77376, term77376.getClass(), "lastClientId", null);
        setIntField(term77376, term77376.getClass(), "lastUsedDeckId", 0);
        setIntField(term77376, term77376.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77376, term77376.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayCount", argTypes, term77376, args);
    }

};


