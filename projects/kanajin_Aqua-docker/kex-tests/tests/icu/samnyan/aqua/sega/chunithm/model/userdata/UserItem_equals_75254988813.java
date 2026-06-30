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

public class UserItem_equals_75254988813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127099;
     Object term127381;

    public UserItem_equals_75254988813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term127105 = new Long(4576699120365923235L);
        term127099 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem"));
        Object term127101 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term127103 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term127119 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127120 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127124 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127156 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127212 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127213 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127217 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127260 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127261 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127265 = newInstance(Class.forName("java.time.LocalTime"));
        Object term127306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term127307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term127311 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term127099, term127099.getClass(), "id", -8721079966012575280L);
        setLongField(term127101, term127101.getClass(), "id", 3103352049634176766L);
        setLongField(term127103, term127103.getClass(), "id", 3732205319116661941L);
        setField(term127103, term127103.getClass(), "extId", term127105);
        setField(term127103, term127103.getClass(), "luid", "kgFJtzMrPn");
        setIntField(term127120, term127120.getClass(), "year", 2011);
        setShortField(term127120, term127120.getClass(), "month", (short) 2);
        setShortField(term127120, term127120.getClass(), "day", (short) 3);
        setField(term127119, term127119.getClass(), "date", term127120);
        setByteField(term127124, term127124.getClass(), "hour", (byte) 3);
        setByteField(term127124, term127124.getClass(), "minute", (byte) 24);
        setByteField(term127124, term127124.getClass(), "second", (byte) 44);
        setIntField(term127124, term127124.getClass(), "nano", 410664773);
        setField(term127119, term127119.getClass(), "time", term127124);
        setField(term127103, term127103.getClass(), "registerTime", term127119);
        setIntField(term127130, term127130.getClass(), "year", 2013);
        setShortField(term127130, term127130.getClass(), "month", (short) 6);
        setShortField(term127130, term127130.getClass(), "day", (short) 11);
        setField(term127129, term127129.getClass(), "date", term127130);
        setByteField(term127134, term127134.getClass(), "hour", (byte) 13);
        setByteField(term127134, term127134.getClass(), "minute", (byte) 9);
        setByteField(term127134, term127134.getClass(), "second", (byte) 50);
        setIntField(term127134, term127134.getClass(), "nano", 866463029);
        setField(term127129, term127129.getClass(), "time", term127134);
        setField(term127103, term127103.getClass(), "accessTime", term127129);
        setField(term127101, term127101.getClass(), "card", term127103);
        setField(term127101, term127101.getClass(), "userName", "NIkocNvjmy");
        setIntField(term127152, term127152.getClass(), "year", 2012);
        setShortField(term127152, term127152.getClass(), "month", (short) 8);
        setShortField(term127152, term127152.getClass(), "day", (short) 12);
        setField(term127151, term127151.getClass(), "date", term127152);
        setByteField(term127156, term127156.getClass(), "hour", (byte) 2);
        setByteField(term127156, term127156.getClass(), "minute", (byte) 13);
        setByteField(term127156, term127156.getClass(), "second", (byte) 15);
        setIntField(term127156, term127156.getClass(), "nano", 969832518);
        setField(term127151, term127151.getClass(), "time", term127156);
        setField(term127101, term127101.getClass(), "lastLoginDate", term127151);
        setBooleanField(term127101, term127101.getClass(), "isWebJoin", false);
        setField(term127101, term127101.getClass(), "webLimitDate", "slAGCmeSHy");
        setIntField(term127101, term127101.getClass(), "level", -64917079);
        setIntField(term127101, term127101.getClass(), "reincarnationNum", 14382041);
        setField(term127101, term127101.getClass(), "exp", "DRgskGEoHQ");
        setLongField(term127101, term127101.getClass(), "point", -2437083850262908381L);
        setLongField(term127101, term127101.getClass(), "totalPoint", 833849456046483202L);
        setIntField(term127101, term127101.getClass(), "playCount", -2016163798);
        setIntField(term127101, term127101.getClass(), "multiPlayCount", 1260602495);
        setIntField(term127101, term127101.getClass(), "multiWinCount", 2098871750);
        setIntField(term127101, term127101.getClass(), "requestResCount", 583294548);
        setIntField(term127101, term127101.getClass(), "acceptResCount", -2034642375);
        setIntField(term127101, term127101.getClass(), "successResCount", -1486717740);
        setIntField(term127101, term127101.getClass(), "playerRating", 1578135347);
        setIntField(term127101, term127101.getClass(), "highestRating", -1283825868);
        setIntField(term127101, term127101.getClass(), "nameplateId", 322372633);
        setIntField(term127101, term127101.getClass(), "frameId", 1255794961);
        setIntField(term127101, term127101.getClass(), "characterId", 232805435);
        setIntField(term127101, term127101.getClass(), "trophyId", 721981536);
        setIntField(term127101, term127101.getClass(), "playedTutorialBit", 91610201);
        setIntField(term127101, term127101.getClass(), "firstTutorialCancelNum", -1281117768);
        setIntField(term127101, term127101.getClass(), "masterTutorialCancelNum", 208991599);
        setIntField(term127101, term127101.getClass(), "totalRepertoireCount", 19147886);
        setIntField(term127101, term127101.getClass(), "totalMapNum", 610934293);
        setLongField(term127101, term127101.getClass(), "totalHiScore", 3498660691906309998L);
        setLongField(term127101, term127101.getClass(), "totalBasicHighScore", -2863041629805353276L);
        setLongField(term127101, term127101.getClass(), "totalAdvancedHighScore", 2542595135669094188L);
        setLongField(term127101, term127101.getClass(), "totalExpertHighScore", 5163944658879449034L);
        setLongField(term127101, term127101.getClass(), "totalMasterHighScore", -2762998546435960413L);
        setIntField(term127213, term127213.getClass(), "year", 2011);
        setShortField(term127213, term127213.getClass(), "month", (short) 5);
        setShortField(term127213, term127213.getClass(), "day", (short) 26);
        setField(term127212, term127212.getClass(), "date", term127213);
        setByteField(term127217, term127217.getClass(), "hour", (byte) 7);
        setByteField(term127217, term127217.getClass(), "minute", (byte) 18);
        setByteField(term127217, term127217.getClass(), "second", (byte) 36);
        setIntField(term127217, term127217.getClass(), "nano", 156788573);
        setField(term127212, term127212.getClass(), "time", term127217);
        setField(term127101, term127101.getClass(), "eventWatchedDate", term127212);
        setIntField(term127101, term127101.getClass(), "friendCount", 285231640);
        setBooleanField(term127101, term127101.getClass(), "isMaimai", true);
        setField(term127101, term127101.getClass(), "firstGameId", "EnWOFmweOs");
        setField(term127101, term127101.getClass(), "firstRomVersion", "kBoIUinjBw");
        setField(term127101, term127101.getClass(), "firstDataVersion", "DrCWSqTYSn");
        setIntField(term127261, term127261.getClass(), "year", 2019);
        setShortField(term127261, term127261.getClass(), "month", (short) 5);
        setShortField(term127261, term127261.getClass(), "day", (short) 11);
        setField(term127260, term127260.getClass(), "date", term127261);
        setByteField(term127265, term127265.getClass(), "hour", (byte) 17);
        setByteField(term127265, term127265.getClass(), "minute", (byte) 11);
        setByteField(term127265, term127265.getClass(), "second", (byte) 40);
        setIntField(term127265, term127265.getClass(), "nano", 538230479);
        setField(term127260, term127260.getClass(), "time", term127265);
        setField(term127101, term127101.getClass(), "firstPlayDate", term127260);
        setField(term127101, term127101.getClass(), "lastGameId", "porFPgKTrM");
        setField(term127101, term127101.getClass(), "lastRomVersion", "PvoRpvEjZQ");
        setField(term127101, term127101.getClass(), "lastDataVersion", "usnNnhdlFi");
        setIntField(term127307, term127307.getClass(), "year", 2018);
        setShortField(term127307, term127307.getClass(), "month", (short) 1);
        setShortField(term127307, term127307.getClass(), "day", (short) 2);
        setField(term127306, term127306.getClass(), "date", term127307);
        setByteField(term127311, term127311.getClass(), "hour", (byte) 1);
        setByteField(term127311, term127311.getClass(), "minute", (byte) 25);
        setByteField(term127311, term127311.getClass(), "second", (byte) 43);
        setIntField(term127311, term127311.getClass(), "nano", 801064102);
        setField(term127306, term127306.getClass(), "time", term127311);
        setField(term127101, term127101.getClass(), "lastPlayDate", term127306);
        setIntField(term127101, term127101.getClass(), "lastPlaceId", 1143728385);
        setField(term127101, term127101.getClass(), "lastPlaceName", "QXQboaRWMP");
        setField(term127101, term127101.getClass(), "lastRegionId", "eykOlhRHsN");
        setField(term127101, term127101.getClass(), "lastRegionName", "LZatFkMSRt");
        setField(term127101, term127101.getClass(), "lastAllNetId", "fKGSaWAVQr");
        setField(term127101, term127101.getClass(), "lastClientId", "fBbPBwYFmd");
        setField(term127099, term127099.getClass(), "user", term127101);
        setIntField(term127099, term127099.getClass(), "itemKind", 368771436);
        setIntField(term127099, term127099.getClass(), "itemId", 92522088);
        setIntField(term127099, term127099.getClass(), "stock", 1);
        setBooleanField(term127099, term127099.getClass(), "isValid", true);
        term127381 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term127381;
        callMethod(klass, "equals", argTypes, term127099, args);
    }

};


