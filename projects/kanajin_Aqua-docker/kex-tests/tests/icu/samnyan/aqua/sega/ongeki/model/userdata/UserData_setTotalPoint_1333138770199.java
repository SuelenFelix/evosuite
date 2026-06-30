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

public class UserData_setTotalPoint_1333138770199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80253;
     Object term80300;

    public UserData_setTotalPoint_1333138770199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80253, term80253.getClass(), "id", 0L);
        setField(term80253, term80253.getClass(), "card", null);
        setField(term80253, term80253.getClass(), "userName", null);
        setIntField(term80253, term80253.getClass(), "level", 0);
        setIntField(term80253, term80253.getClass(), "reincarnationNum", 0);
        setLongField(term80253, term80253.getClass(), "exp", 0L);
        setLongField(term80253, term80253.getClass(), "point", 0L);
        setLongField(term80253, term80253.getClass(), "totalPoint", 0L);
        setIntField(term80253, term80253.getClass(), "playCount", 0);
        setIntField(term80253, term80253.getClass(), "jewelCount", 0);
        setIntField(term80253, term80253.getClass(), "totalJewelCount", 0);
        setIntField(term80253, term80253.getClass(), "medalCount", 0);
        setIntField(term80253, term80253.getClass(), "playerRating", 0);
        setIntField(term80253, term80253.getClass(), "highestRating", 0);
        setIntField(term80253, term80253.getClass(), "battlePoint", 0);
        setIntField(term80253, term80253.getClass(), "bestBattlePoint", 0);
        setIntField(term80253, term80253.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80253, term80253.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80253, term80253.getClass(), "nameplateId", 0);
        setIntField(term80253, term80253.getClass(), "trophyId", 0);
        setIntField(term80253, term80253.getClass(), "cardId", 0);
        setIntField(term80253, term80253.getClass(), "characterId", 0);
        setIntField(term80253, term80253.getClass(), "characterVoiceNo", 0);
        setIntField(term80253, term80253.getClass(), "tabSetting", 0);
        setIntField(term80253, term80253.getClass(), "tabSortSetting", 0);
        setIntField(term80253, term80253.getClass(), "cardCategorySetting", 0);
        setIntField(term80253, term80253.getClass(), "cardSortSetting", 0);
        setIntField(term80253, term80253.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80253, term80253.getClass(), "playedTutorialBit", 0);
        setIntField(term80253, term80253.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80253, term80253.getClass(), "sumTechHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80253, term80253.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80253, term80253.getClass(), "eventWatchedDate", null);
        setField(term80253, term80253.getClass(), "cmEventWatchedDate", null);
        setField(term80253, term80253.getClass(), "firstGameId", null);
        setField(term80253, term80253.getClass(), "firstRomVersion", null);
        setField(term80253, term80253.getClass(), "firstDataVersion", null);
        setField(term80253, term80253.getClass(), "firstPlayDate", null);
        setField(term80253, term80253.getClass(), "lastGameId", null);
        setField(term80253, term80253.getClass(), "lastRomVersion", null);
        setField(term80253, term80253.getClass(), "lastDataVersion", null);
        setField(term80253, term80253.getClass(), "compatibleCmVersion", null);
        setField(term80253, term80253.getClass(), "lastPlayDate", null);
        setIntField(term80253, term80253.getClass(), "lastPlaceId", 0);
        setField(term80253, term80253.getClass(), "lastPlaceName", null);
        setIntField(term80253, term80253.getClass(), "lastRegionId", 0);
        setField(term80253, term80253.getClass(), "lastRegionName", null);
        setIntField(term80253, term80253.getClass(), "lastAllNetId", 0);
        setField(term80253, term80253.getClass(), "lastClientId", null);
        setIntField(term80253, term80253.getClass(), "lastUsedDeckId", 0);
        setIntField(term80253, term80253.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80253, term80253.getClass(), "lastEmoneyBrand", 0);
        term80300 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term80300;
        callMethod(klass, "setTotalPoint", argTypes, term80253, args);
    }

};


