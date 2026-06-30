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

public class UserData_getCardCategorySetting_151627098155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78175;

    public UserData_getCardCategorySetting_151627098155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78175 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78175, term78175.getClass(), "id", 0L);
        setField(term78175, term78175.getClass(), "card", null);
        setField(term78175, term78175.getClass(), "userName", null);
        setIntField(term78175, term78175.getClass(), "level", 0);
        setIntField(term78175, term78175.getClass(), "reincarnationNum", 0);
        setLongField(term78175, term78175.getClass(), "exp", 0L);
        setLongField(term78175, term78175.getClass(), "point", 0L);
        setLongField(term78175, term78175.getClass(), "totalPoint", 0L);
        setIntField(term78175, term78175.getClass(), "playCount", 0);
        setIntField(term78175, term78175.getClass(), "jewelCount", 0);
        setIntField(term78175, term78175.getClass(), "totalJewelCount", 0);
        setIntField(term78175, term78175.getClass(), "medalCount", 0);
        setIntField(term78175, term78175.getClass(), "playerRating", 0);
        setIntField(term78175, term78175.getClass(), "highestRating", 0);
        setIntField(term78175, term78175.getClass(), "battlePoint", 0);
        setIntField(term78175, term78175.getClass(), "bestBattlePoint", 0);
        setIntField(term78175, term78175.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78175, term78175.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78175, term78175.getClass(), "nameplateId", 0);
        setIntField(term78175, term78175.getClass(), "trophyId", 0);
        setIntField(term78175, term78175.getClass(), "cardId", 0);
        setIntField(term78175, term78175.getClass(), "characterId", 0);
        setIntField(term78175, term78175.getClass(), "characterVoiceNo", 0);
        setIntField(term78175, term78175.getClass(), "tabSetting", 0);
        setIntField(term78175, term78175.getClass(), "tabSortSetting", 0);
        setIntField(term78175, term78175.getClass(), "cardCategorySetting", 0);
        setIntField(term78175, term78175.getClass(), "cardSortSetting", 0);
        setIntField(term78175, term78175.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78175, term78175.getClass(), "playedTutorialBit", 0);
        setIntField(term78175, term78175.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78175, term78175.getClass(), "sumTechHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78175, term78175.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78175, term78175.getClass(), "eventWatchedDate", null);
        setField(term78175, term78175.getClass(), "cmEventWatchedDate", null);
        setField(term78175, term78175.getClass(), "firstGameId", null);
        setField(term78175, term78175.getClass(), "firstRomVersion", null);
        setField(term78175, term78175.getClass(), "firstDataVersion", null);
        setField(term78175, term78175.getClass(), "firstPlayDate", null);
        setField(term78175, term78175.getClass(), "lastGameId", null);
        setField(term78175, term78175.getClass(), "lastRomVersion", null);
        setField(term78175, term78175.getClass(), "lastDataVersion", null);
        setField(term78175, term78175.getClass(), "compatibleCmVersion", null);
        setField(term78175, term78175.getClass(), "lastPlayDate", null);
        setIntField(term78175, term78175.getClass(), "lastPlaceId", 0);
        setField(term78175, term78175.getClass(), "lastPlaceName", null);
        setIntField(term78175, term78175.getClass(), "lastRegionId", 0);
        setField(term78175, term78175.getClass(), "lastRegionName", null);
        setIntField(term78175, term78175.getClass(), "lastAllNetId", 0);
        setField(term78175, term78175.getClass(), "lastClientId", null);
        setIntField(term78175, term78175.getClass(), "lastUsedDeckId", 0);
        setIntField(term78175, term78175.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78175, term78175.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardCategorySetting", argTypes, term78175, args);
    }

};


