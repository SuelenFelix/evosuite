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

public class UserData_getCardSortSetting_1714994618156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78222;

    public UserData_getCardSortSetting_1714994618156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78222 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78222, term78222.getClass(), "id", 0L);
        setField(term78222, term78222.getClass(), "card", null);
        setField(term78222, term78222.getClass(), "userName", null);
        setIntField(term78222, term78222.getClass(), "level", 0);
        setIntField(term78222, term78222.getClass(), "reincarnationNum", 0);
        setLongField(term78222, term78222.getClass(), "exp", 0L);
        setLongField(term78222, term78222.getClass(), "point", 0L);
        setLongField(term78222, term78222.getClass(), "totalPoint", 0L);
        setIntField(term78222, term78222.getClass(), "playCount", 0);
        setIntField(term78222, term78222.getClass(), "jewelCount", 0);
        setIntField(term78222, term78222.getClass(), "totalJewelCount", 0);
        setIntField(term78222, term78222.getClass(), "medalCount", 0);
        setIntField(term78222, term78222.getClass(), "playerRating", 0);
        setIntField(term78222, term78222.getClass(), "highestRating", 0);
        setIntField(term78222, term78222.getClass(), "battlePoint", 0);
        setIntField(term78222, term78222.getClass(), "bestBattlePoint", 0);
        setIntField(term78222, term78222.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78222, term78222.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78222, term78222.getClass(), "nameplateId", 0);
        setIntField(term78222, term78222.getClass(), "trophyId", 0);
        setIntField(term78222, term78222.getClass(), "cardId", 0);
        setIntField(term78222, term78222.getClass(), "characterId", 0);
        setIntField(term78222, term78222.getClass(), "characterVoiceNo", 0);
        setIntField(term78222, term78222.getClass(), "tabSetting", 0);
        setIntField(term78222, term78222.getClass(), "tabSortSetting", 0);
        setIntField(term78222, term78222.getClass(), "cardCategorySetting", 0);
        setIntField(term78222, term78222.getClass(), "cardSortSetting", 0);
        setIntField(term78222, term78222.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78222, term78222.getClass(), "playedTutorialBit", 0);
        setIntField(term78222, term78222.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78222, term78222.getClass(), "sumTechHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78222, term78222.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78222, term78222.getClass(), "eventWatchedDate", null);
        setField(term78222, term78222.getClass(), "cmEventWatchedDate", null);
        setField(term78222, term78222.getClass(), "firstGameId", null);
        setField(term78222, term78222.getClass(), "firstRomVersion", null);
        setField(term78222, term78222.getClass(), "firstDataVersion", null);
        setField(term78222, term78222.getClass(), "firstPlayDate", null);
        setField(term78222, term78222.getClass(), "lastGameId", null);
        setField(term78222, term78222.getClass(), "lastRomVersion", null);
        setField(term78222, term78222.getClass(), "lastDataVersion", null);
        setField(term78222, term78222.getClass(), "compatibleCmVersion", null);
        setField(term78222, term78222.getClass(), "lastPlayDate", null);
        setIntField(term78222, term78222.getClass(), "lastPlaceId", 0);
        setField(term78222, term78222.getClass(), "lastPlaceName", null);
        setIntField(term78222, term78222.getClass(), "lastRegionId", 0);
        setField(term78222, term78222.getClass(), "lastRegionName", null);
        setIntField(term78222, term78222.getClass(), "lastAllNetId", 0);
        setField(term78222, term78222.getClass(), "lastClientId", null);
        setIntField(term78222, term78222.getClass(), "lastUsedDeckId", 0);
        setIntField(term78222, term78222.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78222, term78222.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardSortSetting", argTypes, term78222, args);
    }

};


