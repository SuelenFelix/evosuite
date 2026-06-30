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

public class UserData_getTotalPoint_418758032137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77329;

    public UserData_getTotalPoint_418758032137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77329 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77329, term77329.getClass(), "id", 0L);
        setField(term77329, term77329.getClass(), "card", null);
        setField(term77329, term77329.getClass(), "userName", null);
        setIntField(term77329, term77329.getClass(), "level", 0);
        setIntField(term77329, term77329.getClass(), "reincarnationNum", 0);
        setLongField(term77329, term77329.getClass(), "exp", 0L);
        setLongField(term77329, term77329.getClass(), "point", 0L);
        setLongField(term77329, term77329.getClass(), "totalPoint", 0L);
        setIntField(term77329, term77329.getClass(), "playCount", 0);
        setIntField(term77329, term77329.getClass(), "jewelCount", 0);
        setIntField(term77329, term77329.getClass(), "totalJewelCount", 0);
        setIntField(term77329, term77329.getClass(), "medalCount", 0);
        setIntField(term77329, term77329.getClass(), "playerRating", 0);
        setIntField(term77329, term77329.getClass(), "highestRating", 0);
        setIntField(term77329, term77329.getClass(), "battlePoint", 0);
        setIntField(term77329, term77329.getClass(), "bestBattlePoint", 0);
        setIntField(term77329, term77329.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77329, term77329.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77329, term77329.getClass(), "nameplateId", 0);
        setIntField(term77329, term77329.getClass(), "trophyId", 0);
        setIntField(term77329, term77329.getClass(), "cardId", 0);
        setIntField(term77329, term77329.getClass(), "characterId", 0);
        setIntField(term77329, term77329.getClass(), "characterVoiceNo", 0);
        setIntField(term77329, term77329.getClass(), "tabSetting", 0);
        setIntField(term77329, term77329.getClass(), "tabSortSetting", 0);
        setIntField(term77329, term77329.getClass(), "cardCategorySetting", 0);
        setIntField(term77329, term77329.getClass(), "cardSortSetting", 0);
        setIntField(term77329, term77329.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77329, term77329.getClass(), "playedTutorialBit", 0);
        setIntField(term77329, term77329.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77329, term77329.getClass(), "sumTechHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77329, term77329.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77329, term77329.getClass(), "eventWatchedDate", null);
        setField(term77329, term77329.getClass(), "cmEventWatchedDate", null);
        setField(term77329, term77329.getClass(), "firstGameId", null);
        setField(term77329, term77329.getClass(), "firstRomVersion", null);
        setField(term77329, term77329.getClass(), "firstDataVersion", null);
        setField(term77329, term77329.getClass(), "firstPlayDate", null);
        setField(term77329, term77329.getClass(), "lastGameId", null);
        setField(term77329, term77329.getClass(), "lastRomVersion", null);
        setField(term77329, term77329.getClass(), "lastDataVersion", null);
        setField(term77329, term77329.getClass(), "compatibleCmVersion", null);
        setField(term77329, term77329.getClass(), "lastPlayDate", null);
        setIntField(term77329, term77329.getClass(), "lastPlaceId", 0);
        setField(term77329, term77329.getClass(), "lastPlaceName", null);
        setIntField(term77329, term77329.getClass(), "lastRegionId", 0);
        setField(term77329, term77329.getClass(), "lastRegionName", null);
        setIntField(term77329, term77329.getClass(), "lastAllNetId", 0);
        setField(term77329, term77329.getClass(), "lastClientId", null);
        setIntField(term77329, term77329.getClass(), "lastUsedDeckId", 0);
        setIntField(term77329, term77329.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77329, term77329.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPoint", argTypes, term77329, args);
    }

};


