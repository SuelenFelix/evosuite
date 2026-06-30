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

public class UserData_setSumBattleExpertHighScore_72091383231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81821;
     Object term81868;

    public UserData_setSumBattleExpertHighScore_72091383231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81821 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81821, term81821.getClass(), "id", 0L);
        setField(term81821, term81821.getClass(), "card", null);
        setField(term81821, term81821.getClass(), "userName", null);
        setIntField(term81821, term81821.getClass(), "level", 0);
        setIntField(term81821, term81821.getClass(), "reincarnationNum", 0);
        setLongField(term81821, term81821.getClass(), "exp", 0L);
        setLongField(term81821, term81821.getClass(), "point", 0L);
        setLongField(term81821, term81821.getClass(), "totalPoint", 0L);
        setIntField(term81821, term81821.getClass(), "playCount", 0);
        setIntField(term81821, term81821.getClass(), "jewelCount", 0);
        setIntField(term81821, term81821.getClass(), "totalJewelCount", 0);
        setIntField(term81821, term81821.getClass(), "medalCount", 0);
        setIntField(term81821, term81821.getClass(), "playerRating", 0);
        setIntField(term81821, term81821.getClass(), "highestRating", 0);
        setIntField(term81821, term81821.getClass(), "battlePoint", 0);
        setIntField(term81821, term81821.getClass(), "bestBattlePoint", 0);
        setIntField(term81821, term81821.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81821, term81821.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81821, term81821.getClass(), "nameplateId", 0);
        setIntField(term81821, term81821.getClass(), "trophyId", 0);
        setIntField(term81821, term81821.getClass(), "cardId", 0);
        setIntField(term81821, term81821.getClass(), "characterId", 0);
        setIntField(term81821, term81821.getClass(), "characterVoiceNo", 0);
        setIntField(term81821, term81821.getClass(), "tabSetting", 0);
        setIntField(term81821, term81821.getClass(), "tabSortSetting", 0);
        setIntField(term81821, term81821.getClass(), "cardCategorySetting", 0);
        setIntField(term81821, term81821.getClass(), "cardSortSetting", 0);
        setIntField(term81821, term81821.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81821, term81821.getClass(), "playedTutorialBit", 0);
        setIntField(term81821, term81821.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81821, term81821.getClass(), "sumTechHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81821, term81821.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81821, term81821.getClass(), "eventWatchedDate", null);
        setField(term81821, term81821.getClass(), "cmEventWatchedDate", null);
        setField(term81821, term81821.getClass(), "firstGameId", null);
        setField(term81821, term81821.getClass(), "firstRomVersion", null);
        setField(term81821, term81821.getClass(), "firstDataVersion", null);
        setField(term81821, term81821.getClass(), "firstPlayDate", null);
        setField(term81821, term81821.getClass(), "lastGameId", null);
        setField(term81821, term81821.getClass(), "lastRomVersion", null);
        setField(term81821, term81821.getClass(), "lastDataVersion", null);
        setField(term81821, term81821.getClass(), "compatibleCmVersion", null);
        setField(term81821, term81821.getClass(), "lastPlayDate", null);
        setIntField(term81821, term81821.getClass(), "lastPlaceId", 0);
        setField(term81821, term81821.getClass(), "lastPlaceName", null);
        setIntField(term81821, term81821.getClass(), "lastRegionId", 0);
        setField(term81821, term81821.getClass(), "lastRegionName", null);
        setIntField(term81821, term81821.getClass(), "lastAllNetId", 0);
        setField(term81821, term81821.getClass(), "lastClientId", null);
        setIntField(term81821, term81821.getClass(), "lastUsedDeckId", 0);
        setIntField(term81821, term81821.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81821, term81821.getClass(), "lastEmoneyBrand", 0);
        term81868 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81868;
        callMethod(klass, "setSumBattleExpertHighScore", argTypes, term81821, args);
    }

};


