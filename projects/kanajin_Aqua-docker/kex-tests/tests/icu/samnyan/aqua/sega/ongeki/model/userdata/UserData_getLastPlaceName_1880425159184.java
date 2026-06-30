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

public class UserData_getLastPlaceName_1880425159184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79538;

    public UserData_getLastPlaceName_1880425159184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79538 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term79538, term79538.getClass(), "id", 0L);
        setField(term79538, term79538.getClass(), "card", null);
        setField(term79538, term79538.getClass(), "userName", null);
        setIntField(term79538, term79538.getClass(), "level", 0);
        setIntField(term79538, term79538.getClass(), "reincarnationNum", 0);
        setLongField(term79538, term79538.getClass(), "exp", 0L);
        setLongField(term79538, term79538.getClass(), "point", 0L);
        setLongField(term79538, term79538.getClass(), "totalPoint", 0L);
        setIntField(term79538, term79538.getClass(), "playCount", 0);
        setIntField(term79538, term79538.getClass(), "jewelCount", 0);
        setIntField(term79538, term79538.getClass(), "totalJewelCount", 0);
        setIntField(term79538, term79538.getClass(), "medalCount", 0);
        setIntField(term79538, term79538.getClass(), "playerRating", 0);
        setIntField(term79538, term79538.getClass(), "highestRating", 0);
        setIntField(term79538, term79538.getClass(), "battlePoint", 0);
        setIntField(term79538, term79538.getClass(), "bestBattlePoint", 0);
        setIntField(term79538, term79538.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term79538, term79538.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term79538, term79538.getClass(), "nameplateId", 0);
        setIntField(term79538, term79538.getClass(), "trophyId", 0);
        setIntField(term79538, term79538.getClass(), "cardId", 0);
        setIntField(term79538, term79538.getClass(), "characterId", 0);
        setIntField(term79538, term79538.getClass(), "characterVoiceNo", 0);
        setIntField(term79538, term79538.getClass(), "tabSetting", 0);
        setIntField(term79538, term79538.getClass(), "tabSortSetting", 0);
        setIntField(term79538, term79538.getClass(), "cardCategorySetting", 0);
        setIntField(term79538, term79538.getClass(), "cardSortSetting", 0);
        setIntField(term79538, term79538.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term79538, term79538.getClass(), "playedTutorialBit", 0);
        setIntField(term79538, term79538.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term79538, term79538.getClass(), "sumTechHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term79538, term79538.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term79538, term79538.getClass(), "eventWatchedDate", null);
        setField(term79538, term79538.getClass(), "cmEventWatchedDate", null);
        setField(term79538, term79538.getClass(), "firstGameId", null);
        setField(term79538, term79538.getClass(), "firstRomVersion", null);
        setField(term79538, term79538.getClass(), "firstDataVersion", null);
        setField(term79538, term79538.getClass(), "firstPlayDate", null);
        setField(term79538, term79538.getClass(), "lastGameId", null);
        setField(term79538, term79538.getClass(), "lastRomVersion", null);
        setField(term79538, term79538.getClass(), "lastDataVersion", null);
        setField(term79538, term79538.getClass(), "compatibleCmVersion", null);
        setField(term79538, term79538.getClass(), "lastPlayDate", null);
        setIntField(term79538, term79538.getClass(), "lastPlaceId", 0);
        setField(term79538, term79538.getClass(), "lastPlaceName", null);
        setIntField(term79538, term79538.getClass(), "lastRegionId", 0);
        setField(term79538, term79538.getClass(), "lastRegionName", null);
        setIntField(term79538, term79538.getClass(), "lastAllNetId", 0);
        setField(term79538, term79538.getClass(), "lastClientId", null);
        setIntField(term79538, term79538.getClass(), "lastUsedDeckId", 0);
        setIntField(term79538, term79538.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term79538, term79538.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlaceName", argTypes, term79538, args);
    }

};


