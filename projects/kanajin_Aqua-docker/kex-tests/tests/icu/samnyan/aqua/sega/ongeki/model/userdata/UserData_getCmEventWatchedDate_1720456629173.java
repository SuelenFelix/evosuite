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

public class UserData_getCmEventWatchedDate_1720456629173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79021;

    public UserData_getCmEventWatchedDate_1720456629173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79021 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79021, term79021.getClass(), "id", 0L);
        setField(term79021, term79021.getClass(), "card", null);
        setField(term79021, term79021.getClass(), "userName", null);
        setIntField(term79021, term79021.getClass(), "level", 0);
        setIntField(term79021, term79021.getClass(), "reincarnationNum", 0);
        setLongField(term79021, term79021.getClass(), "exp", 0L);
        setLongField(term79021, term79021.getClass(), "point", 0L);
        setLongField(term79021, term79021.getClass(), "totalPoint", 0L);
        setIntField(term79021, term79021.getClass(), "playCount", 0);
        setIntField(term79021, term79021.getClass(), "jewelCount", 0);
        setIntField(term79021, term79021.getClass(), "totalJewelCount", 0);
        setIntField(term79021, term79021.getClass(), "medalCount", 0);
        setIntField(term79021, term79021.getClass(), "playerRating", 0);
        setIntField(term79021, term79021.getClass(), "highestRating", 0);
        setIntField(term79021, term79021.getClass(), "battlePoint", 0);
        setIntField(term79021, term79021.getClass(), "bestBattlePoint", 0);
        setIntField(term79021, term79021.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79021, term79021.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79021, term79021.getClass(), "nameplateId", 0);
        setIntField(term79021, term79021.getClass(), "trophyId", 0);
        setIntField(term79021, term79021.getClass(), "cardId", 0);
        setIntField(term79021, term79021.getClass(), "characterId", 0);
        setIntField(term79021, term79021.getClass(), "characterVoiceNo", 0);
        setIntField(term79021, term79021.getClass(), "tabSetting", 0);
        setIntField(term79021, term79021.getClass(), "tabSortSetting", 0);
        setIntField(term79021, term79021.getClass(), "cardCategorySetting", 0);
        setIntField(term79021, term79021.getClass(), "cardSortSetting", 0);
        setIntField(term79021, term79021.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79021, term79021.getClass(), "playedTutorialBit", 0);
        setIntField(term79021, term79021.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79021, term79021.getClass(), "sumTechHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79021, term79021.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79021, term79021.getClass(), "eventWatchedDate", null);
        setField(term79021, term79021.getClass(), "cmEventWatchedDate", null);
        setField(term79021, term79021.getClass(), "firstGameId", null);
        setField(term79021, term79021.getClass(), "firstRomVersion", null);
        setField(term79021, term79021.getClass(), "firstDataVersion", null);
        setField(term79021, term79021.getClass(), "firstPlayDate", null);
        setField(term79021, term79021.getClass(), "lastGameId", null);
        setField(term79021, term79021.getClass(), "lastRomVersion", null);
        setField(term79021, term79021.getClass(), "lastDataVersion", null);
        setField(term79021, term79021.getClass(), "compatibleCmVersion", null);
        setField(term79021, term79021.getClass(), "lastPlayDate", null);
        setIntField(term79021, term79021.getClass(), "lastPlaceId", 0);
        setField(term79021, term79021.getClass(), "lastPlaceName", null);
        setIntField(term79021, term79021.getClass(), "lastRegionId", 0);
        setField(term79021, term79021.getClass(), "lastRegionName", null);
        setIntField(term79021, term79021.getClass(), "lastAllNetId", 0);
        setField(term79021, term79021.getClass(), "lastClientId", null);
        setIntField(term79021, term79021.getClass(), "lastUsedDeckId", 0);
        setIntField(term79021, term79021.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79021, term79021.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmEventWatchedDate", argTypes, term79021, args);
    }

};


