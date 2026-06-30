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

public class UserData_setSumBattleBasicHighScore_2037160473229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81723;
     Object term81770;

    public UserData_setSumBattleBasicHighScore_2037160473229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81723 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81723, term81723.getClass(), "id", 0L);
        setField(term81723, term81723.getClass(), "card", null);
        setField(term81723, term81723.getClass(), "userName", null);
        setIntField(term81723, term81723.getClass(), "level", 0);
        setIntField(term81723, term81723.getClass(), "reincarnationNum", 0);
        setLongField(term81723, term81723.getClass(), "exp", 0L);
        setLongField(term81723, term81723.getClass(), "point", 0L);
        setLongField(term81723, term81723.getClass(), "totalPoint", 0L);
        setIntField(term81723, term81723.getClass(), "playCount", 0);
        setIntField(term81723, term81723.getClass(), "jewelCount", 0);
        setIntField(term81723, term81723.getClass(), "totalJewelCount", 0);
        setIntField(term81723, term81723.getClass(), "medalCount", 0);
        setIntField(term81723, term81723.getClass(), "playerRating", 0);
        setIntField(term81723, term81723.getClass(), "highestRating", 0);
        setIntField(term81723, term81723.getClass(), "battlePoint", 0);
        setIntField(term81723, term81723.getClass(), "bestBattlePoint", 0);
        setIntField(term81723, term81723.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81723, term81723.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81723, term81723.getClass(), "nameplateId", 0);
        setIntField(term81723, term81723.getClass(), "trophyId", 0);
        setIntField(term81723, term81723.getClass(), "cardId", 0);
        setIntField(term81723, term81723.getClass(), "characterId", 0);
        setIntField(term81723, term81723.getClass(), "characterVoiceNo", 0);
        setIntField(term81723, term81723.getClass(), "tabSetting", 0);
        setIntField(term81723, term81723.getClass(), "tabSortSetting", 0);
        setIntField(term81723, term81723.getClass(), "cardCategorySetting", 0);
        setIntField(term81723, term81723.getClass(), "cardSortSetting", 0);
        setIntField(term81723, term81723.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81723, term81723.getClass(), "playedTutorialBit", 0);
        setIntField(term81723, term81723.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81723, term81723.getClass(), "sumTechHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81723, term81723.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81723, term81723.getClass(), "eventWatchedDate", null);
        setField(term81723, term81723.getClass(), "cmEventWatchedDate", null);
        setField(term81723, term81723.getClass(), "firstGameId", null);
        setField(term81723, term81723.getClass(), "firstRomVersion", null);
        setField(term81723, term81723.getClass(), "firstDataVersion", null);
        setField(term81723, term81723.getClass(), "firstPlayDate", null);
        setField(term81723, term81723.getClass(), "lastGameId", null);
        setField(term81723, term81723.getClass(), "lastRomVersion", null);
        setField(term81723, term81723.getClass(), "lastDataVersion", null);
        setField(term81723, term81723.getClass(), "compatibleCmVersion", null);
        setField(term81723, term81723.getClass(), "lastPlayDate", null);
        setIntField(term81723, term81723.getClass(), "lastPlaceId", 0);
        setField(term81723, term81723.getClass(), "lastPlaceName", null);
        setIntField(term81723, term81723.getClass(), "lastRegionId", 0);
        setField(term81723, term81723.getClass(), "lastRegionName", null);
        setIntField(term81723, term81723.getClass(), "lastAllNetId", 0);
        setField(term81723, term81723.getClass(), "lastClientId", null);
        setIntField(term81723, term81723.getClass(), "lastUsedDeckId", 0);
        setIntField(term81723, term81723.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81723, term81723.getClass(), "lastEmoneyBrand", 0);
        term81770 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81770;
        callMethod(klass, "setSumBattleBasicHighScore", argTypes, term81723, args);
    }

};


