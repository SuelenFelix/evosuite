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

public class UserData_getLastPlayMusicLevel_294140525190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79820;

    public UserData_getLastPlayMusicLevel_294140525190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79820 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79820, term79820.getClass(), "id", 0L);
        setField(term79820, term79820.getClass(), "card", null);
        setField(term79820, term79820.getClass(), "userName", null);
        setIntField(term79820, term79820.getClass(), "level", 0);
        setIntField(term79820, term79820.getClass(), "reincarnationNum", 0);
        setLongField(term79820, term79820.getClass(), "exp", 0L);
        setLongField(term79820, term79820.getClass(), "point", 0L);
        setLongField(term79820, term79820.getClass(), "totalPoint", 0L);
        setIntField(term79820, term79820.getClass(), "playCount", 0);
        setIntField(term79820, term79820.getClass(), "jewelCount", 0);
        setIntField(term79820, term79820.getClass(), "totalJewelCount", 0);
        setIntField(term79820, term79820.getClass(), "medalCount", 0);
        setIntField(term79820, term79820.getClass(), "playerRating", 0);
        setIntField(term79820, term79820.getClass(), "highestRating", 0);
        setIntField(term79820, term79820.getClass(), "battlePoint", 0);
        setIntField(term79820, term79820.getClass(), "bestBattlePoint", 0);
        setIntField(term79820, term79820.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79820, term79820.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79820, term79820.getClass(), "nameplateId", 0);
        setIntField(term79820, term79820.getClass(), "trophyId", 0);
        setIntField(term79820, term79820.getClass(), "cardId", 0);
        setIntField(term79820, term79820.getClass(), "characterId", 0);
        setIntField(term79820, term79820.getClass(), "characterVoiceNo", 0);
        setIntField(term79820, term79820.getClass(), "tabSetting", 0);
        setIntField(term79820, term79820.getClass(), "tabSortSetting", 0);
        setIntField(term79820, term79820.getClass(), "cardCategorySetting", 0);
        setIntField(term79820, term79820.getClass(), "cardSortSetting", 0);
        setIntField(term79820, term79820.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79820, term79820.getClass(), "playedTutorialBit", 0);
        setIntField(term79820, term79820.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79820, term79820.getClass(), "sumTechHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79820, term79820.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79820, term79820.getClass(), "eventWatchedDate", null);
        setField(term79820, term79820.getClass(), "cmEventWatchedDate", null);
        setField(term79820, term79820.getClass(), "firstGameId", null);
        setField(term79820, term79820.getClass(), "firstRomVersion", null);
        setField(term79820, term79820.getClass(), "firstDataVersion", null);
        setField(term79820, term79820.getClass(), "firstPlayDate", null);
        setField(term79820, term79820.getClass(), "lastGameId", null);
        setField(term79820, term79820.getClass(), "lastRomVersion", null);
        setField(term79820, term79820.getClass(), "lastDataVersion", null);
        setField(term79820, term79820.getClass(), "compatibleCmVersion", null);
        setField(term79820, term79820.getClass(), "lastPlayDate", null);
        setIntField(term79820, term79820.getClass(), "lastPlaceId", 0);
        setField(term79820, term79820.getClass(), "lastPlaceName", null);
        setIntField(term79820, term79820.getClass(), "lastRegionId", 0);
        setField(term79820, term79820.getClass(), "lastRegionName", null);
        setIntField(term79820, term79820.getClass(), "lastAllNetId", 0);
        setField(term79820, term79820.getClass(), "lastClientId", null);
        setIntField(term79820, term79820.getClass(), "lastUsedDeckId", 0);
        setIntField(term79820, term79820.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79820, term79820.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMusicLevel", argTypes, term79820, args);
    }

};


