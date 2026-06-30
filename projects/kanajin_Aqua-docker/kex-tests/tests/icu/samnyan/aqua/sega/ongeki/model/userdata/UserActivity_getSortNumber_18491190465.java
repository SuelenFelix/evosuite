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

public class UserActivity_getSortNumber_18491190465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284882;

    public UserActivity_getSortNumber_18491190465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term284888 = new Long(-5367775625638780650L);
        term284882 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term284884 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term284886 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term284902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284907 = newInstance(Class.forName("java.time.LocalTime"));
        Object term284912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term284913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term284917 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term284882, term284882.getClass(), "id", -7258892632933810306L);
        setLongField(term284884, term284884.getClass(), "id", 1017132247942479613L);
        setLongField(term284886, term284886.getClass(), "id", 6050109578144556902L);
        setField(term284886, term284886.getClass(), "extId", term284888);
        setField(term284886, term284886.getClass(), "luid", "lDCuOPQJTx");
        setIntField(term284903, term284903.getClass(), "year", 2021);
        setShortField(term284903, term284903.getClass(), "month", (short) 10);
        setShortField(term284903, term284903.getClass(), "day", (short) 8);
        setField(term284902, term284902.getClass(), "date", term284903);
        setByteField(term284907, term284907.getClass(), "hour", (byte) 18);
        setByteField(term284907, term284907.getClass(), "minute", (byte) 29);
        setByteField(term284907, term284907.getClass(), "second", (byte) 57);
        setIntField(term284907, term284907.getClass(), "nano", 938627392);
        setField(term284902, term284902.getClass(), "time", term284907);
        setField(term284886, term284886.getClass(), "registerTime", term284902);
        setIntField(term284913, term284913.getClass(), "year", 2016);
        setShortField(term284913, term284913.getClass(), "month", (short) 12);
        setShortField(term284913, term284913.getClass(), "day", (short) 16);
        setField(term284912, term284912.getClass(), "date", term284913);
        setByteField(term284917, term284917.getClass(), "hour", (byte) 13);
        setByteField(term284917, term284917.getClass(), "minute", (byte) 41);
        setByteField(term284917, term284917.getClass(), "second", (byte) 6);
        setIntField(term284917, term284917.getClass(), "nano", 757748904);
        setField(term284912, term284912.getClass(), "time", term284917);
        setField(term284886, term284886.getClass(), "accessTime", term284912);
        setField(term284884, term284884.getClass(), "card", term284886);
        setField(term284884, term284884.getClass(), "userName", "WrdCxtewLX");
        setIntField(term284884, term284884.getClass(), "level", 1098314410);
        setIntField(term284884, term284884.getClass(), "reincarnationNum", 513236489);
        setLongField(term284884, term284884.getClass(), "exp", 8832680445663806230L);
        setLongField(term284884, term284884.getClass(), "point", 2415803220406938361L);
        setLongField(term284884, term284884.getClass(), "totalPoint", 5806648228179127823L);
        setIntField(term284884, term284884.getClass(), "playCount", -379651599);
        setIntField(term284884, term284884.getClass(), "jewelCount", 699451013);
        setIntField(term284884, term284884.getClass(), "totalJewelCount", -618558540);
        setIntField(term284884, term284884.getClass(), "medalCount", -885830948);
        setIntField(term284884, term284884.getClass(), "playerRating", -1255770211);
        setIntField(term284884, term284884.getClass(), "highestRating", -1011335912);
        setIntField(term284884, term284884.getClass(), "battlePoint", 393511944);
        setIntField(term284884, term284884.getClass(), "bestBattlePoint", -829559848);
        setIntField(term284884, term284884.getClass(), "overDamageBattlePoint", 674370223);
        setBooleanField(term284884, term284884.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term284884, term284884.getClass(), "nameplateId", 1667723550);
        setIntField(term284884, term284884.getClass(), "trophyId", 1605590859);
        setIntField(term284884, term284884.getClass(), "cardId", 121161260);
        setIntField(term284884, term284884.getClass(), "characterId", 117481309);
        setIntField(term284884, term284884.getClass(), "characterVoiceNo", 1993168996);
        setIntField(term284884, term284884.getClass(), "tabSetting", 951239293);
        setIntField(term284884, term284884.getClass(), "tabSortSetting", -255324540);
        setIntField(term284884, term284884.getClass(), "cardCategorySetting", 1090348247);
        setIntField(term284884, term284884.getClass(), "cardSortSetting", 1680192191);
        setIntField(term284884, term284884.getClass(), "rivalScoreCategorySetting", 295190981);
        setIntField(term284884, term284884.getClass(), "playedTutorialBit", -1492427400);
        setIntField(term284884, term284884.getClass(), "firstTutorialCancelNum", 884288171);
        setLongField(term284884, term284884.getClass(), "sumTechHighScore", 1349037483787269005L);
        setLongField(term284884, term284884.getClass(), "sumTechBasicHighScore", -3889651700583510929L);
        setLongField(term284884, term284884.getClass(), "sumTechAdvancedHighScore", -4375945930258434129L);
        setLongField(term284884, term284884.getClass(), "sumTechExpertHighScore", 408081809539036288L);
        setLongField(term284884, term284884.getClass(), "sumTechMasterHighScore", 7427224624708137028L);
        setLongField(term284884, term284884.getClass(), "sumTechLunaticHighScore", -7445255356341405170L);
        setLongField(term284884, term284884.getClass(), "sumBattleHighScore", -5858567410949178383L);
        setLongField(term284884, term284884.getClass(), "sumBattleBasicHighScore", -5260166323050210706L);
        setLongField(term284884, term284884.getClass(), "sumBattleAdvancedHighScore", -2177742474745539396L);
        setLongField(term284884, term284884.getClass(), "sumBattleExpertHighScore", -5218927486228486975L);
        setLongField(term284884, term284884.getClass(), "sumBattleMasterHighScore", -1671941535679529997L);
        setLongField(term284884, term284884.getClass(), "sumBattleLunaticHighScore", 3898707483848106618L);
        setField(term284884, term284884.getClass(), "eventWatchedDate", "pVqgMvBetn");
        setField(term284884, term284884.getClass(), "cmEventWatchedDate", "GWyDJhNjHO");
        setField(term284884, term284884.getClass(), "firstGameId", "wGLXibmokg");
        setField(term284884, term284884.getClass(), "firstRomVersion", "pjzfuurpjQ");
        setField(term284884, term284884.getClass(), "firstDataVersion", "ruWiEcqbKE");
        setField(term284884, term284884.getClass(), "firstPlayDate", "fOazzEjCJK");
        setField(term284884, term284884.getClass(), "lastGameId", "rQvktJLyNp");
        setField(term284884, term284884.getClass(), "lastRomVersion", "agrDiNiIaA");
        setField(term284884, term284884.getClass(), "lastDataVersion", "WUUmlOfErB");
        setField(term284884, term284884.getClass(), "compatibleCmVersion", "OacYqyvsgP");
        setField(term284884, term284884.getClass(), "lastPlayDate", "ednhFNlubd");
        setIntField(term284884, term284884.getClass(), "lastPlaceId", 1319605673);
        setField(term284884, term284884.getClass(), "lastPlaceName", "YIcytpxQpg");
        setIntField(term284884, term284884.getClass(), "lastRegionId", -1516059020);
        setField(term284884, term284884.getClass(), "lastRegionName", "nLdiDnEtGa");
        setIntField(term284884, term284884.getClass(), "lastAllNetId", 397981508);
        setField(term284884, term284884.getClass(), "lastClientId", "XepaExohUu");
        setIntField(term284884, term284884.getClass(), "lastUsedDeckId", -1333512086);
        setIntField(term284884, term284884.getClass(), "lastPlayMusicLevel", -1753703153);
        setIntField(term284884, term284884.getClass(), "lastEmoneyBrand", 1023725891);
        setField(term284882, term284882.getClass(), "user", term284884);
        setIntField(term284882, term284882.getClass(), "kind", -980165954);
        setIntField(term284882, term284882.getClass(), "activityId", -1137562740);
        setIntField(term284882, term284882.getClass(), "sortNumber", -1654532760);
        setIntField(term284882, term284882.getClass(), "param1", -106292001);
        setIntField(term284882, term284882.getClass(), "param2", 1380387716);
        setIntField(term284882, term284882.getClass(), "param3", -1881487472);
        setIntField(term284882, term284882.getClass(), "param4", 572568329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortNumber", argTypes, term284882, args);
    }

};


