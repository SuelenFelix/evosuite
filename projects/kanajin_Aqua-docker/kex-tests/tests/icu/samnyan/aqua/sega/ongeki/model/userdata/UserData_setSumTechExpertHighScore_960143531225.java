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
import java.lang.Long;

public class UserData_setSumTechExpertHighScore_960143531225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81527;
     Object term81574;

    public UserData_setSumTechExpertHighScore_960143531225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81527 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81527, term81527.getClass(), "id", 0L);
        setField(term81527, term81527.getClass(), "card", null);
        setField(term81527, term81527.getClass(), "userName", null);
        setIntField(term81527, term81527.getClass(), "level", 0);
        setIntField(term81527, term81527.getClass(), "reincarnationNum", 0);
        setLongField(term81527, term81527.getClass(), "exp", 0L);
        setLongField(term81527, term81527.getClass(), "point", 0L);
        setLongField(term81527, term81527.getClass(), "totalPoint", 0L);
        setIntField(term81527, term81527.getClass(), "playCount", 0);
        setIntField(term81527, term81527.getClass(), "jewelCount", 0);
        setIntField(term81527, term81527.getClass(), "totalJewelCount", 0);
        setIntField(term81527, term81527.getClass(), "medalCount", 0);
        setIntField(term81527, term81527.getClass(), "playerRating", 0);
        setIntField(term81527, term81527.getClass(), "highestRating", 0);
        setIntField(term81527, term81527.getClass(), "battlePoint", 0);
        setIntField(term81527, term81527.getClass(), "bestBattlePoint", 0);
        setIntField(term81527, term81527.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81527, term81527.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81527, term81527.getClass(), "nameplateId", 0);
        setIntField(term81527, term81527.getClass(), "trophyId", 0);
        setIntField(term81527, term81527.getClass(), "cardId", 0);
        setIntField(term81527, term81527.getClass(), "characterId", 0);
        setIntField(term81527, term81527.getClass(), "characterVoiceNo", 0);
        setIntField(term81527, term81527.getClass(), "tabSetting", 0);
        setIntField(term81527, term81527.getClass(), "tabSortSetting", 0);
        setIntField(term81527, term81527.getClass(), "cardCategorySetting", 0);
        setIntField(term81527, term81527.getClass(), "cardSortSetting", 0);
        setIntField(term81527, term81527.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81527, term81527.getClass(), "playedTutorialBit", 0);
        setIntField(term81527, term81527.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81527, term81527.getClass(), "sumTechHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81527, term81527.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81527, term81527.getClass(), "eventWatchedDate", null);
        setField(term81527, term81527.getClass(), "cmEventWatchedDate", null);
        setField(term81527, term81527.getClass(), "firstGameId", null);
        setField(term81527, term81527.getClass(), "firstRomVersion", null);
        setField(term81527, term81527.getClass(), "firstDataVersion", null);
        setField(term81527, term81527.getClass(), "firstPlayDate", null);
        setField(term81527, term81527.getClass(), "lastGameId", null);
        setField(term81527, term81527.getClass(), "lastRomVersion", null);
        setField(term81527, term81527.getClass(), "lastDataVersion", null);
        setField(term81527, term81527.getClass(), "compatibleCmVersion", null);
        setField(term81527, term81527.getClass(), "lastPlayDate", null);
        setIntField(term81527, term81527.getClass(), "lastPlaceId", 0);
        setField(term81527, term81527.getClass(), "lastPlaceName", null);
        setIntField(term81527, term81527.getClass(), "lastRegionId", 0);
        setField(term81527, term81527.getClass(), "lastRegionName", null);
        setIntField(term81527, term81527.getClass(), "lastAllNetId", 0);
        setField(term81527, term81527.getClass(), "lastClientId", null);
        setIntField(term81527, term81527.getClass(), "lastUsedDeckId", 0);
        setIntField(term81527, term81527.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81527, term81527.getClass(), "lastEmoneyBrand", 0);
        term81574 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81574;
        callMethod(klass, "setSumTechExpertHighScore", argTypes, term81527, args);
    }

};


