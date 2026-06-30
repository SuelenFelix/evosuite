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

public class UserData_getBattlePoint_1583601840144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77658;

    public UserData_getBattlePoint_1583601840144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77658 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term77658, term77658.getClass(), "id", 0L);
        setField(term77658, term77658.getClass(), "card", null);
        setField(term77658, term77658.getClass(), "userName", null);
        setIntField(term77658, term77658.getClass(), "level", 0);
        setIntField(term77658, term77658.getClass(), "reincarnationNum", 0);
        setLongField(term77658, term77658.getClass(), "exp", 0L);
        setLongField(term77658, term77658.getClass(), "point", 0L);
        setLongField(term77658, term77658.getClass(), "totalPoint", 0L);
        setIntField(term77658, term77658.getClass(), "playCount", 0);
        setIntField(term77658, term77658.getClass(), "jewelCount", 0);
        setIntField(term77658, term77658.getClass(), "totalJewelCount", 0);
        setIntField(term77658, term77658.getClass(), "medalCount", 0);
        setIntField(term77658, term77658.getClass(), "playerRating", 0);
        setIntField(term77658, term77658.getClass(), "highestRating", 0);
        setIntField(term77658, term77658.getClass(), "battlePoint", 0);
        setIntField(term77658, term77658.getClass(), "bestBattlePoint", 0);
        setIntField(term77658, term77658.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term77658, term77658.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term77658, term77658.getClass(), "nameplateId", 0);
        setIntField(term77658, term77658.getClass(), "trophyId", 0);
        setIntField(term77658, term77658.getClass(), "cardId", 0);
        setIntField(term77658, term77658.getClass(), "characterId", 0);
        setIntField(term77658, term77658.getClass(), "characterVoiceNo", 0);
        setIntField(term77658, term77658.getClass(), "tabSetting", 0);
        setIntField(term77658, term77658.getClass(), "tabSortSetting", 0);
        setIntField(term77658, term77658.getClass(), "cardCategorySetting", 0);
        setIntField(term77658, term77658.getClass(), "cardSortSetting", 0);
        setIntField(term77658, term77658.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term77658, term77658.getClass(), "playedTutorialBit", 0);
        setIntField(term77658, term77658.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term77658, term77658.getClass(), "sumTechHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term77658, term77658.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term77658, term77658.getClass(), "eventWatchedDate", null);
        setField(term77658, term77658.getClass(), "cmEventWatchedDate", null);
        setField(term77658, term77658.getClass(), "firstGameId", null);
        setField(term77658, term77658.getClass(), "firstRomVersion", null);
        setField(term77658, term77658.getClass(), "firstDataVersion", null);
        setField(term77658, term77658.getClass(), "firstPlayDate", null);
        setField(term77658, term77658.getClass(), "lastGameId", null);
        setField(term77658, term77658.getClass(), "lastRomVersion", null);
        setField(term77658, term77658.getClass(), "lastDataVersion", null);
        setField(term77658, term77658.getClass(), "compatibleCmVersion", null);
        setField(term77658, term77658.getClass(), "lastPlayDate", null);
        setIntField(term77658, term77658.getClass(), "lastPlaceId", 0);
        setField(term77658, term77658.getClass(), "lastPlaceName", null);
        setIntField(term77658, term77658.getClass(), "lastRegionId", 0);
        setField(term77658, term77658.getClass(), "lastRegionName", null);
        setIntField(term77658, term77658.getClass(), "lastAllNetId", 0);
        setField(term77658, term77658.getClass(), "lastClientId", null);
        setIntField(term77658, term77658.getClass(), "lastUsedDeckId", 0);
        setIntField(term77658, term77658.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term77658, term77658.getClass(), "lastEmoneyBrand", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattlePoint", argTypes, term77658, args);
    }

};


