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

public class UserData_setSumBattleHighScore_1434980563228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81674;
     Object term81721;

    public UserData_setSumBattleHighScore_1434980563228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81674 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81674, term81674.getClass(), "id", 0L);
        setField(term81674, term81674.getClass(), "card", null);
        setField(term81674, term81674.getClass(), "userName", null);
        setIntField(term81674, term81674.getClass(), "level", 0);
        setIntField(term81674, term81674.getClass(), "reincarnationNum", 0);
        setLongField(term81674, term81674.getClass(), "exp", 0L);
        setLongField(term81674, term81674.getClass(), "point", 0L);
        setLongField(term81674, term81674.getClass(), "totalPoint", 0L);
        setIntField(term81674, term81674.getClass(), "playCount", 0);
        setIntField(term81674, term81674.getClass(), "jewelCount", 0);
        setIntField(term81674, term81674.getClass(), "totalJewelCount", 0);
        setIntField(term81674, term81674.getClass(), "medalCount", 0);
        setIntField(term81674, term81674.getClass(), "playerRating", 0);
        setIntField(term81674, term81674.getClass(), "highestRating", 0);
        setIntField(term81674, term81674.getClass(), "battlePoint", 0);
        setIntField(term81674, term81674.getClass(), "bestBattlePoint", 0);
        setIntField(term81674, term81674.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81674, term81674.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81674, term81674.getClass(), "nameplateId", 0);
        setIntField(term81674, term81674.getClass(), "trophyId", 0);
        setIntField(term81674, term81674.getClass(), "cardId", 0);
        setIntField(term81674, term81674.getClass(), "characterId", 0);
        setIntField(term81674, term81674.getClass(), "characterVoiceNo", 0);
        setIntField(term81674, term81674.getClass(), "tabSetting", 0);
        setIntField(term81674, term81674.getClass(), "tabSortSetting", 0);
        setIntField(term81674, term81674.getClass(), "cardCategorySetting", 0);
        setIntField(term81674, term81674.getClass(), "cardSortSetting", 0);
        setIntField(term81674, term81674.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81674, term81674.getClass(), "playedTutorialBit", 0);
        setIntField(term81674, term81674.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81674, term81674.getClass(), "sumTechHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81674, term81674.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81674, term81674.getClass(), "eventWatchedDate", null);
        setField(term81674, term81674.getClass(), "cmEventWatchedDate", null);
        setField(term81674, term81674.getClass(), "firstGameId", null);
        setField(term81674, term81674.getClass(), "firstRomVersion", null);
        setField(term81674, term81674.getClass(), "firstDataVersion", null);
        setField(term81674, term81674.getClass(), "firstPlayDate", null);
        setField(term81674, term81674.getClass(), "lastGameId", null);
        setField(term81674, term81674.getClass(), "lastRomVersion", null);
        setField(term81674, term81674.getClass(), "lastDataVersion", null);
        setField(term81674, term81674.getClass(), "compatibleCmVersion", null);
        setField(term81674, term81674.getClass(), "lastPlayDate", null);
        setIntField(term81674, term81674.getClass(), "lastPlaceId", 0);
        setField(term81674, term81674.getClass(), "lastPlaceName", null);
        setIntField(term81674, term81674.getClass(), "lastRegionId", 0);
        setField(term81674, term81674.getClass(), "lastRegionName", null);
        setIntField(term81674, term81674.getClass(), "lastAllNetId", 0);
        setField(term81674, term81674.getClass(), "lastClientId", null);
        setIntField(term81674, term81674.getClass(), "lastUsedDeckId", 0);
        setIntField(term81674, term81674.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81674, term81674.getClass(), "lastEmoneyBrand", 0);
        term81721 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81721;
        callMethod(klass, "setSumBattleHighScore", argTypes, term81674, args);
    }

};


