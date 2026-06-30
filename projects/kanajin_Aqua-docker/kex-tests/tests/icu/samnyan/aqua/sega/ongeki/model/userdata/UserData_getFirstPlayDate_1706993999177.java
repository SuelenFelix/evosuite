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

public class UserData_getFirstPlayDate_1706993999177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79209;

    public UserData_getFirstPlayDate_1706993999177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79209 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79209, term79209.getClass(), "id", 0L);
        setField(term79209, term79209.getClass(), "card", null);
        setField(term79209, term79209.getClass(), "userName", null);
        setIntField(term79209, term79209.getClass(), "level", 0);
        setIntField(term79209, term79209.getClass(), "reincarnationNum", 0);
        setLongField(term79209, term79209.getClass(), "exp", 0L);
        setLongField(term79209, term79209.getClass(), "point", 0L);
        setLongField(term79209, term79209.getClass(), "totalPoint", 0L);
        setIntField(term79209, term79209.getClass(), "playCount", 0);
        setIntField(term79209, term79209.getClass(), "jewelCount", 0);
        setIntField(term79209, term79209.getClass(), "totalJewelCount", 0);
        setIntField(term79209, term79209.getClass(), "medalCount", 0);
        setIntField(term79209, term79209.getClass(), "playerRating", 0);
        setIntField(term79209, term79209.getClass(), "highestRating", 0);
        setIntField(term79209, term79209.getClass(), "battlePoint", 0);
        setIntField(term79209, term79209.getClass(), "bestBattlePoint", 0);
        setIntField(term79209, term79209.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79209, term79209.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79209, term79209.getClass(), "nameplateId", 0);
        setIntField(term79209, term79209.getClass(), "trophyId", 0);
        setIntField(term79209, term79209.getClass(), "cardId", 0);
        setIntField(term79209, term79209.getClass(), "characterId", 0);
        setIntField(term79209, term79209.getClass(), "characterVoiceNo", 0);
        setIntField(term79209, term79209.getClass(), "tabSetting", 0);
        setIntField(term79209, term79209.getClass(), "tabSortSetting", 0);
        setIntField(term79209, term79209.getClass(), "cardCategorySetting", 0);
        setIntField(term79209, term79209.getClass(), "cardSortSetting", 0);
        setIntField(term79209, term79209.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79209, term79209.getClass(), "playedTutorialBit", 0);
        setIntField(term79209, term79209.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79209, term79209.getClass(), "sumTechHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79209, term79209.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79209, term79209.getClass(), "eventWatchedDate", null);
        setField(term79209, term79209.getClass(), "cmEventWatchedDate", null);
        setField(term79209, term79209.getClass(), "firstGameId", null);
        setField(term79209, term79209.getClass(), "firstRomVersion", null);
        setField(term79209, term79209.getClass(), "firstDataVersion", null);
        setField(term79209, term79209.getClass(), "firstPlayDate", null);
        setField(term79209, term79209.getClass(), "lastGameId", null);
        setField(term79209, term79209.getClass(), "lastRomVersion", null);
        setField(term79209, term79209.getClass(), "lastDataVersion", null);
        setField(term79209, term79209.getClass(), "compatibleCmVersion", null);
        setField(term79209, term79209.getClass(), "lastPlayDate", null);
        setIntField(term79209, term79209.getClass(), "lastPlaceId", 0);
        setField(term79209, term79209.getClass(), "lastPlaceName", null);
        setIntField(term79209, term79209.getClass(), "lastRegionId", 0);
        setField(term79209, term79209.getClass(), "lastRegionName", null);
        setIntField(term79209, term79209.getClass(), "lastAllNetId", 0);
        setField(term79209, term79209.getClass(), "lastClientId", null);
        setIntField(term79209, term79209.getClass(), "lastUsedDeckId", 0);
        setIntField(term79209, term79209.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79209, term79209.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstPlayDate", argTypes, term79209, args);
    }

};


