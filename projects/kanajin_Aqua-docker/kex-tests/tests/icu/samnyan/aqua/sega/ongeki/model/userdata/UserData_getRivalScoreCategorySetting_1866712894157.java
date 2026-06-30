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

public class UserData_getRivalScoreCategorySetting_1866712894157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78269;

    public UserData_getRivalScoreCategorySetting_1866712894157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78269 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78269, term78269.getClass(), "id", 0L);
        setField(term78269, term78269.getClass(), "card", null);
        setField(term78269, term78269.getClass(), "userName", null);
        setIntField(term78269, term78269.getClass(), "level", 0);
        setIntField(term78269, term78269.getClass(), "reincarnationNum", 0);
        setLongField(term78269, term78269.getClass(), "exp", 0L);
        setLongField(term78269, term78269.getClass(), "point", 0L);
        setLongField(term78269, term78269.getClass(), "totalPoint", 0L);
        setIntField(term78269, term78269.getClass(), "playCount", 0);
        setIntField(term78269, term78269.getClass(), "jewelCount", 0);
        setIntField(term78269, term78269.getClass(), "totalJewelCount", 0);
        setIntField(term78269, term78269.getClass(), "medalCount", 0);
        setIntField(term78269, term78269.getClass(), "playerRating", 0);
        setIntField(term78269, term78269.getClass(), "highestRating", 0);
        setIntField(term78269, term78269.getClass(), "battlePoint", 0);
        setIntField(term78269, term78269.getClass(), "bestBattlePoint", 0);
        setIntField(term78269, term78269.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78269, term78269.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78269, term78269.getClass(), "nameplateId", 0);
        setIntField(term78269, term78269.getClass(), "trophyId", 0);
        setIntField(term78269, term78269.getClass(), "cardId", 0);
        setIntField(term78269, term78269.getClass(), "characterId", 0);
        setIntField(term78269, term78269.getClass(), "characterVoiceNo", 0);
        setIntField(term78269, term78269.getClass(), "tabSetting", 0);
        setIntField(term78269, term78269.getClass(), "tabSortSetting", 0);
        setIntField(term78269, term78269.getClass(), "cardCategorySetting", 0);
        setIntField(term78269, term78269.getClass(), "cardSortSetting", 0);
        setIntField(term78269, term78269.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78269, term78269.getClass(), "playedTutorialBit", 0);
        setIntField(term78269, term78269.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78269, term78269.getClass(), "sumTechHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78269, term78269.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78269, term78269.getClass(), "eventWatchedDate", null);
        setField(term78269, term78269.getClass(), "cmEventWatchedDate", null);
        setField(term78269, term78269.getClass(), "firstGameId", null);
        setField(term78269, term78269.getClass(), "firstRomVersion", null);
        setField(term78269, term78269.getClass(), "firstDataVersion", null);
        setField(term78269, term78269.getClass(), "firstPlayDate", null);
        setField(term78269, term78269.getClass(), "lastGameId", null);
        setField(term78269, term78269.getClass(), "lastRomVersion", null);
        setField(term78269, term78269.getClass(), "lastDataVersion", null);
        setField(term78269, term78269.getClass(), "compatibleCmVersion", null);
        setField(term78269, term78269.getClass(), "lastPlayDate", null);
        setIntField(term78269, term78269.getClass(), "lastPlaceId", 0);
        setField(term78269, term78269.getClass(), "lastPlaceName", null);
        setIntField(term78269, term78269.getClass(), "lastRegionId", 0);
        setField(term78269, term78269.getClass(), "lastRegionName", null);
        setIntField(term78269, term78269.getClass(), "lastAllNetId", 0);
        setField(term78269, term78269.getClass(), "lastClientId", null);
        setIntField(term78269, term78269.getClass(), "lastUsedDeckId", 0);
        setIntField(term78269, term78269.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78269, term78269.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRivalScoreCategorySetting", argTypes, term78269, args);
    }

};


