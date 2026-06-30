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

public class UserData_getLastDataVersion_738051797180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79350;

    public UserData_getLastDataVersion_738051797180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79350 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79350, term79350.getClass(), "id", 0L);
        setField(term79350, term79350.getClass(), "card", null);
        setField(term79350, term79350.getClass(), "userName", null);
        setIntField(term79350, term79350.getClass(), "level", 0);
        setIntField(term79350, term79350.getClass(), "reincarnationNum", 0);
        setLongField(term79350, term79350.getClass(), "exp", 0L);
        setLongField(term79350, term79350.getClass(), "point", 0L);
        setLongField(term79350, term79350.getClass(), "totalPoint", 0L);
        setIntField(term79350, term79350.getClass(), "playCount", 0);
        setIntField(term79350, term79350.getClass(), "jewelCount", 0);
        setIntField(term79350, term79350.getClass(), "totalJewelCount", 0);
        setIntField(term79350, term79350.getClass(), "medalCount", 0);
        setIntField(term79350, term79350.getClass(), "playerRating", 0);
        setIntField(term79350, term79350.getClass(), "highestRating", 0);
        setIntField(term79350, term79350.getClass(), "battlePoint", 0);
        setIntField(term79350, term79350.getClass(), "bestBattlePoint", 0);
        setIntField(term79350, term79350.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79350, term79350.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79350, term79350.getClass(), "nameplateId", 0);
        setIntField(term79350, term79350.getClass(), "trophyId", 0);
        setIntField(term79350, term79350.getClass(), "cardId", 0);
        setIntField(term79350, term79350.getClass(), "characterId", 0);
        setIntField(term79350, term79350.getClass(), "characterVoiceNo", 0);
        setIntField(term79350, term79350.getClass(), "tabSetting", 0);
        setIntField(term79350, term79350.getClass(), "tabSortSetting", 0);
        setIntField(term79350, term79350.getClass(), "cardCategorySetting", 0);
        setIntField(term79350, term79350.getClass(), "cardSortSetting", 0);
        setIntField(term79350, term79350.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79350, term79350.getClass(), "playedTutorialBit", 0);
        setIntField(term79350, term79350.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79350, term79350.getClass(), "sumTechHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79350, term79350.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79350, term79350.getClass(), "eventWatchedDate", null);
        setField(term79350, term79350.getClass(), "cmEventWatchedDate", null);
        setField(term79350, term79350.getClass(), "firstGameId", null);
        setField(term79350, term79350.getClass(), "firstRomVersion", null);
        setField(term79350, term79350.getClass(), "firstDataVersion", null);
        setField(term79350, term79350.getClass(), "firstPlayDate", null);
        setField(term79350, term79350.getClass(), "lastGameId", null);
        setField(term79350, term79350.getClass(), "lastRomVersion", null);
        setField(term79350, term79350.getClass(), "lastDataVersion", null);
        setField(term79350, term79350.getClass(), "compatibleCmVersion", null);
        setField(term79350, term79350.getClass(), "lastPlayDate", null);
        setIntField(term79350, term79350.getClass(), "lastPlaceId", 0);
        setField(term79350, term79350.getClass(), "lastPlaceName", null);
        setIntField(term79350, term79350.getClass(), "lastRegionId", 0);
        setField(term79350, term79350.getClass(), "lastRegionName", null);
        setIntField(term79350, term79350.getClass(), "lastAllNetId", 0);
        setField(term79350, term79350.getClass(), "lastClientId", null);
        setIntField(term79350, term79350.getClass(), "lastUsedDeckId", 0);
        setIntField(term79350, term79350.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79350, term79350.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastDataVersion", argTypes, term79350, args);
    }

};


