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

public class UserData_setPoint_1214499058198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80204;
     Object term80251;

    public UserData_setPoint_1214499058198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80204 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80204, term80204.getClass(), "id", 0L);
        setField(term80204, term80204.getClass(), "card", null);
        setField(term80204, term80204.getClass(), "userName", null);
        setIntField(term80204, term80204.getClass(), "level", 0);
        setIntField(term80204, term80204.getClass(), "reincarnationNum", 0);
        setLongField(term80204, term80204.getClass(), "exp", 0L);
        setLongField(term80204, term80204.getClass(), "point", 0L);
        setLongField(term80204, term80204.getClass(), "totalPoint", 0L);
        setIntField(term80204, term80204.getClass(), "playCount", 0);
        setIntField(term80204, term80204.getClass(), "jewelCount", 0);
        setIntField(term80204, term80204.getClass(), "totalJewelCount", 0);
        setIntField(term80204, term80204.getClass(), "medalCount", 0);
        setIntField(term80204, term80204.getClass(), "playerRating", 0);
        setIntField(term80204, term80204.getClass(), "highestRating", 0);
        setIntField(term80204, term80204.getClass(), "battlePoint", 0);
        setIntField(term80204, term80204.getClass(), "bestBattlePoint", 0);
        setIntField(term80204, term80204.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80204, term80204.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80204, term80204.getClass(), "nameplateId", 0);
        setIntField(term80204, term80204.getClass(), "trophyId", 0);
        setIntField(term80204, term80204.getClass(), "cardId", 0);
        setIntField(term80204, term80204.getClass(), "characterId", 0);
        setIntField(term80204, term80204.getClass(), "characterVoiceNo", 0);
        setIntField(term80204, term80204.getClass(), "tabSetting", 0);
        setIntField(term80204, term80204.getClass(), "tabSortSetting", 0);
        setIntField(term80204, term80204.getClass(), "cardCategorySetting", 0);
        setIntField(term80204, term80204.getClass(), "cardSortSetting", 0);
        setIntField(term80204, term80204.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80204, term80204.getClass(), "playedTutorialBit", 0);
        setIntField(term80204, term80204.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80204, term80204.getClass(), "sumTechHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80204, term80204.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80204, term80204.getClass(), "eventWatchedDate", null);
        setField(term80204, term80204.getClass(), "cmEventWatchedDate", null);
        setField(term80204, term80204.getClass(), "firstGameId", null);
        setField(term80204, term80204.getClass(), "firstRomVersion", null);
        setField(term80204, term80204.getClass(), "firstDataVersion", null);
        setField(term80204, term80204.getClass(), "firstPlayDate", null);
        setField(term80204, term80204.getClass(), "lastGameId", null);
        setField(term80204, term80204.getClass(), "lastRomVersion", null);
        setField(term80204, term80204.getClass(), "lastDataVersion", null);
        setField(term80204, term80204.getClass(), "compatibleCmVersion", null);
        setField(term80204, term80204.getClass(), "lastPlayDate", null);
        setIntField(term80204, term80204.getClass(), "lastPlaceId", 0);
        setField(term80204, term80204.getClass(), "lastPlaceName", null);
        setIntField(term80204, term80204.getClass(), "lastRegionId", 0);
        setField(term80204, term80204.getClass(), "lastRegionName", null);
        setIntField(term80204, term80204.getClass(), "lastAllNetId", 0);
        setField(term80204, term80204.getClass(), "lastClientId", null);
        setIntField(term80204, term80204.getClass(), "lastUsedDeckId", 0);
        setIntField(term80204, term80204.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80204, term80204.getClass(), "lastEmoneyBrand", 0);
        term80251 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80251;
        callMethod(klass, "setPoint", argTypes, term80204, args);
    }

};


