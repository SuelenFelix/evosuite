package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserDuel_getProgress_1645511844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76621;

    public UserDuel_getProgress_1645511844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76627 = new Long(8802866251294305945L);
        term76621 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel"));
        Object term76623 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term76625 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76641 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76642 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76646 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76651 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76652 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76656 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76678 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76734 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76735 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76739 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76908 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76621, term76621.getClass(), "id", -1765487752643688529L);
        setLongField(term76623, term76623.getClass(), "id", -322037057179477006L);
        setLongField(term76625, term76625.getClass(), "id", -856690647211976135L);
        setField(term76625, term76625.getClass(), "extId", term76627);
        setField(term76625, term76625.getClass(), "luid", "rvUfMhtNrD");
        setIntField(term76642, term76642.getClass(), "year", 2012);
        setShortField(term76642, term76642.getClass(), "month", (short) 3);
        setShortField(term76642, term76642.getClass(), "day", (short) 20);
        setField(term76641, term76641.getClass(), "date", term76642);
        setByteField(term76646, term76646.getClass(), "hour", (byte) 16);
        setByteField(term76646, term76646.getClass(), "minute", (byte) 41);
        setByteField(term76646, term76646.getClass(), "second", (byte) 13);
        setIntField(term76646, term76646.getClass(), "nano", 546552876);
        setField(term76641, term76641.getClass(), "time", term76646);
        setField(term76625, term76625.getClass(), "registerTime", term76641);
        setIntField(term76652, term76652.getClass(), "year", 2025);
        setShortField(term76652, term76652.getClass(), "month", (short) 5);
        setShortField(term76652, term76652.getClass(), "day", (short) 7);
        setField(term76651, term76651.getClass(), "date", term76652);
        setByteField(term76656, term76656.getClass(), "hour", (byte) 9);
        setByteField(term76656, term76656.getClass(), "minute", (byte) 7);
        setByteField(term76656, term76656.getClass(), "second", (byte) 58);
        setIntField(term76656, term76656.getClass(), "nano", 974291074);
        setField(term76651, term76651.getClass(), "time", term76656);
        setField(term76625, term76625.getClass(), "accessTime", term76651);
        setField(term76623, term76623.getClass(), "card", term76625);
        setField(term76623, term76623.getClass(), "userName", "tVJNKfGPYg");
        setIntField(term76674, term76674.getClass(), "year", 2026);
        setShortField(term76674, term76674.getClass(), "month", (short) 9);
        setShortField(term76674, term76674.getClass(), "day", (short) 29);
        setField(term76673, term76673.getClass(), "date", term76674);
        setByteField(term76678, term76678.getClass(), "hour", (byte) 18);
        setByteField(term76678, term76678.getClass(), "minute", (byte) 42);
        setByteField(term76678, term76678.getClass(), "second", (byte) 40);
        setIntField(term76678, term76678.getClass(), "nano", 611001144);
        setField(term76673, term76673.getClass(), "time", term76678);
        setField(term76623, term76623.getClass(), "lastLoginDate", term76673);
        setBooleanField(term76623, term76623.getClass(), "isWebJoin", false);
        setField(term76623, term76623.getClass(), "webLimitDate", "AlAUNSOTmH");
        setIntField(term76623, term76623.getClass(), "level", -482661954);
        setIntField(term76623, term76623.getClass(), "reincarnationNum", -1449003566);
        setField(term76623, term76623.getClass(), "exp", "IeuSZGvhvH");
        setLongField(term76623, term76623.getClass(), "point", 1872623849965712756L);
        setLongField(term76623, term76623.getClass(), "totalPoint", 4536273050817852892L);
        setIntField(term76623, term76623.getClass(), "playCount", -649826731);
        setIntField(term76623, term76623.getClass(), "multiPlayCount", 506165302);
        setIntField(term76623, term76623.getClass(), "multiWinCount", 932736092);
        setIntField(term76623, term76623.getClass(), "requestResCount", 1792344129);
        setIntField(term76623, term76623.getClass(), "acceptResCount", -1718734463);
        setIntField(term76623, term76623.getClass(), "successResCount", -843385533);
        setIntField(term76623, term76623.getClass(), "playerRating", -156627014);
        setIntField(term76623, term76623.getClass(), "highestRating", -933160129);
        setIntField(term76623, term76623.getClass(), "nameplateId", 1272821016);
        setIntField(term76623, term76623.getClass(), "frameId", -1553822493);
        setIntField(term76623, term76623.getClass(), "characterId", -623107839);
        setIntField(term76623, term76623.getClass(), "trophyId", -598781625);
        setIntField(term76623, term76623.getClass(), "playedTutorialBit", -1717992579);
        setIntField(term76623, term76623.getClass(), "firstTutorialCancelNum", 271835355);
        setIntField(term76623, term76623.getClass(), "masterTutorialCancelNum", -715995272);
        setIntField(term76623, term76623.getClass(), "totalRepertoireCount", 1175202910);
        setIntField(term76623, term76623.getClass(), "totalMapNum", 1984427818);
        setLongField(term76623, term76623.getClass(), "totalHiScore", -8877453128191451125L);
        setLongField(term76623, term76623.getClass(), "totalBasicHighScore", -7419533263156606680L);
        setLongField(term76623, term76623.getClass(), "totalAdvancedHighScore", -6669304009215553269L);
        setLongField(term76623, term76623.getClass(), "totalExpertHighScore", 8850925698448189827L);
        setLongField(term76623, term76623.getClass(), "totalMasterHighScore", -2444680017884853722L);
        setIntField(term76735, term76735.getClass(), "year", 2010);
        setShortField(term76735, term76735.getClass(), "month", (short) 5);
        setShortField(term76735, term76735.getClass(), "day", (short) 14);
        setField(term76734, term76734.getClass(), "date", term76735);
        setByteField(term76739, term76739.getClass(), "hour", (byte) 17);
        setByteField(term76739, term76739.getClass(), "minute", (byte) 11);
        setByteField(term76739, term76739.getClass(), "second", (byte) 30);
        setIntField(term76739, term76739.getClass(), "nano", 641019384);
        setField(term76734, term76734.getClass(), "time", term76739);
        setField(term76623, term76623.getClass(), "eventWatchedDate", term76734);
        setIntField(term76623, term76623.getClass(), "friendCount", 163785192);
        setBooleanField(term76623, term76623.getClass(), "isMaimai", true);
        setField(term76623, term76623.getClass(), "firstGameId", "zCejWZdaIc");
        setField(term76623, term76623.getClass(), "firstRomVersion", "aCfzlsgXhB");
        setField(term76623, term76623.getClass(), "firstDataVersion", "HmhoMiUgEv");
        setIntField(term76783, term76783.getClass(), "year", 2022);
        setShortField(term76783, term76783.getClass(), "month", (short) 9);
        setShortField(term76783, term76783.getClass(), "day", (short) 6);
        setField(term76782, term76782.getClass(), "date", term76783);
        setByteField(term76787, term76787.getClass(), "hour", (byte) 0);
        setByteField(term76787, term76787.getClass(), "minute", (byte) 36);
        setByteField(term76787, term76787.getClass(), "second", (byte) 57);
        setIntField(term76787, term76787.getClass(), "nano", 623892951);
        setField(term76782, term76782.getClass(), "time", term76787);
        setField(term76623, term76623.getClass(), "firstPlayDate", term76782);
        setField(term76623, term76623.getClass(), "lastGameId", "MuJvYyPzjX");
        setField(term76623, term76623.getClass(), "lastRomVersion", "pEZeQhLjKN");
        setField(term76623, term76623.getClass(), "lastDataVersion", "saKRDpPnGD");
        setIntField(term76829, term76829.getClass(), "year", 2014);
        setShortField(term76829, term76829.getClass(), "month", (short) 12);
        setShortField(term76829, term76829.getClass(), "day", (short) 12);
        setField(term76828, term76828.getClass(), "date", term76829);
        setByteField(term76833, term76833.getClass(), "hour", (byte) 8);
        setByteField(term76833, term76833.getClass(), "minute", (byte) 44);
        setByteField(term76833, term76833.getClass(), "second", (byte) 19);
        setIntField(term76833, term76833.getClass(), "nano", 16834354);
        setField(term76828, term76828.getClass(), "time", term76833);
        setField(term76623, term76623.getClass(), "lastPlayDate", term76828);
        setIntField(term76623, term76623.getClass(), "lastPlaceId", 699884037);
        setField(term76623, term76623.getClass(), "lastPlaceName", "UesGweYSco");
        setField(term76623, term76623.getClass(), "lastRegionId", "uVnPUUZHSY");
        setField(term76623, term76623.getClass(), "lastRegionName", "LaWPqdDqyl");
        setField(term76623, term76623.getClass(), "lastAllNetId", "BGDjrSZTJY");
        setField(term76623, term76623.getClass(), "lastClientId", "VUVCEVItic");
        setField(term76621, term76621.getClass(), "user", term76623);
        setIntField(term76621, term76621.getClass(), "duelId", -151920832);
        setIntField(term76621, term76621.getClass(), "progress", 1800895955);
        setIntField(term76621, term76621.getClass(), "point", 1475225110);
        setBooleanField(term76621, term76621.getClass(), "isClear", true);
        setIntField(term76904, term76904.getClass(), "year", 2012);
        setShortField(term76904, term76904.getClass(), "month", (short) 11);
        setShortField(term76904, term76904.getClass(), "day", (short) 5);
        setField(term76903, term76903.getClass(), "date", term76904);
        setByteField(term76908, term76908.getClass(), "hour", (byte) 16);
        setByteField(term76908, term76908.getClass(), "minute", (byte) 51);
        setByteField(term76908, term76908.getClass(), "second", (byte) 52);
        setIntField(term76908, term76908.getClass(), "nano", 794474514);
        setField(term76903, term76903.getClass(), "time", term76908);
        setField(term76621, term76621.getClass(), "lastPlayDate", term76903);
        setIntField(term76621, term76621.getClass(), "param1", -746882829);
        setIntField(term76621, term76621.getClass(), "param2", 1303334365);
        setIntField(term76621, term76621.getClass(), "param3", 931490251);
        setIntField(term76621, term76621.getClass(), "param4", -1812785070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserDuel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgress", argTypes, term76621, args);
    }

};


