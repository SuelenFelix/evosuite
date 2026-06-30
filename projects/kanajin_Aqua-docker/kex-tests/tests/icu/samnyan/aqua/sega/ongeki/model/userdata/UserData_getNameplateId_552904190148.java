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

public class UserData_getNameplateId_552904190148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77846;

    public UserData_getNameplateId_552904190148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77846 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77846, term77846.getClass(), "id", 0L);
        setField(term77846, term77846.getClass(), "card", null);
        setField(term77846, term77846.getClass(), "userName", null);
        setIntField(term77846, term77846.getClass(), "level", 0);
        setIntField(term77846, term77846.getClass(), "reincarnationNum", 0);
        setLongField(term77846, term77846.getClass(), "exp", 0L);
        setLongField(term77846, term77846.getClass(), "point", 0L);
        setLongField(term77846, term77846.getClass(), "totalPoint", 0L);
        setIntField(term77846, term77846.getClass(), "playCount", 0);
        setIntField(term77846, term77846.getClass(), "jewelCount", 0);
        setIntField(term77846, term77846.getClass(), "totalJewelCount", 0);
        setIntField(term77846, term77846.getClass(), "medalCount", 0);
        setIntField(term77846, term77846.getClass(), "playerRating", 0);
        setIntField(term77846, term77846.getClass(), "highestRating", 0);
        setIntField(term77846, term77846.getClass(), "battlePoint", 0);
        setIntField(term77846, term77846.getClass(), "bestBattlePoint", 0);
        setIntField(term77846, term77846.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77846, term77846.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77846, term77846.getClass(), "nameplateId", 0);
        setIntField(term77846, term77846.getClass(), "trophyId", 0);
        setIntField(term77846, term77846.getClass(), "cardId", 0);
        setIntField(term77846, term77846.getClass(), "characterId", 0);
        setIntField(term77846, term77846.getClass(), "characterVoiceNo", 0);
        setIntField(term77846, term77846.getClass(), "tabSetting", 0);
        setIntField(term77846, term77846.getClass(), "tabSortSetting", 0);
        setIntField(term77846, term77846.getClass(), "cardCategorySetting", 0);
        setIntField(term77846, term77846.getClass(), "cardSortSetting", 0);
        setIntField(term77846, term77846.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77846, term77846.getClass(), "playedTutorialBit", 0);
        setIntField(term77846, term77846.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77846, term77846.getClass(), "sumTechHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77846, term77846.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77846, term77846.getClass(), "eventWatchedDate", null);
        setField(term77846, term77846.getClass(), "cmEventWatchedDate", null);
        setField(term77846, term77846.getClass(), "firstGameId", null);
        setField(term77846, term77846.getClass(), "firstRomVersion", null);
        setField(term77846, term77846.getClass(), "firstDataVersion", null);
        setField(term77846, term77846.getClass(), "firstPlayDate", null);
        setField(term77846, term77846.getClass(), "lastGameId", null);
        setField(term77846, term77846.getClass(), "lastRomVersion", null);
        setField(term77846, term77846.getClass(), "lastDataVersion", null);
        setField(term77846, term77846.getClass(), "compatibleCmVersion", null);
        setField(term77846, term77846.getClass(), "lastPlayDate", null);
        setIntField(term77846, term77846.getClass(), "lastPlaceId", 0);
        setField(term77846, term77846.getClass(), "lastPlaceName", null);
        setIntField(term77846, term77846.getClass(), "lastRegionId", 0);
        setField(term77846, term77846.getClass(), "lastRegionName", null);
        setIntField(term77846, term77846.getClass(), "lastAllNetId", 0);
        setField(term77846, term77846.getClass(), "lastClientId", null);
        setIntField(term77846, term77846.getClass(), "lastUsedDeckId", 0);
        setIntField(term77846, term77846.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77846, term77846.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term77846, args);
    }

};


