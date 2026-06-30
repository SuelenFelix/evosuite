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

public class UserData_getEventWatchedDate_959936811172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78974;

    public UserData_getEventWatchedDate_959936811172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78974 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78974, term78974.getClass(), "id", 0L);
        setField(term78974, term78974.getClass(), "card", null);
        setField(term78974, term78974.getClass(), "userName", null);
        setIntField(term78974, term78974.getClass(), "level", 0);
        setIntField(term78974, term78974.getClass(), "reincarnationNum", 0);
        setLongField(term78974, term78974.getClass(), "exp", 0L);
        setLongField(term78974, term78974.getClass(), "point", 0L);
        setLongField(term78974, term78974.getClass(), "totalPoint", 0L);
        setIntField(term78974, term78974.getClass(), "playCount", 0);
        setIntField(term78974, term78974.getClass(), "jewelCount", 0);
        setIntField(term78974, term78974.getClass(), "totalJewelCount", 0);
        setIntField(term78974, term78974.getClass(), "medalCount", 0);
        setIntField(term78974, term78974.getClass(), "playerRating", 0);
        setIntField(term78974, term78974.getClass(), "highestRating", 0);
        setIntField(term78974, term78974.getClass(), "battlePoint", 0);
        setIntField(term78974, term78974.getClass(), "bestBattlePoint", 0);
        setIntField(term78974, term78974.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78974, term78974.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78974, term78974.getClass(), "nameplateId", 0);
        setIntField(term78974, term78974.getClass(), "trophyId", 0);
        setIntField(term78974, term78974.getClass(), "cardId", 0);
        setIntField(term78974, term78974.getClass(), "characterId", 0);
        setIntField(term78974, term78974.getClass(), "characterVoiceNo", 0);
        setIntField(term78974, term78974.getClass(), "tabSetting", 0);
        setIntField(term78974, term78974.getClass(), "tabSortSetting", 0);
        setIntField(term78974, term78974.getClass(), "cardCategorySetting", 0);
        setIntField(term78974, term78974.getClass(), "cardSortSetting", 0);
        setIntField(term78974, term78974.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78974, term78974.getClass(), "playedTutorialBit", 0);
        setIntField(term78974, term78974.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78974, term78974.getClass(), "sumTechHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78974, term78974.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78974, term78974.getClass(), "eventWatchedDate", null);
        setField(term78974, term78974.getClass(), "cmEventWatchedDate", null);
        setField(term78974, term78974.getClass(), "firstGameId", null);
        setField(term78974, term78974.getClass(), "firstRomVersion", null);
        setField(term78974, term78974.getClass(), "firstDataVersion", null);
        setField(term78974, term78974.getClass(), "firstPlayDate", null);
        setField(term78974, term78974.getClass(), "lastGameId", null);
        setField(term78974, term78974.getClass(), "lastRomVersion", null);
        setField(term78974, term78974.getClass(), "lastDataVersion", null);
        setField(term78974, term78974.getClass(), "compatibleCmVersion", null);
        setField(term78974, term78974.getClass(), "lastPlayDate", null);
        setIntField(term78974, term78974.getClass(), "lastPlaceId", 0);
        setField(term78974, term78974.getClass(), "lastPlaceName", null);
        setIntField(term78974, term78974.getClass(), "lastRegionId", 0);
        setField(term78974, term78974.getClass(), "lastRegionName", null);
        setIntField(term78974, term78974.getClass(), "lastAllNetId", 0);
        setField(term78974, term78974.getClass(), "lastClientId", null);
        setIntField(term78974, term78974.getClass(), "lastUsedDeckId", 0);
        setIntField(term78974, term78974.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78974, term78974.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventWatchedDate", argTypes, term78974, args);
    }

};


