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

public class UserData_getReincarnationNum_1766403719134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77188;

    public UserData_getReincarnationNum_1766403719134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77188 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77188, term77188.getClass(), "id", 0L);
        setField(term77188, term77188.getClass(), "card", null);
        setField(term77188, term77188.getClass(), "userName", null);
        setIntField(term77188, term77188.getClass(), "level", 0);
        setIntField(term77188, term77188.getClass(), "reincarnationNum", 0);
        setLongField(term77188, term77188.getClass(), "exp", 0L);
        setLongField(term77188, term77188.getClass(), "point", 0L);
        setLongField(term77188, term77188.getClass(), "totalPoint", 0L);
        setIntField(term77188, term77188.getClass(), "playCount", 0);
        setIntField(term77188, term77188.getClass(), "jewelCount", 0);
        setIntField(term77188, term77188.getClass(), "totalJewelCount", 0);
        setIntField(term77188, term77188.getClass(), "medalCount", 0);
        setIntField(term77188, term77188.getClass(), "playerRating", 0);
        setIntField(term77188, term77188.getClass(), "highestRating", 0);
        setIntField(term77188, term77188.getClass(), "battlePoint", 0);
        setIntField(term77188, term77188.getClass(), "bestBattlePoint", 0);
        setIntField(term77188, term77188.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77188, term77188.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77188, term77188.getClass(), "nameplateId", 0);
        setIntField(term77188, term77188.getClass(), "trophyId", 0);
        setIntField(term77188, term77188.getClass(), "cardId", 0);
        setIntField(term77188, term77188.getClass(), "characterId", 0);
        setIntField(term77188, term77188.getClass(), "characterVoiceNo", 0);
        setIntField(term77188, term77188.getClass(), "tabSetting", 0);
        setIntField(term77188, term77188.getClass(), "tabSortSetting", 0);
        setIntField(term77188, term77188.getClass(), "cardCategorySetting", 0);
        setIntField(term77188, term77188.getClass(), "cardSortSetting", 0);
        setIntField(term77188, term77188.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77188, term77188.getClass(), "playedTutorialBit", 0);
        setIntField(term77188, term77188.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77188, term77188.getClass(), "sumTechHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77188, term77188.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77188, term77188.getClass(), "eventWatchedDate", null);
        setField(term77188, term77188.getClass(), "cmEventWatchedDate", null);
        setField(term77188, term77188.getClass(), "firstGameId", null);
        setField(term77188, term77188.getClass(), "firstRomVersion", null);
        setField(term77188, term77188.getClass(), "firstDataVersion", null);
        setField(term77188, term77188.getClass(), "firstPlayDate", null);
        setField(term77188, term77188.getClass(), "lastGameId", null);
        setField(term77188, term77188.getClass(), "lastRomVersion", null);
        setField(term77188, term77188.getClass(), "lastDataVersion", null);
        setField(term77188, term77188.getClass(), "compatibleCmVersion", null);
        setField(term77188, term77188.getClass(), "lastPlayDate", null);
        setIntField(term77188, term77188.getClass(), "lastPlaceId", 0);
        setField(term77188, term77188.getClass(), "lastPlaceName", null);
        setIntField(term77188, term77188.getClass(), "lastRegionId", 0);
        setField(term77188, term77188.getClass(), "lastRegionName", null);
        setIntField(term77188, term77188.getClass(), "lastAllNetId", 0);
        setField(term77188, term77188.getClass(), "lastClientId", null);
        setIntField(term77188, term77188.getClass(), "lastUsedDeckId", 0);
        setIntField(term77188, term77188.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77188, term77188.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReincarnationNum", argTypes, term77188, args);
    }

};


