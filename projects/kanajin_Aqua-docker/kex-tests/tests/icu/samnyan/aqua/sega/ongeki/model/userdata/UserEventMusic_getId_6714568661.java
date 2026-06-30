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

public class UserEventMusic_getId_6714568661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369478;

    public UserEventMusic_getId_6714568661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term369484 = new Long(2823262561274956150L);
        term369478 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term369480 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term369482 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term369498 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369499 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369503 = newInstance(Class.forName("java.time.LocalTime"));
        Object term369508 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369513 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term369478, term369478.getClass(), "id", -246662685025192015L);
        setLongField(term369480, term369480.getClass(), "id", -5852815516134466104L);
        setLongField(term369482, term369482.getClass(), "id", -7161945408697018341L);
        setField(term369482, term369482.getClass(), "extId", term369484);
        setField(term369482, term369482.getClass(), "luid", "srhfutHsjJ");
        setIntField(term369499, term369499.getClass(), "year", 2021);
        setShortField(term369499, term369499.getClass(), "month", (short) 10);
        setShortField(term369499, term369499.getClass(), "day", (short) 21);
        setField(term369498, term369498.getClass(), "date", term369499);
        setByteField(term369503, term369503.getClass(), "hour", (byte) 18);
        setByteField(term369503, term369503.getClass(), "minute", (byte) 13);
        setByteField(term369503, term369503.getClass(), "second", (byte) 5);
        setIntField(term369503, term369503.getClass(), "nano", 498696785);
        setField(term369498, term369498.getClass(), "time", term369503);
        setField(term369482, term369482.getClass(), "registerTime", term369498);
        setIntField(term369509, term369509.getClass(), "year", 2023);
        setShortField(term369509, term369509.getClass(), "month", (short) 10);
        setShortField(term369509, term369509.getClass(), "day", (short) 7);
        setField(term369508, term369508.getClass(), "date", term369509);
        setByteField(term369513, term369513.getClass(), "hour", (byte) 5);
        setByteField(term369513, term369513.getClass(), "minute", (byte) 55);
        setByteField(term369513, term369513.getClass(), "second", (byte) 51);
        setIntField(term369513, term369513.getClass(), "nano", 618539758);
        setField(term369508, term369508.getClass(), "time", term369513);
        setField(term369482, term369482.getClass(), "accessTime", term369508);
        setField(term369480, term369480.getClass(), "card", term369482);
        setField(term369480, term369480.getClass(), "userName", "iPvXfoSoOG");
        setIntField(term369480, term369480.getClass(), "level", -1675454184);
        setIntField(term369480, term369480.getClass(), "reincarnationNum", -1125747121);
        setLongField(term369480, term369480.getClass(), "exp", 3225428499497113548L);
        setLongField(term369480, term369480.getClass(), "point", -9030485104688969129L);
        setLongField(term369480, term369480.getClass(), "totalPoint", -5948536917104810444L);
        setIntField(term369480, term369480.getClass(), "playCount", -1046626369);
        setIntField(term369480, term369480.getClass(), "jewelCount", 1039828547);
        setIntField(term369480, term369480.getClass(), "totalJewelCount", 1737876740);
        setIntField(term369480, term369480.getClass(), "medalCount", -2015541852);
        setIntField(term369480, term369480.getClass(), "playerRating", -1726055641);
        setIntField(term369480, term369480.getClass(), "highestRating", 602170255);
        setIntField(term369480, term369480.getClass(), "battlePoint", 2055393565);
        setIntField(term369480, term369480.getClass(), "bestBattlePoint", 769913692);
        setIntField(term369480, term369480.getClass(), "overDamageBattlePoint", -1930935337);
        setBooleanField(term369480, term369480.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term369480, term369480.getClass(), "nameplateId", 1092947643);
        setIntField(term369480, term369480.getClass(), "trophyId", 31282616);
        setIntField(term369480, term369480.getClass(), "cardId", -1076933310);
        setIntField(term369480, term369480.getClass(), "characterId", -76495147);
        setIntField(term369480, term369480.getClass(), "characterVoiceNo", -6137100);
        setIntField(term369480, term369480.getClass(), "tabSetting", 1652108534);
        setIntField(term369480, term369480.getClass(), "tabSortSetting", 681715351);
        setIntField(term369480, term369480.getClass(), "cardCategorySetting", 891168879);
        setIntField(term369480, term369480.getClass(), "cardSortSetting", -133103154);
        setIntField(term369480, term369480.getClass(), "rivalScoreCategorySetting", -1060390071);
        setIntField(term369480, term369480.getClass(), "playedTutorialBit", 62124106);
        setIntField(term369480, term369480.getClass(), "firstTutorialCancelNum", -1083930021);
        setLongField(term369480, term369480.getClass(), "sumTechHighScore", 550366380699983608L);
        setLongField(term369480, term369480.getClass(), "sumTechBasicHighScore", 2219675459131021149L);
        setLongField(term369480, term369480.getClass(), "sumTechAdvancedHighScore", -951048577621732893L);
        setLongField(term369480, term369480.getClass(), "sumTechExpertHighScore", 2871253549812839647L);
        setLongField(term369480, term369480.getClass(), "sumTechMasterHighScore", -2095777213887347404L);
        setLongField(term369480, term369480.getClass(), "sumTechLunaticHighScore", -7875407750998437103L);
        setLongField(term369480, term369480.getClass(), "sumBattleHighScore", -4279829557837199774L);
        setLongField(term369480, term369480.getClass(), "sumBattleBasicHighScore", 1193524452493104338L);
        setLongField(term369480, term369480.getClass(), "sumBattleAdvancedHighScore", -6136890791981317728L);
        setLongField(term369480, term369480.getClass(), "sumBattleExpertHighScore", 863080799026931590L);
        setLongField(term369480, term369480.getClass(), "sumBattleMasterHighScore", 1499207509455210374L);
        setLongField(term369480, term369480.getClass(), "sumBattleLunaticHighScore", 2441966512408623967L);
        setField(term369480, term369480.getClass(), "eventWatchedDate", "mWbJHDIjiN");
        setField(term369480, term369480.getClass(), "cmEventWatchedDate", "ZcHDZpFBul");
        setField(term369480, term369480.getClass(), "firstGameId", "wnRHQcnWQu");
        setField(term369480, term369480.getClass(), "firstRomVersion", "cmyVrDGwLl");
        setField(term369480, term369480.getClass(), "firstDataVersion", "KdBfhJhNjp");
        setField(term369480, term369480.getClass(), "firstPlayDate", "chmEIlPhMj");
        setField(term369480, term369480.getClass(), "lastGameId", "MtYjnhDeLP");
        setField(term369480, term369480.getClass(), "lastRomVersion", "wouzyvoCeX");
        setField(term369480, term369480.getClass(), "lastDataVersion", "nXzXohViml");
        setField(term369480, term369480.getClass(), "compatibleCmVersion", "HbqEePHbTw");
        setField(term369480, term369480.getClass(), "lastPlayDate", "YrsMsQpMqh");
        setIntField(term369480, term369480.getClass(), "lastPlaceId", -314894181);
        setField(term369480, term369480.getClass(), "lastPlaceName", "aLxdBnYxeO");
        setIntField(term369480, term369480.getClass(), "lastRegionId", 1288010807);
        setField(term369480, term369480.getClass(), "lastRegionName", "kWKWWYtrMu");
        setIntField(term369480, term369480.getClass(), "lastAllNetId", 2091655270);
        setField(term369480, term369480.getClass(), "lastClientId", "cfLlYhLqtX");
        setIntField(term369480, term369480.getClass(), "lastUsedDeckId", -2001514465);
        setIntField(term369480, term369480.getClass(), "lastPlayMusicLevel", -676854016);
        setIntField(term369480, term369480.getClass(), "lastEmoneyBrand", -934348962);
        setField(term369478, term369478.getClass(), "user", term369480);
        setIntField(term369478, term369478.getClass(), "eventId", 780672203);
        setIntField(term369478, term369478.getClass(), "type", -1530411597);
        setIntField(term369478, term369478.getClass(), "musicId", 766825156);
        setIntField(term369478, term369478.getClass(), "level", -852393545);
        setIntField(term369478, term369478.getClass(), "techScoreMax", 671653152);
        setIntField(term369478, term369478.getClass(), "platinumScoreMax", 1513163876);
        setField(term369478, term369478.getClass(), "techRecordDate", "orWtmlCdvx");
        setBooleanField(term369478, term369478.getClass(), "isTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term369478, args);
    }

};


