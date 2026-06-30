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
import java.lang.Integer;

public class UserData_setBestBattlePoint_662625226207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80645;
     Object term80692;

    public UserData_setBestBattlePoint_662625226207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80645 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        setLongField(term80645, term80645.getClass(), "id", 0L);
        setField(term80645, term80645.getClass(), "card", null);
        setField(term80645, term80645.getClass(), "userName", null);
        setIntField(term80645, term80645.getClass(), "level", 0);
        setIntField(term80645, term80645.getClass(), "reincarnationNum", 0);
        setLongField(term80645, term80645.getClass(), "exp", 0L);
        setLongField(term80645, term80645.getClass(), "point", 0L);
        setLongField(term80645, term80645.getClass(), "totalPoint", 0L);
        setIntField(term80645, term80645.getClass(), "playCount", 0);
        setIntField(term80645, term80645.getClass(), "jewelCount", 0);
        setIntField(term80645, term80645.getClass(), "totalJewelCount", 0);
        setIntField(term80645, term80645.getClass(), "medalCount", 0);
        setIntField(term80645, term80645.getClass(), "playerRating", 0);
        setIntField(term80645, term80645.getClass(), "highestRating", 0);
        setIntField(term80645, term80645.getClass(), "battlePoint", 0);
        setIntField(term80645, term80645.getClass(), "bestBattlePoint", 0);
        setIntField(term80645, term80645.getClass(), "overDamageBattlePoint", 0);
        setBooleanField(term80645, term80645.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term80645, term80645.getClass(), "nameplateId", 0);
        setIntField(term80645, term80645.getClass(), "trophyId", 0);
        setIntField(term80645, term80645.getClass(), "cardId", 0);
        setIntField(term80645, term80645.getClass(), "characterId", 0);
        setIntField(term80645, term80645.getClass(), "characterVoiceNo", 0);
        setIntField(term80645, term80645.getClass(), "tabSetting", 0);
        setIntField(term80645, term80645.getClass(), "tabSortSetting", 0);
        setIntField(term80645, term80645.getClass(), "cardCategorySetting", 0);
        setIntField(term80645, term80645.getClass(), "cardSortSetting", 0);
        setIntField(term80645, term80645.getClass(), "rivalScoreCategorySetting", 0);
        setIntField(term80645, term80645.getClass(), "playedTutorialBit", 0);
        setIntField(term80645, term80645.getClass(), "firstTutorialCancelNum", 0);
        setLongField(term80645, term80645.getClass(), "sumTechHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumTechBasicHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumTechAdvancedHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumTechExpertHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumTechMasterHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumTechLunaticHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleBasicHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleAdvancedHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleExpertHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleMasterHighScore", 0L);
        setLongField(term80645, term80645.getClass(), "sumBattleLunaticHighScore", 0L);
        setField(term80645, term80645.getClass(), "eventWatchedDate", null);
        setField(term80645, term80645.getClass(), "cmEventWatchedDate", null);
        setField(term80645, term80645.getClass(), "firstGameId", null);
        setField(term80645, term80645.getClass(), "firstRomVersion", null);
        setField(term80645, term80645.getClass(), "firstDataVersion", null);
        setField(term80645, term80645.getClass(), "firstPlayDate", null);
        setField(term80645, term80645.getClass(), "lastGameId", null);
        setField(term80645, term80645.getClass(), "lastRomVersion", null);
        setField(term80645, term80645.getClass(), "lastDataVersion", null);
        setField(term80645, term80645.getClass(), "compatibleCmVersion", null);
        setField(term80645, term80645.getClass(), "lastPlayDate", null);
        setIntField(term80645, term80645.getClass(), "lastPlaceId", 0);
        setField(term80645, term80645.getClass(), "lastPlaceName", null);
        setIntField(term80645, term80645.getClass(), "lastRegionId", 0);
        setField(term80645, term80645.getClass(), "lastRegionName", null);
        setIntField(term80645, term80645.getClass(), "lastAllNetId", 0);
        setField(term80645, term80645.getClass(), "lastClientId", null);
        setIntField(term80645, term80645.getClass(), "lastUsedDeckId", 0);
        setIntField(term80645, term80645.getClass(), "lastPlayMusicLevel", 0);
        setIntField(term80645, term80645.getClass(), "lastEmoneyBrand", 0);
        term80692 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term80692;
        callMethod(klass, "setBestBattlePoint", argTypes, term80645, args);
    }

};


