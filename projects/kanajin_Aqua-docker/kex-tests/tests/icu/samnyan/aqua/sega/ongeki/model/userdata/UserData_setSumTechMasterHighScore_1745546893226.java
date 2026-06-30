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
import java.lang.Long;

public class UserData_setSumTechMasterHighScore_1745546893226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81576;
     Object term81623;

    public UserData_setSumTechMasterHighScore_1745546893226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81576 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81576, term81576.getClass(), "id", 0L);
        setField(term81576, term81576.getClass(), "card", null);
        setField(term81576, term81576.getClass(), "userName", null);
        setIntField(term81576, term81576.getClass(), "level", 0);
        setIntField(term81576, term81576.getClass(), "reincarnationNum", 0);
        setLongField(term81576, term81576.getClass(), "exp", 0L);
        setLongField(term81576, term81576.getClass(), "point", 0L);
        setLongField(term81576, term81576.getClass(), "totalPoint", 0L);
        setIntField(term81576, term81576.getClass(), "playCount", 0);
        setIntField(term81576, term81576.getClass(), "jewelCount", 0);
        setIntField(term81576, term81576.getClass(), "totalJewelCount", 0);
        setIntField(term81576, term81576.getClass(), "medalCount", 0);
        setIntField(term81576, term81576.getClass(), "playerRating", 0);
        setIntField(term81576, term81576.getClass(), "highestRating", 0);
        setIntField(term81576, term81576.getClass(), "battlePoint", 0);
        setIntField(term81576, term81576.getClass(), "bestBattlePoint", 0);
        setIntField(term81576, term81576.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81576, term81576.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81576, term81576.getClass(), "nameplateId", 0);
        setIntField(term81576, term81576.getClass(), "trophyId", 0);
        setIntField(term81576, term81576.getClass(), "cardId", 0);
        setIntField(term81576, term81576.getClass(), "characterId", 0);
        setIntField(term81576, term81576.getClass(), "characterVoiceNo", 0);
        setIntField(term81576, term81576.getClass(), "tabSetting", 0);
        setIntField(term81576, term81576.getClass(), "tabSortSetting", 0);
        setIntField(term81576, term81576.getClass(), "cardCategorySetting", 0);
        setIntField(term81576, term81576.getClass(), "cardSortSetting", 0);
        setIntField(term81576, term81576.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81576, term81576.getClass(), "playedTutorialBit", 0);
        setIntField(term81576, term81576.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81576, term81576.getClass(), "sumTechHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81576, term81576.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81576, term81576.getClass(), "eventWatchedDate", null);
        setField(term81576, term81576.getClass(), "cmEventWatchedDate", null);
        setField(term81576, term81576.getClass(), "firstGameId", null);
        setField(term81576, term81576.getClass(), "firstRomVersion", null);
        setField(term81576, term81576.getClass(), "firstDataVersion", null);
        setField(term81576, term81576.getClass(), "firstPlayDate", null);
        setField(term81576, term81576.getClass(), "lastGameId", null);
        setField(term81576, term81576.getClass(), "lastRomVersion", null);
        setField(term81576, term81576.getClass(), "lastDataVersion", null);
        setField(term81576, term81576.getClass(), "compatibleCmVersion", null);
        setField(term81576, term81576.getClass(), "lastPlayDate", null);
        setIntField(term81576, term81576.getClass(), "lastPlaceId", 0);
        setField(term81576, term81576.getClass(), "lastPlaceName", null);
        setIntField(term81576, term81576.getClass(), "lastRegionId", 0);
        setField(term81576, term81576.getClass(), "lastRegionName", null);
        setIntField(term81576, term81576.getClass(), "lastAllNetId", 0);
        setField(term81576, term81576.getClass(), "lastClientId", null);
        setIntField(term81576, term81576.getClass(), "lastUsedDeckId", 0);
        setIntField(term81576, term81576.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81576, term81576.getClass(), "lastEmoneyBrand", 0);
        term81623 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81623;
        callMethod(klass, "setSumTechMasterHighScore", argTypes, term81576, args);
    }

};


