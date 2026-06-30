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

public class UserMusicDetail_setMusicId_112981056922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97851;
     Object term98145;

    public UserMusicDetail_setMusicId_112981056922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97857 = new Long(-6673920710396545553L);
        term97851 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term97853 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term97855 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97881 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97882 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97886 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97903 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97904 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97908 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97964 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97965 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97969 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98012 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98013 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98017 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98058 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term98059 = newInstance(Class.forName("java.time.LocalDate"));
        Object term98063 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97851, term97851.getClass(), "id", 7779093916932577607L);
        setLongField(term97853, term97853.getClass(), "id", 3437816211301899263L);
        setLongField(term97855, term97855.getClass(), "id", 5390474329543871819L);
        setField(term97855, term97855.getClass(), "extId", term97857);
        setField(term97855, term97855.getClass(), "luid", "PoxurfXwit");
        setIntField(term97872, term97872.getClass(), "year", 2024);
        setShortField(term97872, term97872.getClass(), "month", (short) 8);
        setShortField(term97872, term97872.getClass(), "day", (short) 6);
        setField(term97871, term97871.getClass(), "date", term97872);
        setByteField(term97876, term97876.getClass(), "hour", (byte) 11);
        setByteField(term97876, term97876.getClass(), "minute", (byte) 28);
        setByteField(term97876, term97876.getClass(), "second", (byte) 28);
        setIntField(term97876, term97876.getClass(), "nano", 722445627);
        setField(term97871, term97871.getClass(), "time", term97876);
        setField(term97855, term97855.getClass(), "registerTime", term97871);
        setIntField(term97882, term97882.getClass(), "year", 2028);
        setShortField(term97882, term97882.getClass(), "month", (short) 12);
        setShortField(term97882, term97882.getClass(), "day", (short) 8);
        setField(term97881, term97881.getClass(), "date", term97882);
        setByteField(term97886, term97886.getClass(), "hour", (byte) 8);
        setByteField(term97886, term97886.getClass(), "minute", (byte) 34);
        setByteField(term97886, term97886.getClass(), "second", (byte) 7);
        setIntField(term97886, term97886.getClass(), "nano", 362279321);
        setField(term97881, term97881.getClass(), "time", term97886);
        setField(term97855, term97855.getClass(), "accessTime", term97881);
        setField(term97853, term97853.getClass(), "card", term97855);
        setField(term97853, term97853.getClass(), "userName", "fhKxidKBbV");
        setIntField(term97904, term97904.getClass(), "year", 2025);
        setShortField(term97904, term97904.getClass(), "month", (short) 10);
        setShortField(term97904, term97904.getClass(), "day", (short) 9);
        setField(term97903, term97903.getClass(), "date", term97904);
        setByteField(term97908, term97908.getClass(), "hour", (byte) 4);
        setByteField(term97908, term97908.getClass(), "minute", (byte) 55);
        setByteField(term97908, term97908.getClass(), "second", (byte) 37);
        setIntField(term97908, term97908.getClass(), "nano", 431574004);
        setField(term97903, term97903.getClass(), "time", term97908);
        setField(term97853, term97853.getClass(), "lastLoginDate", term97903);
        setBooleanField(term97853, term97853.getClass(), "isWebJoin", false);
        setField(term97853, term97853.getClass(), "webLimitDate", "SIJmlwIkel");
        setIntField(term97853, term97853.getClass(), "level", -845040092);
        setIntField(term97853, term97853.getClass(), "reincarnationNum", -1659873585);
        setField(term97853, term97853.getClass(), "exp", "lqucbHOiHE");
        setLongField(term97853, term97853.getClass(), "point", 8749770092315515620L);
        setLongField(term97853, term97853.getClass(), "totalPoint", 1347723683044734453L);
        setIntField(term97853, term97853.getClass(), "playCount", 1881072097);
        setIntField(term97853, term97853.getClass(), "multiPlayCount", 1677550181);
        setIntField(term97853, term97853.getClass(), "multiWinCount", 1710291513);
        setIntField(term97853, term97853.getClass(), "requestResCount", -464025782);
        setIntField(term97853, term97853.getClass(), "acceptResCount", -1392716182);
        setIntField(term97853, term97853.getClass(), "successResCount", -251208414);
        setIntField(term97853, term97853.getClass(), "playerRating", 2058785706);
        setIntField(term97853, term97853.getClass(), "highestRating", -1996745891);
        setIntField(term97853, term97853.getClass(), "nameplateId", 615988012);
        setIntField(term97853, term97853.getClass(), "frameId", -2129409800);
        setIntField(term97853, term97853.getClass(), "characterId", -522844088);
        setIntField(term97853, term97853.getClass(), "trophyId", 1867429949);
        setIntField(term97853, term97853.getClass(), "playedTutorialBit", 1323279910);
        setIntField(term97853, term97853.getClass(), "firstTutorialCancelNum", 1526554078);
        setIntField(term97853, term97853.getClass(), "masterTutorialCancelNum", 119754400);
        setIntField(term97853, term97853.getClass(), "totalRepertoireCount", -1149597715);
        setIntField(term97853, term97853.getClass(), "totalMapNum", 1709518907);
        setLongField(term97853, term97853.getClass(), "totalHiScore", -6952791032114194905L);
        setLongField(term97853, term97853.getClass(), "totalBasicHighScore", -2341380687381948599L);
        setLongField(term97853, term97853.getClass(), "totalAdvancedHighScore", -7871012741246584386L);
        setLongField(term97853, term97853.getClass(), "totalExpertHighScore", 4814035531351879181L);
        setLongField(term97853, term97853.getClass(), "totalMasterHighScore", 1939660974143295045L);
        setIntField(term97965, term97965.getClass(), "year", 2028);
        setShortField(term97965, term97965.getClass(), "month", (short) 4);
        setShortField(term97965, term97965.getClass(), "day", (short) 3);
        setField(term97964, term97964.getClass(), "date", term97965);
        setByteField(term97969, term97969.getClass(), "hour", (byte) 22);
        setByteField(term97969, term97969.getClass(), "minute", (byte) 17);
        setByteField(term97969, term97969.getClass(), "second", (byte) 37);
        setIntField(term97969, term97969.getClass(), "nano", 480386978);
        setField(term97964, term97964.getClass(), "time", term97969);
        setField(term97853, term97853.getClass(), "eventWatchedDate", term97964);
        setIntField(term97853, term97853.getClass(), "friendCount", -1687052168);
        setBooleanField(term97853, term97853.getClass(), "isMaimai", true);
        setField(term97853, term97853.getClass(), "firstGameId", "AtnEadrVWF");
        setField(term97853, term97853.getClass(), "firstRomVersion", "YghxvBBBOW");
        setField(term97853, term97853.getClass(), "firstDataVersion", "LHuytJdqwq");
        setIntField(term98013, term98013.getClass(), "year", 2010);
        setShortField(term98013, term98013.getClass(), "month", (short) 4);
        setShortField(term98013, term98013.getClass(), "day", (short) 27);
        setField(term98012, term98012.getClass(), "date", term98013);
        setByteField(term98017, term98017.getClass(), "hour", (byte) 7);
        setByteField(term98017, term98017.getClass(), "minute", (byte) 46);
        setByteField(term98017, term98017.getClass(), "second", (byte) 12);
        setIntField(term98017, term98017.getClass(), "nano", 423349196);
        setField(term98012, term98012.getClass(), "time", term98017);
        setField(term97853, term97853.getClass(), "firstPlayDate", term98012);
        setField(term97853, term97853.getClass(), "lastGameId", "SqSvcPPMTC");
        setField(term97853, term97853.getClass(), "lastRomVersion", "SsLBbqIZdp");
        setField(term97853, term97853.getClass(), "lastDataVersion", "SCyDnkiMeE");
        setIntField(term98059, term98059.getClass(), "year", 2013);
        setShortField(term98059, term98059.getClass(), "month", (short) 4);
        setShortField(term98059, term98059.getClass(), "day", (short) 25);
        setField(term98058, term98058.getClass(), "date", term98059);
        setByteField(term98063, term98063.getClass(), "hour", (byte) 8);
        setByteField(term98063, term98063.getClass(), "minute", (byte) 54);
        setByteField(term98063, term98063.getClass(), "second", (byte) 36);
        setIntField(term98063, term98063.getClass(), "nano", 74426342);
        setField(term98058, term98058.getClass(), "time", term98063);
        setField(term97853, term97853.getClass(), "lastPlayDate", term98058);
        setIntField(term97853, term97853.getClass(), "lastPlaceId", -2097023139);
        setField(term97853, term97853.getClass(), "lastPlaceName", "WtfwBvpVGp");
        setField(term97853, term97853.getClass(), "lastRegionId", "nqNHstnjtW");
        setField(term97853, term97853.getClass(), "lastRegionName", "xWqIkjeUFn");
        setField(term97853, term97853.getClass(), "lastAllNetId", "vBcZiZnuXD");
        setField(term97853, term97853.getClass(), "lastClientId", "NRKOkpSTQr");
        setField(term97851, term97851.getClass(), "user", term97853);
        setIntField(term97851, term97851.getClass(), "musicId", -1867947821);
        setIntField(term97851, term97851.getClass(), "level", 561665845);
        setIntField(term97851, term97851.getClass(), "playCount", -283888175);
        setIntField(term97851, term97851.getClass(), "scoreMax", 277022954);
        setIntField(term97851, term97851.getClass(), "resRequestCount", -1539323257);
        setIntField(term97851, term97851.getClass(), "resAcceptCount", -1696039925);
        setIntField(term97851, term97851.getClass(), "resSuccessCount", 741097031);
        setIntField(term97851, term97851.getClass(), "missCount", -1525517989);
        setIntField(term97851, term97851.getClass(), "maxComboCount", -1137095698);
        setBooleanField(term97851, term97851.getClass(), "isFullCombo", false);
        setBooleanField(term97851, term97851.getClass(), "isAllJustice", true);
        setBooleanField(term97851, term97851.getClass(), "isSuccess", false);
        setIntField(term97851, term97851.getClass(), "fullChain", -1037663898);
        setIntField(term97851, term97851.getClass(), "maxChain", 425749446);
        setIntField(term97851, term97851.getClass(), "scoreRank", -1720765811);
        setBooleanField(term97851, term97851.getClass(), "isLock", false);
        term98145 = new Integer(1856736903);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term98145;
        callMethod(klass, "setMusicId", argTypes, term97851, args);
    }

};


