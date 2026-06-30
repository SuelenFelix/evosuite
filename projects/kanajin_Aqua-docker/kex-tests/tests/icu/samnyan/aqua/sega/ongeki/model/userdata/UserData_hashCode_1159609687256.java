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

public class UserData_hashCode_1159609687256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83014;

    public UserData_hashCode_1159609687256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83014 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term83014, term83014.getClass(), "id", 0L);
        setField(term83014, term83014.getClass(), "card", null);
        setField(term83014, term83014.getClass(), "userName", null);
        setIntField(term83014, term83014.getClass(), "level", 0);
        setIntField(term83014, term83014.getClass(), "reincarnationNum", 0);
        setLongField(term83014, term83014.getClass(), "exp", 0L);
        setLongField(term83014, term83014.getClass(), "point", 0L);
        setLongField(term83014, term83014.getClass(), "totalPoint", 0L);
        setIntField(term83014, term83014.getClass(), "playCount", 0);
        setIntField(term83014, term83014.getClass(), "jewelCount", 0);
        setIntField(term83014, term83014.getClass(), "totalJewelCount", 0);
        setIntField(term83014, term83014.getClass(), "medalCount", 0);
        setIntField(term83014, term83014.getClass(), "playerRating", 0);
        setIntField(term83014, term83014.getClass(), "highestRating", 0);
        setIntField(term83014, term83014.getClass(), "battlePoint", 0);
        setIntField(term83014, term83014.getClass(), "bestBattlePoint", 0);
        setIntField(term83014, term83014.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term83014, term83014.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term83014, term83014.getClass(), "nameplateId", 0);
        setIntField(term83014, term83014.getClass(), "trophyId", 0);
        setIntField(term83014, term83014.getClass(), "cardId", 0);
        setIntField(term83014, term83014.getClass(), "characterId", 0);
        setIntField(term83014, term83014.getClass(), "characterVoiceNo", 0);
        setIntField(term83014, term83014.getClass(), "tabSetting", 0);
        setIntField(term83014, term83014.getClass(), "tabSortSetting", 0);
        setIntField(term83014, term83014.getClass(), "cardCategorySetting", 0);
        setIntField(term83014, term83014.getClass(), "cardSortSetting", 0);
        setIntField(term83014, term83014.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term83014, term83014.getClass(), "playedTutorialBit", 0);
        setIntField(term83014, term83014.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term83014, term83014.getClass(), "sumTechHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term83014, term83014.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term83014, term83014.getClass(), "eventWatchedDate", null);
        setField(term83014, term83014.getClass(), "cmEventWatchedDate", null);
        setField(term83014, term83014.getClass(), "firstGameId", null);
        setField(term83014, term83014.getClass(), "firstRomVersion", null);
        setField(term83014, term83014.getClass(), "firstDataVersion", null);
        setField(term83014, term83014.getClass(), "firstPlayDate", null);
        setField(term83014, term83014.getClass(), "lastGameId", null);
        setField(term83014, term83014.getClass(), "lastRomVersion", null);
        setField(term83014, term83014.getClass(), "lastDataVersion", null);
        setField(term83014, term83014.getClass(), "compatibleCmVersion", null);
        setField(term83014, term83014.getClass(), "lastPlayDate", null);
        setIntField(term83014, term83014.getClass(), "lastPlaceId", 0);
        setField(term83014, term83014.getClass(), "lastPlaceName", null);
        setIntField(term83014, term83014.getClass(), "lastRegionId", 0);
        setField(term83014, term83014.getClass(), "lastRegionName", null);
        setIntField(term83014, term83014.getClass(), "lastAllNetId", 0);
        setField(term83014, term83014.getClass(), "lastClientId", null);
        setIntField(term83014, term83014.getClass(), "lastUsedDeckId", 0);
        setIntField(term83014, term83014.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term83014, term83014.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term83014, args);
    }

};


