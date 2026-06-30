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

public class UserData_getLastRegionId_859004137185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79585;

    public UserData_getLastRegionId_859004137185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79585 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79585, term79585.getClass(), "id", 0L);
        setField(term79585, term79585.getClass(), "card", null);
        setField(term79585, term79585.getClass(), "userName", null);
        setIntField(term79585, term79585.getClass(), "level", 0);
        setIntField(term79585, term79585.getClass(), "reincarnationNum", 0);
        setLongField(term79585, term79585.getClass(), "exp", 0L);
        setLongField(term79585, term79585.getClass(), "point", 0L);
        setLongField(term79585, term79585.getClass(), "totalPoint", 0L);
        setIntField(term79585, term79585.getClass(), "playCount", 0);
        setIntField(term79585, term79585.getClass(), "jewelCount", 0);
        setIntField(term79585, term79585.getClass(), "totalJewelCount", 0);
        setIntField(term79585, term79585.getClass(), "medalCount", 0);
        setIntField(term79585, term79585.getClass(), "playerRating", 0);
        setIntField(term79585, term79585.getClass(), "highestRating", 0);
        setIntField(term79585, term79585.getClass(), "battlePoint", 0);
        setIntField(term79585, term79585.getClass(), "bestBattlePoint", 0);
        setIntField(term79585, term79585.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79585, term79585.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79585, term79585.getClass(), "nameplateId", 0);
        setIntField(term79585, term79585.getClass(), "trophyId", 0);
        setIntField(term79585, term79585.getClass(), "cardId", 0);
        setIntField(term79585, term79585.getClass(), "characterId", 0);
        setIntField(term79585, term79585.getClass(), "characterVoiceNo", 0);
        setIntField(term79585, term79585.getClass(), "tabSetting", 0);
        setIntField(term79585, term79585.getClass(), "tabSortSetting", 0);
        setIntField(term79585, term79585.getClass(), "cardCategorySetting", 0);
        setIntField(term79585, term79585.getClass(), "cardSortSetting", 0);
        setIntField(term79585, term79585.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79585, term79585.getClass(), "playedTutorialBit", 0);
        setIntField(term79585, term79585.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79585, term79585.getClass(), "sumTechHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79585, term79585.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79585, term79585.getClass(), "eventWatchedDate", null);
        setField(term79585, term79585.getClass(), "cmEventWatchedDate", null);
        setField(term79585, term79585.getClass(), "firstGameId", null);
        setField(term79585, term79585.getClass(), "firstRomVersion", null);
        setField(term79585, term79585.getClass(), "firstDataVersion", null);
        setField(term79585, term79585.getClass(), "firstPlayDate", null);
        setField(term79585, term79585.getClass(), "lastGameId", null);
        setField(term79585, term79585.getClass(), "lastRomVersion", null);
        setField(term79585, term79585.getClass(), "lastDataVersion", null);
        setField(term79585, term79585.getClass(), "compatibleCmVersion", null);
        setField(term79585, term79585.getClass(), "lastPlayDate", null);
        setIntField(term79585, term79585.getClass(), "lastPlaceId", 0);
        setField(term79585, term79585.getClass(), "lastPlaceName", null);
        setIntField(term79585, term79585.getClass(), "lastRegionId", 0);
        setField(term79585, term79585.getClass(), "lastRegionName", null);
        setIntField(term79585, term79585.getClass(), "lastAllNetId", 0);
        setField(term79585, term79585.getClass(), "lastClientId", null);
        setIntField(term79585, term79585.getClass(), "lastUsedDeckId", 0);
        setIntField(term79585, term79585.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79585, term79585.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionId", argTypes, term79585, args);
    }

};


