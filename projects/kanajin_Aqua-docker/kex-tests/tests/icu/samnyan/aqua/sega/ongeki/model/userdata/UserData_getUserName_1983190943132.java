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

public class UserData_getUserName_1983190943132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77094;

    public UserData_getUserName_1983190943132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77094 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77094, term77094.getClass(), "id", 0L);
        setField(term77094, term77094.getClass(), "card", null);
        setField(term77094, term77094.getClass(), "userName", null);
        setIntField(term77094, term77094.getClass(), "level", 0);
        setIntField(term77094, term77094.getClass(), "reincarnationNum", 0);
        setLongField(term77094, term77094.getClass(), "exp", 0L);
        setLongField(term77094, term77094.getClass(), "point", 0L);
        setLongField(term77094, term77094.getClass(), "totalPoint", 0L);
        setIntField(term77094, term77094.getClass(), "playCount", 0);
        setIntField(term77094, term77094.getClass(), "jewelCount", 0);
        setIntField(term77094, term77094.getClass(), "totalJewelCount", 0);
        setIntField(term77094, term77094.getClass(), "medalCount", 0);
        setIntField(term77094, term77094.getClass(), "playerRating", 0);
        setIntField(term77094, term77094.getClass(), "highestRating", 0);
        setIntField(term77094, term77094.getClass(), "battlePoint", 0);
        setIntField(term77094, term77094.getClass(), "bestBattlePoint", 0);
        setIntField(term77094, term77094.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77094, term77094.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77094, term77094.getClass(), "nameplateId", 0);
        setIntField(term77094, term77094.getClass(), "trophyId", 0);
        setIntField(term77094, term77094.getClass(), "cardId", 0);
        setIntField(term77094, term77094.getClass(), "characterId", 0);
        setIntField(term77094, term77094.getClass(), "characterVoiceNo", 0);
        setIntField(term77094, term77094.getClass(), "tabSetting", 0);
        setIntField(term77094, term77094.getClass(), "tabSortSetting", 0);
        setIntField(term77094, term77094.getClass(), "cardCategorySetting", 0);
        setIntField(term77094, term77094.getClass(), "cardSortSetting", 0);
        setIntField(term77094, term77094.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77094, term77094.getClass(), "playedTutorialBit", 0);
        setIntField(term77094, term77094.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77094, term77094.getClass(), "sumTechHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77094, term77094.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77094, term77094.getClass(), "eventWatchedDate", null);
        setField(term77094, term77094.getClass(), "cmEventWatchedDate", null);
        setField(term77094, term77094.getClass(), "firstGameId", null);
        setField(term77094, term77094.getClass(), "firstRomVersion", null);
        setField(term77094, term77094.getClass(), "firstDataVersion", null);
        setField(term77094, term77094.getClass(), "firstPlayDate", null);
        setField(term77094, term77094.getClass(), "lastGameId", null);
        setField(term77094, term77094.getClass(), "lastRomVersion", null);
        setField(term77094, term77094.getClass(), "lastDataVersion", null);
        setField(term77094, term77094.getClass(), "compatibleCmVersion", null);
        setField(term77094, term77094.getClass(), "lastPlayDate", null);
        setIntField(term77094, term77094.getClass(), "lastPlaceId", 0);
        setField(term77094, term77094.getClass(), "lastPlaceName", null);
        setIntField(term77094, term77094.getClass(), "lastRegionId", 0);
        setField(term77094, term77094.getClass(), "lastRegionName", null);
        setIntField(term77094, term77094.getClass(), "lastAllNetId", 0);
        setField(term77094, term77094.getClass(), "lastClientId", null);
        setIntField(term77094, term77094.getClass(), "lastUsedDeckId", 0);
        setIntField(term77094, term77094.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77094, term77094.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term77094, args);
    }

};


