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

public class UserData_getOverDamageBattlePoint_1616205357146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77752;

    public UserData_getOverDamageBattlePoint_1616205357146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77752 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77752, term77752.getClass(), "id", 0L);
        setField(term77752, term77752.getClass(), "card", null);
        setField(term77752, term77752.getClass(), "userName", null);
        setIntField(term77752, term77752.getClass(), "level", 0);
        setIntField(term77752, term77752.getClass(), "reincarnationNum", 0);
        setLongField(term77752, term77752.getClass(), "exp", 0L);
        setLongField(term77752, term77752.getClass(), "point", 0L);
        setLongField(term77752, term77752.getClass(), "totalPoint", 0L);
        setIntField(term77752, term77752.getClass(), "playCount", 0);
        setIntField(term77752, term77752.getClass(), "jewelCount", 0);
        setIntField(term77752, term77752.getClass(), "totalJewelCount", 0);
        setIntField(term77752, term77752.getClass(), "medalCount", 0);
        setIntField(term77752, term77752.getClass(), "playerRating", 0);
        setIntField(term77752, term77752.getClass(), "highestRating", 0);
        setIntField(term77752, term77752.getClass(), "battlePoint", 0);
        setIntField(term77752, term77752.getClass(), "bestBattlePoint", 0);
        setIntField(term77752, term77752.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77752, term77752.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77752, term77752.getClass(), "nameplateId", 0);
        setIntField(term77752, term77752.getClass(), "trophyId", 0);
        setIntField(term77752, term77752.getClass(), "cardId", 0);
        setIntField(term77752, term77752.getClass(), "characterId", 0);
        setIntField(term77752, term77752.getClass(), "characterVoiceNo", 0);
        setIntField(term77752, term77752.getClass(), "tabSetting", 0);
        setIntField(term77752, term77752.getClass(), "tabSortSetting", 0);
        setIntField(term77752, term77752.getClass(), "cardCategorySetting", 0);
        setIntField(term77752, term77752.getClass(), "cardSortSetting", 0);
        setIntField(term77752, term77752.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77752, term77752.getClass(), "playedTutorialBit", 0);
        setIntField(term77752, term77752.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77752, term77752.getClass(), "sumTechHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77752, term77752.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77752, term77752.getClass(), "eventWatchedDate", null);
        setField(term77752, term77752.getClass(), "cmEventWatchedDate", null);
        setField(term77752, term77752.getClass(), "firstGameId", null);
        setField(term77752, term77752.getClass(), "firstRomVersion", null);
        setField(term77752, term77752.getClass(), "firstDataVersion", null);
        setField(term77752, term77752.getClass(), "firstPlayDate", null);
        setField(term77752, term77752.getClass(), "lastGameId", null);
        setField(term77752, term77752.getClass(), "lastRomVersion", null);
        setField(term77752, term77752.getClass(), "lastDataVersion", null);
        setField(term77752, term77752.getClass(), "compatibleCmVersion", null);
        setField(term77752, term77752.getClass(), "lastPlayDate", null);
        setIntField(term77752, term77752.getClass(), "lastPlaceId", 0);
        setField(term77752, term77752.getClass(), "lastPlaceName", null);
        setIntField(term77752, term77752.getClass(), "lastRegionId", 0);
        setField(term77752, term77752.getClass(), "lastRegionName", null);
        setIntField(term77752, term77752.getClass(), "lastAllNetId", 0);
        setField(term77752, term77752.getClass(), "lastClientId", null);
        setIntField(term77752, term77752.getClass(), "lastUsedDeckId", 0);
        setIntField(term77752, term77752.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77752, term77752.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverDamageBattlePoint", argTypes, term77752, args);
    }

};


