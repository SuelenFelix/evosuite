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
import java.lang.Object;
import java.lang.Long;

public class UserData_getSumTechBasicHighScore_71716048531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35031;

    public UserData_getSumTechBasicHighScore_71716048531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35035 = new Long(5510783420697225605L);
        term35031 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term35033 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35054 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35059 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35060 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35064 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35031, term35031.getClass(), "id", 4987297090886718616L);
        setLongField(term35033, term35033.getClass(), "id", -2373676985592181240L);
        setField(term35033, term35033.getClass(), "extId", term35035);
        setField(term35033, term35033.getClass(), "luid", "bqIuFFFwnP");
        setIntField(term35050, term35050.getClass(), "year", 2027);
        setShortField(term35050, term35050.getClass(), "month", (short) 5);
        setShortField(term35050, term35050.getClass(), "day", (short) 2);
        setField(term35049, term35049.getClass(), "date", term35050);
        setByteField(term35054, term35054.getClass(), "hour", (byte) 6);
        setByteField(term35054, term35054.getClass(), "minute", (byte) 10);
        setByteField(term35054, term35054.getClass(), "second", (byte) 19);
        setIntField(term35054, term35054.getClass(), "nano", 422884120);
        setField(term35049, term35049.getClass(), "time", term35054);
        setField(term35033, term35033.getClass(), "registerTime", term35049);
        setIntField(term35060, term35060.getClass(), "year", 2029);
        setShortField(term35060, term35060.getClass(), "month", (short) 10);
        setShortField(term35060, term35060.getClass(), "day", (short) 19);
        setField(term35059, term35059.getClass(), "date", term35060);
        setByteField(term35064, term35064.getClass(), "hour", (byte) 15);
        setByteField(term35064, term35064.getClass(), "minute", (byte) 8);
        setByteField(term35064, term35064.getClass(), "second", (byte) 15);
        setIntField(term35064, term35064.getClass(), "nano", 25396748);
        setField(term35059, term35059.getClass(), "time", term35064);
        setField(term35033, term35033.getClass(), "accessTime", term35059);
        setField(term35031, term35031.getClass(), "card", term35033);
        setField(term35031, term35031.getClass(), "userName", "hDxvvVgGlk");
        setIntField(term35031, term35031.getClass(), "level", -1987966813);
        setIntField(term35031, term35031.getClass(), "reincarnationNum", 1778126559);
        setLongField(term35031, term35031.getClass(), "exp", -259683062954031772L);
        setLongField(term35031, term35031.getClass(), "point", 5446921500259357484L);
        setLongField(term35031, term35031.getClass(), "totalPoint", -2887572667974552998L);
        setIntField(term35031, term35031.getClass(), "playCount", -1557828355);
        setIntField(term35031, term35031.getClass(), "jewelCount", 546963992);
        setIntField(term35031, term35031.getClass(), "totalJewelCount", 1377120507);
        setIntField(term35031, term35031.getClass(), "medalCount", -1581022727);
        setIntField(term35031, term35031.getClass(), "playerRating", -371740139);
        setIntField(term35031, term35031.getClass(), "highestRating", -508560324);
        setIntField(term35031, term35031.getClass(), "battlePoint", -1700781575);
        setIntField(term35031, term35031.getClass(), "bestBattlePoint", -2042022388);
        setIntField(term35031, term35031.getClass(), "overDamageBattlePoint", 390228535);
        setBooleanField(term35031, term35031.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term35031, term35031.getClass(), "nameplateId", -667505209);
        setIntField(term35031, term35031.getClass(), "trophyId", 1997285343);
        setIntField(term35031, term35031.getClass(), "cardId", -1814671855);
        setIntField(term35031, term35031.getClass(), "characterId", -614200166);
        setIntField(term35031, term35031.getClass(), "characterVoiceNo", 1243129119);
        setIntField(term35031, term35031.getClass(), "tabSetting", 346014220);
        setIntField(term35031, term35031.getClass(), "tabSortSetting", 1379438950);
        setIntField(term35031, term35031.getClass(), "cardCategorySetting", 1932258686);
        setIntField(term35031, term35031.getClass(), "cardSortSetting", -261366507);
        setIntField(term35031, term35031.getClass(), "rivalScoreCategorySetting", 1015444772);
        setIntField(term35031, term35031.getClass(), "playedTutorialBit", -815684619);
        setIntField(term35031, term35031.getClass(), "firstTutorialCancelNum", -471499395);
        setLongField(term35031, term35031.getClass(), "sumTechHighScore", 38900113635378049L);
        setLongField(term35031, term35031.getClass(), "sumTechBasicHighScore", 2167389818358075653L);
        setLongField(term35031, term35031.getClass(), "sumTechAdvancedHighScore", 2371696206810185880L);
        setLongField(term35031, term35031.getClass(), "sumTechExpertHighScore", -3926033211239834024L);
        setLongField(term35031, term35031.getClass(), "sumTechMasterHighScore", 7585284844822710343L);
        setLongField(term35031, term35031.getClass(), "sumTechLunaticHighScore", 6803750423071360242L);
        setLongField(term35031, term35031.getClass(), "sumBattleHighScore", -4234850307320476025L);
        setLongField(term35031, term35031.getClass(), "sumBattleBasicHighScore", 4525524239494718372L);
        setLongField(term35031, term35031.getClass(), "sumBattleAdvancedHighScore", 5204341701727130016L);
        setLongField(term35031, term35031.getClass(), "sumBattleExpertHighScore", -5167573302796126161L);
        setLongField(term35031, term35031.getClass(), "sumBattleMasterHighScore", 199834233798511747L);
        setLongField(term35031, term35031.getClass(), "sumBattleLunaticHighScore", 3151699339436192337L);
        setField(term35031, term35031.getClass(), "eventWatchedDate", "XdjSvjaTqk");
        setField(term35031, term35031.getClass(), "cmEventWatchedDate", "ukrlYVcvsg");
        setField(term35031, term35031.getClass(), "firstGameId", "cpjqTCNflQ");
        setField(term35031, term35031.getClass(), "firstRomVersion", "wiYGATEfmw");
        setField(term35031, term35031.getClass(), "firstDataVersion", "FiALSqneIg");
        setField(term35031, term35031.getClass(), "firstPlayDate", "lGVACSQceQ");
        setField(term35031, term35031.getClass(), "lastGameId", "jpgWRbSvyQ");
        setField(term35031, term35031.getClass(), "lastRomVersion", "tFMlYmPEBX");
        setField(term35031, term35031.getClass(), "lastDataVersion", "ljkZxGNgjZ");
        setField(term35031, term35031.getClass(), "compatibleCmVersion", "hrFtgdcZKS");
        setField(term35031, term35031.getClass(), "lastPlayDate", "ZhZJvpPaTU");
        setIntField(term35031, term35031.getClass(), "lastPlaceId", -663671886);
        setField(term35031, term35031.getClass(), "lastPlaceName", "NZwUsJxDLI");
        setIntField(term35031, term35031.getClass(), "lastRegionId", -1295577968);
        setField(term35031, term35031.getClass(), "lastRegionName", "wlusYBOfXW");
        setIntField(term35031, term35031.getClass(), "lastAllNetId", 1006574741);
        setField(term35031, term35031.getClass(), "lastClientId", "HEWWLhfKIa");
        setIntField(term35031, term35031.getClass(), "lastUsedDeckId", -1471698394);
        setIntField(term35031, term35031.getClass(), "lastPlayMusicLevel", 1146444085);
        setIntField(term35031, term35031.getClass(), "lastEmoneyBrand", 316145449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSumTechBasicHighScore", argTypes, term35031, args);
    }

};


