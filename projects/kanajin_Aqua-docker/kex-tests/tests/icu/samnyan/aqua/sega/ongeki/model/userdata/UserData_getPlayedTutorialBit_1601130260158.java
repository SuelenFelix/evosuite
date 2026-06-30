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

public class UserData_getPlayedTutorialBit_1601130260158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78316;

    public UserData_getPlayedTutorialBit_1601130260158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78316 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78316, term78316.getClass(), "id", 0L);
        setField(term78316, term78316.getClass(), "card", null);
        setField(term78316, term78316.getClass(), "userName", null);
        setIntField(term78316, term78316.getClass(), "level", 0);
        setIntField(term78316, term78316.getClass(), "reincarnationNum", 0);
        setLongField(term78316, term78316.getClass(), "exp", 0L);
        setLongField(term78316, term78316.getClass(), "point", 0L);
        setLongField(term78316, term78316.getClass(), "totalPoint", 0L);
        setIntField(term78316, term78316.getClass(), "playCount", 0);
        setIntField(term78316, term78316.getClass(), "jewelCount", 0);
        setIntField(term78316, term78316.getClass(), "totalJewelCount", 0);
        setIntField(term78316, term78316.getClass(), "medalCount", 0);
        setIntField(term78316, term78316.getClass(), "playerRating", 0);
        setIntField(term78316, term78316.getClass(), "highestRating", 0);
        setIntField(term78316, term78316.getClass(), "battlePoint", 0);
        setIntField(term78316, term78316.getClass(), "bestBattlePoint", 0);
        setIntField(term78316, term78316.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78316, term78316.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78316, term78316.getClass(), "nameplateId", 0);
        setIntField(term78316, term78316.getClass(), "trophyId", 0);
        setIntField(term78316, term78316.getClass(), "cardId", 0);
        setIntField(term78316, term78316.getClass(), "characterId", 0);
        setIntField(term78316, term78316.getClass(), "characterVoiceNo", 0);
        setIntField(term78316, term78316.getClass(), "tabSetting", 0);
        setIntField(term78316, term78316.getClass(), "tabSortSetting", 0);
        setIntField(term78316, term78316.getClass(), "cardCategorySetting", 0);
        setIntField(term78316, term78316.getClass(), "cardSortSetting", 0);
        setIntField(term78316, term78316.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78316, term78316.getClass(), "playedTutorialBit", 0);
        setIntField(term78316, term78316.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78316, term78316.getClass(), "sumTechHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78316, term78316.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78316, term78316.getClass(), "eventWatchedDate", null);
        setField(term78316, term78316.getClass(), "cmEventWatchedDate", null);
        setField(term78316, term78316.getClass(), "firstGameId", null);
        setField(term78316, term78316.getClass(), "firstRomVersion", null);
        setField(term78316, term78316.getClass(), "firstDataVersion", null);
        setField(term78316, term78316.getClass(), "firstPlayDate", null);
        setField(term78316, term78316.getClass(), "lastGameId", null);
        setField(term78316, term78316.getClass(), "lastRomVersion", null);
        setField(term78316, term78316.getClass(), "lastDataVersion", null);
        setField(term78316, term78316.getClass(), "compatibleCmVersion", null);
        setField(term78316, term78316.getClass(), "lastPlayDate", null);
        setIntField(term78316, term78316.getClass(), "lastPlaceId", 0);
        setField(term78316, term78316.getClass(), "lastPlaceName", null);
        setIntField(term78316, term78316.getClass(), "lastRegionId", 0);
        setField(term78316, term78316.getClass(), "lastRegionName", null);
        setIntField(term78316, term78316.getClass(), "lastAllNetId", 0);
        setField(term78316, term78316.getClass(), "lastClientId", null);
        setIntField(term78316, term78316.getClass(), "lastUsedDeckId", 0);
        setIntField(term78316, term78316.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78316, term78316.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedTutorialBit", argTypes, term78316, args);
    }

};


