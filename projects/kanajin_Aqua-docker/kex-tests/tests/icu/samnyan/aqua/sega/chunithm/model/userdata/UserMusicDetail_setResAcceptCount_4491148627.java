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
import java.lang.Integer;

public class UserMusicDetail_setResAcceptCount_4491148627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100081;
     Object term100375;

    public UserMusicDetail_setResAcceptCount_4491148627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100087 = new Long(-1505191021111100819L);
        term100081 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term100083 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term100085 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term100101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100133 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100134 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100138 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100242 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100247 = newInstance(Class.forName("java.time.LocalTime"));
        Object term100288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term100293 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term100081, term100081.getClass(), "id", 3056037435259866024L);
        setLongField(term100083, term100083.getClass(), "id", 1372923762481191417L);
        setLongField(term100085, term100085.getClass(), "id", 4307370135092659893L);
        setField(term100085, term100085.getClass(), "extId", term100087);
        setField(term100085, term100085.getClass(), "luid", "JtamsBczow");
        setIntField(term100102, term100102.getClass(), "year", 2027);
        setShortField(term100102, term100102.getClass(), "month", (short) 11);
        setShortField(term100102, term100102.getClass(), "day", (short) 16);
        setField(term100101, term100101.getClass(), "date", term100102);
        setByteField(term100106, term100106.getClass(), "hour", (byte) 10);
        setByteField(term100106, term100106.getClass(), "minute", (byte) 57);
        setByteField(term100106, term100106.getClass(), "second", (byte) 50);
        setIntField(term100106, term100106.getClass(), "nano", 260506114);
        setField(term100101, term100101.getClass(), "time", term100106);
        setField(term100085, term100085.getClass(), "registerTime", term100101);
        setIntField(term100112, term100112.getClass(), "year", 2010);
        setShortField(term100112, term100112.getClass(), "month", (short) 9);
        setShortField(term100112, term100112.getClass(), "day", (short) 3);
        setField(term100111, term100111.getClass(), "date", term100112);
        setByteField(term100116, term100116.getClass(), "hour", (byte) 10);
        setByteField(term100116, term100116.getClass(), "minute", (byte) 46);
        setByteField(term100116, term100116.getClass(), "second", (byte) 49);
        setIntField(term100116, term100116.getClass(), "nano", 392327328);
        setField(term100111, term100111.getClass(), "time", term100116);
        setField(term100085, term100085.getClass(), "accessTime", term100111);
        setField(term100083, term100083.getClass(), "card", term100085);
        setField(term100083, term100083.getClass(), "userName", "ckScPlFqWx");
        setIntField(term100134, term100134.getClass(), "year", 2025);
        setShortField(term100134, term100134.getClass(), "month", (short) 10);
        setShortField(term100134, term100134.getClass(), "day", (short) 31);
        setField(term100133, term100133.getClass(), "date", term100134);
        setByteField(term100138, term100138.getClass(), "hour", (byte) 4);
        setByteField(term100138, term100138.getClass(), "minute", (byte) 25);
        setByteField(term100138, term100138.getClass(), "second", (byte) 54);
        setIntField(term100138, term100138.getClass(), "nano", 91940440);
        setField(term100133, term100133.getClass(), "time", term100138);
        setField(term100083, term100083.getClass(), "lastLoginDate", term100133);
        setBooleanField(term100083, term100083.getClass(), "isWebJoin", false);
        setField(term100083, term100083.getClass(), "webLimitDate", "KIGJgoclUB");
        setIntField(term100083, term100083.getClass(), "level", 234527042);
        setIntField(term100083, term100083.getClass(), "reincarnationNum", -1070770514);
        setField(term100083, term100083.getClass(), "exp", "LxnOVCDRzb");
        setLongField(term100083, term100083.getClass(), "point", -9046114186297002593L);
        setLongField(term100083, term100083.getClass(), "totalPoint", -398055953150289256L);
        setIntField(term100083, term100083.getClass(), "playCount", 1004064636);
        setIntField(term100083, term100083.getClass(), "multiPlayCount", -1815732679);
        setIntField(term100083, term100083.getClass(), "multiWinCount", -2141382740);
        setIntField(term100083, term100083.getClass(), "requestResCount", -1545135290);
        setIntField(term100083, term100083.getClass(), "acceptResCount", -802934163);
        setIntField(term100083, term100083.getClass(), "successResCount", -1934019263);
        setIntField(term100083, term100083.getClass(), "playerRating", 530191772);
        setIntField(term100083, term100083.getClass(), "highestRating", 698731814);
        setIntField(term100083, term100083.getClass(), "nameplateId", -1282557913);
        setIntField(term100083, term100083.getClass(), "frameId", -2080692202);
        setIntField(term100083, term100083.getClass(), "characterId", 601982968);
        setIntField(term100083, term100083.getClass(), "trophyId", -999152791);
        setIntField(term100083, term100083.getClass(), "playedTutorialBit", 771966144);
        setIntField(term100083, term100083.getClass(), "firstTutorialCancelNum", -270951499);
        setIntField(term100083, term100083.getClass(), "masterTutorialCancelNum", 1283219056);
        setIntField(term100083, term100083.getClass(), "totalRepertoireCount", 1914052513);
        setIntField(term100083, term100083.getClass(), "totalMapNum", -1810525034);
        setLongField(term100083, term100083.getClass(), "totalHiScore", -1356391415982968329L);
        setLongField(term100083, term100083.getClass(), "totalBasicHighScore", -51437660553060977L);
        setLongField(term100083, term100083.getClass(), "totalAdvancedHighScore", -2636567666096347903L);
        setLongField(term100083, term100083.getClass(), "totalExpertHighScore", -7772427422426260409L);
        setLongField(term100083, term100083.getClass(), "totalMasterHighScore", -274606845369208412L);
        setIntField(term100195, term100195.getClass(), "year", 2024);
        setShortField(term100195, term100195.getClass(), "month", (short) 11);
        setShortField(term100195, term100195.getClass(), "day", (short) 3);
        setField(term100194, term100194.getClass(), "date", term100195);
        setByteField(term100199, term100199.getClass(), "hour", (byte) 11);
        setByteField(term100199, term100199.getClass(), "minute", (byte) 49);
        setByteField(term100199, term100199.getClass(), "second", (byte) 52);
        setIntField(term100199, term100199.getClass(), "nano", 784744896);
        setField(term100194, term100194.getClass(), "time", term100199);
        setField(term100083, term100083.getClass(), "eventWatchedDate", term100194);
        setIntField(term100083, term100083.getClass(), "friendCount", -2104858494);
        setBooleanField(term100083, term100083.getClass(), "isMaimai", true);
        setField(term100083, term100083.getClass(), "firstGameId", "MPsfpSOhwQ");
        setField(term100083, term100083.getClass(), "firstRomVersion", "GkTxuqMoMw");
        setField(term100083, term100083.getClass(), "firstDataVersion", "MdlLUfrIYx");
        setIntField(term100243, term100243.getClass(), "year", 2024);
        setShortField(term100243, term100243.getClass(), "month", (short) 12);
        setShortField(term100243, term100243.getClass(), "day", (short) 14);
        setField(term100242, term100242.getClass(), "date", term100243);
        setByteField(term100247, term100247.getClass(), "hour", (byte) 20);
        setByteField(term100247, term100247.getClass(), "minute", (byte) 50);
        setByteField(term100247, term100247.getClass(), "second", (byte) 27);
        setIntField(term100247, term100247.getClass(), "nano", 175500624);
        setField(term100242, term100242.getClass(), "time", term100247);
        setField(term100083, term100083.getClass(), "firstPlayDate", term100242);
        setField(term100083, term100083.getClass(), "lastGameId", "trNmqmTVhn");
        setField(term100083, term100083.getClass(), "lastRomVersion", "oRcEdheGqg");
        setField(term100083, term100083.getClass(), "lastDataVersion", "vwQAcJEANy");
        setIntField(term100289, term100289.getClass(), "year", 2029);
        setShortField(term100289, term100289.getClass(), "month", (short) 1);
        setShortField(term100289, term100289.getClass(), "day", (short) 21);
        setField(term100288, term100288.getClass(), "date", term100289);
        setByteField(term100293, term100293.getClass(), "hour", (byte) 11);
        setByteField(term100293, term100293.getClass(), "minute", (byte) 23);
        setByteField(term100293, term100293.getClass(), "second", (byte) 16);
        setIntField(term100293, term100293.getClass(), "nano", 625865316);
        setField(term100288, term100288.getClass(), "time", term100293);
        setField(term100083, term100083.getClass(), "lastPlayDate", term100288);
        setIntField(term100083, term100083.getClass(), "lastPlaceId", 1665727494);
        setField(term100083, term100083.getClass(), "lastPlaceName", "bakvKrXWXm");
        setField(term100083, term100083.getClass(), "lastRegionId", "ixpDCFiQaP");
        setField(term100083, term100083.getClass(), "lastRegionName", "vrRPhHcJDp");
        setField(term100083, term100083.getClass(), "lastAllNetId", "GAfAmizshG");
        setField(term100083, term100083.getClass(), "lastClientId", "mouoQUznmq");
        setField(term100081, term100081.getClass(), "user", term100083);
        setIntField(term100081, term100081.getClass(), "musicId", 487781899);
        setIntField(term100081, term100081.getClass(), "level", 322622063);
        setIntField(term100081, term100081.getClass(), "playCount", -1768300641);
        setIntField(term100081, term100081.getClass(), "scoreMax", 996684751);
        setIntField(term100081, term100081.getClass(), "resRequestCount", 1947256067);
        setIntField(term100081, term100081.getClass(), "resAcceptCount", -2111706143);
        setIntField(term100081, term100081.getClass(), "resSuccessCount", 1147638144);
        setIntField(term100081, term100081.getClass(), "missCount", 1513541114);
        setIntField(term100081, term100081.getClass(), "maxComboCount", 558747577);
        setBooleanField(term100081, term100081.getClass(), "isFullCombo", false);
        setBooleanField(term100081, term100081.getClass(), "isAllJustice", true);
        setBooleanField(term100081, term100081.getClass(), "isSuccess", false);
        setIntField(term100081, term100081.getClass(), "fullChain", 532432884);
        setIntField(term100081, term100081.getClass(), "maxChain", 177236415);
        setIntField(term100081, term100081.getClass(), "scoreRank", -2132027119);
        setBooleanField(term100081, term100081.getClass(), "isLock", false);
        term100375 = new Integer(-2101727195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100375;
        callMethod(klass, "setResAcceptCount", argTypes, term100081, args);
    }

};


