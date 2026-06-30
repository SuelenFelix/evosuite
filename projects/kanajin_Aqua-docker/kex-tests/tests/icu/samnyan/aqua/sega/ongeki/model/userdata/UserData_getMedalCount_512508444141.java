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

public class UserData_getMedalCount_512508444141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77517;

    public UserData_getMedalCount_512508444141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77517 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77517, term77517.getClass(), "id", 0L);
        setField(term77517, term77517.getClass(), "card", null);
        setField(term77517, term77517.getClass(), "userName", null);
        setIntField(term77517, term77517.getClass(), "level", 0);
        setIntField(term77517, term77517.getClass(), "reincarnationNum", 0);
        setLongField(term77517, term77517.getClass(), "exp", 0L);
        setLongField(term77517, term77517.getClass(), "point", 0L);
        setLongField(term77517, term77517.getClass(), "totalPoint", 0L);
        setIntField(term77517, term77517.getClass(), "playCount", 0);
        setIntField(term77517, term77517.getClass(), "jewelCount", 0);
        setIntField(term77517, term77517.getClass(), "totalJewelCount", 0);
        setIntField(term77517, term77517.getClass(), "medalCount", 0);
        setIntField(term77517, term77517.getClass(), "playerRating", 0);
        setIntField(term77517, term77517.getClass(), "highestRating", 0);
        setIntField(term77517, term77517.getClass(), "battlePoint", 0);
        setIntField(term77517, term77517.getClass(), "bestBattlePoint", 0);
        setIntField(term77517, term77517.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77517, term77517.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77517, term77517.getClass(), "nameplateId", 0);
        setIntField(term77517, term77517.getClass(), "trophyId", 0);
        setIntField(term77517, term77517.getClass(), "cardId", 0);
        setIntField(term77517, term77517.getClass(), "characterId", 0);
        setIntField(term77517, term77517.getClass(), "characterVoiceNo", 0);
        setIntField(term77517, term77517.getClass(), "tabSetting", 0);
        setIntField(term77517, term77517.getClass(), "tabSortSetting", 0);
        setIntField(term77517, term77517.getClass(), "cardCategorySetting", 0);
        setIntField(term77517, term77517.getClass(), "cardSortSetting", 0);
        setIntField(term77517, term77517.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77517, term77517.getClass(), "playedTutorialBit", 0);
        setIntField(term77517, term77517.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77517, term77517.getClass(), "sumTechHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77517, term77517.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77517, term77517.getClass(), "eventWatchedDate", null);
        setField(term77517, term77517.getClass(), "cmEventWatchedDate", null);
        setField(term77517, term77517.getClass(), "firstGameId", null);
        setField(term77517, term77517.getClass(), "firstRomVersion", null);
        setField(term77517, term77517.getClass(), "firstDataVersion", null);
        setField(term77517, term77517.getClass(), "firstPlayDate", null);
        setField(term77517, term77517.getClass(), "lastGameId", null);
        setField(term77517, term77517.getClass(), "lastRomVersion", null);
        setField(term77517, term77517.getClass(), "lastDataVersion", null);
        setField(term77517, term77517.getClass(), "compatibleCmVersion", null);
        setField(term77517, term77517.getClass(), "lastPlayDate", null);
        setIntField(term77517, term77517.getClass(), "lastPlaceId", 0);
        setField(term77517, term77517.getClass(), "lastPlaceName", null);
        setIntField(term77517, term77517.getClass(), "lastRegionId", 0);
        setField(term77517, term77517.getClass(), "lastRegionName", null);
        setIntField(term77517, term77517.getClass(), "lastAllNetId", 0);
        setField(term77517, term77517.getClass(), "lastClientId", null);
        setIntField(term77517, term77517.getClass(), "lastUsedDeckId", 0);
        setIntField(term77517, term77517.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77517, term77517.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMedalCount", argTypes, term77517, args);
    }

};


