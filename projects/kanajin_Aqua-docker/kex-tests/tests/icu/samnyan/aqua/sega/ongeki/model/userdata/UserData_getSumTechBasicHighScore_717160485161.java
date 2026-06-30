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

public class UserData_getSumTechBasicHighScore_717160485161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78457;

    public UserData_getSumTechBasicHighScore_717160485161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78457 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term78457, term78457.getClass(), "id", 0L);
        setField(term78457, term78457.getClass(), "card", null);
        setField(term78457, term78457.getClass(), "userName", null);
        setIntField(term78457, term78457.getClass(), "level", 0);
        setIntField(term78457, term78457.getClass(), "reincarnationNum", 0);
        setLongField(term78457, term78457.getClass(), "exp", 0L);
        setLongField(term78457, term78457.getClass(), "point", 0L);
        setLongField(term78457, term78457.getClass(), "totalPoint", 0L);
        setIntField(term78457, term78457.getClass(), "playCount", 0);
        setIntField(term78457, term78457.getClass(), "jewelCount", 0);
        setIntField(term78457, term78457.getClass(), "totalJewelCount", 0);
        setIntField(term78457, term78457.getClass(), "medalCount", 0);
        setIntField(term78457, term78457.getClass(), "playerRating", 0);
        setIntField(term78457, term78457.getClass(), "highestRating", 0);
        setIntField(term78457, term78457.getClass(), "battlePoint", 0);
        setIntField(term78457, term78457.getClass(), "bestBattlePoint", 0);
        setIntField(term78457, term78457.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term78457, term78457.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term78457, term78457.getClass(), "nameplateId", 0);
        setIntField(term78457, term78457.getClass(), "trophyId", 0);
        setIntField(term78457, term78457.getClass(), "cardId", 0);
        setIntField(term78457, term78457.getClass(), "characterId", 0);
        setIntField(term78457, term78457.getClass(), "characterVoiceNo", 0);
        setIntField(term78457, term78457.getClass(), "tabSetting", 0);
        setIntField(term78457, term78457.getClass(), "tabSortSetting", 0);
        setIntField(term78457, term78457.getClass(), "cardCategorySetting", 0);
        setIntField(term78457, term78457.getClass(), "cardSortSetting", 0);
        setIntField(term78457, term78457.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term78457, term78457.getClass(), "playedTutorialBit", 0);
        setIntField(term78457, term78457.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term78457, term78457.getClass(), "sumTechHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term78457, term78457.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term78457, term78457.getClass(), "eventWatchedDate", null);
        setField(term78457, term78457.getClass(), "cmEventWatchedDate", null);
        setField(term78457, term78457.getClass(), "firstGameId", null);
        setField(term78457, term78457.getClass(), "firstRomVersion", null);
        setField(term78457, term78457.getClass(), "firstDataVersion", null);
        setField(term78457, term78457.getClass(), "firstPlayDate", null);
        setField(term78457, term78457.getClass(), "lastGameId", null);
        setField(term78457, term78457.getClass(), "lastRomVersion", null);
        setField(term78457, term78457.getClass(), "lastDataVersion", null);
        setField(term78457, term78457.getClass(), "compatibleCmVersion", null);
        setField(term78457, term78457.getClass(), "lastPlayDate", null);
        setIntField(term78457, term78457.getClass(), "lastPlaceId", 0);
        setField(term78457, term78457.getClass(), "lastPlaceName", null);
        setIntField(term78457, term78457.getClass(), "lastRegionId", 0);
        setField(term78457, term78457.getClass(), "lastRegionName", null);
        setIntField(term78457, term78457.getClass(), "lastAllNetId", 0);
        setField(term78457, term78457.getClass(), "lastClientId", null);
        setIntField(term78457, term78457.getClass(), "lastUsedDeckId", 0);
        setIntField(term78457, term78457.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term78457, term78457.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechBasicHighScore", argTypes, term78457, args);
    }

};


