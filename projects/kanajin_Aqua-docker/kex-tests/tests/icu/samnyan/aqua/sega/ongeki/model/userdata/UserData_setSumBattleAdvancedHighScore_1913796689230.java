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

public class UserData_setSumBattleAdvancedHighScore_1913796689230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81772;
     Object term81819;

    public UserData_setSumBattleAdvancedHighScore_1913796689230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81772 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term81772, term81772.getClass(), "id", 0L);
        setField(term81772, term81772.getClass(), "card", null);
        setField(term81772, term81772.getClass(), "userName", null);
        setIntField(term81772, term81772.getClass(), "level", 0);
        setIntField(term81772, term81772.getClass(), "reincarnationNum", 0);
        setLongField(term81772, term81772.getClass(), "exp", 0L);
        setLongField(term81772, term81772.getClass(), "point", 0L);
        setLongField(term81772, term81772.getClass(), "totalPoint", 0L);
        setIntField(term81772, term81772.getClass(), "playCount", 0);
        setIntField(term81772, term81772.getClass(), "jewelCount", 0);
        setIntField(term81772, term81772.getClass(), "totalJewelCount", 0);
        setIntField(term81772, term81772.getClass(), "medalCount", 0);
        setIntField(term81772, term81772.getClass(), "playerRating", 0);
        setIntField(term81772, term81772.getClass(), "highestRating", 0);
        setIntField(term81772, term81772.getClass(), "battlePoint", 0);
        setIntField(term81772, term81772.getClass(), "bestBattlePoint", 0);
        setIntField(term81772, term81772.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term81772, term81772.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term81772, term81772.getClass(), "nameplateId", 0);
        setIntField(term81772, term81772.getClass(), "trophyId", 0);
        setIntField(term81772, term81772.getClass(), "cardId", 0);
        setIntField(term81772, term81772.getClass(), "characterId", 0);
        setIntField(term81772, term81772.getClass(), "characterVoiceNo", 0);
        setIntField(term81772, term81772.getClass(), "tabSetting", 0);
        setIntField(term81772, term81772.getClass(), "tabSortSetting", 0);
        setIntField(term81772, term81772.getClass(), "cardCategorySetting", 0);
        setIntField(term81772, term81772.getClass(), "cardSortSetting", 0);
        setIntField(term81772, term81772.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term81772, term81772.getClass(), "playedTutorialBit", 0);
        setIntField(term81772, term81772.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term81772, term81772.getClass(), "sumTechHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term81772, term81772.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term81772, term81772.getClass(), "eventWatchedDate", null);
        setField(term81772, term81772.getClass(), "cmEventWatchedDate", null);
        setField(term81772, term81772.getClass(), "firstGameId", null);
        setField(term81772, term81772.getClass(), "firstRomVersion", null);
        setField(term81772, term81772.getClass(), "firstDataVersion", null);
        setField(term81772, term81772.getClass(), "firstPlayDate", null);
        setField(term81772, term81772.getClass(), "lastGameId", null);
        setField(term81772, term81772.getClass(), "lastRomVersion", null);
        setField(term81772, term81772.getClass(), "lastDataVersion", null);
        setField(term81772, term81772.getClass(), "compatibleCmVersion", null);
        setField(term81772, term81772.getClass(), "lastPlayDate", null);
        setIntField(term81772, term81772.getClass(), "lastPlaceId", 0);
        setField(term81772, term81772.getClass(), "lastPlaceName", null);
        setIntField(term81772, term81772.getClass(), "lastRegionId", 0);
        setField(term81772, term81772.getClass(), "lastRegionName", null);
        setIntField(term81772, term81772.getClass(), "lastAllNetId", 0);
        setField(term81772, term81772.getClass(), "lastClientId", null);
        setIntField(term81772, term81772.getClass(), "lastUsedDeckId", 0);
        setIntField(term81772, term81772.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term81772, term81772.getClass(), "lastEmoneyBrand", 0);
        term81819 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term81819;
        callMethod(klass, "setSumBattleAdvancedHighScore", argTypes, term81772, args);
    }

};


