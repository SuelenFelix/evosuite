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

public class UserData_setSumTechLunaticHighScore_1207177697227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81625;
     Object term81672;

    public UserData_setSumTechLunaticHighScore_1207177697227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81625 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81625, term81625.getClass(), "id", 0L);
        setField(term81625, term81625.getClass(), "card", null);
        setField(term81625, term81625.getClass(), "userName", null);
        setIntField(term81625, term81625.getClass(), "level", 0);
        setIntField(term81625, term81625.getClass(), "reincarnationNum", 0);
        setLongField(term81625, term81625.getClass(), "exp", 0L);
        setLongField(term81625, term81625.getClass(), "point", 0L);
        setLongField(term81625, term81625.getClass(), "totalPoint", 0L);
        setIntField(term81625, term81625.getClass(), "playCount", 0);
        setIntField(term81625, term81625.getClass(), "jewelCount", 0);
        setIntField(term81625, term81625.getClass(), "totalJewelCount", 0);
        setIntField(term81625, term81625.getClass(), "medalCount", 0);
        setIntField(term81625, term81625.getClass(), "playerRating", 0);
        setIntField(term81625, term81625.getClass(), "highestRating", 0);
        setIntField(term81625, term81625.getClass(), "battlePoint", 0);
        setIntField(term81625, term81625.getClass(), "bestBattlePoint", 0);
        setIntField(term81625, term81625.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81625, term81625.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81625, term81625.getClass(), "nameplateId", 0);
        setIntField(term81625, term81625.getClass(), "trophyId", 0);
        setIntField(term81625, term81625.getClass(), "cardId", 0);
        setIntField(term81625, term81625.getClass(), "characterId", 0);
        setIntField(term81625, term81625.getClass(), "characterVoiceNo", 0);
        setIntField(term81625, term81625.getClass(), "tabSetting", 0);
        setIntField(term81625, term81625.getClass(), "tabSortSetting", 0);
        setIntField(term81625, term81625.getClass(), "cardCategorySetting", 0);
        setIntField(term81625, term81625.getClass(), "cardSortSetting", 0);
        setIntField(term81625, term81625.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81625, term81625.getClass(), "playedTutorialBit", 0);
        setIntField(term81625, term81625.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81625, term81625.getClass(), "sumTechHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81625, term81625.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81625, term81625.getClass(), "eventWatchedDate", null);
        setField(term81625, term81625.getClass(), "cmEventWatchedDate", null);
        setField(term81625, term81625.getClass(), "firstGameId", null);
        setField(term81625, term81625.getClass(), "firstRomVersion", null);
        setField(term81625, term81625.getClass(), "firstDataVersion", null);
        setField(term81625, term81625.getClass(), "firstPlayDate", null);
        setField(term81625, term81625.getClass(), "lastGameId", null);
        setField(term81625, term81625.getClass(), "lastRomVersion", null);
        setField(term81625, term81625.getClass(), "lastDataVersion", null);
        setField(term81625, term81625.getClass(), "compatibleCmVersion", null);
        setField(term81625, term81625.getClass(), "lastPlayDate", null);
        setIntField(term81625, term81625.getClass(), "lastPlaceId", 0);
        setField(term81625, term81625.getClass(), "lastPlaceName", null);
        setIntField(term81625, term81625.getClass(), "lastRegionId", 0);
        setField(term81625, term81625.getClass(), "lastRegionName", null);
        setIntField(term81625, term81625.getClass(), "lastAllNetId", 0);
        setField(term81625, term81625.getClass(), "lastClientId", null);
        setIntField(term81625, term81625.getClass(), "lastUsedDeckId", 0);
        setIntField(term81625, term81625.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81625, term81625.getClass(), "lastEmoneyBrand", 0);
        term81672 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81672;
        callMethod(klass, "setSumTechLunaticHighScore", argTypes, term81625, args);
    }

};


